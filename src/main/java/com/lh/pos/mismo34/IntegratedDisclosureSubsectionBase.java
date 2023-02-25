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
 * <p>Java class for IntegratedDisclosureSubsectionBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IntegratedDisclosureSubsectionBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Adjustments"/>
 *     &lt;enumeration value="AdjustmentsForItemsPaidBySellerInAdvance"/>
 *     &lt;enumeration value="AdjustmentsForItemsUnpaidBySeller"/>
 *     &lt;enumeration value="ClosingCostsSubtotal"/>
 *     &lt;enumeration value="LenderCredits"/>
 *     &lt;enumeration value="LoanCostsSubtotal"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="OtherCostsSubtotal"/>
 *     &lt;enumeration value="OtherCredits"/>
 *     &lt;enumeration value="TotalClosingCostsSellerOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "IntegratedDisclosureSubsectionBase")
@XmlEnum
public enum IntegratedDisclosureSubsectionBase {

    @XmlEnumValue("Adjustments")
    ADJUSTMENTS("Adjustments"),
    @XmlEnumValue("AdjustmentsForItemsPaidBySellerInAdvance")
    ADJUSTMENTS_FOR_ITEMS_PAID_BY_SELLER_IN_ADVANCE("AdjustmentsForItemsPaidBySellerInAdvance"),
    @XmlEnumValue("AdjustmentsForItemsUnpaidBySeller")
    ADJUSTMENTS_FOR_ITEMS_UNPAID_BY_SELLER("AdjustmentsForItemsUnpaidBySeller"),
    @XmlEnumValue("ClosingCostsSubtotal")
    CLOSING_COSTS_SUBTOTAL("ClosingCostsSubtotal"),
    @XmlEnumValue("LenderCredits")
    LENDER_CREDITS("LenderCredits"),
    @XmlEnumValue("LoanCostsSubtotal")
    LOAN_COSTS_SUBTOTAL("LoanCostsSubtotal"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("OtherCostsSubtotal")
    OTHER_COSTS_SUBTOTAL("OtherCostsSubtotal"),
    @XmlEnumValue("OtherCredits")
    OTHER_CREDITS("OtherCredits"),
    @XmlEnumValue("TotalClosingCostsSellerOnly")
    TOTAL_CLOSING_COSTS_SELLER_ONLY("TotalClosingCostsSellerOnly");
    private final String value;

    IntegratedDisclosureSubsectionBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IntegratedDisclosureSubsectionBase fromValue(String v) {
        for (IntegratedDisclosureSubsectionBase c: IntegratedDisclosureSubsectionBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
