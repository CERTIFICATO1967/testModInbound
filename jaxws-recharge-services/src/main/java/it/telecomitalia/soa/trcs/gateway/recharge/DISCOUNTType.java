//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.10.13 alle 05:08:21 PM CEST 
//


package it.telecomitalia.soa.trcs.gateway.recharge;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DISCOUNTType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DISCOUNTType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="EXTENSIONCOST"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="18"/&gt;
 *             &lt;fractionDigits value="6"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="RENEWALCOST"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="18"/&gt;
 *             &lt;fractionDigits value="6"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="DISCOUNTVALUE" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="18"/&gt;
 *             &lt;fractionDigits value="6"/&gt;
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
@XmlType(name = "DISCOUNTType")
public class DISCOUNTType {

    @XmlAttribute(name = "EXTENSIONCOST")
    protected BigDecimal extensioncost;
    @XmlAttribute(name = "RENEWALCOST")
    protected BigDecimal renewalcost;
    @XmlAttribute(name = "DISCOUNTVALUE", required = true)
    protected BigDecimal discountvalue;

    /**
     * Recupera il valore della proprietà extensioncost.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXTENSIONCOST() {
        return extensioncost;
    }

    /**
     * Imposta il valore della proprietà extensioncost.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXTENSIONCOST(BigDecimal value) {
        this.extensioncost = value;
    }

    /**
     * Recupera il valore della proprietà renewalcost.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRENEWALCOST() {
        return renewalcost;
    }

    /**
     * Imposta il valore della proprietà renewalcost.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRENEWALCOST(BigDecimal value) {
        this.renewalcost = value;
    }

    /**
     * Recupera il valore della proprietà discountvalue.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDISCOUNTVALUE() {
        return discountvalue;
    }

    /**
     * Imposta il valore della proprietà discountvalue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDISCOUNTVALUE(BigDecimal value) {
        this.discountvalue = value;
    }

}
