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
 * <p>Java class for ExceptionInterestAdjustmentDayMethodBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExceptionInterestAdjustmentDayMethodBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="ActualLastPaidInstallmentDueDate"/>
 *     &lt;enumeration value="FirstOfMonth"/>
 *     &lt;enumeration value="ScheduledLastPaidInstallmentDueDate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "ExceptionInterestAdjustmentDayMethodBase")
@XmlEnum
public enum ExceptionInterestAdjustmentDayMethodBase {

    @XmlEnumValue("ActualLastPaidInstallmentDueDate")
    ACTUAL_LAST_PAID_INSTALLMENT_DUE_DATE("ActualLastPaidInstallmentDueDate"),
    @XmlEnumValue("FirstOfMonth")
    FIRST_OF_MONTH("FirstOfMonth"),
    @XmlEnumValue("ScheduledLastPaidInstallmentDueDate")
    SCHEDULED_LAST_PAID_INSTALLMENT_DUE_DATE("ScheduledLastPaidInstallmentDueDate");
    private final String value;

    ExceptionInterestAdjustmentDayMethodBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExceptionInterestAdjustmentDayMethodBase fromValue(String v) {
        for (ExceptionInterestAdjustmentDayMethodBase c: ExceptionInterestAdjustmentDayMethodBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
