//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.08.02 alle 11:23:32 AM CEST 
//


package it.telecomitalia.soa.trcs.gateway;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per MigrateSubscriberXIbData complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MigrateSubscriberXIbData"&gt;
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
 *                   &lt;element name="MigrateSubscriber"&gt;
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
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                                     &lt;minLength value="1"/&gt;
 *                                                     &lt;maxLength value="6"/&gt;
 *                                                     &lt;pattern value="[0-9]+"/&gt;
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
 *                                           &lt;minLength value="1"/&gt;
 *                                           &lt;maxLength value="2"/&gt;
 *                                           &lt;whiteSpace value="preserve"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Subscription" type="{http://telecomitalia.it/SOA/TRCS/Gateway}SubscriptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="MigrType" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                 &lt;minLength value="1"/&gt;
 *                                 &lt;enumeration value="DualNum"/&gt;
 *                                 &lt;enumeration value="MnpFlag"/&gt;
 *                                 &lt;enumeration value="SlideFlag"/&gt;
 *                                 &lt;enumeration value="Normal"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="VirtualMSISDN"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                 &lt;maxLength value="12"/&gt;
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
 *                       &lt;enumeration value="MigrateSubscriber"/&gt;
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
@XmlType(name = "MigrateSubscriberXIbData", propOrder = {
    "transaction",
    "clientKeys",
    "operation"
})
public class MigrateSubscriberXIbData {

    @XmlElement(name = "Transaction", required = true)
    protected MigrateSubscriberXIbData.Transaction transaction;
    @XmlElement(name = "ClientKeys")
    protected MigrateSubscriberXIbData.ClientKeys clientKeys;
    @XmlElement(name = "Operation", required = true)
    protected MigrateSubscriberXIbData.Operation operation;
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
     *     {@link MigrateSubscriberXIbData.Transaction }
     *     
     */
    public MigrateSubscriberXIbData.Transaction getTransaction() {
        return transaction;
    }

    /**
     * Imposta il valore della proprietà transaction.
     * 
     * @param value
     *     allowed object is
     *     {@link MigrateSubscriberXIbData.Transaction }
     *     
     */
    public void setTransaction(MigrateSubscriberXIbData.Transaction value) {
        this.transaction = value;
    }

    /**
     * Recupera il valore della proprietà clientKeys.
     * 
     * @return
     *     possible object is
     *     {@link MigrateSubscriberXIbData.ClientKeys }
     *     
     */
    public MigrateSubscriberXIbData.ClientKeys getClientKeys() {
        return clientKeys;
    }

    /**
     * Imposta il valore della proprietà clientKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link MigrateSubscriberXIbData.ClientKeys }
     *     
     */
    public void setClientKeys(MigrateSubscriberXIbData.ClientKeys value) {
        this.clientKeys = value;
    }

    /**
     * Recupera il valore della proprietà operation.
     * 
     * @return
     *     possible object is
     *     {@link MigrateSubscriberXIbData.Operation }
     *     
     */
    public MigrateSubscriberXIbData.Operation getOperation() {
        return operation;
    }

    /**
     * Imposta il valore della proprietà operation.
     * 
     * @param value
     *     allowed object is
     *     {@link MigrateSubscriberXIbData.Operation }
     *     
     */
    public void setOperation(MigrateSubscriberXIbData.Operation value) {
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
     *         &lt;element name="MigrateSubscriber"&gt;
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
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                           &lt;minLength value="1"/&gt;
     *                                           &lt;maxLength value="6"/&gt;
     *                                           &lt;pattern value="[0-9]+"/&gt;
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
     *                                 &lt;minLength value="1"/&gt;
     *                                 &lt;maxLength value="2"/&gt;
     *                                 &lt;whiteSpace value="preserve"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Subscription" type="{http://telecomitalia.it/SOA/TRCS/Gateway}SubscriptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="MigrType" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                       &lt;minLength value="1"/&gt;
     *                       &lt;enumeration value="DualNum"/&gt;
     *                       &lt;enumeration value="MnpFlag"/&gt;
     *                       &lt;enumeration value="SlideFlag"/&gt;
     *                       &lt;enumeration value="Normal"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="VirtualMSISDN"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                       &lt;maxLength value="12"/&gt;
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
     *             &lt;enumeration value="MigrateSubscriber"/&gt;
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
        "migrateSubscriber"
    })
    public static class Operation {

        @XmlElement(name = "MigrateSubscriber", required = true)
        protected MigrateSubscriberXIbData.Operation.MigrateSubscriber migrateSubscriber;
        @XmlAttribute(name = "OperationType", required = true)
        protected String operationType;
        @XmlAttribute(name = "Info")
        protected String info;

        /**
         * Recupera il valore della proprietà migrateSubscriber.
         * 
         * @return
         *     possible object is
         *     {@link MigrateSubscriberXIbData.Operation.MigrateSubscriber }
         *     
         */
        public MigrateSubscriberXIbData.Operation.MigrateSubscriber getMigrateSubscriber() {
            return migrateSubscriber;
        }

        /**
         * Imposta il valore della proprietà migrateSubscriber.
         * 
         * @param value
         *     allowed object is
         *     {@link MigrateSubscriberXIbData.Operation.MigrateSubscriber }
         *     
         */
        public void setMigrateSubscriber(MigrateSubscriberXIbData.Operation.MigrateSubscriber value) {
            this.migrateSubscriber = value;
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
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                                 &lt;minLength value="1"/&gt;
         *                                 &lt;maxLength value="6"/&gt;
         *                                 &lt;pattern value="[0-9]+"/&gt;
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
         *                       &lt;minLength value="1"/&gt;
         *                       &lt;maxLength value="2"/&gt;
         *                       &lt;whiteSpace value="preserve"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Subscription" type="{http://telecomitalia.it/SOA/TRCS/Gateway}SubscriptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="MigrType" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *             &lt;minLength value="1"/&gt;
         *             &lt;enumeration value="DualNum"/&gt;
         *             &lt;enumeration value="MnpFlag"/&gt;
         *             &lt;enumeration value="SlideFlag"/&gt;
         *             &lt;enumeration value="Normal"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="VirtualMSISDN"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *             &lt;maxLength value="12"/&gt;
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
        public static class MigrateSubscriber {

            @XmlElement(name = "Client", required = true)
            protected MigrateSubscriberXIbData.Operation.MigrateSubscriber.Client client;
            @XmlElement(name = "Subscription")
            protected List<SubscriptionType> subscription;
            @XmlAttribute(name = "MigrType", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String migrType;
            @XmlAttribute(name = "VirtualMSISDN")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String virtualMSISDN;
            @XmlAttribute(name = "NewBillRunMode")
            protected String newBillRunMode;

            /**
             * Recupera il valore della proprietà client.
             * 
             * @return
             *     possible object is
             *     {@link MigrateSubscriberXIbData.Operation.MigrateSubscriber.Client }
             *     
             */
            public MigrateSubscriberXIbData.Operation.MigrateSubscriber.Client getClient() {
                return client;
            }

            /**
             * Imposta il valore della proprietà client.
             * 
             * @param value
             *     allowed object is
             *     {@link MigrateSubscriberXIbData.Operation.MigrateSubscriber.Client }
             *     
             */
            public void setClient(MigrateSubscriberXIbData.Operation.MigrateSubscriber.Client value) {
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
             * {@link SubscriptionType }
             * 
             * 
             */
            public List<SubscriptionType> getSubscription() {
                if (subscription == null) {
                    subscription = new ArrayList<SubscriptionType>();
                }
                return this.subscription;
            }

            /**
             * Recupera il valore della proprietà migrType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMigrType() {
                return migrType;
            }

            /**
             * Imposta il valore della proprietà migrType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMigrType(String value) {
                this.migrType = value;
            }

            /**
             * Recupera il valore della proprietà virtualMSISDN.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVirtualMSISDN() {
                return virtualMSISDN;
            }

            /**
             * Imposta il valore della proprietà virtualMSISDN.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVirtualMSISDN(String value) {
                this.virtualMSISDN = value;
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
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
             *                       &lt;minLength value="1"/&gt;
             *                       &lt;maxLength value="6"/&gt;
             *                       &lt;pattern value="[0-9]+"/&gt;
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
             *             &lt;minLength value="1"/&gt;
             *             &lt;maxLength value="2"/&gt;
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
                "gsm",
                "tacs"
            })
            public static class Client {

                @XmlElement(name = "GSM")
                protected MigrateSubscriberXIbData.Operation.MigrateSubscriber.Client.GSM gsm;
                @XmlElement(name = "TACS")
                protected MigrateSubscriberXIbData.Operation.MigrateSubscriber.Client.TACS tacs;
                @XmlAttribute(name = "Reason", required = true)
                protected String reason;
                @XmlAttribute(name = "LanguageId", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String languageId;
                @XmlAttribute(name = "TypeOfCard", required = true)
                protected String typeOfCard;

                /**
                 * Recupera il valore della proprietà gsm.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MigrateSubscriberXIbData.Operation.MigrateSubscriber.Client.GSM }
                 *     
                 */
                public MigrateSubscriberXIbData.Operation.MigrateSubscriber.Client.GSM getGSM() {
                    return gsm;
                }

                /**
                 * Imposta il valore della proprietà gsm.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MigrateSubscriberXIbData.Operation.MigrateSubscriber.Client.GSM }
                 *     
                 */
                public void setGSM(MigrateSubscriberXIbData.Operation.MigrateSubscriber.Client.GSM value) {
                    this.gsm = value;
                }

                /**
                 * Recupera il valore della proprietà tacs.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MigrateSubscriberXIbData.Operation.MigrateSubscriber.Client.TACS }
                 *     
                 */
                public MigrateSubscriberXIbData.Operation.MigrateSubscriber.Client.TACS getTACS() {
                    return tacs;
                }

                /**
                 * Imposta il valore della proprietà tacs.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MigrateSubscriberXIbData.Operation.MigrateSubscriber.Client.TACS }
                 *     
                 */
                public void setTACS(MigrateSubscriberXIbData.Operation.MigrateSubscriber.Client.TACS value) {
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
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
                 *             &lt;minLength value="1"/&gt;
                 *             &lt;maxLength value="6"/&gt;
                 *             &lt;pattern value="[0-9]+"/&gt;
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
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
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
