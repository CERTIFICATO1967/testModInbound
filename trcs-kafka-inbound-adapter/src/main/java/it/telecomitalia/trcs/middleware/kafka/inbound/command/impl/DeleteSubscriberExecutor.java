package it.telecomitalia.trcs.middleware.kafka.inbound.command.impl;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

import it.telecomitalia.soa.soap.soapheader.HeaderType;
import it.telecomitalia.soa.trcs.gateway.ChangeNumberRequest;
import it.telecomitalia.soa.trcs.gateway.DeleteSubscriberXIbData;
import it.telecomitalia.soa.trcs.gateway.DeleteSubscriberXRequest;
import it.telecomitalia.soa.trcs.gateway.DeleteSubscriberXResponse;
import it.telecomitalia.soa.trcs.gateway.infobus.commons.InfobusMessage;
import it.telecomitalia.trcs.gateway.services.opsc.DeleteSubscriberRequest;
import it.telecomitalia.trcs.gateway.services.opsc.DeleteSubscriberRequest.Payload.OperationType;
import it.telecomitalia.trcs.middleware.kafka.inbound.ResponseTargets;
import it.telecomitalia.trcs.middleware.kafka.inbound.TrcsKafkaHeader;
import it.telecomitalia.trcs.middleware.kafka.inbound.builder.HeaderTypeBuilder;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.TrcsInboundExecutorException;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.impl.dto.DeleteSubscriberRequestBean;
import it.telecomitalia.trcs.middleware.ws.client.OpscProvisioningClient;


public class DeleteSubscriberExecutor extends AbstractExecutor{

	private final Logger logger = LoggerFactory.getLogger(DeleteSubscriberExecutor.class);


