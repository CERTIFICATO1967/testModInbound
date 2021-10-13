package it.telecomitalia.trcs.middleware.kafka.inbound.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

public class ReloadSubscriberRequestBean {
	
	private String phoneNumber;
	private BigDecimal reloadValue;
	//@JsonDeserialize(using = LocalDateDeserializer.class)
	//@JsonSerialize(using = LocalDateSerializer.class)
	//@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private String payDate;
	private String activeTime;
	private String dispatcherOperationType;
	private String clientOperationType;
	private String abiCode;
	private String cabCode;
	private String reloadServiceId;
	private String dealerServiceId;
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public BigDecimal getReloadValue() {
		return reloadValue;
	}
	public void setReloadValue(BigDecimal reloadValue) {
		this.reloadValue = reloadValue;
	}
	public String getPayDate() {
		return payDate;
	}
	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}
	public String getActiveTime() {
		return activeTime;
	}
	public void setActiveTime(String activeTime) {
		this.activeTime = activeTime;
	}
	public String getDispatcherOperationType() {
		return dispatcherOperationType;
	}
	public void setDispatcherOperationType(String dispatcherOperationType) {
		this.dispatcherOperationType = dispatcherOperationType;
	}
	public String getClientOperationType() {
		return clientOperationType;
	}
	public void setClientOperationType(String clientOperationType) {
		this.clientOperationType = clientOperationType;
	}
	public String getAbiCode() {
		return abiCode;
	}
	public void setAbiCode(String abiCode) {
		this.abiCode = abiCode;
	}
	public String getCabCode() {
		return cabCode;
	}
	public void setCabCode(String cabCode) {
		this.cabCode = cabCode;
	}
	public String getReloadServiceId() {
		return reloadServiceId;
	}
	public void setReloadServiceId(String reloadServiceId) {
		this.reloadServiceId = reloadServiceId;
	}
	public String getDealerServiceId() {
		return dealerServiceId;
	}
	public void setDealerServiceId(String dealerServiceId) {
		this.dealerServiceId = dealerServiceId;
	}

	


}
