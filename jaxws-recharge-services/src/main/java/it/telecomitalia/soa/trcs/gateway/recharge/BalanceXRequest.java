//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.10.13 alle 02:54:50 PM CEST 
//


package it.telecomitalia.soa.trcs.gateway.recharge;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basket" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="mode" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *                       &lt;maxExclusive value="2"/&gt;
 *                       &lt;minInclusive value="0"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="zeroMode" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *                       &lt;minInclusive value="0"/&gt;
 *                       &lt;maxExclusive value="2"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="phoneNumber" use="required" type="{http://telecomitalia.it/SOA/TRCS/Gateway/Commons}PhoneNumber" /&gt;
 *       &lt;attribute name="subsystem" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="info" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="requestType" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="OneStep"/&gt;
 *             &lt;enumeration value="TwoStep"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="activeTime" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&gt;
 *       &lt;attribute name="lifeTime" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&gt;
 *       &lt;attribute name="baseOfferExt" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "basket"
})
@XmlRootElement(name = "BalanceXRequest")
public class BalanceXRequest {

    @XmlElement(required = true)
    protected List<BalanceXRequest.Basket> basket;
    @XmlAttribute(name = "phoneNumber", required = true)
    protected String phoneNumber;
    @XmlAttribute(name = "subsystem", required = true)
    protected String subsystem;
    @XmlAttribute(name = "info")
    protected String info;
    @XmlAttribute(name = "requestType", required = true)
    protected String requestType;
    @XmlAttribute(name = "activeTime")
    @XmlSchemaType(name = "unsignedInt")
    protected Long activeTime;
    @XmlAttribute(name = "lifeTime")
    @XmlSchemaType(name = "unsignedInt")
    protected Long lifeTime;
    @XmlAttribute(name = "baseOfferExt")
    protected Boolean baseOfferExt;

    /**
     * Gets the value of the basket property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basket property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasket().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceXRequest.Basket }
     * 
     * 
     */
    public List<BalanceXRequest.Basket> getBasket() {
        if (basket == null) {
            basket = new ArrayList<BalanceXRequest.Basket>();
        }
        return this.basket;
    }

    /**
     * Recupera il valore della proprietà phoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Imposta il valore della proprietà phoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Recupera il valore della proprietà subsystem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsystem() {
        return subsystem;
    }

    /**
     * Imposta il valore della proprietà subsystem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsystem(String value) {
        this.subsystem = value;
    }

    /**
     * Recupera il valore della proprietà info.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo() {
        return info;
    }

    /**
     * Imposta il valore della proprietà info.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo(String value) {
        this.info = value;
    }

    /**
     * Recupera il valore della proprietà requestType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestType() {
        return requestType;
    }

    /**
     * Imposta il valore della proprietà requestType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestType(String value) {
        this.requestType = value;
    }

    /**
     * Recupera il valore della proprietà activeTime.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActiveTime() {
        return activeTime;
    }

    /**
     * Imposta il valore della proprietà activeTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActiveTime(Long value) {
        this.activeTime = value;
    }

    /**
     * Recupera il valore della proprietà lifeTime.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLifeTime() {
        return lifeTime;
    }

    /**
     * Imposta il valore della proprietà lifeTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLifeTime(Long value) {
        this.lifeTime = value;
    }

    /**
     * Recupera il valore della proprietà baseOfferExt.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBaseOfferExt() {
        if (baseOfferExt == null) {
            return false;
        } else {
            return baseOfferExt;
        }
    }

    /**
     * Imposta il valore della proprietà baseOfferExt.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBaseOfferExt(Boolean value) {
        this.baseOfferExt = value;
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
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="mode" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
     *             &lt;maxExclusive value="2"/&gt;
     *             &lt;minInclusive value="0"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="zeroMode" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
     *             &lt;minInclusive value="0"/&gt;
     *             &lt;maxExclusive value="2"/&gt;
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
    @XmlType(name = "")
    public static class Basket {

        @XmlAttribute(name = "name", required = true)
        protected String name;
        @XmlAttribute(name = "value", required = true)
        protected BigDecimal value;
        @XmlAttribute(name = "mode", required = true)
        protected long mode;
        @XmlAttribute(name = "zeroMode", required = true)
        protected long zeroMode;

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
         * Recupera il valore della proprietà value.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Imposta il valore della proprietà value.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Recupera il valore della proprietà mode.
         * 
         */
        public long getMode() {
            return mode;
        }

        /**
         * Imposta il valore della proprietà mode.
         * 
         */
        public void setMode(long value) {
            this.mode = value;
        }

        /**
         * Recupera il valore della proprietà zeroMode.
         * 
         */
        public long getZeroMode() {
            return zeroMode;
        }

        /**
         * Imposta il valore della proprietà zeroMode.
         * 
         */
        public void setZeroMode(long value) {
            this.zeroMode = value;
        }

    }

}
