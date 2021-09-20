package it.telecomitalia.trcs.middleware.kafka.inbound.dto;

public class ChangeNumberResponseBean extends GenericResponseBean {
	
	private ChangeNumberDetail changeNumberDetail = null;
	
	public static class ChangeNumberDetail {
		private String phoneNumberOLO;

		public String getPhoneNumberOLO() {
			return phoneNumberOLO;
		}

		public void setPhoneNumberOLO(String phoneNumberOLO) {
			this.phoneNumberOLO = phoneNumberOLO;
		}
		
		
	}

	public ChangeNumberResponseBean(String destinationSystem,
			                        String phoneNumber, 
			                        String code, 
			                        String message,
			                        String phoneNumberOLO) {
		super(destinationSystem, phoneNumber, code, message);

		if (phoneNumberOLO!=null) {
			this.changeNumberDetail=new ChangeNumberDetail();
			this.changeNumberDetail.setPhoneNumberOLO(phoneNumberOLO);
		}
	}

	public ChangeNumberDetail getChangeNumberDetail() {
		return changeNumberDetail;
	}

	public void setChangeNumberDetail(ChangeNumberDetail changeNumberDetail) {
		this.changeNumberDetail = changeNumberDetail;
	}

	
}
