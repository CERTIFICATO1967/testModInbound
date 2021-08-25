package it.telecomitalia.trcs.middleware.kafka.inbound.command;

import it.telecomitalia.trcs.middleware.kafka.inbound.TrcsKafkaEventType;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.impl.ChangeNumberExecutor;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.impl.LockUnlockNumberExecutor;

public class TrcsInboundExecutorFactory {

	public static TrcsInboundExecutor createInstance(TrcsKafkaEventType eventType) {
		switch (eventType) {
			case  changeNumberRequest:
				return new ChangeNumberExecutor();
	
			case lockUnlockNumberRequest:
				return new LockUnlockNumberExecutor();
	
			default:
				throw new RuntimeException("Invalid Event Type [" + eventType.value() + "]");
		}
	}
}