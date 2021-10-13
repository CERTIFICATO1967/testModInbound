//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.10.13 alle 05:11:06 PM CEST 
//


package it.telecomitalia.soa.trcs.gateway.recharge;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per BOOKOFFERSType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BOOKOFFERSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="COMPONENTSTATE" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NAME" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EXPIRYDATE" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="OPERATIONCOST" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="REPLACEBASEOFFER" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="SUBSYSTEM" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="OPERATIONDATE" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BOOKOFFERSType")
public class BOOKOFFERSType {

    @XmlAttribute(name = "COMPONENTSTATE")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger componentstate;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "NAME", required = true)
    protected String name;
    @XmlAttribute(name = "EXPIRYDATE", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirydate;
    @XmlAttribute(name = "OPERATIONCOST", required = true)
    protected double operationcost;
    @XmlAttribute(name = "REPLACEBASEOFFER", required = true)
    protected boolean replacebaseoffer;
    @XmlAttribute(name = "SUBSYSTEM", required = true)
    protected String subsystem;
    @XmlAttribute(name = "OPERATIONDATE", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar operationdate;

    /**
     * Recupera il valore della proprietà componentstate.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCOMPONENTSTATE() {
        return componentstate;
    }

    /**
     * Imposta il valore della proprietà componentstate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCOMPONENTSTATE(BigInteger value) {
        this.componentstate = value;
    }

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
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
     * Recupera il valore della proprietà operationcost.
     * 
     */
    public double getOPERATIONCOST() {
        return operationcost;
    }

    /**
     * Imposta il valore della proprietà operationcost.
     * 
     */
    public void setOPERATIONCOST(double value) {
        this.operationcost = value;
    }

    /**
     * Recupera il valore della proprietà replacebaseoffer.
     * 
     */
    public boolean isREPLACEBASEOFFER() {
        return replacebaseoffer;
    }

    /**
     * Imposta il valore della proprietà replacebaseoffer.
     * 
     */
    public void setREPLACEBASEOFFER(boolean value) {
        this.replacebaseoffer = value;
    }

    /**
     * Recupera il valore della proprietà subsystem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBSYSTEM() {
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
    public void setSUBSYSTEM(String value) {
        this.subsystem = value;
    }

    /**
     * Recupera il valore della proprietà operationdate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOPERATIONDATE() {
        return operationdate;
    }

    /**
     * Imposta il valore della proprietà operationdate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOPERATIONDATE(XMLGregorianCalendar value) {
        this.operationdate = value;
    }

}
