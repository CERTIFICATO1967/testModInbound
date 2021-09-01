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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Complex type describing the Subscription structure
 * 			
 * 
 * <p>Classe Java per GroupedSubscriptionBookingType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GroupedSubscriptionBookingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://telecomitalia.it/SOA/TRCS/Gateway}OptionalSubscriptionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Offer" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://telecomitalia.it/SOA/TRCS/Gateway}ActOfferType"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="ExtraData" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://telecomitalia.it/SOA/TRCS/Gateway}ExtraDataType"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupedSubscriptionBookingType", propOrder = {
    "offer"
})
public class GroupedSubscriptionBookingType
    extends OptionalSubscriptionType
{

    @XmlElement(name = "Offer")
    protected List<GroupedSubscriptionBookingType.Offer> offer;

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
     * {@link GroupedSubscriptionBookingType.Offer }
     * 
     * 
     */
    public List<GroupedSubscriptionBookingType.Offer> getOffer() {
        if (offer == null) {
            offer = new ArrayList<GroupedSubscriptionBookingType.Offer>();
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
     *     &lt;extension base="{http://telecomitalia.it/SOA/TRCS/Gateway}ActOfferType"&gt;
     *       &lt;sequence minOccurs="0"&gt;
     *         &lt;element name="ExtraData" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://telecomitalia.it/SOA/TRCS/Gateway}ExtraDataType"&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
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
        extends ActOfferType
    {

        @XmlElement(name = "ExtraData")
        protected GroupedSubscriptionBookingType.Offer.ExtraData extraData;

        /**
         * Recupera il valore della proprietà extraData.
         * 
         * @return
         *     possible object is
         *     {@link GroupedSubscriptionBookingType.Offer.ExtraData }
         *     
         */
        public GroupedSubscriptionBookingType.Offer.ExtraData getExtraData() {
            return extraData;
        }

        /**
         * Imposta il valore della proprietà extraData.
         * 
         * @param value
         *     allowed object is
         *     {@link GroupedSubscriptionBookingType.Offer.ExtraData }
         *     
         */
        public void setExtraData(GroupedSubscriptionBookingType.Offer.ExtraData value) {
            this.extraData = value;
        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://telecomitalia.it/SOA/TRCS/Gateway}ExtraDataType"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ExtraData
            extends ExtraDataType
        {


        }

    }

}
