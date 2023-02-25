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
 * <p>Java class for IndoorAirQualityMitigationBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IndoorAirQualityMitigationBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="EnergyRecoveryVentilatorUnit"/>
 *     &lt;enumeration value="IndoorAirPLUS"/>
 *     &lt;enumeration value="NonToxicPestControl"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "IndoorAirQualityMitigationBase")
@XmlEnum
public enum IndoorAirQualityMitigationBase {


    /**
     * An energy recovery ventilator employs the process of exchanging the energy contained in normally exhausted building or space air and using it to treat (precondition) the incoming outdoor ventilation air in residential and commercial HVAC systems. During the warmer seasons, the system pre-cools and dehumidifies while humidifying and pre-heating in the cooler seasons.
     *
     */
    @XmlEnumValue("EnergyRecoveryVentilatorUnit")
    ENERGY_RECOVERY_VENTILATOR_UNIT("EnergyRecoveryVentilatorUnit"),

    /**
     * To earn the Indoor airPLUS label, the builder then adds additional home design and construction features to help protect qualified homes from moisture and mold, pests, combustion gases, and other airborne pollutants. Before the home officially earns the Indoor airPLUS label, it is inspected by an independent third-party to ensure compliance with EPA’s rigorous guidelines and specifications.
     *
     */
    @XmlEnumValue("IndoorAirPLUS")
    INDOOR_AIR_PLUS("IndoorAirPLUS"),

    /**
     * Environmentally safe and friendly chemicals and approaches used in indoor and outdoor pest control.
     *
     */
    @XmlEnumValue("NonToxicPestControl")
    NON_TOXIC_PEST_CONTROL("NonToxicPestControl"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    IndoorAirQualityMitigationBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IndoorAirQualityMitigationBase fromValue(String v) {
        for (IndoorAirQualityMitigationBase c: IndoorAirQualityMitigationBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}