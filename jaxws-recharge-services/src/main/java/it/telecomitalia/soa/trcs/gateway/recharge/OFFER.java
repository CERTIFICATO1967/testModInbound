//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.10.13 alle 05:08:21 PM CEST 
//


package it.telecomitalia.soa.trcs.gateway.recharge;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://telecomitalia.it/SOA/TRCS/Gateway}AccountComponentType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{http://telecomitalia.it/SOA/TRCS/Gateway}ACCESSORY" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SLAVE" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Name"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;maxLength value="10"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MASTER" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Name"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;maxLength value="10"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DISCOUNT" type="{http://telecomitalia.it/SOA/TRCS/Gateway}DISCOUNTType" minOccurs="0"/&gt;
 *         &lt;element name="DISCOUNTDATA" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="COMPONENTSTATE"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"&gt;
 *                       &lt;maxInclusive value="4"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="OFFERNAME" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Discount" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *                 &lt;attribute name="LimitDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                 &lt;attribute name="BalanceInfo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="EventList" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EXTRADATA" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="DISCOUNTSTEPS" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;choice maxOccurs="unbounded"&gt;
 *                             &lt;element name="STEP" maxOccurs="4" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                                     &lt;attribute name="NEXTRENEWALS" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                                     &lt;attribute name="COSTVALUE" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                           &lt;totalDigits value="10"/&gt;
 *                                           &lt;fractionDigits value="2"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="USED" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                     &lt;attribute name="MINNUMRENEWAL" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                                     &lt;attribute name="MAXNUMRENEWAL" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                                     &lt;attribute name="COMPONENTSTATE"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="FINALSTEP"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                                     &lt;attribute name="COSTVALUE" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                           &lt;totalDigits value="10"/&gt;
 *                                           &lt;fractionDigits value="2"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="USED" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                     &lt;attribute name="MINNUMRENEWAL" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                                     &lt;attribute name="COMPONENTSTATE"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/choice&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="COMPONENTSTATE"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="OFFERID"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                       &lt;totalDigits value="8"/&gt;
 *                       &lt;fractionDigits value="0"/&gt;
 *                       &lt;minInclusive value="0"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="COSTTYPE" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="DEF"/&gt;
 *                       &lt;enumeration value="CB"/&gt;
 *                       &lt;enumeration value="AL"/&gt;
 *                       &lt;enumeration value="MNP"/&gt;
 *                       &lt;enumeration value="PP"/&gt;
 *                       &lt;enumeration value="SS"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="COSTVALUE"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                       &lt;totalDigits value="10"/&gt;
 *                       &lt;fractionDigits value="2"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="GTFCODE"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;maxLength value="15"/&gt;
 *                       &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;minLength value="0"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="INITIATIVECODE"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;minLength value="0"/&gt;
 *                       &lt;maxLength value="15"/&gt;
 *                       &lt;whiteSpace value="preserve"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="DISCOUNTMODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{http://telecomitalia.it/SOA/TRCS/Gateway}integrateOffer4query"/&gt;
 *       &lt;attribute name="OFFERID"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="8"/&gt;
 *             &lt;fractionDigits value="0"/&gt;
 *             &lt;minInclusive value="0"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="NAME"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="10"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="OFFERCATEGORY"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="2"/&gt;
 *             &lt;fractionDigits value="0"/&gt;
 *             &lt;minInclusive value="1"/&gt;
 *             &lt;maxInclusive value="5"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="MASTEROFFERID"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="8"/&gt;
 *             &lt;fractionDigits value="0"/&gt;
 *             &lt;minInclusive value="0"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="OFFERTYPE"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="2"/&gt;
 *             &lt;fractionDigits value="0"/&gt;
 *             &lt;minInclusive value="1"/&gt;
 *             &lt;maxInclusive value="3"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="STATE"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="2"/&gt;
 *             &lt;fractionDigits value="0"/&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;maxInclusive value="5"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="NOTIFYREQUEST"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="2"/&gt;
 *             &lt;fractionDigits value="0"/&gt;
 *             &lt;minInclusive value="1"/&gt;
 *             &lt;maxInclusive value="3"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="NOTIFYSTATE"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="2"/&gt;
 *             &lt;fractionDigits value="0"/&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;maxInclusive value="2"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="NOTIFYTYPE"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;length value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="HASEXTENSION"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="1"/&gt;
 *             &lt;fractionDigits value="0"/&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;maxInclusive value="4"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="NUMEXTENSION"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="4"/&gt;
 *             &lt;fractionDigits value="0"/&gt;
 *             &lt;minInclusive value="0"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ACTIVATIONDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="FEEPAYMENTDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="DEACTIVATIONDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="EXPIRYDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="NEXTFEEDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="PAYMODE" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="MODELCOST"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="21"/&gt;
 *             &lt;fractionDigits value="6"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="MODELCOSTSTART" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="MODELCOSTEND" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="MODELCOSTFLAG" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="MODELDISCOUNTVALUE"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="18"/&gt;
 *             &lt;fractionDigits value="6"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="OFFERKIND" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;pattern value="STD"/&gt;
 *             &lt;pattern value="MD"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="DIGITAL"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="B"/&gt;
 *             &lt;enumeration value="O"/&gt;
 *             &lt;enumeration value="C"/&gt;
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
@XmlType(name = "", propOrder = {
    "accessoryOrSLAVEOrMASTER"
})
@XmlRootElement(name = "OFFER")
public class OFFER
    extends AccountComponentType
{

    @XmlElements({
        @XmlElement(name = "ACCESSORY", type = ACCESSORY.class),
        @XmlElement(name = "SLAVE", namespace = "", type = OFFER.SLAVE.class),
        @XmlElement(name = "MASTER", namespace = "", type = OFFER.MASTER.class),
        @XmlElement(name = "DISCOUNT", namespace = "", type = DISCOUNTType.class),
        @XmlElement(name = "DISCOUNTDATA", namespace = "", type = OFFER.DISCOUNTDATA.class),
        @XmlElement(name = "EXTRADATA", namespace = "", type = OFFER.EXTRADATA.class)
    })
    protected List<Object> accessoryOrSLAVEOrMASTER;
    @XmlAttribute(name = "OFFERID")
    protected BigDecimal offerid;
    @XmlAttribute(name = "NAME")
    protected String name;
    @XmlAttribute(name = "OFFERCATEGORY")
    protected BigDecimal offercategory;
    @XmlAttribute(name = "MASTEROFFERID")
    protected BigDecimal masterofferid;
    @XmlAttribute(name = "OFFERTYPE")
    protected BigDecimal offertype;
    @XmlAttribute(name = "STATE")
    protected BigDecimal state;
    @XmlAttribute(name = "NOTIFYREQUEST")
    protected BigDecimal notifyrequest;
    @XmlAttribute(name = "NOTIFYSTATE")
    protected BigDecimal notifystate;
    @XmlAttribute(name = "NOTIFYTYPE")
    protected String notifytype;
    @XmlAttribute(name = "HASEXTENSION")
    protected BigDecimal hasextension;
    @XmlAttribute(name = "NUMEXTENSION")
    protected BigDecimal numextension;
    @XmlAttribute(name = "ACTIVATIONDATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activationdate;
    @XmlAttribute(name = "FEEPAYMENTDATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar feepaymentdate;
    @XmlAttribute(name = "DEACTIVATIONDATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deactivationdate;
    @XmlAttribute(name = "EXPIRYDATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirydate;
    @XmlAttribute(name = "NEXTFEEDATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextfeedate;
    @XmlAttribute(name = "PAYMODE")
    protected BigInteger paymode;
    @XmlAttribute(name = "MODELCOST")
    protected BigDecimal modelcost;
    @XmlAttribute(name = "MODELCOSTSTART")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modelcoststart;
    @XmlAttribute(name = "MODELCOSTEND")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modelcostend;
    @XmlAttribute(name = "MODELCOSTFLAG")
    protected BigInteger modelcostflag;
    @XmlAttribute(name = "MODELDISCOUNTVALUE")
    protected BigDecimal modeldiscountvalue;
    @XmlAttribute(name = "OFFERKIND", required = true)
    protected String offerkind;
    @XmlAttribute(name = "DIGITAL")
    protected String digital;
    @XmlAttribute(name = "DEACTMOD")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String deactmod;
    @XmlAttribute(name = "RESTART")
    protected Integer restart;

    /**
     * Gets the value of the accessoryOrSLAVEOrMASTER property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessoryOrSLAVEOrMASTER property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getACCESSORYOrSLAVEOrMASTER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ACCESSORY }
     * {@link OFFER.SLAVE }
     * {@link OFFER.MASTER }
     * {@link DISCOUNTType }
     * {@link OFFER.DISCOUNTDATA }
     * {@link OFFER.EXTRADATA }
     * 
     * 
     */
    public List<Object> getACCESSORYOrSLAVEOrMASTER() {
        if (accessoryOrSLAVEOrMASTER == null) {
            accessoryOrSLAVEOrMASTER = new ArrayList<Object>();
        }
        return this.accessoryOrSLAVEOrMASTER;
    }

    /**
     * Recupera il valore della proprietà offerid.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOFFERID() {
        return offerid;
    }

    /**
     * Imposta il valore della proprietà offerid.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOFFERID(BigDecimal value) {
        this.offerid = value;
    }

    /**
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietà offercategory.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOFFERCATEGORY() {
        return offercategory;
    }

    /**
     * Imposta il valore della proprietà offercategory.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOFFERCATEGORY(BigDecimal value) {
        this.offercategory = value;
    }

    /**
     * Recupera il valore della proprietà masterofferid.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMASTEROFFERID() {
        return masterofferid;
    }

    /**
     * Imposta il valore della proprietà masterofferid.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMASTEROFFERID(BigDecimal value) {
        this.masterofferid = value;
    }

    /**
     * Recupera il valore della proprietà offertype.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOFFERTYPE() {
        return offertype;
    }

    /**
     * Imposta il valore della proprietà offertype.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOFFERTYPE(BigDecimal value) {
        this.offertype = value;
    }

    /**
     * Recupera il valore della proprietà state.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSTATE() {
        return state;
    }

    /**
     * Imposta il valore della proprietà state.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSTATE(BigDecimal value) {
        this.state = value;
    }

    /**
     * Recupera il valore della proprietà notifyrequest.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNOTIFYREQUEST() {
        return notifyrequest;
    }

    /**
     * Imposta il valore della proprietà notifyrequest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNOTIFYREQUEST(BigDecimal value) {
        this.notifyrequest = value;
    }

    /**
     * Recupera il valore della proprietà notifystate.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNOTIFYSTATE() {
        return notifystate;
    }

    /**
     * Imposta il valore della proprietà notifystate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNOTIFYSTATE(BigDecimal value) {
        this.notifystate = value;
    }

    /**
     * Recupera il valore della proprietà notifytype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOTIFYTYPE() {
        return notifytype;
    }

    /**
     * Imposta il valore della proprietà notifytype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOTIFYTYPE(String value) {
        this.notifytype = value;
    }

    /**
     * Recupera il valore della proprietà hasextension.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHASEXTENSION() {
        return hasextension;
    }

    /**
     * Imposta il valore della proprietà hasextension.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHASEXTENSION(BigDecimal value) {
        this.hasextension = value;
    }

    /**
     * Recupera il valore della proprietà numextension.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNUMEXTENSION() {
        return numextension;
    }

    /**
     * Imposta il valore della proprietà numextension.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNUMEXTENSION(BigDecimal value) {
        this.numextension = value;
    }

    /**
     * Recupera il valore della proprietà activationdate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getACTIVATIONDATE() {
        return activationdate;
    }

    /**
     * Imposta il valore della proprietà activationdate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setACTIVATIONDATE(XMLGregorianCalendar value) {
        this.activationdate = value;
    }

    /**
     * Recupera il valore della proprietà feepaymentdate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFEEPAYMENTDATE() {
        return feepaymentdate;
    }

    /**
     * Imposta il valore della proprietà feepaymentdate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFEEPAYMENTDATE(XMLGregorianCalendar value) {
        this.feepaymentdate = value;
    }

    /**
     * Recupera il valore della proprietà deactivationdate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDEACTIVATIONDATE() {
        return deactivationdate;
    }

    /**
     * Imposta il valore della proprietà deactivationdate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDEACTIVATIONDATE(XMLGregorianCalendar value) {
        this.deactivationdate = value;
    }

    /**
     * Recupera il valore della proprietà expirydate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEXPIRYDATE() {
        return expirydate;
    }

    /**
     * Imposta il valore della proprietà expirydate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEXPIRYDATE(XMLGregorianCalendar value) {
        this.expirydate = value;
    }

    /**
     * Recupera il valore della proprietà nextfeedate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNEXTFEEDATE() {
        return nextfeedate;
    }

    /**
     * Imposta il valore della proprietà nextfeedate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNEXTFEEDATE(XMLGregorianCalendar value) {
        this.nextfeedate = value;
    }

    /**
     * Recupera il valore della proprietà paymode.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPAYMODE() {
        return paymode;
    }

    /**
     * Imposta il valore della proprietà paymode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPAYMODE(BigInteger value) {
        this.paymode = value;
    }

    /**
     * Recupera il valore della proprietà modelcost.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMODELCOST() {
        return modelcost;
    }

    /**
     * Imposta il valore della proprietà modelcost.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMODELCOST(BigDecimal value) {
        this.modelcost = value;
    }

    /**
     * Recupera il valore della proprietà modelcoststart.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMODELCOSTSTART() {
        return modelcoststart;
    }

    /**
     * Imposta il valore della proprietà modelcoststart.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMODELCOSTSTART(XMLGregorianCalendar value) {
        this.modelcoststart = value;
    }

    /**
     * Recupera il valore della proprietà modelcostend.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMODELCOSTEND() {
        return modelcostend;
    }

    /**
     * Imposta il valore della proprietà modelcostend.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMODELCOSTEND(XMLGregorianCalendar value) {
        this.modelcostend = value;
    }

    /**
     * Recupera il valore della proprietà modelcostflag.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMODELCOSTFLAG() {
        return modelcostflag;
    }

    /**
     * Imposta il valore della proprietà modelcostflag.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMODELCOSTFLAG(BigInteger value) {
        this.modelcostflag = value;
    }

    /**
     * Recupera il valore della proprietà modeldiscountvalue.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMODELDISCOUNTVALUE() {
        return modeldiscountvalue;
    }

    /**
     * Imposta il valore della proprietà modeldiscountvalue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMODELDISCOUNTVALUE(BigDecimal value) {
        this.modeldiscountvalue = value;
    }

    /**
     * Recupera il valore della proprietà offerkind.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOFFERKIND() {
        return offerkind;
    }

    /**
     * Imposta il valore della proprietà offerkind.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOFFERKIND(String value) {
        this.offerkind = value;
    }

    /**
     * Recupera il valore della proprietà digital.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIGITAL() {
        return digital;
    }

    /**
     * Imposta il valore della proprietà digital.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIGITAL(String value) {
        this.digital = value;
    }

    /**
     * Recupera il valore della proprietà deactmod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEACTMOD() {
        return deactmod;
    }

    /**
     * Imposta il valore della proprietà deactmod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEACTMOD(String value) {
        this.deactmod = value;
    }

    /**
     * Recupera il valore della proprietà restart.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRESTART() {
        return restart;
    }

    /**
     * Imposta il valore della proprietà restart.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRESTART(Integer value) {
        this.restart = value;
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
     *       &lt;attribute name="COMPONENTSTATE"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"&gt;
     *             &lt;maxInclusive value="4"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="OFFERNAME" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Discount" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
     *       &lt;attribute name="LimitDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *       &lt;attribute name="BalanceInfo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="EventList" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DISCOUNTDATA {

        @XmlAttribute(name = "COMPONENTSTATE")
        protected Integer componentstate;
        @XmlAttribute(name = "OFFERNAME", required = true)
        protected String offername;
        @XmlAttribute(name = "Discount", required = true)
        protected double discount;
        @XmlAttribute(name = "LimitDate", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar limitDate;
        @XmlAttribute(name = "BalanceInfo", required = true)
        protected String balanceInfo;
        @XmlAttribute(name = "EventList", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String eventList;

        /**
         * Recupera il valore della proprietà componentstate.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCOMPONENTSTATE() {
            return componentstate;
        }

        /**
         * Imposta il valore della proprietà componentstate.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCOMPONENTSTATE(Integer value) {
            this.componentstate = value;
        }

        /**
         * Recupera il valore della proprietà offername.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOFFERNAME() {
            return offername;
        }

        /**
         * Imposta il valore della proprietà offername.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOFFERNAME(String value) {
            this.offername = value;
        }

        /**
         * Recupera il valore della proprietà discount.
         * 
         */
        public double getDiscount() {
            return discount;
        }

        /**
         * Imposta il valore della proprietà discount.
         * 
         */
        public void setDiscount(double value) {
            this.discount = value;
        }

        /**
         * Recupera il valore della proprietà limitDate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLimitDate() {
            return limitDate;
        }

        /**
         * Imposta il valore della proprietà limitDate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLimitDate(XMLGregorianCalendar value) {
            this.limitDate = value;
        }

        /**
         * Recupera il valore della proprietà balanceInfo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBalanceInfo() {
            return balanceInfo;
        }

        /**
         * Imposta il valore della proprietà balanceInfo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBalanceInfo(String value) {
            this.balanceInfo = value;
        }

        /**
         * Recupera il valore della proprietà eventList.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEventList() {
            return eventList;
        }

        /**
         * Imposta il valore della proprietà eventList.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEventList(String value) {
            this.eventList = value;
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
     *       &lt;sequence minOccurs="0"&gt;
     *         &lt;element name="DISCOUNTSTEPS" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;choice maxOccurs="unbounded"&gt;
     *                   &lt;element name="STEP" maxOccurs="4" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                           &lt;attribute name="NEXTRENEWALS" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                           &lt;attribute name="COSTVALUE" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                                 &lt;totalDigits value="10"/&gt;
     *                                 &lt;fractionDigits value="2"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="USED" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                           &lt;attribute name="MINNUMRENEWAL" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                           &lt;attribute name="MAXNUMRENEWAL" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                           &lt;attribute name="COMPONENTSTATE"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="FINALSTEP"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                           &lt;attribute name="COSTVALUE" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                                 &lt;totalDigits value="10"/&gt;
     *                                 &lt;fractionDigits value="2"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="USED" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                           &lt;attribute name="MINNUMRENEWAL" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                           &lt;attribute name="COMPONENTSTATE"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/choice&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="COMPONENTSTATE"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="OFFERID"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *             &lt;totalDigits value="8"/&gt;
     *             &lt;fractionDigits value="0"/&gt;
     *             &lt;minInclusive value="0"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="COSTTYPE" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="DEF"/&gt;
     *             &lt;enumeration value="CB"/&gt;
     *             &lt;enumeration value="AL"/&gt;
     *             &lt;enumeration value="MNP"/&gt;
     *             &lt;enumeration value="PP"/&gt;
     *             &lt;enumeration value="SS"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="COSTVALUE"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *             &lt;totalDigits value="10"/&gt;
     *             &lt;fractionDigits value="2"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="GTFCODE"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;maxLength value="15"/&gt;
     *             &lt;whiteSpace value="preserve"/&gt;
     *             &lt;minLength value="0"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="INITIATIVECODE"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;minLength value="0"/&gt;
     *             &lt;maxLength value="15"/&gt;
     *             &lt;whiteSpace value="preserve"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="DISCOUNTMODE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "discountsteps"
    })
    public static class EXTRADATA {

        @XmlElement(name = "DISCOUNTSTEPS", namespace = "")
        protected OFFER.EXTRADATA.DISCOUNTSTEPS discountsteps;
        @XmlAttribute(name = "COMPONENTSTATE")
        protected BigInteger componentstate;
        @XmlAttribute(name = "OFFERID")
        protected BigDecimal offerid;
        @XmlAttribute(name = "COSTTYPE", required = true)
        protected String costtype;
        @XmlAttribute(name = "COSTVALUE")
        protected BigDecimal costvalue;
        @XmlAttribute(name = "GTFCODE")
        protected String gtfcode;
        @XmlAttribute(name = "INITIATIVECODE")
        protected String initiativecode;
        @XmlAttribute(name = "DISCOUNTMODE")
        protected String discountmode;

        /**
         * Recupera il valore della proprietà discountsteps.
         * 
         * @return
         *     possible object is
         *     {@link OFFER.EXTRADATA.DISCOUNTSTEPS }
         *     
         */
        public OFFER.EXTRADATA.DISCOUNTSTEPS getDISCOUNTSTEPS() {
            return discountsteps;
        }

        /**
         * Imposta il valore della proprietà discountsteps.
         * 
         * @param value
         *     allowed object is
         *     {@link OFFER.EXTRADATA.DISCOUNTSTEPS }
         *     
         */
        public void setDISCOUNTSTEPS(OFFER.EXTRADATA.DISCOUNTSTEPS value) {
            this.discountsteps = value;
        }

        /**
         * Recupera il valore della proprietà componentstate.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCOMPONENTSTATE() {
            return componentstate;
        }

        /**
         * Imposta il valore della proprietà componentstate.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCOMPONENTSTATE(BigInteger value) {
            this.componentstate = value;
        }

        /**
         * Recupera il valore della proprietà offerid.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getOFFERID() {
            return offerid;
        }

        /**
         * Imposta il valore della proprietà offerid.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setOFFERID(BigDecimal value) {
            this.offerid = value;
        }

        /**
         * Recupera il valore della proprietà costtype.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOSTTYPE() {
            return costtype;
        }

        /**
         * Imposta il valore della proprietà costtype.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOSTTYPE(String value) {
            this.costtype = value;
        }

        /**
         * Recupera il valore della proprietà costvalue.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCOSTVALUE() {
            return costvalue;
        }

        /**
         * Imposta il valore della proprietà costvalue.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCOSTVALUE(BigDecimal value) {
            this.costvalue = value;
        }

        /**
         * Recupera il valore della proprietà gtfcode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGTFCODE() {
            return gtfcode;
        }

        /**
         * Imposta il valore della proprietà gtfcode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGTFCODE(String value) {
            this.gtfcode = value;
        }

        /**
         * Recupera il valore della proprietà initiativecode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINITIATIVECODE() {
            return initiativecode;
        }

        /**
         * Imposta il valore della proprietà initiativecode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINITIATIVECODE(String value) {
            this.initiativecode = value;
        }

        /**
         * Recupera il valore della proprietà discountmode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDISCOUNTMODE() {
            return discountmode;
        }

        /**
         * Imposta il valore della proprietà discountmode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDISCOUNTMODE(String value) {
            this.discountmode = value;
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
         *       &lt;choice maxOccurs="unbounded"&gt;
         *         &lt;element name="STEP" maxOccurs="4" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *                 &lt;attribute name="NEXTRENEWALS" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *                 &lt;attribute name="COSTVALUE" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *                       &lt;totalDigits value="10"/&gt;
         *                       &lt;fractionDigits value="2"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="USED" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                 &lt;attribute name="MINNUMRENEWAL" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *                 &lt;attribute name="MAXNUMRENEWAL" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *                 &lt;attribute name="COMPONENTSTATE"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="FINALSTEP"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *                 &lt;attribute name="COSTVALUE" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *                       &lt;totalDigits value="10"/&gt;
         *                       &lt;fractionDigits value="2"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="USED" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                 &lt;attribute name="MINNUMRENEWAL" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *                 &lt;attribute name="COMPONENTSTATE"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/choice&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "stepOrFINALSTEP"
        })
        public static class DISCOUNTSTEPS {

            @XmlElements({
                @XmlElement(name = "STEP", namespace = "", type = OFFER.EXTRADATA.DISCOUNTSTEPS.STEP.class),
                @XmlElement(name = "FINALSTEP", namespace = "", type = OFFER.EXTRADATA.DISCOUNTSTEPS.FINALSTEP.class)
            })
            protected List<Object> stepOrFINALSTEP;

            /**
             * Gets the value of the stepOrFINALSTEP property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the stepOrFINALSTEP property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSTEPOrFINALSTEP().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OFFER.EXTRADATA.DISCOUNTSTEPS.STEP }
             * {@link OFFER.EXTRADATA.DISCOUNTSTEPS.FINALSTEP }
             * 
             * 
             */
            public List<Object> getSTEPOrFINALSTEP() {
                if (stepOrFINALSTEP == null) {
                    stepOrFINALSTEP = new ArrayList<Object>();
                }
                return this.stepOrFINALSTEP;
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
             *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
             *       &lt;attribute name="COSTVALUE" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
             *             &lt;totalDigits value="10"/&gt;
             *             &lt;fractionDigits value="2"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="USED" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *       &lt;attribute name="MINNUMRENEWAL" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
             *       &lt;attribute name="COMPONENTSTATE"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"&gt;
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
            public static class FINALSTEP {

                @XmlAttribute(name = "ID", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String id;
                @XmlAttribute(name = "COSTVALUE", required = true)
                protected BigDecimal costvalue;
                @XmlAttribute(name = "USED", required = true)
                protected boolean used;
                @XmlAttribute(name = "MINNUMRENEWAL", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String minnumrenewal;
                @XmlAttribute(name = "COMPONENTSTATE")
                protected BigInteger componentstate;

                /**
                 * Recupera il valore della proprietà id.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getID() {
                    return id;
                }

                /**
                 * Imposta il valore della proprietà id.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setID(String value) {
                    this.id = value;
                }

                /**
                 * Recupera il valore della proprietà costvalue.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getCOSTVALUE() {
                    return costvalue;
                }

                /**
                 * Imposta il valore della proprietà costvalue.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setCOSTVALUE(BigDecimal value) {
                    this.costvalue = value;
                }

                /**
                 * Recupera il valore della proprietà used.
                 * 
                 */
                public boolean isUSED() {
                    return used;
                }

                /**
                 * Imposta il valore della proprietà used.
                 * 
                 */
                public void setUSED(boolean value) {
                    this.used = value;
                }

                /**
                 * Recupera il valore della proprietà minnumrenewal.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMINNUMRENEWAL() {
                    return minnumrenewal;
                }

                /**
                 * Imposta il valore della proprietà minnumrenewal.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMINNUMRENEWAL(String value) {
                    this.minnumrenewal = value;
                }

                /**
                 * Recupera il valore della proprietà componentstate.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getCOMPONENTSTATE() {
                    return componentstate;
                }

                /**
                 * Imposta il valore della proprietà componentstate.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setCOMPONENTSTATE(BigInteger value) {
                    this.componentstate = value;
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
             *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
             *       &lt;attribute name="NEXTRENEWALS" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
             *       &lt;attribute name="COSTVALUE" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
             *             &lt;totalDigits value="10"/&gt;
             *             &lt;fractionDigits value="2"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="USED" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *       &lt;attribute name="MINNUMRENEWAL" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
             *       &lt;attribute name="MAXNUMRENEWAL" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
             *       &lt;attribute name="COMPONENTSTATE"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"&gt;
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
            public static class STEP {

                @XmlAttribute(name = "ID", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String id;
                @XmlAttribute(name = "NEXTRENEWALS", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String nextrenewals;
                @XmlAttribute(name = "COSTVALUE", required = true)
                protected BigDecimal costvalue;
                @XmlAttribute(name = "USED", required = true)
                protected boolean used;
                @XmlAttribute(name = "MINNUMRENEWAL", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String minnumrenewal;
                @XmlAttribute(name = "MAXNUMRENEWAL", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String maxnumrenewal;
                @XmlAttribute(name = "COMPONENTSTATE")
                protected BigInteger componentstate;

                /**
                 * Recupera il valore della proprietà id.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getID() {
                    return id;
                }

                /**
                 * Imposta il valore della proprietà id.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setID(String value) {
                    this.id = value;
                }

                /**
                 * Recupera il valore della proprietà nextrenewals.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNEXTRENEWALS() {
                    return nextrenewals;
                }

                /**
                 * Imposta il valore della proprietà nextrenewals.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNEXTRENEWALS(String value) {
                    this.nextrenewals = value;
                }

                /**
                 * Recupera il valore della proprietà costvalue.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getCOSTVALUE() {
                    return costvalue;
                }

                /**
                 * Imposta il valore della proprietà costvalue.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setCOSTVALUE(BigDecimal value) {
                    this.costvalue = value;
                }

                /**
                 * Recupera il valore della proprietà used.
                 * 
                 */
                public boolean isUSED() {
                    return used;
                }

                /**
                 * Imposta il valore della proprietà used.
                 * 
                 */
                public void setUSED(boolean value) {
                    this.used = value;
                }

                /**
                 * Recupera il valore della proprietà minnumrenewal.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMINNUMRENEWAL() {
                    return minnumrenewal;
                }

                /**
                 * Imposta il valore della proprietà minnumrenewal.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMINNUMRENEWAL(String value) {
                    this.minnumrenewal = value;
                }

                /**
                 * Recupera il valore della proprietà maxnumrenewal.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMAXNUMRENEWAL() {
                    return maxnumrenewal;
                }

                /**
                 * Imposta il valore della proprietà maxnumrenewal.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMAXNUMRENEWAL(String value) {
                    this.maxnumrenewal = value;
                }

                /**
                 * Recupera il valore della proprietà componentstate.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getCOMPONENTSTATE() {
                    return componentstate;
                }

                /**
                 * Imposta il valore della proprietà componentstate.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setCOMPONENTSTATE(BigInteger value) {
                    this.componentstate = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="Name"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;maxLength value="10"/&gt;
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
    public static class MASTER {

        @XmlAttribute(name = "Name")
        protected String name;

        /**
         * Recupera il valore della proprietà name.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Imposta il valore della proprietà name.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
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
     *       &lt;attribute name="Name"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;maxLength value="10"/&gt;
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
    public static class SLAVE {

        @XmlAttribute(name = "Name")
        protected String name;

        /**
         * Recupera il valore della proprietà name.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Imposta il valore della proprietà name.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

    }

}
