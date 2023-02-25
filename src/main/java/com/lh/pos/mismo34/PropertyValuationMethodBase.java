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
 * <p>Java class for PropertyValuationMethodBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PropertyValuationMethodBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AutomatedValuationModel"/>
 *     &lt;enumeration value="BrokerPriceOpinion"/>
 *     &lt;enumeration value="DesktopAppraisal"/>
 *     &lt;enumeration value="DriveBy"/>
 *     &lt;enumeration value="FullAppraisal"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PriorAppraisalUsed"/>
 *     &lt;enumeration value="TaxValuation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "PropertyValuationMethodBase")
@XmlEnum
public enum PropertyValuationMethodBase {

    @XmlEnumValue("AutomatedValuationModel")
    AUTOMATED_VALUATION_MODEL("AutomatedValuationModel"),
    @XmlEnumValue("BrokerPriceOpinion")
    BROKER_PRICE_OPINION("BrokerPriceOpinion"),

    /**
     * This appraisal valuation is commonly used for refinancing, home equity loans, and home equity lines of credit.  The appraiser determines the value of the property through public records, tax assessments and comparable sales history.
     *
     */
    @XmlEnumValue("DesktopAppraisal")
    DESKTOP_APPRAISAL("DesktopAppraisal"),
    @XmlEnumValue("DriveBy")
    DRIVE_BY("DriveBy"),
    @XmlEnumValue("FullAppraisal")
    FULL_APPRAISAL("FullAppraisal"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("PriorAppraisalUsed")
    PRIOR_APPRAISAL_USED("PriorAppraisalUsed"),
    @XmlEnumValue("TaxValuation")
    TAX_VALUATION("TaxValuation");
    private final String value;

    PropertyValuationMethodBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PropertyValuationMethodBase fromValue(String v) {
        for (PropertyValuationMethodBase c: PropertyValuationMethodBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
