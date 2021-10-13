package it.telecomitalia.trcs.middleware.kafka.inbound.command.impl;

import java.util.Map;

import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

import it.telecomitalia.soa.soap.soapheader.HeaderType;
import it.telecomitalia.soa.trcs.gateway.recharge.commons.InfobusMessage;
import it.telecomitalia.trcs.middleware.kafka.inbound.builder.HeaderTypeBuilder;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.ExecutorSynchronousFailed;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.TrcsInboundExecutorException;
import it.telecomitalia.trcs.middleware.kafka.inbound.config.ResponseTargets;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.ReloadSubscriberRequestBean;
import it.telecomitalia.trcs.middleware.kafka.inbound.logging.HydraLogThreadLocal;
import it.telecomitalia.trcs.middleware.ws.client.GinoRechargeClient;

public class ReloadSubscriberExecutor extends AbstractExecutor {

	private final Logger logger = LoggerFactory.getLogger(ReloadSubscriberExecutor.class);


	public ReloadSubscriberExecutor(GinoRechargeClient client, ResponseTargets responseTargets) {
		super(client, responseTargets);
	}

	
	@Override
	public void execute(Map<String, Object> headers, String payload)   throws ExecutorSynchronousFailed {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			logger.debug("Request Combine [{}]", payload);
			
			// Converte il JSON in POJO
			ReloadSubscriberRequestBean request = objectMapper.readValue(payload, ReloadSubscriberRequestBean.class);
			
			HydraLogThreadLocal.getLogBean().getEvent().setPayload(request);
			
			// Effettua il mapping con l'header SOAP
			HeaderType headerType = new HeaderTypeBuilder(headers).build();
			
			// Effettua il mapping con il body SOAP
			InfobusMessage message = this.createWebServiceRequest(request, headers, headerType);
			
			it.telecomitalia.soa.trcs.gateway.recharge.ObjectFactory obj = new it.telecomitalia.soa.trcs.gateway.recharge.ObjectFactory();
			JAXBElement<InfobusMessage> result = obj.createCombineRequest(message);
		
			
			// Invoca il servizio di combine (recharge) di GW
			 this.getGinoRechargeClient().combine(headerType, result);

			logger.info("ReloadSubscriber Combine end ");
			
		}  catch (Exception e) {
			logger.error("ChangeCard calling error.", e);
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			throw new TrcsInboundExecutorException(e);
		}
			
			
		

	}
	
	
	private InfobusMessage createWebServiceRequest(ReloadSubscriberRequestBean request, Map<String, Object> headers,
			HeaderType headerType) {
		
		InfobusMessage message =  new InfobusMessage();
		message.setIbAppDep1("0");
		message.setIbAppDep2("0");
		message.setIbRetCode("1");
		message.setIbIdSrvc("RICARICA");
		message.setIbData(new InfobusMessage.IbData());
		String tabSep =  new String("\t");
		// Create buffer flat for ibdata
		StringBuffer strBuf =  new StringBuffer("channel");
		strBuf.append(tabSep);
		strBuf.append("SYNCHRONOUS");
		strBuf.append(tabSep);
		strBuf.append("NO_ZERO_MODE_FRAUD");
		strBuf.append(tabSep);
		strBuf.append("0");
		strBuf.append(tabSep);
		strBuf.append(request.getPhoneNumber());
		strBuf.append(tabSep);
		strBuf.append(request.getReloadValue().toString());
		strBuf.append(tabSep);
		strBuf.append(request.getPayDate().toString());
		strBuf.append(tabSep);
		strBuf.append(request.getActiveTime()!=null ?request.getActiveTime() :"365");
		strBuf.append(tabSep);
		strBuf.append("395");
		strBuf.append(tabSep);
		strBuf.append(request.getDispatcherOperationType());
		strBuf.append(tabSep);
		strBuf.append(request.getAbiCode());
		strBuf.append(tabSep);
		strBuf.append(request.getCabCode());
		strBuf.append(tabSep);
		strBuf.append(request.getReloadServiceId());
		strBuf.append(tabSep);
		strBuf.append(request.getDealerServiceId());
		strBuf.append(tabSep);
		strBuf.append(request.getClientOperationType());
		
		message.getIbData().setIbLenData(strBuf.toString().length());
		message.getIbData().setValue(strBuf.toString());

		
		return message;
	}

}
