package it.telecomitalia.trcs.gateway.services.opsc;

import java.io.Serializable;

import it.telecomitalia.soa.trcs.gateway.infobus.commons.InfobusMessage;
import it.telecomitalia.trcs.gateway.services.opsc.DeleteSubscriberRequest.Payload;
import it.telecomitalia.trcs.gateway.services.opsc.DeleteSubscriberRequest.Payload.OperationType;
import it.telecomitalia.trcs.gateway.services.opsc.util.ProvisioningOpscUtil;

/**
 * Java Bean che gestisce il contenuto IB_DATA del servizio RestoreSubscriber
 * 
 * @author s232297
 *
 */
public class RestoreSubscriberRequest extends InfobusMessage {

	private static final long serialVersionUID = 8166849252644335813L;


	public static class Payload implements Serializable {

		private static final long serialVersionUID = -4497345462701007793L;

		public enum OperationType {
			Normal("0"),
			NumPortSubscr("1"),
			MnpSubscr("2"),
			Restore("3"),
			ExpSubscr("4");

			private String value;

			private OperationType(String value) {
				this.value=value;
			}

			public String getValue() {
				return value;
			}

			public static OperationType parse(String value) {
				for (OperationType result : OperationType.values()) {
					if (result.getValue().equals(value)) {						
						return result;
					}
				}

				throw new IllegalArgumentException("OperationType [" + value + "] is unknown");
			}

			public static OperationType parseName(String value) {
				for (OperationType result : OperationType.values()) {
					if (result.name().equals(value)) {						
						return result;
					}
				}

				throw new IllegalArgumentException("OperationType [" + value + "] is unknown");
			}
		}

		private String subSystem;


		private OperationType operationType;

		private String msisdn;

		private String iccid;

		private String imsi;

		private String pin;

		private String puk;

		private String pin2; 

		private String puk2;

		private String category;

		private String debit;

		private long tariffid;

		private String languageid;

		private String aststate;

		private String servicesproviderid;

		private String installdate;

		private String activedate;

		private String deactivated;
		               
		private String deactivedate;

		private String expirydate;

		private String expiredreason;

		private String informedmessageid;

		private String numreloads;

		private String numchangetariff;

		private String changetariffdate;

		private String lastcalldate;

		private String typeofcard;

		private String cardphase;

		private String accessorycode;

		private String districtid;

		private String numdistricts;

		private String changedistrictdate;

		private String r_system;

		private String numbilledsms;

		private String numfreesms;

		private String accessoryedate;

		private String debitco;

		private String bonus1;

		private String bonus2;

		private String numfreeseconds;

		private String cardfeatures;

		private String servcardedate2;

		private String services;

		private String servcardedate5;

		private String servcardedate1;

		private String servcardedate3;

		private String servcard;

		private String servcardedate4;


		private String activetime;

		private String deactivetime;

		private String retbonus;

		private String typeofbonus;

		private String typeoflist;

		private String retbonusedate;

		private String servcard_edate6;

		private String accessorycode_edate1;

		private String accessorycode_edate2;

		private String pointsbasket1edate;

		private String pointsbasket2edate;

		private String pointsbasket3edate;

		private String pointsbasket1;

		private String pointsbasket2;

		private String pointsbasket3;

		private String pointsbasket4edate;

		private String pointsbasket5edate;

		public String getDebit() {
			return debit;
		}

		public void setDebit(String debit) {
			this.debit = debit;
		}

		public long getTariffid() {
			return tariffid;
		}

		public void setTariffid(long tariffid) {
			this.tariffid = tariffid;
		}

		public String getLanguageid() {
			return languageid;
		}

		public void setLanguageid(String languageid) {
			this.languageid = languageid;
		}

		public String getAststate() {
			return aststate;
		}

		public void setAststate(String aststate) {
			this.aststate = aststate;
		}

		public String getServicesproviderid() {
			return servicesproviderid;
		}

		public void setServicesproviderid(String servicesproviderid) {
			this.servicesproviderid = servicesproviderid;
		}

		public String getInstalldate() {
			return installdate;
		}

		public void setInstalldate(String installdate) {
			this.installdate = installdate;
		}

