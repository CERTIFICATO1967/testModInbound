package it.telecomitalia.trcs.middleware.kafka.inbound.builder;

import java.io.StringWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import it.telecomitalia.soa.soap.soapheader.HeaderType;
import it.telecomitalia.soa.soap.soapheader.InteractionDateType;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.TrcsKafkaHeader;

/**
 * Builder per l'header dei WebServices esposti da TRCS-GW
 * 
 * @author danlanzi
 *
 */
public class HeaderTypeBuilder {

	private Map<String, Object> headerParams;
	
	public HeaderTypeBuilder(Map<String, Object> headerParams) {
		this.headerParams=headerParams;
	}
	
	public HeaderType build() {
		HeaderType header = new HeaderType();
		Object value;
		
		value = this.headerParams.get(TrcsKafkaHeader.businessID.name());
		header.setBusinessID("KAFKA@" + TrcsKafkaHeader.objectToString(value));
		
		value = this.headerParams.get(TrcsKafkaHeader.transactionID.name());
		header.setTransactionID(TrcsKafkaHeader.objectToString(value));
		
		//"<messageID>@<sessionID>@<sourceSystem>@<channel>".
		StringWriter writer = new StringWriter();
		value = this.headerParams.get(TrcsKafkaHeader.messageID.name());
		writer.write(TrcsKafkaHeader.objectToString(value));
		writer.write("@");
		value = this.headerParams.get(TrcsKafkaHeader.sessionID.name());
		writer.write(TrcsKafkaHeader.objectToString(value));
		writer.write("@");
		value = this.headerParams.get(TrcsKafkaHeader.sourceSystem.name());
		writer.write(TrcsKafkaHeader.objectToString(value));
		writer.write("@");
		value = this.headerParams.get(TrcsKafkaHeader.channel.name());
		writer.write(TrcsKafkaHeader.objectToString(value));
		
		header.setMessageID(TrcsKafkaHeader.objectToString(writer.toString()));

		value = this.headerParams.get(TrcsKafkaHeader.interactionDate.name());
		if (value!=null) {
			header.setInteractionDate(new InteractionDateType());
			header.getInteractionDate().setDate(TrcsKafkaHeader.objectToString(value));
			
			value = this.headerParams.get(TrcsKafkaHeader.interactionTime.name());
			header.getInteractionDate().setTime(TrcsKafkaHeader.objectToString(value));
		} else {
			LocalDateTime now = LocalDateTime.now();
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			
			header.setInteractionDate(new InteractionDateType());
			header.getInteractionDate().setDate(now.format(formatter));
			
			formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
			header.getInteractionDate().setTime(now.format(formatter));
		}
		
		value = this.headerParams.get(TrcsKafkaHeader.sourceSystem.name());
		header.setSourceSystem(TrcsKafkaHeader.objectToString(value));
		
		
		return header;
	}
	
	public static void main(String[] args) {
		System.out.println(String.valueOf(null));
	}
}
