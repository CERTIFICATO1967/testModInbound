//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.10.13 alle 05:11:06 PM CEST 
//


package it.telecomitalia.soa.trcs.gateway.recharge;

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


/**
 * <p>Classe Java per OfferType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OfferType"&gt;
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
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferType", propOrder = {
    "activationDate",
    "deactivationDate",
    "expiryDate",
    "zone",
    "adsl",
    "accessory",
    "additionalNumber"
})
@XmlSeeAlso({
    it.telecomitalia.soa.trcs.gateway.recharge.SubscriptionOptionType.Offer.class,
    it.telecomitalia.soa.trcs.gateway.recharge.AnyOfferHasExtDeactive.Offer.class
})
public class OfferType {

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
    protected OfferType.AdditionalNumber additionalNumber;
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
     *     {@link OfferType.AdditionalNumber }
     *     
     */
    public OfferType.AdditionalNumber getAdditionalNumber() {
        return additionalNumber;
    }

    /**
     * Imposta il valore della proprietà additionalNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferType.AdditionalNumber }
     *     
     */
    public void setAdditionalNumber(OfferType.AdditionalNumber value) {
        this.additionalNumber = value;
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

}
