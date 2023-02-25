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
 * <p>Java class for VATitleVestingBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VATitleVestingBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="JointTwoOrMoreVeterans"/>
 *     &lt;enumeration value="JointVeteranAndNonVeteran"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Veteran"/>
 *     &lt;enumeration value="VeteranAndSpouse"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "VATitleVestingBase")
@XmlEnum
public enum VATitleVestingBase {

    @XmlEnumValue("JointTwoOrMoreVeterans")
    JOINT_TWO_OR_MORE_VETERANS("JointTwoOrMoreVeterans"),
    @XmlEnumValue("JointVeteranAndNonVeteran")
    JOINT_VETERAN_AND_NON_VETERAN("JointVeteranAndNonVeteran"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Veteran")
    VETERAN("Veteran"),
    @XmlEnumValue("VeteranAndSpouse")
    VETERAN_AND_SPOUSE("VeteranAndSpouse");
    private final String value;

    VATitleVestingBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VATitleVestingBase fromValue(String v) {
        for (VATitleVestingBase c: VATitleVestingBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}