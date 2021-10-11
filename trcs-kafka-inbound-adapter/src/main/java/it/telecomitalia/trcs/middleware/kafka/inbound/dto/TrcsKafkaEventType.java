package it.telecomitalia.trcs.middleware.kafka.inbound.dto;

public enum TrcsKafkaEventType {

	changeNumberRequest("lineeMobili.cambioNumero.v1"),
	changeNumberResponse("lineeMobili.responseCambioNumero.v1"),
	
	setSubscriberStatusXRequest("lineeMobili.bloccoSbloccoNumero.v1"),
	setSubscriberStatusXResponse("lineeMobili.responseBloccoSbloccoNumero.v1"),
	
	deleteSubscriberRequest("lineeMobili.cancellaUtenza.v1"),
	deleteSubscriberResponse("lineeMobili.responseCancellaUtenza.v1"),
	
	
	changeCardRequest("lineeMobili.cambioCarta.v1"),
	changeCardResponse("lineeMobili.responseCambioCarta.v1"),
	
	createSubscriberRequest("lineeMobili.creaUtenza.v1"),
	createSubscriberResponse("lineeMobili.responseCreaUtenza.v1"),
	
	reloadSubscriberRequest("lineeMobili.ricaricaUtenza.v1"),

	activateSubscriberRequest("lineeMobili.attivazioneUtenza.v1"),
	activateSubscriberResponse("lineeMobili.responseAttivazioneUtenza.v1"),

	changeSubscriberRequest("lineeMobili.cambioUtenza.v1"),
	changeSubscriberResponse("lineeMobili.responseCambioUtenza.v1"),
	
	
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
