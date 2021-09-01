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
 * <p>Classe Java per DeleteSubscriberXIbData complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DeleteSubscriberXIbData"&gt;
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
 *                   &lt;element name="ServintSubscriber"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Client"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="Reason" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;maxLength value="2"/&gt;
 *                                           &lt;minLength value="1"/&gt;
 *                                           &lt;whiteSpace value="preserve"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;choice minOccurs="0"&gt;
 *                               &lt;element name="Normal"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;attribute name="OloMSISDN"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="12"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/attribute&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="MnpServInt"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;attribute name="MnpMSISDN" use="required"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                             &lt;maxLength value="12"/&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/attribute&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="MnpNumChange"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;attribute name="MnpMSISDN" use="required"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                             &lt;maxLength value="12"/&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;pattern value="[0-9]+"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/attribute&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="MnpNumCorrection"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;attribute name="MnpMSISDN" use="required"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                             &lt;maxLength value="12"/&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;pattern value="[0-9]+"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/attribute&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="MnpDualInt"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;attribute name="MnpMSISDN" use="required"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                             &lt;maxLength value="12"/&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;pattern value="[0-9]+"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/attribute&gt;
 *                                       &lt;attribute name="OloMSISDN" use="required"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                             &lt;maxLength value="12"/&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;pattern value="[0-9]+"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/attribute&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="TimOloUncouple"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="Subscription" type="{http://telecomitalia.it/SOA/TRCS/Gateway}OptionalSubscriptionType"/&gt;
 *                                       &lt;/sequence&gt;
 *                                       &lt;attribute name="OloMSISDN" use="required"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                             &lt;maxLength value="12"/&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;pattern value="[0-9]+"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/attribute&gt;
 *                                       &lt;attribute name="TypeOfCard" use="required"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/attribute&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="TwoInOneInt"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;attribute name="OloMSISDN" use="required"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                             &lt;maxLength value="12"/&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;pattern value="[0-9]+"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/attribute&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="TwoInOneDeact"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;attribute name="OloMSISDN" use="required"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                             &lt;maxLength value="12"/&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;pattern value="[0-9]+"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/attribute&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="TwoInOneMigr"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;attribute name="MnpMSISDN" use="required"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;maxLength value="12"/&gt;
 *                                             &lt;pattern value="[0-9]+"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/attribute&gt;
 *                                       &lt;attribute name="OloMSISDN" use="required"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                             &lt;maxLength value="12"/&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;pattern value="[0-9]+"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/attribute&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="TwoInOneVNumDPlusDeact"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;attribute name="MnpMSISDN" use="required"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;maxLength value="12"/&gt;
 *                                             &lt;pattern value="[0-9]+"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/attribute&gt;
 *                                       &lt;attribute name="OloMSISDN" use="required"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;maxLength value="12"/&gt;
 *                                             &lt;pattern value="[0-9]+"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/attribute&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="MnpDualIntMvno"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;attribute name="MnpMSISDN" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                       &lt;attribute name="OloMSISDN" use="required"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                             &lt;maxLength value="12"/&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;pattern value="[0-9]+"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/attribute&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="TwoInOneMigrMvno"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;attribute name="MnpMSISDN" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                       &lt;attribute name="OloMSISDN" use="required"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                             &lt;maxLength value="12"/&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;pattern value="[0-9]+"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/attribute&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="TwoInOneVNumMigrMvno"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;attribute name="MnpMSISDN" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                       &lt;attribute name="OloMSISDN" use="required"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;maxLength value="12"/&gt;
 *                                             &lt;pattern value="[0-9]+"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/attribute&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="MnpMvno"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;attribute name="MnpMSISDN" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="MnpTCBSInt"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;attribute name="MnpMSISDN" use="required"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;maxLength value="12"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/attribute&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="MnpDeleted"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;attribute name="MnpMSISDN" use="required"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;maxLength value="12"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/attribute&gt;
 *                                       &lt;attribute name="TypeOfCard" use="required"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/attribute&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="AutoReloadNotify" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                             &lt;/choice&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="ServIntType" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="1"/&gt;
 *                                 &lt;enumeration value="Normal"/&gt;
 *                                 &lt;enumeration value="GoodByeService"/&gt;
 *                                 &lt;enumeration value="MnpServInt"/&gt;
 *                                 &lt;enumeration value="MnpNumChange"/&gt;
 *                                 &lt;enumeration value="MnpNumCorrection"/&gt;
 *                                 &lt;enumeration value="MnpDualInt"/&gt;
 *                                 &lt;enumeration value="TimOloUncouple"/&gt;
 *                                 &lt;enumeration value="TCBInt"/&gt;
 *                                 &lt;enumeration value="TwoInOneInt"/&gt;
 *                                 &lt;enumeration value="TwoInOneDeact"/&gt;
 *                                 &lt;enumeration value="TwoInOneMigr"/&gt;
 *                                 &lt;enumeration value="TwoInOneVNumDPlusDeact"/&gt;
 *                                 &lt;enumeration value="MnpMvno"/&gt;
 *                                 &lt;enumeration value="MnpDualIntMvno"/&gt;
 *                                 &lt;enumeration value="TwoInOneMigrMvno"/&gt;
 *                                 &lt;enumeration value="TwoInOneVNumMigrMvno"/&gt;
 *                                 &lt;enumeration value="MnpTCBSInt"/&gt;
 *                                 &lt;enumeration value="MnpDeleted"/&gt;
 *                                 &lt;enumeration value="AutoReloadNotify"/&gt;
 *                                 &lt;enumeration value="EbuRollbackDelete"/&gt;
 *                                 &lt;enumeration value="EbuRollbackPreinstalled"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="RECESSRIGHT" default="0"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                                 &lt;pattern value="[0|1]"/&gt;
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
 *                       &lt;enumeration value="ServintSubscriber"/&gt;
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
@XmlType(name = "DeleteSubscriberXIbData", propOrder = {
    "transaction",
    "clientKeys",
    "operation"
})
public class DeleteSubscriberXIbData {

    @XmlElement(name = "Transaction", required = true)
    protected DeleteSubscriberXIbData.Transaction transaction;
    @XmlElement(name = "ClientKeys")
    protected DeleteSubscriberXIbData.ClientKeys clientKeys;
    @XmlElement(name = "Operation", required = true)
    protected DeleteSubscriberXIbData.Operation operation;
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
     *     {@link DeleteSubscriberXIbData.Transaction }
     *     
     */
    public DeleteSubscriberXIbData.Transaction getTransaction() {
        return transaction;
    }

    /**
     * Imposta il valore della proprietà transaction.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteSubscriberXIbData.Transaction }
     *     
     */
    public void setTransaction(DeleteSubscriberXIbData.Transaction value) {
        this.transaction = value;
    }

    /**
     * Recupera il valore della proprietà clientKeys.
     * 
     * @return
     *     possible object is
     *     {@link DeleteSubscriberXIbData.ClientKeys }
     *     
     */
    public DeleteSubscriberXIbData.ClientKeys getClientKeys() {
        return clientKeys;
    }

