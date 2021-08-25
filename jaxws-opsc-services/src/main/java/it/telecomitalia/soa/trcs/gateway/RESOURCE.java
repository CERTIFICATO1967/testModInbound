//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.08.02 alle 11:23:32 AM CEST 
//


package it.telecomitalia.soa.trcs.gateway;

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
 *         &lt;element ref="{http://telecomitalia.it/SOA/TRCS/Gateway}NTWRESOURCE"/&gt;
 *         &lt;element ref="{http://telecomitalia.it/SOA/TRCS/Gateway}RELRESOURCE"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="RESOURCEID"&gt;
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
 *       &lt;attribute name="RESOURCETYPE"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="2"/&gt;
 *             &lt;fractionDigits value="0"/&gt;
 *             &lt;minInclusive value="1"/&gt;
 *             &lt;maxInclusive value="9"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="STATE"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="2"/&gt;
 *             &lt;fractionDigits value="0"/&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;maxInclusive value="4"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="EVENTMODE"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="2"/&gt;
 *             &lt;fractionDigits value="0"/&gt;
 *             &lt;minInclusive value="1"/&gt;
 *             &lt;maxInclusive value="4"/&gt;
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
    "ntwresource",
    "relresource"
})
@XmlRootElement(name = "RESOURCE")
public class RESOURCE
    extends AccountComponentType
{

    @XmlElement(name = "NTWRESOURCE")
    protected NTWRESOURCE ntwresource;
    @XmlElement(name = "RELRESOURCE")
    protected RELRESOURCE relresource;
    @XmlAttribute(name = "RESOURCEID")
    protected BigDecimal resourceid;
    @XmlAttribute(name = "NAME")
    protected String name;
    @XmlAttribute(name = "RESOURCETYPE")
    protected BigDecimal resourcetype;
    @XmlAttribute(name = "STATE")
    protected BigDecimal state;
    @XmlAttribute(name = "EVENTMODE")
    protected BigDecimal eventmode;

    /**
     * Recupera il valore della proprietà ntwresource.
     * 
     * @return
     *     possible object is
     *     {@link NTWRESOURCE }
     *     
     */
    public NTWRESOURCE getNTWRESOURCE() {
        return ntwresource;
    }

    /**
     * Imposta il valore della proprietà ntwresource.
     * 
     * @param value
     *     allowed object is
     *     {@link NTWRESOURCE }
     *     
     */
    public void setNTWRESOURCE(NTWRESOURCE value) {
        this.ntwresource = value;
    }

    /**
     * Recupera il valore della proprietà relresource.
     * 
     * @return
     *     possible object is
     *     {@link RELRESOURCE }
     *     
     */
    public RELRESOURCE getRELRESOURCE() {
        return relresource;
    }

    /**
     * Imposta il valore della proprietà relresource.
     * 
     * @param value
     *     allowed object is
     *     {@link RELRESOURCE }
     *     
     */
    public void setRELRESOURCE(RELRESOURCE value) {
        this.relresource = value;
    }

    /**
     * Recupera il valore della proprietà resourceid.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRESOURCEID() {
        return resourceid;
    }

    /**
     * Imposta il valore della proprietà resourceid.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRESOURCEID(BigDecimal value) {
        this.resourceid = value;
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
     * Recupera il valore della proprietà resourcetype.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRESOURCETYPE() {
        return resourcetype;
    }

    /**
     * Imposta il valore della proprietà resourcetype.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRESOURCETYPE(BigDecimal value) {
        this.resourcetype = value;
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
     * Recupera il valore della proprietà eventmode.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEVENTMODE() {
        return eventmode;
    }

    /**
     * Imposta il valore della proprietà eventmode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEVENTMODE(BigDecimal value) {
        this.eventmode = value;
    }

}
