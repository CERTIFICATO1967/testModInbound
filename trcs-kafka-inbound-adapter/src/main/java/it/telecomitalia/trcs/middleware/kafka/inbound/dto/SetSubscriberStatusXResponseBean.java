package it.telecomitalia.trcs.middleware.kafka.inbound.dto;



public class SetSubscriberStatusXResponseBean extends GenericResponseBean {
	
	private BlockUnblockDetail blockUnblockDetail = null;
	
	public static class BlockUnblockDetail {
		
		
		private String reason;
		private String oldReason;
		
		
		
		public String getOldReason() {
			return oldReason;
		}
		public void setOldReason(String oldReason) {
			this.oldReason = oldReason;
		}
		public String getReason() {
			return reason;
		}
		public void setReason(String reason) {
			this.reason = reason;
		}
		
		
	}

	

	public SetSubscriberStatusXResponseBean(String destinationSystem,
			                        String phoneNumber, 
			                        String code, 
			                        String message,
			                        String reason,String oldReason) {
		super(destinationSystem, phoneNumber, code, message);
		this.blockUnblockDetail=new BlockUnblockDetail();
		this.blockUnblockDetail.setReason(oldReason);
		this.blockUnblockDetail.setOldReason(oldReason);
		
		
		
	}

	
	public BlockUnblockDetail getBlockUnblockDetail() {
		return blockUnblockDetail;
	}

	public void setBlockUnblockDetail(BlockUnblockDetail blockUnblockDetail) {
		this.blockUnblockDetail = blockUnblockDetail;
	}
	

	

	
}
