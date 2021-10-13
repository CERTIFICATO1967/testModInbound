//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.10.13 alle 05:11:06 PM CEST 
//


package it.telecomitalia.soa.trcs.gateway.recharge;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ZoneType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ZoneType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Dug" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Toponimo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Civkm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Codistat" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CAP" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Provincia" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Comune" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Distretti" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Latitudine" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Longitudine" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Prefisso_Cli" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Numero_Cli" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CodiceOfferta" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZoneType")
public class ZoneType {

    @XmlAttribute(name = "Dug")
    protected String dug;
    @XmlAttribute(name = "Toponimo")
    protected String toponimo;
    @XmlAttribute(name = "Civkm")
    protected String civkm;
    @XmlAttribute(name = "Codistat")
    protected String codistat;
    @XmlAttribute(name = "CAP")
    protected String cap;
    @XmlAttribute(name = "Provincia")
    protected String provincia;
    @XmlAttribute(name = "Comune")
    protected String comune;
    @XmlAttribute(name = "Distretti")
    protected String distretti;
    @XmlAttribute(name = "Latitudine")
    protected String latitudine;
    @XmlAttribute(name = "Longitudine")
    protected String longitudine;
    @XmlAttribute(name = "Prefisso_Cli")
    protected String prefissoCli;
    @XmlAttribute(name = "Numero_Cli")
    protected String numeroCli;
    @XmlAttribute(name = "CodiceOfferta")
    protected String codiceOfferta;

    /**
     * Recupera il valore della proprietà dug.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDug() {
        return dug;
    }

    /**
     * Imposta il valore della proprietà dug.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDug(String value) {
        this.dug = value;
    }

    /**
     * Recupera il valore della proprietà toponimo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToponimo() {
        return toponimo;
    }

    /**
     * Imposta il valore della proprietà toponimo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToponimo(String value) {
        this.toponimo = value;
    }

    /**
     * Recupera il valore della proprietà civkm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCivkm() {
        return civkm;
    }

    /**
     * Imposta il valore della proprietà civkm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCivkm(String value) {
        this.civkm = value;
    }

    /**
     * Recupera il valore della proprietà codistat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodistat() {
        return codistat;
    }

    /**
     * Imposta il valore della proprietà codistat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodistat(String value) {
        this.codistat = value;
    }

    /**
     * Recupera il valore della proprietà cap.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAP() {
        return cap;
    }

    /**
     * Imposta il valore della proprietà cap.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAP(String value) {
        this.cap = value;
    }

    /**
     * Recupera il valore della proprietà provincia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Imposta il valore della proprietà provincia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvincia(String value) {
        this.provincia = value;
    }

    /**
     * Recupera il valore della proprietà comune.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComune() {
        return comune;
    }

    /**
     * Imposta il valore della proprietà comune.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComune(String value) {
        this.comune = value;
    }

    /**
     * Recupera il valore della proprietà distretti.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistretti() {
        return distretti;
    }

    /**
     * Imposta il valore della proprietà distretti.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistretti(String value) {
        this.distretti = value;
    }

    /**
     * Recupera il valore della proprietà latitudine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitudine() {
        return latitudine;
    }

    /**
     * Imposta il valore della proprietà latitudine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitudine(String value) {
        this.latitudine = value;
    }

    /**
     * Recupera il valore della proprietà longitudine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitudine() {
        return longitudine;
    }

    /**
     * Imposta il valore della proprietà longitudine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitudine(String value) {
        this.longitudine = value;
    }

    /**
     * Recupera il valore della proprietà prefissoCli.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefissoCli() {
        return prefissoCli;
    }

    /**
     * Imposta il valore della proprietà prefissoCli.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefissoCli(String value) {
        this.prefissoCli = value;
    }

    /**
     * Recupera il valore della proprietà numeroCli.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCli() {
        return numeroCli;
    }

    /**
     * Imposta il valore della proprietà numeroCli.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCli(String value) {
        this.numeroCli = value;
    }

    /**
     * Recupera il valore della proprietà codiceOfferta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceOfferta() {
        return codiceOfferta;
    }

    /**
     * Imposta il valore della proprietà codiceOfferta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceOfferta(String value) {
        this.codiceOfferta = value;
    }

}
