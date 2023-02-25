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
 * <p>Java class for CreditLiabilityAccountStatusBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditLiabilityAccountStatusBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Closed"/>
 *     &lt;enumeration value="Frozen"/>
 *     &lt;enumeration value="Open"/>
 *     &lt;enumeration value="Paid"/>
 *     &lt;enumeration value="Refinanced"/>
 *     &lt;enumeration value="Transferred"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "CreditLiabilityAccountStatusBase")
@XmlEnum
public enum CreditLiabilityAccountStatusBase {


    /**
     * Account is closed and credit is no longer available for use.
     *
     */
    @XmlEnumValue("Closed")
    CLOSED("Closed"),

    /**
     * Legal proceedings have been initated to sell property to settle an unpaid balance.
     *
     */
    @XmlEnumValue("Frozen")
    FROZEN("Frozen"),

    /**
     * Account is open
     *
     */
    @XmlEnumValue("Open")
    OPEN("Open"),

    /**
     * Account is closed and fully paid.
     *
     */
    @XmlEnumValue("Paid")
    PAID("Paid"),

    /**
     * Account closed and debt is being paid under another account.
     *
     */
    @XmlEnumValue("Refinanced")
    REFINANCED("Refinanced"),

    /**
     * Account is closed and has been transferred to another account or creditor.
     *
     */
    @XmlEnumValue("Transferred")
    TRANSFERRED("Transferred");
    private final String value;

    CreditLiabilityAccountStatusBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreditLiabilityAccountStatusBase fromValue(String v) {
        for (CreditLiabilityAccountStatusBase c: CreditLiabilityAccountStatusBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
