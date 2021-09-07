package it.telecomitalia.trcs.middleware.kafka.inbound;

public enum TrcsKafkaEventType {

	changeNumberRequest("lineeMobili.cambioNumero.v1"),
	changeNumberResponse("lineeMobili.responseCambioNumero.v1"),
	
	lockUnlockNumberRequest("lineeMobili.bloccoSbloccoNumero.v1"),
	lockUnlockNumberResponse("lineeMobili.responseBloccoSbloccoNumero.v1"),
	
	deleteSubscriberXRequest("lineeMobili.cancellaUtenza.v1"),
	deleteSubscriberXResponse("lineeMobili.responseCancellaUtenza.v1")
	;
	
	private String eventType;
	
	private TrcsKafkaEventType(String eventType) {
		this.eventType = eventType;
	}
	
	public String value() {
		return this.eventType;
	}
	
	public static TrcsKafkaEventType getInstance(String value) {
		
		for (TrcsKafkaEventType type : TrcsKafkaEventType.values()) {
			if (type.value().equals(value))
				return type;
		}
		
		throw new RuntimeException("Unkwon event Type [" + value + "]");
	}
}
