//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.09.01 alle 12:07:18 PM CEST 
//


package it.telecomitalia.soa.trcs.gateway.infobus.commons;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import it.telecomitalia.soa.trcs.gateway.ChangeNumberRequest;
import it.telecomitalia.soa.trcs.gateway.ChangeNumberResponse;
import it.telecomitalia.soa.trcs.gateway.ChangeTocRequest;
import it.telecomitalia.soa.trcs.gateway.ChangeTocResponse;
import it.telecomitalia.soa.trcs.gateway.DeleteSubscriberXRequest;
import it.telecomitalia.soa.trcs.gateway.DeleteSubscriberXResponse;
import it.telecomitalia.soa.trcs.gateway.InstallSubscriberXRequest;
import it.telecomitalia.soa.trcs.gateway.InstallSubscriberXResponse;
import it.telecomitalia.soa.trcs.gateway.MigrateSubscriberXRequest;
import it.telecomitalia.soa.trcs.gateway.MigrateSubscriberXResponse;
import it.telecomitalia.soa.trcs.gateway.NetworkReconfigureRequest;
import it.telecomitalia.soa.trcs.gateway.NetworkReconfigureResponse;
import it.telecomitalia.soa.trcs.gateway.PersonalCreditSwitchRequest;
import it.telecomitalia.soa.trcs.gateway.PersonalCreditSwitchResponse;
import it.telecomitalia.soa.trcs.gateway.PersonalDataManagerXRequest;
import it.telecomitalia.soa.trcs.gateway.PersonalDataManagerXResponse;
import it.telecomitalia.soa.trcs.gateway.RestoreSubscriberXRequest;
import it.telecomitalia.soa.trcs.gateway.RestoreSubscriberXResponse;
import it.telecomitalia.soa.trcs.gateway.SaleOperationXRequest;
import it.telecomitalia.soa.trcs.gateway.SaleOperationXResponse;
import it.telecomitalia.soa.trcs.gateway.SetSubscriberStatusXRequest;
import it.telecomitalia.soa.trcs.gateway.SetSubscriberStatusXResponse;


/**
 * <p>Classe Java per InfobusXmlMessage complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="InfobusXmlMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
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
@XmlType(name = "InfobusXmlMessage")
@XmlSeeAlso({
    PersonalCreditSwitchResponse.class,
    PersonalCreditSwitchRequest.class,
    SetSubscriberStatusXResponse.class,
    SetSubscriberStatusXRequest.class,
    SaleOperationXResponse.class,
    SaleOperationXRequest.class,
    RestoreSubscriberXResponse.class,
    RestoreSubscriberXRequest.class,
    MigrateSubscriberXResponse.class,
    MigrateSubscriberXRequest.class,
    InstallSubscriberXResponse.class,
    InstallSubscriberXRequest.class,
    DeleteSubscriberXResponse.class,
    DeleteSubscriberXRequest.class,
    PersonalDataManagerXResponse.class,
    PersonalDataManagerXRequest.class,
    ChangeNumberResponse.class,
    ChangeNumberRequest.class,
    ChangeTocResponse.class,
    ChangeTocRequest.class,
    NetworkReconfigureResponse.class,
    NetworkReconfigureRequest.class
})
public class InfobusXmlMessage {

    @XmlAttribute(name = "ib_id_srvc", required = true)
    protected String ibIdSrvc;
    @XmlAttribute(name = "ib_appDep1")
    protected String ibAppDep1;
    @XmlAttribute(name = "ib_appDep2")
    protected String ibAppDep2;
    @XmlAttribute(name = "ib_ret_code")
    protected String ibRetCode;

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

}
