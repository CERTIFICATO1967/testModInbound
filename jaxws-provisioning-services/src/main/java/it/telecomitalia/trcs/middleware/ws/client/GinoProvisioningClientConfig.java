package it.telecomitalia.trcs.middleware.ws.client;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.webservices.client.HttpWebServiceMessageSenderBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.transport.WebServiceMessageSender;


@Configuration
public class GinoProvisioningClientConfig {


	@Value("${trcs.gateway.services.gino-provisionig.address:http://localhost:8095/gateway/provisioning}")
	private String defaultUri;
	
	@Value("${trcs.gateway.services.gino-provisioning.timeout-connection:1000}")
	private int connectionTimeout;
	
	@Value("${trcs.gateway.services.gino-provisioning.timeout-read:1000}")
	private int readTimeout;

	/*@Bean(name="gino")
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		// this package must match the package in the <generatePackage> specified in
		// pom.xml
		marshaller.setContextPaths(
				"it.telecomitalia.soa.soap.soapheader",
				"it.telecomitalia.soa.trcs.gateway",
				"it.telecomitalia.soa.trcs.gateway.commons");
		return marshaller;
	}*/

	@Bean
	public GinoProvisioningClient ginoProvisioningClient(@Qualifier("ginoJaxb2Marshaller") Jaxb2Marshaller marshaller) {
		GinoProvisioningClient client = new GinoProvisioningClient();
		client.setDefaultUri(this.defaultUri);
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		
		client.setMessageSender(webServiceMessageSenderGino());

		return client;
	}

	@Bean(name="ginoJaxb2Marshaller")
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        String[] packagesToScan= {"it.telecomitalia.soa.soap.soapheader",
        		                  "it.telecomitalia.soa.trcs.gateway.provisioning",
        		                  "it.telecomitalia.soa.trcs.gateway.provisioning.commons"};
        marshaller.setPackagesToScan(packagesToScan);
        return marshaller;
    }
	@Bean
	public WebServiceMessageSender webServiceMessageSenderGino() {
		
		return (new HttpWebServiceMessageSenderBuilder()
				.setConnectTimeout(Duration.ofMillis(this.connectionTimeout))
				.setReadTimeout(Duration.ofMillis(this.readTimeout))
				.build());
	}
	
}
