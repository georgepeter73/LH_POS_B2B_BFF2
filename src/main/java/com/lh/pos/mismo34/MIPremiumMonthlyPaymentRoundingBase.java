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
 * <p>Java class for MIPremiumMonthlyPaymentRoundingBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MIPremiumMonthlyPaymentRoundingBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Down"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Up"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "MIPremiumMonthlyPaymentRoundingBase")
@XmlEnum
public enum MIPremiumMonthlyPaymentRoundingBase {

    @XmlEnumValue("Down")
    DOWN("Down"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Up")
    UP("Up");
    private final String value;

    MIPremiumMonthlyPaymentRoundingBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MIPremiumMonthlyPaymentRoundingBase fromValue(String v) {
        for (MIPremiumMonthlyPaymentRoundingBase c: MIPremiumMonthlyPaymentRoundingBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
