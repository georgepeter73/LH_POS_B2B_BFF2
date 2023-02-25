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
 * <p>Java class for EscrowAccountActivityPaymentDescriptionBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EscrowAccountActivityPaymentDescriptionBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Assessment"/>
 *     &lt;enumeration value="CityPropertyTax"/>
 *     &lt;enumeration value="CountyPropertyTax"/>
 *     &lt;enumeration value="EarthquakeInsurance"/>
 *     &lt;enumeration value="FloodInsurance"/>
 *     &lt;enumeration value="HazardInsurance"/>
 *     &lt;enumeration value="MortgageInsurance"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="SchoolPropertyTax"/>
 *     &lt;enumeration value="TownPropertyTax"/>
 *     &lt;enumeration value="USDAAnnualFee"/>
 *     &lt;enumeration value="VillagePropertyTax"/>
 *     &lt;enumeration value="WindstormInsurance"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "EscrowAccountActivityPaymentDescriptionBase")
@XmlEnum
public enum EscrowAccountActivityPaymentDescriptionBase {

    @XmlEnumValue("Assessment")
    ASSESSMENT("Assessment"),
    @XmlEnumValue("CityPropertyTax")
    CITY_PROPERTY_TAX("CityPropertyTax"),
    @XmlEnumValue("CountyPropertyTax")
    COUNTY_PROPERTY_TAX("CountyPropertyTax"),
    @XmlEnumValue("EarthquakeInsurance")
    EARTHQUAKE_INSURANCE("EarthquakeInsurance"),
    @XmlEnumValue("FloodInsurance")
    FLOOD_INSURANCE("FloodInsurance"),
    @XmlEnumValue("HazardInsurance")
    HAZARD_INSURANCE("HazardInsurance"),
    @XmlEnumValue("MortgageInsurance")
    MORTGAGE_INSURANCE("MortgageInsurance"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("SchoolPropertyTax")
    SCHOOL_PROPERTY_TAX("SchoolPropertyTax"),
    @XmlEnumValue("TownPropertyTax")
    TOWN_PROPERTY_TAX("TownPropertyTax"),
    @XmlEnumValue("USDAAnnualFee")
    USDA_ANNUAL_FEE("USDAAnnualFee"),
    @XmlEnumValue("VillagePropertyTax")
    VILLAGE_PROPERTY_TAX("VillagePropertyTax"),
    @XmlEnumValue("WindstormInsurance")
    WINDSTORM_INSURANCE("WindstormInsurance");
    private final String value;

    EscrowAccountActivityPaymentDescriptionBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EscrowAccountActivityPaymentDescriptionBase fromValue(String v) {
        for (EscrowAccountActivityPaymentDescriptionBase c: EscrowAccountActivityPaymentDescriptionBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
