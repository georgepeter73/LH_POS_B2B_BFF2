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
 * <p>Java class for MarketInventoryTrendBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarketInventoryTrendBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Declining"/>
 *     &lt;enumeration value="Increasing"/>
 *     &lt;enumeration value="Stable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "MarketInventoryTrendBase")
@XmlEnum
public enum MarketInventoryTrendBase {

    @XmlEnumValue("Declining")
    DECLINING("Declining"),
    @XmlEnumValue("Increasing")
    INCREASING("Increasing"),
    @XmlEnumValue("Stable")
    STABLE("Stable");
    private final String value;

    MarketInventoryTrendBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MarketInventoryTrendBase fromValue(String v) {
        for (MarketInventoryTrendBase c: MarketInventoryTrendBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
