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
 * <p>Java class for AVMModelNameBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AVMModelNameBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AutomatedPropertyService"/>
 *     &lt;enumeration value="AVMax"/>
 *     &lt;enumeration value="Casa"/>
 *     &lt;enumeration value="CAValue"/>
 *     &lt;enumeration value="CollateralMarketValue"/>
 *     &lt;enumeration value="CollateralValuationModel"/>
 *     &lt;enumeration value="HomePriceAnalyzer"/>
 *     &lt;enumeration value="HomeValueExplorer"/>
 *     &lt;enumeration value="IntellirealAVM"/>
 *     &lt;enumeration value="IVal"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Pass"/>
 *     &lt;enumeration value="PowerBase6"/>
 *     &lt;enumeration value="RealAssessment"/>
 *     &lt;enumeration value="RealtorValuationModel"/>
 *     &lt;enumeration value="Relar"/>
 *     &lt;enumeration value="SiteXValue"/>
 *     &lt;enumeration value="ValueFinder"/>
 *     &lt;enumeration value="ValuePoint"/>
 *     &lt;enumeration value="ValuePoint4"/>
 *     &lt;enumeration value="ValuePointPlus"/>
 *     &lt;enumeration value="ValueSure"/>
 *     &lt;enumeration value="VeroIndexPlus"/>
 *     &lt;enumeration value="VeroValue"/>
 *     &lt;enumeration value="VeroValueAdvantage"/>
 *     &lt;enumeration value="VeroValuePreferred"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "AVMModelNameBase")
@XmlEnum
public enum AVMModelNameBase {


    /**
     * Provided by Fannie Mae, commonly known as APS.
     *
     */
    @XmlEnumValue("AutomatedPropertyService")
    AUTOMATED_PROPERTY_SERVICE("AutomatedPropertyService"),

    /**
     * Provided by R.J. Peters Assoc, Inc.
     *
     */
    @XmlEnumValue("AVMax")
    AV_MAX("AVMax"),

    /**
     * Provided by Fiserve Case Shiller
     *
     */
    @XmlEnumValue("Casa")
    CASA("Casa"),

    /**
     * Provided by Collateral Analytics
     *
     */
    @XmlEnumValue("CAValue")
    CA_VALUE("CAValue"),

    /**
     * Provided by MDA Lending Solutions
     *
     */
    @XmlEnumValue("CollateralMarketValue")
    COLLATERAL_MARKET_VALUE("CollateralMarketValue"),

    /**
     * Provided by Freddie Mac
     *
     */
    @XmlEnumValue("CollateralValuationModel")
    COLLATERAL_VALUATION_MODEL("CollateralValuationModel"),

    /**
     * Provided by Core Logic
     *
     */
    @XmlEnumValue("HomePriceAnalyzer")
    HOME_PRICE_ANALYZER("HomePriceAnalyzer"),

    /**
     * Provided by Freddie Mac, commonly known as HVE.
     *
     */
    @XmlEnumValue("HomeValueExplorer")
    HOME_VALUE_EXPLORER("HomeValueExplorer"),

    /**
     * Provided by IntelliReal
     *
     */
    @XmlEnumValue("IntellirealAVM")
    INTELLIREAL_AVM("IntellirealAVM"),

    /**
     *  Provided by Real Info, Inc.
     *
     */
    @XmlEnumValue("IVal")
    I_VAL("IVal"),

    /**
     * Other AVM model.
     *
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Provided by Core Logic
     *
     */
    @XmlEnumValue("Pass")
    PASS("Pass"),

    /**
     * Provided by Core Logic
     *
     */
    @XmlEnumValue("PowerBase6")
    POWER_BASE_6("PowerBase6"),

    /**
     * Provided by Real Info, Inc.
     *
     */
    @XmlEnumValue("RealAssessment")
    REAL_ASSESSMENT("RealAssessment"),

    /**
     * Realtor Property Resources
     *
     */
    @XmlEnumValue("RealtorValuationModel")
    REALTOR_VALUATION_MODEL("RealtorValuationModel"),

    /**
     * Provided by CDR
     *
     */
    @XmlEnumValue("Relar")
    RELAR("Relar"),

    /**
     * LPS Real Estate Data Solutions
     *
     */
    @XmlEnumValue("SiteXValue")
    SITE_X_VALUE("SiteXValue"),

    /**
     * Provided by LandSafe.
     *
     */
    @XmlEnumValue("ValueFinder")
    VALUE_FINDER("ValueFinder"),

    /**
     * Provided by First American.
     *
     */
    @XmlEnumValue("ValuePoint")
    VALUE_POINT("ValuePoint"),

    /**
     * Provided by Core Logic
     *
     */
    @XmlEnumValue("ValuePoint4")
    VALUE_POINT_4("ValuePoint4"),

    /**
     * Provided by First American.
     *
     */
    @XmlEnumValue("ValuePointPlus")
    VALUE_POINT_PLUS("ValuePointPlus"),

    /**
     * Provided by LPS Valuation Solutions
     *
     */
    @XmlEnumValue("ValueSure")
    VALUE_SURE("ValueSure"),

    /**
     * Provided by VeroVALUE.
     *
     */
    @XmlEnumValue("VeroIndexPlus")
    VERO_INDEX_PLUS("VeroIndexPlus"),

    /**
     * Provided by VeroVALUE.
     *
     */
    @XmlEnumValue("VeroValue")
    VERO_VALUE("VeroValue"),

    /**
     *  Provided by Veros Real Estate Solutions
     *
     */
    @XmlEnumValue("VeroValueAdvantage")
    VERO_VALUE_ADVANTAGE("VeroValueAdvantage"),

    /**
     * Provided by Core Logic
     *
     */
    @XmlEnumValue("VeroValuePreferred")
    VERO_VALUE_PREFERRED("VeroValuePreferred");
    private final String value;

    AVMModelNameBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AVMModelNameBase fromValue(String v) {
        for (AVMModelNameBase c: AVMModelNameBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
