package it.telecomitalia.trcs.middleware.kafka.inbound.command.impl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.xml.bind.JAXBElement;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

import it.telecomitalia.soa.soap.soapheader.HeaderType;
import it.telecomitalia.soa.trcs.gateway.DeleteSubscriberXIbData;
import it.telecomitalia.soa.trcs.gateway.DeleteSubscriberXRequest;
import it.telecomitalia.soa.trcs.gateway.DeleteSubscriberXResponse;
import it.telecomitalia.soa.trcs.gateway.infobus.commons.InfobusMessage;

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
					logger.info("Call DeleteSubscriber");
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
		JAXBElement<InfobusMessage> wsRequest = this.createWebServiceRestoreRequest(request, headers, headerType);
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
	    JAXBElement<InfobusMessage>  wsRequest = this.createWebServiceRequest(request, headers, headerType);
		// Invoca il servizio di cambio numero di GW
		InfobusMessage response = this.getOpscClient().deleteSubscriber(headerType, wsRequest);
		return response;
	}

	private JAXBElement<InfobusMessage> createWebServiceRequest(DeleteSubscriberRequestBean request, Map<String, Object> headers,
			HeaderType headerType) {

		InfobusMessage message =  new InfobusMessage();
		message.setIbAppDep1("0");
		message.setIbAppDep2("0");
		message.setIbRetCode("1");
		message.setIbIdSrvc("SERVINTG");
		message.setIbData(new InfobusMessage.IbData());
		
		// Create buffer flat for ibdata
		StringBuffer strBuf =  new StringBuffer("   channel");
		String opType = new String(" ");
		switch (Enum.valueOf(DeleteType.class,request.getDeleteType())) {
		  case Normal:
			opType="0";
			break;
		  case GoodByeService:
			opType="1";
			break;
		  case Mnp:
			opType="2";
			break;
		  case MnpMvno:
			opType="8";
			break;
		  case MnpOnDeletedSubscriber:
			opType="B";
			break;
		}
        // operationType
		strBuf.append(opType);
		// msisdn
		strBuf.append(StringUtils.leftPad(request.getPhoneNumber(),12));
		// setAstState
		strBuf.append(request.getReason());
		// R_SYSTEM
		strBuf.append("3");
		// SRNB
		strBuf.append(request.isDiscountRecover() ? StringUtils.leftPad("",11):StringUtils.leftPad("99",11));
		// MNPMSISDN
		strBuf.append(StringUtils.leftPad(request.getPhoneNumberMnp(),12));
		// OLOMSISDN
		strBuf.append(StringUtils.leftPad("",12));
		//TYPEOFCARD
		strBuf.append(StringUtils.leftPad(request.getTypeOfCard(),2));
		
		
		message.getIbData().setIbLenData(strBuf.toString().length());
		message.getIbData().setValue(strBuf.toString());
			
		message.setIbData(message.getIbData());
		it.telecomitalia.soa.trcs.gateway.ObjectFactory obj = new it.telecomitalia.soa.trcs.gateway.ObjectFactory();
		JAXBElement<InfobusMessage> result = obj.createDeleteSubscriberRequest(message);
	
		return result;
		
	}

	
	private JAXBElement<InfobusMessage>	 createWebServiceRestoreRequest(DeleteSubscriberRequestBean request, Map<String, Object> headers,
			HeaderType headerType) {
		
		InfobusMessage message =  new InfobusMessage();
		message.setIbAppDep1("0");
		message.setIbAppDep2("0");
		message.setIbRetCode("1");
		message.setIbIdSrvc("RESTOREG");
		message.setIbData(new InfobusMessage.IbData());
		// Create buffer flat for ibdata
		StringBuffer strBuf =  new StringBuffer("   channel3");
		strBuf.append(StringUtils.leftPad(request.getPhoneNumber(),12));
		// iccid
		strBuf.append("89000000000000000000");
		//imsi
		strBuf.append("220000000000000");
		// pin puk pin2 puk2 category
		
		strBuf.append(StringUtils.leftPad("",30));
		// debit
		strBuf.append(StringUtils.leftPad("0.000000",16));
		// tariff
		strBuf.append(StringUtils.leftPad("283",5));
		// language
		strBuf.append(" 1");
		// aststate
		strBuf.append(StringUtils.leftPad(request.getReason(),1));
		// serviceid
		strBuf.append(StringUtils.leftPad("",5));
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
		strBuf.append(formatter.format(new Date()));
		// setActivedate setDeactivated setDeactivedate setExpirydate setExpiredreason setInformedmessageid setNumreloads
		// setNumchangetariff setChangetariffdate setLastcalldate
		strBuf.append(StringUtils.leftPad("",96));
		// setTypeofcard
		strBuf.append(" 0");
		
		// setCardphase setAccessorycode setDistrictid setNumdistricts setChangedistrictdate
		strBuf.append(StringUtils.leftPad("",33));
		// setR_system
		strBuf.append("3");
		// setNumbilledsms setNumfreesms setAccessoryedate
		strBuf.append(StringUtils.leftPad("",24));
		// setDebitco
		strBuf.append(StringUtils.leftPad("0.000000",16));
		// setBonus1
		strBuf.append(StringUtils.leftPad("0.000000",16));
		// setBonus2
		strBuf.append(StringUtils.leftPad("0.000000",10));
		// setNumfreeseconds
		strBuf.append(StringUtils.leftPad("",5));
		// setCardfeatures
		strBuf.append(StringUtils.leftPad("A B C D",8));
		//setServcardedate2 setServices setServcardedate5 setServcardedate1 setServcardedate3	setServcardedate4 setActivetime	setDeactivetime	setRetbonus setTypeofbonus setTypeoflist 
		//setRetbonusedate setServcard_edate6	setAccessorycode_edate1	setAccessorycode_edate2 setPointsbasket1edate  setPointsbasket2edate setPointsbasket3edate	setPointsbasket1 setPointsbasket2 setPointsbasket3 setPointsbasket4edate setPointsbasket5edate
		strBuf.append(StringUtils.leftPad("",273));
	   // String mes=new String("AUTOMATION0  337149571289390100003371495712 222013371495712000000000000000000000000                 25.00  279 1A  TIM2021090605001120211006050011202210060500112022100605001120221105050011o     0    0                             2 2                               3                                                    0.00                P 1 3 3                                                                                365395                                                                                                                                                                        ");
		message.getIbData().setIbLenData(strBuf.toString().length());
		message.getIbData().setValue(strBuf.toString());
			
		message.setIbData(message.getIbData());
		it.telecomitalia.soa.trcs.gateway.ObjectFactory obj = new it.telecomitalia.soa.trcs.gateway.ObjectFactory();
		JAXBElement<InfobusMessage> result = obj.createRestoreSubscriberRequest(message);
	
		return result;
	}
}
