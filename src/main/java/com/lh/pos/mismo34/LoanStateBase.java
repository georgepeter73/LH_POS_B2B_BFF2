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
 * <p>Java class for LoanStateBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoanStateBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AtBankruptcyFiling"/>
 *     &lt;enumeration value="AtClosing"/>
 *     &lt;enumeration value="AtConversion"/>
 *     &lt;enumeration value="AtEstimate"/>
 *     &lt;enumeration value="AtModification"/>
 *     &lt;enumeration value="AtRelief"/>
 *     &lt;enumeration value="AtReset"/>
 *     &lt;enumeration value="AtTransfer"/>
 *     &lt;enumeration value="AtTrial"/>
 *     &lt;enumeration value="AtUnderwriting"/>
 *     &lt;enumeration value="Current"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "LoanStateBase")
@XmlEnum
public enum LoanStateBase {


    /**
     * A snapshot of the loan data at the time a borrower files for bankruptcy.
     *
     */
    @XmlEnumValue("AtBankruptcyFiling")
    AT_BANKRUPTCY_FILING("AtBankruptcyFiling"),

    /**
     * A snapshot of the loan data at the completion of the closing process. This is sometimes referred to as "original".
     *
     */
    @XmlEnumValue("AtClosing")
    AT_CLOSING("AtClosing"),

    /**
     * For loans with a conversion option, a snapshot of the loan data at the time the conversion features become effective (e.g., biweekly to monthly payments; adjustable to fixed rate amortization).
     *
     */
    @XmlEnumValue("AtConversion")
    AT_CONVERSION("AtConversion"),

    /**
     * A snapshot of the loan data at the point in time when a loan estimate is disclosed.
     *
     */
    @XmlEnumValue("AtEstimate")
    AT_ESTIMATE("AtEstimate"),

    /**
     * For loans which undergo term modifications not originally specified in the note, a snapshot of the loan data at the time the new note terms become effective.
     *
     */
    @XmlEnumValue("AtModification")
    AT_MODIFICATION("AtModification"),

    /**
     * For loans subject to payment relief, a snapshot of the loan data at the time the relief is initiated.
     *
     */
    @XmlEnumValue("AtRelief")
    AT_RELIEF("AtRelief"),

    /**
     * For balloon mortgages with a reset feature, a snapshot of the loan data on the balloon maturity date at the time the borrower exercises the reset option to modify and extend the balloon note.
     *
     */
    @XmlEnumValue("AtReset")
    AT_RESET("AtReset"),

    /**
     * A snapshot of the loan data as of the effective date of the servicing transfer.
     *
     */
    @XmlEnumValue("AtTransfer")
    AT_TRANSFER("AtTransfer"),

    /**
     * A snapshot of the loan data at the initiation of a trial period for a workout modification.
     *
     */
    @XmlEnumValue("AtTrial")
    AT_TRIAL("AtTrial"),

    /**
     * A snapshot of the loan data at the point at which the underwriting recommendation is made.
     *
     */
    @XmlEnumValue("AtUnderwriting")
    AT_UNDERWRITING("AtUnderwriting"),

    /**
     * A snapshot of the loan data as of the "Loan State Date".
     *
     */
    @XmlEnumValue("Current")
    CURRENT("Current");
    private final String value;

    LoanStateBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoanStateBase fromValue(String v) {
        for (LoanStateBase c: LoanStateBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
