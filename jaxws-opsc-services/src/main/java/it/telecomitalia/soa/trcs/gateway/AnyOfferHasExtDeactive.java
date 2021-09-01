//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.09.01 alle 12:07:18 PM CEST 
//


package it.telecomitalia.soa.trcs.gateway;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AnyOfferHasExtDeactive complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AnyOfferHasExtDeactive"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Offer" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://telecomitalia.it/SOA/TRCS/Gateway}OfferType"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="ExtraData" type="{http://telecomitalia.it/SOA/TRCS/Gateway}ChangeExtraDataType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="BlockRecoveryDiscounts" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnyOfferHasExtDeactive", propOrder = {
    "offer"
})
public class AnyOfferHasExtDeactive {

    @XmlElement(name = "Offer", required = true)
    protected List<AnyOfferHasExtDeactive.Offer> offer;

    /**
     * Gets the value of the offer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnyOfferHasExtDeactive.Offer }
     * 
     * 
     */
    public List<AnyOfferHasExtDeactive.Offer> getOffer() {
        if (offer == null) {
            offer = new ArrayList<AnyOfferHasExtDeactive.Offer>();
        }
        return this.offer;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://telecomitalia.it/SOA/TRCS/Gateway}OfferType"&gt;
     *       &lt;sequence minOccurs="0"&gt;
     *         &lt;element name="ExtraData" type="{http://telecomitalia.it/SOA/TRCS/Gateway}ChangeExtraDataType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="BlockRecoveryDiscounts" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "extraData"
    })
    public static class Offer
        extends OfferType
    {

        @XmlElement(name = "ExtraData")
        protected ChangeExtraDataType extraData;
        @XmlAttribute(name = "BlockRecoveryDiscounts")
        protected Boolean blockRecoveryDiscounts;

        /**
         * Recupera il valore della proprietà extraData.
         * 
         * @return
         *     possible object is
         *     {@link ChangeExtraDataType }
         *     
         */
        public ChangeExtraDataType getExtraData() {
            return extraData;
        }

        /**
         * Imposta il valore della proprietà extraData.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeExtraDataType }
         *     
         */
        public void setExtraData(ChangeExtraDataType value) {
            this.extraData = value;
        }

        /**
         * Recupera il valore della proprietà blockRecoveryDiscounts.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBlockRecoveryDiscounts() {
            return blockRecoveryDiscounts;
        }

        /**
         * Imposta il valore della proprietà blockRecoveryDiscounts.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBlockRecoveryDiscounts(Boolean value) {
            this.blockRecoveryDiscounts = value;
        }

    }

}
