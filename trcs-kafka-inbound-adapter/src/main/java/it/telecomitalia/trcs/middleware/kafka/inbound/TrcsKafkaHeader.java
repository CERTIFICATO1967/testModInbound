package it.telecomitalia.trcs.middleware.kafka.inbound;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public enum TrcsKafkaHeader {
	sourceSystem,
	channel,
	interactionDate,  // Da verificare perche' nel doc è riportato interactionDate-Date
	interactionTime,  // Da verificare perche' nel doc è riportato interactionDate-Time
	sessionID,
	businessID,
	transactionID,
	messageID,
	eventType;
	
	/**
	 * Metodo per la creazione dell'header di Response  
	 * 
	 * @param headers Header della richiesta
	 * @param responseEventType Identificativo del tipo di evento da utilizzare per la risposta
	 * 
	 * @return Restituisce la Map che rappresenta l'header da utilizzare per la risposta
	 */
	public static Map<String, String> createResponseKafkaHeader(Map<String, Object> headers, TrcsKafkaEventType responseEventType) {
		HashMap<String,String> result = new HashMap<>();
		LocalDateTime now = LocalDateTime.now();
		
		for (String key : headers.keySet()) {
			if (TrcsKafkaHeader.eventType.name().equals(key)) {
				result.put(key, responseEventType.name());
			} else if (TrcsKafkaHeader.interactionDate.name().equals(key)) {
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				result.put(key, formatter.format(now));
			} else if (TrcsKafkaHeader.interactionTime.name().equals(key)) {
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
				result.put(key, formatter.format(now));
			} else {
				result.put(key, headers.get(key).toString());
			}
			
		}
		
		return result;
	}
}