		public String getActivedate() {
			return activedate;
		}

		public void setActivedate(String activedate) {
			this.activedate = activedate;
		}

		public String getDeactivated() {
			return deactivated;
		}

		public void setDeactivated(String deactivated) {
			this.deactivated = deactivated;
		}

		public String getDeactivedate() {
			return deactivedate;
		}
		
		public void setDeactivedate(String deactivedate) {
			this.deactivedate = deactivedate;
		} 
		
		public String getExpirydate() {
			return expirydate;
		}

		public void setExpirydate(String expirydate) {
			this.expirydate = expirydate;
		}

		public String getExpiredreason() {
			return expiredreason;
		}

		public void setExpiredreason(String expiredreason) {
			this.expiredreason = expiredreason;
		}

		public String getInformedmessageid() {
			return informedmessageid;
		}

		public void setInformedmessageid(String informedmessageid) {
			this.informedmessageid = informedmessageid;
		}

		public String getNumreloads() {
			return numreloads;
		}

		public void setNumreloads(String numreloads) {
			this.numreloads = numreloads;
		}

		public String getNumchangetariff() {
			return numchangetariff;
		}

		public void setNumchangetariff(String numchangetariff) {
			this.numchangetariff = numchangetariff;
		}

		public String getChangetariffdate() {
			return changetariffdate;
		}

		public void setChangetariffdate(String changetariffdate) {
			this.changetariffdate = changetariffdate;
		}

		public String getLastcalldate() {
			return lastcalldate;
		}

		public void setLastcalldate(String lastcalldate) {
			this.lastcalldate = lastcalldate;
		}

		public String getTypeofcard() {
			return typeofcard;
		}

		public void setTypeofcard(String typeofcard) {
			this.typeofcard = typeofcard;
		}

		public String getCardphase() {
			return cardphase;
		}

		public void setCardphase(String cardphase) {
			this.cardphase = cardphase;
		}

		public String getAccessorycode() {
			return accessorycode;
		}

		public void setAccessorycode(String accessorycode) {
			this.accessorycode = accessorycode;
		}

		public String getDistrictid() {
			return districtid;
		}

		public void setDistrictid(String districtid) {
			this.districtid = districtid;
		}

		public String getNumdistricts() {
			return numdistricts;
		}

		public void setNumdistricts(String numdistricts) {
			this.numdistricts = numdistricts;
		}

		public String getChangedistrictdate() {
			return changedistrictdate;
		}

		public void setChangedistrictdate(String changedistrictdate) {
			this.changedistrictdate = changedistrictdate;
		}

		public String getR_system() {
			return r_system;
		}

		public void setR_system(String r_system) {
			this.r_system = r_system;
		}

		public String getNumbilledsms() {
			return numbilledsms;
		}

		public void setNumbilledsms(String numbilledsms) {
			this.numbilledsms = numbilledsms;
		}

		public String getNumfreesms() {
			return numfreesms;
		}

		public void setNumfreesms(String numfreesms) {
			this.numfreesms = numfreesms;
		}

		public String getAccessoryedate() {
			return accessoryedate;
		}

		public void setAccessoryedate(String accessoryedate) {
			this.accessoryedate = accessoryedate;
		}

		public String getDebitco() {
			return debitco;
		}

		public void setDebitco(String debitco) {
			this.debitco = debitco;
		}

		public String getBonus1() {
			return bonus1;
		}

		public void setBonus1(String bonus1) {
			this.bonus1 = bonus1;
		}

		public String getBonus2() {
			return bonus2;
		}

		public void setBonus2(String bonus2) {
			this.bonus2 = bonus2;
		}

		public String getNumfreeseconds() {
			return numfreeseconds;
		}

		public void setNumfreeseconds(String numfreeseconds) {
			this.numfreeseconds = numfreeseconds;
		}

		public String getCardfeatures() {
			return cardfeatures;
		}

		public void setCardfeatures(String cardfeatures) {
			this.cardfeatures = cardfeatures;
		}

		public String getServcardedate2() {
			return servcardedate2;
		}

		public void setServcardedate2(String servcardedate2) {
			this.servcardedate2 = servcardedate2;
		}

