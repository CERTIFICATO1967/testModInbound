package it.telecomitalia.trcs.middleware.kafka.inbound.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.telecomitalia.trcs.middleware.kafka.inbound.command.impl.ActivateSubscriberExecutor;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.impl.ChangeCardExecutor;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.impl.ChangeNumberExecutor;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.impl.ChangeSubscriberExecutor;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.impl.CreateSubscriberExecutor;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.impl.DeleteSubscriberExecutor;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.impl.SetSubscriberStatusXExecutor;
import it.telecomitalia.trcs.middleware.kafka.inbound.config.ResponseTargets;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.TrcsKafkaEventType;
import it.telecomitalia.trcs.middleware.ws.client.GinoProvisioningClient;
import it.telecomitalia.trcs.middleware.ws.client.OpscProvisioningClient;

@Component
public class TrcsInboundExecutorFactory {
	
	@Autowired
	OpscProvisioningClient opscProvisioningClient;
	
	@Autowired
	GinoProvisioningClient ginoProvisioningClient;
	
	@Autowired
	ResponseTargets responseTargets;
	

	public TrcsInboundExecutor createInstance(TrcsKafkaEventType eventType) {
		switch (eventType) {
			case changeNumberRequest:
				return new ChangeNumberExecutor(opscProvisioningClient, responseTargets);
			case setSubscriberStatusXRequest:
				return new SetSubscriberStatusXExecutor(opscProvisioningClient, responseTargets);
			case deleteSubscriberRequest:
				return new DeleteSubscriberExecutor(opscProvisioningClient, responseTargets);
			case changeCardRequest:
				return new ChangeCardExecutor(ginoProvisioningClient, responseTargets);
			case createSubscriberRequest:
				return new CreateSubscriberExecutor(opscProvisioningClient, responseTargets);	
			case changeSubscriberRequest:
				return new ChangeSubscriberExecutor(ginoProvisioningClient, responseTargets);
			case activateSubscriberRequest:
				return new ActivateSubscriberExecutor(opscProvisioningClient, responseTargets);	
				
			default:
				throw new RuntimeException("Invalid Event Type [" + eventType.value() + "]");
		}
	}
}