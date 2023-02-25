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
 * <p>Java class for PriorPropertyTitleBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PriorPropertyTitleBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="JointWithOtherThanSpouse"/>
 *     &lt;enumeration value="JointWithSpouse"/>
 *     &lt;enumeration value="Sole"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "PriorPropertyTitleBase")
@XmlEnum
public enum PriorPropertyTitleBase {


    /**
     * Use this answer for any property owned with any other person including spouse.
     *
     */
    @XmlEnumValue("JointWithOtherThanSpouse")
    JOINT_WITH_OTHER_THAN_SPOUSE("JointWithOtherThanSpouse"),

    /**
     * Use this answer for any property owned with a spouse.
     *
     */
    @XmlEnumValue("JointWithSpouse")
    JOINT_WITH_SPOUSE("JointWithSpouse"),

    /**
     * Individual
     *
     */
    @XmlEnumValue("Sole")
    SOLE("Sole");
    private final String value;

    PriorPropertyTitleBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PriorPropertyTitleBase fromValue(String v) {
        for (PriorPropertyTitleBase c: PriorPropertyTitleBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
