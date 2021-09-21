package it.telecomitalia.trcs.middleware.kafka.inbound.command.impl;

import java.math.BigDecimal;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

import it.telecomitalia.soa.soap.soapheader.HeaderType;
import it.telecomitalia.soa.trcs.gateway.provisioning.ChangeCardRequest;
import it.telecomitalia.soa.trcs.gateway.provisioning.commons.ResponseMessage;
import it.telecomitalia.trcs.middleware.kafka.inbound.builder.HeaderTypeBuilder;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.ExecutorSynchronousFailed;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.TrcsInboundExecutorException;
import it.telecomitalia.trcs.middleware.kafka.inbound.config.ResponseTargets;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.ChangeCardRequestBean;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.ChangeCardResponseBean;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.TrcsKafkaEventType;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.TrcsKafkaHeader;
import it.telecomitalia.trcs.middleware.kafka.inbound.logging.HydraLogBean;
import it.telecomitalia.trcs.middleware.kafka.inbound.logging.HydraLogThreadLocal;
import it.telecomitalia.trcs.middleware.ws.client.GinoProvisioningClient;

public class ChangeCardExecutor extends AbstractExecutor {

	private final Logger logger = LoggerFactory.getLogger(ChangeCardExecutor.class);


	public ChangeCardExecutor(GinoProvisioningClient client, ResponseTargets responseTargets) {
		super(client, responseTargets);
	}

	
	@Override
	public void execute(Map<String, Object> headers, String payload) throws ExecutorSynchronousFailed {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			logger.debug("Request [{}]", payload);
			
			// Converte il JSON in POJO
			ChangeCardRequestBean request = objectMapper.readValue(payload, ChangeCardRequestBean.class);
			
			HydraLogThreadLocal.getLogBean().getEvent().setPayload(request);
			
			// Effettua il mapping con l'header SOAP
			HeaderType headerType = new HeaderTypeBuilder(headers).build();
			
			// Effettua il mapping con il body SOAP
			ChangeCardRequest wsRequest = this.createWebServiceRequest(request, headers, headerType);

			
			// Invoca il servizio di cambio numero di GW
			ResponseMessage response = this.getGinoClient().changeCard(headerType, wsRequest);

			logger.info("ChangeCard result=[{}]", response.getResult());
			
			if ("success".equals(response.getResult())) {
				//TODO: Scrivere Log di Success
				HydraLogThreadLocal.getLogBean().setResult(HydraLogBean.Result.success);

			} else {
				//TODO: Gestire Errore di invocazione inviando risposta KO su Kafka
				//TODO: Inserire Logging
				
				ChangeCardResponseBean responsePayload = this.createResponsePayload(headers, request, response);
				
				throw new ExecutorSynchronousFailed(
						this.getReponseTargets().getResponseTarget(TrcsKafkaEventType.changeCardResponse),
						TrcsKafkaHeader.createResponseKafkaHeader(headers, TrcsKafkaEventType.changeCardResponse),
						responsePayload,
						objectMapper.writeValueAsString(responsePayload),
						request.getPhoneNumber()
					);
			}
			
			
		} catch (ExecutorSynchronousFailed e) {
			throw e;
		} catch (Exception e) {
			logger.error("ChangeCard calling error.", e);
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			throw new TrcsInboundExecutorException(e);
		}

	}
	
	private ChangeCardResponseBean createResponsePayload(Map<String, Object> headers, ChangeCardRequestBean request,  ResponseMessage response) {
		
		
        //String imsiOld,String imsiNew,String iccidOld ,String iccidNew
        
		ChangeCardResponseBean result = new ChangeCardResponseBean(headers.get(TrcsKafkaHeader.sourceSystem.name()).toString(),
				                                                       request.getPhoneNumber(),
				                                                       KafkaErrorCodes.decodeFromOpsc(response.getError().getCode()),
				                                                       KafkaErrorCodes.messageFromOpsc(response.getError().getCode()),
				                                                       request.getImsiOld(),request.getImsiNew(),request.getIccidOld(),request.getIccidNew());

		result.setSubsystemErrorCode(response.getError().getCode());
		
		return result;
	}


	private ChangeCardRequest createWebServiceRequest(ChangeCardRequestBean request, Map<String, Object> headers,
			HeaderType headerType) {

	
		ChangeCardRequest wsRequest = new ChangeCardRequest();
		
		wsRequest.setSubsystem("channel"); // da vedere
		
		// reason
		wsRequest.setReason("A");
		
		// operationCost
		wsRequest.setOperationCost(new BigDecimal("0.00"));

		// phoneNumber
		wsRequest.setPhoneNumber(request.getPhoneNumber());
		
		// info
		wsRequest.setInfo(request.getInfo());
		
		// IMSI
		ChangeCardRequest.Imsi imsi = new ChangeCardRequest.Imsi();
		// imsiOld
		imsi.setOldImsi(request.getImsiOld());
		// imsiNew
		imsi.setNewImsi(request.getImsiNew());
		wsRequest.setImsi(imsi);
		
		// ICCID
		ChangeCardRequest.Iccid iccid = new ChangeCardRequest.Iccid();
		// iccidOld
		iccid.setOldIccid(request.getIccidOld());
		// iccidNew
		iccid.setNewIccid(request.getIccidNew());
		wsRequest.setIccid(iccid);
		
		// typeOfCard
		wsRequest.setToc(request.getTypeOfCard());

		// phase
		wsRequest.setCardPhase(request.getPhase());

		// features
		wsRequest.setCardFeature(request.getFeatures());
		
		// chCardType
		wsRequest.setChCardType( request.isUnblockSubscriber() ? "ChBlockState" : "ChNoBlockState" );
		
		return wsRequest;
	}

}
