package it.telecomitalia.trcs.middleware.kafka.inbound.command.impl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

import it.telecomitalia.soa.soap.soapheader.HeaderType;
import it.telecomitalia.soa.trcs.gateway.DeleteSubscriberXIbData;
import it.telecomitalia.soa.trcs.gateway.DeleteSubscriberXRequest;
import it.telecomitalia.soa.trcs.gateway.DeleteSubscriberXResponse;
import it.telecomitalia.soa.trcs.gateway.infobus.commons.InfobusMessage;
import it.telecomitalia.trcs.gateway.services.opsc.DeleteSubscriberRequest;
import it.telecomitalia.trcs.gateway.services.opsc.DeleteSubscriberRequest.Payload.OperationType;
import it.telecomitalia.trcs.gateway.services.opsc.RestoreSubscriberRequest;
import it.telecomitalia.trcs.middleware.kafka.inbound.builder.HeaderTypeBuilder;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.ExecutorSynchronousFailed;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.TrcsInboundExecutorException;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.impl.type.DeleteType;
import it.telecomitalia.trcs.middleware.kafka.inbound.config.ResponseTargets;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.DeleteSubscriberRequestBean;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.DeleteSubscriberResponseBean;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.TrcsKafkaEventType;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.TrcsKafkaHeader;
import it.telecomitalia.trcs.middleware.kafka.inbound.logging.HydraLogBean;
import it.telecomitalia.trcs.middleware.kafka.inbound.logging.HydraLogThreadLocal;
import it.telecomitalia.trcs.middleware.ws.client.OpscProvisioningClient;


public class DeleteSubscriberExecutor extends AbstractExecutor{

	private final Logger logger = LoggerFactory.getLogger(DeleteSubscriberExecutor.class);


	public DeleteSubscriberExecutor(OpscProvisioningClient client, ResponseTargets responseTargets) {
		super(client, responseTargets);
	}


	@Override
	public void execute(Map<String, Object> headers, String payload) throws ExecutorSynchronousFailed{

		ObjectMapper objectMapper = new ObjectMapper();

		try {
			logger.debug("Request [{}]", payload);

			// Converte il JSON in POJO
			DeleteSubscriberRequestBean request = objectMapper.readValue(payload, DeleteSubscriberRequestBean.class);
			
			HydraLogThreadLocal.getLogBean().getEvent().setPayload(request);
			// Effettua il mapping con l'header SOAP
			HeaderType headerType = new HeaderTypeBuilder(headers).build();
			switch (Enum.valueOf(DeleteType.class,request.getDeleteType())) {
			case Normal:
			case GoodByeService:
			case Mnp:
			case MnpMvno:
				if(request.isDiscountRecover()) {
					logger.debug("Call DeleteSubscriber");
					callDelete(objectMapper,request,headers,headerType);
				}
				else {
					logger.debug("Call DeleteSubscriberX");
					callDeleteX(objectMapper,request,headers,headerType);
				}
				break;
			case EbuRollbackDelete:
			case EbuRollbackPreinstalled:
				logger.debug("Call DeleteSubscriberX");
				callDeleteX(objectMapper,request,headers,headerType);
				break;
			case MnpOnDeletedSubscriber:
				logger.debug("Call DeleteSubscriber");
				callDelete(objectMapper,request,headers,headerType);
				break;
			case MnpDeactivationOnDeletedSubscriber:
				logger.debug("Call RestoreSubscriber");
				callRestore(objectMapper,request,headers,headerType);
				break;

			default:
				return ;
			}

		} catch (ExecutorSynchronousFailed e) {
			throw e;
		}catch (Exception e) {
			logger.error("DeleteSubscriber calling error", e);
			// TODO Auto-generated catch block
			e.printStackTrace();

			throw new TrcsInboundExecutorException(e);
		}

	}

	
	private void callRestore(ObjectMapper objectMapper,DeleteSubscriberRequestBean request,Map<String, Object> headers,HeaderType headerType) throws ExecutorSynchronousFailed,Exception {


		InfobusMessage response = callWebServiceRestoreSubscriber(request, headers, headerType);
		logger.info("RestoreDeleteSubsciber result=[{}]", response.getIbRetCode());

		if ("1".equals(response.getIbRetCode())) {
			//TODO: Scrivere Log di Success
			HydraLogThreadLocal.getLogBean().setResult(HydraLogBean.Result.success);

		} else {
			//TODO: Gestire Errore di invocazione inviando risposta KO su Kafka
			//TODO: Inserire Logging
			DeleteSubscriberResponseBean responsePayload = this.createResponsePayload(headers, request, response);
			
			throw new ExecutorSynchronousFailed(
					this.getReponseTargets().getResponseTarget(TrcsKafkaEventType.deleteSubscriberResponse),
					TrcsKafkaHeader.createResponseKafkaHeader(headers, TrcsKafkaEventType.deleteSubscriberResponse),
					responsePayload,
					objectMapper.writeValueAsString(responsePayload),
					request.getPhoneNumber()
					);

		} 

	}
	
	private InfobusMessage callWebServiceRestoreSubscriber(DeleteSubscriberRequestBean request, Map<String, Object> headers,
			HeaderType headerType) {
		// Effettua il mapping con il body SOAP
		RestoreSubscriberRequest wsRequest = this.createWebServiceRestoreRequest(request, headers, headerType);
		InfobusMessage response = this.getOpscClient().restoreSubscriber(headerType, wsRequest);
		return response;
	}

