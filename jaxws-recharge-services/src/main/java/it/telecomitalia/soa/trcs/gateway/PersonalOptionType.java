//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.10.13 alle 04:12:20 PM CEST 
//


package it.telecomitalia.soa.trcs.gateway;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Complex type describing personal options update
 * 				operation
 * 			
 * 
 * <p>Classe Java per PersonalOptionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PersonalOptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="List"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Pattern" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Priority"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                                 &lt;minInclusive value="0"/&gt;
 *                                 &lt;maxInclusive value="1"/&gt;
 *                                 &lt;totalDigits value="1"/&gt;
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
 *         &lt;element name="Group"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="GroupCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InterCom"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Pattern" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="MasterMSISDN" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="Name" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;maxLength value="10"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="NumOpChange"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;maxLength value="5"/&gt;
 *             &lt;pattern value="[0-9]+"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="LastchangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="PersonalOptionCost"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;maxLength value="13"/&gt;
 *             &lt;pattern value="[0-9]+(.[0-9]+)?"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="CostMode" default="0"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;maxLength value="1"/&gt;
 *             &lt;pattern value="[0|1|2|3|4|5|6|7|8|9]"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="MaxPlus" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonalOptionType", propOrder = {
    "list",
    "group",
    "interCom"
})
public class PersonalOptionType {

    @XmlElement(name = "List")
    protected PersonalOptionType.List list;
    @XmlElement(name = "Group")
    protected PersonalOptionType.Group group;
    @XmlElement(name = "InterCom")
    protected PersonalOptionType.InterCom interCom;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "NumOpChange")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String numOpChange;
    @XmlAttribute(name = "LastchangeDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastchangeDate;
    @XmlAttribute(name = "PersonalOptionCost")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String personalOptionCost;
    @XmlAttribute(name = "CostMode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String costMode;
    @XmlAttribute(name = "MaxPlus")
    protected Integer maxPlus;

    /**
     * Recupera il valore della proprietà list.
     * 
     * @return
     *     possible object is
     *     {@link PersonalOptionType.List }
     *     
     */
    public PersonalOptionType.List getList() {
        return list;
    }

    /**
     * Imposta il valore della proprietà list.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalOptionType.List }
     *     
     */
    public void setList(PersonalOptionType.List value) {
        this.list = value;
    }

    /**
     * Recupera il valore della proprietà group.
     * 
     * @return
     *     possible object is
     *     {@link PersonalOptionType.Group }
     *     
     */
    public PersonalOptionType.Group getGroup() {
        return group;
    }

    /**
     * Imposta il valore della proprietà group.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalOptionType.Group }
     *     
     */
    public void setGroup(PersonalOptionType.Group value) {
        this.group = value;
    }

    /**
     * Recupera il valore della proprietà interCom.
     * 
     * @return
     *     possible object is
     *     {@link PersonalOptionType.InterCom }
     *     
     */
    public PersonalOptionType.InterCom getInterCom() {
        return interCom;
    }

    /**
     * Imposta il valore della proprietà interCom.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalOptionType.InterCom }
     *     
     */
    public void setInterCom(PersonalOptionType.InterCom value) {
        this.interCom = value;
    }

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

    /**
     * Recupera il valore della proprietà numOpChange.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumOpChange() {
        return numOpChange;
    }

    /**
     * Imposta il valore della proprietà numOpChange.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumOpChange(String value) {
        this.numOpChange = value;
    }

    /**
     * Recupera il valore della proprietà lastchangeDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastchangeDate() {
        return lastchangeDate;
    }

    /**
     * Imposta il valore della proprietà lastchangeDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastchangeDate(XMLGregorianCalendar value) {
        this.lastchangeDate = value;
    }

    /**
     * Recupera il valore della proprietà personalOptionCost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalOptionCost() {
        return personalOptionCost;
    }

    /**
     * Imposta il valore della proprietà personalOptionCost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalOptionCost(String value) {
        this.personalOptionCost = value;
    }

    /**
     * Recupera il valore della proprietà costMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostMode() {
        if (costMode == null) {
            return "0";
        } else {
            return costMode;
        }
    }

    /**
     * Imposta il valore della proprietà costMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostMode(String value) {
        this.costMode = value;
    }

    /**
     * Recupera il valore della proprietà maxPlus.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxPlus() {
        return maxPlus;
    }

    /**
     * Imposta il valore della proprietà maxPlus.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxPlus(Integer value) {
        this.maxPlus = value;
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
     *       &lt;attribute name="GroupCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Group {

        @XmlAttribute(name = "GroupCode", required = true)
        protected String groupCode;

        /**
         * Recupera il valore della proprietà groupCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGroupCode() {
            return groupCode;
        }

        /**
         * Imposta il valore della proprietà groupCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGroupCode(String value) {
            this.groupCode = value;
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
     *         &lt;element name="Pattern" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="MasterMSISDN" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pattern"
    })
    public static class InterCom {

        @XmlElement(name = "Pattern")
        protected java.util.List<PersonalOptionType.InterCom.Pattern> pattern;
        @XmlAttribute(name = "MasterMSISDN", required = true)
        protected String masterMSISDN;

        /**
         * Gets the value of the pattern property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pattern property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPattern().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PersonalOptionType.InterCom.Pattern }
         * 
         * 
         */
        public java.util.List<PersonalOptionType.InterCom.Pattern> getPattern() {
            if (pattern == null) {
                pattern = new ArrayList<PersonalOptionType.InterCom.Pattern>();
            }
            return this.pattern;
        }

        /**
         * Recupera il valore della proprietà masterMSISDN.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMasterMSISDN() {
            return masterMSISDN;
        }

        /**
         * Imposta il valore della proprietà masterMSISDN.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMasterMSISDN(String value) {
            this.masterMSISDN = value;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Pattern {

            @XmlAttribute(name = "Value", required = true)
            protected String value;

            /**
             * Recupera il valore della proprietà value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Imposta il valore della proprietà value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="Pattern" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Priority"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *                       &lt;minInclusive value="0"/&gt;
     *                       &lt;maxInclusive value="1"/&gt;
     *                       &lt;totalDigits value="1"/&gt;
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
        "pattern"
    })
    public static class List {

        @XmlElement(name = "Pattern", required = true)
        protected java.util.List<PersonalOptionType.List.Pattern> pattern;

        /**
         * Gets the value of the pattern property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pattern property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPattern().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PersonalOptionType.List.Pattern }
         * 
         * 
         */
        public java.util.List<PersonalOptionType.List.Pattern> getPattern() {
            if (pattern == null) {
                pattern = new ArrayList<PersonalOptionType.List.Pattern>();
            }
            return this.pattern;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Priority"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
         *             &lt;minInclusive value="0"/&gt;
         *             &lt;maxInclusive value="1"/&gt;
         *             &lt;totalDigits value="1"/&gt;
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
        public static class Pattern {

            @XmlAttribute(name = "Value", required = true)
            protected String value;
            @XmlAttribute(name = "Priority")
            protected Integer priority;

            /**
             * Recupera il valore della proprietà value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Imposta il valore della proprietà value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Recupera il valore della proprietà priority.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getPriority() {
                return priority;
            }

            /**
             * Imposta il valore della proprietà priority.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setPriority(Integer value) {
                this.priority = value;
            }

        }

    }

}
