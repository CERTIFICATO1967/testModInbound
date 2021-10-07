package it.telecomitalia.trcs.middleware.kafka.inbound.command.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

import it.telecomitalia.soa.soap.soapheader.HeaderType;
import it.telecomitalia.soa.trcs.gateway.infobus.commons.InfobusMessage;
import it.telecomitalia.trcs.middleware.kafka.inbound.builder.HeaderTypeBuilder;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.ExecutorSynchronousFailed;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.TrcsInboundExecutorException;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.impl.type.CreateType;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.impl.type.InfoType;
import it.telecomitalia.trcs.middleware.kafka.inbound.config.ResponseTargets;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.CreateSubscriberRequestBean;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.CreateSubscriberResponseBean;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.TrcsKafkaEventType;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.TrcsKafkaHeader;
import it.telecomitalia.trcs.middleware.kafka.inbound.logging.HydraLogBean;
import it.telecomitalia.trcs.middleware.kafka.inbound.logging.HydraLogThreadLocal;
import it.telecomitalia.trcs.middleware.ws.client.OpscProvisioningClient;


public class CreateSubscriberExecutor extends AbstractExecutor{

	private final Logger logger = LoggerFactory.getLogger(CreateSubscriberExecutor.class);


	public CreateSubscriberExecutor(OpscProvisioningClient client, ResponseTargets responseTargets) {
		super(client, responseTargets);
	}


	@Override
	public void execute(Map<String, Object> headers, String payload) throws ExecutorSynchronousFailed{

		ObjectMapper objectMapper = new ObjectMapper();

		try {
			logger.debug("Request [{}]", payload);

			// Converte il JSON in POJO
			CreateSubscriberRequestBean request = objectMapper.readValue(payload, CreateSubscriberRequestBean.class);
			
			HydraLogThreadLocal.getLogBean().getEvent().setPayload(request);
			// Effettua il mapping con l'header SOAP
			HeaderType headerType = new HeaderTypeBuilder(headers).build();
			
					
			switch (Enum.valueOf(CreateType.class,request.getCreateType())) {
			case Restore: 
				switch (Enum.valueOf(InfoType.class,request.getInfo())) {
				case Normal:
				case NumPortSubscr:
				case MnpSubscr:
				case ExpSubscr:
					if (!request.getBaseOffer().startsWith("OB6")) {
						logger.info("call RestoreSubscriber(CreateSub)");
						callRestore(objectMapper,request,headers,headerType);
					}
					else {
						logger.info("call RestoreSubscriberX"); 
						//callRestoreX();

					}
					break;
				}
			case Migrate:
				logger.info("call MigrateSubscriber"); 
				//callMigrate();
				break;
			case Install:
				if(request.isFullMnp()) {
					logger.info("call InstallSubscriberX");
					//callInstallX();
				}
				else {
					logger.info("call SaleOperationX");
					//callSaleOperationX();
				}
			default:
				return ;
			}

		} catch (ExecutorSynchronousFailed e) {
			throw e;
		}catch (Exception e) {
			logger.error("CreateSubscriber calling error", e);
			// TODO Auto-generated catch block
			e.printStackTrace();

			throw new TrcsInboundExecutorException(e);
		}

	}

	
	private void callRestore(ObjectMapper objectMapper,CreateSubscriberRequestBean request,Map<String, Object> headers,HeaderType headerType) throws ExecutorSynchronousFailed,Exception {


		InfobusMessage response = callWebServiceRestoreSubscriber(request, headers, headerType);
		logger.info("RestoreSubsciber result=[{}]", response.getIbRetCode());

		if ("1".equals(response.getIbRetCode())) {
			//TODO: Scrivere Log di Success
			HydraLogThreadLocal.getLogBean().setResult(HydraLogBean.Result.success);

		} else {
			//TODO: Gestire Errore di invocazione inviando risposta KO su Kafka
			//TODO: Inserire Logging
			CreateSubscriberResponseBean responsePayload = this.createRestoreResponsePayload(headers, request, response);
			
			throw new ExecutorSynchronousFailed(
					this.getReponseTargets().getResponseTarget(TrcsKafkaEventType.createSubscriberResponse),
					TrcsKafkaHeader.createResponseKafkaHeader(headers, TrcsKafkaEventType.createSubscriberResponse),
					responsePayload,
					objectMapper.writeValueAsString(responsePayload),
					request.getPhoneNumber()
					);

		} 

	}
	
