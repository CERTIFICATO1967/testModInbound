//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.09.01 alle 12:07:18 PM CEST 
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
 * <p>Classe Java per ClientType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ClientType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="GSM" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="IMSI" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                       &lt;maxLength value="16"/&gt;
 *                       &lt;minLength value="1"/&gt;
 *                       &lt;pattern value="[0-9]+"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="ICCID"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                       &lt;maxLength value="20"/&gt;
 *                       &lt;minLength value="1"/&gt;
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
 *         &lt;element name="PostPaid" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="TCG"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;maxLength value="1"/&gt;
 *                       &lt;minLength value="1"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="OV_COD"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;maxLength value="5"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="AccountService"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;maxLength value="1"/&gt;
 *                       &lt;enumeration value="S"/&gt;
 *                       &lt;enumeration value="N"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="CausaleRateizzazione"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;maxLength value="1"/&gt;
 *                       &lt;enumeration value="R"/&gt;
 *                       &lt;enumeration value="C"/&gt;
 *                       &lt;enumeration value="E"/&gt;
 *                       &lt;enumeration value="V"/&gt;
 *                       &lt;enumeration value="W"/&gt;
 *                       &lt;enumeration value="P"/&gt;
 *                       &lt;enumeration value="S"/&gt;
 *                       &lt;enumeration value="T"/&gt;
 *                       &lt;enumeration value=" "/&gt;
 *                       &lt;enumeration value=""/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="Convergente"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                       &lt;enumeration value="1"/&gt;
 *                       &lt;enumeration value="0"/&gt;
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
 *       &lt;/sequence&gt;
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
@XmlType(name = "ClientType", propOrder = {
    "gsm",
    "postPaid",
    "fixed"
})
@XmlSeeAlso({
    it.telecomitalia.soa.trcs.gateway.PersonalCreditSwitchIbData.ClientKeys.class,
    it.telecomitalia.soa.trcs.gateway.MigrateSubscriberXIbData.ClientKeys.class,
    it.telecomitalia.soa.trcs.gateway.InstallSubscriberXIbData.ClientKeys.class,
    it.telecomitalia.soa.trcs.gateway.DeleteSubscriberXIbData.ClientKeys.class,
    it.telecomitalia.soa.trcs.gateway.RestoreSubscriberXIbData.ClientKeys.class,
    it.telecomitalia.soa.trcs.gateway.SaleOperationXIbData.ClientKeys.class,
    it.telecomitalia.soa.trcs.gateway.SetSubscriberStatusXIbData.ClientKeys.class,
    it.telecomitalia.soa.trcs.gateway.ChangeTOCIbData.ClientKeys.class,
    it.telecomitalia.soa.trcs.gateway.PersonalDataManagerXIbData.ClientKeys.class,
    it.telecomitalia.soa.trcs.gateway.ChangeNumberIbData.ClientKeys.class,
    it.telecomitalia.soa.trcs.gateway.NetworkReconfigureIbData.ClientKeys.class
})
public class ClientType {

    @XmlElement(name = "GSM")
    protected ClientType.GSM gsm;
    @XmlElement(name = "PostPaid")
    protected ClientType.PostPaid postPaid;
    @XmlElement(name = "Fixed")
    protected ClientType.Fixed fixed;
    @XmlAttribute(name = "MSISDN", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String msisdn;

    /**
     * Recupera il valore della proprietà gsm.
     * 
     * @return
     *     possible object is
     *     {@link ClientType.GSM }
     *     
     */
    public ClientType.GSM getGSM() {
        return gsm;
    }

    /**
     * Imposta il valore della proprietà gsm.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientType.GSM }
     *     
     */
    public void setGSM(ClientType.GSM value) {
        this.gsm = value;
    }

    /**
     * Recupera il valore della proprietà postPaid.
     * 
     * @return
     *     possible object is
     *     {@link ClientType.PostPaid }
     *     
     */
    public ClientType.PostPaid getPostPaid() {
        return postPaid;
    }

    /**
     * Imposta il valore della proprietà postPaid.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientType.PostPaid }
     *     
     */
    public void setPostPaid(ClientType.PostPaid value) {
        this.postPaid = value;
    }

    /**
     * Recupera il valore della proprietà fixed.
     * 
     * @return
     *     possible object is
     *     {@link ClientType.Fixed }
     *     
     */
    public ClientType.Fixed getFixed() {
        return fixed;
    }

    /**
     * Imposta il valore della proprietà fixed.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientType.Fixed }
     *     
     */
    public void setFixed(ClientType.Fixed value) {
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
     *             &lt;minLength value="1"/&gt;
     *             &lt;pattern value="[0-9]+"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="ICCID"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *             &lt;maxLength value="20"/&gt;
     *             &lt;minLength value="1"/&gt;
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


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="TCG"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;maxLength value="1"/&gt;
     *             &lt;minLength value="1"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="OV_COD"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;maxLength value="5"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="AccountService"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;maxLength value="1"/&gt;
     *             &lt;enumeration value="S"/&gt;
     *             &lt;enumeration value="N"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="CausaleRateizzazione"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;maxLength value="1"/&gt;
     *             &lt;enumeration value="R"/&gt;
     *             &lt;enumeration value="C"/&gt;
     *             &lt;enumeration value="E"/&gt;
     *             &lt;enumeration value="V"/&gt;
     *             &lt;enumeration value="W"/&gt;
     *             &lt;enumeration value="P"/&gt;
     *             &lt;enumeration value="S"/&gt;
     *             &lt;enumeration value="T"/&gt;
     *             &lt;enumeration value=" "/&gt;
     *             &lt;enumeration value=""/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="Convergente"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *             &lt;enumeration value="1"/&gt;
     *             &lt;enumeration value="0"/&gt;
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
    public static class PostPaid {

        @XmlAttribute(name = "TCG")
        protected String tcg;
        @XmlAttribute(name = "OV_COD")
        protected String ovcod;
        @XmlAttribute(name = "AccountService")
        protected String accountService;
        @XmlAttribute(name = "CausaleRateizzazione")
        protected String causaleRateizzazione;
        @XmlAttribute(name = "Convergente")
        protected Integer convergente;

        /**
         * Recupera il valore della proprietà tcg.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTCG() {
            return tcg;
        }

        /**
         * Imposta il valore della proprietà tcg.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTCG(String value) {
            this.tcg = value;
        }

        /**
         * Recupera il valore della proprietà ovcod.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOVCOD() {
            return ovcod;
        }

        /**
         * Imposta il valore della proprietà ovcod.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOVCOD(String value) {
            this.ovcod = value;
        }

        /**
         * Recupera il valore della proprietà accountService.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountService() {
            return accountService;
        }

        /**
         * Imposta il valore della proprietà accountService.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountService(String value) {
            this.accountService = value;
        }

        /**
         * Recupera il valore della proprietà causaleRateizzazione.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCausaleRateizzazione() {
            return causaleRateizzazione;
        }

        /**
         * Imposta il valore della proprietà causaleRateizzazione.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCausaleRateizzazione(String value) {
            this.causaleRateizzazione = value;
        }

        /**
         * Recupera il valore della proprietà convergente.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getConvergente() {
            return convergente;
        }

        /**
         * Imposta il valore della proprietà convergente.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setConvergente(Integer value) {
            this.convergente = value;
        }

    }

}
