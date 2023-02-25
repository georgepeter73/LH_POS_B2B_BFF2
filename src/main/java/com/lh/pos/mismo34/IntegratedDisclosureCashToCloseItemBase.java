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
 * <p>Java class for IntegratedDisclosureCashToCloseItemBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IntegratedDisclosureCashToCloseItemBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AdjustmentsAndOtherCredits"/>
 *     &lt;enumeration value="CashToCloseTotal"/>
 *     &lt;enumeration value="ClosingCostsFinanced"/>
 *     &lt;enumeration value="ClosingCostsPaidBeforeClosing"/>
 *     &lt;enumeration value="Deposit"/>
 *     &lt;enumeration value="DownPayment"/>
 *     &lt;enumeration value="FundsForBorrower"/>
 *     &lt;enumeration value="FundsFromBorrower"/>
 *     &lt;enumeration value="LenderCredits"/>
 *     &lt;enumeration value="LoanAmount"/>
 *     &lt;enumeration value="LoanCostsAndOtherCostsTotal"/>
 *     &lt;enumeration value="SellerCredits"/>
 *     &lt;enumeration value="TotalClosingCosts"/>
 *     &lt;enumeration value="TotalPayoffsAndPayments"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "IntegratedDisclosureCashToCloseItemBase")
@XmlEnum
public enum IntegratedDisclosureCashToCloseItemBase {

    @XmlEnumValue("AdjustmentsAndOtherCredits")
    ADJUSTMENTS_AND_OTHER_CREDITS("AdjustmentsAndOtherCredits"),
    @XmlEnumValue("CashToCloseTotal")
    CASH_TO_CLOSE_TOTAL("CashToCloseTotal"),
    @XmlEnumValue("ClosingCostsFinanced")
    CLOSING_COSTS_FINANCED("ClosingCostsFinanced"),
    @XmlEnumValue("ClosingCostsPaidBeforeClosing")
    CLOSING_COSTS_PAID_BEFORE_CLOSING("ClosingCostsPaidBeforeClosing"),
    @XmlEnumValue("Deposit")
    DEPOSIT("Deposit"),
    @XmlEnumValue("DownPayment")
    DOWN_PAYMENT("DownPayment"),
    @XmlEnumValue("FundsForBorrower")
    FUNDS_FOR_BORROWER("FundsForBorrower"),
    @XmlEnumValue("FundsFromBorrower")
    FUNDS_FROM_BORROWER("FundsFromBorrower"),
    @XmlEnumValue("LenderCredits")
    LENDER_CREDITS("LenderCredits"),
    @XmlEnumValue("LoanAmount")
    LOAN_AMOUNT("LoanAmount"),
    @XmlEnumValue("LoanCostsAndOtherCostsTotal")
    LOAN_COSTS_AND_OTHER_COSTS_TOTAL("LoanCostsAndOtherCostsTotal"),
    @XmlEnumValue("SellerCredits")
    SELLER_CREDITS("SellerCredits"),

    /**
     * Equivalent of J on Loan Estimate and Closing Disclosure
     *
     */
    @XmlEnumValue("TotalClosingCosts")
    TOTAL_CLOSING_COSTS("TotalClosingCosts"),
    @XmlEnumValue("TotalPayoffsAndPayments")
    TOTAL_PAYOFFS_AND_PAYMENTS("TotalPayoffsAndPayments");
    private final String value;

    IntegratedDisclosureCashToCloseItemBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IntegratedDisclosureCashToCloseItemBase fromValue(String v) {
        for (IntegratedDisclosureCashToCloseItemBase c: IntegratedDisclosureCashToCloseItemBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
