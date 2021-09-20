package it.telecomitalia.trcs.middleware.kafka.inbound.command.impl;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

import it.telecomitalia.soa.soap.soapheader.HeaderType;
import it.telecomitalia.soa.trcs.gateway.ChangeNumberIbData;
import it.telecomitalia.soa.trcs.gateway.ChangeNumberIbData.Transaction;
import it.telecomitalia.soa.trcs.gateway.ChangeNumberRequest;
import it.telecomitalia.soa.trcs.gateway.ChangeNumberResponse;
import it.telecomitalia.soa.trcs.gateway.OfferType;
import it.telecomitalia.soa.trcs.gateway.SubscriptionType;
import it.telecomitalia.trcs.middleware.kafka.inbound.builder.HeaderTypeBuilder;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.ExecutorSynchronousFailed;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.TrcsInboundExecutorException;
import it.telecomitalia.trcs.middleware.kafka.inbound.config.ResponseTargets;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.ChangeNumberRequestBean;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.ChangeNumberResponseBean;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.TrcsKafkaEventType;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.TrcsKafkaHeader;
import it.telecomitalia.trcs.middleware.kafka.inbound.logging.HydraLogBean;
import it.telecomitalia.trcs.middleware.kafka.inbound.logging.HydraLogThreadLocal;
import it.telecomitalia.trcs.middleware.ws.client.OpscProvisioningClient;

public class ChangeNumberExecutor extends AbstractExecutor {

	private final Logger logger = LoggerFactory.getLogger(ChangeNumberExecutor.class);


	public ChangeNumberExecutor(OpscProvisioningClient client, ResponseTargets responseTargets) {
		super(client, responseTargets);
	}

	
	@Override
	public void execute(Map<String, Object> headers, String payload) throws ExecutorSynchronousFailed {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			logger.debug("Request [{}]", payload);
			
			// Converte il JSON in POJO
			ChangeNumberRequestBean request = objectMapper.readValue(payload, ChangeNumberRequestBean.class);
			
			HydraLogThreadLocal.getLogBean().getEvent().setPayload(request);
			
			// Effettua il mapping con l'header SOAP
			HeaderType headerType = new HeaderTypeBuilder(headers).build();
			
			// Effettua il mapping con il body SOAP
			ChangeNumberRequest wsRequest = this.createWebServiceRequest(request, headers, headerType);

			
			// Invoca il servizio di cambio numero di GW
			ChangeNumberResponse response = this.getOpscClient().changeNumber(headerType, wsRequest);

			logger.info("ChangeNumber result=[{}]", response.getIbRetCode());
			
			if ("1".equals(response.getIbRetCode())) {
				HydraLogThreadLocal.getLogBean().setResult(HydraLogBean.Result.success);
			} else {
				Object responsePayload = this.createResponsePayload(headers, request, response);
				
				throw new ExecutorSynchronousFailed(
							this.getReponseTargets().getResponseTarget(TrcsKafkaEventType.changeNumberResponse),
							TrcsKafkaHeader.createResponseKafkaHeader(headers, TrcsKafkaEventType.changeNumberResponse),
							responsePayload,
							objectMapper.writeValueAsString(responsePayload),
							request.getPhoneNumber()
						);
			}
			
		} catch (ExecutorSynchronousFailed e) {
			
			throw e;
			
		} catch (Exception e) {
			
			logger.debug("ChangeNumber calling error.", e);
			
			throw new TrcsInboundExecutorException(e);
		}

	}

	private ChangeNumberResponseBean createResponsePayload(Map<String, Object> headers, ChangeNumberRequestBean request,  ChangeNumberResponse response) {
		
		ChangeNumberResponseBean result = new ChangeNumberResponseBean(headers.get(TrcsKafkaHeader.sourceSystem.name()).toString(),
				                                                       request.getPhoneNumber(),
				                                                       KafkaErrorCodes.decodeFromOpsc(response.getIbRetCode()),
				                                                       KafkaErrorCodes.messageFromOpsc(response.getIbRetCode()),
				                                                       request.getPhoneNumberOLO());

		result.setSubsystemErrorCode(response.getIbRetCode());
		
		return result;
	}




	private ChangeNumberRequest createWebServiceRequest(ChangeNumberRequestBean request, Map<String, Object> headers,
			HeaderType headerType) {

		ChangeNumberRequest wsRequest = new ChangeNumberRequest();
		
		wsRequest.setIbRetCode("1");
		wsRequest.setIbAppDep1("0");
		wsRequest.setIbAppDep2("0");
		wsRequest.setIbIdSrvc("MNPRdy2Tlk");
		wsRequest.setIbData(new ChangeNumberRequest.IbData());
		wsRequest.getIbData().setIbLenData(0);
		
		ChangeNumberIbData payload = new ChangeNumberIbData();
		wsRequest.getIbData().setRequest(payload);
		
		payload.setRequestType("TwoStep");
		
		payload.setTransaction(new Transaction());
		payload.getTransaction().setTID(headerType.getTransactionID());
		payload.getTransaction().setSubsystem(String.valueOf(headers.get(TrcsKafkaHeader.channel.name())));
		payload.getTransaction().setService(wsRequest.getIbIdSrvc());
		payload.getTransaction().setIDSystem(headerType.getSourceSystem());
		
		
		payload.setClientKeys(new ChangeNumberIbData.ClientKeys());
		payload.getClientKeys().setMSISDN(request.getPhoneNumber());
		
		payload.setOperation(new ChangeNumberIbData.Operation());
		payload.getOperation().setOperationType("MNPRdy2Tlk");
		payload.getOperation().setInfo(request.getInfo());
		
		ChangeNumberIbData.Operation.MNPRdy2Tlk params = new ChangeNumberIbData.Operation.MNPRdy2Tlk();
		payload.getOperation().setMNPRdy2Tlk(params);
		
		params.setClient(new ChangeNumberIbData.Operation.MNPRdy2Tlk.Client());
		params.getClient().setMSISDNOLO(request.getPhoneNumberOLO());
		params.getClient().setTypeOfCard(request.getTypeOfCard());
		params.getClient().setTypeOfCustom(request.getTypeOfCustomer());
		
		params.setSubscription(new SubscriptionType());
		params.getSubscription().setName("WRAPPER");
		OfferType offerType = new OfferType();
		offerType.setName(request.getBaseOffer());
		params.getSubscription().getOffer().add(offerType);
		
		return wsRequest;
	}

}
