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
 * <p>Java class for AmenityBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AmenityBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Balcony"/>
 *     &lt;enumeration value="Deck"/>
 *     &lt;enumeration value="Fence"/>
 *     &lt;enumeration value="Fireplace"/>
 *     &lt;enumeration value="HomeTheater"/>
 *     &lt;enumeration value="Intercom"/>
 *     &lt;enumeration value="JettedTub"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Patio"/>
 *     &lt;enumeration value="Pool"/>
 *     &lt;enumeration value="Porch"/>
 *     &lt;enumeration value="SecuritySystem"/>
 *     &lt;enumeration value="Spa"/>
 *     &lt;enumeration value="WoodStove"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "AmenityBase")
@XmlEnum
public enum AmenityBase {

    @XmlEnumValue("Balcony")
    BALCONY("Balcony"),
    @XmlEnumValue("Deck")
    DECK("Deck"),
    @XmlEnumValue("Fence")
    FENCE("Fence"),
    @XmlEnumValue("Fireplace")
    FIREPLACE("Fireplace"),
    @XmlEnumValue("HomeTheater")
    HOME_THEATER("HomeTheater"),
    @XmlEnumValue("Intercom")
    INTERCOM("Intercom"),
    @XmlEnumValue("JettedTub")
    JETTED_TUB("JettedTub"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Patio")
    PATIO("Patio"),
    @XmlEnumValue("Pool")
    POOL("Pool"),
    @XmlEnumValue("Porch")
    PORCH("Porch"),
    @XmlEnumValue("SecuritySystem")
    SECURITY_SYSTEM("SecuritySystem"),
    @XmlEnumValue("Spa")
    SPA("Spa"),
    @XmlEnumValue("WoodStove")
    WOOD_STOVE("WoodStove");
    private final String value;

    AmenityBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AmenityBase fromValue(String v) {
        for (AmenityBase c: AmenityBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
