package it.telecomitalia.trcs.middleware.kafka.inbound.logging;

public enum InboundLogMessages {

	SUCCESS(1,"<{}> Message sent successfull"),
	INVALID_MESSAGE(2, "<{}> Message not valid. Discard it"),
	FAILURE_ON_GATEWAY(3, "<{}> Target WebService failed on Gateway. Error Response sent"), 
	FAILURE_RETRY(4, "<{}> Error during Event handling. Retry Later"),
	;
	
	private int code;
	
	private String message;
	
	
	private InboundLogMessages(int code, String message) {
		this.code=code;
		this.message=message;
	}


	public int getCode() {
		return code;
	}


	public String getMessage() {
		return message;
	}
	
	
}
