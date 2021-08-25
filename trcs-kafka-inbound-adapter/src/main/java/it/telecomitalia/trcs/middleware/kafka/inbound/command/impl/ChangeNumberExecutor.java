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
import it.telecomitalia.trcs.middleware.kafka.inbound.TrcsKafkaHeader;
import it.telecomitalia.trcs.middleware.kafka.inbound.builder.HeaderTypeBuilder;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.TrcsInboundExecutor;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.TrcsInboundExecutorException;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.impl.dto.ChangeNumberRequestBean;
import it.telecomitalia.trcs.middleware.ws.client.OpscProvisioningClient;

public class ChangeNumberExecutor implements TrcsInboundExecutor {

	private final Logger logger = LoggerFactory.getLogger(ChangeNumberExecutor.class);

	@Override
	public void execute(OpscProvisioningClient client, Map<String, Object> headers, String payload) {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			logger.debug("Request [{}]", payload);
			
			// Converte il JSON in POJO
			ChangeNumberRequestBean request = objectMapper.readValue(payload, ChangeNumberRequestBean.class);
			
			// Effettua il mapping con l'header SOAP
			HeaderType headerType = new HeaderTypeBuilder(headers).build();
			
			// Effettua il mapping con il body SOAP
			ChangeNumberRequest wsRequest = this.createWebServiceRequest(request, headers, headerType);

			
			// Invoca il servizio di cambio numero di GW
			ChangeNumberResponse response = client.changeNumber(headerType, wsRequest);

			logger.info("ChangeNumber result=[{}]", response.getIbRetCode());
			
			if ("1".equals(response.getIbRetCode())) {
				//TODO: Scrivere Log di Success

			} else {
				//TODO: Gestire Errore di invocazione inviando risposta KO su Kafka
			}
			
		} catch (Exception e) {
			logger.error("ChangeNumber calling error.", e);
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			throw new TrcsInboundExecutorException(e);
		}

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