		public String getServices() {
			return services;
		}

		public void setServices(String services) {
			this.services = services;
		}

		public String getServcardedate5() {
			return servcardedate5;
		}

		public void setServcardedate5(String servcardedate5) {
			this.servcardedate5 = servcardedate5;
		}

		public String getServcardedate1() {
			return servcardedate1;
		}

		public void setServcardedate1(String servcardedate1) {
			this.servcardedate1 = servcardedate1;
		}

		public String getServcardedate3() {
			return servcardedate3;
		}

		public void setServcardedate3(String servcardedate3) {
			this.servcardedate3 = servcardedate3;
		}

		public String getServcard() {
			return servcard;
		}

		public String getServcardedate4() {
			return servcardedate4;
		}

		public void setServcardedate4(String servcardedate4) {
			this.servcardedate4 = servcardedate4;
		}

		public void setServcard(String servcard) {
			this.servcard = servcard;
		}



		public String getActivetime() {
			return activetime;
		}

		public void setActivetime(String activetime) {
			this.activetime = activetime;
		}

		public String getDeactivetime() {
			return deactivetime;
		}

		public void setDeactivetime(String deactivetime) {
			this.deactivetime = deactivetime;
		}

		public String getRetbonus() {
			return retbonus;
		}

		public void setRetbonus(String retbonus) {
			this.retbonus = retbonus;
		}

		public String getTypeofbonus() {
			return typeofbonus;
		}

		public void setTypeofbonus(String typeofbonus) {
			this.typeofbonus = typeofbonus;
		}

		public String getTypeoflist() {
			return typeoflist;
		}

		public void setTypeoflist(String typeoflist) {
			this.typeoflist = typeoflist;
		}

		public String getRetbonusedate() {
			return retbonusedate;
		}

		public void setRetbonusedate(String retbonusedate) {
			this.retbonusedate = retbonusedate;
		}

		public String getServcard_edate6() {
			return servcard_edate6;
		}

		public void setServcard_edate6(String servcard_edate6) {
			this.servcard_edate6 = servcard_edate6;
		}

		public String getAccessorycode_edate1() {
			return accessorycode_edate1;
		}

		public void setAccessorycode_edate1(String accessorycode_edate1) {
			this.accessorycode_edate1 = accessorycode_edate1;
		}

		public String getAccessorycode_edate2() {
			return accessorycode_edate2;
		}

		public void setAccessorycode_edate2(String accessorycode_edate2) {
			this.accessorycode_edate2 = accessorycode_edate2;
		}

		public String getPointsbasket1edate() {
			return pointsbasket1edate;
		}

		public void setPointsbasket1edate(String pointsbasket1edate) {
			this.pointsbasket1edate = pointsbasket1edate;
		}

		public String getPointsbasket2edate() {
			return pointsbasket2edate;
		}

		public void setPointsbasket2edate(String pointsbasket2edate) {
			this.pointsbasket2edate = pointsbasket2edate;
		}

		public String getPointsbasket3edate() {
			return pointsbasket3edate;
		}

		public void setPointsbasket3edate(String pointsbasket3edate) {
			this.pointsbasket3edate = pointsbasket3edate;
		}

		public String getPointsbasket1() {
			return pointsbasket1;
		}

		public void setPointsbasket1(String pointsbasket1) {
			this.pointsbasket1 = pointsbasket1;
		}

		public String getPointsbasket2() {
			return pointsbasket2;
		}

		public void setPointsbasket2(String pointsbasket2) {
			this.pointsbasket2 = pointsbasket2;
		}

		public String getPointsbasket3() {
			return pointsbasket3;
		}

		public void setPointsbasket3(String pointsbasket3) {
			this.pointsbasket3 = pointsbasket3;
		}

		public String getPointsbasket4edate() {
			return pointsbasket4edate;
		}

		public void setPointsbasket4edate(String pointsbasket4edate) {
			this.pointsbasket4edate = pointsbasket4edate;
		}

		public String getPointsbasket5edate() {
			return pointsbasket5edate;
		}

		public void setPointsbasket5edate(String pointsbasket5edate) {
			this.pointsbasket5edate = pointsbasket5edate;
		}




