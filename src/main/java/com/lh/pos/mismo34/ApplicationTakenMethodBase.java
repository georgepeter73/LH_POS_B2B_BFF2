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
 * <p>Java class for ApplicationTakenMethodBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ApplicationTakenMethodBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Email"/>
 *     &lt;enumeration value="FaceToFace"/>
 *     &lt;enumeration value="Fax"/>
 *     &lt;enumeration value="Internet"/>
 *     &lt;enumeration value="Mail"/>
 *     &lt;enumeration value="Telephone"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "ApplicationTakenMethodBase")
@XmlEnum
public enum ApplicationTakenMethodBase {


    /**
     * Application taken via e-mail.
     *
     */
    @XmlEnumValue("Email")
    EMAIL("Email"),

    /**
     * Application was taken in a face to face interview.
     *
     */
    @XmlEnumValue("FaceToFace")
    FACE_TO_FACE("FaceToFace"),

    /**
     * Application taken via telephonic transmission
     *
     */
    @XmlEnumValue("Fax")
    FAX("Fax"),

    /**
     * Application taken via the internet.
     *
     */
    @XmlEnumValue("Internet")
    INTERNET("Internet"),

    /**
     * Application was taken by mail
     *
     */
    @XmlEnumValue("Mail")
    MAIL("Mail"),

    /**
     * Application was taken over the telephone.
     *
     */
    @XmlEnumValue("Telephone")
    TELEPHONE("Telephone");
    private final String value;

    ApplicationTakenMethodBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApplicationTakenMethodBase fromValue(String v) {
        for (ApplicationTakenMethodBase c: ApplicationTakenMethodBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
