//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.09.01 alle 12:07:18 PM CEST 
//


package it.telecomitalia.soa.trcs.gateway;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per RestoreSubscriberXIbData complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RestoreSubscriberXIbData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Transaction"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://telecomitalia.it/SOA/TRCS/Gateway}TransactionType"&gt;
 *                 &lt;attribute name="MRTID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="MRCallBack" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="TDBCount" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="NMExpected"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="true"/&gt;
 *                       &lt;enumeration value="false"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ClientKeys" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://telecomitalia.it/SOA/TRCS/Gateway}ClientType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Operation"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RestoreSubscriber"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Client"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;choice&gt;
 *                                       &lt;element name="GSM"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="IMSI" use="required"&gt;
 *                                                 &lt;simpleType&gt;
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                                     &lt;maxLength value="16"/&gt;
 *                                                     &lt;pattern value="[0-9]+"/&gt;
 *                                                   &lt;/restriction&gt;
 *                                                 &lt;/simpleType&gt;
 *                                               &lt;/attribute&gt;
 *                                               &lt;attribute name="ICCID" use="required"&gt;
 *                                                 &lt;simpleType&gt;
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                                     &lt;maxLength value="20"/&gt;
 *                                                     &lt;pattern value="[0-9]+"/&gt;
 *                                                   &lt;/restriction&gt;
 *                                                 &lt;/simpleType&gt;
 *                                               &lt;/attribute&gt;
 *                                               &lt;attribute name="CardFeature" use="required"&gt;
 *                                                 &lt;simpleType&gt;
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                     &lt;length value="8"/&gt;
 *                                                     &lt;whiteSpace value="preserve"/&gt;
 *                                                   &lt;/restriction&gt;
 *                                                 &lt;/simpleType&gt;
 *                                               &lt;/attribute&gt;
 *                                               &lt;attribute name="CardPhase" use="required"&gt;
 *                                                 &lt;simpleType&gt;
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                     &lt;maxLength value="2"/&gt;
 *                                                     &lt;minLength value="0"/&gt;
 *                                                     &lt;whiteSpace value="preserve"/&gt;
 *                                                   &lt;/restriction&gt;
 *                                                 &lt;/simpleType&gt;
 *                                               &lt;/attribute&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="TACS"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="Category" use="required"&gt;
 *                                                 &lt;simpleType&gt;
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                     &lt;minLength value="0"/&gt;
 *                                                     &lt;maxLength value="6"/&gt;
 *                                                     &lt;whiteSpace value="preserve"/&gt;
 *                                                   &lt;/restriction&gt;
 *                                                 &lt;/simpleType&gt;
 *                                               &lt;/attribute&gt;
 *                                               &lt;attribute name="SRNB" use="required"&gt;
 *                                                 &lt;simpleType&gt;
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                                     &lt;minLength value="1"/&gt;
 *                                                     &lt;maxLength value="11"/&gt;
 *                                                     &lt;pattern value="[0-9]+"/&gt;
 *                                                   &lt;/restriction&gt;
 *                                                 &lt;/simpleType&gt;
 *                                               &lt;/attribute&gt;
 *                                               &lt;attribute name="CodeB" use="required"&gt;
 *                                                 &lt;simpleType&gt;
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                                     &lt;minLength value="1"/&gt;
 *                                                     &lt;maxLength value="11"/&gt;
 *                                                     &lt;pattern value="[0-9]+"/&gt;
 *                                                   &lt;/restriction&gt;
 *                                                 &lt;/simpleType&gt;
 *                                               &lt;/attribute&gt;
 *                                               &lt;attribute name="Tipo" use="required"&gt;
 *                                                 &lt;simpleType&gt;
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                                     &lt;minLength value="1"/&gt;
 *                                                     &lt;maxLength value="2"/&gt;
 *                                                     &lt;pattern value="[0-9]+"/&gt;
 *                                                   &lt;/restriction&gt;
 *                                                 &lt;/simpleType&gt;
 *                                               &lt;/attribute&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/choice&gt;
 *                                     &lt;attribute name="Reason" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;maxLength value="2"/&gt;
 *                                           &lt;minLength value="1"/&gt;
 *                                           &lt;whiteSpace value="preserve"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="LanguageId" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                           &lt;maxLength value="2"/&gt;
 *                                           &lt;minLength value="1"/&gt;
 *                                           &lt;pattern value="[0-9]+"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="TypeOfCard" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;maxLength value="2"/&gt;
 *                                           &lt;minLength value="1"/&gt;
 *                                           &lt;whiteSpace value="preserve"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="NumReloads" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                           &lt;maxLength value="5"/&gt;
 *                                           &lt;minLength value="1"/&gt;
 *                                           &lt;pattern value="[0-9]+"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="Deactivated" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                                     &lt;attribute name="NotifyType" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;maxLength value="1"/&gt;
 *                                           &lt;minLength value="1"/&gt;
 *                                           &lt;whiteSpace value="preserve"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="NumTariffs" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                           &lt;maxLength value="5"/&gt;
 *                                           &lt;minLength value="1"/&gt;
 *                                           &lt;pattern value="[0-9]+"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="LastChangeTariff"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;whiteSpace value="preserve"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="InstallationDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                                     &lt;attribute name="ActivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                                     &lt;attribute name="DeactivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                                     &lt;attribute name="ServiceProviderId" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;minLength value="1"/&gt;
 *                                           &lt;maxLength value="5"/&gt;
 *                                           &lt;whiteSpace value="preserve"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="LastEventDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                                     &lt;attribute name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                                     &lt;attribute name="AccountType"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="ResFromExpReas" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Subscription" type="{http://telecomitalia.it/SOA/TRCS/Gateway}MandatorySubscriptionType" maxOccurs="unbounded"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="RestoreType" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                 &lt;minLength value="1"/&gt;
 *                                 &lt;enumeration value="NumPortSubscr"/&gt;
 *                                 &lt;enumeration value="MnpSubscr"/&gt;
 *                                 &lt;enumeration value="MnpFdSubscr"/&gt;
 *                                 &lt;enumeration value="ExpSubscr"/&gt;
 *                                 &lt;enumeration value="Normal"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="ActiveTime"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                 &lt;maxLength value="5"/&gt;
 *                                 &lt;pattern value="[0-9]+"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="LifeTime"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                 &lt;maxLength value="5"/&gt;
 *                                 &lt;pattern value="[0-9]+"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="NewBillRunMode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="OperationType" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;minLength value="1"/&gt;
 *                       &lt;enumeration value="RestoreSubscriber"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="Info"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;whiteSpace value="preserve"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RequestType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="OneStep"/&gt;
 *             &lt;enumeration value="TwoStep"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ResponseType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Positive"/&gt;
 *             &lt;enumeration value="All"/&gt;
 *             &lt;enumeration value="None"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ExtendedResponse"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="OldAccount"/&gt;
 *             &lt;enumeration value="NewAccount"/&gt;
 *             &lt;enumeration value="OldAccountGroup"/&gt;
 *             &lt;enumeration value="NewAccountGroup"/&gt;
 *             &lt;enumeration value="NewMemberIDList"/&gt;
 *             &lt;enumeration value="OldMemberIDList"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ExtendedResponseFilter" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestoreSubscriberXIbData", propOrder = {
    "transaction",
    "clientKeys",
    "operation"
})
public class RestoreSubscriberXIbData {

