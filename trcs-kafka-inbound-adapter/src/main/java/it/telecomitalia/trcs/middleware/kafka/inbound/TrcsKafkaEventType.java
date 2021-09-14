package it.telecomitalia.trcs.middleware.kafka.inbound;

public enum TrcsKafkaEventType {

	changeNumberRequest("lineeMobili.cambioNumero.v1"),
	changeNumberResponse("lineeMobili.responseCambioNumero.v1"),
	
	setSubscriberStatusXRequest("lineeMobili.bloccoSbloccoNumero.v1"),
	setSubscriberStatusXResponse("lineeMobili.responseBloccoSbloccoNumero.v1"),
	
	deleteSubscriberRequest("lineeMobili.cancellaUtenza.v1"),
	deleteSubscriberResponse("lineeMobili.responseCancellaUtenza.v1"),
	
	
	changeCardRequest("lineeMobili.cambioCarta.v1"),
	changeCardResponse("lineeMobili.responseCambioCarta.v1"),
	
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
