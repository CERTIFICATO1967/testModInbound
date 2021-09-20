package it.telecomitalia.trcs.middleware.kafka.inbound.command;

import java.util.Map;

/**
 * Indica 
 * @author danlanzi
 *
 */
public class ExecutorSynchronousFailed extends Exception {

	private static final long serialVersionUID = -7477745311278947976L;

	private Object payloadObject;
	
	private String payload;
	
	private Map<String, String> header;
	
	private String topic;
	
	private String phoneNumber;

	public ExecutorSynchronousFailed(String topic, 
			                         Map<String,String> header,
			                         Object payloadObject,
			                         String payload,
			                         String phoneNumber) {
		super();
		this.payload = payload;
		this.header = header;
		this.topic = topic;
		this.phoneNumber=phoneNumber;
		this.payloadObject=payloadObject;
	}

	public String getPayload() {
		return payload;
	}

	public Map<String, String> getHeader() {
		return header;
	}

	public String getTopic() {
		return topic;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public Object getPayloadObject() {
		return payloadObject;
	}
	
	
}
