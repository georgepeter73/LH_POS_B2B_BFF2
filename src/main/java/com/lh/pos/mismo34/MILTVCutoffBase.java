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
 * <p>Java class for MI_LTVCutoffBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MI_LTVCutoffBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AppraisedValue"/>
 *     &lt;enumeration value="SalesPrice"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "MI_LTVCutoffBase")
@XmlEnum
public enum MILTVCutoffBase {

    @XmlEnumValue("AppraisedValue")
    APPRAISED_VALUE("AppraisedValue"),
    @XmlEnumValue("SalesPrice")
    SALES_PRICE("SalesPrice");
    private final String value;

    MILTVCutoffBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MILTVCutoffBase fromValue(String v) {
        for (MILTVCutoffBase c: MILTVCutoffBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
