//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.10.13 alle 04:12:20 PM CEST 
//


package it.telecomitalia.soa.trcs.gateway.infobus.commons;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java per InfobusMessage complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="InfobusMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ibData"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="ib_len_data" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ib_id_srvc" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ib_appDep1" type="{http://www.w3.org/2001/XMLSchema}string" default="0" /&gt;
 *       &lt;attribute name="ib_appDep2" type="{http://www.w3.org/2001/XMLSchema}string" default="0" /&gt;
 *       &lt;attribute name="ib_ret_code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfobusMessage", propOrder = {
    "ibData"
})
public class InfobusMessage {

    @XmlElement(required = true)
    protected InfobusMessage.IbData ibData;
    @XmlAttribute(name = "ib_id_srvc", required = true)
    protected String ibIdSrvc;
    @XmlAttribute(name = "ib_appDep1")
    protected String ibAppDep1;
    @XmlAttribute(name = "ib_appDep2")
    protected String ibAppDep2;
    @XmlAttribute(name = "ib_ret_code")
    protected String ibRetCode;

    /**
     * Recupera il valore della proprietà ibData.
     * 
     * @return
     *     possible object is
     *     {@link InfobusMessage.IbData }
     *     
     */
    public InfobusMessage.IbData getIbData() {
        return ibData;
    }

    /**
     * Imposta il valore della proprietà ibData.
     * 
     * @param value
     *     allowed object is
     *     {@link InfobusMessage.IbData }
     *     
     */
    public void setIbData(InfobusMessage.IbData value) {
        this.ibData = value;
    }

    /**
     * Recupera il valore della proprietà ibIdSrvc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIbIdSrvc() {
        return ibIdSrvc;
    }

    /**
     * Imposta il valore della proprietà ibIdSrvc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIbIdSrvc(String value) {
        this.ibIdSrvc = value;
    }

    /**
     * Recupera il valore della proprietà ibAppDep1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIbAppDep1() {
        if (ibAppDep1 == null) {
            return "0";
        } else {
            return ibAppDep1;
        }
    }

    /**
     * Imposta il valore della proprietà ibAppDep1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIbAppDep1(String value) {
        this.ibAppDep1 = value;
    }

    /**
     * Recupera il valore della proprietà ibAppDep2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIbAppDep2() {
        if (ibAppDep2 == null) {
            return "0";
        } else {
            return ibAppDep2;
        }
    }

    /**
     * Imposta il valore della proprietà ibAppDep2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIbAppDep2(String value) {
        this.ibAppDep2 = value;
    }

    /**
     * Recupera il valore della proprietà ibRetCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIbRetCode() {
        return ibRetCode;
    }

    /**
     * Imposta il valore della proprietà ibRetCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIbRetCode(String value) {
        this.ibRetCode = value;
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
     *       &lt;attribute name="ib_len_data" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&gt;
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
    public static class IbData {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "ib_len_data", required = true)
        @XmlSchemaType(name = "unsignedInt")
        protected long ibLenData;

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

        /**
         * Recupera il valore della proprietà ibLenData.
         * 
         */
        public long getIbLenData() {
            return ibLenData;
        }

        /**
         * Imposta il valore della proprietà ibLenData.
         * 
         */
        public void setIbLenData(long value) {
            this.ibLenData = value;
        }

    }

}
