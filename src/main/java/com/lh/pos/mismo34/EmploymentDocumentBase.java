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
 * <p>Java class for EmploymentDocumentBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmploymentDocumentBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="ThirdPartyEmploymentStatement"/>
 *     &lt;enumeration value="VerbalStatement"/>
 *     &lt;enumeration value="VerificationOfEmployment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "EmploymentDocumentBase")
@XmlEnum
public enum EmploymentDocumentBase {

    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Used when a third party employment verification vendor provides verification of employment.
     *
     */
    @XmlEnumValue("ThirdPartyEmploymentStatement")
    THIRD_PARTY_EMPLOYMENT_STATEMENT("ThirdPartyEmploymentStatement"),

    /**
     * When verbal verification is allowed. This may be a written statement by the lender that information was collected verbally. Might include the name of the person making the contact, the name of the entity contacted, the name and title of the individual at the entity who provided the information, date of the contact and information that was collected.
     *
     */
    @XmlEnumValue("VerbalStatement")
    VERBAL_STATEMENT("VerbalStatement"),

    /**
     * Used to verify employment with a specific employer.
     *
     */
    @XmlEnumValue("VerificationOfEmployment")
    VERIFICATION_OF_EMPLOYMENT("VerificationOfEmployment");
    private final String value;

    EmploymentDocumentBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmploymentDocumentBase fromValue(String v) {
        for (EmploymentDocumentBase c: EmploymentDocumentBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}