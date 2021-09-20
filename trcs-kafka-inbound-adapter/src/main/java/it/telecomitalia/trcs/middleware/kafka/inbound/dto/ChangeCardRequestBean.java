package it.telecomitalia.trcs.middleware.kafka.inbound.dto;

public class ChangeCardRequestBean {
	private String phoneNumber;
	private String info;
	private boolean unblockSubscriber;
	private String imsiOld;
	private String imsiNew;
	private String iccidOld;
	private String iccidNew;
	private String typeOfCard;
	
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
	public boolean isUnblockSubscriber() {
		return unblockSubscriber;
	}
	public void setUnblockSubscriber(boolean unblockSubscriber) {
		this.unblockSubscriber = unblockSubscriber;
	}
	public String getImsiOld() {
		return imsiOld;
	}
	public void setImsiOld(String imsiOld) {
		this.imsiOld = imsiOld;
	}
	public String getImsiNew() {
		return imsiNew;
	}
	public void setImsiNew(String imsiNew) {
		this.imsiNew = imsiNew;
	}
	public String getIccidOld() {
		return iccidOld;
	}
	public void setIccidOld(String iccidOld) {
		this.iccidOld = iccidOld;
	}
	public String getIccidNew() {
		return iccidNew;
	}
	public void setIccidNew(String iccidNew) {
		this.iccidNew = iccidNew;
	}
	public String getTypeOfCard() {
		return typeOfCard;
	}
	public void setTypeOfCard(String typeOfCard) {
		this.typeOfCard = typeOfCard;
	}
	public String getPhase() {
		return phase;
	}
	public void setPhase(String phase) {
		this.phase = phase;
	}
	public String getFeatures() {
		return features;
	}
	public void setFeatures(String features) {
		this.features = features;
	}
	private String phase;
	private String features;


}
