package it.telecomitalia.trcs.middleware.ws.client;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.webservices.client.HttpWebServiceMessageSenderBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.transport.WebServiceMessageSender;


@Configuration
public class OpscProvisiningClientConfig {


	@Value("${trcs.gateway.services.opsc-provisionig:http://localhost:8080/opsc/provisioning}")
	private String defaultUri;
	
	@Value("${trcs.gateway.services.timeout.connection:5000}")
	private int connectionTimeout;
	
	@Value("${trcs.gateway.services.timeout.read:5000}")
	private int readTimeout;

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		// this package must match the package in the <generatePackage> specified in
		// pom.xml
		marshaller.setContextPaths(
				"it.telecomitalia.soa.soap.soapheader",
				"it.telecomitalia.soa.trcs.gateway",
				"it.telecomitalia.soa.trcs.gateway.infobus.commons");
		return marshaller;
	}

	@Bean
	public OpscProvisioningClient opscProvisioningClient(Jaxb2Marshaller marshaller) {
		OpscProvisioningClient client = new OpscProvisioningClient();
		client.setDefaultUri(this.defaultUri);
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		
		client.setMessageSender(webServiceMessageSender());

		return client;
	}

	
	@Bean
	public WebServiceMessageSender webServiceMessageSender() {
		
		return (new HttpWebServiceMessageSenderBuilder()
				.setConnectTimeout(Duration.ofMillis(this.connectionTimeout))
				.setReadTimeout(Duration.ofMillis(this.readTimeout))
				.build());
	}
	
}
