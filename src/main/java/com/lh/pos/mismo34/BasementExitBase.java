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
 * <p>Java class for BasementExitBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BasementExitBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="InteriorStairs"/>
 *     &lt;enumeration value="Walkout"/>
 *     &lt;enumeration value="Walkup"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "BasementExitBase")
@XmlEnum
public enum BasementExitBase {

    @XmlEnumValue("InteriorStairs")
    INTERIOR_STAIRS("InteriorStairs"),
    @XmlEnumValue("Walkout")
    WALKOUT("Walkout"),
    @XmlEnumValue("Walkup")
    WALKUP("Walkup");
    private final String value;

    BasementExitBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BasementExitBase fromValue(String v) {
        for (BasementExitBase c: BasementExitBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}