	private void callDeleteX(ObjectMapper objectMapper,DeleteSubscriberRequestBean request,Map<String, Object> headers,HeaderType headerType) throws ExecutorSynchronousFailed,Exception {


		DeleteSubscriberXResponse response = callWebServiceDeleteSubscriberX(request, headers, headerType);
		logger.info("DeleteSubsciberX result=[{}]", response.getIbRetCode());

		if ("1".equals(response.getIbRetCode())) {
			//TODO: Scrivere Log di Success
			HydraLogThreadLocal.getLogBean().setResult(HydraLogBean.Result.success);

		} else {
			//TODO: Gestire Errore di invocazione inviando risposta KO su Kafka
			//TODO: Inserire Logging
			DeleteSubscriberResponseBean responsePayload = this.createResponsePayloadX(headers, request, response);
			
			throw new ExecutorSynchronousFailed(
					this.getReponseTargets().getResponseTarget(TrcsKafkaEventType.deleteSubscriberResponse),
					TrcsKafkaHeader.createResponseKafkaHeader(headers, TrcsKafkaEventType.deleteSubscriberResponse),
					responsePayload,
					objectMapper.writeValueAsString(responsePayload),
					request.getPhoneNumber()
					);

		} 

	}

	private void callDelete(ObjectMapper objectMapper,DeleteSubscriberRequestBean request,Map<String, Object> headers,HeaderType headerType) throws ExecutorSynchronousFailed,Exception {


		InfobusMessage response = callWebServiceDeleteSubscriber(request, headers, headerType);
		logger.info("DeleteSubsciber result=[{}]", response.getIbRetCode());

		if ("1".equals(response.getIbRetCode())) {
			//TODO: Scrivere Log di Success
			HydraLogThreadLocal.getLogBean().setResult(HydraLogBean.Result.success);

		} else {
			//TODO: Gestire Errore di invocazione inviando risposta KO su Kafka
			//TODO: Inserire Logging
			DeleteSubscriberResponseBean responsePayload = this.createResponsePayload(headers, request, response);
			
			throw new ExecutorSynchronousFailed(
					this.getReponseTargets().getResponseTarget(TrcsKafkaEventType.deleteSubscriberResponse),
					TrcsKafkaHeader.createResponseKafkaHeader(headers, TrcsKafkaEventType.deleteSubscriberResponse),
					responsePayload,
					objectMapper.writeValueAsString(responsePayload),
					request.getPhoneNumber()
					);

		} 

	}


	private DeleteSubscriberResponseBean createResponsePayload(Map<String, Object> headers, DeleteSubscriberRequestBean request,  InfobusMessage response) {

		DeleteSubscriberResponseBean result = new DeleteSubscriberResponseBean(headers.get(TrcsKafkaHeader.sourceSystem.name()).toString(),
				request.getPhoneNumber(),
				KafkaErrorCodes.decodeFromOpsc(response.getIbRetCode()),
				KafkaErrorCodes.messageFromOpsc(response.getIbRetCode()),
				request.getDeleteType(),
				request.getReason(),
				request.getPhoneNumberMnp(),
				request.isDiscountRecover(),
				// rivedere 
				new BigDecimal("0.00"),
				new BigDecimal("0.00")
				);



		result.setSubsystemErrorCode(response.getIbRetCode());

		return result;


	}

	private DeleteSubscriberResponseBean createResponsePayloadX(Map<String, Object> headers, DeleteSubscriberRequestBean request,  DeleteSubscriberXResponse response) {

		DeleteSubscriberResponseBean result = new DeleteSubscriberResponseBean(headers.get(TrcsKafkaHeader.sourceSystem.name()).toString(),
				request.getPhoneNumber(),
				KafkaErrorCodes.decodeFromOpsc(response.getIbRetCode()),
				KafkaErrorCodes.messageFromOpsc(response.getIbRetCode()),
				request.getDeleteType(),
				request.getReason(),
				request.getPhoneNumberMnp(),
				request.isDiscountRecover(),
				// rivedere 
				new BigDecimal("0.00"),
				new BigDecimal("0.00")
				);



		result.setSubsystemErrorCode(response.getIbRetCode());

		return result;


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

	
	private RestoreSubscriberRequest createWebServiceRestoreRequest(DeleteSubscriberRequestBean request, Map<String, Object> headers,
			HeaderType headerType) {
		
		InfobusMessage message =  new InfobusMessage();
		message.setIbAppDep1("0");
		message.setIbAppDep2("0");
		message.setIbRetCode("1");
		message.setIbIdSrvc("RESTOREG");
		message.setIbData(new DeleteSubscriberRequest.IbData());
		message.getIbData().setIbLenData(0);
		//RestoreSubscriberRequest wsRequest = new RestoreSubscriberRequest();
	    RestoreSubscriberRequest wsRequest = RestoreSubscriberRequest.createInstance(message);

		wsRequest.setIbData(message.getIbData());
		wsRequest.getPayload().setOperationType(wsRequest.getPayload().getOperationType());
		wsRequest.getPayload().setMsisdn(request.getPhoneNumber());
		wsRequest.getPayload().setIccid("89000000000000000000");
		wsRequest.getPayload().setImsi("220000000000000");
		wsRequest.getPayload().setDebit("0.000000");
		wsRequest.getPayload().setTariffid(283);
		wsRequest.getPayload().setLanguageid("1");
		wsRequest.getPayload().setAststate(request.getReason());
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
		wsRequest.getPayload().setInstalldate( formatter.format(new Date()));
		wsRequest.getPayload().setTypeofcard("00");
		wsRequest.getPayload().setCardphase("  ");
		wsRequest.getPayload().setR_system("3");
		wsRequest.getPayload().setDebitco("0.000000");
		wsRequest.getPayload().setBonus1("0.000000");
		wsRequest.getPayload().setBonus2("0.000000");
		wsRequest.getPayload().setCardfeatures("A B C D");

		// da vedere
		wsRequest.getPayload().setSubSystem("channel");
		return wsRequest;
	}
}
