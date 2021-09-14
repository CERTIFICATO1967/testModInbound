package it.telecomitalia.trcs.middleware.kafka.inbound.command.impl;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

import it.telecomitalia.soa.soap.soapheader.HeaderType;
import it.telecomitalia.soa.trcs.gateway.SetSubscriberStatusXIbData;
import it.telecomitalia.soa.trcs.gateway.SetSubscriberStatusXIbData.Transaction;
import it.telecomitalia.soa.trcs.gateway.SetSubscriberStatusXRequest;
import it.telecomitalia.soa.trcs.gateway.SetSubscriberStatusXResponse;
import it.telecomitalia.trcs.middleware.kafka.inbound.ResponseTargets;
import it.telecomitalia.trcs.middleware.kafka.inbound.TrcsKafkaHeader;
import it.telecomitalia.trcs.middleware.kafka.inbound.builder.HeaderTypeBuilder;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.TrcsInboundExecutorException;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.impl.dto.SetSubscriberStatusXBean;
import it.telecomitalia.trcs.middleware.ws.client.OpscProvisioningClient;

public class SetSubscriberStatusXExecutor extends AbstractExecutor {

	private final Logger logger = LoggerFactory.getLogger(SetSubscriberStatusXExecutor.class);


	public SetSubscriberStatusXExecutor(OpscProvisioningClient client, ResponseTargets responseTargets) {
		super(client, responseTargets);
	}

	
	@Override
	public void execute(Map<String, Object> headers, String payload) {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			logger.debug("Request [{}]", payload);
			
			// Converte il JSON in POJO
			SetSubscriberStatusXBean request = objectMapper.readValue(payload, SetSubscriberStatusXBean.class);
			
			// Effettua il mapping con l'header SOAP
			HeaderType headerType = new HeaderTypeBuilder(headers).build();
			
			// Effettua il mapping con il body SOAP
			SetSubscriberStatusXRequest wsRequest = this.createWebServiceRequest(request, headers, headerType);

			
			// Invoca il servizio di cambio numero di GW
			SetSubscriberStatusXResponse response = this.getOpscClient().setSubscriberStatusX(headerType, wsRequest);

			logger.info("SetSubscriberStatusX result=[{}]", response.getIbRetCode());
			
			if ("1".equals(response.getIbRetCode())) {
				//TODO: Scrivere Log di Success

			} else {
				//TODO: Gestire Errore di invocazione inviando risposta KO su Kafka
			}
			
		} catch (Exception e) {
			logger.error("SetSubscriberStatusX calling error.", e);
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			throw new TrcsInboundExecutorException(e);
		}

	}

	private SetSubscriberStatusXRequest createWebServiceRequest(SetSubscriberStatusXBean request, Map<String, Object> headers,
			HeaderType headerType) {

		SetSubscriberStatusXRequest wsRequest = new SetSubscriberStatusXRequest();
		
		wsRequest.setIbRetCode("1");
		wsRequest.setIbAppDep1("0");
		wsRequest.setIbAppDep2("0");
		wsRequest.setIbIdSrvc("CARDMGMT");
		wsRequest.setIbData(new SetSubscriberStatusXRequest.IbData());
		wsRequest.getIbData().setIbLenData(0);
		
		SetSubscriberStatusXIbData payload = new SetSubscriberStatusXIbData();
		wsRequest.getIbData().setRequest(payload);
		
		payload.setRequestType("TwoStep");
		
		payload.setTransaction(new Transaction());
		payload.getTransaction().setTID(headerType.getTransactionID());
		payload.getTransaction().setSubsystem(String.valueOf(headers.get(TrcsKafkaHeader.channel.name())));
		payload.getTransaction().setService(wsRequest.getIbIdSrvc());
		payload.getTransaction().setIDSystem(headerType.getSourceSystem());
		
		
		payload.setClientKeys(new SetSubscriberStatusXIbData.ClientKeys());
		payload.getClientKeys().setMSISDN(request.getPhoneNumber());
		
		payload.setOperation(new SetSubscriberStatusXIbData.Operation());
		payload.getOperation().setOperationType("ASTMgr");
		payload.getOperation().setInfo(request.getInfo());
		
		
		payload.getOperation().setOperationType(SetSubscriberStatusXExecutor.calcolateValue(request.getReason(),request.getOldReason()));
		SetSubscriberStatusXIbData.Operation.ASTMgr.Client client = new SetSubscriberStatusXIbData.Operation.ASTMgr.Client();
		client.setReason(request.getReason());
		payload.getOperation().getASTMgr().setClient(client);
		
		return wsRequest;
	}
	
	private static String calcolateValue(String reason,String oldReason) {
		
		/*- Se reason è uguale a "A" e oldReason è uguale a "Q", inserire "UnBlockingPayDelay".
		- Se reason è uguale a "A" e oldReason è diversa da "Q" o non presente, inserire "UnBlocking".
		- Se reason è diversa da "A" e oldReason è uguale a "Q", inserire "BlockingPayDelay".
		- Se reason è diversa da "A" e oldReason è diversa da "Q" o non è presente, inserire "Blocking".*/
		if(reason.equals("A") && "Q".equals(oldReason))
			return "UnBlockingPayDelay";
		else if(reason.equals("A") && !"Q".equals(oldReason))
			return "UnBlocking";
		else if(!reason.equals("A") && "Q".equals(oldReason))
			return "BlockingPayDelay";
		else if(!reason.equals("A") && !"Q".equals(oldReason))
			return "Blocking";
		else
			return "";
		
	}

}
