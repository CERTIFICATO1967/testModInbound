//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.10.13 alle 04:12:20 PM CEST 
//


package it.telecomitalia.soa.trcs.gateway;

import java.math.BigInteger;
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
 * <p>Classe Java per LifeCycleBookType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LifeCycleBookType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="FixDate"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="FixValue" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OffsetDate"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="OffsetType" default="day"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;whiteSpace value="collapse"/&gt;
 *                       &lt;enumeration value="day"/&gt;
 *                       &lt;enumeration value="month"/&gt;
 *                       &lt;enumeration value="fixday"/&gt;
 *                       &lt;enumeration value="endmonth"/&gt;
 *                       &lt;enumeration value="billcycle"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="OffsetValue" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="DayOfWeek"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;whiteSpace value="collapse"/&gt;
 *                       &lt;enumeration value="Sun"/&gt;
 *                       &lt;enumeration value="Mon"/&gt;
 *                       &lt;enumeration value="Tue"/&gt;
 *                       &lt;enumeration value="Wed"/&gt;
 *                       &lt;enumeration value="Thu"/&gt;
 *                       &lt;enumeration value="Fri"/&gt;
 *                       &lt;enumeration value="Sat"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="TimeAlign" default="1"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;maxLength value="1"/&gt;
 *             &lt;pattern value="[0|1]"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="NextDay" default="1"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;maxLength value="1"/&gt;
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
@XmlType(name = "LifeCycleBookType", propOrder = {
    "fixDate",
    "offsetDate"
})
public class LifeCycleBookType {

    @XmlElement(name = "FixDate")
    protected LifeCycleBookType.FixDate fixDate;
    @XmlElement(name = "OffsetDate")
    protected LifeCycleBookType.OffsetDate offsetDate;
    @XmlAttribute(name = "TimeAlign")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String timeAlign;
    @XmlAttribute(name = "NextDay")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nextDay;

    /**
     * Recupera il valore della proprietà fixDate.
     * 
     * @return
     *     possible object is
     *     {@link LifeCycleBookType.FixDate }
     *     
     */
    public LifeCycleBookType.FixDate getFixDate() {
        return fixDate;
    }

    /**
     * Imposta il valore della proprietà fixDate.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeCycleBookType.FixDate }
     *     
     */
    public void setFixDate(LifeCycleBookType.FixDate value) {
        this.fixDate = value;
    }

    /**
     * Recupera il valore della proprietà offsetDate.
     * 
     * @return
     *     possible object is
     *     {@link LifeCycleBookType.OffsetDate }
     *     
     */
    public LifeCycleBookType.OffsetDate getOffsetDate() {
        return offsetDate;
    }

    /**
     * Imposta il valore della proprietà offsetDate.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeCycleBookType.OffsetDate }
     *     
     */
    public void setOffsetDate(LifeCycleBookType.OffsetDate value) {
        this.offsetDate = value;
    }

    /**
     * Recupera il valore della proprietà timeAlign.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeAlign() {
        if (timeAlign == null) {
            return "1";
        } else {
            return timeAlign;
        }
    }

    /**
     * Imposta il valore della proprietà timeAlign.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeAlign(String value) {
        this.timeAlign = value;
    }

    /**
     * Recupera il valore della proprietà nextDay.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextDay() {
        if (nextDay == null) {
            return "1";
        } else {
            return nextDay;
        }
    }

    /**
     * Imposta il valore della proprietà nextDay.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextDay(String value) {
        this.nextDay = value;
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
     *       &lt;attribute name="FixValue" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FixDate {

        @XmlAttribute(name = "FixValue", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fixValue;

        /**
         * Recupera il valore della proprietà fixValue.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFixValue() {
            return fixValue;
        }

        /**
         * Imposta il valore della proprietà fixValue.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFixValue(XMLGregorianCalendar value) {
            this.fixValue = value;
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
     *       &lt;attribute name="OffsetType" default="day"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;whiteSpace value="collapse"/&gt;
     *             &lt;enumeration value="day"/&gt;
     *             &lt;enumeration value="month"/&gt;
     *             &lt;enumeration value="fixday"/&gt;
     *             &lt;enumeration value="endmonth"/&gt;
     *             &lt;enumeration value="billcycle"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="OffsetValue" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="DayOfWeek"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;whiteSpace value="collapse"/&gt;
     *             &lt;enumeration value="Sun"/&gt;
     *             &lt;enumeration value="Mon"/&gt;
     *             &lt;enumeration value="Tue"/&gt;
     *             &lt;enumeration value="Wed"/&gt;
     *             &lt;enumeration value="Thu"/&gt;
     *             &lt;enumeration value="Fri"/&gt;
     *             &lt;enumeration value="Sat"/&gt;
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
    public static class OffsetDate {

        @XmlAttribute(name = "OffsetType")
        protected String offsetType;
        @XmlAttribute(name = "OffsetValue", required = true)
        protected BigInteger offsetValue;
        @XmlAttribute(name = "DayOfWeek")
        protected String dayOfWeek;

        /**
         * Recupera il valore della proprietà offsetType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffsetType() {
            if (offsetType == null) {
                return "day";
            } else {
                return offsetType;
            }
        }

        /**
         * Imposta il valore della proprietà offsetType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffsetType(String value) {
            this.offsetType = value;
        }

        /**
         * Recupera il valore della proprietà offsetValue.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOffsetValue() {
            return offsetValue;
        }

        /**
         * Imposta il valore della proprietà offsetValue.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOffsetValue(BigInteger value) {
            this.offsetValue = value;
        }

        /**
         * Recupera il valore della proprietà dayOfWeek.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDayOfWeek() {
            return dayOfWeek;
        }

        /**
         * Imposta il valore della proprietà dayOfWeek.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDayOfWeek(String value) {
            this.dayOfWeek = value;
        }

    }

}
