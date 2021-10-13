//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.10.13 alle 05:27:41 PM CEST 
//


package it.telecomitalia.soa.trcs.gateway.commons;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per paymentModeType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="paymentModeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEF"/&gt;
 *     &lt;enumeration value="CDC"/&gt;
 *     &lt;enumeration value="CFP"/&gt;
 *     &lt;enumeration value="CFA"/&gt;
 *     &lt;enumeration value="FMB"/&gt;
 *     &lt;enumeration value="CRP"/&gt;
 *     &lt;enumeration value="RPC"/&gt;
 *     &lt;enumeration value="RPR"/&gt;
 *     &lt;enumeration value="SPC"/&gt;
 *     &lt;enumeration value="SPR"/&gt;
 *     &lt;enumeration value="CRE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "paymentModeType")
@XmlEnum
public enum PaymentModeType {

    DEF,
    CDC,
    CFP,
    CFA,
    FMB,
    CRP,
    RPC,
    RPR,
    SPC,
    SPR,
    CRE;

    public String value() {
        return name();
    }

    public static PaymentModeType fromValue(String v) {
        return valueOf(v);
    }

}
