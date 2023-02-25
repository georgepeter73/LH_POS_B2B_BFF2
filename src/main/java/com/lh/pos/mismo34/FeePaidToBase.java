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
 * <p>Java class for FeePaidToBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeePaidToBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Broker"/>
 *     &lt;enumeration value="BrokerAffiliate"/>
 *     &lt;enumeration value="Investor"/>
 *     &lt;enumeration value="Lender"/>
 *     &lt;enumeration value="LenderAffiliate"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="ThirdPartyProvider"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "FeePaidToBase")
@XmlEnum
public enum FeePaidToBase {

    @XmlEnumValue("Broker")
    BROKER("Broker"),

    /**
     * Fee is being paid to a third party provider who is an affiliate of the Mortgage Broker.
     *
     */
    @XmlEnumValue("BrokerAffiliate")
    BROKER_AFFILIATE("BrokerAffiliate"),
    @XmlEnumValue("Investor")
    INVESTOR("Investor"),
    @XmlEnumValue("Lender")
    LENDER("Lender"),

    /**
     * Fee is being paid to a third party provider who is an affiliate of the Lender or Creditor.
     *
     */
    @XmlEnumValue("LenderAffiliate")
    LENDER_AFFILIATE("LenderAffiliate"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Fee is being paid to a third party provider.
     *
     */
    @XmlEnumValue("ThirdPartyProvider")
    THIRD_PARTY_PROVIDER("ThirdPartyProvider");
    private final String value;

    FeePaidToBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeePaidToBase fromValue(String v) {
        for (FeePaidToBase c: FeePaidToBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
