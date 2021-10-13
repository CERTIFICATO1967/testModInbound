//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.10.13 alle 02:54:50 PM CEST 
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{http://telecomitalia.it/SOA/TRCS/Gateway}OFFER" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://telecomitalia.it/SOA/TRCS/Gateway}ONLY_QUERY_11"/&gt;
 *       &lt;attribute name="MEMBERID" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;maxLength value="12"/&gt;
 *             &lt;pattern value="[0-9]+"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ISGROUPMASTER" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="COMPONENTSTATE" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="ACCOUNTCATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="OFFERNAME" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="OFFERSTATUS"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Active"/&gt;
 *             &lt;enumeration value="In Deactivation"/&gt;
 *             &lt;enumeration value="Deactive"/&gt;
 *             &lt;enumeration value="In Downgrade"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="TOT_ACT_MEMBERS" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="TOT_PRV_MEMBERS" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="CIC"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="6"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="SLAVE_CATEGORY"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="N"/&gt;
 *             &lt;enumeration value="S"/&gt;
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
    "offer"
})
@XmlRootElement(name = "ACCOUNTGROUPMEMBER")
public class ACCOUNTGROUPMEMBER {

    @XmlElement(name = "OFFER")
    protected List<OFFER> offer;
    @XmlAttribute(name = "MEMBERID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String memberid;
    @XmlAttribute(name = "ISGROUPMASTER", required = true)
    protected boolean isgroupmaster;
    @XmlAttribute(name = "COMPONENTSTATE")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger componentstate;
    @XmlAttribute(name = "ACCOUNTCATEGORY")
    protected String accountcategory;
    @XmlAttribute(name = "OFFERNAME")
    protected String offername;
    @XmlAttribute(name = "OFFERSTATUS")
    protected String offerstatus;
    @XmlAttribute(name = "TOT_ACT_MEMBERS")
    protected Integer totactmembers;
    @XmlAttribute(name = "TOT_PRV_MEMBERS")
    protected Integer totprvmembers;
    @XmlAttribute(name = "CIC")
    protected String cic;
    @XmlAttribute(name = "SLAVE_CATEGORY")
    protected String slavecategory;
    @XmlAttribute(name = "ACCOUNTSTATE")
    protected BigDecimal accountstate;

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
     *    getOFFER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OFFER }
     * 
     * 
     */
    public List<OFFER> getOFFER() {
        if (offer == null) {
            offer = new ArrayList<OFFER>();
        }
        return this.offer;
    }

    /**
     * Recupera il valore della proprietà memberid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEMBERID() {
        return memberid;
    }

    /**
     * Imposta il valore della proprietà memberid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEMBERID(String value) {
        this.memberid = value;
    }

    /**
     * Recupera il valore della proprietà isgroupmaster.
     * 
     */
    public boolean isISGROUPMASTER() {
        return isgroupmaster;
    }

    /**
     * Imposta il valore della proprietà isgroupmaster.
     * 
     */
    public void setISGROUPMASTER(boolean value) {
        this.isgroupmaster = value;
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
     * Recupera il valore della proprietà accountcategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTCATEGORY() {
        return accountcategory;
    }

    /**
     * Imposta il valore della proprietà accountcategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTCATEGORY(String value) {
        this.accountcategory = value;
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
     * Recupera il valore della proprietà offerstatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOFFERSTATUS() {
        return offerstatus;
    }

    /**
     * Imposta il valore della proprietà offerstatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOFFERSTATUS(String value) {
        this.offerstatus = value;
    }

    /**
     * Recupera il valore della proprietà totactmembers.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTOTACTMEMBERS() {
        return totactmembers;
    }

    /**
     * Imposta il valore della proprietà totactmembers.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTOTACTMEMBERS(Integer value) {
        this.totactmembers = value;
    }

    /**
     * Recupera il valore della proprietà totprvmembers.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTOTPRVMEMBERS() {
        return totprvmembers;
    }

    /**
     * Imposta il valore della proprietà totprvmembers.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTOTPRVMEMBERS(Integer value) {
        this.totprvmembers = value;
    }

    /**
     * Recupera il valore della proprietà cic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIC() {
        return cic;
    }

    /**
     * Imposta il valore della proprietà cic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIC(String value) {
        this.cic = value;
    }

    /**
     * Recupera il valore della proprietà slavecategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSLAVECATEGORY() {
        return slavecategory;
    }

    /**
     * Imposta il valore della proprietà slavecategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSLAVECATEGORY(String value) {
        this.slavecategory = value;
    }

    /**
     * Recupera il valore della proprietà accountstate.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACCOUNTSTATE() {
        return accountstate;
    }

    /**
     * Imposta il valore della proprietà accountstate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACCOUNTSTATE(BigDecimal value) {
        this.accountstate = value;
    }

}