    @XmlElement(name = "Transaction", required = true)
    protected RestoreSubscriberXIbData.Transaction transaction;
    @XmlElement(name = "ClientKeys")
    protected RestoreSubscriberXIbData.ClientKeys clientKeys;
    @XmlElement(name = "Operation", required = true)
    protected RestoreSubscriberXIbData.Operation operation;
    @XmlAttribute(name = "RequestType")
    protected String requestType;
    @XmlAttribute(name = "ResponseType")
    protected String responseType;
    @XmlAttribute(name = "ExtendedResponse")
    protected String extendedResponse;
    @XmlAttribute(name = "ExtendedResponseFilter")
    protected String extendedResponseFilter;

    /**
     * Recupera il valore della proprietà transaction.
     * 
     * @return
     *     possible object is
     *     {@link RestoreSubscriberXIbData.Transaction }
     *     
     */
    public RestoreSubscriberXIbData.Transaction getTransaction() {
        return transaction;
    }

    /**
     * Imposta il valore della proprietà transaction.
     * 
     * @param value
     *     allowed object is
     *     {@link RestoreSubscriberXIbData.Transaction }
     *     
     */
    public void setTransaction(RestoreSubscriberXIbData.Transaction value) {
        this.transaction = value;
    }

    /**
     * Recupera il valore della proprietà clientKeys.
     * 
     * @return
     *     possible object is
     *     {@link RestoreSubscriberXIbData.ClientKeys }
     *     
     */
    public RestoreSubscriberXIbData.ClientKeys getClientKeys() {
        return clientKeys;
    }

    /**
     * Imposta il valore della proprietà clientKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link RestoreSubscriberXIbData.ClientKeys }
     *     
     */
    public void setClientKeys(RestoreSubscriberXIbData.ClientKeys value) {
        this.clientKeys = value;
    }

    /**
     * Recupera il valore della proprietà operation.
     * 
     * @return
     *     possible object is
     *     {@link RestoreSubscriberXIbData.Operation }
     *     
     */
    public RestoreSubscriberXIbData.Operation getOperation() {
        return operation;
    }

    /**
     * Imposta il valore della proprietà operation.
     * 
     * @param value
     *     allowed object is
     *     {@link RestoreSubscriberXIbData.Operation }
     *     
     */
    public void setOperation(RestoreSubscriberXIbData.Operation value) {
        this.operation = value;
    }

