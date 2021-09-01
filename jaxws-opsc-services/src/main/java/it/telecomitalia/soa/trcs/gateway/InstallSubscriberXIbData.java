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
 * <p>Classe Java per InstallSubscriberXIbData complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="InstallSubscriberXIbData"&gt;
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
 *                   &lt;element name="InstallSubscriber"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;choice&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="ClientNormal"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;choice&gt;
 *                                         &lt;element name="GSM"&gt;
 *                                           &lt;complexType&gt;
 *                                             &lt;complexContent&gt;
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                 &lt;attribute name="IMSI" use="required"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                                       &lt;maxLength value="16"/&gt;
 *                                                       &lt;pattern value="[0-9]+"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/attribute&gt;
 *                                                 &lt;attribute name="ICCID" use="required"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                                       &lt;maxLength value="20"/&gt;
 *                                                       &lt;pattern value="[0-9]+"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/attribute&gt;
 *                                                 &lt;attribute name="CardFeature" use="required"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;length value="8"/&gt;
 *                                                       &lt;whiteSpace value="preserve"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/attribute&gt;
 *                                               &lt;/restriction&gt;
 *                                             &lt;/complexContent&gt;
 *                                           &lt;/complexType&gt;
 *                                         &lt;/element&gt;
 *                                         &lt;element name="TACS"&gt;
 *                                           &lt;complexType&gt;
 *                                             &lt;complexContent&gt;
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                 &lt;attribute name="Category" use="required"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                                       &lt;minLength value="1"/&gt;
 *                                                       &lt;maxLength value="6"/&gt;
 *                                                       &lt;pattern value="[0-9]+"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/attribute&gt;
 *                                                 &lt;attribute name="SRNB" use="required"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                                       &lt;minLength value="1"/&gt;
 *                                                       &lt;maxLength value="11"/&gt;
 *                                                       &lt;pattern value="[0-9]+"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/attribute&gt;
 *                                                 &lt;attribute name="CodeB" use="required"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                                       &lt;minLength value="1"/&gt;
 *                                                       &lt;maxLength value="11"/&gt;
 *                                                       &lt;pattern value="[0-9]+"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/attribute&gt;
 *                                                 &lt;attribute name="Tipo" use="required"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                                       &lt;minLength value="1"/&gt;
 *                                                       &lt;maxLength value="2"/&gt;
 *                                                       &lt;pattern value="[0-9]+"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/attribute&gt;
 *                                               &lt;/restriction&gt;
 *                                             &lt;/complexContent&gt;
 *                                           &lt;/complexType&gt;
 *                                         &lt;/element&gt;
 *                                       &lt;/choice&gt;
 *                                       &lt;attribute name="Reason" use="required"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/attribute&gt;
 *                                       &lt;attribute name="LanguageId" use="required"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;pattern value="[0-9]+"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/attribute&gt;
 *                                       &lt;attribute name="TypeOfCard" use="required"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/attribute&gt;
 *                                       &lt;attribute name="ServiceProviderId"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="5"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/attribute&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="Normal" type="{http://telecomitalia.it/SOA/TRCS/Gateway}SubscriberProfile"/&gt;
 *                             &lt;/sequence&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="ClientMnp"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;choice&gt;
 *                                         &lt;element name="GSM"&gt;
 *                                           &lt;complexType&gt;
 *                                             &lt;complexContent&gt;
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                 &lt;attribute name="IMSI" use="required"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                                       &lt;maxLength value="16"/&gt;
 *                                                       &lt;pattern value="[0-9]+"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/attribute&gt;
 *                                                 &lt;attribute name="ICCID" use="required"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                                       &lt;maxLength value="20"/&gt;
 *                                                       &lt;pattern value="[0-9]+"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/attribute&gt;
 *                                                 &lt;attribute name="CardFeature" use="required"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;length value="8"/&gt;
 *                                                       &lt;whiteSpace value="preserve"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/attribute&gt;
 *                                                 &lt;attribute name="CardPhase" use="required"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;maxLength value="2"/&gt;
 *                                                       &lt;minLength value="0"/&gt;
 *                                                       &lt;whiteSpace value="preserve"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/attribute&gt;
 *                                               &lt;/restriction&gt;
 *                                             &lt;/complexContent&gt;
 *                                           &lt;/complexType&gt;
 *                                         &lt;/element&gt;
 *                                       &lt;/choice&gt;
 *                                       &lt;attribute name="Reason" use="required"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/attribute&gt;
 *                                       &lt;attribute name="LanguageId" use="required"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;pattern value="[0-9]+"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/attribute&gt;
 *                                       &lt;attribute name="TypeOfCard" use="required"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/attribute&gt;
 *                                       &lt;attribute name="ServiceProviderId"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="5"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/attribute&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="Mnp"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;extension base="{http://telecomitalia.it/SOA/TRCS/Gateway}SubscriberProfile"&gt;
 *                                     &lt;/extension&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                             &lt;/sequence&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="ClientExTim"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;choice&gt;
 *                                         &lt;element name="GSM"&gt;
 *                                           &lt;complexType&gt;
 *                                             &lt;complexContent&gt;
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                 &lt;attribute name="IMSI" use="required"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                                       &lt;maxLength value="16"/&gt;
 *                                                       &lt;pattern value="[0-9]+"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/attribute&gt;
 *                                                 &lt;attribute name="ICCID" use="required"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                                       &lt;maxLength value="20"/&gt;
 *                                                       &lt;pattern value="[0-9]+"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/attribute&gt;
 *                                                 &lt;attribute name="CardFeature" use="required"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;length value="8"/&gt;
 *                                                       &lt;whiteSpace value="preserve"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/attribute&gt;
 *                                                 &lt;attribute name="CardPhase" use="required"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;maxLength value="2"/&gt;
 *                                                       &lt;minLength value="0"/&gt;
 *                                                       &lt;whiteSpace value="preserve"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/attribute&gt;
 *                                               &lt;/restriction&gt;
 *                                             &lt;/complexContent&gt;
 *                                           &lt;/complexType&gt;
 *                                         &lt;/element&gt;
 *                                       &lt;/choice&gt;
 *                                       &lt;attribute name="Reason" use="required"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/attribute&gt;
 *                                       &lt;attribute name="LanguageId" use="required"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;pattern value="[0-9]+"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/attribute&gt;
 *                                       &lt;attribute name="TypeOfCard" use="required"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/attribute&gt;
 *                                       &lt;attribute name="ServiceProviderId"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;maxLength value="5"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/attribute&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="ExTim"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;extension base="{http://telecomitalia.it/SOA/TRCS/Gateway}SubscriberProfile"&gt;
 *                                     &lt;/extension&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/choice&gt;
 *                           &lt;attribute name="InstallType" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="1"/&gt;
 *                                 &lt;enumeration value="Normal"/&gt;
 *                                 &lt;enumeration value="Mnp"/&gt;
 *                                 &lt;enumeration value="ExTim"/&gt;
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
 *                       &lt;enumeration value="InstallSubscriber"/&gt;
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
@XmlType(name = "InstallSubscriberXIbData", propOrder = {
    "transaction",
    "clientKeys",
    "operation"
})
public class InstallSubscriberXIbData {

