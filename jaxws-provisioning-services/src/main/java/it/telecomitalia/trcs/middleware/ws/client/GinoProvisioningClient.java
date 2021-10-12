package it.telecomitalia.trcs.middleware.ws.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import it.telecomitalia.soa.soap.soapheader.HeaderType;
import it.telecomitalia.soa.trcs.gateway.provisioning.AccountMigrationRequest;
import it.telecomitalia.soa.trcs.gateway.provisioning.ChangeCardRequest;
import it.telecomitalia.soa.trcs.gateway.provisioning.commons.ResponseMessage;


/**
 * Classe Client per i WebServices esposti per provisioning da GINO
 * 
 * @author raffaeleCapasso
 *
 */
public class GinoProvisioningClient extends WebServiceGatewaySupport {

	private static final Logger log = LoggerFactory.getLogger(GinoProvisioningClient.class);


	/**
	 * WebService changeCard
	 * 
	 * @param header
	 * @param request
	 * @return
	 */
	
	public ResponseMessage changeCard(HeaderType header, ChangeCardRequest request) {
		log.info("Requesting change card for [{}]", request.getPhoneNumber());

//		ResponseMessage response = (ResponseMessage) getWebServiceTemplate()
//				.marshalSendAndReceive(this.getDefaultUri(), request,
//						new SoapActionAndHeaderCallback(
//								"ChangeCard", header));


//		JAXBElement<ResponseMessage> response = (JAXBElement<ResponseMessage>) getWebServiceTemplate()
		ResponseMessage response = (ResponseMessage) getWebServiceTemplate()
		.marshalSendAndReceive(this.getDefaultUri(), request,
				new SoapActionAndHeaderCallback(
						"ChangeCard", header));
		
		
		
//		return response.getValue();
		return response;
		
	}
	
	
	public ResponseMessage changeSubscriber(HeaderType header, AccountMigrationRequest request) {
		log.info("Requesting change subscriber for [{}]", request.getPhoneNumber());

//		JAXBElement<ResponseMessage> response = (JAXBElement<ResponseMessage>) getWebServiceTemplate()
		ResponseMessage response = (ResponseMessage) getWebServiceTemplate()
		.marshalSendAndReceive(this.getDefaultUri(), request,
				new SoapActionAndHeaderCallback(
						"ChangeSubscriber", header));
		
//		return response.getValue();
		return response;
		
	}
	
}
