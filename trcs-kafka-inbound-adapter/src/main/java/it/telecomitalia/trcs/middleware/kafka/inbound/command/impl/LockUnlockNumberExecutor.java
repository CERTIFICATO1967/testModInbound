package it.telecomitalia.trcs.middleware.kafka.inbound.command.impl;

import java.util.Map;

import it.telecomitalia.trcs.middleware.kafka.inbound.command.TrcsInboundExecutor;
import it.telecomitalia.trcs.middleware.ws.client.OpscProvisioningClient;

public class LockUnlockNumberExecutor implements TrcsInboundExecutor {

	@Override
	public void execute(OpscProvisioningClient client, Map<String, Object> headers, String payload) {
		// TODO Auto-generated method stub

	}

}
