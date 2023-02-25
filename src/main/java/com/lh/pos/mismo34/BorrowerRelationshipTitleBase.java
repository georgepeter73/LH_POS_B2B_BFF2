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
 * <p>Java class for BorrowerRelationshipTitleBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BorrowerRelationshipTitleBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AHusbandAndWife"/>
 *     &lt;enumeration value="AMarriedCouple"/>
 *     &lt;enumeration value="AMarriedMan"/>
 *     &lt;enumeration value="AMarriedPerson"/>
 *     &lt;enumeration value="AMarriedWoman"/>
 *     &lt;enumeration value="AnUnmarriedMan"/>
 *     &lt;enumeration value="AnUnmarriedPerson"/>
 *     &lt;enumeration value="AnUnmarriedWoman"/>
 *     &lt;enumeration value="ASameSexMarriedCouple"/>
 *     &lt;enumeration value="AsDomesticPartners"/>
 *     &lt;enumeration value="ASingleMan"/>
 *     &lt;enumeration value="ASinglePerson"/>
 *     &lt;enumeration value="ASingleWoman"/>
 *     &lt;enumeration value="AWidow"/>
 *     &lt;enumeration value="AWidower"/>
 *     &lt;enumeration value="AWifeAndHusband"/>
 *     &lt;enumeration value="HerHusband"/>
 *     &lt;enumeration value="HisWife"/>
 *     &lt;enumeration value="JoinedInACivilUnion"/>
 *     &lt;enumeration value="JoinedInACommonLawMarriage"/>
 *     &lt;enumeration value="NotApplicable"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "BorrowerRelationshipTitleBase")
@XmlEnum
public enum BorrowerRelationshipTitleBase {

    @XmlEnumValue("AHusbandAndWife")
    A_HUSBAND_AND_WIFE("AHusbandAndWife"),

    /**
     * A couple legally joined by marriage.
     *
     */
    @XmlEnumValue("AMarriedCouple")
    A_MARRIED_COUPLE("AMarriedCouple"),
    @XmlEnumValue("AMarriedMan")
    A_MARRIED_MAN("AMarriedMan"),
    @XmlEnumValue("AMarriedPerson")
    A_MARRIED_PERSON("AMarriedPerson"),
    @XmlEnumValue("AMarriedWoman")
    A_MARRIED_WOMAN("AMarriedWoman"),
    @XmlEnumValue("AnUnmarriedMan")
    AN_UNMARRIED_MAN("AnUnmarriedMan"),
    @XmlEnumValue("AnUnmarriedPerson")
    AN_UNMARRIED_PERSON("AnUnmarriedPerson"),
    @XmlEnumValue("AnUnmarriedWoman")
    AN_UNMARRIED_WOMAN("AnUnmarriedWoman"),

    /**
     * A couple legally joined by marriage or civil union in which both people are of the same gender.
     *
     */
    @XmlEnumValue("ASameSexMarriedCouple")
    A_SAME_SEX_MARRIED_COUPLE("ASameSexMarriedCouple"),

    /**
     * A legal or interpersonal relationship between two individuals who live together and share a common domestic life but are neither joined by marriage nor a civil union.
     *
     */
    @XmlEnumValue("AsDomesticPartners")
    AS_DOMESTIC_PARTNERS("AsDomesticPartners"),
    @XmlEnumValue("ASingleMan")
    A_SINGLE_MAN("ASingleMan"),
    @XmlEnumValue("ASinglePerson")
    A_SINGLE_PERSON("ASinglePerson"),
    @XmlEnumValue("ASingleWoman")
    A_SINGLE_WOMAN("ASingleWoman"),
    @XmlEnumValue("AWidow")
    A_WIDOW("AWidow"),
    @XmlEnumValue("AWidower")
    A_WIDOWER("AWidower"),
    @XmlEnumValue("AWifeAndHusband")
    A_WIFE_AND_HUSBAND("AWifeAndHusband"),
    @XmlEnumValue("HerHusband")
    HER_HUSBAND("HerHusband"),
    @XmlEnumValue("HisWife")
    HIS_WIFE("HisWife"),

    /**
     * A couple legally joined by civil union.
     *
     */
    @XmlEnumValue("JoinedInACivilUnion")
    JOINED_IN_A_CIVIL_UNION("JoinedInACivilUnion"),

    /**
     * A couple legally joined by a common law marriage.
     *
     */
    @XmlEnumValue("JoinedInACommonLawMarriage")
    JOINED_IN_A_COMMON_LAW_MARRIAGE("JoinedInACommonLawMarriage"),
    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    BorrowerRelationshipTitleBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BorrowerRelationshipTitleBase fromValue(String v) {
        for (BorrowerRelationshipTitleBase c: BorrowerRelationshipTitleBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
