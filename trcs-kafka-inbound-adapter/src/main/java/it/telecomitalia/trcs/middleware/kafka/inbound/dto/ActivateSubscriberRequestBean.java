package it.telecomitalia.trcs.middleware.kafka.inbound.dto;

import java.math.BigDecimal;

public class ActivateSubscriberRequestBean {
	private String phoneNumber;
	private String info;
	private String typeOfCard;
	private String languageId;
	private String baseOffer;
	private BigDecimal credit;
	private BigDecimal companyCredit;
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
	public String getTypeOfCard() {
		return typeOfCard;
	}
	public void setTypeOfCard(String typeOfCard) {
		this.typeOfCard = typeOfCard;
	}
	public String getLanguageId() {
		return languageId;
	}
	public void setLanguageId(String languageId) {
		this.languageId = languageId;
	}
	public String getBaseOffer() {
		return baseOffer;
	}
	public void setBaseOffer(String baseOffer) {
		this.baseOffer = baseOffer;
	}
	public BigDecimal getCredit() {
		return credit;
	}
	public void setCredit(BigDecimal credit) {
		this.credit = credit;
	}
	public BigDecimal getCompanyCredit() {
		return companyCredit;
	}
	public void setCompanyCredit(BigDecimal companyCredit) {
		this.companyCredit = companyCredit;
	}
	public boolean isRifService() {
		return rifService;
	}
	public void setRifService(boolean rifService) {
		this.rifService = rifService;
	}
	


}
