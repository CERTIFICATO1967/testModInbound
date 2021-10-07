package it.telecomitalia.trcs.middleware.kafka.inbound.dto;

import java.math.BigDecimal;
import java.util.Date;



public class CreateSubscriberResponseBean  extends GenericResponseBean{
	
	
private CreateSubscriberDetail createSubscriberDetail = null;
	
	public static class CreateSubscriberDetail {
		
		
		private String createType;
		private String imsi;
		private String iccid;
		private Date creationDate;
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
		public Date getCreationDate() {
			return creationDate;
		}
		public void setCreationDate(Date creationDate) {
			this.creationDate = creationDate;
		}
		
		
		
	}

	public CreateSubscriberResponseBean(String destinationSystem,
			                        String phoneNumber, 
			                        String code, 
			                        String message,
			                        String createType,
			                        String iccid,
			                        String imsi,
			                        Date creationDate) {
		super(destinationSystem, phoneNumber, code, message);
		
		
		
		this.createSubscriberDetail=new CreateSubscriberDetail();
		this.createSubscriberDetail.setCreateType(createType);
		this.createSubscriberDetail.setIccid(iccid);
		this.createSubscriberDetail.setImsi(imsi);
		this.createSubscriberDetail.setCreationDate(creationDate);
		
		
		
		
		
		
		
	}

	public CreateSubscriberDetail getDeleteSubscriberDetail() {
		return createSubscriberDetail;
	}

	public void setDeleteSubscriberDetail(CreateSubscriberDetail createSubscriberDetail) {
		this.createSubscriberDetail = createSubscriberDetail;
	}

	

	

}
