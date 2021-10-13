//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.10.13 alle 05:27:41 PM CEST 
//


package it.telecomitalia.soa.trcs.gateway.infobus.commons;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per IbDataXmlType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="IbDataXmlType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ib_len_data" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IbDataXmlType")
@XmlSeeAlso({
    it.telecomitalia.soa.trcs.gateway.ReloadXRequest.IbData.class,
    it.telecomitalia.soa.trcs.gateway.ReloadXResponse.IbData.class,
    it.telecomitalia.soa.trcs.gateway.OpscBalanceXRequest.IbData.class,
    it.telecomitalia.soa.trcs.gateway.OpscBalanceXResponse.IbData.class
})
public class IbDataXmlType {

    @XmlAttribute(name = "ib_len_data", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long ibLenData;

    /**
     * Recupera il valore della proprietà ibLenData.
     * 
     */
    public long getIbLenData() {
        return ibLenData;
    }

    /**
     * Imposta il valore della proprietà ibLenData.
     * 
     */
    public void setIbLenData(long value) {
        this.ibLenData = value;
    }

}
