//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2020.02.11 at 08:03:21 AM EST
//


package com.lh.pos.mismo34;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestCalculationBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InterestCalculationBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Compound"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="RuleOf78s"/>
 *     &lt;enumeration value="Simple"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "InterestCalculationBase")
@XmlEnum
public enum InterestCalculationBase {

    @XmlEnumValue("Compound")
    COMPOUND("Compound"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("RuleOf78s")
    RULE_OF_78_S("RuleOf78s"),
    @XmlEnumValue("Simple")
    SIMPLE("Simple");
    private final String value;

    InterestCalculationBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InterestCalculationBase fromValue(String v) {
        for (InterestCalculationBase c: InterestCalculationBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
