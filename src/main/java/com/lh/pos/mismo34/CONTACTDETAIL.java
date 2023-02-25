//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2020.02.11 at 08:03:21 AM EST
//


package com.lh.pos.mismo34;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * Additional information about the Contact Party.
 *
 * <p>Java class for CONTACT_DETAIL complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CONTACT_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttorneyInFactIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="ContactPartyIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="SignatoryRoleType" type="{http://www.mismo.org/residential/2009/schemas}SignatoryRoleEnum" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}CONTACT_DETAIL_EXTENSION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONTACT_DETAIL", propOrder = {
    "attorneyInFactIndicator",
    "contactPartyIdentifier",
    "signatoryRoleType",
    "extension"
})
public class CONTACTDETAIL {

    @XmlElementRef(name = "AttorneyInFactIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> attorneyInFactIndicator;
    @XmlElementRef(name = "ContactPartyIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> contactPartyIdentifier;
    @XmlElementRef(name = "SignatoryRoleType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<SignatoryRoleEnum> signatoryRoleType;
    @XmlElement(name = "EXTENSION")
    protected CONTACTDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the attorneyInFactIndicator property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public JAXBElement<MISMOIndicator> getAttorneyInFactIndicator() {
        return attorneyInFactIndicator;
    }

    /**
     * Sets the value of the attorneyInFactIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public void setAttorneyInFactIndicator(JAXBElement<MISMOIndicator> value) {
        this.attorneyInFactIndicator = value;
    }

    /**
     * Gets the value of the contactPartyIdentifier property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public JAXBElement<MISMOIdentifier> getContactPartyIdentifier() {
        return contactPartyIdentifier;
    }

    /**
     * Sets the value of the contactPartyIdentifier property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public void setContactPartyIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.contactPartyIdentifier = value;
    }

    /**
     * Gets the value of the signatoryRoleType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SignatoryRoleEnum }{@code >}
     *
     */
    public JAXBElement<SignatoryRoleEnum> getSignatoryRoleType() {
        return signatoryRoleType;
    }

    /**
     * Sets the value of the signatoryRoleType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SignatoryRoleEnum }{@code >}
     *
     */
    public void setSignatoryRoleType(JAXBElement<SignatoryRoleEnum> value) {
        this.signatoryRoleType = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link CONTACTDETAILEXTENSION }
     *
     */
    public CONTACTDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link CONTACTDETAILEXTENSION }
     *
     */
    public void setEXTENSION(CONTACTDETAILEXTENSION value) {
        this.extension = value;
    }

    /**
     * Gets the value of the label property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     *
     * <p>
     * the map is keyed by the name of the attribute and
     * the value is the string value of the attribute.
     *
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     *
     *
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
