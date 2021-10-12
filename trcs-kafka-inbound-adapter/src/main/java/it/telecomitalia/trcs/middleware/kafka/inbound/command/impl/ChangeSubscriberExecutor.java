package it.telecomitalia.trcs.middleware.kafka.inbound.command.impl;

import java.math.BigDecimal;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

import it.telecomitalia.soa.soap.soapheader.HeaderType;
import it.telecomitalia.soa.trcs.gateway.provisioning.AccountMigrationRequest;
import it.telecomitalia.soa.trcs.gateway.provisioning.commons.ResponseMessage;
import it.telecomitalia.trcs.middleware.kafka.inbound.builder.HeaderTypeBuilder;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.ExecutorSynchronousFailed;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.TrcsInboundExecutorException;
import it.telecomitalia.trcs.middleware.kafka.inbound.config.ResponseTargets;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.ChangeSubscriberRequestBean;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.ChangeSubscriberResponseBean;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.TrcsKafkaEventType;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.TrcsKafkaHeader;
import it.telecomitalia.trcs.middleware.kafka.inbound.logging.HydraLogBean;
import it.telecomitalia.trcs.middleware.kafka.inbound.logging.HydraLogThreadLocal;
import it.telecomitalia.trcs.middleware.ws.client.GinoProvisioningClient;

public class ChangeSubscriberExecutor extends AbstractExecutor {

	private final Logger logger = LoggerFactory.getLogger(ChangeSubscriberExecutor.class);


	public ChangeSubscriberExecutor(GinoProvisioningClient client, ResponseTargets responseTargets) {
		super(client, responseTargets);
	}

	
	@Override
	public void execute(Map<String, Object> headers, String payload) throws ExecutorSynchronousFailed {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			logger.debug("Request [{}]", payload);
			
			// Converte il JSON in POJO
			ChangeSubscriberRequestBean request = objectMapper.readValue(payload, ChangeSubscriberRequestBean.class);
			
			HydraLogThreadLocal.getLogBean().getEvent().setPayload(request);
			
			// Effettua il mapping con l'header SOAP
			HeaderType headerType = new HeaderTypeBuilder(headers).build();
			
			// Effettua il mapping con il body SOAP
			AccountMigrationRequest wsRequest = this.createWebServiceRequest(request, headers, headerType);

			
			// Invoca il servizio di change subscriber di GW
			ResponseMessage response = this.getGinoClient().changeSubscriber(headerType, wsRequest);

			logger.info("ChangeSubscriber result=[{}]", response.getResult());
			
			if ("success".equals(response.getResult())) {
				//TODO: Scrivere Log di Success
				HydraLogThreadLocal.getLogBean().setResult(HydraLogBean.Result.success);

			} else {
				//TODO: Gestire Errore di invocazione inviando risposta KO su Kafka
				//TODO: Inserire Logging
				
				ChangeSubscriberResponseBean responsePayload = this.createResponsePayload(headers, request, response);
				
				throw new ExecutorSynchronousFailed(
						this.getReponseTargets().getResponseTarget(TrcsKafkaEventType.changeSubscriberResponse),
						TrcsKafkaHeader.createResponseKafkaHeader(headers, TrcsKafkaEventType.changeSubscriberResponse),
						responsePayload,
						objectMapper.writeValueAsString(responsePayload),
						request.getPhoneNumber()
					);
			}
			
			
		} catch (ExecutorSynchronousFailed e) {
			throw e;
		} catch (Exception e) {
			logger.error("ChangeSubscriber calling error.", e);
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			throw new TrcsInboundExecutorException(e);
		}

	}
	
	private ChangeSubscriberResponseBean createResponsePayload(Map<String, Object> headers, ChangeSubscriberRequestBean request,  ResponseMessage response) {

        
		ChangeSubscriberResponseBean result = new ChangeSubscriberResponseBean(headers.get(TrcsKafkaHeader.sourceSystem.name()).toString(),
				                                                       request.getPhoneNumber(),
				                                                       KafkaErrorCodes.decodeFromOpsc(response.getError().getCode()),
				                                                       KafkaErrorCodes.messageFromOpsc(response.getError().getCode()),
				                                                       request.getMigrationType(), new BigDecimal("0.00"), new BigDecimal("0.00"), new BigDecimal("0.00"), new BigDecimal("0.00"));

		
		result.setSubsystemErrorCode(response.getError().getCode());
		
		return result;
	}


	private AccountMigrationRequest createWebServiceRequest(ChangeSubscriberRequestBean request, Map<String, Object> headers,
			HeaderType headerType) {

	
		AccountMigrationRequest wsRequest = new AccountMigrationRequest();
		
		// phoneNumber
		wsRequest.setPhoneNumber(request.getPhoneNumber());
		
		// subsystem
		wsRequest.setSubsystem("channel"); // da vedere
		
		// info
		wsRequest.setInfo(request.getInfo());
		
		// migrationType
		wsRequest.setMigrationType(request.getMigrationType());
		
		// toc
		wsRequest.setToc(request.getTypeOfCard());
		
		// profile
		wsRequest.setProfile(request.getBaseOffer());
		
		// subscription
		wsRequest.setSubscription("WRAPPER");
		
		// rif
		wsRequest.setRif(request.isRifService() ? "On" : "Off");

		return wsRequest;
	}

}
