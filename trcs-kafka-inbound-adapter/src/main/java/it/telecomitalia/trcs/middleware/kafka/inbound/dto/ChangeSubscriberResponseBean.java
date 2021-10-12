package it.telecomitalia.trcs.middleware.kafka.inbound.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class ChangeSubscriberResponseBean extends GenericResponseBean {
	
	private ChangeSubscriberDetail ChangeSubscriberDetail = null;
	
	public static class ChangeSubscriberDetail {
		
		private String migrationType;
		private BigDecimal credit;
		private BigDecimal companyCredit;
		private BigDecimal oldCredit;
		private BigDecimal oldCompanyCredit;
		
		public String getMigrationType() {
			return migrationType;
		}
		public void setMigrationType(String migrationType) {
			this.migrationType = migrationType;
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
		public BigDecimal getOldCredit() {
			return oldCredit;
		}
		public void setOldCredit(BigDecimal oldCredit) {
			this.oldCredit = oldCredit;
		}
		public BigDecimal getOldCompanyCredit() {
			return oldCompanyCredit;
		}
		public void setOldCompanyCredit(BigDecimal oldCompanyCredit) {
			this.oldCompanyCredit = oldCompanyCredit;
		}
		
	}

	public ChangeSubscriberResponseBean(String destinationSystem,
			                        String phoneNumber, 
			                        String code, 
			                        String message,
			                        String migrationType, BigDecimal credit, BigDecimal companyCredit, BigDecimal oldCredit, BigDecimal oldCompanyCredit) {
		super(destinationSystem, phoneNumber, code, message);
		this.ChangeSubscriberDetail=new ChangeSubscriberDetail();
		this.ChangeSubscriberDetail.setMigrationType(migrationType);
		this.ChangeSubscriberDetail.setCredit(credit);
		this.ChangeSubscriberDetail.setCompanyCredit(companyCredit);
		this.ChangeSubscriberDetail.setOldCredit(oldCredit);
		this.ChangeSubscriberDetail.setOldCompanyCredit(oldCompanyCredit);
		
		
	}

	public ChangeSubscriberDetail getChangeSubscriberDetail() {
		return ChangeSubscriberDetail;
	}

	public void setChangeSubscriberDetail(ChangeSubscriberDetail ChangeSubscriberDetail) {
		this.ChangeSubscriberDetail = ChangeSubscriberDetail;
	}

	

	
}
