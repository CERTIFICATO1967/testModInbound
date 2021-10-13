//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.10.13 alle 05:08:21 PM CEST 
//


package it.telecomitalia.soa.trcs.gateway.recharge;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per OptionalSubscriptionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OptionalSubscriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Name" default="MODEL"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="10"/&gt;
 *             &lt;whiteSpace value="preserve"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ProductType" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="ProductValue" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="ProductChannel" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="AccountCategory"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="16"/&gt;
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
@XmlType(name = "OptionalSubscriptionType")
@XmlSeeAlso({
    GroupedSubscriptionBookingType.class,
    SubscriptionBookingType.class,
    FamilySubscriptionOptionType.class,
    PostpaidSubscriptionOptionType.class,
    SubscriptionOptionType.class
})
public class OptionalSubscriptionType {

    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "ProductType")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger productType;
    @XmlAttribute(name = "ProductValue")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger productValue;
    @XmlAttribute(name = "ProductChannel")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger productChannel;
    @XmlAttribute(name = "AccountCategory")
    protected String accountCategory;

    /**
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        if (name == null) {
            return "MODEL";
        } else {
            return name;
        }
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

    /**
     * Recupera il valore della proprietà productType.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProductType() {
        return productType;
    }

    /**
     * Imposta il valore della proprietà productType.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProductType(BigInteger value) {
        this.productType = value;
    }

    /**
     * Recupera il valore della proprietà productValue.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProductValue() {
        return productValue;
    }

    /**
     * Imposta il valore della proprietà productValue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProductValue(BigInteger value) {
        this.productValue = value;
    }

    /**
     * Recupera il valore della proprietà productChannel.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProductChannel() {
        return productChannel;
    }

    /**
     * Imposta il valore della proprietà productChannel.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProductChannel(BigInteger value) {
        this.productChannel = value;
    }

    /**
     * Recupera il valore della proprietà accountCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCategory() {
        return accountCategory;
    }

    /**
     * Imposta il valore della proprietà accountCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCategory(String value) {
        this.accountCategory = value;
    }

}
