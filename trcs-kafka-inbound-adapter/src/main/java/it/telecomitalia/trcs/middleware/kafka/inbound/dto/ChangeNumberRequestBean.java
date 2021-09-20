package it.telecomitalia.trcs.middleware.kafka.inbound.dto;

public class ChangeNumberRequestBean {

	private String phoneNumber;
	
	private String info;
	
	private String phoneNumberOLO;
	
	private String typeOfCard;
	
	private String typeOfCustomer;
	
	private String baseOffer;

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

	public String getPhoneNumberOLO() {
		return phoneNumberOLO;
	}

	public void setPhoneNumberOLO(String phoneNumberOLO) {
		this.phoneNumberOLO = phoneNumberOLO;
	}

	public String getTypeOfCard() {
		return typeOfCard;
	}

	public void setTypeOfCard(String typeOfCard) {
		this.typeOfCard = typeOfCard;
	}

	public String getTypeOfCustomer() {
		return typeOfCustomer;
	}

	public void setTypeOfCustomer(String typeOfCustomer) {
		this.typeOfCustomer = typeOfCustomer;
	}

	public String getBaseOffer() {
		return baseOffer;
	}

	public void setBaseOffer(String baseOffer) {
		this.baseOffer = baseOffer;
	}
	
	
}
