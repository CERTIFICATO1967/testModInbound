//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.10.13 alle 04:12:20 PM CEST 
//


package it.telecomitalia.soa.trcs.gateway;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per ActOfferType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ActOfferType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="ActivationDate" type="{http://telecomitalia.it/SOA/TRCS/Gateway}LifeCycleType" minOccurs="0"/&gt;
 *         &lt;element name="DeactivationDate" type="{http://telecomitalia.it/SOA/TRCS/Gateway}LifeCycleType" minOccurs="0"/&gt;
 *         &lt;element name="ExpiryDate" type="{http://telecomitalia.it/SOA/TRCS/Gateway}LifeCycleType" minOccurs="0"/&gt;
 *         &lt;element name="Zone" type="{http://telecomitalia.it/SOA/TRCS/Gateway}ZoneType" minOccurs="0"/&gt;
 *         &lt;element name="ADSL" type="{http://telecomitalia.it/SOA/TRCS/Gateway}ADSLType" minOccurs="0"/&gt;
 *         &lt;element name="Accessory" type="{http://telecomitalia.it/SOA/TRCS/Gateway}AccessoryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalNumber" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="MSISDN" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DiscountData" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Discount" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *                 &lt;attribute name="LimitDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                 &lt;attribute name="BalanceInfo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="EventList" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Name" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;maxLength value="11"/&gt;
 *             &lt;whiteSpace value="preserve"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="OfferCost"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;maxLength value="13"/&gt;
 *             &lt;pattern value="[0-9]+(.[0-9]+)?"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="CostMode" default="0"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;maxLength value="1"/&gt;
 *             &lt;pattern value="[0|1|2|3|4|5|6|7|8|9]"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="FeeMode" default="0"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;maxLength value="1"/&gt;
 *             &lt;pattern value="[0|1|2]"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="OfferCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ProfileName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FlagConsent" default="0"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *             &lt;enumeration value="0"/&gt;
 *             &lt;enumeration value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ActiveTime"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;maxLength value="5"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="LifeTime"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;maxLength value="5"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActOfferType", propOrder = {
    "activationDate",
    "deactivationDate",
    "expiryDate",
    "zone",
    "adsl",
    "accessory",
    "additionalNumber",
    "discountData"
})
@XmlSeeAlso({
    it.telecomitalia.soa.trcs.gateway.GroupedSubscriptionBookingType.Offer.class,
    it.telecomitalia.soa.trcs.gateway.SubscriptionBookingType.Offer.class,
    it.telecomitalia.soa.trcs.gateway.FamilySubscriptionOptionType.Offer.class,
    it.telecomitalia.soa.trcs.gateway.PostpaidSubscriptionOptionType.Offer.class
})
public class ActOfferType {

