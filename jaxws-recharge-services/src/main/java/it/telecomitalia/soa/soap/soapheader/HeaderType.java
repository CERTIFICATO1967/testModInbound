//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.10.13 alle 05:27:41 PM CEST 
//


package it.telecomitalia.soa.soap.soapheader;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Informazioni di contesto dell'invocazione del servizio
 * 
 * <p>Classe Java per HeaderType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="HeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sourceSystem" type="{http://telecomitalia.it/SOA/SOAP/SOAPHeader}sourceSystemType" minOccurs="0"/&gt;
 *         &lt;element name="interactionDate" type="{http://telecomitalia.it/SOA/SOAP/SOAPHeader}interactionDateType" minOccurs="0"/&gt;
 *         &lt;element name="businessID" type="{http://telecomitalia.it/SOA/SOAP/SOAPHeader}businessIDType" minOccurs="0"/&gt;
 *         &lt;element name="messageID" type="{http://telecomitalia.it/SOA/SOAP/SOAPHeader}messageIDType" minOccurs="0"/&gt;
 *         &lt;element name="transactionID" type="{http://telecomitalia.it/SOA/SOAP/SOAPHeader}transactionIDType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderType", propOrder = {
    "sourceSystem",
    "interactionDate",
    "businessID",
    "messageID",
    "transactionID"
})
public class HeaderType {

    protected String sourceSystem;
    protected InteractionDateType interactionDate;
    protected String businessID;
    protected String messageID;
    protected String transactionID;

    /**
     * Recupera il valore della proprietà sourceSystem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystem() {
        return sourceSystem;
    }

    /**
     * Imposta il valore della proprietà sourceSystem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystem(String value) {
        this.sourceSystem = value;
    }

    /**
     * Recupera il valore della proprietà interactionDate.
     * 
     * @return
     *     possible object is
     *     {@link InteractionDateType }
     *     
     */
    public InteractionDateType getInteractionDate() {
        return interactionDate;
    }

    /**
     * Imposta il valore della proprietà interactionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link InteractionDateType }
     *     
     */
    public void setInteractionDate(InteractionDateType value) {
        this.interactionDate = value;
    }

    /**
     * Recupera il valore della proprietà businessID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessID() {
        return businessID;
    }

    /**
     * Imposta il valore della proprietà businessID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessID(String value) {
        this.businessID = value;
    }

    /**
     * Recupera il valore della proprietà messageID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageID() {
        return messageID;
    }

    /**
     * Imposta il valore della proprietà messageID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageID(String value) {
        this.messageID = value;
    }

    /**
     * Recupera il valore della proprietà transactionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Imposta il valore della proprietà transactionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

}
