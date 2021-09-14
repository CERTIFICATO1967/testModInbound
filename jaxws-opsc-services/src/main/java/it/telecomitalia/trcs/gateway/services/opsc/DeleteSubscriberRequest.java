package it.telecomitalia.trcs.gateway.services.opsc;

import java.io.Serializable;

import it.telecomitalia.soa.trcs.gateway.infobus.commons.InfobusMessage;

public class DeleteSubscriberRequest extends InfobusMessage {

	public static class Payload implements Serializable {

		private static final long serialVersionUID = 4043551488538867586L;

		public enum OperationType {
			volontary("0"),
			goodbye("1"),
			mnp("2"),
			mnp2mvno("8"),
			deadMnp("B"),
			withAutoreload("C");

			private String value;

			private OperationType(String value) {
				this.value=value;
			}

			public String getValue() {
				return value;
			}
			
			public static OperationType parse(String value) {
				for (OperationType result : OperationType.values()) {
					if (result.getValue().equals(value))
						return result;
				}
				
				throw new IllegalArgumentException("OperationType [" + value + "] is unknown");
			}
		}

		private String subSystem;

		private OperationType operationType;

		private String msisdn;

		private String astState;

		private Integer rSystem;

		private String srnb;

		private String mnpMsisdn;

		private String oloMsisdn;

		private String typeOfCard;

		public String getSubSystem() {
			return subSystem;
		}

		public void setSubSystem(String subSystem) {
			this.subSystem = subSystem;
		}

		public OperationType getOperationType() {
			return operationType;
		}

		public void setOperationType(OperationType operationType) {
			this.operationType = operationType;
		}

		public String getMsisdn() {
			return msisdn;
		}

		public void setMsisdn(String msisdn) {
			this.msisdn = msisdn;
		}

		public String getAstState() {
			return astState;
		}

		public void setAstState(String astState) {
			this.astState = astState;
		}

		public Integer getrSystem() {
			return rSystem;
		}

		public void setrSystem(Integer rSystem) {
			this.rSystem = rSystem;
		}

		public String getSrnb() {
			return srnb;
		}

		public void setSrnb(String srnb) {
			this.srnb = srnb;
		}

		public String getMnpMsisdn() {
			return mnpMsisdn;
		}

		public void setMnpMsisdn(String mnpMsisdn) {
			this.mnpMsisdn = mnpMsisdn;
		}

		public String getOloMsisdn() {
			return oloMsisdn;
		}

		public void setOloMsisdn(String oloMsisdn) {
			this.oloMsisdn = oloMsisdn;
		}

		public String getTypeOfCard() {
			return typeOfCard;
		}

		public void setTypeOfCard(String typeOfCard) {
			this.typeOfCard = typeOfCard;
		}

	};

	private Payload payload;

	private DeleteSubscriberRequest(InfobusMessage message) {
		this.ibAppDep1=message.getIbAppDep1();
		this.ibAppDep2=message.getIbAppDep2();
		this.ibIdSrvc=message.getIbIdSrvc();
		this.ibRetCode=message.getIbRetCode();
		this.ibData = message.getIbData();		
	}

	public Payload getPayload() {
		return payload;
	}

	/**
	 * Metodo da invocare per estrarre i dati dal formato FLAT ricevuto 
	 * 
	 * @param ibData
	 * @throws IllegalArgumentException
	 */
	private void parseData(String ibData) throws IllegalArgumentException {

		this.payload=new Payload();
		
		if (ibData.length()<62)
			throw new IllegalArgumentException("Payload too short");
		
		int index=0;
		int length=10;
		
		this.payload.setSubSystem(ibData.substring(index, index+length).trim());
		
		index+=length;
		length=1;
		this.payload.setOperationType(Payload.OperationType.parse(ibData.substring(index, index+length)));

		index+=length;
		length=12;
		this.payload.setMsisdn(ibData.substring(index, index+length).trim());
		if (this.payload.getMsisdn().length()==0)
			throw new IllegalArgumentException("MSISDN is mandatory");

		index+=length;
		length=1;
		this.payload.setAstState(ibData.substring(index, index+length).trim());
		if (this.payload.getAstState().length()==0)
			throw new IllegalArgumentException("AST-STATE is mandatory");
		
		index+=length;
		length=1;
		try {
			this.payload.setrSystem(Integer.parseInt(ibData.substring(index, index+length)));
		} catch (Exception e) {
			throw  new IllegalArgumentException("R-System [" + ibData.substring(index, index+length) + "] is not valid");
		}
		
		index+=length;
		length=11;
		this.payload.setSrnb(ibData.substring(index, index+length).trim());
		
		index+=length;
		length=12;
		this.payload.setMnpMsisdn(ibData.substring(index, index+length).trim());
		
		index+=length;
		length=12;
		this.payload.setOloMsisdn(ibData.substring(index, index+length).trim());

		index+=length;
		length=2;
		this.payload.setTypeOfCard(ibData.substring(index, index+length).trim());
	}

	
	public static DeleteSubscriberRequest createInstance(InfobusMessage message) {
		DeleteSubscriberRequest result = new DeleteSubscriberRequest(message);

		result.parseData(message.getIbData().getValue());

		return result;
	}
}
