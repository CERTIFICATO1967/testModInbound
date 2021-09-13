package it.telecomitalia.middleware.ws.client.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import it.telecomitalia.soa.trcs.gateway.provisioning.ChangeCardRequest;
import it.telecomitalia.trcs.middleware.ws.client.GinoProvisioningClient;


@SpringBootApplication(scanBasePackages={"it.telecomitalia.trcs.middleware"})
public class ConsumingWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumingWebServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner lookup(GinoProvisioningClient client) {
		return args -> {

			ChangeCardRequest request = new ChangeCardRequest();
	
		};
	}

}
