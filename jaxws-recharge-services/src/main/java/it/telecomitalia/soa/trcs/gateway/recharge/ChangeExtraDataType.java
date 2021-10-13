//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.10.13 alle 05:08:21 PM CEST 
//


package it.telecomitalia.soa.trcs.gateway.recharge;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ChangeExtraDataType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ChangeExtraDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="DiscountSteps" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Step" maxOccurs="3"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                           &lt;attribute name="NextRenewals" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                           &lt;attribute name="CostValue" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                 &lt;totalDigits value="10"/&gt;
 *                                 &lt;fractionDigits value="2"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FinalStep"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="CostValue" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                 &lt;totalDigits value="10"/&gt;
 *                                 &lt;fractionDigits value="2"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CostType"&gt;
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
 *       &lt;attribute name="CostValue"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;totalDigits value="10"/&gt;
 *             &lt;fractionDigits value="2"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="GTFCode"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="15"/&gt;
 *             &lt;whiteSpace value="preserve"/&gt;
 *             &lt;minLength value="0"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="InitiativeCode"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="0"/&gt;
 *             &lt;maxLength value="15"/&gt;
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
@XmlType(name = "ChangeExtraDataType", propOrder = {
    "discountSteps"
})
public class ChangeExtraDataType {

    @XmlElement(name = "DiscountSteps")
    protected ChangeExtraDataType.DiscountSteps discountSteps;
    @XmlAttribute(name = "CostType")
    protected String costType;
    @XmlAttribute(name = "CostValue")
    protected BigDecimal costValue;
    @XmlAttribute(name = "GTFCode")
    protected String gtfCode;
    @XmlAttribute(name = "InitiativeCode")
    protected String initiativeCode;

    /**
     * Recupera il valore della proprietà discountSteps.
     * 
     * @return
     *     possible object is
     *     {@link ChangeExtraDataType.DiscountSteps }
     *     
     */
    public ChangeExtraDataType.DiscountSteps getDiscountSteps() {
        return discountSteps;
    }

    /**
     * Imposta il valore della proprietà discountSteps.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeExtraDataType.DiscountSteps }
     *     
     */
    public void setDiscountSteps(ChangeExtraDataType.DiscountSteps value) {
        this.discountSteps = value;
    }

    /**
     * Recupera il valore della proprietà costType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostType() {
        return costType;
    }

    /**
     * Imposta il valore della proprietà costType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostType(String value) {
        this.costType = value;
    }

    /**
     * Recupera il valore della proprietà costValue.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostValue() {
        return costValue;
    }

    /**
     * Imposta il valore della proprietà costValue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCostValue(BigDecimal value) {
        this.costValue = value;
    }

    /**
     * Recupera il valore della proprietà gtfCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGTFCode() {
        return gtfCode;
    }

    /**
     * Imposta il valore della proprietà gtfCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGTFCode(String value) {
        this.gtfCode = value;
    }

    /**
     * Recupera il valore della proprietà initiativeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiativeCode() {
        return initiativeCode;
    }

    /**
     * Imposta il valore della proprietà initiativeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiativeCode(String value) {
        this.initiativeCode = value;
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
     *         &lt;element name="Step" maxOccurs="3"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                 &lt;attribute name="NextRenewals" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                 &lt;attribute name="CostValue" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                       &lt;totalDigits value="10"/&gt;
     *                       &lt;fractionDigits value="2"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="FinalStep"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="CostValue" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                       &lt;totalDigits value="10"/&gt;
     *                       &lt;fractionDigits value="2"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "step",
        "finalStep"
    })
    public static class DiscountSteps {

        @XmlElement(name = "Step", required = true)
        protected List<ChangeExtraDataType.DiscountSteps.Step> step;
        @XmlElement(name = "FinalStep", required = true)
        protected ChangeExtraDataType.DiscountSteps.FinalStep finalStep;

        /**
         * Gets the value of the step property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the step property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStep().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ChangeExtraDataType.DiscountSteps.Step }
         * 
         * 
         */
        public List<ChangeExtraDataType.DiscountSteps.Step> getStep() {
            if (step == null) {
                step = new ArrayList<ChangeExtraDataType.DiscountSteps.Step>();
            }
            return this.step;
        }

        /**
         * Recupera il valore della proprietà finalStep.
         * 
         * @return
         *     possible object is
         *     {@link ChangeExtraDataType.DiscountSteps.FinalStep }
         *     
         */
        public ChangeExtraDataType.DiscountSteps.FinalStep getFinalStep() {
            return finalStep;
        }

        /**
         * Imposta il valore della proprietà finalStep.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeExtraDataType.DiscountSteps.FinalStep }
         *     
         */
        public void setFinalStep(ChangeExtraDataType.DiscountSteps.FinalStep value) {
            this.finalStep = value;
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
         *       &lt;attribute name="CostValue" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *             &lt;totalDigits value="10"/&gt;
         *             &lt;fractionDigits value="2"/&gt;
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
        public static class FinalStep {

            @XmlAttribute(name = "CostValue", required = true)
            protected BigDecimal costValue;

            /**
             * Recupera il valore della proprietà costValue.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCostValue() {
                return costValue;
            }

            /**
             * Imposta il valore della proprietà costValue.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCostValue(BigDecimal value) {
                this.costValue = value;
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
         *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *       &lt;attribute name="NextRenewals" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *       &lt;attribute name="CostValue" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *             &lt;totalDigits value="10"/&gt;
         *             &lt;fractionDigits value="2"/&gt;
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
        public static class Step {

            @XmlAttribute(name = "Id", required = true)
            @XmlSchemaType(name = "anySimpleType")
            protected String id;
            @XmlAttribute(name = "NextRenewals", required = true)
            @XmlSchemaType(name = "anySimpleType")
            protected String nextRenewals;
            @XmlAttribute(name = "CostValue", required = true)
            protected BigDecimal costValue;

            /**
             * Recupera il valore della proprietà id.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
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
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Recupera il valore della proprietà nextRenewals.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNextRenewals() {
                return nextRenewals;
            }

            /**
             * Imposta il valore della proprietà nextRenewals.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNextRenewals(String value) {
                this.nextRenewals = value;
            }

            /**
             * Recupera il valore della proprietà costValue.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCostValue() {
                return costValue;
            }

            /**
             * Imposta il valore della proprietà costValue.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCostValue(BigDecimal value) {
                this.costValue = value;
            }

        }

    }

}
