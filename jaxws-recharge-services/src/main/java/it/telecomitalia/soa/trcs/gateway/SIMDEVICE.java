//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.10.13 alle 04:12:20 PM CEST 
//


package it.telecomitalia.soa.trcs.gateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ICCID"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="20"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="CARDFEATURES"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;length value="8"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="CARDPHASE"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="2"/&gt;
 *             &lt;minLength value="0"/&gt;
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
@XmlRootElement(name = "SIMDEVICE")
public class SIMDEVICE {

    @XmlAttribute(name = "ICCID")
    protected String iccid;
    @XmlAttribute(name = "CARDFEATURES")
    protected String cardfeatures;
    @XmlAttribute(name = "CARDPHASE")
    protected String cardphase;

    /**
     * Recupera il valore della proprietà iccid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICCID() {
        return iccid;
    }

    /**
     * Imposta il valore della proprietà iccid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICCID(String value) {
        this.iccid = value;
    }

    /**
     * Recupera il valore della proprietà cardfeatures.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARDFEATURES() {
        return cardfeatures;
    }

    /**
     * Imposta il valore della proprietà cardfeatures.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARDFEATURES(String value) {
        this.cardfeatures = value;
    }

    /**
     * Recupera il valore della proprietà cardphase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARDPHASE() {
        return cardphase;
    }

    /**
     * Imposta il valore della proprietà cardphase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARDPHASE(String value) {
        this.cardphase = value;
    }

}