    /**
     * Recupera il valore della proprietà requestType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestType() {
        return requestType;
    }

    /**
     * Imposta il valore della proprietà requestType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestType(String value) {
        this.requestType = value;
    }

    /**
     * Recupera il valore della proprietà responseType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseType() {
        return responseType;
    }

    /**
     * Imposta il valore della proprietà responseType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseType(String value) {
        this.responseType = value;
    }

    /**
     * Recupera il valore della proprietà extendedResponse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedResponse() {
        return extendedResponse;
    }

    /**
     * Imposta il valore della proprietà extendedResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedResponse(String value) {
        this.extendedResponse = value;
    }

    /**
     * Recupera il valore della proprietà extendedResponseFilter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedResponseFilter() {
        return extendedResponseFilter;
    }

    /**
     * Imposta il valore della proprietà extendedResponseFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedResponseFilter(String value) {
        this.extendedResponseFilter = value;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://telecomitalia.it/SOA/TRCS/Gateway}ClientType"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ClientKeys
        extends ClientType
    {


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
     *       &lt;sequence&gt;
     *         &lt;element name="RestoreSubscriber"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Client"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;choice&gt;
     *                             &lt;element name="GSM"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="IMSI" use="required"&gt;
     *                                       &lt;simpleType&gt;
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                           &lt;maxLength value="16"/&gt;
     *                                           &lt;pattern value="[0-9]+"/&gt;
     *                                         &lt;/restriction&gt;
     *                                       &lt;/simpleType&gt;
     *                                     &lt;/attribute&gt;
     *                                     &lt;attribute name="ICCID" use="required"&gt;
     *                                       &lt;simpleType&gt;
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                           &lt;maxLength value="20"/&gt;
     *                                           &lt;pattern value="[0-9]+"/&gt;
     *                                         &lt;/restriction&gt;
     *                                       &lt;/simpleType&gt;
     *                                     &lt;/attribute&gt;
     *                                     &lt;attribute name="CardFeature" use="required"&gt;
     *                                       &lt;simpleType&gt;
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                           &lt;length value="8"/&gt;
     *                                           &lt;whiteSpace value="preserve"/&gt;
     *                                         &lt;/restriction&gt;
     *                                       &lt;/simpleType&gt;
     *                                     &lt;/attribute&gt;
     *                                     &lt;attribute name="CardPhase" use="required"&gt;
     *                                       &lt;simpleType&gt;
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                           &lt;maxLength value="2"/&gt;
     *                                           &lt;minLength value="0"/&gt;
     *                                           &lt;whiteSpace value="preserve"/&gt;
     *                                         &lt;/restriction&gt;
     *                                       &lt;/simpleType&gt;
     *                                     &lt;/attribute&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="TACS"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="Category" use="required"&gt;
     *                                       &lt;simpleType&gt;
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                           &lt;minLength value="0"/&gt;
     *                                           &lt;maxLength value="6"/&gt;
     *                                           &lt;whiteSpace value="preserve"/&gt;
     *                                         &lt;/restriction&gt;
     *                                       &lt;/simpleType&gt;
     *                                     &lt;/attribute&gt;
     *                                     &lt;attribute name="SRNB" use="required"&gt;
     *                                       &lt;simpleType&gt;
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                           &lt;minLength value="1"/&gt;
     *                                           &lt;maxLength value="11"/&gt;
     *                                           &lt;pattern value="[0-9]+"/&gt;
     *                                         &lt;/restriction&gt;
     *                                       &lt;/simpleType&gt;
     *                                     &lt;/attribute&gt;
     *                                     &lt;attribute name="CodeB" use="required"&gt;
     *                                       &lt;simpleType&gt;
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                           &lt;minLength value="1"/&gt;
     *                                           &lt;maxLength value="11"/&gt;
     *                                           &lt;pattern value="[0-9]+"/&gt;
     *                                         &lt;/restriction&gt;
     *                                       &lt;/simpleType&gt;
     *                                     &lt;/attribute&gt;
     *                                     &lt;attribute name="Tipo" use="required"&gt;
     *                                       &lt;simpleType&gt;
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                           &lt;minLength value="1"/&gt;
     *                                           &lt;maxLength value="2"/&gt;
     *                                           &lt;pattern value="[0-9]+"/&gt;
     *                                         &lt;/restriction&gt;
     *                                       &lt;/simpleType&gt;
     *                                     &lt;/attribute&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/choice&gt;
     *                           &lt;attribute name="Reason" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;maxLength value="2"/&gt;
     *                                 &lt;minLength value="1"/&gt;
     *                                 &lt;whiteSpace value="preserve"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="LanguageId" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                 &lt;maxLength value="2"/&gt;
     *                                 &lt;minLength value="1"/&gt;
     *                                 &lt;pattern value="[0-9]+"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="TypeOfCard" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;maxLength value="2"/&gt;
     *                                 &lt;minLength value="1"/&gt;
     *                                 &lt;whiteSpace value="preserve"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="NumReloads" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                 &lt;maxLength value="5"/&gt;
     *                                 &lt;minLength value="1"/&gt;
     *                                 &lt;pattern value="[0-9]+"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="Deactivated" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *                           &lt;attribute name="NotifyType" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;maxLength value="1"/&gt;
     *                                 &lt;minLength value="1"/&gt;
     *                                 &lt;whiteSpace value="preserve"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="NumTariffs" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                 &lt;maxLength value="5"/&gt;
     *                                 &lt;minLength value="1"/&gt;
     *                                 &lt;pattern value="[0-9]+"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="LastChangeTariff"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;whiteSpace value="preserve"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="InstallationDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *                           &lt;attribute name="ActivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *                           &lt;attribute name="DeactivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *                           &lt;attribute name="ServiceProviderId" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;minLength value="1"/&gt;
     *                                 &lt;maxLength value="5"/&gt;
     *                                 &lt;whiteSpace value="preserve"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="LastEventDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *                           &lt;attribute name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *                           &lt;attribute name="AccountType"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="ResFromExpReas" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Subscription" type="{http://telecomitalia.it/SOA/TRCS/Gateway}MandatorySubscriptionType" maxOccurs="unbounded"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="RestoreType" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                       &lt;minLength value="1"/&gt;
     *                       &lt;enumeration value="NumPortSubscr"/&gt;
     *                       &lt;enumeration value="MnpSubscr"/&gt;
     *                       &lt;enumeration value="MnpFdSubscr"/&gt;
     *                       &lt;enumeration value="ExpSubscr"/&gt;
     *                       &lt;enumeration value="Normal"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="ActiveTime"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                       &lt;maxLength value="5"/&gt;
     *                       &lt;pattern value="[0-9]+"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="LifeTime"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                       &lt;maxLength value="5"/&gt;
     *                       &lt;pattern value="[0-9]+"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="NewBillRunMode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="OperationType" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;minLength value="1"/&gt;
     *             &lt;enumeration value="RestoreSubscriber"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="Info"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;whiteSpace value="preserve"/&gt;
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
    @XmlType(name = "", propOrder = {
        "restoreSubscriber"
    })
    public static class Operation {

        @XmlElement(name = "RestoreSubscriber", required = true)
        protected RestoreSubscriberXIbData.Operation.RestoreSubscriber restoreSubscriber;
        @XmlAttribute(name = "OperationType", required = true)
        protected String operationType;
        @XmlAttribute(name = "Info")
        protected String info;

        /**
         * Recupera il valore della proprietà restoreSubscriber.
         * 
         * @return
         *     possible object is
         *     {@link RestoreSubscriberXIbData.Operation.RestoreSubscriber }
         *     
         */
        public RestoreSubscriberXIbData.Operation.RestoreSubscriber getRestoreSubscriber() {
            return restoreSubscriber;
        }

