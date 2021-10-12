package it.telecomitalia.trcs.middleware.kafka.inbound.dto;

public class ChangeSubscriberRequestBean {

	private String phoneNumber;
	private String info;
	private String migrationType;
	private String typeOfCard;
	private String baseOffer;
	private boolean rifService;
	
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
	public String getMigrationType() {
		return migrationType;
	}
	public void setMigrationType(String migrationType) {
		this.migrationType = migrationType;
	}
	public String getTypeOfCard() {
		return typeOfCard;
	}
	public void setTypeOfCard(String typeOfCard) {
		this.typeOfCard = typeOfCard;
	}
	public String getBaseOffer() {
		return baseOffer;
	}
	public void setBaseOffer(String baseOffer) {
		this.baseOffer = baseOffer;
	}
	public boolean isRifService() {
		return rifService;
	}
	public void setRifService(boolean rifService) {
		this.rifService = rifService;
	}

}