    @XmlElement(name = "ActivationDate")
    protected LifeCycleType activationDate;
    @XmlElement(name = "DeactivationDate")
    protected LifeCycleType deactivationDate;
    @XmlElement(name = "ExpiryDate")
    protected LifeCycleType expiryDate;
    @XmlElement(name = "Zone")
    protected ZoneType zone;
    @XmlElement(name = "ADSL")
    protected ADSLType adsl;
    @XmlElement(name = "Accessory")
    protected List<AccessoryType> accessory;
    @XmlElement(name = "AdditionalNumber")
    protected ActOfferType.AdditionalNumber additionalNumber;
    @XmlElement(name = "DiscountData")
    protected ActOfferType.DiscountData discountData;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "OfferCost")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String offerCost;
    @XmlAttribute(name = "CostMode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String costMode;
    @XmlAttribute(name = "FeeMode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String feeMode;
    @XmlAttribute(name = "OfferCode")
    protected String offerCode;
    @XmlAttribute(name = "ProfileName")
    protected String profileName;
    @XmlAttribute(name = "FlagConsent")
    protected BigInteger flagConsent;
    @XmlAttribute(name = "ActiveTime")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String activeTime;
    @XmlAttribute(name = "LifeTime")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lifeTime;

    /**
     * Recupera il valore della proprietà activationDate.
     * 
     * @return
     *     possible object is
     *     {@link LifeCycleType }
     *     
     */
    public LifeCycleType getActivationDate() {
        return activationDate;
    }

    /**
     * Imposta il valore della proprietà activationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeCycleType }
     *     
     */
    public void setActivationDate(LifeCycleType value) {
        this.activationDate = value;
    }

    /**
     * Recupera il valore della proprietà deactivationDate.
     * 
     * @return
     *     possible object is
     *     {@link LifeCycleType }
     *     
     */
    public LifeCycleType getDeactivationDate() {
        return deactivationDate;
    }

    /**
     * Imposta il valore della proprietà deactivationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeCycleType }
     *     
     */
    public void setDeactivationDate(LifeCycleType value) {
        this.deactivationDate = value;
    }

    /**
     * Recupera il valore della proprietà expiryDate.
     * 
     * @return
     *     possible object is
     *     {@link LifeCycleType }
     *     
     */
    public LifeCycleType getExpiryDate() {
        return expiryDate;
    }

    /**
     * Imposta il valore della proprietà expiryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeCycleType }
     *     
     */
    public void setExpiryDate(LifeCycleType value) {
        this.expiryDate = value;
    }

    /**
     * Recupera il valore della proprietà zone.
     * 
     * @return
     *     possible object is
     *     {@link ZoneType }
     *     
     */
    public ZoneType getZone() {
        return zone;
    }

    /**
     * Imposta il valore della proprietà zone.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneType }
     *     
     */
    public void setZone(ZoneType value) {
        this.zone = value;
    }

    /**
     * Recupera il valore della proprietà adsl.
     * 
     * @return
     *     possible object is
     *     {@link ADSLType }
     *     
     */
    public ADSLType getADSL() {
        return adsl;
    }

    /**
     * Imposta il valore della proprietà adsl.
     * 
     * @param value
     *     allowed object is
     *     {@link ADSLType }
     *     
     */
    public void setADSL(ADSLType value) {
        this.adsl = value;
    }

    /**
     * Gets the value of the accessory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessoryType }
     * 
     * 
     */
    public List<AccessoryType> getAccessory() {
        if (accessory == null) {
            accessory = new ArrayList<AccessoryType>();
        }
        return this.accessory;
    }

    /**
     * Recupera il valore della proprietà additionalNumber.
     * 
     * @return
     *     possible object is
     *     {@link ActOfferType.AdditionalNumber }
     *     
     */
    public ActOfferType.AdditionalNumber getAdditionalNumber() {
        return additionalNumber;
    }

    /**
     * Imposta il valore della proprietà additionalNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link ActOfferType.AdditionalNumber }
     *     
     */
    public void setAdditionalNumber(ActOfferType.AdditionalNumber value) {
        this.additionalNumber = value;
    }

    /**
     * Recupera il valore della proprietà discountData.
     * 
     * @return
     *     possible object is
     *     {@link ActOfferType.DiscountData }
     *     
     */
    public ActOfferType.DiscountData getDiscountData() {
        return discountData;
    }

    /**
     * Imposta il valore della proprietà discountData.
     * 
     * @param value
     *     allowed object is
     *     {@link ActOfferType.DiscountData }
     *     
     */
    public void setDiscountData(ActOfferType.DiscountData value) {
        this.discountData = value;
    }

    /**
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietà offerCost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferCost() {
        return offerCost;
    }

    /**
     * Imposta il valore della proprietà offerCost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferCost(String value) {
        this.offerCost = value;
    }

    /**
     * Recupera il valore della proprietà costMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostMode() {
        if (costMode == null) {
            return "0";
        } else {
            return costMode;
        }
    }

    /**
     * Imposta il valore della proprietà costMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostMode(String value) {
        this.costMode = value;
    }

    /**
     * Recupera il valore della proprietà feeMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeMode() {
        if (feeMode == null) {
            return "0";
        } else {
            return feeMode;
        }
    }

    /**
     * Imposta il valore della proprietà feeMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeMode(String value) {
        this.feeMode = value;
    }

    /**
     * Recupera il valore della proprietà offerCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferCode() {
        return offerCode;
    }

    /**
     * Imposta il valore della proprietà offerCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferCode(String value) {
        this.offerCode = value;
    }

    /**
     * Recupera il valore della proprietà profileName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileName() {
        return profileName;
    }

    /**
     * Imposta il valore della proprietà profileName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileName(String value) {
        this.profileName = value;
    }

    /**
     * Recupera il valore della proprietà flagConsent.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFlagConsent() {
        if (flagConsent == null) {
            return new BigInteger("0");
        } else {
            return flagConsent;
        }
    }

    /**
     * Imposta il valore della proprietà flagConsent.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFlagConsent(BigInteger value) {
        this.flagConsent = value;
    }

    /**
     * Recupera il valore della proprietà activeTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveTime() {
        return activeTime;
    }

    /**
     * Imposta il valore della proprietà activeTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveTime(String value) {
        this.activeTime = value;
    }

    /**
     * Recupera il valore della proprietà lifeTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifeTime() {
        return lifeTime;
    }

    /**
     * Imposta il valore della proprietà lifeTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifeTime(String value) {
        this.lifeTime = value;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="MSISDN" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AdditionalNumber {

        @XmlAttribute(name = "MSISDN", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String msisdn;

        /**
         * Recupera il valore della proprietà msisdn.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMSISDN() {
            return msisdn;
        }

        /**
         * Imposta il valore della proprietà msisdn.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMSISDN(String value) {
            this.msisdn = value;
        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="Discount" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
     *       &lt;attribute name="LimitDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *       &lt;attribute name="BalanceInfo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="EventList" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DiscountData {

        @XmlAttribute(name = "Discount", required = true)
        protected double discount;
        @XmlAttribute(name = "LimitDate", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar limitDate;
        @XmlAttribute(name = "BalanceInfo", required = true)
        protected String balanceInfo;
        @XmlAttribute(name = "EventList", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String eventList;

        /**
         * Recupera il valore della proprietà discount.
         * 
         */
        public double getDiscount() {
            return discount;
        }

        /**
         * Imposta il valore della proprietà discount.
         * 
         */
        public void setDiscount(double value) {
            this.discount = value;
        }

        /**
         * Recupera il valore della proprietà limitDate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLimitDate() {
            return limitDate;
        }

        /**
         * Imposta il valore della proprietà limitDate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLimitDate(XMLGregorianCalendar value) {
            this.limitDate = value;
        }

        /**
         * Recupera il valore della proprietà balanceInfo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBalanceInfo() {
            return balanceInfo;
        }

        /**
         * Imposta il valore della proprietà balanceInfo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBalanceInfo(String value) {
            this.balanceInfo = value;
        }

        /**
         * Recupera il valore della proprietà eventList.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEventList() {
            return eventList;
        }

        /**
         * Imposta il valore della proprietà eventList.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEventList(String value) {
            this.eventList = value;
        }

    }

}
