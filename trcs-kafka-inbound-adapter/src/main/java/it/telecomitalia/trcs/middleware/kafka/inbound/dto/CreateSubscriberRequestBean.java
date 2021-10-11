package it.telecomitalia.trcs.middleware.kafka.inbound.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CreateSubscriberRequestBean {
	private String phoneNumber;
	private String info;
	private String createType;
	private String imsi;
	private String iccid;
	private String typeOfCard;
	private String phase;
	private String features;
	private String languageId;
	private boolean fullMnp;
	private String numReloads;
	private String numBaseOfferChanges;
	private LocalDateTime lastBaseOfferChange;
	private LocalDateTime lastCreditUpdate;
	private LocalDateTime installationDate;
	private LocalDateTime activationDate;
	private LocalDateTime deactivationDate;
	private LocalDateTime expirationDate;
	private String activeTime;
	private String expiredReason;
	private boolean restoredFromExpired;
	private String baseOffer;
	private BigDecimal credit;
	private BigDecimal companyCredit;
	private BigDecimal bonus1;
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
	public String getCreateType() {
		return createType;
	}
	public void setCreateType(String createType) {
		this.createType = createType;
	}
	public String getImsi() {
		return imsi;
	}
	public void setImsi(String imsi) {
		this.imsi = imsi;
	}
	public String getIccid() {
		return iccid;
	}
	public void setIccid(String iccid) {
		this.iccid = iccid;
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
	public String getLanguageId() {
		return languageId;
	}
	public void setLanguageId(String languageId) {
		this.languageId = languageId;
	}
	public boolean isFullMnp() {
		return fullMnp;
	}
	public void setFullMnp(boolean fullMnp) {
		this.fullMnp = fullMnp;
	}
	public String getNumReloads() {
		return numReloads;
	}
	public void setNumReloads(String numReloads) {
		this.numReloads = numReloads;
	}
	public String getNumBaseOfferChanges() {
		return numBaseOfferChanges;
	}
	public void setNumBaseOfferChanges(String numBaseOfferChanges) {
		this.numBaseOfferChanges = numBaseOfferChanges;
	}
	public LocalDateTime getLastBaseOfferChange() {
		return lastBaseOfferChange;
	}
	public void setLastBaseOfferChange(LocalDateTime lastBaseOfferChange) {
		this.lastBaseOfferChange = lastBaseOfferChange;
	}
	public LocalDateTime getLastCreditUpdate() {
		return lastCreditUpdate;
	}
	public void setLastCreditUpdate(LocalDateTime lastCreditUpdate) {
		this.lastCreditUpdate = lastCreditUpdate;
	}
	public LocalDateTime getInstallationDate() {
		return installationDate;
	}
	public void setInstallationDate(LocalDateTime installationDate) {
		this.installationDate = installationDate;
	}
	public LocalDateTime getActivationDate() {
		return activationDate;
	}
	public void setActivationDate(LocalDateTime activationDate) {
		this.activationDate = activationDate;
	}
	public LocalDateTime getDeactivationDate() {
		return deactivationDate;
	}
	public void setDeactivationDate(LocalDateTime deactivationDate) {
		this.deactivationDate = deactivationDate;
	}
	public LocalDateTime getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(LocalDateTime expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getActiveTime() {
		return activeTime;
	}
	public void setActiveTime(String activeTime) {
		this.activeTime = activeTime;
	}
	public String getExpiredReason() {
		return expiredReason;
	}
	public void setExpiredReason(String expiredReason) {
		this.expiredReason = expiredReason;
	}
	public boolean isRestoredFromExpired() {
		return restoredFromExpired;
	}
	public void setRestoredFromExpired(boolean restoredFromExpired) {
		this.restoredFromExpired = restoredFromExpired;
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
	public BigDecimal getBonus1() {
		return bonus1;
	}
	public void setBonus1(BigDecimal bonus1) {
		this.bonus1 = bonus1;
	}
	public boolean isRifService() {
		return rifService;
	}
	public void setRifService(boolean rifService) {
		this.rifService = rifService;
	}
	


}