	private InfobusMessage callWebServiceRestoreSubscriber(CreateSubscriberRequestBean request, Map<String, Object> headers,
			HeaderType headerType) {
		// Effettua il mapping con il body SOAP
		JAXBElement<InfobusMessage> wsRequest = this.createWebServiceRestoreRequest(request, headers, headerType);
		InfobusMessage response = this.getOpscClient().restoreSubscriber(headerType, wsRequest);
		return response;
	}



	

	private CreateSubscriberResponseBean createRestoreResponsePayload(Map<String, Object> headers, CreateSubscriberRequestBean request,  InfobusMessage response) {

		CreateSubscriberResponseBean result = new CreateSubscriberResponseBean(headers.get(TrcsKafkaHeader.sourceSystem.name()).toString(),
				request.getPhoneNumber(),
				KafkaErrorCodes.decodeFromOpsc(response.getIbRetCode()),
				KafkaErrorCodes.messageFromOpsc(response.getIbRetCode()),
				request.getCreateType(),
				request.getIccid(),
				request.getImsi(),
				null
				);

		result.setSubsystemErrorCode(response.getIbRetCode());
     	return result;

	}


	
	
	
	private JAXBElement<InfobusMessage>	 createWebServiceRestoreRequest(CreateSubscriberRequestBean request, Map<String, Object> headers,
			HeaderType headerType) {
		
		InfobusMessage message =  new InfobusMessage();
		message.setIbAppDep1("0");
		message.setIbAppDep2("0");
		message.setIbRetCode("1");
		message.setIbIdSrvc("RESTOREG");
		message.setIbData(new InfobusMessage.IbData());
		// Create buffer flat for ibdata
		StringBuffer strBuf =  new StringBuffer("   channel");
		String operType = new String();
		
		switch (Enum.valueOf(InfoType.class,request.getInfo())) {
		  case Normal:
			  operType="0";
			  break;
		  case NumPortSubscr:
			  operType="1";
			  break;
		  case MnpSubscr:
			  operType="2";
			  break;
		  case ExpSubscr:
			  operType="4";
			  break;
			
		}
		strBuf.append(operType);
		
		strBuf.append(StringUtils.leftPad(request.getPhoneNumber(),12));
		// iccid
		strBuf.append(StringUtils.leftPad(request.getIccid()!=null ? request.getIccid():"",20));
		//imsi
		strBuf.append(StringUtils.leftPad(request.getImsi()!=null ? request.getImsi():"",16));
		// pin puk pin2 puk2 category
		
		strBuf.append(StringUtils.leftPad("",30));
		// debit
		strBuf.append(StringUtils.leftPad((request.getCredit()==null ? "0.000000" : request.getCredit().toString()),16));
		// tariff
		strBuf.append(StringUtils.leftPad(request.getBaseOffer().substring(2),5));
		// language
		strBuf.append(StringUtils.leftPad(request.getLanguageId(),2));
		// aststate
		strBuf.append("A");
		// serviceid
		strBuf.append(StringUtils.leftPad("",5));
		// setInstalldate
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
		strBuf.append(StringUtils.leftPad((request.getInstallationDate()!=null ? formatter.format(request.getInstallationDate()) : formatter.format(new Date())),14));
		//setActivedate
		strBuf.append(StringUtils.leftPad((request.getActivationDate()!=null ? formatter.format(request.getActivationDate()) : ""),14));
		//setDeactivated
		strBuf.append(StringUtils.leftPad((request.getDeactivationDate()!=null ? formatter.format(request.getDeactivationDate()) : ""),14));
		//setDeactivedate
		strBuf.append(StringUtils.leftPad((request.getDeactivationDate()!=null ? formatter.format(request.getDeactivationDate()) : ""),14));
		//setExpirydate
		strBuf.append(StringUtils.leftPad((request.getExpirationDate()!=null ? formatter.format(request.getExpirationDate()) : ""),14));
		// setExpiredreason
		strBuf.append(StringUtils.leftPad(request.getExpiredReason()!=null ? request.getExpiredReason() :"",1));
		// setInformedmessageid
		strBuf.append(StringUtils.leftPad("",1));
		//  setNumreloads
		strBuf.append(StringUtils.leftPad(request.getNumReloads()!=null ? request.getNumReloads():"",5));
		// setNumchangetariff 
		strBuf.append(StringUtils.leftPad(request.getNumBaseOfferChanges()!=null ? request.getNumBaseOfferChanges():"",5));
		//setChangetariffdate 
		strBuf.append(StringUtils.leftPad((request.getLastBaseOfferChange()!=null ? formatter.format(request.getLastBaseOfferChange()) : ""),14));
		//setLastcalldate
		strBuf.append(StringUtils.leftPad((request.getLastCreditUpdate()!=null ? formatter.format(request.getLastCreditUpdate()) : ""),14));
		// setTypeofcard
		strBuf.append(StringUtils.leftPad(request.getTypeOfCard()!=null ? request.getTypeOfCard():"",2));
		// setCardphase 
		strBuf.append(StringUtils.leftPad(request.getPhase()!=null ? request.getPhase():"",2));
		//setAccessorycode
		//setDistrictid
		//setNumdistricts 
		//setChangedistrictdate
		strBuf.append(StringUtils.leftPad("",31));
		// setR_system
		strBuf.append("3");
		// setNumbilledsms setNumfreesms setAccessoryedate
		strBuf.append(StringUtils.leftPad("",24));
		// setDebitco
		strBuf.append(StringUtils.leftPad("0.000000",16));
		// setBonus1
		strBuf.append(StringUtils.leftPad((request.getBonus1()==null ? "0.000000":request.getBonus1().toString()),16));
		// setBonus2
		strBuf.append(StringUtils.leftPad("0.000000",10));
		// setNumfreeseconds
		strBuf.append(StringUtils.leftPad("",5));
		// setCardfeatures
		strBuf.append(StringUtils.leftPad(request.getFeatures()!=null ? request.getFeatures():"",8));
		//setServcardedate2 
		strBuf.append(StringUtils.leftPad("",14));
		// setServices
		long fullMnp = request.isFullMnp() ? 67108864 : 0;
		long restoredFromExpired = request.isRestoredFromExpired() ? 2097152 :0;
		Long  X = fullMnp + restoredFromExpired;
		strBuf.append((StringUtils.leftPad(X.toString(),10)));
		
		// setServcardedate5 
		// setServcardedate1
		// setServcardedate3
		//setServcardedate4 
		strBuf.append(StringUtils.leftPad("",56));
		//setActivetime
		strBuf.append(StringUtils.leftPad(request.getActiveTime()!=null? request.getActiveTime():"",3));
        //setDeactivetime	setRetbonus setTypeofbonus setTypeoflist 
		//setRetbonusedate setServcard_edate6	setAccessorycode_edate1	setAccessorycode_edate2 setPointsbasket1edate  setPointsbasket2edate setPointsbasket3edate	setPointsbasket1 setPointsbasket2 setPointsbasket3 setPointsbasket4edate setPointsbasket5edate
		strBuf.append(StringUtils.leftPad("",189));
	    
		message.getIbData().setIbLenData(strBuf.toString().length());
		message.getIbData().setValue(strBuf.toString());
			
		message.setIbData(message.getIbData());
		it.telecomitalia.soa.trcs.gateway.ObjectFactory obj = new it.telecomitalia.soa.trcs.gateway.ObjectFactory();
		JAXBElement<InfobusMessage> result = obj.createRestoreSubscriberRequest(message);
	
		return result;
	}
	
	private static String ConvertDateGregToString(XMLGregorianCalendar dateToConvert) {
		if(dateToConvert==null)
			return null;
		String dateConvert=dateToConvert.toString().replace("T", "").replace(":", "").replace("-", "");

		//return dateConvert;
		return dateConvert.substring(0, 14);
	}

}
