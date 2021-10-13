//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.10.13 alle 05:08:21 PM CEST 
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
import javax.xml.bind.annotation.XmlValue;
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
 *         &lt;element name="PATTERN" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="OPTIONID"&gt;
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
 *       &lt;attribute name="OPTIONTYPE"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;length value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="OPTIONGROUP"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="10"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="NUMOPTCHANGE"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="5"/&gt;
 *             &lt;fractionDigits value="0"/&gt;
 *             &lt;minInclusive value="0"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="CREATIONDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="LASTCHANGEDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pattern"
})
@XmlRootElement(name = "PERSONALOPTION")
public class PERSONALOPTION
    extends AccountComponentType
{

    @XmlElement(name = "PATTERN", namespace = "")
    protected List<PERSONALOPTION.PATTERN> pattern;
    @XmlAttribute(name = "OPTIONID")
    protected BigDecimal optionid;
    @XmlAttribute(name = "NAME")
    protected String name;
    @XmlAttribute(name = "OPTIONTYPE")
    protected String optiontype;
    @XmlAttribute(name = "OPTIONGROUP")
    protected String optiongroup;
    @XmlAttribute(name = "NUMOPTCHANGE")
    protected BigDecimal numoptchange;
    @XmlAttribute(name = "CREATIONDATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationdate;
    @XmlAttribute(name = "LASTCHANGEDATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastchangedate;

    /**
     * Gets the value of the pattern property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pattern property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPATTERN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PERSONALOPTION.PATTERN }
     * 
     * 
     */
    public List<PERSONALOPTION.PATTERN> getPATTERN() {
        if (pattern == null) {
            pattern = new ArrayList<PERSONALOPTION.PATTERN>();
        }
        return this.pattern;
    }

    /**
     * Recupera il valore della proprietà optionid.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOPTIONID() {
        return optionid;
    }

    /**
     * Imposta il valore della proprietà optionid.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOPTIONID(BigDecimal value) {
        this.optionid = value;
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
     * Recupera il valore della proprietà optiontype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPTIONTYPE() {
        return optiontype;
    }

    /**
     * Imposta il valore della proprietà optiontype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPTIONTYPE(String value) {
        this.optiontype = value;
    }

    /**
     * Recupera il valore della proprietà optiongroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPTIONGROUP() {
        return optiongroup;
    }

    /**
     * Imposta il valore della proprietà optiongroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPTIONGROUP(String value) {
        this.optiongroup = value;
    }

    /**
     * Recupera il valore della proprietà numoptchange.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNUMOPTCHANGE() {
        return numoptchange;
    }

    /**
     * Imposta il valore della proprietà numoptchange.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNUMOPTCHANGE(BigDecimal value) {
        this.numoptchange = value;
    }

    /**
     * Recupera il valore della proprietà creationdate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCREATIONDATE() {
        return creationdate;
    }

    /**
     * Imposta il valore della proprietà creationdate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCREATIONDATE(XMLGregorianCalendar value) {
        this.creationdate = value;
    }

    /**
     * Recupera il valore della proprietà lastchangedate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLASTCHANGEDATE() {
        return lastchangedate;
    }

    /**
     * Imposta il valore della proprietà lastchangedate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLASTCHANGEDATE(XMLGregorianCalendar value) {
        this.lastchangedate = value;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class PATTERN {

        @XmlValue
        protected String value;

        /**
         * Recupera il valore della proprietà value.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Imposta il valore della proprietà value.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

    }

}
