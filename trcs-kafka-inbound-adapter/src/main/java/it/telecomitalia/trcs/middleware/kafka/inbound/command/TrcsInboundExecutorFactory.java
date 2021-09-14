package it.telecomitalia.trcs.middleware.kafka.inbound.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.telecomitalia.trcs.middleware.kafka.inbound.ResponseTargets;
import it.telecomitalia.trcs.middleware.kafka.inbound.TrcsKafkaEventType;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.impl.ChangeCardExecutor;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.impl.ChangeNumberExecutor;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.impl.DeleteSubscriberExecutor;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.impl.LockUnlockNumberExecutor;
import it.telecomitalia.trcs.middleware.ws.client.OpscProvisioningClient;
import it.telecomitalia.trcs.middleware.ws.client.GinoProvisioningClient;

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
			case  changeNumberRequest:
				return new ChangeNumberExecutor(opscProvisioningClient, responseTargets);
			case lockUnlockNumberRequest:
				return new LockUnlockNumberExecutor(opscProvisioningClient, responseTargets);
			case  deleteSubscriberRequest:
				
				return new DeleteSubscriberExecutor(opscProvisioningClient, responseTargets);
			case  changeCardRequest:
				return new ChangeCardExecutor(ginoProvisioningClient, responseTargets);
			default:
				throw new RuntimeException("Invalid Event Type [" + eventType.value() + "]");
		}
	}
}