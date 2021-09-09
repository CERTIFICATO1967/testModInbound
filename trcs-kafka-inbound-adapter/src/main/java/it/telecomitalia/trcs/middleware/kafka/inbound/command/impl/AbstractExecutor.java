package it.telecomitalia.trcs.middleware.kafka.inbound.command.impl;

import it.telecomitalia.trcs.middleware.kafka.inbound.ResponseTargets;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.TrcsInboundExecutor;
import it.telecomitalia.trcs.middleware.ws.client.GinoProvisioningClient;
import it.telecomitalia.trcs.middleware.ws.client.OpscProvisioningClient;

public abstract class AbstractExecutor implements TrcsInboundExecutor {

	private OpscProvisioningClient opscClient;
	private GinoProvisioningClient ginoClient;
	private ResponseTargets reponseTargets;

	public AbstractExecutor(OpscProvisioningClient opscClient, ResponseTargets responseTargets) {
		this.opscClient = opscClient;
		this.reponseTargets = responseTargets;
	}
	public AbstractExecutor(GinoProvisioningClient ginoClient, ResponseTargets responseTargets) {
		this.ginoClient = ginoClient;
		this.reponseTargets = responseTargets;
	}
	public OpscProvisioningClient getOpscClient() {
		return opscClient;
	}
	public GinoProvisioningClient getGinoClient() {
		return ginoClient;
	}
	public ResponseTargets getReponseTargets() {
		return reponseTargets;
	}
	
	

}
