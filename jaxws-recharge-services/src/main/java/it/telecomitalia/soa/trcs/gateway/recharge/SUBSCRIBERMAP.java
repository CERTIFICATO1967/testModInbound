//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.10.13 alle 02:54:50 PM CEST 
//


package it.telecomitalia.soa.trcs.gateway.recharge;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://telecomitalia.it/SOA/TRCS/Gateway}AccountComponentType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element ref="{http://telecomitalia.it/SOA/TRCS/Gateway}SIMDEVICE"/&gt;
 *         &lt;element ref="{http://telecomitalia.it/SOA/TRCS/Gateway}TACSDEVICE"/&gt;
 *         &lt;element ref="{http://telecomitalia.it/SOA/TRCS/Gateway}IPDEVICE"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="ACCOUNTID"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="12"/&gt;
 *             &lt;fractionDigits value="0"/&gt;
 *             &lt;minInclusive value="0"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="MAPID"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="4"/&gt;
 *             &lt;fractionDigits value="0"/&gt;
 *             &lt;minInclusive value="1"/&gt;
 *             &lt;maxInclusive value="11"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="MAPVALUE"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="32"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ROLEID"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="4"/&gt;
 *             &lt;fractionDigits value="0"/&gt;
 *             &lt;minInclusive value="1"/&gt;
 *             &lt;maxInclusive value="3"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ISREPLACED" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "simdevice",
    "tacsdevice",
    "ipdevice"
})
@XmlRootElement(name = "SUBSCRIBERMAP")
public class SUBSCRIBERMAP
    extends AccountComponentType
{

    @XmlElement(name = "SIMDEVICE")
    protected SIMDEVICE simdevice;
    @XmlElement(name = "TACSDEVICE")
    protected TACSDEVICE tacsdevice;
    @XmlElement(name = "IPDEVICE")
    protected IPDEVICE ipdevice;
    @XmlAttribute(name = "ACCOUNTID")
    protected BigDecimal accountid;
    @XmlAttribute(name = "MAPID")
    protected BigDecimal mapid;
    @XmlAttribute(name = "MAPVALUE")
    protected String mapvalue;
    @XmlAttribute(name = "ROLEID")
    protected BigDecimal roleid;
    @XmlAttribute(name = "ISREPLACED")
    protected Boolean isreplaced;

    /**
     * Recupera il valore della proprietà simdevice.
     * 
     * @return
     *     possible object is
     *     {@link SIMDEVICE }
     *     
     */
    public SIMDEVICE getSIMDEVICE() {
        return simdevice;
    }

    /**
     * Imposta il valore della proprietà simdevice.
     * 
     * @param value
     *     allowed object is
     *     {@link SIMDEVICE }
     *     
     */
    public void setSIMDEVICE(SIMDEVICE value) {
        this.simdevice = value;
    }

    /**
     * Recupera il valore della proprietà tacsdevice.
     * 
     * @return
     *     possible object is
     *     {@link TACSDEVICE }
     *     
     */
    public TACSDEVICE getTACSDEVICE() {
        return tacsdevice;
    }

    /**
     * Imposta il valore della proprietà tacsdevice.
     * 
     * @param value
     *     allowed object is
     *     {@link TACSDEVICE }
     *     
     */
    public void setTACSDEVICE(TACSDEVICE value) {
        this.tacsdevice = value;
    }

    /**
     * Recupera il valore della proprietà ipdevice.
     * 
     * @return
     *     possible object is
     *     {@link IPDEVICE }
     *     
     */
    public IPDEVICE getIPDEVICE() {
        return ipdevice;
    }

    /**
     * Imposta il valore della proprietà ipdevice.
     * 
     * @param value
     *     allowed object is
     *     {@link IPDEVICE }
     *     
     */
    public void setIPDEVICE(IPDEVICE value) {
        this.ipdevice = value;
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
     * Recupera il valore della proprietà mapid.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAPID() {
        return mapid;
    }

    /**
     * Imposta il valore della proprietà mapid.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAPID(BigDecimal value) {
        this.mapid = value;
    }

    /**
     * Recupera il valore della proprietà mapvalue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAPVALUE() {
        return mapvalue;
    }

    /**
     * Imposta il valore della proprietà mapvalue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAPVALUE(String value) {
        this.mapvalue = value;
    }

    /**
     * Recupera il valore della proprietà roleid.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getROLEID() {
        return roleid;
    }

    /**
     * Imposta il valore della proprietà roleid.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setROLEID(BigDecimal value) {
        this.roleid = value;
    }

    /**
     * Recupera il valore della proprietà isreplaced.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISREPLACED() {
        return isreplaced;
    }

    /**
     * Imposta il valore della proprietà isreplaced.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISREPLACED(Boolean value) {
        this.isreplaced = value;
    }

}
