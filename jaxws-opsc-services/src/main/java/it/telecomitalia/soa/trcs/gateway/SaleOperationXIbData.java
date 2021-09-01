//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.09.01 alle 12:07:18 PM CEST 
//


package it.telecomitalia.soa.trcs.gateway;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per SaleOperationXIbData complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SaleOperationXIbData"&gt;
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
 *                   &lt;element name="SaleOperation"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Client"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence minOccurs="0"&gt;
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
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="TypeOfCard" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;maxLength value="2"/&gt;
 *                                           &lt;minLength value="1"/&gt;
 *                                           &lt;whiteSpace value="preserve"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="LanguageId"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                           &lt;maxLength value="2"/&gt;
 *                                           &lt;minLength value="1"/&gt;
 *                                           &lt;pattern value="[0-9]+"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="Reason"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;enumeration value="A"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="State" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;choice minOccurs="0"&gt;
 *                               &lt;element name="PCNSaleOp"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="Subscription" type="{http://telecomitalia.it/SOA/TRCS/Gateway}SubscriptionType"/&gt;
 *                                       &lt;/sequence&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                             &lt;/choice&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="SaleOpType" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="PCNSaleOp"/&gt;
 *                                 &lt;enumeration value="PCNInstOp"/&gt;
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
 *                       &lt;enumeration value="SaleOperation"/&gt;
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
@XmlType(name = "SaleOperationXIbData", propOrder = {
    "transaction",
    "clientKeys",
    "operation"
})
public class SaleOperationXIbData {

    @XmlElement(name = "Transaction", required = true)
    protected SaleOperationXIbData.Transaction transaction;
    @XmlElement(name = "ClientKeys")
    protected SaleOperationXIbData.ClientKeys clientKeys;
    @XmlElement(name = "Operation", required = true)
    protected SaleOperationXIbData.Operation operation;
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
     *     {@link SaleOperationXIbData.Transaction }
     *     
     */
    public SaleOperationXIbData.Transaction getTransaction() {
        return transaction;
    }

    /**
     * Imposta il valore della proprietà transaction.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleOperationXIbData.Transaction }
     *     
     */
    public void setTransaction(SaleOperationXIbData.Transaction value) {
        this.transaction = value;
    }

    /**
     * Recupera il valore della proprietà clientKeys.
     * 
     * @return
     *     possible object is
     *     {@link SaleOperationXIbData.ClientKeys }
     *     
     */
    public SaleOperationXIbData.ClientKeys getClientKeys() {
        return clientKeys;
    }

    /**
     * Imposta il valore della proprietà clientKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleOperationXIbData.ClientKeys }
     *     
     */
    public void setClientKeys(SaleOperationXIbData.ClientKeys value) {
        this.clientKeys = value;
    }

    /**
     * Recupera il valore della proprietà operation.
     * 
     * @return
     *     possible object is
     *     {@link SaleOperationXIbData.Operation }
     *     
     */
    public SaleOperationXIbData.Operation getOperation() {
        return operation;
    }

