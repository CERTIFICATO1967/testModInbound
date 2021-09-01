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
 * <p>Classe Java per PersonalDataManagerXIbData complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PersonalDataManagerXIbData"&gt;
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
 *                   &lt;element name="PersonalData"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="OperationType" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="PDInsert"/&gt;
 *                                 &lt;enumeration value="PDBlock"/&gt;
 *                                 &lt;enumeration value="PDUnblock"/&gt;
 *                                 &lt;enumeration value="PDSale"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="BatchMode" default="0"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                                 &lt;pattern value="[0|1|2]"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="TypeOfCard"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;whiteSpace value="preserve"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="MSISDN_OLO"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                 &lt;maxLength value="12"/&gt;
 *                                 &lt;pattern value="[0-9]+"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="OperationType" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;minLength value="1"/&gt;
 *                       &lt;enumeration value="PersonalData"/&gt;
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
@XmlType(name = "PersonalDataManagerXIbData", propOrder = {
    "transaction",
    "clientKeys",
    "operation"
})
public class PersonalDataManagerXIbData {

    @XmlElement(name = "Transaction", required = true)
    protected PersonalDataManagerXIbData.Transaction transaction;
    @XmlElement(name = "ClientKeys")
    protected PersonalDataManagerXIbData.ClientKeys clientKeys;
    @XmlElement(name = "Operation", required = true)
    protected PersonalDataManagerXIbData.Operation operation;
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
     *     {@link PersonalDataManagerXIbData.Transaction }
     *     
     */
    public PersonalDataManagerXIbData.Transaction getTransaction() {
        return transaction;
    }

    /**
     * Imposta il valore della proprietà transaction.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalDataManagerXIbData.Transaction }
     *     
     */
    public void setTransaction(PersonalDataManagerXIbData.Transaction value) {
        this.transaction = value;
    }

    /**
     * Recupera il valore della proprietà clientKeys.
     * 
     * @return
     *     possible object is
     *     {@link PersonalDataManagerXIbData.ClientKeys }
     *     
     */
    public PersonalDataManagerXIbData.ClientKeys getClientKeys() {
        return clientKeys;
    }

    /**
     * Imposta il valore della proprietà clientKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalDataManagerXIbData.ClientKeys }
     *     
     */
    public void setClientKeys(PersonalDataManagerXIbData.ClientKeys value) {
        this.clientKeys = value;
    }

    /**
     * Recupera il valore della proprietà operation.
     * 
     * @return
     *     possible object is
     *     {@link PersonalDataManagerXIbData.Operation }
     *     
     */
    public PersonalDataManagerXIbData.Operation getOperation() {
        return operation;
    }

    /**
     * Imposta il valore della proprietà operation.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalDataManagerXIbData.Operation }
     *     
     */
    public void setOperation(PersonalDataManagerXIbData.Operation value) {
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
     *         &lt;element name="PersonalData"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="OperationType" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="PDInsert"/&gt;
     *                       &lt;enumeration value="PDBlock"/&gt;
     *                       &lt;enumeration value="PDUnblock"/&gt;
     *                       &lt;enumeration value="PDSale"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="BatchMode" default="0"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *                       &lt;pattern value="[0|1|2]"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="TypeOfCard"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;whiteSpace value="preserve"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="MSISDN_OLO"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                       &lt;maxLength value="12"/&gt;
     *                       &lt;pattern value="[0-9]+"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="OperationType" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;minLength value="1"/&gt;
     *             &lt;enumeration value="PersonalData"/&gt;
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
        "personalData"
    })
    public static class Operation {

        @XmlElement(name = "PersonalData", required = true)
        protected PersonalDataManagerXIbData.Operation.PersonalData personalData;
        @XmlAttribute(name = "OperationType", required = true)
        protected String operationType;
        @XmlAttribute(name = "Info")
        protected String info;

        /**
         * Recupera il valore della proprietà personalData.
         * 
         * @return
         *     possible object is
         *     {@link PersonalDataManagerXIbData.Operation.PersonalData }
         *     
         */
        public PersonalDataManagerXIbData.Operation.PersonalData getPersonalData() {
            return personalData;
        }

        /**
         * Imposta il valore della proprietà personalData.
         * 
         * @param value
         *     allowed object is
         *     {@link PersonalDataManagerXIbData.Operation.PersonalData }
         *     
         */
        public void setPersonalData(PersonalDataManagerXIbData.Operation.PersonalData value) {
            this.personalData = value;
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
         *       &lt;attribute name="OperationType" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="PDInsert"/&gt;
         *             &lt;enumeration value="PDBlock"/&gt;
         *             &lt;enumeration value="PDUnblock"/&gt;
         *             &lt;enumeration value="PDSale"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="BatchMode" default="0"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
         *             &lt;pattern value="[0|1|2]"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="TypeOfCard"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;whiteSpace value="preserve"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="MSISDN_OLO"&gt;
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
        @XmlType(name = "")
        public static class PersonalData {

            @XmlAttribute(name = "OperationType", required = true)
            protected String operationType;
            @XmlAttribute(name = "BatchMode")
            protected Integer batchMode;
            @XmlAttribute(name = "TypeOfCard")
            protected String typeOfCard;
            @XmlAttribute(name = "MSISDN_OLO")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String msisdnolo;

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
             * Recupera il valore della proprietà batchMode.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public int getBatchMode() {
                if (batchMode == null) {
                    return  0;
                } else {
                    return batchMode;
                }
            }

            /**
             * Imposta il valore della proprietà batchMode.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setBatchMode(Integer value) {
                this.batchMode = value;
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
             * Recupera il valore della proprietà msisdnolo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMSISDNOLO() {
                return msisdnolo;
            }

            /**
             * Imposta il valore della proprietà msisdnolo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMSISDNOLO(String value) {
                this.msisdnolo = value;
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
