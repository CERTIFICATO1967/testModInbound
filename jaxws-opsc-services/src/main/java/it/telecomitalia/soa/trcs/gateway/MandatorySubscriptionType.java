//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.09.01 alle 12:07:18 PM CEST 
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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per MandatorySubscriptionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MandatorySubscriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActivationDate" type="{http://telecomitalia.it/SOA/TRCS/Gateway}LifeCycleType" minOccurs="0"/&gt;
 *         &lt;element name="DeactivationDate" type="{http://telecomitalia.it/SOA/TRCS/Gateway}LifeCycleType" minOccurs="0"/&gt;
 *         &lt;element name="ExpiryDate" type="{http://telecomitalia.it/SOA/TRCS/Gateway}LifeCycleType" minOccurs="0"/&gt;
 *         &lt;element name="Offer" type="{http://telecomitalia.it/SOA/TRCS/Gateway}MandatoryOfferType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Name" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;maxLength value="10"/&gt;
 *             &lt;whiteSpace value="preserve"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ProductType" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="ProductValue" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="ProductChannel" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="Technology" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SubscriptionType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandatorySubscriptionType", propOrder = {
    "activationDate",
    "deactivationDate",
    "expiryDate",
    "offer"
})
public class MandatorySubscriptionType {

    @XmlElement(name = "ActivationDate")
    protected LifeCycleType activationDate;
    @XmlElement(name = "DeactivationDate")
    protected LifeCycleType deactivationDate;
    @XmlElement(name = "ExpiryDate")
    protected LifeCycleType expiryDate;
    @XmlElement(name = "Offer", required = true)
    protected List<MandatoryOfferType> offer;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "ProductType")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger productType;
    @XmlAttribute(name = "ProductValue")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger productValue;
    @XmlAttribute(name = "ProductChannel")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger productChannel;
    @XmlAttribute(name = "Technology")
    protected String technology;
    @XmlAttribute(name = "SubscriptionType")
    protected String subscriptionType;

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
     * Gets the value of the offer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MandatoryOfferType }
     * 
     * 
     */
    public List<MandatoryOfferType> getOffer() {
        if (offer == null) {
            offer = new ArrayList<MandatoryOfferType>();
        }
        return this.offer;
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
     * Recupera il valore della proprietà productType.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProductType() {
        return productType;
    }

    /**
     * Imposta il valore della proprietà productType.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProductType(BigInteger value) {
        this.productType = value;
    }

    /**
     * Recupera il valore della proprietà productValue.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProductValue() {
        return productValue;
    }

    /**
     * Imposta il valore della proprietà productValue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProductValue(BigInteger value) {
        this.productValue = value;
    }

    /**
     * Recupera il valore della proprietà productChannel.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProductChannel() {
        return productChannel;
    }

    /**
     * Imposta il valore della proprietà productChannel.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProductChannel(BigInteger value) {
        this.productChannel = value;
    }

    /**
     * Recupera il valore della proprietà technology.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnology() {
        return technology;
    }

    /**
     * Imposta il valore della proprietà technology.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnology(String value) {
        this.technology = value;
    }

    /**
     * Recupera il valore della proprietà subscriptionType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionType() {
        return subscriptionType;
    }

    /**
     * Imposta il valore della proprietà subscriptionType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionType(String value) {
        this.subscriptionType = value;
    }

}
