//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.09.01 alle 12:07:18 PM CEST 
//


package it.telecomitalia.soa.trcs.gateway;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per ACCOUNTType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ACCOUNTType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PENDINGRELOAD" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="MSISDN"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                       &lt;totalDigits value="12"/&gt;
 *                       &lt;fractionDigits value="0"/&gt;
 *                       &lt;minInclusive value="0"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="TID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="DATE" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="STATE" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte"&gt;
 *                       &lt;pattern value="[0-2]"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://telecomitalia.it/SOA/TRCS/Gateway}SUBSCRIBERMAP" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://telecomitalia.it/SOA/TRCS/Gateway}ACCOUNTGROUP" minOccurs="0"/&gt;
 *         &lt;element ref="{http://telecomitalia.it/SOA/TRCS/Gateway}SUBSCRIPTION" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BOOKING" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BOOKOFFER" type="{http://telecomitalia.it/SOA/TRCS/Gateway}BOOKOFFERSType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ACCOUNTID"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="12"/&gt;
 *             &lt;fractionDigits value="0"/&gt;
 *             &lt;minInclusive value="0"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="GROUPID"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="12"/&gt;
 *             &lt;fractionDigits value="0"/&gt;
 *             &lt;minInclusive value="0"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="SERVICEPROVIDERID"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="5"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="LANGUAGEID"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="2"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="STATE"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="2"/&gt;
 *             &lt;fractionDigits value="0"/&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;maxInclusive value="10"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="RESFROMEXPREAS"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;totalDigits value="1"/&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;maxInclusive value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="REASON"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="2"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ACCOUNTTYPE"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="2"/&gt;
 *             &lt;fractionDigits value="0"/&gt;
 *             &lt;minInclusive value="1"/&gt;
 *             &lt;maxInclusive value="4"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ACCOUNTCATEGORY"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="16"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="INSTALLATIONDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="ACTIVATIONDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="DEACTIVATIONDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="DEACTIVATED" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="EXPIRYDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="NOTIFYREQUEST"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="2"/&gt;
 *             &lt;fractionDigits value="0"/&gt;
 *             &lt;minInclusive value="1"/&gt;
 *             &lt;maxInclusive value="3"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="NOTIFYTYPE"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;length value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="NOTIFYDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="TYPEOFCARD"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="2"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="NUMRELOADS"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="5"/&gt;
 *             &lt;fractionDigits value="0"/&gt;
 *             &lt;minInclusive value="0"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="LASTRELOAD" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="NUMTARIFFS"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="5"/&gt;
 *             &lt;fractionDigits value="0"/&gt;
 *             &lt;minInclusive value="0"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="LASTCHANGETARIFF" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="LASTCALLDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="LASTBATCHDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="NEXTBATCHDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="NEXTREMINDDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="NEXTBATCHFLAGS"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="0"/&gt;
 *             &lt;maxLength value="6"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="TARGET"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="0"/&gt;
 *             &lt;maxLength value="6"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="NEXTRECURRINGHOUR" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACCOUNTType", propOrder = {
    "pendingreload",
    "subscribermap",
    "accountgroup",
    "subscription",
    "booking"
})
@XmlSeeAlso({
    ACCOUNT.class
})
public class ACCOUNTType {

