package it.telecomitalia.trcs.middleware.kafka.inbound.command.impl.dto;

public abstract class GenericResponseBean {

	private String destinationSystem;
	
	private String phoneNumber;
	
	private String info;
		
	private String code;
	
	private String message;
	
	private String subsystemErrorCode;
	
	private String subsystemErrorMessage;

	
	public GenericResponseBean(String destinationSystem, String phoneNumber, String code, String message) {
		super();
		this.destinationSystem = destinationSystem;
		this.phoneNumber = phoneNumber;
		this.code = code;
		this.message = message;
	}
	
	public String getDestinationSystem() {
		return destinationSystem;
	}

	public void setDestinationSystem(String destinationSystem) {
		this.destinationSystem = destinationSystem;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSubsystemErrorCode() {
		return subsystemErrorCode;
	}

	public void setSubsystemErrorCode(String subsystemErrorCode) {
		this.subsystemErrorCode = subsystemErrorCode;
	}

	public String getSubsystemErrorMessage() {
		return subsystemErrorMessage;
	}

	public void setSubsystemErrorMessage(String subsystemErrorMessage) {
		this.subsystemErrorMessage = subsystemErrorMessage;
	}

}
