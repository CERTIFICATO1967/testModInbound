package it.telecomitalia.trcs.middleware.kafka.inbound.command.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

import it.telecomitalia.soa.soap.soapheader.HeaderType;
import it.telecomitalia.soa.trcs.gateway.AccessoryType;
import it.telecomitalia.soa.trcs.gateway.BasketGroupedType;
import it.telecomitalia.soa.trcs.gateway.DeleteSubscriberXResponse;
import it.telecomitalia.soa.trcs.gateway.MandatoryOfferType;
import it.telecomitalia.soa.trcs.gateway.MandatorySubscriptionType;
import it.telecomitalia.soa.trcs.gateway.OfferType;
import it.telecomitalia.soa.trcs.gateway.ResourceType;
import it.telecomitalia.soa.trcs.gateway.SaleOperationXIbData;
import it.telecomitalia.soa.trcs.gateway.SaleOperationXRequest;
import it.telecomitalia.soa.trcs.gateway.SaleOperationXResponse;
import it.telecomitalia.soa.trcs.gateway.SubscriptionType;
import it.telecomitalia.soa.trcs.gateway.infobus.commons.InfobusMessage;
import it.telecomitalia.trcs.middleware.kafka.inbound.builder.HeaderTypeBuilder;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.ExecutorSynchronousFailed;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.TrcsInboundExecutorException;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.impl.type.CreateType;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.impl.type.InfoType;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.impl.util.UtilModernization;
import it.telecomitalia.trcs.middleware.kafka.inbound.config.ResponseTargets;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.ActivateSubscriberRequestBean;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.ActivateSubscriberResponseBean;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.DeleteSubscriberRequestBean;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.DeleteSubscriberResponseBean;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.TrcsKafkaEventType;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.TrcsKafkaHeader;
import it.telecomitalia.trcs.middleware.kafka.inbound.logging.HydraLogBean;
import it.telecomitalia.trcs.middleware.kafka.inbound.logging.HydraLogThreadLocal;
import it.telecomitalia.trcs.middleware.ws.client.OpscProvisioningClient;


public class ActivateSubscriberExecutor extends AbstractExecutor{

	private final Logger logger = LoggerFactory.getLogger(ActivateSubscriberExecutor.class);


	public ActivateSubscriberExecutor(OpscProvisioningClient client, ResponseTargets responseTargets) {
		super(client, responseTargets);
	}


	@Override
	public void execute(Map<String, Object> headers, String payload) throws ExecutorSynchronousFailed{

		ObjectMapper objectMapper = new ObjectMapper();

		try {
			logger.debug("Request [{}]", payload);

			// Converte il JSON in POJO
			ActivateSubscriberRequestBean request = objectMapper.readValue(payload, ActivateSubscriberRequestBean.class);

			HydraLogThreadLocal.getLogBean().getEvent().setPayload(request);
			// Effettua il mapping con l'header SOAP
			HeaderType headerType = new HeaderTypeBuilder(headers).build();


			logger.info("call SaleOperationX"); 
			callActivateSubscriber(objectMapper,request,headers,headerType);
		}catch (Exception e) {
			logger.error("ActivateSubscriber calling error", e);
			// TODO Auto-generated catch block
			e.printStackTrace();

			throw new TrcsInboundExecutorException(e);
		}

	}





	private void callActivateSubscriber(ObjectMapper objectMapper, ActivateSubscriberRequestBean request,Map<String, Object> headers,HeaderType headerType) throws ExecutorSynchronousFailed,Exception {

		SaleOperationXResponse response = callWebServiceSaleOperationX(request, headers, headerType);
		logger.info("RestoreSubsciberX result=[{}]", response.getIbRetCode());

		if ("1".equals(response.getIbRetCode())) {
			//TODO: Scrivere Log di Success
			HydraLogThreadLocal.getLogBean().setResult(HydraLogBean.Result.success);

		} else {
			//TODO: Gestire Errore di invocazione inviando risposta KO su Kafka
			//TODO: Inserire Logging
			ActivateSubscriberResponseBean responsePayload = this.createResponsePayloadActivateSubscriber(headers, request, response);

			throw new ExecutorSynchronousFailed(
					this.getReponseTargets().getResponseTarget(TrcsKafkaEventType.activateSubscriberResponse),
					TrcsKafkaHeader.createResponseKafkaHeader(headers, TrcsKafkaEventType.activateSubscriberResponse),
					responsePayload,
					objectMapper.writeValueAsString(responsePayload),
					request.getPhoneNumber()
					);

		} 


	}



