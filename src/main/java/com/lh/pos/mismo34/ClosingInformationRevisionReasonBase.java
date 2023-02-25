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
 * <p>Java class for ClosingInformationRevisionReasonBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClosingInformationRevisionReasonBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="ChangedBorrowerInformation"/>
 *     &lt;enumeration value="ChangedFeeAmount"/>
 *     &lt;enumeration value="ChangedItemPlacement"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "ClosingInformationRevisionReasonBase")
@XmlEnum
public enum ClosingInformationRevisionReasonBase {


    /**
     * Indicates that facts about the borrower were modified by the sending party.
     *
     */
    @XmlEnumValue("ChangedBorrowerInformation")
    CHANGED_BORROWER_INFORMATION("ChangedBorrowerInformation"),

    /**
     * Indicates that a fee amount required modification and was adjusted by the sending party.
     *
     */
    @XmlEnumValue("ChangedFeeAmount")
    CHANGED_FEE_AMOUNT("ChangedFeeAmount"),

    /**
     * Indicates that the section or line of a fee or closing item was modified by the sending party.
     *
     */
    @XmlEnumValue("ChangedItemPlacement")
    CHANGED_ITEM_PLACEMENT("ChangedItemPlacement"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ClosingInformationRevisionReasonBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClosingInformationRevisionReasonBase fromValue(String v) {
        for (ClosingInformationRevisionReasonBase c: ClosingInformationRevisionReasonBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
