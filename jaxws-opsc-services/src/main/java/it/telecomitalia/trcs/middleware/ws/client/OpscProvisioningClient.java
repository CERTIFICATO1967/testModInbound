package it.telecomitalia.trcs.middleware.ws.client;

import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import it.telecomitalia.soa.soap.soapheader.HeaderType;
import it.telecomitalia.soa.trcs.gateway.ChangeNumberRequest;
import it.telecomitalia.soa.trcs.gateway.ChangeNumberResponse;
import it.telecomitalia.soa.trcs.gateway.DeleteSubscriberXRequest;
import it.telecomitalia.soa.trcs.gateway.DeleteSubscriberXResponse;
import it.telecomitalia.soa.trcs.gateway.SetSubscriberStatusXRequest;
import it.telecomitalia.soa.trcs.gateway.SetSubscriberStatusXResponse;
import it.telecomitalia.soa.trcs.gateway.infobus.commons.InfobusMessage;

import it.telecomitalia.trcs.gateway.services.opsc.DeleteSubscriberRequest;


/**
 * Classe Client per i WebServices esposti per provisioning da OPSC
 * 
 * @author danlanzi
 *
 */
public class OpscProvisioningClient extends WebServiceGatewaySupport {

	private static final Logger log = LoggerFactory.getLogger(OpscProvisioningClient.class);


	/**
	 * WebService SetSubscriberStatusX
	 * 
	 * @param header
	 * @param request
	 * @return
	 */
	public SetSubscriberStatusXResponse setSubscriberStatusX(HeaderType header, SetSubscriberStatusXRequest request) {

		log.info("Requesting change subsriber status for [{}]", request.getIbData().getRequest().getClientKeys().getMSISDN());

		SetSubscriberStatusXResponse response = (SetSubscriberStatusXResponse) getWebServiceTemplate()
				.marshalSendAndReceive(this.getDefaultUri(), request,
						new SoapActionAndHeaderCallback(
								"SetSubscriberStatusX", header));

		return response;
	}
	
	public ChangeNumberResponse changeNumber(HeaderType header, ChangeNumberRequest request) {
		log.info("Requesting change number for [{}]", request.getIbData().getRequest().getClientKeys().getMSISDN());

		ChangeNumberResponse response = (ChangeNumberResponse) getWebServiceTemplate()
				.marshalSendAndReceive(this.getDefaultUri(), request,
						new SoapActionAndHeaderCallback(
								"ChangeNumber", header));

		return response;
		
	}
	
	public DeleteSubscriberXResponse deleteSubscriberX(HeaderType header, DeleteSubscriberXRequest request) {
		log.info("Requesting delete subscriber X for [{}]", request.getIbData().getRequest().getClientKeys().getMSISDN());

		DeleteSubscriberXResponse response = (DeleteSubscriberXResponse) getWebServiceTemplate()
				.marshalSendAndReceive(this.getDefaultUri(), request,
						new SoapActionAndHeaderCallback(
								"DeleteSubscriberX", header));

		return response;
		
	}
	
	public InfobusMessage deleteSubscriber(HeaderType header, DeleteSubscriberRequest request) {
		log.info("Requesting delete subscriber  for [{}]", request.getPayload().getMsisdn());
		JAXBElement<InfobusMessage>	 response = (JAXBElement<InfobusMessage>) getWebServiceTemplate()
				.marshalSendAndReceive(this.getDefaultUri(), request,
						new SoapActionAndHeaderCallback(
								"DeleteSubscriber", header));

		return response.getValue();
		
	}
}
