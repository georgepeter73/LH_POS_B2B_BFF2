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
 * <p>Java class for LandscapingBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LandscapingBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="HardScape"/>
 *     &lt;enumeration value="Natural"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="ProfessionalPlantings"/>
 *     &lt;enumeration value="XeriScape"/>
 *     &lt;enumeration value="ZeroImpact"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "LandscapingBase")
@XmlEnum
public enum LandscapingBase {


    /**
     * Refers to the built environment including paved areas like streets & sidewalks, structures, walls, street amenities, pools and fountains.
     *
     */
    @XmlEnumValue("HardScape")
    HARD_SCAPE("HardScape"),

    /**
     * A landscape that is unaffected by human activity. A natural landscape is intact when all living and nonliving elements are free to move and change.
     *
     */
    @XmlEnumValue("Natural")
    NATURAL("Natural"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Refers to horticultural expert or professionally designed and executed plantings specific to the site.
     *
     */
    @XmlEnumValue("ProfessionalPlantings")
    PROFESSIONAL_PLANTINGS("ProfessionalPlantings"),

    /**
     * Landscaping and gardening that reduces or eliminates the need for supplemental water from irrigation.
     *
     */
    @XmlEnumValue("XeriScape")
    XERI_SCAPE("XeriScape"),

    /**
     * Landscaping components design to not interfere with environment.
     *
     */
    @XmlEnumValue("ZeroImpact")
    ZERO_IMPACT("ZeroImpact");
    private final String value;

    LandscapingBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LandscapingBase fromValue(String v) {
        for (LandscapingBase c: LandscapingBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
