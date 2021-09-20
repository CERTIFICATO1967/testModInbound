package it.telecomitalia.trcs.middleware.kafka.inbound.dto;

public class SetSubscriberStatusXBean {
	private String phoneNumber;
	private String info;
	private String reason;
	private String oldReason;
	
	
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
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getOldReason() {
		return oldReason;
	}
	public void setOldReason(String oldReason) {
		this.oldReason = oldReason;
	}
	
}
