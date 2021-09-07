package it.telecomitalia.trcs.middleware.kafka.inbound.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.telecomitalia.trcs.middleware.kafka.inbound.ResponseTargets;
import it.telecomitalia.trcs.middleware.kafka.inbound.TrcsKafkaEventType;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.impl.ChangeNumberExecutor;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.impl.DeleteSubscriberXExecutor;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.impl.LockUnlockNumberExecutor;
import it.telecomitalia.trcs.middleware.ws.client.OpscProvisioningClient;

@Component
public class TrcsInboundExecutorFactory {
	
	@Autowired
	OpscProvisioningClient opscProvisioningClient;
	
	@Autowired
	ResponseTargets responseTargets;

	public TrcsInboundExecutor createInstance(TrcsKafkaEventType eventType) {
		switch (eventType) {
			case  changeNumberRequest:
				return new ChangeNumberExecutor(opscProvisioningClient, responseTargets);
	
			case lockUnlockNumberRequest:
				return new LockUnlockNumberExecutor(opscProvisioningClient, responseTargets);
			case  deleteSubscriberXRequest:
				return new DeleteSubscriberXExecutor(opscProvisioningClient, responseTargets);
			default:
				throw new RuntimeException("Invalid Event Type [" + eventType.value() + "]");
		}
	}
}