    @XmlElement(name = "Transaction", required = true)
    protected InstallSubscriberXIbData.Transaction transaction;
    @XmlElement(name = "ClientKeys")
    protected InstallSubscriberXIbData.ClientKeys clientKeys;
    @XmlElement(name = "Operation", required = true)
    protected InstallSubscriberXIbData.Operation operation;
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
     *     {@link InstallSubscriberXIbData.Transaction }
     *     
     */
    public InstallSubscriberXIbData.Transaction getTransaction() {
        return transaction;
    }

    /**
     * Imposta il valore della proprietà transaction.
     * 
     * @param value
     *     allowed object is
     *     {@link InstallSubscriberXIbData.Transaction }
     *     
     */
    public void setTransaction(InstallSubscriberXIbData.Transaction value) {
        this.transaction = value;
    }

    /**
     * Recupera il valore della proprietà clientKeys.
     * 
     * @return
     *     possible object is
     *     {@link InstallSubscriberXIbData.ClientKeys }
     *     
     */
    public InstallSubscriberXIbData.ClientKeys getClientKeys() {
        return clientKeys;
    }

    /**
     * Imposta il valore della proprietà clientKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link InstallSubscriberXIbData.ClientKeys }
     *     
     */
    public void setClientKeys(InstallSubscriberXIbData.ClientKeys value) {
        this.clientKeys = value;
    }

    /**
     * Recupera il valore della proprietà operation.
     * 
     * @return
     *     possible object is
     *     {@link InstallSubscriberXIbData.Operation }
     *     
     */
    public InstallSubscriberXIbData.Operation getOperation() {
        return operation;
    }

