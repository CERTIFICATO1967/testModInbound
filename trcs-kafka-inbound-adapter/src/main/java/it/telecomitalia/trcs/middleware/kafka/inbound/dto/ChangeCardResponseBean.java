package it.telecomitalia.trcs.middleware.kafka.inbound.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class ChangeCardResponseBean extends GenericResponseBean {
	
	private ChangeCardDetail changeCardDetail = null;
	
	public static class ChangeCardDetail {
		
		
		private String imsiOld;
		private String imsiNew;
		private String iccidOld;
		private String iccidNew;
		
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

			
		
	}

	public ChangeCardResponseBean(String destinationSystem,
			                        String phoneNumber, 
			                        String code, 
			                        String message,
			                        String imsiOld,String imsiNew,String iccidOld ,String iccidNew) {
		super(destinationSystem, phoneNumber, code, message);
		this.changeCardDetail=new ChangeCardDetail();
		this.changeCardDetail.setImsiOld(imsiOld);
		this.changeCardDetail.setImsiNew(imsiNew);
		this.changeCardDetail.setIccidOld(iccidOld);
		this.changeCardDetail.setIccidNew(iccidNew);
		
		
	}

	public ChangeCardDetail getChangeCardDetail() {
		return changeCardDetail;
	}

	public void setChangeCardDetail(ChangeCardDetail changeCardDetail) {
		this.changeCardDetail = changeCardDetail;
	}

	

	
}
