//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.08.02 alle 11:23:32 AM CEST 
//


package it.telecomitalia.soa.trcs.gateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ADSLType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ADSLType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="RTG" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CFAWireline" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ADSLType")
public class ADSLType {

    @XmlAttribute(name = "RTG")
    protected String rtg;
    @XmlAttribute(name = "CFAWireline")
    protected String cfaWireline;

    /**
     * Recupera il valore della proprietà rtg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTG() {
        return rtg;
    }

    /**
     * Imposta il valore della proprietà rtg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTG(String value) {
        this.rtg = value;
    }

    /**
     * Recupera il valore della proprietà cfaWireline.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCFAWireline() {
        return cfaWireline;
    }

    /**
     * Imposta il valore della proprietà cfaWireline.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCFAWireline(String value) {
        this.cfaWireline = value;
    }

}