	public DeleteSubscriberExecutor(OpscProvisioningClient client, ResponseTargets responseTargets) {
		super(client, responseTargets);
	}

	
	@Override
	public void execute(Map<String, Object> headers, String payload) {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			logger.debug("Request [{}]", payload);
			
			// Converte il JSON in POJO
			DeleteSubscriberRequestBean request = objectMapper.readValue(payload, DeleteSubscriberRequestBean.class);
			
			// Effettua il mapping con l'header SOAP
		    HeaderType headerType = new HeaderTypeBuilder(headers).build();
		    switch (Enum.valueOf(DeleteType.class,request.getDeleteType())) {
		    case Normal:
		    case GoodByeService:
		    case Mnp:
		    case MnpMvno:
		    	if(request.isDiscountRecover()) {
		    		logger.debug("Call DeleteSubscriber");
		    		InfobusMessage resp = callWebServiceDeleteSubscriber(request, headers, headerType);
			    	logger.info("DeleteSubsciber result=[{}]", resp.getIbRetCode());

			    	if ("1".equals(resp.getIbRetCode())) {
			    		//TODO: Scrivere Log di Success
			    		;

			    	} else {
			    		//TODO: Gestire Errore di invocazione inviando risposta KO su Kafka
			    		;
			    	} 
		    	}
		    	else {
		    		logger.debug("Call DeleteSubscriberX");
		    		DeleteSubscriberXResponse resp = callWebServiceDeleteSubscriberX(request, headers, headerType);
		    		logger.info("DeleteSubsciberX result=[{}]", resp.getIbRetCode());
					
					if ("1".equals(resp.getIbRetCode())) {
						//TODO: Scrivere Log di Success
						;

					} else {
						//TODO: Gestire Errore di invocazione inviando risposta KO su Kafka
						;
					}
		    	}
		       break;
		    case EbuRollbackDelete:
		    case EbuRollbackPreinstalled:
		    	logger.debug("Call DeleteSubscriberX");
		    	DeleteSubscriberXResponse resp = callWebServiceDeleteSubscriberX(request, headers, headerType);
		    	logger.info("DeleteSubsciberX result=[{}]", resp.getIbRetCode());

		    	if ("1".equals(resp.getIbRetCode())) {
		    		//TODO: Scrivere Log di Success
		    		;

		    	} else {
		    		//TODO: Gestire Errore di invocazione inviando risposta KO su Kafka
		    		;
		    	} 
		    	break;
		    case MnpOnDeletedSubscriber:
		    	logger.debug("Call DeleteSubscriber");
		        break;
		    case MnpDeactivationOnDeletedSubscriber:
		    	logger.debug("Call RestoreSubscriber");
		         break;
	
		    default:
			   	return ;
		    }
		
		} catch (Exception e) {
			logger.error("DeleteSubscriber calling error", e);
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			throw new TrcsInboundExecutorException(e);
		}

	}

	private DeleteSubscriberXResponse callWebServiceDeleteSubscriberX(DeleteSubscriberRequestBean request, Map<String, Object> headers,
			HeaderType headerType) {
		// Effettua il mapping con il body SOAP
		DeleteSubscriberXRequest wsRequest = this.createWebServiceRequestX(request, headers, headerType);
		// Invoca il servizio di cambio numero di GW
		DeleteSubscriberXResponse response = this.getOpscClient().deleteSubscriberX(headerType, wsRequest);
		return response;
	}

	
	
	private DeleteSubscriberXRequest createWebServiceRequestX(DeleteSubscriberRequestBean request, Map<String, Object> headers,
			HeaderType headerType) {

		DeleteSubscriberXRequest wsRequest = new DeleteSubscriberXRequest();
		
		wsRequest.setIbRetCode("1");
		wsRequest.setIbAppDep1("0");
		wsRequest.setIbAppDep2("0");
		wsRequest.setIbIdSrvc("SERVINT");
		wsRequest.setIbData(new DeleteSubscriberXRequest.IbData());
		wsRequest.getIbData().setIbLenData(0);
		
		DeleteSubscriberXIbData payload = new DeleteSubscriberXIbData();
		wsRequest.getIbData().setRequest(payload);
		
		payload.setRequestType("TwoStep");
		
		payload.setTransaction(new DeleteSubscriberXIbData.Transaction());
		
		payload.getTransaction().setTID(headerType.getTransactionID());
		payload.getTransaction().setSubsystem(String.valueOf(headers.get(TrcsKafkaHeader.channel.name())));
		payload.getTransaction().setService(wsRequest.getIbIdSrvc());
		payload.getTransaction().setIDSystem(headerType.getSourceSystem());
		payload.getTransaction().setRetCode("1");
		
	    payload.setClientKeys(new DeleteSubscriberXIbData.ClientKeys());
		payload.getClientKeys().setMSISDN(request.getPhoneNumber());
		
	    payload.setOperation(new DeleteSubscriberXIbData.Operation());
		payload.getOperation().setOperationType("ServintSubscriber");
		payload.getOperation().setInfo(request.getInfo());
		DeleteSubscriberXIbData.Operation.ServintSubscriber servintSubscriber = new DeleteSubscriberXIbData.Operation.ServintSubscriber();
		/*- Se deleteType è uguale a "Mnp", inserire "MnpServInt".
		- In tutti gli altri casi, inserire il valore presente in input.*/
		servintSubscriber.setServIntType(request.getDeleteType());
		if(request.getDeleteType().equals("Mnp")) {
			servintSubscriber.setServIntType("MnpServInt");
			DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpServInt  mnpServInt = new DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpServInt ();
			mnpServInt.setMnpMSISDN(request.getPhoneNumberMnp());
			servintSubscriber.setMnpServInt(mnpServInt);
		}
		
		DeleteSubscriberXIbData.Operation.ServintSubscriber.Client client = new DeleteSubscriberXIbData.Operation.ServintSubscriber.Client();
		client.setReason(request.getReason());
		servintSubscriber.setClient(client);
		
		if(request.getDeleteType().equals("MnpMvno")) {

			DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpMvno  mnpMvno = new DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpMvno();
			mnpMvno.setMnpMSISDN(request.getPhoneNumberMnp());
			servintSubscriber.setMnpMvno(mnpMvno);
		}
		payload.getOperation().setServintSubscriber(servintSubscriber);
		
		
		return wsRequest;
	}

	
	private InfobusMessage callWebServiceDeleteSubscriber(DeleteSubscriberRequestBean request, Map<String, Object> headers,
			HeaderType headerType) {
		// Effettua il mapping con il body SOAP
		DeleteSubscriberRequest wsRequest = this.createWebServiceRequest(request, headers, headerType);
		// Invoca il servizio di cambio numero di GW
		InfobusMessage response = this.getOpscClient().deleteSubscriber(headerType, wsRequest);
		return response;
	}
	
	private DeleteSubscriberRequest createWebServiceRequest(DeleteSubscriberRequestBean request, Map<String, Object> headers,
			HeaderType headerType) {

		InfobusMessage message =  new InfobusMessage();
		message.setIbAppDep1("0");
		message.setIbAppDep2("0");
		message.setIbRetCode("1");
		message.setIbIdSrvc("SERVINTG");
		message.setIbData(new DeleteSubscriberRequest.IbData());
		message.getIbData().setIbLenData(0);
		
		DeleteSubscriberRequest wsRequest = DeleteSubscriberRequest.createInstance(message);
		
		wsRequest.setIbData(message.getIbData());
		
		switch (Enum.valueOf(DeleteType.class,request.getDeleteType())) {
		case Normal:
			wsRequest.getPayload().setOperationType(OperationType.volontary);
			break;
		case GoodByeService:
			wsRequest.getPayload().setOperationType(OperationType.goodbye);
			break;
		case Mnp:
			wsRequest.getPayload().setOperationType(OperationType.mnp);
			break;

		case MnpMvno:
			wsRequest.getPayload().setOperationType(OperationType.mnp2mvno);
			break;
		case MnpOnDeletedSubscriber:

			wsRequest.getPayload().setOperationType(OperationType.deadMnp);
			break;
		}
		
		wsRequest.getPayload().setMsisdn(request.getPhoneNumber());
		wsRequest.getPayload().setAstState(request.getReason());
		wsRequest.getPayload().setrSystem(3);
		
		wsRequest.getPayload().setSrnb(request.isDiscountRecover() ? "" : "99");
		wsRequest.getPayload().setMnpMsisdn(request.getPhoneNumber());
		wsRequest.getPayload().setTypeOfCard(request.getTypeOfCard());
		// da vedere
		wsRequest.getPayload().setSubSystem("channel");
		return wsRequest;
	}
	
}
