package it.telecomitalia.trcs.middleware.ws.client;

import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.springframework.util.Assert;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import it.telecomitalia.soa.soap.soapheader.HeaderType;
import it.telecomitalia.soa.soap.soapheader.ObjectFactory;

public class SoapActionAndHeaderCallback extends SoapActionCallback {

	private HeaderType header;

	public SoapActionAndHeaderCallback(String soapAction, HeaderType header) {
		super(soapAction);
		this.header = header;
	}

	@Override
	public void doWithMessage(WebServiceMessage message) throws IOException {
		Assert.isInstanceOf(SoapMessage.class, message);
		super.doWithMessage(message);
		
		try {
			SoapHeader soapHeader = ((SoapMessage) message).getSoapHeader();
		
			JAXBContext context = JAXBContext.newInstance(HeaderType.class);
			Marshaller marshaller = context.createMarshaller();
			ObjectFactory factory = new ObjectFactory();
			marshaller.marshal(factory.createHeader(this.header), soapHeader.getResult());
		} catch (Exception e) {
			//logger.error("error during marshalling of the SOAP headers", e);
			e.printStackTrace();
		}
		
		//SoapMessage soapMessage = (SoapMessage) message;
		//soapMessage.getSoapHeader().addHeaderElement("");
	}
	
}
