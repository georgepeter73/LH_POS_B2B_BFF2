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
 * <p>Java class for ReverseMortgageReportingActionBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReverseMortgageReportingActionBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="CalledDue"/>
 *     &lt;enumeration value="DefaultCondition"/>
 *     &lt;enumeration value="DisbursementOrPaymentResumed"/>
 *     &lt;enumeration value="DisbursementOrPaymentSuspended"/>
 *     &lt;enumeration value="ForeclosureLiquidatedHeldForSale"/>
 *     &lt;enumeration value="ForeclosureLiquidatedPendingConveyance"/>
 *     &lt;enumeration value="ForeclosureLiquidatedThirdPartySale"/>
 *     &lt;enumeration value="LegalActionInitiated"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Payoff"/>
 *     &lt;enumeration value="ReferredForDeedInLieu"/>
 *     &lt;enumeration value="ReferredForForeclosure"/>
 *     &lt;enumeration value="Repurchase"/>
 *     &lt;enumeration value="UnscheduledPaymentMade"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "ReverseMortgageReportingActionBase")
@XmlEnum
public enum ReverseMortgageReportingActionBase {


    /**
     * The loan has been called due for a reason such as death, non occcupancy, failure to pay taxes and insurance, etc.
     *
     */
    @XmlEnumValue("CalledDue")
    CALLED_DUE("CalledDue"),

    /**
     * The loan has a condition which could require that the loan be made due and payable. Examples include non occupancy, failure to pay taxes and insurance, etc.
     *
     */
    @XmlEnumValue("DefaultCondition")
    DEFAULT_CONDITION("DefaultCondition"),

    /**
     * Reactivate the scheduled payments for a loan that currently had scheduled payments suspended to the borrower.
     *
     */
    @XmlEnumValue("DisbursementOrPaymentResumed")
    DISBURSEMENT_OR_PAYMENT_RESUMED("DisbursementOrPaymentResumed"),

    /**
     * Suspend scheduled payments for a loan that currently has scheduled payments disbursed to the borrower.
     *
     */
    @XmlEnumValue("DisbursementOrPaymentSuspended")
    DISBURSEMENT_OR_PAYMENT_SUSPENDED("DisbursementOrPaymentSuspended"),

    /**
     * The loan has been foreclosed. The payments will be suspended and stop the accrual of MIP, interest and service fees, as of the effective date of the action code.
     *
     */
    @XmlEnumValue("ForeclosureLiquidatedHeldForSale")
    FORECLOSURE_LIQUIDATED_HELD_FOR_SALE("ForeclosureLiquidatedHeldForSale"),

    /**
     * The loan has been foreclosed and it will be liquidated as soon as the transfer of property has occurred. This will suspend payments and stop the accrual of MIP, interest and service fees, as of the effective date of the action code.
     *
     */
    @XmlEnumValue("ForeclosureLiquidatedPendingConveyance")
    FORECLOSURE_LIQUIDATED_PENDING_CONVEYANCE("ForeclosureLiquidatedPendingConveyance"),

    /**
     * The loan has been foreclosed and a third party has acquired the property. This will suspend payments and stop the accrual of MIP, interest and service fees, as of the effective date of the action code.
     *
     */
    @XmlEnumValue("ForeclosureLiquidatedThirdPartySale")
    FORECLOSURE_LIQUIDATED_THIRD_PARTY_SALE("ForeclosureLiquidatedThirdPartySale"),

    /**
     * The borrower has filed bankruptcy or has instituted some other type of litigation that will prevent or delay the liquidation of the loan.
     *
     */
    @XmlEnumValue("LegalActionInitiated")
    LEGAL_ACTION_INITIATED("LegalActionInitiated"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * The mortgage has been paid off.
     *
     */
    @XmlEnumValue("Payoff")
    PAYOFF("Payoff"),

    /**
     * The loan has been referred for deed-in-lieu, for reasons such as death, non occupancy, failure to pay taxes and insurance, etc.
     *
     */
    @XmlEnumValue("ReferredForDeedInLieu")
    REFERRED_FOR_DEED_IN_LIEU("ReferredForDeedInLieu"),

    /**
     * The loan has been referred for foreclosure, for reasons such as death, non occupancy, failure to pay taxes and insurance, etc.
     *
     */
    @XmlEnumValue("ReferredForForeclosure")
    REFERRED_FOR_FORECLOSURE("ReferredForForeclosure"),

    /**
     * A servicer repurchase due to the fact that the loan does not meet or no longer meets the contract parameters (a quality control issue).
     *
     */
    @XmlEnumValue("Repurchase")
    REPURCHASE("Repurchase"),

    /**
     * An unscheduled payment to the borrower has been made that increased the loan balance, reducing the net line of credit or set aside balances.
     *
     */
    @XmlEnumValue("UnscheduledPaymentMade")
    UNSCHEDULED_PAYMENT_MADE("UnscheduledPaymentMade");
    private final String value;

    ReverseMortgageReportingActionBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReverseMortgageReportingActionBase fromValue(String v) {
        for (ReverseMortgageReportingActionBase c: ReverseMortgageReportingActionBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