    /**
     * Imposta il valore della proprietà operation.
     * 
     * @param value
     *     allowed object is
     *     {@link InstallSubscriberXIbData.Operation }
     *     
     */
    public void setOperation(InstallSubscriberXIbData.Operation value) {
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
     *         &lt;element name="InstallSubscriber"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;choice&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="ClientNormal"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;complexContent&gt;
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                             &lt;choice&gt;
     *                               &lt;element name="GSM"&gt;
     *                                 &lt;complexType&gt;
     *                                   &lt;complexContent&gt;
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                       &lt;attribute name="IMSI" use="required"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                             &lt;maxLength value="16"/&gt;
     *                                             &lt;pattern value="[0-9]+"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/attribute&gt;
     *                                       &lt;attribute name="ICCID" use="required"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                             &lt;maxLength value="20"/&gt;
     *                                             &lt;pattern value="[0-9]+"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/attribute&gt;
     *                                       &lt;attribute name="CardFeature" use="required"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;length value="8"/&gt;
     *                                             &lt;whiteSpace value="preserve"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/attribute&gt;
     *                                     &lt;/restriction&gt;
     *                                   &lt;/complexContent&gt;
     *                                 &lt;/complexType&gt;
     *                               &lt;/element&gt;
     *                               &lt;element name="TACS"&gt;
     *                                 &lt;complexType&gt;
     *                                   &lt;complexContent&gt;
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                       &lt;attribute name="Category" use="required"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                             &lt;minLength value="1"/&gt;
     *                                             &lt;maxLength value="6"/&gt;
     *                                             &lt;pattern value="[0-9]+"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/attribute&gt;
     *                                       &lt;attribute name="SRNB" use="required"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                             &lt;minLength value="1"/&gt;
     *                                             &lt;maxLength value="11"/&gt;
     *                                             &lt;pattern value="[0-9]+"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/attribute&gt;
     *                                       &lt;attribute name="CodeB" use="required"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                             &lt;minLength value="1"/&gt;
     *                                             &lt;maxLength value="11"/&gt;
     *                                             &lt;pattern value="[0-9]+"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/attribute&gt;
     *                                       &lt;attribute name="Tipo" use="required"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                             &lt;minLength value="1"/&gt;
     *                                             &lt;maxLength value="2"/&gt;
     *                                             &lt;pattern value="[0-9]+"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/attribute&gt;
     *                                     &lt;/restriction&gt;
     *                                   &lt;/complexContent&gt;
     *                                 &lt;/complexType&gt;
     *                               &lt;/element&gt;
     *                             &lt;/choice&gt;
     *                             &lt;attribute name="Reason" use="required"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/attribute&gt;
     *                             &lt;attribute name="LanguageId" use="required"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;pattern value="[0-9]+"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/attribute&gt;
     *                             &lt;attribute name="TypeOfCard" use="required"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/attribute&gt;
     *                             &lt;attribute name="ServiceProviderId"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="5"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/attribute&gt;
     *                           &lt;/restriction&gt;
     *                         &lt;/complexContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                     &lt;element name="Normal" type="{http://telecomitalia.it/SOA/TRCS/Gateway}SubscriberProfile"/&gt;
     *                   &lt;/sequence&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="ClientMnp"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;complexContent&gt;
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                             &lt;choice&gt;
     *                               &lt;element name="GSM"&gt;
     *                                 &lt;complexType&gt;
     *                                   &lt;complexContent&gt;
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                       &lt;attribute name="IMSI" use="required"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                             &lt;maxLength value="16"/&gt;
     *                                             &lt;pattern value="[0-9]+"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/attribute&gt;
     *                                       &lt;attribute name="ICCID" use="required"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                             &lt;maxLength value="20"/&gt;
     *                                             &lt;pattern value="[0-9]+"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/attribute&gt;
     *                                       &lt;attribute name="CardFeature" use="required"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;length value="8"/&gt;
     *                                             &lt;whiteSpace value="preserve"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/attribute&gt;
     *                                       &lt;attribute name="CardPhase" use="required"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;maxLength value="2"/&gt;
     *                                             &lt;minLength value="0"/&gt;
     *                                             &lt;whiteSpace value="preserve"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/attribute&gt;
     *                                     &lt;/restriction&gt;
     *                                   &lt;/complexContent&gt;
     *                                 &lt;/complexType&gt;
     *                               &lt;/element&gt;
     *                             &lt;/choice&gt;
     *                             &lt;attribute name="Reason" use="required"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/attribute&gt;
     *                             &lt;attribute name="LanguageId" use="required"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;pattern value="[0-9]+"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/attribute&gt;
     *                             &lt;attribute name="TypeOfCard" use="required"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/attribute&gt;
     *                             &lt;attribute name="ServiceProviderId"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="5"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/attribute&gt;
     *                           &lt;/restriction&gt;
     *                         &lt;/complexContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                     &lt;element name="Mnp"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;complexContent&gt;
     *                           &lt;extension base="{http://telecomitalia.it/SOA/TRCS/Gateway}SubscriberProfile"&gt;
     *                           &lt;/extension&gt;
     *                         &lt;/complexContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                   &lt;/sequence&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="ClientExTim"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;complexContent&gt;
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                             &lt;choice&gt;
     *                               &lt;element name="GSM"&gt;
     *                                 &lt;complexType&gt;
     *                                   &lt;complexContent&gt;
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                       &lt;attribute name="IMSI" use="required"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                             &lt;maxLength value="16"/&gt;
     *                                             &lt;pattern value="[0-9]+"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/attribute&gt;
     *                                       &lt;attribute name="ICCID" use="required"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                             &lt;maxLength value="20"/&gt;
     *                                             &lt;pattern value="[0-9]+"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/attribute&gt;
     *                                       &lt;attribute name="CardFeature" use="required"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;length value="8"/&gt;
     *                                             &lt;whiteSpace value="preserve"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/attribute&gt;
     *                                       &lt;attribute name="CardPhase" use="required"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;maxLength value="2"/&gt;
     *                                             &lt;minLength value="0"/&gt;
     *                                             &lt;whiteSpace value="preserve"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/attribute&gt;
     *                                     &lt;/restriction&gt;
     *                                   &lt;/complexContent&gt;
     *                                 &lt;/complexType&gt;
     *                               &lt;/element&gt;
     *                             &lt;/choice&gt;
     *                             &lt;attribute name="Reason" use="required"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/attribute&gt;
     *                             &lt;attribute name="LanguageId" use="required"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;pattern value="[0-9]+"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/attribute&gt;
     *                             &lt;attribute name="TypeOfCard" use="required"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/attribute&gt;
     *                             &lt;attribute name="ServiceProviderId"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;maxLength value="5"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/attribute&gt;
     *                           &lt;/restriction&gt;
     *                         &lt;/complexContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                     &lt;element name="ExTim"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;complexContent&gt;
     *                           &lt;extension base="{http://telecomitalia.it/SOA/TRCS/Gateway}SubscriberProfile"&gt;
     *                           &lt;/extension&gt;
     *                         &lt;/complexContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/choice&gt;
     *                 &lt;attribute name="InstallType" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="1"/&gt;
     *                       &lt;enumeration value="Normal"/&gt;
     *                       &lt;enumeration value="Mnp"/&gt;
     *                       &lt;enumeration value="ExTim"/&gt;
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
     *             &lt;enumeration value="InstallSubscriber"/&gt;
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
        "installSubscriber"
    })
    public static class Operation {

        @XmlElement(name = "InstallSubscriber", required = true)
        protected InstallSubscriberXIbData.Operation.InstallSubscriber installSubscriber;
        @XmlAttribute(name = "OperationType", required = true)
        protected String operationType;
        @XmlAttribute(name = "Info")
        protected String info;

        /**
         * Recupera il valore della proprietà installSubscriber.
         * 
         * @return
         *     possible object is
         *     {@link InstallSubscriberXIbData.Operation.InstallSubscriber }
         *     
         */
        public InstallSubscriberXIbData.Operation.InstallSubscriber getInstallSubscriber() {
            return installSubscriber;
        }

        /**
         * Imposta il valore della proprietà installSubscriber.
         * 
         * @param value
         *     allowed object is
         *     {@link InstallSubscriberXIbData.Operation.InstallSubscriber }
         *     
         */
        public void setInstallSubscriber(InstallSubscriberXIbData.Operation.InstallSubscriber value) {
            this.installSubscriber = value;
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
         *       &lt;choice&gt;
         *         &lt;sequence&gt;
         *           &lt;element name="ClientNormal"&gt;
         *             &lt;complexType&gt;
         *               &lt;complexContent&gt;
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                   &lt;choice&gt;
         *                     &lt;element name="GSM"&gt;
         *                       &lt;complexType&gt;
         *                         &lt;complexContent&gt;
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                             &lt;attribute name="IMSI" use="required"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                                   &lt;maxLength value="16"/&gt;
         *                                   &lt;pattern value="[0-9]+"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/attribute&gt;
         *                             &lt;attribute name="ICCID" use="required"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                                   &lt;maxLength value="20"/&gt;
         *                                   &lt;pattern value="[0-9]+"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/attribute&gt;
         *                             &lt;attribute name="CardFeature" use="required"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;length value="8"/&gt;
         *                                   &lt;whiteSpace value="preserve"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/attribute&gt;
         *                           &lt;/restriction&gt;
         *                         &lt;/complexContent&gt;
         *                       &lt;/complexType&gt;
         *                     &lt;/element&gt;
         *                     &lt;element name="TACS"&gt;
         *                       &lt;complexType&gt;
         *                         &lt;complexContent&gt;
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                             &lt;attribute name="Category" use="required"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                                   &lt;minLength value="1"/&gt;
         *                                   &lt;maxLength value="6"/&gt;
         *                                   &lt;pattern value="[0-9]+"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/attribute&gt;
         *                             &lt;attribute name="SRNB" use="required"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                                   &lt;minLength value="1"/&gt;
         *                                   &lt;maxLength value="11"/&gt;
         *                                   &lt;pattern value="[0-9]+"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/attribute&gt;
         *                             &lt;attribute name="CodeB" use="required"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                                   &lt;minLength value="1"/&gt;
         *                                   &lt;maxLength value="11"/&gt;
         *                                   &lt;pattern value="[0-9]+"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/attribute&gt;
         *                             &lt;attribute name="Tipo" use="required"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                                   &lt;minLength value="1"/&gt;
         *                                   &lt;maxLength value="2"/&gt;
         *                                   &lt;pattern value="[0-9]+"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/attribute&gt;
         *                           &lt;/restriction&gt;
         *                         &lt;/complexContent&gt;
         *                       &lt;/complexType&gt;
         *                     &lt;/element&gt;
         *                   &lt;/choice&gt;
         *                   &lt;attribute name="Reason" use="required"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/attribute&gt;
         *                   &lt;attribute name="LanguageId" use="required"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;pattern value="[0-9]+"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/attribute&gt;
         *                   &lt;attribute name="TypeOfCard" use="required"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/attribute&gt;
         *                   &lt;attribute name="ServiceProviderId"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="5"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/attribute&gt;
         *                 &lt;/restriction&gt;
         *               &lt;/complexContent&gt;
         *             &lt;/complexType&gt;
         *           &lt;/element&gt;
         *           &lt;element name="Normal" type="{http://telecomitalia.it/SOA/TRCS/Gateway}SubscriberProfile"/&gt;
         *         &lt;/sequence&gt;
         *         &lt;sequence&gt;
         *           &lt;element name="ClientMnp"&gt;
         *             &lt;complexType&gt;
         *               &lt;complexContent&gt;
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                   &lt;choice&gt;
         *                     &lt;element name="GSM"&gt;
         *                       &lt;complexType&gt;
         *                         &lt;complexContent&gt;
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                             &lt;attribute name="IMSI" use="required"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                                   &lt;maxLength value="16"/&gt;
         *                                   &lt;pattern value="[0-9]+"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/attribute&gt;
         *                             &lt;attribute name="ICCID" use="required"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                                   &lt;maxLength value="20"/&gt;
         *                                   &lt;pattern value="[0-9]+"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/attribute&gt;
         *                             &lt;attribute name="CardFeature" use="required"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;length value="8"/&gt;
         *                                   &lt;whiteSpace value="preserve"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/attribute&gt;
         *                             &lt;attribute name="CardPhase" use="required"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;maxLength value="2"/&gt;
         *                                   &lt;minLength value="0"/&gt;
         *                                   &lt;whiteSpace value="preserve"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/attribute&gt;
         *                           &lt;/restriction&gt;
         *                         &lt;/complexContent&gt;
         *                       &lt;/complexType&gt;
         *                     &lt;/element&gt;
         *                   &lt;/choice&gt;
         *                   &lt;attribute name="Reason" use="required"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/attribute&gt;
         *                   &lt;attribute name="LanguageId" use="required"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;pattern value="[0-9]+"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/attribute&gt;
         *                   &lt;attribute name="TypeOfCard" use="required"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/attribute&gt;
         *                   &lt;attribute name="ServiceProviderId"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="5"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/attribute&gt;
         *                 &lt;/restriction&gt;
         *               &lt;/complexContent&gt;
         *             &lt;/complexType&gt;
         *           &lt;/element&gt;
         *           &lt;element name="Mnp"&gt;
         *             &lt;complexType&gt;
         *               &lt;complexContent&gt;
         *                 &lt;extension base="{http://telecomitalia.it/SOA/TRCS/Gateway}SubscriberProfile"&gt;
         *                 &lt;/extension&gt;
         *               &lt;/complexContent&gt;
         *             &lt;/complexType&gt;
         *           &lt;/element&gt;
         *         &lt;/sequence&gt;
         *         &lt;sequence&gt;
         *           &lt;element name="ClientExTim"&gt;
         *             &lt;complexType&gt;
         *               &lt;complexContent&gt;
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                   &lt;choice&gt;
         *                     &lt;element name="GSM"&gt;
         *                       &lt;complexType&gt;
         *                         &lt;complexContent&gt;
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                             &lt;attribute name="IMSI" use="required"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                                   &lt;maxLength value="16"/&gt;
         *                                   &lt;pattern value="[0-9]+"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/attribute&gt;
         *                             &lt;attribute name="ICCID" use="required"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                                   &lt;maxLength value="20"/&gt;
         *                                   &lt;pattern value="[0-9]+"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/attribute&gt;
         *                             &lt;attribute name="CardFeature" use="required"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;length value="8"/&gt;
         *                                   &lt;whiteSpace value="preserve"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/attribute&gt;
         *                             &lt;attribute name="CardPhase" use="required"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;maxLength value="2"/&gt;
         *                                   &lt;minLength value="0"/&gt;
         *                                   &lt;whiteSpace value="preserve"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/attribute&gt;
         *                           &lt;/restriction&gt;
         *                         &lt;/complexContent&gt;
         *                       &lt;/complexType&gt;
         *                     &lt;/element&gt;
         *                   &lt;/choice&gt;
         *                   &lt;attribute name="Reason" use="required"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/attribute&gt;
         *                   &lt;attribute name="LanguageId" use="required"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;pattern value="[0-9]+"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/attribute&gt;
         *                   &lt;attribute name="TypeOfCard" use="required"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/attribute&gt;
         *                   &lt;attribute name="ServiceProviderId"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="5"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/attribute&gt;
         *                 &lt;/restriction&gt;
         *               &lt;/complexContent&gt;
         *             &lt;/complexType&gt;
         *           &lt;/element&gt;
         *           &lt;element name="ExTim"&gt;
         *             &lt;complexType&gt;
         *               &lt;complexContent&gt;
         *                 &lt;extension base="{http://telecomitalia.it/SOA/TRCS/Gateway}SubscriberProfile"&gt;
         *                 &lt;/extension&gt;
         *               &lt;/complexContent&gt;
         *             &lt;/complexType&gt;
         *           &lt;/element&gt;
         *         &lt;/sequence&gt;
         *       &lt;/choice&gt;
         *       &lt;attribute name="InstallType" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="1"/&gt;
         *             &lt;enumeration value="Normal"/&gt;
         *             &lt;enumeration value="Mnp"/&gt;
         *             &lt;enumeration value="ExTim"/&gt;
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
            "clientNormal",
            "normal",
            "clientMnp",
            "mnp",
            "clientExTim",
            "exTim"
        })
        public static class InstallSubscriber {

            @XmlElement(name = "ClientNormal")
            protected InstallSubscriberXIbData.Operation.InstallSubscriber.ClientNormal clientNormal;
            @XmlElement(name = "Normal")
            protected SubscriberProfile normal;
            @XmlElement(name = "ClientMnp")
            protected InstallSubscriberXIbData.Operation.InstallSubscriber.ClientMnp clientMnp;
            @XmlElement(name = "Mnp")
            protected InstallSubscriberXIbData.Operation.InstallSubscriber.Mnp mnp;
            @XmlElement(name = "ClientExTim")
            protected InstallSubscriberXIbData.Operation.InstallSubscriber.ClientExTim clientExTim;
            @XmlElement(name = "ExTim")
            protected InstallSubscriberXIbData.Operation.InstallSubscriber.ExTim exTim;
            @XmlAttribute(name = "InstallType", required = true)
            protected String installType;
            @XmlAttribute(name = "NewBillRunMode")
            protected String newBillRunMode;

            /**
             * Recupera il valore della proprietà clientNormal.
             * 
             * @return
             *     possible object is
             *     {@link InstallSubscriberXIbData.Operation.InstallSubscriber.ClientNormal }
             *     
             */
            public InstallSubscriberXIbData.Operation.InstallSubscriber.ClientNormal getClientNormal() {
                return clientNormal;
            }

            /**
             * Imposta il valore della proprietà clientNormal.
             * 
             * @param value
             *     allowed object is
             *     {@link InstallSubscriberXIbData.Operation.InstallSubscriber.ClientNormal }
             *     
             */
            public void setClientNormal(InstallSubscriberXIbData.Operation.InstallSubscriber.ClientNormal value) {
                this.clientNormal = value;
            }

            /**
             * Recupera il valore della proprietà normal.
             * 
             * @return
             *     possible object is
             *     {@link SubscriberProfile }
             *     
             */
            public SubscriberProfile getNormal() {
                return normal;
            }

            /**
             * Imposta il valore della proprietà normal.
             * 
             * @param value
             *     allowed object is
             *     {@link SubscriberProfile }
             *     
             */
            public void setNormal(SubscriberProfile value) {
                this.normal = value;
            }

            /**
             * Recupera il valore della proprietà clientMnp.
             * 
             * @return
             *     possible object is
             *     {@link InstallSubscriberXIbData.Operation.InstallSubscriber.ClientMnp }
             *     
             */
            public InstallSubscriberXIbData.Operation.InstallSubscriber.ClientMnp getClientMnp() {
                return clientMnp;
            }

            /**
             * Imposta il valore della proprietà clientMnp.
             * 
             * @param value
             *     allowed object is
             *     {@link InstallSubscriberXIbData.Operation.InstallSubscriber.ClientMnp }
             *     
             */
            public void setClientMnp(InstallSubscriberXIbData.Operation.InstallSubscriber.ClientMnp value) {
                this.clientMnp = value;
            }

            /**
             * Recupera il valore della proprietà mnp.
             * 
             * @return
             *     possible object is
             *     {@link InstallSubscriberXIbData.Operation.InstallSubscriber.Mnp }
             *     
             */
            public InstallSubscriberXIbData.Operation.InstallSubscriber.Mnp getMnp() {
                return mnp;
            }

            /**
             * Imposta il valore della proprietà mnp.
             * 
             * @param value
             *     allowed object is
             *     {@link InstallSubscriberXIbData.Operation.InstallSubscriber.Mnp }
             *     
             */
            public void setMnp(InstallSubscriberXIbData.Operation.InstallSubscriber.Mnp value) {
                this.mnp = value;
            }

            /**
             * Recupera il valore della proprietà clientExTim.
             * 
             * @return
             *     possible object is
             *     {@link InstallSubscriberXIbData.Operation.InstallSubscriber.ClientExTim }
             *     
             */
            public InstallSubscriberXIbData.Operation.InstallSubscriber.ClientExTim getClientExTim() {
                return clientExTim;
            }

            /**
             * Imposta il valore della proprietà clientExTim.
             * 
             * @param value
             *     allowed object is
             *     {@link InstallSubscriberXIbData.Operation.InstallSubscriber.ClientExTim }
             *     
             */
            public void setClientExTim(InstallSubscriberXIbData.Operation.InstallSubscriber.ClientExTim value) {
                this.clientExTim = value;
            }

            /**
             * Recupera il valore della proprietà exTim.
             * 
             * @return
             *     possible object is
             *     {@link InstallSubscriberXIbData.Operation.InstallSubscriber.ExTim }
             *     
             */
            public InstallSubscriberXIbData.Operation.InstallSubscriber.ExTim getExTim() {
                return exTim;
            }

            /**
             * Imposta il valore della proprietà exTim.
             * 
             * @param value
             *     allowed object is
             *     {@link InstallSubscriberXIbData.Operation.InstallSubscriber.ExTim }
             *     
             */
            public void setExTim(InstallSubscriberXIbData.Operation.InstallSubscriber.ExTim value) {
                this.exTim = value;
            }

            /**
             * Recupera il valore della proprietà installType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInstallType() {
                return installType;
            }

            /**
             * Imposta il valore della proprietà installType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInstallType(String value) {
                this.installType = value;
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
             *       &lt;attribute name="ServiceProviderId"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;minLength value="1"/&gt;
             *             &lt;maxLength value="5"/&gt;
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
                "gsm"
            })
            public static class ClientExTim {

                @XmlElement(name = "GSM")
                protected InstallSubscriberXIbData.Operation.InstallSubscriber.ClientExTim.GSM gsm;
                @XmlAttribute(name = "Reason", required = true)
                protected String reason;
                @XmlAttribute(name = "LanguageId", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String languageId;
                @XmlAttribute(name = "TypeOfCard", required = true)
                protected String typeOfCard;
                @XmlAttribute(name = "ServiceProviderId")
                protected String serviceProviderId;

                /**
                 * Recupera il valore della proprietà gsm.
                 * 
                 * @return
                 *     possible object is
                 *     {@link InstallSubscriberXIbData.Operation.InstallSubscriber.ClientExTim.GSM }
                 *     
                 */
                public InstallSubscriberXIbData.Operation.InstallSubscriber.ClientExTim.GSM getGSM() {
                    return gsm;
                }

                /**
                 * Imposta il valore della proprietà gsm.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link InstallSubscriberXIbData.Operation.InstallSubscriber.ClientExTim.GSM }
                 *     
                 */
                public void setGSM(InstallSubscriberXIbData.Operation.InstallSubscriber.ClientExTim.GSM value) {
                    this.gsm = value;
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
             *       &lt;attribute name="ServiceProviderId"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;maxLength value="5"/&gt;
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
                "gsm"
            })
            public static class ClientMnp {

                @XmlElement(name = "GSM")
                protected InstallSubscriberXIbData.Operation.InstallSubscriber.ClientMnp.GSM gsm;
                @XmlAttribute(name = "Reason", required = true)
                protected String reason;
                @XmlAttribute(name = "LanguageId", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String languageId;
                @XmlAttribute(name = "TypeOfCard", required = true)
                protected String typeOfCard;
                @XmlAttribute(name = "ServiceProviderId")
                protected String serviceProviderId;

                /**
                 * Recupera il valore della proprietà gsm.
                 * 
                 * @return
                 *     possible object is
                 *     {@link InstallSubscriberXIbData.Operation.InstallSubscriber.ClientMnp.GSM }
                 *     
                 */
                public InstallSubscriberXIbData.Operation.InstallSubscriber.ClientMnp.GSM getGSM() {
                    return gsm;
                }

                /**
                 * Imposta il valore della proprietà gsm.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link InstallSubscriberXIbData.Operation.InstallSubscriber.ClientMnp.GSM }
                 *     
                 */
                public void setGSM(InstallSubscriberXIbData.Operation.InstallSubscriber.ClientMnp.GSM value) {
                    this.gsm = value;
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
             *       &lt;attribute name="ServiceProviderId"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;maxLength value="5"/&gt;
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
            public static class ClientNormal {

                @XmlElement(name = "GSM")
                protected InstallSubscriberXIbData.Operation.InstallSubscriber.ClientNormal.GSM gsm;
                @XmlElement(name = "TACS")
                protected InstallSubscriberXIbData.Operation.InstallSubscriber.ClientNormal.TACS tacs;
                @XmlAttribute(name = "Reason", required = true)
                protected String reason;
                @XmlAttribute(name = "LanguageId", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String languageId;
                @XmlAttribute(name = "TypeOfCard", required = true)
                protected String typeOfCard;
                @XmlAttribute(name = "ServiceProviderId")
                protected String serviceProviderId;

                /**
                 * Recupera il valore della proprietà gsm.
                 * 
                 * @return
                 *     possible object is
                 *     {@link InstallSubscriberXIbData.Operation.InstallSubscriber.ClientNormal.GSM }
                 *     
                 */
                public InstallSubscriberXIbData.Operation.InstallSubscriber.ClientNormal.GSM getGSM() {
                    return gsm;
                }

                /**
                 * Imposta il valore della proprietà gsm.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link InstallSubscriberXIbData.Operation.InstallSubscriber.ClientNormal.GSM }
                 *     
                 */
                public void setGSM(InstallSubscriberXIbData.Operation.InstallSubscriber.ClientNormal.GSM value) {
                    this.gsm = value;
                }

                /**
                 * Recupera il valore della proprietà tacs.
                 * 
                 * @return
                 *     possible object is
                 *     {@link InstallSubscriberXIbData.Operation.InstallSubscriber.ClientNormal.TACS }
                 *     
                 */
                public InstallSubscriberXIbData.Operation.InstallSubscriber.ClientNormal.TACS getTACS() {
                    return tacs;
                }

                /**
                 * Imposta il valore della proprietà tacs.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link InstallSubscriberXIbData.Operation.InstallSubscriber.ClientNormal.TACS }
                 *     
                 */
                public void setTACS(InstallSubscriberXIbData.Operation.InstallSubscriber.ClientNormal.TACS value) {
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


            /**
             * <p>Classe Java per anonymous complex type.
             * 
             * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;extension base="{http://telecomitalia.it/SOA/TRCS/Gateway}SubscriberProfile"&gt;
             *     &lt;/extension&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ExTim
                extends SubscriberProfile
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
             *     &lt;extension base="{http://telecomitalia.it/SOA/TRCS/Gateway}SubscriberProfile"&gt;
             *     &lt;/extension&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Mnp
                extends SubscriberProfile
            {


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
