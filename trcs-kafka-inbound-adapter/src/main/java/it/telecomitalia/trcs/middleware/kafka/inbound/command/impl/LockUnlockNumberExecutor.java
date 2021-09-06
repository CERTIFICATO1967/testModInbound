package it.telecomitalia.trcs.middleware.kafka.inbound.command.impl;

import java.util.Map;

import it.telecomitalia.trcs.middleware.kafka.inbound.ResponseTargets;
import it.telecomitalia.trcs.middleware.ws.client.OpscProvisioningClient;

public class LockUnlockNumberExecutor extends AbstractExecutor {

	
	public LockUnlockNumberExecutor(OpscProvisioningClient client, ResponseTargets responseTargets) {
		super(client, responseTargets);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(Map<String, Object> headers, String payload) {
		// TODO Auto-generated method stub

	}

}
