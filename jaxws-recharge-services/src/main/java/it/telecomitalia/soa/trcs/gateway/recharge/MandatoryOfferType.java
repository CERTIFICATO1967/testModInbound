//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.10.13 alle 05:08:21 PM CEST 
//


package it.telecomitalia.soa.trcs.gateway.recharge;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per MandatoryOfferType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MandatoryOfferType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActivationDate" type="{http://telecomitalia.it/SOA/TRCS/Gateway}LifeCycleType" minOccurs="0"/&gt;
 *         &lt;element name="DeactivationDate" type="{http://telecomitalia.it/SOA/TRCS/Gateway}LifeCycleType" minOccurs="0"/&gt;
 *         &lt;element name="ExpiryDate" type="{http://telecomitalia.it/SOA/TRCS/Gateway}LifeCycleType" minOccurs="0"/&gt;
 *         &lt;element name="Accessory" type="{http://telecomitalia.it/SOA/TRCS/Gateway}AccessoryType" maxOccurs="unbounded"/&gt;
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
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandatoryOfferType", propOrder = {
    "activationDate",
    "deactivationDate",
    "expiryDate",
    "accessory"
})
public class MandatoryOfferType {

    @XmlElement(name = "ActivationDate")
    protected LifeCycleType activationDate;
    @XmlElement(name = "DeactivationDate")
    protected LifeCycleType deactivationDate;
    @XmlElement(name = "ExpiryDate")
    protected LifeCycleType expiryDate;
    @XmlElement(name = "Accessory", required = true)
    protected List<AccessoryType> accessory;
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

}
