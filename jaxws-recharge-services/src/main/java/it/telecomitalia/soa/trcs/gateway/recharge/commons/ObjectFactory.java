//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.10.13 alle 02:54:50 PM CEST 
//


package it.telecomitalia.soa.trcs.gateway.recharge.commons;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.telecomitalia.soa.trcs.gateway.recharge.commons package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.telecomitalia.soa.trcs.gateway.recharge.commons
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InfobusMessage }
     * 
     */
    public InfobusMessage createInfobusMessage() {
        return new InfobusMessage();
    }

    /**
     * Create an instance of {@link InfobusXmlMessage }
     * 
     */
    public InfobusXmlMessage createInfobusXmlMessage() {
        return new InfobusXmlMessage();
    }

    /**
     * Create an instance of {@link IbDataXmlType }
     * 
     */
    public IbDataXmlType createIbDataXmlType() {
        return new IbDataXmlType();
    }

    /**
     * Create an instance of {@link InfobusMessage.IbData }
     * 
     */
    public InfobusMessage.IbData createInfobusMessageIbData() {
        return new InfobusMessage.IbData();
    }

}
