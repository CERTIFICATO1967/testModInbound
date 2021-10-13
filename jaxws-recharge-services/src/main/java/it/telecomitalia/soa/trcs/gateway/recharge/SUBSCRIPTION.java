//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.10.13 alle 05:11:06 PM CEST 
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://telecomitalia.it/SOA/TRCS/Gateway}AccountComponentType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://telecomitalia.it/SOA/TRCS/Gateway}OFFER" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://telecomitalia.it/SOA/TRCS/Gateway}ONLY_QUERY_1_10"/&gt;
 *       &lt;attribute name="SUBSCRIPTIONID"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="8"/&gt;
 *             &lt;fractionDigits value="0"/&gt;
 *             &lt;minInclusive value="0"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="NAME"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="10"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="SUBSCRIPTIONTYPE"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="2"/&gt;
 *             &lt;fractionDigits value="0"/&gt;
 *             &lt;minInclusive value="1"/&gt;
 *             &lt;maxInclusive value="4"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="TECHNOLOGY"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="2"/&gt;
 *             &lt;fractionDigits value="0"/&gt;
 *             &lt;minInclusive value="1"/&gt;
 *             &lt;maxInclusive value="3"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="PRODUCTTYPE"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="4"/&gt;
 *             &lt;fractionDigits value="0"/&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;maxInclusive value="7"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="PRODUCTVALUE"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="4"/&gt;
 *             &lt;fractionDigits value="0"/&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;maxInclusive value="5"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="PRODUCTCHANNEL"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="4"/&gt;
 *             &lt;fractionDigits value="0"/&gt;
 *             &lt;minInclusive value="1"/&gt;
 *             &lt;maxInclusive value="5"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="STATE"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="2"/&gt;
 *             &lt;fractionDigits value="0"/&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;maxInclusive value="5"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="INSTALLATIONDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="ACTIVATIONDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="DEACTIVATIONDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="EXPIRYDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "offer"
})
@XmlRootElement(name = "SUBSCRIPTION")
public class SUBSCRIPTION
    extends AccountComponentType
{

    @XmlElement(name = "OFFER", required = true)
    protected List<OFFER> offer;
    @XmlAttribute(name = "SUBSCRIPTIONID")
    protected BigDecimal subscriptionid;
    @XmlAttribute(name = "NAME")
    protected String name;
    @XmlAttribute(name = "SUBSCRIPTIONTYPE")
    protected BigDecimal subscriptiontype;
    @XmlAttribute(name = "TECHNOLOGY")
    protected BigDecimal technology;
    @XmlAttribute(name = "PRODUCTTYPE")
    protected BigDecimal producttype;
    @XmlAttribute(name = "PRODUCTVALUE")
    protected BigDecimal productvalue;
    @XmlAttribute(name = "PRODUCTCHANNEL")
    protected BigDecimal productchannel;
    @XmlAttribute(name = "STATE")
    protected BigDecimal state;
    @XmlAttribute(name = "INSTALLATIONDATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar installationdate;
    @XmlAttribute(name = "ACTIVATIONDATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activationdate;
    @XmlAttribute(name = "DEACTIVATIONDATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deactivationdate;
    @XmlAttribute(name = "EXPIRYDATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirydate;
    @XmlAttribute(name = "MAXALLOWEDOFFERS")
    protected Integer maxallowedoffers;

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
     *    getOFFER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OFFER }
     * 
     * 
     */
    public List<OFFER> getOFFER() {
        if (offer == null) {
            offer = new ArrayList<OFFER>();
        }
        return this.offer;
    }

    /**
     * Recupera il valore della proprietà subscriptionid.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSUBSCRIPTIONID() {
        return subscriptionid;
    }

    /**
     * Imposta il valore della proprietà subscriptionid.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSUBSCRIPTIONID(BigDecimal value) {
        this.subscriptionid = value;
    }

    /**
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
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
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietà subscriptiontype.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSUBSCRIPTIONTYPE() {
        return subscriptiontype;
    }

    /**
     * Imposta il valore della proprietà subscriptiontype.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSUBSCRIPTIONTYPE(BigDecimal value) {
        this.subscriptiontype = value;
    }

    /**
     * Recupera il valore della proprietà technology.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTECHNOLOGY() {
        return technology;
    }

    /**
     * Imposta il valore della proprietà technology.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTECHNOLOGY(BigDecimal value) {
        this.technology = value;
    }

    /**
     * Recupera il valore della proprietà producttype.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPRODUCTTYPE() {
        return producttype;
    }

    /**
     * Imposta il valore della proprietà producttype.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPRODUCTTYPE(BigDecimal value) {
        this.producttype = value;
    }

    /**
     * Recupera il valore della proprietà productvalue.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPRODUCTVALUE() {
        return productvalue;
    }

    /**
     * Imposta il valore della proprietà productvalue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPRODUCTVALUE(BigDecimal value) {
        this.productvalue = value;
    }

    /**
     * Recupera il valore della proprietà productchannel.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPRODUCTCHANNEL() {
        return productchannel;
    }

    /**
     * Imposta il valore della proprietà productchannel.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPRODUCTCHANNEL(BigDecimal value) {
        this.productchannel = value;
    }

    /**
     * Recupera il valore della proprietà state.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSTATE() {
        return state;
    }

    /**
     * Imposta il valore della proprietà state.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSTATE(BigDecimal value) {
        this.state = value;
    }

    /**
     * Recupera il valore della proprietà installationdate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getINSTALLATIONDATE() {
        return installationdate;
    }

    /**
     * Imposta il valore della proprietà installationdate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setINSTALLATIONDATE(XMLGregorianCalendar value) {
        this.installationdate = value;
    }

    /**
     * Recupera il valore della proprietà activationdate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getACTIVATIONDATE() {
        return activationdate;
    }

    /**
     * Imposta il valore della proprietà activationdate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setACTIVATIONDATE(XMLGregorianCalendar value) {
        this.activationdate = value;
    }

    /**
     * Recupera il valore della proprietà deactivationdate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDEACTIVATIONDATE() {
        return deactivationdate;
    }

    /**
     * Imposta il valore della proprietà deactivationdate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDEACTIVATIONDATE(XMLGregorianCalendar value) {
        this.deactivationdate = value;
    }

    /**
     * Recupera il valore della proprietà expirydate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEXPIRYDATE() {
        return expirydate;
    }

    /**
     * Imposta il valore della proprietà expirydate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEXPIRYDATE(XMLGregorianCalendar value) {
        this.expirydate = value;
    }

    /**
     * Recupera il valore della proprietà maxallowedoffers.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMAXALLOWEDOFFERS() {
        return maxallowedoffers;
    }

    /**
     * Imposta il valore della proprietà maxallowedoffers.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMAXALLOWEDOFFERS(Integer value) {
        this.maxallowedoffers = value;
    }

}
