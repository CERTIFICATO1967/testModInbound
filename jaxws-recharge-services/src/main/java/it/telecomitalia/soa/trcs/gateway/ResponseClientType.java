//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.10.13 alle 05:27:41 PM CEST 
//


package it.telecomitalia.soa.trcs.gateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Complex type describing Subscriber identification
 * 				information both for service usage and charging
 * 			
 * 
 * <p>Classe Java per ResponseClientType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ResponseClientType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element name="GSM" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="IMSI" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                       &lt;maxLength value="16"/&gt;
 *                       &lt;pattern value="[0-9]+"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="ICCID"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                       &lt;maxLength value="20"/&gt;
 *                       &lt;pattern value="[0-9]+"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="CodiceContratto"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                       &lt;maxLength value="15"/&gt;
 *                       &lt;minLength value="1"/&gt;
 *                       &lt;pattern value="[0-9]+"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Fixed" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="CIC"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                       &lt;maxLength value="16"/&gt;
 *                       &lt;minLength value="1"/&gt;
 *                       &lt;pattern value="[0-9]+"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="MSISDN" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;maxLength value="12"/&gt;
 *             &lt;pattern value="[0-9]+"/&gt;
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
@XmlType(name = "ResponseClientType", propOrder = {
    "gsm",
    "fixed"
})
@XmlSeeAlso({
    it.telecomitalia.soa.trcs.gateway.BaseResponseType.ClientKeys.class
})
public class ResponseClientType {

    @XmlElement(name = "GSM")
    protected ResponseClientType.GSM gsm;
    @XmlElement(name = "Fixed")
    protected ResponseClientType.Fixed fixed;
    @XmlAttribute(name = "MSISDN", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String msisdn;

    /**
     * Recupera il valore della proprietà gsm.
     * 
     * @return
     *     possible object is
     *     {@link ResponseClientType.GSM }
     *     
     */
    public ResponseClientType.GSM getGSM() {
        return gsm;
    }

    /**
     * Imposta il valore della proprietà gsm.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseClientType.GSM }
     *     
     */
    public void setGSM(ResponseClientType.GSM value) {
        this.gsm = value;
    }

    /**
     * Recupera il valore della proprietà fixed.
     * 
     * @return
     *     possible object is
     *     {@link ResponseClientType.Fixed }
     *     
     */
    public ResponseClientType.Fixed getFixed() {
        return fixed;
    }

    /**
     * Imposta il valore della proprietà fixed.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseClientType.Fixed }
     *     
     */
    public void setFixed(ResponseClientType.Fixed value) {
        this.fixed = value;
    }

    /**
     * Recupera il valore della proprietà msisdn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSISDN() {
        return msisdn;
    }

    /**
     * Imposta il valore della proprietà msisdn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSISDN(String value) {
        this.msisdn = value;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="CIC"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *             &lt;maxLength value="16"/&gt;
     *             &lt;minLength value="1"/&gt;
     *             &lt;pattern value="[0-9]+"/&gt;
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
    public static class Fixed {

        @XmlAttribute(name = "CIC")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String cic;

        /**
         * Recupera il valore della proprietà cic.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCIC() {
            return cic;
        }

        /**
         * Imposta il valore della proprietà cic.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCIC(String value) {
            this.cic = value;
        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="IMSI" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *             &lt;maxLength value="16"/&gt;
     *             &lt;pattern value="[0-9]+"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="ICCID"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *             &lt;maxLength value="20"/&gt;
     *             &lt;pattern value="[0-9]+"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="CodiceContratto"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *             &lt;maxLength value="15"/&gt;
     *             &lt;minLength value="1"/&gt;
     *             &lt;pattern value="[0-9]+"/&gt;
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
    public static class GSM {

        @XmlAttribute(name = "IMSI", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String imsi;
        @XmlAttribute(name = "ICCID")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String iccid;
        @XmlAttribute(name = "CodiceContratto")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String codiceContratto;

        /**
         * Recupera il valore della proprietà imsi.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIMSI() {
            return imsi;
        }

        /**
         * Imposta il valore della proprietà imsi.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIMSI(String value) {
            this.imsi = value;
        }

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
         * Recupera il valore della proprietà codiceContratto.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodiceContratto() {
            return codiceContratto;
        }

        /**
         * Imposta il valore della proprietà codiceContratto.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodiceContratto(String value) {
            this.codiceContratto = value;
        }

    }

}
