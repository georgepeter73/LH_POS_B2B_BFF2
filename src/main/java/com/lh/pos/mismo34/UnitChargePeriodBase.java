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
 * <p>Java class for UnitChargePeriodBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnitChargePeriodBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Annually"/>
 *     &lt;enumeration value="Biweekly"/>
 *     &lt;enumeration value="Daily"/>
 *     &lt;enumeration value="Monthly"/>
 *     &lt;enumeration value="Quarterly"/>
 *     &lt;enumeration value="Semiannually"/>
 *     &lt;enumeration value="Semimonthly"/>
 *     &lt;enumeration value="Weekly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "UnitChargePeriodBase")
@XmlEnum
public enum UnitChargePeriodBase {

    @XmlEnumValue("Annually")
    ANNUALLY("Annually"),
    @XmlEnumValue("Biweekly")
    BIWEEKLY("Biweekly"),
    @XmlEnumValue("Daily")
    DAILY("Daily"),
    @XmlEnumValue("Monthly")
    MONTHLY("Monthly"),
    @XmlEnumValue("Quarterly")
    QUARTERLY("Quarterly"),
    @XmlEnumValue("Semiannually")
    SEMIANNUALLY("Semiannually"),
    @XmlEnumValue("Semimonthly")
    SEMIMONTHLY("Semimonthly"),
    @XmlEnumValue("Weekly")
    WEEKLY("Weekly");
    private final String value;

    UnitChargePeriodBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnitChargePeriodBase fromValue(String v) {
        for (UnitChargePeriodBase c: UnitChargePeriodBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
