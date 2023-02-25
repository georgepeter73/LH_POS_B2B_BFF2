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
 * <p>Java class for AdditionalChargeBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdditionalChargeBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="LatePayment"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PrepaymentPenalty"/>
 *     &lt;enumeration value="RealizedLossDueToForeclosedREOPropertyLiquidation"/>
 *     &lt;enumeration value="RealizedLossDueToLoanModification"/>
 *     &lt;enumeration value="SkipPayment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "AdditionalChargeBase")
@XmlEnum
public enum AdditionalChargeBase {

    @XmlEnumValue("LatePayment")
    LATE_PAYMENT("LatePayment"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("PrepaymentPenalty")
    PREPAYMENT_PENALTY("PrepaymentPenalty"),
    @XmlEnumValue("RealizedLossDueToForeclosedREOPropertyLiquidation")
    REALIZED_LOSS_DUE_TO_FORECLOSED_REO_PROPERTY_LIQUIDATION("RealizedLossDueToForeclosedREOPropertyLiquidation"),
    @XmlEnumValue("RealizedLossDueToLoanModification")
    REALIZED_LOSS_DUE_TO_LOAN_MODIFICATION("RealizedLossDueToLoanModification"),
    @XmlEnumValue("SkipPayment")
    SKIP_PAYMENT("SkipPayment");
    private final String value;

    AdditionalChargeBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdditionalChargeBase fromValue(String v) {
        for (AdditionalChargeBase c: AdditionalChargeBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}