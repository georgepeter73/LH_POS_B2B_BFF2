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
 * <p>Java class for MIWorkoutDelegationBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MIWorkoutDelegationBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="InvestorDelegated"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="ServicerDelegated"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "MIWorkoutDelegationBase")
@XmlEnum
public enum MIWorkoutDelegationBase {


    /**
     * The MI company workout decision is delegated to the investor.
     *
     */
    @XmlEnumValue("InvestorDelegated")
    INVESTOR_DELEGATED("InvestorDelegated"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * The MI company workout decision is delegated to the servicer.
     *
     */
    @XmlEnumValue("ServicerDelegated")
    SERVICER_DELEGATED("ServicerDelegated");
    private final String value;

    MIWorkoutDelegationBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MIWorkoutDelegationBase fromValue(String v) {
        for (MIWorkoutDelegationBase c: MIWorkoutDelegationBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
