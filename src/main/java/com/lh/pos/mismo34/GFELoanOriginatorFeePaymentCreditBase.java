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
 * <p>Java class for GFELoanOriginatorFeePaymentCreditBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GFELoanOriginatorFeePaymentCreditBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AmountsPaidByOrInBehalfOfBorrower"/>
 *     &lt;enumeration value="ChosenInterestRateCreditOrCharge"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "GFELoanOriginatorFeePaymentCreditBase")
@XmlEnum
public enum GFELoanOriginatorFeePaymentCreditBase {

    @XmlEnumValue("AmountsPaidByOrInBehalfOfBorrower")
    AMOUNTS_PAID_BY_OR_IN_BEHALF_OF_BORROWER("AmountsPaidByOrInBehalfOfBorrower"),
    @XmlEnumValue("ChosenInterestRateCreditOrCharge")
    CHOSEN_INTEREST_RATE_CREDIT_OR_CHARGE("ChosenInterestRateCreditOrCharge"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    GFELoanOriginatorFeePaymentCreditBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GFELoanOriginatorFeePaymentCreditBase fromValue(String v) {
        for (GFELoanOriginatorFeePaymentCreditBase c: GFELoanOriginatorFeePaymentCreditBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
