package it.telecomitalia.trcs.middleware.kafka.inbound.dto;

import it.telecomitalia.trcs.middleware.kafka.inbound.dto.ChangeNumberResponseBean.ChangeNumberDetail;


public class ActivateSubscriberResponseBean extends GenericResponseBean {
	
	private ActivateSubscriberDetail activateSubscriberDetail = null;
	
	public static class ActivateSubscriberDetail {
		
		
		private String imsi;
		private String iccid;
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
		
	
	}

	public ActivateSubscriberResponseBean(String destinationSystem,
			                        String phoneNumber, 
			                        String code, 
			                        String message,
			                        String imsi,
			                        String iccid) {
		super(destinationSystem, phoneNumber, code, message);
		this.activateSubscriberDetail=new ActivateSubscriberDetail();
		this.activateSubscriberDetail.setImsi(imsi);
		this.activateSubscriberDetail.setIccid(iccid);
		
	}

	public ActivateSubscriberDetail getActivateSubscriberDetail() {
		return activateSubscriberDetail;
	}

	public void setActivateSubscriberDetail(ActivateSubscriberDetail activateSubscriberDetail) {
		this.activateSubscriberDetail = activateSubscriberDetail;
	}

	

	
}