    /**
     * Imposta il valore della proprietà operation.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleOperationXIbData.Operation }
     *     
     */
    public void setOperation(SaleOperationXIbData.Operation value) {
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
     *         &lt;element name="SaleOperation"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Client"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence minOccurs="0"&gt;
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
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="TypeOfCard" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;maxLength value="2"/&gt;
     *                                 &lt;minLength value="1"/&gt;
     *                                 &lt;whiteSpace value="preserve"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="LanguageId"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                 &lt;maxLength value="2"/&gt;
     *                                 &lt;minLength value="1"/&gt;
     *                                 &lt;pattern value="[0-9]+"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="Reason"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;enumeration value="A"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="State" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;choice minOccurs="0"&gt;
     *                     &lt;element name="PCNSaleOp"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;complexContent&gt;
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                             &lt;sequence&gt;
     *                               &lt;element name="Subscription" type="{http://telecomitalia.it/SOA/TRCS/Gateway}SubscriptionType"/&gt;
     *                             &lt;/sequence&gt;
     *                           &lt;/restriction&gt;
     *                         &lt;/complexContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                   &lt;/choice&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="SaleOpType" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="PCNSaleOp"/&gt;
     *                       &lt;enumeration value="PCNInstOp"/&gt;
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
     *             &lt;enumeration value="SaleOperation"/&gt;
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
        "saleOperation"
    })
    public static class Operation {

        @XmlElement(name = "SaleOperation", required = true)
        protected SaleOperationXIbData.Operation.SaleOperation saleOperation;
        @XmlAttribute(name = "OperationType", required = true)
        protected String operationType;
        @XmlAttribute(name = "Info")
        protected String info;

        /**
         * Recupera il valore della proprietà saleOperation.
         * 
         * @return
         *     possible object is
         *     {@link SaleOperationXIbData.Operation.SaleOperation }
         *     
         */
        public SaleOperationXIbData.Operation.SaleOperation getSaleOperation() {
            return saleOperation;
        }

        /**
         * Imposta il valore della proprietà saleOperation.
         * 
         * @param value
         *     allowed object is
         *     {@link SaleOperationXIbData.Operation.SaleOperation }
         *     
         */
        public void setSaleOperation(SaleOperationXIbData.Operation.SaleOperation value) {
            this.saleOperation = value;
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
         *                 &lt;sequence minOccurs="0"&gt;
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
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="TypeOfCard" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;maxLength value="2"/&gt;
         *                       &lt;minLength value="1"/&gt;
         *                       &lt;whiteSpace value="preserve"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="LanguageId"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                       &lt;maxLength value="2"/&gt;
         *                       &lt;minLength value="1"/&gt;
         *                       &lt;pattern value="[0-9]+"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="Reason"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;enumeration value="A"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="State" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;choice minOccurs="0"&gt;
         *           &lt;element name="PCNSaleOp"&gt;
         *             &lt;complexType&gt;
         *               &lt;complexContent&gt;
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                   &lt;sequence&gt;
         *                     &lt;element name="Subscription" type="{http://telecomitalia.it/SOA/TRCS/Gateway}SubscriptionType"/&gt;
         *                   &lt;/sequence&gt;
         *                 &lt;/restriction&gt;
         *               &lt;/complexContent&gt;
         *             &lt;/complexType&gt;
         *           &lt;/element&gt;
         *         &lt;/choice&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="SaleOpType" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="PCNSaleOp"/&gt;
         *             &lt;enumeration value="PCNInstOp"/&gt;
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
            "pcnSaleOp"
        })
        public static class SaleOperation {

            @XmlElement(name = "Client", required = true)
            protected SaleOperationXIbData.Operation.SaleOperation.Client client;
            @XmlElement(name = "PCNSaleOp")
            protected SaleOperationXIbData.Operation.SaleOperation.PCNSaleOp pcnSaleOp;
            @XmlAttribute(name = "SaleOpType", required = true)
            protected String saleOpType;
            @XmlAttribute(name = "NewBillRunMode")
            protected String newBillRunMode;

            /**
             * Recupera il valore della proprietà client.
             * 
             * @return
             *     possible object is
             *     {@link SaleOperationXIbData.Operation.SaleOperation.Client }
             *     
             */
            public SaleOperationXIbData.Operation.SaleOperation.Client getClient() {
                return client;
            }

            /**
             * Imposta il valore della proprietà client.
             * 
             * @param value
             *     allowed object is
             *     {@link SaleOperationXIbData.Operation.SaleOperation.Client }
             *     
             */
            public void setClient(SaleOperationXIbData.Operation.SaleOperation.Client value) {
                this.client = value;
            }

            /**
             * Recupera il valore della proprietà pcnSaleOp.
             * 
             * @return
             *     possible object is
             *     {@link SaleOperationXIbData.Operation.SaleOperation.PCNSaleOp }
             *     
             */
            public SaleOperationXIbData.Operation.SaleOperation.PCNSaleOp getPCNSaleOp() {
                return pcnSaleOp;
            }

            /**
             * Imposta il valore della proprietà pcnSaleOp.
             * 
             * @param value
             *     allowed object is
             *     {@link SaleOperationXIbData.Operation.SaleOperation.PCNSaleOp }
             *     
             */
            public void setPCNSaleOp(SaleOperationXIbData.Operation.SaleOperation.PCNSaleOp value) {
                this.pcnSaleOp = value;
            }

            /**
             * Recupera il valore della proprietà saleOpType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSaleOpType() {
                return saleOpType;
            }

            /**
             * Imposta il valore della proprietà saleOpType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSaleOpType(String value) {
                this.saleOpType = value;
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
             *       &lt;sequence minOccurs="0"&gt;
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
             *       &lt;/sequence&gt;
             *       &lt;attribute name="TypeOfCard" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;maxLength value="2"/&gt;
             *             &lt;minLength value="1"/&gt;
             *             &lt;whiteSpace value="preserve"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="LanguageId"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
             *             &lt;maxLength value="2"/&gt;
             *             &lt;minLength value="1"/&gt;
             *             &lt;pattern value="[0-9]+"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="Reason"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;enumeration value="A"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="State" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "gsm"
            })
            public static class Client {

                @XmlElement(name = "GSM")
                protected SaleOperationXIbData.Operation.SaleOperation.Client.GSM gsm;
                @XmlAttribute(name = "TypeOfCard", required = true)
                protected String typeOfCard;
                @XmlAttribute(name = "LanguageId")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String languageId;
                @XmlAttribute(name = "Reason")
                protected String reason;
                @XmlAttribute(name = "State")
                protected Integer state;

                /**
                 * Recupera il valore della proprietà gsm.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SaleOperationXIbData.Operation.SaleOperation.Client.GSM }
                 *     
                 */
                public SaleOperationXIbData.Operation.SaleOperation.Client.GSM getGSM() {
                    return gsm;
                }

                /**
                 * Imposta il valore della proprietà gsm.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SaleOperationXIbData.Operation.SaleOperation.Client.GSM }
                 *     
                 */
                public void setGSM(SaleOperationXIbData.Operation.SaleOperation.Client.GSM value) {
                    this.gsm = value;
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
                 * Recupera il valore della proprietà state.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getState() {
                    return state;
                }

                /**
                 * Imposta il valore della proprietà state.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setState(Integer value) {
                    this.state = value;
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
             *         &lt;element name="Subscription" type="{http://telecomitalia.it/SOA/TRCS/Gateway}SubscriptionType"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "subscription"
            })
            public static class PCNSaleOp {

                @XmlElement(name = "Subscription", required = true)
                protected SubscriptionType subscription;

                /**
                 * Recupera il valore della proprietà subscription.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SubscriptionType }
                 *     
                 */
                public SubscriptionType getSubscription() {
                    return subscription;
                }

                /**
                 * Imposta il valore della proprietà subscription.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SubscriptionType }
                 *     
                 */
                public void setSubscription(SubscriptionType value) {
                    this.subscription = value;
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
