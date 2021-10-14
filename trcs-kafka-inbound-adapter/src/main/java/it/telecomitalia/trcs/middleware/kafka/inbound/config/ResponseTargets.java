package it.telecomitalia.trcs.middleware.kafka.inbound.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import it.telecomitalia.trcs.middleware.kafka.inbound.dto.TrcsKafkaEventType;

@Configuration
@ConfigurationProperties(prefix = "kafka")
@EnableConfigurationProperties
public class ResponseTargets {

	private Map<String, String> responses = new HashMap<>();
	
	
	public String getResponseTarget(TrcsKafkaEventType eventType) {
		switch (eventType) {
			case changeNumberRequest:
				return this.responses.get(TrcsKafkaEventType.changeNumberResponse.value());
			case blockUnblockRequest:
				return this.responses.get(TrcsKafkaEventType.blockUnblockResponse.value());
			case deleteSubscriberRequest:
				return this.responses.get(TrcsKafkaEventType.deleteSubscriberResponse.value());
			case changeCardRequest:
				return this.responses.get(TrcsKafkaEventType.changeCardResponse.value());
			case createSubscriberRequest:
				return this.responses.get(TrcsKafkaEventType.createSubscriberResponse.value());
			case changeSubscriberRequest:
				return this.responses.get(TrcsKafkaEventType.changeSubscriberResponse.value());
			case reloadSubscriberRequest:
				return this.responses.get(TrcsKafkaEventType.changeCardResponse.value());
			case activateSubscriberRequest:
				return this.responses.get(TrcsKafkaEventType.activateSubscriberResponse.value());
			default:
				return this.responses.get(eventType.value());
		}
	}
	

	public Map<String, String> getResponses() {
		return responses;
	}

	public void setResponses(Map<String, String> responses) {
		this.responses = responses;
	}
	
	
}
