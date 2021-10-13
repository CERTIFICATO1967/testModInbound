//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.10.13 alle 05:08:21 PM CEST 
//


package it.telecomitalia.soa.trcs.gateway.recharge;

import java.math.BigDecimal;
import java.math.BigInteger;
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
 *         &lt;element ref="{http://telecomitalia.it/SOA/TRCS/Gateway}BASKET" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://telecomitalia.it/SOA/TRCS/Gateway}RESOURCE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://telecomitalia.it/SOA/TRCS/Gateway}PERSONALOPTION" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DISCOUNT" type="{http://telecomitalia.it/SOA/TRCS/Gateway}DISCOUNTType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ACCESSORYID"&gt;
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
 *       &lt;attribute name="ACCESSORYTYPE"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="2"/&gt;
 *             &lt;fractionDigits value="0"/&gt;
 *             &lt;minInclusive value="1"/&gt;
 *             &lt;maxInclusive value="6"/&gt;
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
 *       &lt;attribute name="HASRENEWAL" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="NUMRENEWAL" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="SECONDARY" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="USAGESTATE"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="1"/&gt;
 *             &lt;fractionDigits value="0"/&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;maxInclusive value="3"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ACTIVATIONDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="STARTUSEDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="ENDUSEDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="NEXTUSEDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="DEACTIVATIONDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="EXPIRYDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="ACCESSORYCATEGORY" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
 *       &lt;attribute name="MODELCOST"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="21"/&gt;
 *             &lt;fractionDigits value="6"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="MODELCOSTSTART" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="MODELCOSTEND" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="MODELCOSTFLAG" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="MODELDISCOUNTVALUE"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="18"/&gt;
 *             &lt;fractionDigits value="6"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "basket",
    "resource",
    "personaloption",
    "discount"
})
@XmlRootElement(name = "ACCESSORY")
public class ACCESSORY
    extends AccountComponentType
{

    @XmlElement(name = "BASKET")
    protected List<BASKET> basket;
    @XmlElement(name = "RESOURCE")
    protected List<RESOURCE> resource;
    @XmlElement(name = "PERSONALOPTION")
    protected List<PERSONALOPTION> personaloption;
    @XmlElement(name = "DISCOUNT", namespace = "")
    protected DISCOUNTType discount;
    @XmlAttribute(name = "ACCESSORYID")
    protected BigDecimal accessoryid;
    @XmlAttribute(name = "NAME")
    protected String name;
    @XmlAttribute(name = "ACCESSORYTYPE")
    protected BigDecimal accessorytype;
    @XmlAttribute(name = "STATE")
    protected BigDecimal state;
    @XmlAttribute(name = "HASRENEWAL")
    protected Integer hasrenewal;
    @XmlAttribute(name = "NUMRENEWAL")
    protected Integer numrenewal;
    @XmlAttribute(name = "SECONDARY")
    protected Boolean secondary;
    @XmlAttribute(name = "USAGESTATE")
    protected BigDecimal usagestate;
    @XmlAttribute(name = "ACTIVATIONDATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activationdate;
    @XmlAttribute(name = "STARTUSEDATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startusedate;
    @XmlAttribute(name = "ENDUSEDATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endusedate;
    @XmlAttribute(name = "NEXTUSEDATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextusedate;
    @XmlAttribute(name = "DEACTIVATIONDATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deactivationdate;
    @XmlAttribute(name = "EXPIRYDATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirydate;
    @XmlAttribute(name = "ACCESSORYCATEGORY")
    protected Short accessorycategory;
    @XmlAttribute(name = "MODELCOST")
    protected BigDecimal modelcost;
    @XmlAttribute(name = "MODELCOSTSTART")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modelcoststart;
    @XmlAttribute(name = "MODELCOSTEND")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modelcostend;
    @XmlAttribute(name = "MODELCOSTFLAG")
    protected BigInteger modelcostflag;
    @XmlAttribute(name = "MODELDISCOUNTVALUE")
    protected BigDecimal modeldiscountvalue;

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
     *    getBASKET().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BASKET }
     * 
     * 
     */
    public List<BASKET> getBASKET() {
        if (basket == null) {
            basket = new ArrayList<BASKET>();
        }
        return this.basket;
    }

    /**
     * Gets the value of the resource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRESOURCE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RESOURCE }
     * 
     * 
     */
    public List<RESOURCE> getRESOURCE() {
        if (resource == null) {
            resource = new ArrayList<RESOURCE>();
        }
        return this.resource;
    }

    /**
     * Gets the value of the personaloption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personaloption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPERSONALOPTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PERSONALOPTION }
     * 
     * 
     */
    public List<PERSONALOPTION> getPERSONALOPTION() {
        if (personaloption == null) {
            personaloption = new ArrayList<PERSONALOPTION>();
        }
        return this.personaloption;
    }

    /**
     * Recupera il valore della proprietà discount.
     * 
     * @return
     *     possible object is
     *     {@link DISCOUNTType }
     *     
     */
    public DISCOUNTType getDISCOUNT() {
        return discount;
    }

    /**
     * Imposta il valore della proprietà discount.
     * 
     * @param value
     *     allowed object is
     *     {@link DISCOUNTType }
     *     
     */
    public void setDISCOUNT(DISCOUNTType value) {
        this.discount = value;
    }

    /**
     * Recupera il valore della proprietà accessoryid.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACCESSORYID() {
        return accessoryid;
    }

    /**
     * Imposta il valore della proprietà accessoryid.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACCESSORYID(BigDecimal value) {
        this.accessoryid = value;
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
     * Recupera il valore della proprietà accessorytype.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACCESSORYTYPE() {
        return accessorytype;
    }

    /**
     * Imposta il valore della proprietà accessorytype.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACCESSORYTYPE(BigDecimal value) {
        this.accessorytype = value;
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
     * Recupera il valore della proprietà hasrenewal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getHASRENEWAL() {
        if (hasrenewal == null) {
            return  0;
        } else {
            return hasrenewal;
        }
    }

    /**
     * Imposta il valore della proprietà hasrenewal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHASRENEWAL(Integer value) {
        this.hasrenewal = value;
    }

    /**
     * Recupera il valore della proprietà numrenewal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNUMRENEWAL() {
        return numrenewal;
    }

    /**
     * Imposta il valore della proprietà numrenewal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNUMRENEWAL(Integer value) {
        this.numrenewal = value;
    }

    /**
     * Recupera il valore della proprietà secondary.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSECONDARY() {
        if (secondary == null) {
            return false;
        } else {
            return secondary;
        }
    }

    /**
     * Imposta il valore della proprietà secondary.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSECONDARY(Boolean value) {
        this.secondary = value;
    }

    /**
     * Recupera il valore della proprietà usagestate.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUSAGESTATE() {
        return usagestate;
    }

    /**
     * Imposta il valore della proprietà usagestate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUSAGESTATE(BigDecimal value) {
        this.usagestate = value;
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
     * Recupera il valore della proprietà startusedate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSTARTUSEDATE() {
        return startusedate;
    }

    /**
     * Imposta il valore della proprietà startusedate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSTARTUSEDATE(XMLGregorianCalendar value) {
        this.startusedate = value;
    }

    /**
     * Recupera il valore della proprietà endusedate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getENDUSEDATE() {
        return endusedate;
    }

    /**
     * Imposta il valore della proprietà endusedate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setENDUSEDATE(XMLGregorianCalendar value) {
        this.endusedate = value;
    }

    /**
     * Recupera il valore della proprietà nextusedate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNEXTUSEDATE() {
        return nextusedate;
    }

    /**
     * Imposta il valore della proprietà nextusedate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNEXTUSEDATE(XMLGregorianCalendar value) {
        this.nextusedate = value;
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
     * Recupera il valore della proprietà accessorycategory.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getACCESSORYCATEGORY() {
        return accessorycategory;
    }

    /**
     * Imposta il valore della proprietà accessorycategory.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setACCESSORYCATEGORY(Short value) {
        this.accessorycategory = value;
    }

    /**
     * Recupera il valore della proprietà modelcost.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMODELCOST() {
        return modelcost;
    }

    /**
     * Imposta il valore della proprietà modelcost.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMODELCOST(BigDecimal value) {
        this.modelcost = value;
    }

    /**
     * Recupera il valore della proprietà modelcoststart.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMODELCOSTSTART() {
        return modelcoststart;
    }

    /**
     * Imposta il valore della proprietà modelcoststart.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMODELCOSTSTART(XMLGregorianCalendar value) {
        this.modelcoststart = value;
    }

    /**
     * Recupera il valore della proprietà modelcostend.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMODELCOSTEND() {
        return modelcostend;
    }

    /**
     * Imposta il valore della proprietà modelcostend.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMODELCOSTEND(XMLGregorianCalendar value) {
        this.modelcostend = value;
    }

    /**
     * Recupera il valore della proprietà modelcostflag.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMODELCOSTFLAG() {
        return modelcostflag;
    }

    /**
     * Imposta il valore della proprietà modelcostflag.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMODELCOSTFLAG(BigInteger value) {
        this.modelcostflag = value;
    }

    /**
     * Recupera il valore della proprietà modeldiscountvalue.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMODELDISCOUNTVALUE() {
        return modeldiscountvalue;
    }

    /**
     * Imposta il valore della proprietà modeldiscountvalue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMODELDISCOUNTVALUE(BigDecimal value) {
        this.modeldiscountvalue = value;
    }

}
