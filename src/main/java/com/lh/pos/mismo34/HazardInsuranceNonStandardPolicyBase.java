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
 * <p>Java class for HazardInsuranceNonStandardPolicyBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HazardInsuranceNonStandardPolicyBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Application"/>
 *     &lt;enumeration value="Binder"/>
 *     &lt;enumeration value="Bridge"/>
 *     &lt;enumeration value="Condo"/>
 *     &lt;enumeration value="CondominiumPUDMasterPolicy"/>
 *     &lt;enumeration value="FairPlan"/>
 *     &lt;enumeration value="ForcePlaced"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "HazardInsuranceNonStandardPolicyBase")
@XmlEnum
public enum HazardInsuranceNonStandardPolicyBase {

    @XmlEnumValue("Application")
    APPLICATION("Application"),
    @XmlEnumValue("Binder")
    BINDER("Binder"),
    @XmlEnumValue("Bridge")
    BRIDGE("Bridge"),
    @XmlEnumValue("Condo")
    CONDO("Condo"),
    @XmlEnumValue("CondominiumPUDMasterPolicy")
    CONDOMINIUM_PUD_MASTER_POLICY("CondominiumPUDMasterPolicy"),
    @XmlEnumValue("FairPlan")
    FAIR_PLAN("FairPlan"),
    @XmlEnumValue("ForcePlaced")
    FORCE_PLACED("ForcePlaced"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    HazardInsuranceNonStandardPolicyBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HazardInsuranceNonStandardPolicyBase fromValue(String v) {
        for (HazardInsuranceNonStandardPolicyBase c: HazardInsuranceNonStandardPolicyBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
