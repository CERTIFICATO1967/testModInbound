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
public class GinoRechargeClientConfig {

	
	@Value("${trcs.gateway.services.gino-recharge.address:http://localhost:8090/gateway/recharge}")
	private String defaultUri;
	
	@Value("${trcs.gateway.services.gino-recharge.timeout-connection}")
	private int connectionTimeout;
	
	@Value("${trcs.gateway.services.gino-recharge.timeout-read:1000}")
	private int readTimeout;


	@Bean
	public GinoRechargeClient ginoRechargeClient(@Qualifier("ginoRechargeJaxb2Marshaller") Jaxb2Marshaller marshaller) {
		GinoRechargeClient client = new GinoRechargeClient();
		client.setDefaultUri(this.defaultUri);
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		
		client.setMessageSender(webServiceMessageSenderGinoRecharge());

		return client;
	}

	@Bean(name="ginoRechargeJaxb2Marshaller")
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        String[] packagesToScan= {"it.telecomitalia.soa.soap.soapheader",
        		                  "it.telecomitalia.soa.trcs.gateway.recharge",
        		                  "it.telecomitalia.soa.trcs.gateway.recharge.commons"};
        marshaller.setPackagesToScan(packagesToScan);
        return marshaller;
    }
	@Bean
	public WebServiceMessageSender webServiceMessageSenderGinoRecharge() {
		
		return (new HttpWebServiceMessageSenderBuilder()
				.setConnectTimeout(Duration.ofMillis(this.connectionTimeout))
				.setReadTimeout(Duration.ofMillis(this.readTimeout))
				.build());
	}
	
}
