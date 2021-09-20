package it.telecomitalia.trcs.middleware.kafka.inbound.dto;

import java.math.BigDecimal;



public class DeleteSubscriberResponseBean  extends GenericResponseBean{
	
	
private DeleteSubscriberDetail deleteSubscriberDetail = null;
	
	public static class DeleteSubscriberDetail {
		
		
		private String deleteType;
		private String reason;
		private String phoneNumberMnp;
		private boolean discountRecover;
		private BigDecimal credit;
		private BigDecimal	bonus1;
		
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
		public BigDecimal getCredit() {
			return credit;
		}
		public void setCredit(BigDecimal credit) {
			this.credit = credit;
		}
		public BigDecimal getBonus1() {
			return bonus1;
		}
		public void setBonus1(BigDecimal bonus1) {
			this.bonus1 = bonus1;
		}

		
	}

	public DeleteSubscriberResponseBean(String destinationSystem,
			                        String phoneNumber, 
			                        String code, 
			                        String message,
			                        String deleteType,
			                        String reason,
			                        String phoneNumberMnp,
			                        boolean discountRecover ,
			                        BigDecimal credit,
			                        BigDecimal bonus1) {
		super(destinationSystem, phoneNumber, code, message);
		
		
		
		this.deleteSubscriberDetail=new DeleteSubscriberDetail();
		this.deleteSubscriberDetail.setDeleteType(deleteType);
		this.deleteSubscriberDetail.setReason(reason);
		this.deleteSubscriberDetail.setPhoneNumberMnp(phoneNumberMnp);
		this.deleteSubscriberDetail.setDiscountRecover(discountRecover);
		this.deleteSubscriberDetail.setCredit(credit);
		this.deleteSubscriberDetail.setBonus1(bonus1);
		
		
		
	}

	public DeleteSubscriberDetail getDeleteSubscriberDetail() {
		return deleteSubscriberDetail;
	}

	public void setDeleteSubscriberDetail(DeleteSubscriberDetail deleteSubscriberDetail) {
		this.deleteSubscriberDetail = deleteSubscriberDetail;
	}

	

	

}