		public String getSubSystem() {
			return subSystem;
		}

		public String getIccid() {
			return iccid;
		}

		public void setIccid(String iccid) {
			this.iccid = iccid;
		}

		public String getImsi() {
			return imsi;
		}

		public void setImsi(String imsi) {
			this.imsi = imsi;
		}

		public String getPin() {
			return pin;
		}

		public void setPin(String pin) {
			this.pin = pin;
		}

		public String getPuk() {
			return puk;
		}

		public void setPuk(String puk) {
			this.puk = puk;
		}

		public String getPin2() {
			return pin2;
		}

		public void setPin2(String pin2) {
			this.pin2 = pin2;
		}

		public String getPuk2() {
			return puk2;
		}

		public void setPuk2(String puk2) {
			this.puk2 = puk2;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public void setSubSystem(String subSystem) {
			this.subSystem = subSystem;
		}


		public String getMsisdn() {
			return msisdn;
		}

		public void setMsisdn(String msisdn) {
			this.msisdn = msisdn;
		}

		public OperationType getOperationType() {
			return operationType;
		}

		public void setOperationType(OperationType operationType) {
			this.operationType = operationType;
		}


	};

	private Payload payload;

	private RestoreSubscriberRequest(InfobusMessage message) {
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

		/*if (ibData.length()<23) {
			throw new IllegalArgumentException("Payload [" + ibData +"] too short")  ;
		}
		*/
		this.payload=new Payload();

	/*	int iPosition=0;
		this.payload.setSubSystem(ibData.substring(iPosition, iPosition+=10).trim());

		this.payload.setOperationType(Payload.OperationType.parse(ibData.substring(iPosition, iPosition+=1)));				

		this.payload.setMsisdn(ibData.substring(iPosition, iPosition+=12).trim());

		this.payload.setIccid(ibData.substring(iPosition, iPosition+=20).trim());

		this.payload.setImsi(ibData.substring(iPosition, iPosition+=16).trim());

		this.payload.setPin(ibData.substring(iPosition, iPosition+=4).trim());

		this.payload.setPuk(ibData.substring(iPosition, iPosition+=8).trim());

		this.payload.setPin2(ibData.substring(iPosition, iPosition+=4).trim());

		this.payload.setPuk2(ibData.substring(iPosition, iPosition+=8).trim());

		this.payload.setCategory(ibData.substring(iPosition, iPosition+=6).trim());

		this.payload.setDebit(ibData.substring(iPosition, iPosition+=16).trim());

		try {
			this.payload.setTariffid(Long.parseLong(ibData.substring(iPosition, iPosition+=5).trim()));
		} catch (Exception e) {
			throw new IllegalArgumentException("tariffId not valid")  ;
		}

		this.payload.setLanguageid(ProvisioningOpscUtil.removeLeftZero(ibData.substring(iPosition, iPosition+=2).trim()));

		this.payload.setAststate(ibData.substring(iPosition, iPosition+=1).trim());

		this.payload.setServicesproviderid(ibData.substring(iPosition, iPosition+=5).trim());

		this.payload.setInstalldate(ibData.substring(iPosition, iPosition+=14).trim());

		this.payload.setActivedate(ibData.substring(iPosition, iPosition+=14).trim());

		this.payload.setDeactivated(ibData.substring(iPosition, iPosition+=14).trim());
		
		this.payload.setDeactivedate(ibData.substring(iPosition, iPosition+=14).trim());
		
		this.payload.setExpirydate(ibData.substring(iPosition, iPosition+=14).trim());

		this.payload.setExpiredreason(ibData.substring(iPosition, iPosition+=1).trim());

		this.payload.setInformedmessageid(ibData.substring(iPosition, iPosition+=1).trim());

		this.payload.setNumreloads(ProvisioningOpscUtil.removeLeftZero(ibData.substring(iPosition, iPosition+=5).trim()));

		this.payload.setNumchangetariff(ProvisioningOpscUtil.removeLeftZero(ibData.substring(iPosition, iPosition+=5).trim()));

		this.payload.setChangetariffdate(ibData.substring(iPosition, iPosition+=14).trim());

		this.payload.setLastcalldate(ibData.substring(iPosition, iPosition+=14).trim());

		this.payload.setTypeofcard(ibData.substring(iPosition, iPosition+=2).trim());

		this.payload.setCardphase(ProvisioningOpscUtil.removeLeftZero(ibData.substring(iPosition, iPosition+=2).trim()));

		this.payload.setAccessorycode(ibData.substring(iPosition, iPosition+=8).trim());

		this.payload.setDistrictid(ibData.substring(iPosition, iPosition+=4).trim());
		
		this.payload.setNumdistricts(ibData.substring(iPosition, iPosition+=5).trim());

		this.payload.setChangedistrictdate(ibData.substring(iPosition, iPosition+=14).trim());


		this.payload.setR_system(ibData.substring(iPosition, iPosition+=1).trim());

		this.payload.setNumbilledsms(ibData.substring(iPosition, iPosition+=5).trim());

		this.payload.setNumfreesms(ibData.substring(iPosition, iPosition+=5).trim());

		this.payload.setAccessoryedate(ibData.substring(iPosition, iPosition+=14).trim());

		this.payload.setDebitco(ibData.substring(iPosition, iPosition+=16).trim());

		this.payload.setBonus1(ibData.substring(iPosition, iPosition+=16).trim());

		this.payload.setBonus2(ibData.substring(iPosition, iPosition+=10).trim());

		this.payload.setNumfreeseconds(ibData.substring(iPosition, iPosition+=5).trim());

		this.payload.setCardfeatures(ibData.substring(iPosition, iPosition+=8).trim());

		this.payload.setServcardedate2(ibData.substring(iPosition, iPosition+=14).trim());

		this.payload.setServices(ibData.substring(iPosition, iPosition+=10).trim());

		this.payload.setServcardedate5(ibData.substring(iPosition, iPosition+=14).trim());

		this.payload.setServcardedate1(ibData.substring(iPosition, iPosition+=14).trim());

		this.payload.setServcardedate3(ibData.substring(iPosition, iPosition+=14).trim());

		this.payload.setServcardedate4(ibData.substring(iPosition, iPosition+=14).trim());

		this.payload.setActivetime(ibData.substring(iPosition, iPosition+=3).trim());

		this.payload.setDeactivetime(ibData.substring(iPosition, iPosition+=3).trim());

		this.payload.setRetbonus(ibData.substring(iPosition, iPosition+=9).trim());

		this.payload.setTypeofbonus(ibData.substring(iPosition, iPosition+=1).trim());

		this.payload.setTypeoflist(ibData.substring(iPosition, iPosition+=5).trim());

		this.payload.setRetbonusedate(ibData.substring(iPosition, iPosition+=14).trim());

		this.payload.setServcard_edate6(ibData.substring(iPosition, iPosition+=14).trim());

		this.payload.setAccessorycode_edate1(ibData.substring(iPosition, iPosition+=14).trim());

		this.payload.setAccessorycode_edate2(ibData.substring(iPosition, iPosition+=14).trim());

		this.payload.setPointsbasket1edate(ibData.substring(iPosition, iPosition+=14).trim());

		this.payload.setPointsbasket2edate(ibData.substring(iPosition, iPosition+=14).trim());

		this.payload.setPointsbasket3edate(ibData.substring(iPosition, iPosition+=14).trim());

		this.payload.setPointsbasket1(ibData.substring(iPosition, iPosition+=9).trim());

		this.payload.setPointsbasket2(ibData.substring(iPosition, iPosition+=9).trim());

		this.payload.setPointsbasket3(ibData.substring(iPosition, iPosition+=9).trim());

		this.payload.setPointsbasket4edate(ibData.substring(iPosition, iPosition+=14).trim());

		this.payload.setPointsbasket5edate(ibData.substring(iPosition, iPosition+=14).trim());*/

		return;		
	}


	public static RestoreSubscriberRequest createInstance(InfobusMessage message) {
		RestoreSubscriberRequest result = new RestoreSubscriberRequest(message);

		result.parseData(message.getIbData().getValue());

		return result;
	}


}
