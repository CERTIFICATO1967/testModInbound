//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.10.13 alle 05:11:06 PM CEST 
//


package it.telecomitalia.soa.trcs.gateway.recharge;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://telecomitalia.it/SOA/TRCS/Gateway}AccountComponentType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://telecomitalia.it/SOA/TRCS/Gateway}ACCOUNTGROUPMEMBER" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="GROUPID"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="12"/&gt;
 *             &lt;fractionDigits value="0"/&gt;
 *             &lt;minInclusive value="0"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="OFFERDEACTLIST" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accountgroupmember"
})
@XmlRootElement(name = "ACCOUNTGROUP")
public class ACCOUNTGROUP
    extends AccountComponentType
{

    @XmlElement(name = "ACCOUNTGROUPMEMBER", required = true)
    protected List<ACCOUNTGROUPMEMBER> accountgroupmember;
    @XmlAttribute(name = "GROUPID")
    protected BigDecimal groupid;
    @XmlAttribute(name = "OFFERDEACTLIST")
    protected String offerdeactlist;

    /**
     * Gets the value of the accountgroupmember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountgroupmember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getACCOUNTGROUPMEMBER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ACCOUNTGROUPMEMBER }
     * 
     * 
     */
    public List<ACCOUNTGROUPMEMBER> getACCOUNTGROUPMEMBER() {
        if (accountgroupmember == null) {
            accountgroupmember = new ArrayList<ACCOUNTGROUPMEMBER>();
        }
        return this.accountgroupmember;
    }

    /**
     * Recupera il valore della proprietà groupid.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGROUPID() {
        return groupid;
    }

    /**
     * Imposta il valore della proprietà groupid.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGROUPID(BigDecimal value) {
        this.groupid = value;
    }

    /**
     * Recupera il valore della proprietà offerdeactlist.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOFFERDEACTLIST() {
        return offerdeactlist;
    }

    /**
     * Imposta il valore della proprietà offerdeactlist.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOFFERDEACTLIST(String value) {
        this.offerdeactlist = value;
    }

}
