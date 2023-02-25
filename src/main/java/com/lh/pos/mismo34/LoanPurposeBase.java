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
 * <p>Java class for LoanPurposeBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoanPurposeBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="MortgageModification"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Purchase"/>
 *     &lt;enumeration value="Refinance"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "LoanPurposeBase")
@XmlEnum
public enum LoanPurposeBase {


    /**
     * Terms of the mortgage are modified from the original terms agreed to by the lender and borrower
     *
     */
    @XmlEnumValue("MortgageModification")
    MORTGAGE_MODIFICATION("MortgageModification"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * A loan made in association with the original purchase of a piece of property.
     *
     */
    @XmlEnumValue("Purchase")
    PURCHASE("Purchase"),

    /**
     * The repayment of a debt from proceeds of a new loan using the same property as security  or a mortgage secured by a property previously owned free and clear by the Borrower.
     *
     */
    @XmlEnumValue("Refinance")
    REFINANCE("Refinance"),

    /**
     * Loan Purpose has not been reported or is not known.
     *
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    LoanPurposeBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoanPurposeBase fromValue(String v) {
        for (LoanPurposeBase c: LoanPurposeBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
