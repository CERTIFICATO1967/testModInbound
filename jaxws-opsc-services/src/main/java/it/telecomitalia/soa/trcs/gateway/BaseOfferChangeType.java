//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.09.01 alle 12:07:18 PM CEST 
//


package it.telecomitalia.soa.trcs.gateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BaseOfferChangeType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BaseOfferChangeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://telecomitalia.it/SOA/TRCS/Gateway}SubscriptionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActivationDate" type="{http://telecomitalia.it/SOA/TRCS/Gateway}LifeCycleType" minOccurs="0"/&gt;
 *         &lt;element name="DeactivationDate" type="{http://telecomitalia.it/SOA/TRCS/Gateway}LifeCycleType" minOccurs="0"/&gt;
 *         &lt;element name="ExpiryDate" type="{http://telecomitalia.it/SOA/TRCS/Gateway}LifeCycleType" minOccurs="0"/&gt;
 *         &lt;element name="Offer" type="{http://telecomitalia.it/SOA/TRCS/Gateway}OfferType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseOfferChangeType")
public class BaseOfferChangeType
    extends SubscriptionType
{


}