    /**
     * Imposta il valore della proprietà clientKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteSubscriberXIbData.ClientKeys }
     *     
     */
    public void setClientKeys(DeleteSubscriberXIbData.ClientKeys value) {
        this.clientKeys = value;
    }

    /**
     * Recupera il valore della proprietà operation.
     * 
     * @return
     *     possible object is
     *     {@link DeleteSubscriberXIbData.Operation }
     *     
     */
    public DeleteSubscriberXIbData.Operation getOperation() {
        return operation;
    }

    /**
     * Imposta il valore della proprietà operation.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteSubscriberXIbData.Operation }
     *     
     */
    public void setOperation(DeleteSubscriberXIbData.Operation value) {
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
     *         &lt;element name="ServintSubscriber"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Client"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="Reason" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;maxLength value="2"/&gt;
     *                                 &lt;minLength value="1"/&gt;
     *                                 &lt;whiteSpace value="preserve"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;choice minOccurs="0"&gt;
     *                     &lt;element name="Normal"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;complexContent&gt;
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                             &lt;attribute name="OloMSISDN"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="12"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/attribute&gt;
     *                           &lt;/restriction&gt;
     *                         &lt;/complexContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                     &lt;element name="MnpServInt"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;complexContent&gt;
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                             &lt;attribute name="MnpMSISDN" use="required"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                   &lt;maxLength value="12"/&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/attribute&gt;
     *                           &lt;/restriction&gt;
     *                         &lt;/complexContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                     &lt;element name="MnpNumChange"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;complexContent&gt;
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                             &lt;attribute name="MnpMSISDN" use="required"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                   &lt;maxLength value="12"/&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;pattern value="[0-9]+"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/attribute&gt;
     *                           &lt;/restriction&gt;
     *                         &lt;/complexContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                     &lt;element name="MnpNumCorrection"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;complexContent&gt;
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                             &lt;attribute name="MnpMSISDN" use="required"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                   &lt;maxLength value="12"/&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;pattern value="[0-9]+"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/attribute&gt;
     *                           &lt;/restriction&gt;
     *                         &lt;/complexContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                     &lt;element name="MnpDualInt"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;complexContent&gt;
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                             &lt;attribute name="MnpMSISDN" use="required"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                   &lt;maxLength value="12"/&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;pattern value="[0-9]+"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/attribute&gt;
     *                             &lt;attribute name="OloMSISDN" use="required"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                   &lt;maxLength value="12"/&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;pattern value="[0-9]+"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/attribute&gt;
     *                           &lt;/restriction&gt;
     *                         &lt;/complexContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                     &lt;element name="TimOloUncouple"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;complexContent&gt;
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                             &lt;sequence&gt;
     *                               &lt;element name="Subscription" type="{http://telecomitalia.it/SOA/TRCS/Gateway}OptionalSubscriptionType"/&gt;
     *                             &lt;/sequence&gt;
     *                             &lt;attribute name="OloMSISDN" use="required"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                   &lt;maxLength value="12"/&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;pattern value="[0-9]+"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/attribute&gt;
     *                             &lt;attribute name="TypeOfCard" use="required"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/attribute&gt;
     *                           &lt;/restriction&gt;
     *                         &lt;/complexContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                     &lt;element name="TwoInOneInt"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;complexContent&gt;
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                             &lt;attribute name="OloMSISDN" use="required"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                   &lt;maxLength value="12"/&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;pattern value="[0-9]+"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/attribute&gt;
     *                           &lt;/restriction&gt;
     *                         &lt;/complexContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                     &lt;element name="TwoInOneDeact"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;complexContent&gt;
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                             &lt;attribute name="OloMSISDN" use="required"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                   &lt;maxLength value="12"/&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;pattern value="[0-9]+"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/attribute&gt;
     *                           &lt;/restriction&gt;
     *                         &lt;/complexContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                     &lt;element name="TwoInOneMigr"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;complexContent&gt;
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                             &lt;attribute name="MnpMSISDN" use="required"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;maxLength value="12"/&gt;
     *                                   &lt;pattern value="[0-9]+"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/attribute&gt;
     *                             &lt;attribute name="OloMSISDN" use="required"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                   &lt;maxLength value="12"/&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;pattern value="[0-9]+"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/attribute&gt;
     *                           &lt;/restriction&gt;
     *                         &lt;/complexContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                     &lt;element name="TwoInOneVNumDPlusDeact"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;complexContent&gt;
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                             &lt;attribute name="MnpMSISDN" use="required"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;maxLength value="12"/&gt;
     *                                   &lt;pattern value="[0-9]+"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/attribute&gt;
     *                             &lt;attribute name="OloMSISDN" use="required"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;maxLength value="12"/&gt;
     *                                   &lt;pattern value="[0-9]+"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/attribute&gt;
     *                           &lt;/restriction&gt;
     *                         &lt;/complexContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                     &lt;element name="MnpDualIntMvno"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;complexContent&gt;
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                             &lt;attribute name="MnpMSISDN" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                             &lt;attribute name="OloMSISDN" use="required"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                   &lt;maxLength value="12"/&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;pattern value="[0-9]+"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/attribute&gt;
     *                           &lt;/restriction&gt;
     *                         &lt;/complexContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                     &lt;element name="TwoInOneMigrMvno"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;complexContent&gt;
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                             &lt;attribute name="MnpMSISDN" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                             &lt;attribute name="OloMSISDN" use="required"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                   &lt;maxLength value="12"/&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;pattern value="[0-9]+"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/attribute&gt;
     *                           &lt;/restriction&gt;
     *                         &lt;/complexContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                     &lt;element name="TwoInOneVNumMigrMvno"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;complexContent&gt;
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                             &lt;attribute name="MnpMSISDN" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                             &lt;attribute name="OloMSISDN" use="required"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;maxLength value="12"/&gt;
     *                                   &lt;pattern value="[0-9]+"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/attribute&gt;
     *                           &lt;/restriction&gt;
     *                         &lt;/complexContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                     &lt;element name="MnpMvno"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;complexContent&gt;
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                             &lt;attribute name="MnpMSISDN" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;/restriction&gt;
     *                         &lt;/complexContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                     &lt;element name="MnpTCBSInt"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;complexContent&gt;
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                             &lt;attribute name="MnpMSISDN" use="required"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;maxLength value="12"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/attribute&gt;
     *                           &lt;/restriction&gt;
     *                         &lt;/complexContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                     &lt;element name="MnpDeleted"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;complexContent&gt;
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                             &lt;attribute name="MnpMSISDN" use="required"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;maxLength value="12"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/attribute&gt;
     *                             &lt;attribute name="TypeOfCard" use="required"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/attribute&gt;
     *                           &lt;/restriction&gt;
     *                         &lt;/complexContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                     &lt;element name="AutoReloadNotify" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                   &lt;/choice&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="ServIntType" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="1"/&gt;
     *                       &lt;enumeration value="Normal"/&gt;
     *                       &lt;enumeration value="GoodByeService"/&gt;
     *                       &lt;enumeration value="MnpServInt"/&gt;
     *                       &lt;enumeration value="MnpNumChange"/&gt;
     *                       &lt;enumeration value="MnpNumCorrection"/&gt;
     *                       &lt;enumeration value="MnpDualInt"/&gt;
     *                       &lt;enumeration value="TimOloUncouple"/&gt;
     *                       &lt;enumeration value="TCBInt"/&gt;
     *                       &lt;enumeration value="TwoInOneInt"/&gt;
     *                       &lt;enumeration value="TwoInOneDeact"/&gt;
     *                       &lt;enumeration value="TwoInOneMigr"/&gt;
     *                       &lt;enumeration value="TwoInOneVNumDPlusDeact"/&gt;
     *                       &lt;enumeration value="MnpMvno"/&gt;
     *                       &lt;enumeration value="MnpDualIntMvno"/&gt;
     *                       &lt;enumeration value="TwoInOneMigrMvno"/&gt;
     *                       &lt;enumeration value="TwoInOneVNumMigrMvno"/&gt;
     *                       &lt;enumeration value="MnpTCBSInt"/&gt;
     *                       &lt;enumeration value="MnpDeleted"/&gt;
     *                       &lt;enumeration value="AutoReloadNotify"/&gt;
     *                       &lt;enumeration value="EbuRollbackDelete"/&gt;
     *                       &lt;enumeration value="EbuRollbackPreinstalled"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="RECESSRIGHT" default="0"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *                       &lt;pattern value="[0|1]"/&gt;
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
     *             &lt;enumeration value="ServintSubscriber"/&gt;
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
        "servintSubscriber"
    })
    public static class Operation {

        @XmlElement(name = "ServintSubscriber", required = true)
        protected DeleteSubscriberXIbData.Operation.ServintSubscriber servintSubscriber;
        @XmlAttribute(name = "OperationType", required = true)
        protected String operationType;
        @XmlAttribute(name = "Info")
        protected String info;

        /**
         * Recupera il valore della proprietà servintSubscriber.
         * 
         * @return
         *     possible object is
         *     {@link DeleteSubscriberXIbData.Operation.ServintSubscriber }
         *     
         */
        public DeleteSubscriberXIbData.Operation.ServintSubscriber getServintSubscriber() {
            return servintSubscriber;
        }

        /**
         * Imposta il valore della proprietà servintSubscriber.
         * 
         * @param value
         *     allowed object is
         *     {@link DeleteSubscriberXIbData.Operation.ServintSubscriber }
         *     
         */
        public void setServintSubscriber(DeleteSubscriberXIbData.Operation.ServintSubscriber value) {
            this.servintSubscriber = value;
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
         *                 &lt;attribute name="Reason" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;maxLength value="2"/&gt;
         *                       &lt;minLength value="1"/&gt;
         *                       &lt;whiteSpace value="preserve"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;choice minOccurs="0"&gt;
         *           &lt;element name="Normal"&gt;
         *             &lt;complexType&gt;
         *               &lt;complexContent&gt;
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                   &lt;attribute name="OloMSISDN"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="12"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/attribute&gt;
         *                 &lt;/restriction&gt;
         *               &lt;/complexContent&gt;
         *             &lt;/complexType&gt;
         *           &lt;/element&gt;
         *           &lt;element name="MnpServInt"&gt;
         *             &lt;complexType&gt;
         *               &lt;complexContent&gt;
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                   &lt;attribute name="MnpMSISDN" use="required"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                         &lt;maxLength value="12"/&gt;
         *                         &lt;minLength value="1"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/attribute&gt;
         *                 &lt;/restriction&gt;
         *               &lt;/complexContent&gt;
         *             &lt;/complexType&gt;
         *           &lt;/element&gt;
         *           &lt;element name="MnpNumChange"&gt;
         *             &lt;complexType&gt;
         *               &lt;complexContent&gt;
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                   &lt;attribute name="MnpMSISDN" use="required"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                         &lt;maxLength value="12"/&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;pattern value="[0-9]+"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/attribute&gt;
         *                 &lt;/restriction&gt;
         *               &lt;/complexContent&gt;
         *             &lt;/complexType&gt;
         *           &lt;/element&gt;
         *           &lt;element name="MnpNumCorrection"&gt;
         *             &lt;complexType&gt;
         *               &lt;complexContent&gt;
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                   &lt;attribute name="MnpMSISDN" use="required"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                         &lt;maxLength value="12"/&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;pattern value="[0-9]+"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/attribute&gt;
         *                 &lt;/restriction&gt;
         *               &lt;/complexContent&gt;
         *             &lt;/complexType&gt;
         *           &lt;/element&gt;
         *           &lt;element name="MnpDualInt"&gt;
         *             &lt;complexType&gt;
         *               &lt;complexContent&gt;
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                   &lt;attribute name="MnpMSISDN" use="required"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                         &lt;maxLength value="12"/&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;pattern value="[0-9]+"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/attribute&gt;
         *                   &lt;attribute name="OloMSISDN" use="required"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                         &lt;maxLength value="12"/&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;pattern value="[0-9]+"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/attribute&gt;
         *                 &lt;/restriction&gt;
         *               &lt;/complexContent&gt;
         *             &lt;/complexType&gt;
         *           &lt;/element&gt;
         *           &lt;element name="TimOloUncouple"&gt;
         *             &lt;complexType&gt;
         *               &lt;complexContent&gt;
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                   &lt;sequence&gt;
         *                     &lt;element name="Subscription" type="{http://telecomitalia.it/SOA/TRCS/Gateway}OptionalSubscriptionType"/&gt;
         *                   &lt;/sequence&gt;
         *                   &lt;attribute name="OloMSISDN" use="required"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                         &lt;maxLength value="12"/&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;pattern value="[0-9]+"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/attribute&gt;
         *                   &lt;attribute name="TypeOfCard" use="required"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/attribute&gt;
         *                 &lt;/restriction&gt;
         *               &lt;/complexContent&gt;
         *             &lt;/complexType&gt;
         *           &lt;/element&gt;
         *           &lt;element name="TwoInOneInt"&gt;
         *             &lt;complexType&gt;
         *               &lt;complexContent&gt;
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                   &lt;attribute name="OloMSISDN" use="required"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                         &lt;maxLength value="12"/&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;pattern value="[0-9]+"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/attribute&gt;
         *                 &lt;/restriction&gt;
         *               &lt;/complexContent&gt;
         *             &lt;/complexType&gt;
         *           &lt;/element&gt;
         *           &lt;element name="TwoInOneDeact"&gt;
         *             &lt;complexType&gt;
         *               &lt;complexContent&gt;
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                   &lt;attribute name="OloMSISDN" use="required"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                         &lt;maxLength value="12"/&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;pattern value="[0-9]+"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/attribute&gt;
         *                 &lt;/restriction&gt;
         *               &lt;/complexContent&gt;
         *             &lt;/complexType&gt;
         *           &lt;/element&gt;
         *           &lt;element name="TwoInOneMigr"&gt;
         *             &lt;complexType&gt;
         *               &lt;complexContent&gt;
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                   &lt;attribute name="MnpMSISDN" use="required"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="12"/&gt;
         *                         &lt;pattern value="[0-9]+"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/attribute&gt;
         *                   &lt;attribute name="OloMSISDN" use="required"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                         &lt;maxLength value="12"/&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;pattern value="[0-9]+"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/attribute&gt;
         *                 &lt;/restriction&gt;
         *               &lt;/complexContent&gt;
         *             &lt;/complexType&gt;
         *           &lt;/element&gt;
         *           &lt;element name="TwoInOneVNumDPlusDeact"&gt;
         *             &lt;complexType&gt;
         *               &lt;complexContent&gt;
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                   &lt;attribute name="MnpMSISDN" use="required"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="12"/&gt;
         *                         &lt;pattern value="[0-9]+"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/attribute&gt;
         *                   &lt;attribute name="OloMSISDN" use="required"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="12"/&gt;
         *                         &lt;pattern value="[0-9]+"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/attribute&gt;
         *                 &lt;/restriction&gt;
         *               &lt;/complexContent&gt;
         *             &lt;/complexType&gt;
         *           &lt;/element&gt;
         *           &lt;element name="MnpDualIntMvno"&gt;
         *             &lt;complexType&gt;
         *               &lt;complexContent&gt;
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                   &lt;attribute name="MnpMSISDN" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                   &lt;attribute name="OloMSISDN" use="required"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                         &lt;maxLength value="12"/&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;pattern value="[0-9]+"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/attribute&gt;
         *                 &lt;/restriction&gt;
         *               &lt;/complexContent&gt;
         *             &lt;/complexType&gt;
         *           &lt;/element&gt;
         *           &lt;element name="TwoInOneMigrMvno"&gt;
         *             &lt;complexType&gt;
         *               &lt;complexContent&gt;
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                   &lt;attribute name="MnpMSISDN" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                   &lt;attribute name="OloMSISDN" use="required"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                         &lt;maxLength value="12"/&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;pattern value="[0-9]+"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/attribute&gt;
         *                 &lt;/restriction&gt;
         *               &lt;/complexContent&gt;
         *             &lt;/complexType&gt;
         *           &lt;/element&gt;
         *           &lt;element name="TwoInOneVNumMigrMvno"&gt;
         *             &lt;complexType&gt;
         *               &lt;complexContent&gt;
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                   &lt;attribute name="MnpMSISDN" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                   &lt;attribute name="OloMSISDN" use="required"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="12"/&gt;
         *                         &lt;pattern value="[0-9]+"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/attribute&gt;
         *                 &lt;/restriction&gt;
         *               &lt;/complexContent&gt;
         *             &lt;/complexType&gt;
         *           &lt;/element&gt;
         *           &lt;element name="MnpMvno"&gt;
         *             &lt;complexType&gt;
         *               &lt;complexContent&gt;
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                   &lt;attribute name="MnpMSISDN" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;/restriction&gt;
         *               &lt;/complexContent&gt;
         *             &lt;/complexType&gt;
         *           &lt;/element&gt;
         *           &lt;element name="MnpTCBSInt"&gt;
         *             &lt;complexType&gt;
         *               &lt;complexContent&gt;
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                   &lt;attribute name="MnpMSISDN" use="required"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="12"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/attribute&gt;
         *                 &lt;/restriction&gt;
         *               &lt;/complexContent&gt;
         *             &lt;/complexType&gt;
         *           &lt;/element&gt;
         *           &lt;element name="MnpDeleted"&gt;
         *             &lt;complexType&gt;
         *               &lt;complexContent&gt;
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                   &lt;attribute name="MnpMSISDN" use="required"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="12"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/attribute&gt;
         *                   &lt;attribute name="TypeOfCard" use="required"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/attribute&gt;
         *                 &lt;/restriction&gt;
         *               &lt;/complexContent&gt;
         *             &lt;/complexType&gt;
         *           &lt;/element&gt;
         *           &lt;element name="AutoReloadNotify" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *         &lt;/choice&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="ServIntType" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="1"/&gt;
         *             &lt;enumeration value="Normal"/&gt;
         *             &lt;enumeration value="GoodByeService"/&gt;
         *             &lt;enumeration value="MnpServInt"/&gt;
         *             &lt;enumeration value="MnpNumChange"/&gt;
         *             &lt;enumeration value="MnpNumCorrection"/&gt;
         *             &lt;enumeration value="MnpDualInt"/&gt;
         *             &lt;enumeration value="TimOloUncouple"/&gt;
         *             &lt;enumeration value="TCBInt"/&gt;
         *             &lt;enumeration value="TwoInOneInt"/&gt;
         *             &lt;enumeration value="TwoInOneDeact"/&gt;
         *             &lt;enumeration value="TwoInOneMigr"/&gt;
         *             &lt;enumeration value="TwoInOneVNumDPlusDeact"/&gt;
         *             &lt;enumeration value="MnpMvno"/&gt;
         *             &lt;enumeration value="MnpDualIntMvno"/&gt;
         *             &lt;enumeration value="TwoInOneMigrMvno"/&gt;
         *             &lt;enumeration value="TwoInOneVNumMigrMvno"/&gt;
         *             &lt;enumeration value="MnpTCBSInt"/&gt;
         *             &lt;enumeration value="MnpDeleted"/&gt;
         *             &lt;enumeration value="AutoReloadNotify"/&gt;
         *             &lt;enumeration value="EbuRollbackDelete"/&gt;
         *             &lt;enumeration value="EbuRollbackPreinstalled"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="RECESSRIGHT" default="0"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
         *             &lt;pattern value="[0|1]"/&gt;
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
            "client",
            "normal",
            "mnpServInt",
            "mnpNumChange",
            "mnpNumCorrection",
            "mnpDualInt",
            "timOloUncouple",
            "twoInOneInt",
            "twoInOneDeact",
            "twoInOneMigr",
            "twoInOneVNumDPlusDeact",
            "mnpDualIntMvno",
            "twoInOneMigrMvno",
            "twoInOneVNumMigrMvno",
            "mnpMvno",
            "mnpTCBSInt",
            "mnpDeleted",
            "autoReloadNotify"
        })
        public static class ServintSubscriber {

            @XmlElement(name = "Client", required = true)
            protected DeleteSubscriberXIbData.Operation.ServintSubscriber.Client client;
            @XmlElement(name = "Normal")
            protected DeleteSubscriberXIbData.Operation.ServintSubscriber.Normal normal;
            @XmlElement(name = "MnpServInt")
            protected DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpServInt mnpServInt;
            @XmlElement(name = "MnpNumChange")
            protected DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpNumChange mnpNumChange;
            @XmlElement(name = "MnpNumCorrection")
            protected DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpNumCorrection mnpNumCorrection;
            @XmlElement(name = "MnpDualInt")
            protected DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpDualInt mnpDualInt;
            @XmlElement(name = "TimOloUncouple")
            protected DeleteSubscriberXIbData.Operation.ServintSubscriber.TimOloUncouple timOloUncouple;
            @XmlElement(name = "TwoInOneInt")
            protected DeleteSubscriberXIbData.Operation.ServintSubscriber.TwoInOneInt twoInOneInt;
            @XmlElement(name = "TwoInOneDeact")
            protected DeleteSubscriberXIbData.Operation.ServintSubscriber.TwoInOneDeact twoInOneDeact;
            @XmlElement(name = "TwoInOneMigr")
            protected DeleteSubscriberXIbData.Operation.ServintSubscriber.TwoInOneMigr twoInOneMigr;
            @XmlElement(name = "TwoInOneVNumDPlusDeact")
            protected DeleteSubscriberXIbData.Operation.ServintSubscriber.TwoInOneVNumDPlusDeact twoInOneVNumDPlusDeact;
            @XmlElement(name = "MnpDualIntMvno")
            protected DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpDualIntMvno mnpDualIntMvno;
            @XmlElement(name = "TwoInOneMigrMvno")
            protected DeleteSubscriberXIbData.Operation.ServintSubscriber.TwoInOneMigrMvno twoInOneMigrMvno;
            @XmlElement(name = "TwoInOneVNumMigrMvno")
            protected DeleteSubscriberXIbData.Operation.ServintSubscriber.TwoInOneVNumMigrMvno twoInOneVNumMigrMvno;
            @XmlElement(name = "MnpMvno")
            protected DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpMvno mnpMvno;
            @XmlElement(name = "MnpTCBSInt")
            protected DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpTCBSInt mnpTCBSInt;
            @XmlElement(name = "MnpDeleted")
            protected DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpDeleted mnpDeleted;
            @XmlElement(name = "AutoReloadNotify")
            protected Object autoReloadNotify;
            @XmlAttribute(name = "ServIntType", required = true)
            protected String servIntType;
            @XmlAttribute(name = "RECESSRIGHT")
            protected Integer recessright;

            /**
             * Recupera il valore della proprietà client.
             * 
             * @return
             *     possible object is
             *     {@link DeleteSubscriberXIbData.Operation.ServintSubscriber.Client }
             *     
             */
            public DeleteSubscriberXIbData.Operation.ServintSubscriber.Client getClient() {
                return client;
            }

            /**
             * Imposta il valore della proprietà client.
             * 
             * @param value
             *     allowed object is
             *     {@link DeleteSubscriberXIbData.Operation.ServintSubscriber.Client }
             *     
             */
            public void setClient(DeleteSubscriberXIbData.Operation.ServintSubscriber.Client value) {
                this.client = value;
            }

            /**
             * Recupera il valore della proprietà normal.
             * 
             * @return
             *     possible object is
             *     {@link DeleteSubscriberXIbData.Operation.ServintSubscriber.Normal }
             *     
             */
            public DeleteSubscriberXIbData.Operation.ServintSubscriber.Normal getNormal() {
                return normal;
            }

            /**
             * Imposta il valore della proprietà normal.
             * 
             * @param value
             *     allowed object is
             *     {@link DeleteSubscriberXIbData.Operation.ServintSubscriber.Normal }
             *     
             */
            public void setNormal(DeleteSubscriberXIbData.Operation.ServintSubscriber.Normal value) {
                this.normal = value;
            }

            /**
             * Recupera il valore della proprietà mnpServInt.
             * 
             * @return
             *     possible object is
             *     {@link DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpServInt }
             *     
             */
            public DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpServInt getMnpServInt() {
                return mnpServInt;
            }

            /**
             * Imposta il valore della proprietà mnpServInt.
             * 
             * @param value
             *     allowed object is
             *     {@link DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpServInt }
             *     
             */
            public void setMnpServInt(DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpServInt value) {
                this.mnpServInt = value;
            }

            /**
             * Recupera il valore della proprietà mnpNumChange.
             * 
             * @return
             *     possible object is
             *     {@link DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpNumChange }
             *     
             */
            public DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpNumChange getMnpNumChange() {
                return mnpNumChange;
            }

            /**
             * Imposta il valore della proprietà mnpNumChange.
             * 
             * @param value
             *     allowed object is
             *     {@link DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpNumChange }
             *     
             */
            public void setMnpNumChange(DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpNumChange value) {
                this.mnpNumChange = value;
            }

            /**
             * Recupera il valore della proprietà mnpNumCorrection.
             * 
             * @return
             *     possible object is
             *     {@link DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpNumCorrection }
             *     
             */
            public DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpNumCorrection getMnpNumCorrection() {
                return mnpNumCorrection;
            }

            /**
             * Imposta il valore della proprietà mnpNumCorrection.
             * 
             * @param value
             *     allowed object is
             *     {@link DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpNumCorrection }
             *     
             */
            public void setMnpNumCorrection(DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpNumCorrection value) {
                this.mnpNumCorrection = value;
            }

            /**
             * Recupera il valore della proprietà mnpDualInt.
             * 
             * @return
             *     possible object is
             *     {@link DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpDualInt }
             *     
             */
            public DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpDualInt getMnpDualInt() {
                return mnpDualInt;
            }

            /**
             * Imposta il valore della proprietà mnpDualInt.
             * 
             * @param value
             *     allowed object is
             *     {@link DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpDualInt }
             *     
             */
            public void setMnpDualInt(DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpDualInt value) {
                this.mnpDualInt = value;
            }

            /**
             * Recupera il valore della proprietà timOloUncouple.
             * 
             * @return
             *     possible object is
             *     {@link DeleteSubscriberXIbData.Operation.ServintSubscriber.TimOloUncouple }
             *     
             */
            public DeleteSubscriberXIbData.Operation.ServintSubscriber.TimOloUncouple getTimOloUncouple() {
                return timOloUncouple;
            }

            /**
             * Imposta il valore della proprietà timOloUncouple.
             * 
             * @param value
             *     allowed object is
             *     {@link DeleteSubscriberXIbData.Operation.ServintSubscriber.TimOloUncouple }
             *     
             */
            public void setTimOloUncouple(DeleteSubscriberXIbData.Operation.ServintSubscriber.TimOloUncouple value) {
                this.timOloUncouple = value;
            }

            /**
             * Recupera il valore della proprietà twoInOneInt.
             * 
             * @return
             *     possible object is
             *     {@link DeleteSubscriberXIbData.Operation.ServintSubscriber.TwoInOneInt }
             *     
             */
            public DeleteSubscriberXIbData.Operation.ServintSubscriber.TwoInOneInt getTwoInOneInt() {
                return twoInOneInt;
            }

            /**
             * Imposta il valore della proprietà twoInOneInt.
             * 
             * @param value
             *     allowed object is
             *     {@link DeleteSubscriberXIbData.Operation.ServintSubscriber.TwoInOneInt }
             *     
             */
            public void setTwoInOneInt(DeleteSubscriberXIbData.Operation.ServintSubscriber.TwoInOneInt value) {
                this.twoInOneInt = value;
            }

            /**
             * Recupera il valore della proprietà twoInOneDeact.
             * 
             * @return
             *     possible object is
             *     {@link DeleteSubscriberXIbData.Operation.ServintSubscriber.TwoInOneDeact }
             *     
             */
            public DeleteSubscriberXIbData.Operation.ServintSubscriber.TwoInOneDeact getTwoInOneDeact() {
                return twoInOneDeact;
            }

            /**
             * Imposta il valore della proprietà twoInOneDeact.
             * 
             * @param value
             *     allowed object is
             *     {@link DeleteSubscriberXIbData.Operation.ServintSubscriber.TwoInOneDeact }
             *     
             */
            public void setTwoInOneDeact(DeleteSubscriberXIbData.Operation.ServintSubscriber.TwoInOneDeact value) {
                this.twoInOneDeact = value;
            }

            /**
             * Recupera il valore della proprietà twoInOneMigr.
             * 
             * @return
             *     possible object is
             *     {@link DeleteSubscriberXIbData.Operation.ServintSubscriber.TwoInOneMigr }
             *     
             */
            public DeleteSubscriberXIbData.Operation.ServintSubscriber.TwoInOneMigr getTwoInOneMigr() {
                return twoInOneMigr;
            }

            /**
             * Imposta il valore della proprietà twoInOneMigr.
             * 
             * @param value
             *     allowed object is
             *     {@link DeleteSubscriberXIbData.Operation.ServintSubscriber.TwoInOneMigr }
             *     
             */
            public void setTwoInOneMigr(DeleteSubscriberXIbData.Operation.ServintSubscriber.TwoInOneMigr value) {
                this.twoInOneMigr = value;
            }

            /**
             * Recupera il valore della proprietà twoInOneVNumDPlusDeact.
             * 
             * @return
             *     possible object is
             *     {@link DeleteSubscriberXIbData.Operation.ServintSubscriber.TwoInOneVNumDPlusDeact }
             *     
             */
            public DeleteSubscriberXIbData.Operation.ServintSubscriber.TwoInOneVNumDPlusDeact getTwoInOneVNumDPlusDeact() {
                return twoInOneVNumDPlusDeact;
            }

            /**
             * Imposta il valore della proprietà twoInOneVNumDPlusDeact.
             * 
             * @param value
             *     allowed object is
             *     {@link DeleteSubscriberXIbData.Operation.ServintSubscriber.TwoInOneVNumDPlusDeact }
             *     
             */
            public void setTwoInOneVNumDPlusDeact(DeleteSubscriberXIbData.Operation.ServintSubscriber.TwoInOneVNumDPlusDeact value) {
                this.twoInOneVNumDPlusDeact = value;
            }

            /**
             * Recupera il valore della proprietà mnpDualIntMvno.
             * 
             * @return
             *     possible object is
             *     {@link DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpDualIntMvno }
             *     
             */
            public DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpDualIntMvno getMnpDualIntMvno() {
                return mnpDualIntMvno;
            }

            /**
             * Imposta il valore della proprietà mnpDualIntMvno.
             * 
             * @param value
             *     allowed object is
             *     {@link DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpDualIntMvno }
             *     
             */
            public void setMnpDualIntMvno(DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpDualIntMvno value) {
                this.mnpDualIntMvno = value;
            }

            /**
             * Recupera il valore della proprietà twoInOneMigrMvno.
             * 
             * @return
             *     possible object is
             *     {@link DeleteSubscriberXIbData.Operation.ServintSubscriber.TwoInOneMigrMvno }
             *     
             */
            public DeleteSubscriberXIbData.Operation.ServintSubscriber.TwoInOneMigrMvno getTwoInOneMigrMvno() {
                return twoInOneMigrMvno;
            }

            /**
             * Imposta il valore della proprietà twoInOneMigrMvno.
             * 
             * @param value
             *     allowed object is
             *     {@link DeleteSubscriberXIbData.Operation.ServintSubscriber.TwoInOneMigrMvno }
             *     
             */
            public void setTwoInOneMigrMvno(DeleteSubscriberXIbData.Operation.ServintSubscriber.TwoInOneMigrMvno value) {
                this.twoInOneMigrMvno = value;
            }

            /**
             * Recupera il valore della proprietà twoInOneVNumMigrMvno.
             * 
             * @return
             *     possible object is
             *     {@link DeleteSubscriberXIbData.Operation.ServintSubscriber.TwoInOneVNumMigrMvno }
             *     
             */
            public DeleteSubscriberXIbData.Operation.ServintSubscriber.TwoInOneVNumMigrMvno getTwoInOneVNumMigrMvno() {
                return twoInOneVNumMigrMvno;
            }

            /**
             * Imposta il valore della proprietà twoInOneVNumMigrMvno.
             * 
             * @param value
             *     allowed object is
             *     {@link DeleteSubscriberXIbData.Operation.ServintSubscriber.TwoInOneVNumMigrMvno }
             *     
             */
            public void setTwoInOneVNumMigrMvno(DeleteSubscriberXIbData.Operation.ServintSubscriber.TwoInOneVNumMigrMvno value) {
                this.twoInOneVNumMigrMvno = value;
            }

            /**
             * Recupera il valore della proprietà mnpMvno.
             * 
             * @return
             *     possible object is
             *     {@link DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpMvno }
             *     
             */
            public DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpMvno getMnpMvno() {
                return mnpMvno;
            }

            /**
             * Imposta il valore della proprietà mnpMvno.
             * 
             * @param value
             *     allowed object is
             *     {@link DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpMvno }
             *     
             */
            public void setMnpMvno(DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpMvno value) {
                this.mnpMvno = value;
            }

            /**
             * Recupera il valore della proprietà mnpTCBSInt.
             * 
             * @return
             *     possible object is
             *     {@link DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpTCBSInt }
             *     
             */
            public DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpTCBSInt getMnpTCBSInt() {
                return mnpTCBSInt;
            }

            /**
             * Imposta il valore della proprietà mnpTCBSInt.
             * 
             * @param value
             *     allowed object is
             *     {@link DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpTCBSInt }
             *     
             */
            public void setMnpTCBSInt(DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpTCBSInt value) {
                this.mnpTCBSInt = value;
            }

            /**
             * Recupera il valore della proprietà mnpDeleted.
             * 
             * @return
             *     possible object is
             *     {@link DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpDeleted }
             *     
             */
            public DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpDeleted getMnpDeleted() {
                return mnpDeleted;
            }

            /**
             * Imposta il valore della proprietà mnpDeleted.
             * 
             * @param value
             *     allowed object is
             *     {@link DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpDeleted }
             *     
             */
            public void setMnpDeleted(DeleteSubscriberXIbData.Operation.ServintSubscriber.MnpDeleted value) {
                this.mnpDeleted = value;
            }

            /**
             * Recupera il valore della proprietà autoReloadNotify.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getAutoReloadNotify() {
                return autoReloadNotify;
            }

            /**
             * Imposta il valore della proprietà autoReloadNotify.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setAutoReloadNotify(Object value) {
                this.autoReloadNotify = value;
            }

            /**
             * Recupera il valore della proprietà servIntType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServIntType() {
                return servIntType;
            }

            /**
             * Imposta il valore della proprietà servIntType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServIntType(String value) {
                this.servIntType = value;
            }

            /**
             * Recupera il valore della proprietà recessright.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public int getRECESSRIGHT() {
                if (recessright == null) {
                    return  0;
                } else {
                    return recessright;
                }
            }

            /**
             * Imposta il valore della proprietà recessright.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setRECESSRIGHT(Integer value) {
                this.recessright = value;
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
             *       &lt;attribute name="Reason" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;maxLength value="2"/&gt;
             *             &lt;minLength value="1"/&gt;
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
            public static class Client {

                @XmlAttribute(name = "Reason", required = true)
                protected String reason;

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
             *       &lt;attribute name="MnpMSISDN" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
             *             &lt;minLength value="1"/&gt;
             *             &lt;maxLength value="12"/&gt;
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
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class MnpDeleted {

                @XmlAttribute(name = "MnpMSISDN", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String mnpMSISDN;
                @XmlAttribute(name = "TypeOfCard", required = true)
                protected String typeOfCard;

                /**
                 * Recupera il valore della proprietà mnpMSISDN.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMnpMSISDN() {
                    return mnpMSISDN;
                }

                /**
                 * Imposta il valore della proprietà mnpMSISDN.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMnpMSISDN(String value) {
                    this.mnpMSISDN = value;
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
             *       &lt;attribute name="MnpMSISDN" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
             *             &lt;maxLength value="12"/&gt;
             *             &lt;minLength value="1"/&gt;
             *             &lt;pattern value="[0-9]+"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="OloMSISDN" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
             *             &lt;maxLength value="12"/&gt;
             *             &lt;minLength value="1"/&gt;
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
            public static class MnpDualInt {

                @XmlAttribute(name = "MnpMSISDN", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String mnpMSISDN;
                @XmlAttribute(name = "OloMSISDN", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String oloMSISDN;

                /**
                 * Recupera il valore della proprietà mnpMSISDN.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMnpMSISDN() {
                    return mnpMSISDN;
                }

                /**
                 * Imposta il valore della proprietà mnpMSISDN.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMnpMSISDN(String value) {
                    this.mnpMSISDN = value;
                }

                /**
                 * Recupera il valore della proprietà oloMSISDN.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOloMSISDN() {
                    return oloMSISDN;
                }

                /**
                 * Imposta il valore della proprietà oloMSISDN.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOloMSISDN(String value) {
                    this.oloMSISDN = value;
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
             *       &lt;attribute name="MnpMSISDN" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="OloMSISDN" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
             *             &lt;maxLength value="12"/&gt;
             *             &lt;minLength value="1"/&gt;
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
            public static class MnpDualIntMvno {

                @XmlAttribute(name = "MnpMSISDN", required = true)
                protected String mnpMSISDN;
                @XmlAttribute(name = "OloMSISDN", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String oloMSISDN;

                /**
                 * Recupera il valore della proprietà mnpMSISDN.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMnpMSISDN() {
                    return mnpMSISDN;
                }

                /**
                 * Imposta il valore della proprietà mnpMSISDN.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMnpMSISDN(String value) {
                    this.mnpMSISDN = value;
                }

                /**
                 * Recupera il valore della proprietà oloMSISDN.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOloMSISDN() {
                    return oloMSISDN;
                }

                /**
                 * Imposta il valore della proprietà oloMSISDN.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOloMSISDN(String value) {
                    this.oloMSISDN = value;
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
             *       &lt;attribute name="MnpMSISDN" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class MnpMvno {

                @XmlAttribute(name = "MnpMSISDN", required = true)
                protected String mnpMSISDN;

                /**
                 * Recupera il valore della proprietà mnpMSISDN.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMnpMSISDN() {
                    return mnpMSISDN;
                }

                /**
                 * Imposta il valore della proprietà mnpMSISDN.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMnpMSISDN(String value) {
                    this.mnpMSISDN = value;
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
             *       &lt;attribute name="MnpMSISDN" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
             *             &lt;maxLength value="12"/&gt;
             *             &lt;minLength value="1"/&gt;
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
            public static class MnpNumChange {

                @XmlAttribute(name = "MnpMSISDN", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String mnpMSISDN;

                /**
                 * Recupera il valore della proprietà mnpMSISDN.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMnpMSISDN() {
                    return mnpMSISDN;
                }

                /**
                 * Imposta il valore della proprietà mnpMSISDN.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMnpMSISDN(String value) {
                    this.mnpMSISDN = value;
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
             *       &lt;attribute name="MnpMSISDN" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
             *             &lt;maxLength value="12"/&gt;
             *             &lt;minLength value="1"/&gt;
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
            public static class MnpNumCorrection {

                @XmlAttribute(name = "MnpMSISDN", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String mnpMSISDN;

                /**
                 * Recupera il valore della proprietà mnpMSISDN.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMnpMSISDN() {
                    return mnpMSISDN;
                }

                /**
                 * Imposta il valore della proprietà mnpMSISDN.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMnpMSISDN(String value) {
                    this.mnpMSISDN = value;
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
             *       &lt;attribute name="MnpMSISDN" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
             *             &lt;maxLength value="12"/&gt;
             *             &lt;minLength value="1"/&gt;
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
            public static class MnpServInt {

                @XmlAttribute(name = "MnpMSISDN", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String mnpMSISDN;

                /**
                 * Recupera il valore della proprietà mnpMSISDN.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMnpMSISDN() {
                    return mnpMSISDN;
                }

                /**
                 * Imposta il valore della proprietà mnpMSISDN.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMnpMSISDN(String value) {
                    this.mnpMSISDN = value;
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
             *       &lt;attribute name="MnpMSISDN" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
             *             &lt;minLength value="1"/&gt;
             *             &lt;maxLength value="12"/&gt;
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
            public static class MnpTCBSInt {

                @XmlAttribute(name = "MnpMSISDN", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String mnpMSISDN;

                /**
                 * Recupera il valore della proprietà mnpMSISDN.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMnpMSISDN() {
                    return mnpMSISDN;
                }

                /**
                 * Imposta il valore della proprietà mnpMSISDN.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMnpMSISDN(String value) {
                    this.mnpMSISDN = value;
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
             *       &lt;attribute name="OloMSISDN"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;maxLength value="12"/&gt;
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
            public static class Normal {

                @XmlAttribute(name = "OloMSISDN")
                protected String oloMSISDN;

                /**
                 * Recupera il valore della proprietà oloMSISDN.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOloMSISDN() {
                    return oloMSISDN;
                }

                /**
                 * Imposta il valore della proprietà oloMSISDN.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOloMSISDN(String value) {
                    this.oloMSISDN = value;
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
             *         &lt;element name="Subscription" type="{http://telecomitalia.it/SOA/TRCS/Gateway}OptionalSubscriptionType"/&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="OloMSISDN" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
             *             &lt;maxLength value="12"/&gt;
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
            public static class TimOloUncouple {

                @XmlElement(name = "Subscription", required = true)
                protected OptionalSubscriptionType subscription;
                @XmlAttribute(name = "OloMSISDN", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String oloMSISDN;
                @XmlAttribute(name = "TypeOfCard", required = true)
                protected String typeOfCard;

                /**
                 * Recupera il valore della proprietà subscription.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OptionalSubscriptionType }
                 *     
                 */
                public OptionalSubscriptionType getSubscription() {
                    return subscription;
                }

                /**
                 * Imposta il valore della proprietà subscription.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OptionalSubscriptionType }
                 *     
                 */
                public void setSubscription(OptionalSubscriptionType value) {
                    this.subscription = value;
                }

                /**
                 * Recupera il valore della proprietà oloMSISDN.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOloMSISDN() {
                    return oloMSISDN;
                }

                /**
                 * Imposta il valore della proprietà oloMSISDN.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOloMSISDN(String value) {
                    this.oloMSISDN = value;
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
             *       &lt;attribute name="OloMSISDN" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
             *             &lt;maxLength value="12"/&gt;
             *             &lt;minLength value="1"/&gt;
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
            public static class TwoInOneDeact {

                @XmlAttribute(name = "OloMSISDN", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String oloMSISDN;

                /**
                 * Recupera il valore della proprietà oloMSISDN.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOloMSISDN() {
                    return oloMSISDN;
                }

                /**
                 * Imposta il valore della proprietà oloMSISDN.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOloMSISDN(String value) {
                    this.oloMSISDN = value;
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
             *       &lt;attribute name="OloMSISDN" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
             *             &lt;maxLength value="12"/&gt;
             *             &lt;minLength value="1"/&gt;
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
            public static class TwoInOneInt {

                @XmlAttribute(name = "OloMSISDN", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String oloMSISDN;

                /**
                 * Recupera il valore della proprietà oloMSISDN.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOloMSISDN() {
                    return oloMSISDN;
                }

                /**
                 * Imposta il valore della proprietà oloMSISDN.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOloMSISDN(String value) {
                    this.oloMSISDN = value;
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
             *       &lt;attribute name="MnpMSISDN" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
             *             &lt;minLength value="1"/&gt;
             *             &lt;maxLength value="12"/&gt;
             *             &lt;pattern value="[0-9]+"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="OloMSISDN" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
             *             &lt;maxLength value="12"/&gt;
             *             &lt;minLength value="1"/&gt;
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
            public static class TwoInOneMigr {

                @XmlAttribute(name = "MnpMSISDN", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String mnpMSISDN;
                @XmlAttribute(name = "OloMSISDN", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String oloMSISDN;

                /**
                 * Recupera il valore della proprietà mnpMSISDN.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMnpMSISDN() {
                    return mnpMSISDN;
                }

                /**
                 * Imposta il valore della proprietà mnpMSISDN.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMnpMSISDN(String value) {
                    this.mnpMSISDN = value;
                }

                /**
                 * Recupera il valore della proprietà oloMSISDN.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOloMSISDN() {
                    return oloMSISDN;
                }

                /**
                 * Imposta il valore della proprietà oloMSISDN.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOloMSISDN(String value) {
                    this.oloMSISDN = value;
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
             *       &lt;attribute name="MnpMSISDN" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="OloMSISDN" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
             *             &lt;maxLength value="12"/&gt;
             *             &lt;minLength value="1"/&gt;
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
            public static class TwoInOneMigrMvno {

                @XmlAttribute(name = "MnpMSISDN", required = true)
                protected String mnpMSISDN;
                @XmlAttribute(name = "OloMSISDN", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String oloMSISDN;

                /**
                 * Recupera il valore della proprietà mnpMSISDN.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMnpMSISDN() {
                    return mnpMSISDN;
                }

                /**
                 * Imposta il valore della proprietà mnpMSISDN.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMnpMSISDN(String value) {
                    this.mnpMSISDN = value;
                }

                /**
                 * Recupera il valore della proprietà oloMSISDN.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOloMSISDN() {
                    return oloMSISDN;
                }

                /**
                 * Imposta il valore della proprietà oloMSISDN.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOloMSISDN(String value) {
                    this.oloMSISDN = value;
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
             *       &lt;attribute name="MnpMSISDN" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
             *             &lt;minLength value="1"/&gt;
             *             &lt;maxLength value="12"/&gt;
             *             &lt;pattern value="[0-9]+"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="OloMSISDN" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
             *             &lt;minLength value="1"/&gt;
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
            public static class TwoInOneVNumDPlusDeact {

                @XmlAttribute(name = "MnpMSISDN", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String mnpMSISDN;
                @XmlAttribute(name = "OloMSISDN", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String oloMSISDN;

                /**
                 * Recupera il valore della proprietà mnpMSISDN.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMnpMSISDN() {
                    return mnpMSISDN;
                }

                /**
                 * Imposta il valore della proprietà mnpMSISDN.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMnpMSISDN(String value) {
                    this.mnpMSISDN = value;
                }

                /**
                 * Recupera il valore della proprietà oloMSISDN.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOloMSISDN() {
                    return oloMSISDN;
                }

                /**
                 * Imposta il valore della proprietà oloMSISDN.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOloMSISDN(String value) {
                    this.oloMSISDN = value;
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
             *       &lt;attribute name="MnpMSISDN" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="OloMSISDN" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
             *             &lt;minLength value="1"/&gt;
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
            public static class TwoInOneVNumMigrMvno {

                @XmlAttribute(name = "MnpMSISDN", required = true)
                protected String mnpMSISDN;
                @XmlAttribute(name = "OloMSISDN", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String oloMSISDN;

                /**
                 * Recupera il valore della proprietà mnpMSISDN.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMnpMSISDN() {
                    return mnpMSISDN;
                }

                /**
                 * Imposta il valore della proprietà mnpMSISDN.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMnpMSISDN(String value) {
                    this.mnpMSISDN = value;
                }

                /**
                 * Recupera il valore della proprietà oloMSISDN.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOloMSISDN() {
                    return oloMSISDN;
                }

                /**
                 * Imposta il valore della proprietà oloMSISDN.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOloMSISDN(String value) {
                    this.oloMSISDN = value;
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