        /**
         * Imposta il valore della proprietà restoreSubscriber.
         * 
         * @param value
         *     allowed object is
         *     {@link RestoreSubscriberXIbData.Operation.RestoreSubscriber }
         *     
         */
        public void setRestoreSubscriber(RestoreSubscriberXIbData.Operation.RestoreSubscriber value) {
            this.restoreSubscriber = value;
        }

        /**
         * Recupera il valore della proprietà operationType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperationType() {
            return operationType;
        }

        /**
         * Imposta il valore della proprietà operationType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperationType(String value) {
            this.operationType = value;
        }

        /**
         * Recupera il valore della proprietà info.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInfo() {
            return info;
        }

        /**
         * Imposta il valore della proprietà info.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInfo(String value) {
            this.info = value;
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
         *       &lt;sequence&gt;
         *         &lt;element name="Client"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;choice&gt;
         *                   &lt;element name="GSM"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="IMSI" use="required"&gt;
         *                             &lt;simpleType&gt;
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                                 &lt;maxLength value="16"/&gt;
         *                                 &lt;pattern value="[0-9]+"/&gt;
         *                               &lt;/restriction&gt;
         *                             &lt;/simpleType&gt;
         *                           &lt;/attribute&gt;
         *                           &lt;attribute name="ICCID" use="required"&gt;
         *                             &lt;simpleType&gt;
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                                 &lt;maxLength value="20"/&gt;
         *                                 &lt;pattern value="[0-9]+"/&gt;
         *                               &lt;/restriction&gt;
         *                             &lt;/simpleType&gt;
         *                           &lt;/attribute&gt;
         *                           &lt;attribute name="CardFeature" use="required"&gt;
         *                             &lt;simpleType&gt;
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                 &lt;length value="8"/&gt;
         *                                 &lt;whiteSpace value="preserve"/&gt;
         *                               &lt;/restriction&gt;
         *                             &lt;/simpleType&gt;
         *                           &lt;/attribute&gt;
         *                           &lt;attribute name="CardPhase" use="required"&gt;
         *                             &lt;simpleType&gt;
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                 &lt;maxLength value="2"/&gt;
         *                                 &lt;minLength value="0"/&gt;
         *                                 &lt;whiteSpace value="preserve"/&gt;
         *                               &lt;/restriction&gt;
         *                             &lt;/simpleType&gt;
         *                           &lt;/attribute&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="TACS"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="Category" use="required"&gt;
         *                             &lt;simpleType&gt;
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                 &lt;minLength value="0"/&gt;
         *                                 &lt;maxLength value="6"/&gt;
         *                                 &lt;whiteSpace value="preserve"/&gt;
         *                               &lt;/restriction&gt;
         *                             &lt;/simpleType&gt;
         *                           &lt;/attribute&gt;
         *                           &lt;attribute name="SRNB" use="required"&gt;
         *                             &lt;simpleType&gt;
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                                 &lt;minLength value="1"/&gt;
         *                                 &lt;maxLength value="11"/&gt;
         *                                 &lt;pattern value="[0-9]+"/&gt;
         *                               &lt;/restriction&gt;
         *                             &lt;/simpleType&gt;
         *                           &lt;/attribute&gt;
         *                           &lt;attribute name="CodeB" use="required"&gt;
         *                             &lt;simpleType&gt;
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                                 &lt;minLength value="1"/&gt;
         *                                 &lt;maxLength value="11"/&gt;
         *                                 &lt;pattern value="[0-9]+"/&gt;
         *                               &lt;/restriction&gt;
         *                             &lt;/simpleType&gt;
         *                           &lt;/attribute&gt;
         *                           &lt;attribute name="Tipo" use="required"&gt;
         *                             &lt;simpleType&gt;
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                                 &lt;minLength value="1"/&gt;
         *                                 &lt;maxLength value="2"/&gt;
         *                                 &lt;pattern value="[0-9]+"/&gt;
         *                               &lt;/restriction&gt;
         *                             &lt;/simpleType&gt;
         *                           &lt;/attribute&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/choice&gt;
         *                 &lt;attribute name="Reason" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;maxLength value="2"/&gt;
         *                       &lt;minLength value="1"/&gt;
         *                       &lt;whiteSpace value="preserve"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="LanguageId" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                       &lt;maxLength value="2"/&gt;
         *                       &lt;minLength value="1"/&gt;
         *                       &lt;pattern value="[0-9]+"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="TypeOfCard" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;maxLength value="2"/&gt;
         *                       &lt;minLength value="1"/&gt;
         *                       &lt;whiteSpace value="preserve"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="NumReloads" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                       &lt;maxLength value="5"/&gt;
         *                       &lt;minLength value="1"/&gt;
         *                       &lt;pattern value="[0-9]+"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="Deactivated" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
         *                 &lt;attribute name="NotifyType" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;maxLength value="1"/&gt;
         *                       &lt;minLength value="1"/&gt;
         *                       &lt;whiteSpace value="preserve"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="NumTariffs" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                       &lt;maxLength value="5"/&gt;
         *                       &lt;minLength value="1"/&gt;
         *                       &lt;pattern value="[0-9]+"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="LastChangeTariff"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;whiteSpace value="preserve"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="InstallationDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
         *                 &lt;attribute name="ActivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
         *                 &lt;attribute name="DeactivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
         *                 &lt;attribute name="ServiceProviderId" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;minLength value="1"/&gt;
         *                       &lt;maxLength value="5"/&gt;
         *                       &lt;whiteSpace value="preserve"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="LastEventDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
         *                 &lt;attribute name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
         *                 &lt;attribute name="AccountType"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="ResFromExpReas" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Subscription" type="{http://telecomitalia.it/SOA/TRCS/Gateway}MandatorySubscriptionType" maxOccurs="unbounded"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="RestoreType" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *             &lt;minLength value="1"/&gt;
         *             &lt;enumeration value="NumPortSubscr"/&gt;
         *             &lt;enumeration value="MnpSubscr"/&gt;
         *             &lt;enumeration value="MnpFdSubscr"/&gt;
         *             &lt;enumeration value="ExpSubscr"/&gt;
         *             &lt;enumeration value="Normal"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="ActiveTime"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *             &lt;maxLength value="5"/&gt;
         *             &lt;pattern value="[0-9]+"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="LifeTime"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *             &lt;maxLength value="5"/&gt;
         *             &lt;pattern value="[0-9]+"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="NewBillRunMode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "client",
            "subscription"
        })
        public static class RestoreSubscriber {

            @XmlElement(name = "Client", required = true)
            protected RestoreSubscriberXIbData.Operation.RestoreSubscriber.Client client;
            @XmlElement(name = "Subscription", required = true)
            protected List<MandatorySubscriptionType> subscription;
            @XmlAttribute(name = "RestoreType", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String restoreType;
            @XmlAttribute(name = "ActiveTime")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String activeTime;
            @XmlAttribute(name = "LifeTime")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String lifeTime;
            @XmlAttribute(name = "NewBillRunMode")
            protected String newBillRunMode;

            /**
             * Recupera il valore della proprietà client.
             * 
             * @return
             *     possible object is
             *     {@link RestoreSubscriberXIbData.Operation.RestoreSubscriber.Client }
             *     
             */
            public RestoreSubscriberXIbData.Operation.RestoreSubscriber.Client getClient() {
                return client;
            }

