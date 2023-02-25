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
 * <p>Java class for AcceptableSigningMethodBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AcceptableSigningMethodBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Any"/>
 *     &lt;enumeration value="Electronic"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Wet"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "AcceptableSigningMethodBase")
@XmlEnum
public enum AcceptableSigningMethodBase {


    /**
     * The document requires either electronic or wet signatures.
     *
     */
    @XmlEnumValue("Any")
    ANY("Any"),

    /**
     * The document requires electronic signatures.
     *
     */
    @XmlEnumValue("Electronic")
    ELECTRONIC("Electronic"),

    /**
     * The document does not require signatures.
     *
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * The document requires an original handwritten signature.
     *
     */
    @XmlEnumValue("Wet")
    WET("Wet");
    private final String value;

    AcceptableSigningMethodBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AcceptableSigningMethodBase fromValue(String v) {
        for (AcceptableSigningMethodBase c: AcceptableSigningMethodBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
