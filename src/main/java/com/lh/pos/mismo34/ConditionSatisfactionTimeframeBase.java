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
 * <p>Java class for ConditionSatisfactionTimeframeBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConditionSatisfactionTimeframeBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PriorToApproval"/>
 *     &lt;enumeration value="PriorToDocuments"/>
 *     &lt;enumeration value="PriorToFunding"/>
 *     &lt;enumeration value="PriorToSigning"/>
 *     &lt;enumeration value="UnderwriterToReview"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "ConditionSatisfactionTimeframeBase")
@XmlEnum
public enum ConditionSatisfactionTimeframeBase {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("PriorToApproval")
    PRIOR_TO_APPROVAL("PriorToApproval"),
    @XmlEnumValue("PriorToDocuments")
    PRIOR_TO_DOCUMENTS("PriorToDocuments"),
    @XmlEnumValue("PriorToFunding")
    PRIOR_TO_FUNDING("PriorToFunding"),
    @XmlEnumValue("PriorToSigning")
    PRIOR_TO_SIGNING("PriorToSigning"),
    @XmlEnumValue("UnderwriterToReview")
    UNDERWRITER_TO_REVIEW("UnderwriterToReview");
    private final String value;

    ConditionSatisfactionTimeframeBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConditionSatisfactionTimeframeBase fromValue(String v) {
        for (ConditionSatisfactionTimeframeBase c: ConditionSatisfactionTimeframeBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
