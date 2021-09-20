package it.telecomitalia.trcs.middleware.kafka.inbound.dto;

public class DeleteSubscriberRequestBean {
	
	
	private String phoneNumber;
	private String info;
	private String deleteType;
	private String reason;
	private String phoneNumberMnp;
	private boolean discountRecover;
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
	public String getDeleteType() {
		return deleteType;
	}
	public void setDeleteType(String deleteType) {
		this.deleteType = deleteType;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getPhoneNumberMnp() {
		return phoneNumberMnp;
	}
	public void setPhoneNumberMnp(String phoneNumberMnp) {
		this.phoneNumberMnp = phoneNumberMnp;
	}
	public boolean isDiscountRecover() {
		return discountRecover;
	}
	public void setDiscountRecover(boolean discountRecover) {
		this.discountRecover = discountRecover;
	}
	public String getTypeOfCard() {
		return typeOfCard;
	}
	public void setTypeOfCard(String typeOfCard) {
		this.typeOfCard = typeOfCard;
	}

	

}
