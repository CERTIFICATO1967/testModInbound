package it.telecomitalia.trcs.middleware.kafka.inbound.builder;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import it.telecomitalia.soa.soap.soapheader.HeaderType;
import it.telecomitalia.soa.soap.soapheader.InteractionDateType;
import it.telecomitalia.trcs.middleware.kafka.inbound.TrcsKafkaHeader;

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
		header.setBusinessID(value!=null?String.valueOf(value):null);
		
		value = this.headerParams.get(TrcsKafkaHeader.transactionID.name());
		header.setTransactionID(value!=null?String.valueOf(value):null);
		
		value = this.headerParams.get(TrcsKafkaHeader.messageID.name());
		header.setMessageID(value!=null?String.valueOf(value):null);

		value = this.headerParams.get(TrcsKafkaHeader.interactionDate.name());
		if (value!=null) {
			header.setInteractionDate(new InteractionDateType());
			header.getInteractionDate().setDate(value!=null?String.valueOf(value):null);
			
			value = this.headerParams.get(TrcsKafkaHeader.interactionTime.name());
			header.getInteractionDate().setTime(value!=null?String.valueOf(value):null);
		} else {
			LocalDateTime now = LocalDateTime.now();
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			
			header.setInteractionDate(new InteractionDateType());
			header.getInteractionDate().setDate(now.format(formatter));
			
			formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
			header.getInteractionDate().setTime(now.format(formatter));
		}
		
		value = this.headerParams.get(TrcsKafkaHeader.sourceSystem.name());
		header.setSourceSystem(value!=null?String.valueOf(value):null);
		
		
		return header;
	}
	
	public static void main(String[] args) {
		System.out.println(String.valueOf(null));
	}
}
