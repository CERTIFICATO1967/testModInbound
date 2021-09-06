package it.telecomitalia.trcs.middleware.kafka.inbound.command.impl;

import it.telecomitalia.trcs.middleware.kafka.inbound.ResponseTargets;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.TrcsInboundExecutor;
import it.telecomitalia.trcs.middleware.ws.client.OpscProvisioningClient;

public abstract class AbstractExecutor implements TrcsInboundExecutor {

	private OpscProvisioningClient client;
	private ResponseTargets reponseTargets;

	public AbstractExecutor(OpscProvisioningClient client, ResponseTargets responseTargets) {
		this.client = client;
		this.reponseTargets = responseTargets;
	}

	public OpscProvisioningClient getClient() {
		return client;
	}

	public ResponseTargets getReponseTargets() {
		return reponseTargets;
	}
	
	

}
