//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.09.01 alle 12:07:18 PM CEST 
//


package it.telecomitalia.soa.trcs.gateway;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="BASKETID"&gt;
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
 *       &lt;attribute name="BASKETTYPE"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="10"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="HASROLLOVER" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="LASTSYNCHVALUE"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="21"/&gt;
 *             &lt;fractionDigits value="6"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="LASTSYNCHDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="ROLLOVERTHR"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="18"/&gt;
 *             &lt;fractionDigits value="6"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ROLLOVERMAX"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;totalDigits value="4"/&gt;
 *             &lt;fractionDigits value="0"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="LASTROLLOVERCNT" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" /&gt;
 *       &lt;attribute name="RecoveredDebit"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="21"/&gt;
 *             &lt;fractionDigits value="6"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="MAXVALUE"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="21"/&gt;
 *             &lt;fractionDigits value="6"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="EUROPAID" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "BASKET")
public class BASKET
    extends AccountComponentType
{

    @XmlAttribute(name = "BASKETID")
    protected BigDecimal basketid;
    @XmlAttribute(name = "NAME")
    protected String name;
    @XmlAttribute(name = "BASKETTYPE")
    protected String baskettype;
    @XmlAttribute(name = "HASROLLOVER")
    protected Boolean hasrollover;
    @XmlAttribute(name = "LASTSYNCHVALUE")
    protected BigDecimal lastsynchvalue;
    @XmlAttribute(name = "LASTSYNCHDATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastsynchdate;
    @XmlAttribute(name = "ROLLOVERTHR")
    protected BigDecimal rolloverthr;
    @XmlAttribute(name = "ROLLOVERMAX")
    protected Integer rollovermax;
    @XmlAttribute(name = "LASTROLLOVERCNT")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer lastrollovercnt;
    @XmlAttribute(name = "RecoveredDebit")
    protected BigDecimal recoveredDebit;
    @XmlAttribute(name = "MAXVALUE")
    protected BigDecimal maxvalue;
    @XmlAttribute(name = "EUROPAID")
    protected Boolean europaid;

    /**
     * Recupera il valore della proprietà basketid.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBASKETID() {
        return basketid;
    }

    /**
     * Imposta il valore della proprietà basketid.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBASKETID(BigDecimal value) {
        this.basketid = value;
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
     * Recupera il valore della proprietà baskettype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBASKETTYPE() {
        return baskettype;
    }

    /**
     * Imposta il valore della proprietà baskettype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBASKETTYPE(String value) {
        this.baskettype = value;
    }

    /**
     * Recupera il valore della proprietà hasrollover.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHASROLLOVER() {
        if (hasrollover == null) {
            return false;
        } else {
            return hasrollover;
        }
    }

    /**
     * Imposta il valore della proprietà hasrollover.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHASROLLOVER(Boolean value) {
        this.hasrollover = value;
    }

    /**
     * Recupera il valore della proprietà lastsynchvalue.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLASTSYNCHVALUE() {
        return lastsynchvalue;
    }

    /**
     * Imposta il valore della proprietà lastsynchvalue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLASTSYNCHVALUE(BigDecimal value) {
        this.lastsynchvalue = value;
    }

    /**
     * Recupera il valore della proprietà lastsynchdate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLASTSYNCHDATE() {
        return lastsynchdate;
    }

    /**
     * Imposta il valore della proprietà lastsynchdate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLASTSYNCHDATE(XMLGregorianCalendar value) {
        this.lastsynchdate = value;
    }

    /**
     * Recupera il valore della proprietà rolloverthr.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getROLLOVERTHR() {
        return rolloverthr;
    }

    /**
     * Imposta il valore della proprietà rolloverthr.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setROLLOVERTHR(BigDecimal value) {
        this.rolloverthr = value;
    }

    /**
     * Recupera il valore della proprietà rollovermax.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getROLLOVERMAX() {
        return rollovermax;
    }

    /**
     * Imposta il valore della proprietà rollovermax.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setROLLOVERMAX(Integer value) {
        this.rollovermax = value;
    }

    /**
     * Recupera il valore della proprietà lastrollovercnt.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLASTROLLOVERCNT() {
        return lastrollovercnt;
    }

    /**
     * Imposta il valore della proprietà lastrollovercnt.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLASTROLLOVERCNT(Integer value) {
        this.lastrollovercnt = value;
    }

    /**
     * Recupera il valore della proprietà recoveredDebit.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRecoveredDebit() {
        return recoveredDebit;
    }

    /**
     * Imposta il valore della proprietà recoveredDebit.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRecoveredDebit(BigDecimal value) {
        this.recoveredDebit = value;
    }

    /**
     * Recupera il valore della proprietà maxvalue.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAXVALUE() {
        return maxvalue;
    }

    /**
     * Imposta il valore della proprietà maxvalue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAXVALUE(BigDecimal value) {
        this.maxvalue = value;
    }

    /**
     * Recupera il valore della proprietà europaid.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEUROPAID() {
        return europaid;
    }

    /**
     * Imposta il valore della proprietà europaid.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEUROPAID(Boolean value) {
        this.europaid = value;
    }

}