            /**
             * Imposta il valore della proprietà client.
             * 
             * @param value
             *     allowed object is
             *     {@link RestoreSubscriberXIbData.Operation.RestoreSubscriber.Client }
             *     
             */
            public void setClient(RestoreSubscriberXIbData.Operation.RestoreSubscriber.Client value) {
                this.client = value;
            }

            /**
             * Gets the value of the subscription property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the subscription property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSubscription().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MandatorySubscriptionType }
             * 
             * 
             */
            public List<MandatorySubscriptionType> getSubscription() {
                if (subscription == null) {
                    subscription = new ArrayList<MandatorySubscriptionType>();
                }
                return this.subscription;
            }

            /**
             * Recupera il valore della proprietà restoreType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRestoreType() {
                return restoreType;
            }

            /**
             * Imposta il valore della proprietà restoreType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRestoreType(String value) {
                this.restoreType = value;
            }

            /**
             * Recupera il valore della proprietà activeTime.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActiveTime() {
                return activeTime;
            }

            /**
             * Imposta il valore della proprietà activeTime.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActiveTime(String value) {
                this.activeTime = value;
            }

            /**
             * Recupera il valore della proprietà lifeTime.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLifeTime() {
                return lifeTime;
            }

            /**
             * Imposta il valore della proprietà lifeTime.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLifeTime(String value) {
                this.lifeTime = value;
            }

            /**
             * Recupera il valore della proprietà newBillRunMode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNewBillRunMode() {
                return newBillRunMode;
            }

            /**
             * Imposta il valore della proprietà newBillRunMode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNewBillRunMode(String value) {
                this.newBillRunMode = value;
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
             *       &lt;choice&gt;
             *         &lt;element name="GSM"&gt;
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
             *                 &lt;attribute name="ICCID" use="required"&gt;
             *                   &lt;simpleType&gt;
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
             *                       &lt;maxLength value="20"/&gt;
             *                       &lt;pattern value="[0-9]+"/&gt;
             *                     &lt;/restriction&gt;
             *                   &lt;/simpleType&gt;
             *                 &lt;/attribute&gt;
             *                 &lt;attribute name="CardFeature" use="required"&gt;
             *                   &lt;simpleType&gt;
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                       &lt;length value="8"/&gt;
             *                       &lt;whiteSpace value="preserve"/&gt;
             *                     &lt;/restriction&gt;
             *                   &lt;/simpleType&gt;
             *                 &lt;/attribute&gt;
             *                 &lt;attribute name="CardPhase" use="required"&gt;
             *                   &lt;simpleType&gt;
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                       &lt;maxLength value="2"/&gt;
             *                       &lt;minLength value="0"/&gt;
             *                       &lt;whiteSpace value="preserve"/&gt;
             *                     &lt;/restriction&gt;
             *                   &lt;/simpleType&gt;
             *                 &lt;/attribute&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="TACS"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="Category" use="required"&gt;
             *                   &lt;simpleType&gt;
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                       &lt;minLength value="0"/&gt;
             *                       &lt;maxLength value="6"/&gt;
             *                       &lt;whiteSpace value="preserve"/&gt;
             *                     &lt;/restriction&gt;
             *                   &lt;/simpleType&gt;
             *                 &lt;/attribute&gt;
             *                 &lt;attribute name="SRNB" use="required"&gt;
             *                   &lt;simpleType&gt;
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
             *                       &lt;minLength value="1"/&gt;
             *                       &lt;maxLength value="11"/&gt;
             *                       &lt;pattern value="[0-9]+"/&gt;
             *                     &lt;/restriction&gt;
             *                   &lt;/simpleType&gt;
             *                 &lt;/attribute&gt;
             *                 &lt;attribute name="CodeB" use="required"&gt;
             *                   &lt;simpleType&gt;
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
             *                       &lt;minLength value="1"/&gt;
             *                       &lt;maxLength value="11"/&gt;
             *                       &lt;pattern value="[0-9]+"/&gt;
             *                     &lt;/restriction&gt;
             *                   &lt;/simpleType&gt;
             *                 &lt;/attribute&gt;
             *                 &lt;attribute name="Tipo" use="required"&gt;
             *                   &lt;simpleType&gt;
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
             *                       &lt;minLength value="1"/&gt;
             *                       &lt;maxLength value="2"/&gt;
             *                       &lt;pattern value="[0-9]+"/&gt;
             *                     &lt;/restriction&gt;
             *                   &lt;/simpleType&gt;
             *                 &lt;/attribute&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/choice&gt;
             *       &lt;attribute name="Reason" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;maxLength value="2"/&gt;
             *             &lt;minLength value="1"/&gt;
             *             &lt;whiteSpace value="preserve"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="LanguageId" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
             *             &lt;maxLength value="2"/&gt;
             *             &lt;minLength value="1"/&gt;
             *             &lt;pattern value="[0-9]+"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="TypeOfCard" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;maxLength value="2"/&gt;
             *             &lt;minLength value="1"/&gt;
             *             &lt;whiteSpace value="preserve"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="NumReloads" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
             *             &lt;maxLength value="5"/&gt;
             *             &lt;minLength value="1"/&gt;
             *             &lt;pattern value="[0-9]+"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="Deactivated" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
             *       &lt;attribute name="NotifyType" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;maxLength value="1"/&gt;
             *             &lt;minLength value="1"/&gt;
             *             &lt;whiteSpace value="preserve"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="NumTariffs" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
             *             &lt;maxLength value="5"/&gt;
             *             &lt;minLength value="1"/&gt;
             *             &lt;pattern value="[0-9]+"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="LastChangeTariff"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;whiteSpace value="preserve"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="InstallationDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
             *       &lt;attribute name="ActivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
             *       &lt;attribute name="DeactivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
             *       &lt;attribute name="ServiceProviderId" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;minLength value="1"/&gt;
             *             &lt;maxLength value="5"/&gt;
             *             &lt;whiteSpace value="preserve"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="LastEventDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
             *       &lt;attribute name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
             *       &lt;attribute name="AccountType"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="ResFromExpReas" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "gsm",
                "tacs"
            })
            public static class Client {

                @XmlElement(name = "GSM")
                protected RestoreSubscriberXIbData.Operation.RestoreSubscriber.Client.GSM gsm;
                @XmlElement(name = "TACS")
                protected RestoreSubscriberXIbData.Operation.RestoreSubscriber.Client.TACS tacs;
                @XmlAttribute(name = "Reason", required = true)
                protected String reason;
                @XmlAttribute(name = "LanguageId", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String languageId;
                @XmlAttribute(name = "TypeOfCard", required = true)
                protected String typeOfCard;
                @XmlAttribute(name = "NumReloads", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String numReloads;
                @XmlAttribute(name = "Deactivated")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar deactivated;
                @XmlAttribute(name = "NotifyType", required = true)
                protected String notifyType;
                @XmlAttribute(name = "NumTariffs", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String numTariffs;
                @XmlAttribute(name = "LastChangeTariff")
                protected String lastChangeTariff;
                @XmlAttribute(name = "InstallationDate", required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar installationDate;
                @XmlAttribute(name = "ActivationDate")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar activationDate;
                @XmlAttribute(name = "DeactivationDate")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar deactivationDate;
                @XmlAttribute(name = "ServiceProviderId", required = true)
                protected String serviceProviderId;
                @XmlAttribute(name = "LastEventDate")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar lastEventDate;
                @XmlAttribute(name = "ExpiryDate")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar expiryDate;
                @XmlAttribute(name = "AccountType")
                protected BigInteger accountType;
                @XmlAttribute(name = "ResFromExpReas")
                protected BigInteger resFromExpReas;

                /**
                 * Recupera il valore della proprietà gsm.
                 * 
                 * @return
                 *     possible object is
                 *     {@link RestoreSubscriberXIbData.Operation.RestoreSubscriber.Client.GSM }
                 *     
                 */
                public RestoreSubscriberXIbData.Operation.RestoreSubscriber.Client.GSM getGSM() {
                    return gsm;
                }