    @XmlElement(name = "PENDINGRELOAD", namespace = "")
    protected ACCOUNTType.PENDINGRELOAD pendingreload;
    @XmlElement(name = "SUBSCRIBERMAP")
    protected List<SUBSCRIBERMAP> subscribermap;
    @XmlElement(name = "ACCOUNTGROUP")
    protected ACCOUNTGROUP accountgroup;
    @XmlElement(name = "SUBSCRIPTION")
    protected List<SUBSCRIPTION> subscription;
    @XmlElement(name = "BOOKING", namespace = "")
    protected ACCOUNTType.BOOKING booking;
    @XmlAttribute(name = "ACCOUNTID")
    protected BigDecimal accountid;
    @XmlAttribute(name = "GROUPID")
    protected BigDecimal groupid;
    @XmlAttribute(name = "SERVICEPROVIDERID")
    protected String serviceproviderid;
    @XmlAttribute(name = "LANGUAGEID")
    protected String languageid;
    @XmlAttribute(name = "STATE")
    protected BigDecimal state;
    @XmlAttribute(name = "RESFROMEXPREAS")
    protected Integer resfromexpreas;
    @XmlAttribute(name = "REASON")
    protected String reason;
    @XmlAttribute(name = "ACCOUNTTYPE")
    protected BigDecimal accounttype;
    @XmlAttribute(name = "ACCOUNTCATEGORY")
    protected String accountcategory;
    @XmlAttribute(name = "INSTALLATIONDATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar installationdate;
    @XmlAttribute(name = "ACTIVATIONDATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activationdate;
    @XmlAttribute(name = "DEACTIVATIONDATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deactivationdate;
    @XmlAttribute(name = "DEACTIVATED")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deactivated;
    @XmlAttribute(name = "EXPIRYDATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirydate;
    @XmlAttribute(name = "NOTIFYREQUEST")
    protected BigDecimal notifyrequest;
    @XmlAttribute(name = "NOTIFYTYPE")
    protected String notifytype;
    @XmlAttribute(name = "NOTIFYDATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar notifydate;
    @XmlAttribute(name = "TYPEOFCARD")
    protected String typeofcard;
    @XmlAttribute(name = "NUMRELOADS")
    protected BigDecimal numreloads;
    @XmlAttribute(name = "LASTRELOAD")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastreload;
    @XmlAttribute(name = "NUMTARIFFS")
    protected BigDecimal numtariffs;
    @XmlAttribute(name = "LASTCHANGETARIFF")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastchangetariff;
    @XmlAttribute(name = "LASTCALLDATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastcalldate;
    @XmlAttribute(name = "LASTBATCHDATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastbatchdate;
    @XmlAttribute(name = "NEXTBATCHDATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextbatchdate;
    @XmlAttribute(name = "NEXTREMINDDATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextreminddate;
    @XmlAttribute(name = "NEXTBATCHFLAGS")
    protected String nextbatchflags;
    @XmlAttribute(name = "TARGET")
    protected String target;
    @XmlAttribute(name = "NEXTRECURRINGHOUR")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextrecurringhour;

    /**
     * Recupera il valore della proprietà pendingreload.
     * 
     * @return
     *     possible object is
     *     {@link ACCOUNTType.PENDINGRELOAD }
     *     
     */
    public ACCOUNTType.PENDINGRELOAD getPENDINGRELOAD() {
        return pendingreload;
    }

    /**
     * Imposta il valore della proprietà pendingreload.
     * 
     * @param value
     *     allowed object is
     *     {@link ACCOUNTType.PENDINGRELOAD }
     *     
     */
    public void setPENDINGRELOAD(ACCOUNTType.PENDINGRELOAD value) {
        this.pendingreload = value;
    }

    /**
     * Gets the value of the subscribermap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscribermap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSUBSCRIBERMAP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SUBSCRIBERMAP }
     * 
     * 
     */
    public List<SUBSCRIBERMAP> getSUBSCRIBERMAP() {
        if (subscribermap == null) {
            subscribermap = new ArrayList<SUBSCRIBERMAP>();
        }
        return this.subscribermap;
    }

    /**
     * Recupera il valore della proprietà accountgroup.
     * 
     * @return
     *     possible object is
     *     {@link ACCOUNTGROUP }
     *     
     */
    public ACCOUNTGROUP getACCOUNTGROUP() {
        return accountgroup;
    }

    /**
     * Imposta il valore della proprietà accountgroup.
     * 
     * @param value
     *     allowed object is
     *     {@link ACCOUNTGROUP }
     *     
     */
    public void setACCOUNTGROUP(ACCOUNTGROUP value) {
        this.accountgroup = value;
    }

    /**
     * Gets the value of the subscription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSUBSCRIPTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SUBSCRIPTION }
     * 
     * 
     */
    public List<SUBSCRIPTION> getSUBSCRIPTION() {
        if (subscription == null) {
            subscription = new ArrayList<SUBSCRIPTION>();
        }
        return this.subscription;
    }

    /**
     * Recupera il valore della proprietà booking.
     * 
     * @return
     *     possible object is
     *     {@link ACCOUNTType.BOOKING }
     *     
     */
    public ACCOUNTType.BOOKING getBOOKING() {
        return booking;
    }

    /**
     * Imposta il valore della proprietà booking.
     * 
     * @param value
     *     allowed object is
     *     {@link ACCOUNTType.BOOKING }
     *     
     */
    public void setBOOKING(ACCOUNTType.BOOKING value) {
        this.booking = value;
    }

    /**
     * Recupera il valore della proprietà accountid.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACCOUNTID() {
        return accountid;
    }

    /**
     * Imposta il valore della proprietà accountid.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACCOUNTID(BigDecimal value) {
        this.accountid = value;
    }

    /**
     * Recupera il valore della proprietà groupid.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGROUPID() {
        return groupid;
    }

    /**
     * Imposta il valore della proprietà groupid.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGROUPID(BigDecimal value) {
        this.groupid = value;
    }

    /**
     * Recupera il valore della proprietà serviceproviderid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERVICEPROVIDERID() {
        return serviceproviderid;
    }

    /**
     * Imposta il valore della proprietà serviceproviderid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERVICEPROVIDERID(String value) {
        this.serviceproviderid = value;
    }

    /**
     * Recupera il valore della proprietà languageid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGUAGEID() {
        return languageid;
    }

    /**
     * Imposta il valore della proprietà languageid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGUAGEID(String value) {
        this.languageid = value;
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
     * Recupera il valore della proprietà resfromexpreas.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRESFROMEXPREAS() {
        return resfromexpreas;
    }

    /**
     * Imposta il valore della proprietà resfromexpreas.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRESFROMEXPREAS(Integer value) {
        this.resfromexpreas = value;
    }

    /**
     * Recupera il valore della proprietà reason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREASON() {
        return reason;
    }

    /**
     * Imposta il valore della proprietà reason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREASON(String value) {
        this.reason = value;
    }

    /**
     * Recupera il valore della proprietà accounttype.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACCOUNTTYPE() {
        return accounttype;
    }

    /**
     * Imposta il valore della proprietà accounttype.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACCOUNTTYPE(BigDecimal value) {
        this.accounttype = value;
    }

    /**
     * Recupera il valore della proprietà accountcategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTCATEGORY() {
        return accountcategory;
    }

    /**
     * Imposta il valore della proprietà accountcategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTCATEGORY(String value) {
        this.accountcategory = value;
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
     * Recupera il valore della proprietà deactivated.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDEACTIVATED() {
        return deactivated;
    }

    /**
     * Imposta il valore della proprietà deactivated.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDEACTIVATED(XMLGregorianCalendar value) {
        this.deactivated = value;
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
     * Recupera il valore della proprietà notifyrequest.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNOTIFYREQUEST() {
        return notifyrequest;
    }

    /**
     * Imposta il valore della proprietà notifyrequest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNOTIFYREQUEST(BigDecimal value) {
        this.notifyrequest = value;
    }

    /**
     * Recupera il valore della proprietà notifytype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOTIFYTYPE() {
        return notifytype;
    }

    /**
     * Imposta il valore della proprietà notifytype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOTIFYTYPE(String value) {
        this.notifytype = value;
    }

    /**
     * Recupera il valore della proprietà notifydate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNOTIFYDATE() {
        return notifydate;
    }

    /**
     * Imposta il valore della proprietà notifydate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNOTIFYDATE(XMLGregorianCalendar value) {
        this.notifydate = value;
    }

    /**
     * Recupera il valore della proprietà typeofcard.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPEOFCARD() {
        return typeofcard;
    }

    /**
     * Imposta il valore della proprietà typeofcard.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPEOFCARD(String value) {
        this.typeofcard = value;
    }

    /**
     * Recupera il valore della proprietà numreloads.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNUMRELOADS() {
        return numreloads;
    }

    /**
     * Imposta il valore della proprietà numreloads.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNUMRELOADS(BigDecimal value) {
        this.numreloads = value;
    }

    /**
     * Recupera il valore della proprietà lastreload.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLASTRELOAD() {
        return lastreload;
    }

    /**
     * Imposta il valore della proprietà lastreload.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLASTRELOAD(XMLGregorianCalendar value) {
        this.lastreload = value;
    }

    /**
     * Recupera il valore della proprietà numtariffs.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNUMTARIFFS() {
        return numtariffs;
    }

    /**
     * Imposta il valore della proprietà numtariffs.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNUMTARIFFS(BigDecimal value) {
        this.numtariffs = value;
    }

    /**
     * Recupera il valore della proprietà lastchangetariff.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLASTCHANGETARIFF() {
        return lastchangetariff;
    }

    /**
     * Imposta il valore della proprietà lastchangetariff.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLASTCHANGETARIFF(XMLGregorianCalendar value) {
        this.lastchangetariff = value;
    }

    /**
     * Recupera il valore della proprietà lastcalldate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLASTCALLDATE() {
        return lastcalldate;
    }

    /**
     * Imposta il valore della proprietà lastcalldate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLASTCALLDATE(XMLGregorianCalendar value) {
        this.lastcalldate = value;
    }

    /**
     * Recupera il valore della proprietà lastbatchdate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLASTBATCHDATE() {
        return lastbatchdate;
    }

    /**
     * Imposta il valore della proprietà lastbatchdate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLASTBATCHDATE(XMLGregorianCalendar value) {
        this.lastbatchdate = value;
    }

    /**
     * Recupera il valore della proprietà nextbatchdate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNEXTBATCHDATE() {
        return nextbatchdate;
    }

    /**
     * Imposta il valore della proprietà nextbatchdate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNEXTBATCHDATE(XMLGregorianCalendar value) {
        this.nextbatchdate = value;
    }

    /**
     * Recupera il valore della proprietà nextreminddate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNEXTREMINDDATE() {
        return nextreminddate;
    }

    /**
     * Imposta il valore della proprietà nextreminddate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNEXTREMINDDATE(XMLGregorianCalendar value) {
        this.nextreminddate = value;
    }

    /**
     * Recupera il valore della proprietà nextbatchflags.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNEXTBATCHFLAGS() {
        return nextbatchflags;
    }

    /**
     * Imposta il valore della proprietà nextbatchflags.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNEXTBATCHFLAGS(String value) {
        this.nextbatchflags = value;
    }

    /**
     * Recupera il valore della proprietà target.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTARGET() {
        return target;
    }

    /**
     * Imposta il valore della proprietà target.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTARGET(String value) {
        this.target = value;
    }

    /**
     * Recupera il valore della proprietà nextrecurringhour.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNEXTRECURRINGHOUR() {
        return nextrecurringhour;
    }

    /**
     * Imposta il valore della proprietà nextrecurringhour.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNEXTRECURRINGHOUR(XMLGregorianCalendar value) {
        this.nextrecurringhour = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="BOOKOFFER" type="{http://telecomitalia.it/SOA/TRCS/Gateway}BOOKOFFERSType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bookoffer"
    })
    public static class BOOKING {

        @XmlElement(name = "BOOKOFFER", namespace = "")
        protected List<BOOKOFFERSType> bookoffer;

        /**
         * Gets the value of the bookoffer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bookoffer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBOOKOFFER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BOOKOFFERSType }
         * 
         * 
         */
        public List<BOOKOFFERSType> getBOOKOFFER() {
            if (bookoffer == null) {
                bookoffer = new ArrayList<BOOKOFFERSType>();
            }
            return this.bookoffer;
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
     *       &lt;attribute name="MSISDN"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *             &lt;totalDigits value="12"/&gt;
     *             &lt;fractionDigits value="0"/&gt;
     *             &lt;minInclusive value="0"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="TID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="DATE" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="STATE" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte"&gt;
     *             &lt;pattern value="[0-2]"/&gt;
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
    public static class PENDINGRELOAD {

        @XmlAttribute(name = "MSISDN")
        protected BigDecimal msisdn;
        @XmlAttribute(name = "TID", required = true)
        protected String tid;
        @XmlAttribute(name = "DATE", required = true)
        protected String date;
        @XmlAttribute(name = "STATE", required = true)
        protected short state;

        /**
         * Recupera il valore della proprietà msisdn.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMSISDN() {
            return msisdn;
        }

        /**
         * Imposta il valore della proprietà msisdn.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMSISDN(BigDecimal value) {
            this.msisdn = value;
        }

        /**
         * Recupera il valore della proprietà tid.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTID() {
            return tid;
        }

        /**
         * Imposta il valore della proprietà tid.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTID(String value) {
            this.tid = value;
        }

        /**
         * Recupera il valore della proprietà date.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDATE() {
            return date;
        }

        /**
         * Imposta il valore della proprietà date.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDATE(String value) {
            this.date = value;
        }

        /**
         * Recupera il valore della proprietà state.
         * 
         */
        public short getSTATE() {
            return state;
        }

        /**
         * Imposta il valore della proprietà state.
         * 
         */
        public void setSTATE(short value) {
            this.state = value;
        }

    }

}