	private ActivateSubscriberResponseBean createResponsePayloadActivateSubscriber(Map<String, Object> headers, ActivateSubscriberRequestBean request,  SaleOperationXResponse response) {


		ActivateSubscriberResponseBean result = new ActivateSubscriberResponseBean(headers.get(TrcsKafkaHeader.sourceSystem.name()).toString(),
				request.getPhoneNumber(),
				KafkaErrorCodes.decodeFromOpsc(response.getIbRetCode()),
				KafkaErrorCodes.messageFromOpsc(response.getIbRetCode()),
				//Da Rivedere IMSI e ICCID valorizzare solo in caso positivo
				"",
				""
				);

		result.setSubsystemErrorCode(response.getIbRetCode());
		return result;


	}



	private SaleOperationXResponse callWebServiceSaleOperationX(ActivateSubscriberRequestBean request, Map<String, Object> headers,
			HeaderType headerType) throws  DatatypeConfigurationException {
		// Effettua il mapping con il body SOAP
		SaleOperationXRequest wsRequest = this.createWebServiceActivateSubscriberRequest(request, headers, headerType);
		// Invoca il servizio di cambio numero di GW
		SaleOperationXResponse response = this.getOpscClient().saleOperationX(headerType, wsRequest);
		return response;
	}


	private SaleOperationXRequest createWebServiceActivateSubscriberRequest(ActivateSubscriberRequestBean request, Map<String, Object> headers,
			HeaderType headerType) throws  DatatypeConfigurationException {

		SaleOperationXRequest wsRequest = new SaleOperationXRequest();

		wsRequest.setIbRetCode("1");
		wsRequest.setIbAppDep1("0");
		wsRequest.setIbAppDep2("0");
		wsRequest.setIbIdSrvc("OLOMNP");
		wsRequest.setIbData(new SaleOperationXRequest.IbData());
		wsRequest.getIbData().setIbLenData(0);

		SaleOperationXIbData payload = new SaleOperationXIbData();
		wsRequest.getIbData().setRequest(payload);

		payload.setRequestType("TwoStep");

		payload.setTransaction(new SaleOperationXIbData.Transaction());

		payload.getTransaction().setTID(headerType.getTransactionID());
		payload.getTransaction().setSubsystem(String.valueOf(headers.get(TrcsKafkaHeader.channel.name())));
		payload.getTransaction().setService(wsRequest.getIbIdSrvc());
		payload.getTransaction().setIDSystem(headerType.getSourceSystem());
		payload.getTransaction().setRetCode("1");

		payload.setClientKeys(new SaleOperationXIbData.ClientKeys());
		payload.getClientKeys().setMSISDN(request.getPhoneNumber());

		payload.setOperation(new SaleOperationXIbData.Operation());
		payload.getOperation().setOperationType("PCNInstOp");
		payload.getOperation().setInfo(request.getInfo());


		SaleOperationXIbData.Operation.SaleOperation saleOperation = new SaleOperationXIbData.Operation.SaleOperation();

		// Client
		SaleOperationXIbData.Operation.SaleOperation.Client client = new SaleOperationXIbData.Operation.SaleOperation.Client();

		client.setReason("A");
		client.setLanguageId(request.getLanguageId());
		client.setTypeOfCard(request.getTypeOfCard());
		
		//Da non inserire GSM
		
		//SaleOperationXIbData.Operation.SaleOperation.Client.GSM gsm = new SaleOperationXIbData.Operation.SaleOperation.Client.GSM(); 
		
		saleOperation.setClient(client);

		// Subscription
		SubscriptionType  subscription = new SubscriptionType ();
		subscription.setName("WRAPPER");
		saleOperation.getPCNSaleOp().setSubscription(subscription);

		//Subscription / Offer
		OfferType offerType = new OfferType();
		offerType.setName(request.getBaseOffer());
		subscription.getOffer().add(offerType);

		//Subscription / Offer / Accessory
		AccessoryType accessoryType = new AccessoryType();
		accessoryType.setName("WRAPPER");
		subscription.getOffer().get(0).getAccessory().add(accessoryType);

		//Subscription / Offer / Accessory / Basket
		BasketGroupedType basketGroupedType = new BasketGroupedType();
		basketGroupedType.setName("DEBIT");
		basketGroupedType.setValue(request.getCredit() == null ? BigDecimal.ZERO  : request.getCredit());
		subscription.getOffer().get(0).getAccessory().get(0).getBasket().add(basketGroupedType);

		//Subscription / Offer / Accessory / Resource
		ResourceType resourceType = new ResourceType();
		resourceType.setName("RSRIF");
		resourceType.setState(request.isRifService() ? "1" : "2");
		subscription.getOffer().get(0).getAccessory().get(0).getResource().add(resourceType);


		payload.getOperation().setSaleOperation(saleOperation);


		return wsRequest;
	}



	




}