                /**
                 * Imposta il valore della proprietà gsm.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link RestoreSubscriberXIbData.Operation.RestoreSubscriber.Client.GSM }
                 *     
                 */
                public void setGSM(RestoreSubscriberXIbData.Operation.RestoreSubscriber.Client.GSM value) {
                    this.gsm = value;
                }

                /**
                 * Recupera il valore della proprietà tacs.
                 * 
                 * @return
                 *     possible object is
                 *     {@link RestoreSubscriberXIbData.Operation.RestoreSubscriber.Client.TACS }
                 *     
                 */
                public RestoreSubscriberXIbData.Operation.RestoreSubscriber.Client.TACS getTACS() {
                    return tacs;
                }

                /**
                 * Imposta il valore della proprietà tacs.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link RestoreSubscriberXIbData.Operation.RestoreSubscriber.Client.TACS }
                 *     
                 */
                public void setTACS(RestoreSubscriberXIbData.Operation.RestoreSubscriber.Client.TACS value) {
                    this.tacs = value;
                }

                /**
                 * Recupera il valore della proprietà reason.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getReason() {
                    return reason;
                }

                /**
                 * Imposta il valore della proprietà reason.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setReason(String value) {
                    this.reason = value;
                }

                /**
                 * Recupera il valore della proprietà languageId.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLanguageId() {
                    return languageId;
                }

                /**
                 * Imposta il valore della proprietà languageId.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLanguageId(String value) {
                    this.languageId = value;
                }

                /**
                 * Recupera il valore della proprietà typeOfCard.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTypeOfCard() {
                    return typeOfCard;
                }

                /**
                 * Imposta il valore della proprietà typeOfCard.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTypeOfCard(String value) {
                    this.typeOfCard = value;
                }

                /**
                 * Recupera il valore della proprietà numReloads.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumReloads() {
                    return numReloads;
                }

                /**
                 * Imposta il valore della proprietà numReloads.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumReloads(String value) {
                    this.numReloads = value;
                }

                /**
                 * Recupera il valore della proprietà deactivated.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDeactivated() {
                    return deactivated;
                }

                /**
                 * Imposta il valore della proprietà deactivated.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDeactivated(XMLGregorianCalendar value) {
                    this.deactivated = value;
                }

                /**
                 * Recupera il valore della proprietà notifyType.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNotifyType() {
                    return notifyType;
                }

                /**
                 * Imposta il valore della proprietà notifyType.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNotifyType(String value) {
                    this.notifyType = value;
                }

                /**
                 * Recupera il valore della proprietà numTariffs.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumTariffs() {
                    return numTariffs;
                }

                /**
                 * Imposta il valore della proprietà numTariffs.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumTariffs(String value) {
                    this.numTariffs = value;
                }

                /**
                 * Recupera il valore della proprietà lastChangeTariff.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLastChangeTariff() {
                    return lastChangeTariff;
                }

                /**
                 * Imposta il valore della proprietà lastChangeTariff.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLastChangeTariff(String value) {
                    this.lastChangeTariff = value;
                }

                /**
                 * Recupera il valore della proprietà installationDate.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getInstallationDate() {
                    return installationDate;
                }

                /**
                 * Imposta il valore della proprietà installationDate.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setInstallationDate(XMLGregorianCalendar value) {
                    this.installationDate = value;
                }

                /**
                 * Recupera il valore della proprietà activationDate.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getActivationDate() {
                    return activationDate;
                }

                /**
                 * Imposta il valore della proprietà activationDate.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setActivationDate(XMLGregorianCalendar value) {
                    this.activationDate = value;
                }

                /**
                 * Recupera il valore della proprietà deactivationDate.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDeactivationDate() {
                    return deactivationDate;
                }

                /**
                 * Imposta il valore della proprietà deactivationDate.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDeactivationDate(XMLGregorianCalendar value) {
                    this.deactivationDate = value;
                }

                /**
                 * Recupera il valore della proprietà serviceProviderId.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getServiceProviderId() {
                    return serviceProviderId;
                }

                /**
                 * Imposta il valore della proprietà serviceProviderId.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setServiceProviderId(String value) {
                    this.serviceProviderId = value;
                }

                /**
                 * Recupera il valore della proprietà lastEventDate.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getLastEventDate() {
                    return lastEventDate;
                }

                /**
                 * Imposta il valore della proprietà lastEventDate.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setLastEventDate(XMLGregorianCalendar value) {
                    this.lastEventDate = value;
                }

                /**
                 * Recupera il valore della proprietà expiryDate.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getExpiryDate() {
                    return expiryDate;
                }

                /**
                 * Imposta il valore della proprietà expiryDate.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setExpiryDate(XMLGregorianCalendar value) {
                    this.expiryDate = value;
                }

                /**
                 * Recupera il valore della proprietà accountType.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getAccountType() {
                    return accountType;
                }

                /**
                 * Imposta il valore della proprietà accountType.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setAccountType(BigInteger value) {
                    this.accountType = value;
                }

                /**
                 * Recupera il valore della proprietà resFromExpReas.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getResFromExpReas() {
                    if (resFromExpReas == null) {
                        return new BigInteger("0");
                    } else {
                        return resFromExpReas;
                    }
                }

                /**
                 * Imposta il valore della proprietà resFromExpReas.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setResFromExpReas(BigInteger value) {
                    this.resFromExpReas = value;
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
                 *       &lt;attribute name="ICCID" use="required"&gt;
                 *         &lt;simpleType&gt;
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
                 *             &lt;maxLength value="20"/&gt;
                 *             &lt;pattern value="[0-9]+"/&gt;
                 *           &lt;/restriction&gt;
                 *         &lt;/simpleType&gt;
                 *       &lt;/attribute&gt;
                 *       &lt;attribute name="CardFeature" use="required"&gt;
                 *         &lt;simpleType&gt;
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *             &lt;length value="8"/&gt;
                 *             &lt;whiteSpace value="preserve"/&gt;
                 *           &lt;/restriction&gt;
                 *         &lt;/simpleType&gt;
                 *       &lt;/attribute&gt;
                 *       &lt;attribute name="CardPhase" use="required"&gt;
                 *         &lt;simpleType&gt;
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *             &lt;maxLength value="2"/&gt;
                 *             &lt;minLength value="0"/&gt;
                 *             &lt;whiteSpace value="preserve"/&gt;
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
                    @XmlAttribute(name = "ICCID", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    protected String iccid;
                    @XmlAttribute(name = "CardFeature", required = true)
                    protected String cardFeature;
                    @XmlAttribute(name = "CardPhase", required = true)
                    protected String cardPhase;

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
                     * Recupera il valore della proprietà cardFeature.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCardFeature() {
                        return cardFeature;
                    }

                    /**
                     * Imposta il valore della proprietà cardFeature.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCardFeature(String value) {
                        this.cardFeature = value;
                    }

                    /**
                     * Recupera il valore della proprietà cardPhase.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCardPhase() {
                        return cardPhase;
                    }

                    /**
                     * Imposta il valore della proprietà cardPhase.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCardPhase(String value) {
                        this.cardPhase = value;
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
                 *       &lt;attribute name="Category" use="required"&gt;
                 *         &lt;simpleType&gt;
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *             &lt;minLength value="0"/&gt;
                 *             &lt;maxLength value="6"/&gt;
                 *             &lt;whiteSpace value="preserve"/&gt;
                 *           &lt;/restriction&gt;
                 *         &lt;/simpleType&gt;
                 *       &lt;/attribute&gt;
                 *       &lt;attribute name="SRNB" use="required"&gt;
                 *         &lt;simpleType&gt;
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
                 *             &lt;minLength value="1"/&gt;
                 *             &lt;maxLength value="11"/&gt;
                 *             &lt;pattern value="[0-9]+"/&gt;
                 *           &lt;/restriction&gt;
                 *         &lt;/simpleType&gt;
                 *       &lt;/attribute&gt;
                 *       &lt;attribute name="CodeB" use="required"&gt;
                 *         &lt;simpleType&gt;
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
                 *             &lt;minLength value="1"/&gt;
                 *             &lt;maxLength value="11"/&gt;
                 *             &lt;pattern value="[0-9]+"/&gt;
                 *           &lt;/restriction&gt;
                 *         &lt;/simpleType&gt;
                 *       &lt;/attribute&gt;
                 *       &lt;attribute name="Tipo" use="required"&gt;
                 *         &lt;simpleType&gt;
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
                 *             &lt;minLength value="1"/&gt;
                 *             &lt;maxLength value="2"/&gt;
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
                public static class TACS {

                    @XmlAttribute(name = "Category", required = true)
                    protected String category;
                    @XmlAttribute(name = "SRNB", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    protected String srnb;
                    @XmlAttribute(name = "CodeB", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    protected String codeB;
                    @XmlAttribute(name = "Tipo", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    protected String tipo;

                    /**
                     * Recupera il valore della proprietà category.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCategory() {
                        return category;
                    }

                    /**
                     * Imposta il valore della proprietà category.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCategory(String value) {
                        this.category = value;
                    }

                    /**
                     * Recupera il valore della proprietà srnb.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSRNB() {
                        return srnb;
                    }

                    /**
                     * Imposta il valore della proprietà srnb.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSRNB(String value) {
                        this.srnb = value;
                    }

                    /**
                     * Recupera il valore della proprietà codeB.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeB() {
                        return codeB;
                    }

                    /**
                     * Imposta il valore della proprietà codeB.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeB(String value) {
                        this.codeB = value;
                    }

                    /**
                     * Recupera il valore della proprietà tipo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTipo() {
                        return tipo;
                    }

                    /**
                     * Imposta il valore della proprietà tipo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTipo(String value) {
                        this.tipo = value;
                    }

                }

            }

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
     *     &lt;extension base="{http://telecomitalia.it/SOA/TRCS/Gateway}TransactionType"&gt;
     *       &lt;attribute name="MRTID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="MRCallBack" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="TDBCount" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="NMExpected"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="true"/&gt;
     *             &lt;enumeration value="false"/&gt;
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
    @XmlType(name = "")
    public static class Transaction
        extends TransactionType
    {

        @XmlAttribute(name = "MRTID")
        protected String mrtid;
        @XmlAttribute(name = "MRCallBack")
        protected String mrCallBack;
        @XmlAttribute(name = "TDBCount")
        protected BigInteger tdbCount;
        @XmlAttribute(name = "NMExpected")
        protected String nmExpected;

        /**
         * Recupera il valore della proprietà mrtid.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMRTID() {
            return mrtid;
        }

        /**
         * Imposta il valore della proprietà mrtid.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMRTID(String value) {
            this.mrtid = value;
        }

        /**
         * Recupera il valore della proprietà mrCallBack.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMRCallBack() {
            return mrCallBack;
        }

        /**
         * Imposta il valore della proprietà mrCallBack.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMRCallBack(String value) {
            this.mrCallBack = value;
        }

        /**
         * Recupera il valore della proprietà tdbCount.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTDBCount() {
            return tdbCount;
        }

        /**
         * Imposta il valore della proprietà tdbCount.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTDBCount(BigInteger value) {
            this.tdbCount = value;
        }

        /**
         * Recupera il valore della proprietà nmExpected.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNMExpected() {
            return nmExpected;
        }

        /**
         * Imposta il valore della proprietà nmExpected.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNMExpected(String value) {
            this.nmExpected = value;
        }

    }

}
