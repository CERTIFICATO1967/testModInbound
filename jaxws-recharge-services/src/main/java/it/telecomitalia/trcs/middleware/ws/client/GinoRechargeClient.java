package it.telecomitalia.trcs.middleware.ws.client;

import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import it.telecomitalia.soa.soap.soapheader.HeaderType;
import it.telecomitalia.soa.trcs.gateway.recharge.commons.InfobusMessage;

//import it.telecomitalia.soa.trcs.gateway.infobus.commons.InfobusMessage;

/**
 * Classe Client per i WebServices esposti per provisioning da GINO
 * 
 * @author raffaeleCapasso
 *
 */
public class GinoRechargeClient extends WebServiceGatewaySupport {

	private static final Logger log = LoggerFactory.getLogger(GinoRechargeClient.class);


	/**
	 * WebService combine
	 * 
	 * @param header
	 * @param request
	 * @return
	 */
	
	public InfobusMessage combine(HeaderType header, JAXBElement<InfobusMessage> request) {
		log.info("Requesting combine  for [{}]", request.toString());
		JAXBElement<InfobusMessage>	 response = (JAXBElement<InfobusMessage>) getWebServiceTemplate()
				.marshalSendAndReceive(this.getDefaultUri(), request,
						new SoapActionAndHeaderCallback(
								"Combine", header));

		return response.getValue();
		
	}
	
}
