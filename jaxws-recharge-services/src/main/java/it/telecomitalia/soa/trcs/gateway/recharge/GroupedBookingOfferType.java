//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.10.13 alle 05:11:06 PM CEST 
//


package it.telecomitalia.soa.trcs.gateway.recharge;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per GroupedBookingOfferType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GroupedBookingOfferType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Subscription" type="{http://telecomitalia.it/SOA/TRCS/Gateway}GroupedSubscriptionBookingType"/&gt;
 *         &lt;element name="ExpiryDate" type="{http://telecomitalia.it/SOA/TRCS/Gateway}LifeCycleBookType" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="OperationCost"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;maxLength value="13"/&gt;
 *             &lt;pattern value="[0-9]+(.[0-9]+)?"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ReplaceBaseOffer" type="{http://www.w3.org/2001/XMLSchema}boolean" default="0" /&gt;
 *       &lt;attribute name="OperationType" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Creation"/&gt;
 *             &lt;enumeration value="Deletion"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ActiveTime"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;maxLength value="5"/&gt;
 *             &lt;pattern value="[0-9]+"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="LifeTime"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;maxLength value="5"/&gt;
 *             &lt;pattern value="[0-9]+"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="NoProvisioning" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupedBookingOfferType", propOrder = {

})
public class GroupedBookingOfferType {

    @XmlElement(name = "Subscription", required = true)
    protected GroupedSubscriptionBookingType subscription;
    @XmlElement(name = "ExpiryDate")
    protected LifeCycleBookType expiryDate;
    @XmlAttribute(name = "OperationCost")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String operationCost;
    @XmlAttribute(name = "ReplaceBaseOffer")
    protected Boolean replaceBaseOffer;
    @XmlAttribute(name = "OperationType", required = true)
    protected String operationType;
    @XmlAttribute(name = "ActiveTime")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String activeTime;
    @XmlAttribute(name = "LifeTime")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lifeTime;
    @XmlAttribute(name = "NoProvisioning")
    protected Boolean noProvisioning;

    /**
     * Recupera il valore della proprietà subscription.
     * 
     * @return
     *     possible object is
     *     {@link GroupedSubscriptionBookingType }
     *     
     */
    public GroupedSubscriptionBookingType getSubscription() {
        return subscription;
    }

    /**
     * Imposta il valore della proprietà subscription.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupedSubscriptionBookingType }
     *     
     */
    public void setSubscription(GroupedSubscriptionBookingType value) {
        this.subscription = value;
    }

    /**
     * Recupera il valore della proprietà expiryDate.
     * 
     * @return
     *     possible object is
     *     {@link LifeCycleBookType }
     *     
     */
    public LifeCycleBookType getExpiryDate() {
        return expiryDate;
    }

    /**
     * Imposta il valore della proprietà expiryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeCycleBookType }
     *     
     */
    public void setExpiryDate(LifeCycleBookType value) {
        this.expiryDate = value;
    }

    /**
     * Recupera il valore della proprietà operationCost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationCost() {
        return operationCost;
    }

    /**
     * Imposta il valore della proprietà operationCost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationCost(String value) {
        this.operationCost = value;
    }

    /**
     * Recupera il valore della proprietà replaceBaseOffer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReplaceBaseOffer() {
        if (replaceBaseOffer == null) {
            return false;
        } else {
            return replaceBaseOffer;
        }
    }

    /**
     * Imposta il valore della proprietà replaceBaseOffer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplaceBaseOffer(Boolean value) {
        this.replaceBaseOffer = value;
    }

    /**
     * Recupera il valore della proprietà operationType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationType() {
        return operationType;
    }

    /**
     * Imposta il valore della proprietà operationType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationType(String value) {
        this.operationType = value;
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
     * Recupera il valore della proprietà noProvisioning.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoProvisioning() {
        return noProvisioning;
    }

    /**
     * Imposta il valore della proprietà noProvisioning.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoProvisioning(Boolean value) {
        this.noProvisioning = value;
    }

}
