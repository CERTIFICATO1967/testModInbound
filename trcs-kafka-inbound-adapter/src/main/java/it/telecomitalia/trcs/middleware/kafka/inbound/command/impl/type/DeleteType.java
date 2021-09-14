package it.telecomitalia.trcs.middleware.kafka.inbound.command.impl.type;

public enum DeleteType {

	Normal,
	GoodByeService,
	
	Mnp,
	MnpMvno,
	
	EbuRollbackDelete,
	EbuRollbackPreinstalled,
	
	
	MnpOnDeletedSubscriber,
	MnpDeactivationOnDeletedSubscriber,
	
	;
	
	
}

