package it.telecomitalia.trcs.middleware.kafka.inbound;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "kafka")
public class ResponseTargets {
	
	private Map<String, String> responses;
	
	public String getResponseTarget(TrcsKafkaEventType eventType) {
		switch (eventType) {
			case changeNumberRequest:
				return this.responses.get(TrcsKafkaEventType.changeNumberResponse.value());
				
			case lockUnlockNumberRequest:
				return this.responses.get(TrcsKafkaEventType.lockUnlockNumberResponse.value());
				
			case deleteSubscriberRequest:
				return this.responses.get(TrcsKafkaEventType.deleteSubscriberResponse.value());
				
			case changeCardRequest:
				return this.responses.get(TrcsKafkaEventType.changeCardResponse.value());
				
			default:
				return this.responses.get(eventType.value());
		}
	}
}
