//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.08.02 alle 11:23:32 AM CEST 
//


package it.telecomitalia.soa.trcs.gateway;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import it.telecomitalia.soa.trcs.gateway.infobus.commons.IbDataXmlType;
import it.telecomitalia.soa.trcs.gateway.infobus.commons.InfobusXmlMessage;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://telecomitalia.it/SOA/TRCS/Gateway/Infobus/Commons}InfobusXmlMessage"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ibData"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://telecomitalia.it/SOA/TRCS/Gateway/Infobus/Commons}IbDataXmlType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Request" type="{http://telecomitalia.it/SOA/TRCS/Gateway}SaleOperationXIbData"/&gt;
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
@XmlType(name = "", propOrder = {
    "ibData"
})
@XmlRootElement(name = "SaleOperationXRequest")
public class SaleOperationXRequest
    extends InfobusXmlMessage
{

    @XmlElement(required = true)
    protected SaleOperationXRequest.IbData ibData;

    /**
     * Recupera il valore della proprietà ibData.
     * 
     * @return
     *     possible object is
     *     {@link SaleOperationXRequest.IbData }
     *     
     */
    public SaleOperationXRequest.IbData getIbData() {
        return ibData;
    }

    /**
     * Imposta il valore della proprietà ibData.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleOperationXRequest.IbData }
     *     
     */
    public void setIbData(SaleOperationXRequest.IbData value) {
        this.ibData = value;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://telecomitalia.it/SOA/TRCS/Gateway/Infobus/Commons}IbDataXmlType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Request" type="{http://telecomitalia.it/SOA/TRCS/Gateway}SaleOperationXIbData"/&gt;
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
        "request"
    })
    public static class IbData
        extends IbDataXmlType
    {

        @XmlElement(name = "Request", required = true)
        protected SaleOperationXIbData request;

        /**
         * Recupera il valore della proprietà request.
         * 
         * @return
         *     possible object is
         *     {@link SaleOperationXIbData }
         *     
         */
        public SaleOperationXIbData getRequest() {
            return request;
        }

        /**
         * Imposta il valore della proprietà request.
         * 
         * @param value
         *     allowed object is
         *     {@link SaleOperationXIbData }
         *     
         */
        public void setRequest(SaleOperationXIbData value) {
            this.request = value;
        }

    }

}
