package it.telecomitalia.trcs.middleware.kafka.inbound.logging;

import java.io.StringWriter;
import java.text.DecimalFormat;

public enum InboundLogMessages {

	SUCCESS(1,"<{}> Message sent successfull"),
	INVALID_MESSAGE(2, "<{}> Message not valid. Discard it"),
	FAILURE_ON_GATEWAY(3, "<{}> Target WebService failed on Gateway. Error Response sent"), 
	FAILURE_RETRY(4, "<{}> Error during Event handling. Retry Later"),
	;
	
	private static final String PREFIX="KAFKA_INBOUND";
	
	private int code;
	
	private String message;
	
	
	private InboundLogMessages(int code, String message) {
		this.code=code;
		this.message=message;
	}


	public String getCode() {
		DecimalFormat formatter = new DecimalFormat("0000");
		StringWriter message = new StringWriter();
		
		message.write(PREFIX);
		message.write("-");
		message.write(formatter.format(code));
		
		return message.toString();
	}


	public String getMessage() {
		return message;
	}
	
	
}
