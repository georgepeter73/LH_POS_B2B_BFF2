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
 * <p>Java class for ValuationRequestCascadingReturnBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValuationRequestCascadingReturnBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Single"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "ValuationRequestCascadingReturnBase")
@XmlEnum
public enum ValuationRequestCascadingReturnBase {


    /**
     * If this value is selected, then all products returned as part of the cascade will be returned in the response.
     *
     */
    @XmlEnumValue("All")
    ALL("All"),

    /**
     * Used to describe an "Other" enumerated value that is not included in the enumerated value list.
     *
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * If this value is selected, then the product returned as part of the cascade will be returned in the response.
     *
     */
    @XmlEnumValue("Single")
    SINGLE("Single");
    private final String value;

    ValuationRequestCascadingReturnBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ValuationRequestCascadingReturnBase fromValue(String v) {
        for (ValuationRequestCascadingReturnBase c: ValuationRequestCascadingReturnBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
