package it.telecomitalia.trcs.middleware.kafka.inbound;

public enum TrcsKafkaHeader {
	sourceSystem,
	channel,
	interactionDate,  // Da verificare perche' nel doc è riportato interactionDate-Date
	interactionTime,  // Da verificare perche' nel doc è riportato interactionDate-Time
	sessionID,
	businessID,
	transactionID,
	messageID,
	eventType
}
