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
 * <p>Java class for IssueBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IssueBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AdditionalErrorIdentified"/>
 *     &lt;enumeration value="AssertionOfDissatisfaction"/>
 *     &lt;enumeration value="AssertionOfError"/>
 *     &lt;enumeration value="InformationRequest"/>
 *     &lt;enumeration value="MaintenanceRequest"/>
 *     &lt;enumeration value="Notification"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "IssueBase")
@XmlEnum
public enum IssueBase {


    /**
     * A new issue discovered during the investigation of an event.
     *
     */
    @XmlEnumValue("AdditionalErrorIdentified")
    ADDITIONAL_ERROR_IDENTIFIED("AdditionalErrorIdentified"),

    /**
     * An assertion that expresses dissatisfaction with an entity or transaction.
     *
     */
    @XmlEnumValue("AssertionOfDissatisfaction")
    ASSERTION_OF_DISSATISFACTION("AssertionOfDissatisfaction"),

    /**
     * An assertion that an entity has made an error during the course of origination or servicing of a loan.
     *
     */
    @XmlEnumValue("AssertionOfError")
    ASSERTION_OF_ERROR("AssertionOfError"),

    /**
     * A request for information in regard to the origination or servicing of a loan.
     *
     */
    @XmlEnumValue("InformationRequest")
    INFORMATION_REQUEST("InformationRequest"),

    /**
     * A request to make a change to the loan or account system of record.
     *
     */
    @XmlEnumValue("MaintenanceRequest")
    MAINTENANCE_REQUEST("MaintenanceRequest"),

    /**
     * A notice provided to an interested party of an actual or pending action.
     *
     */
    @XmlEnumValue("Notification")
    NOTIFICATION("Notification"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    IssueBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IssueBase fromValue(String v) {
        for (IssueBase c: IssueBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
