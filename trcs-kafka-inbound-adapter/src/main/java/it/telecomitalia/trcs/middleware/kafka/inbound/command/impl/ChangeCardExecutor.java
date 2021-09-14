package it.telecomitalia.trcs.middleware.kafka.inbound.command.impl;

import java.math.BigDecimal;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

import it.telecomitalia.soa.soap.soapheader.HeaderType;
import it.telecomitalia.soa.trcs.gateway.provisioning.ChangeCardRequest;
import it.telecomitalia.soa.trcs.gateway.provisioning.commons.ResponseMessage;
import it.telecomitalia.trcs.middleware.kafka.inbound.ResponseTargets;
import it.telecomitalia.trcs.middleware.kafka.inbound.builder.HeaderTypeBuilder;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.TrcsInboundExecutorException;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.impl.dto.ChangeCardRequestBean;
import it.telecomitalia.trcs.middleware.ws.client.GinoProvisioningClient;

public class ChangeCardExecutor extends AbstractExecutor {

	private final Logger logger = LoggerFactory.getLogger(ChangeCardExecutor.class);


	public ChangeCardExecutor(GinoProvisioningClient client, ResponseTargets responseTargets) {
		super(client, responseTargets);
	}

	
	@Override
	public void execute(Map<String, Object> headers, String payload) {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			logger.debug("Request [{}]", payload);
			
			// Converte il JSON in POJO
			ChangeCardRequestBean request = objectMapper.readValue(payload, ChangeCardRequestBean.class);
			
			// Effettua il mapping con l'header SOAP
			HeaderType headerType = new HeaderTypeBuilder(headers).build();
			
			// Effettua il mapping con il body SOAP
			ChangeCardRequest wsRequest = this.createWebServiceRequest(request, headers, headerType);

			
			// Invoca il servizio di cambio numero di GW
			ResponseMessage response = this.getGinoClient().changeCard(headerType, wsRequest);

			logger.info("ChangeCard result=[{}]", response.getResult());
			
			if ("1".equals(response.getResult())) {
				//TODO: Scrivere Log di Success

			} else {
				//TODO: Gestire Errore di invocazione inviando risposta KO su Kafka
			}
			
		} catch (Exception e) {
			logger.error("ChangeCard calling error.", e);
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			throw new TrcsInboundExecutorException(e);
		}

	}

	private ChangeCardRequest createWebServiceRequest(ChangeCardRequestBean request, Map<String, Object> headers,
			HeaderType headerType) {

		boolean subscriberLocked = false;
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
