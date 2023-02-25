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
 * Information regarding the issuing authority, identification, effective date and other facts about a license.
 *
 * <p>Java class for LICENSE_DETAIL complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="LICENSE_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LicenseAuthorityLevelType" type="{http://www.mismo.org/residential/2009/schemas}LicenseAuthorityLevelEnum" minOccurs="0"/>
 *         &lt;element name="LicenseAuthorityLevelTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="LicenseExemptIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="LicenseExpirationDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="LicenseIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="LicenseIssueDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="LicenseIssuingAuthorityName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="LicenseIssuingAuthorityStateCode" type="{http://www.mismo.org/residential/2009/schemas}MISMOCode" minOccurs="0"/>
 *         &lt;element name="LicenseIssuingAuthorityStateName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}LICENSE_DETAIL_EXTENSION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LICENSE_DETAIL", propOrder = {
    "licenseAuthorityLevelType",
    "licenseAuthorityLevelTypeOtherDescription",
    "licenseExemptIndicator",
    "licenseExpirationDate",
    "licenseIdentifier",
    "licenseIssueDate",
    "licenseIssuingAuthorityName",
    "licenseIssuingAuthorityStateCode",
    "licenseIssuingAuthorityStateName",
    "extension"
})
public class LICENSEDETAIL {

    @XmlElementRef(name = "LicenseAuthorityLevelType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<LicenseAuthorityLevelEnum> licenseAuthorityLevelType;
    @XmlElementRef(name = "LicenseAuthorityLevelTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> licenseAuthorityLevelTypeOtherDescription;
    @XmlElementRef(name = "LicenseExemptIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> licenseExemptIndicator;
    @XmlElementRef(name = "LicenseExpirationDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> licenseExpirationDate;
    @XmlElementRef(name = "LicenseIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> licenseIdentifier;
    @XmlElementRef(name = "LicenseIssueDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> licenseIssueDate;
    @XmlElementRef(name = "LicenseIssuingAuthorityName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> licenseIssuingAuthorityName;
    @XmlElementRef(name = "LicenseIssuingAuthorityStateCode", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCode> licenseIssuingAuthorityStateCode;
    @XmlElementRef(name = "LicenseIssuingAuthorityStateName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> licenseIssuingAuthorityStateName;
    @XmlElement(name = "EXTENSION")
    protected LICENSEDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the licenseAuthorityLevelType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LicenseAuthorityLevelEnum }{@code >}
     *
     */
    public JAXBElement<LicenseAuthorityLevelEnum> getLicenseAuthorityLevelType() {
        return licenseAuthorityLevelType;
    }

    /**
     * Sets the value of the licenseAuthorityLevelType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LicenseAuthorityLevelEnum }{@code >}
     *
     */
    public void setLicenseAuthorityLevelType(JAXBElement<LicenseAuthorityLevelEnum> value) {
        this.licenseAuthorityLevelType = value;
    }

    /**
     * Gets the value of the licenseAuthorityLevelTypeOtherDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getLicenseAuthorityLevelTypeOtherDescription() {
        return licenseAuthorityLevelTypeOtherDescription;
    }

    /**
     * Sets the value of the licenseAuthorityLevelTypeOtherDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setLicenseAuthorityLevelTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.licenseAuthorityLevelTypeOtherDescription = value;
    }

    /**
     * Gets the value of the licenseExemptIndicator property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public JAXBElement<MISMOIndicator> getLicenseExemptIndicator() {
        return licenseExemptIndicator;
    }

    /**
     * Sets the value of the licenseExemptIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public void setLicenseExemptIndicator(JAXBElement<MISMOIndicator> value) {
        this.licenseExemptIndicator = value;
    }

    /**
     * Gets the value of the licenseExpirationDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public JAXBElement<MISMODate> getLicenseExpirationDate() {
        return licenseExpirationDate;
    }

    /**
     * Sets the value of the licenseExpirationDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public void setLicenseExpirationDate(JAXBElement<MISMODate> value) {
        this.licenseExpirationDate = value;
    }

    /**
     * Gets the value of the licenseIdentifier property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public JAXBElement<MISMOIdentifier> getLicenseIdentifier() {
        return licenseIdentifier;
    }

    /**
     * Sets the value of the licenseIdentifier property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public void setLicenseIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.licenseIdentifier = value;
    }

    /**
     * Gets the value of the licenseIssueDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public JAXBElement<MISMODate> getLicenseIssueDate() {
        return licenseIssueDate;
    }

    /**
     * Sets the value of the licenseIssueDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public void setLicenseIssueDate(JAXBElement<MISMODate> value) {
        this.licenseIssueDate = value;
    }

    /**
     * Gets the value of the licenseIssuingAuthorityName property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getLicenseIssuingAuthorityName() {
        return licenseIssuingAuthorityName;
    }

    /**
     * Sets the value of the licenseIssuingAuthorityName property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setLicenseIssuingAuthorityName(JAXBElement<MISMOString> value) {
        this.licenseIssuingAuthorityName = value;
    }

    /**
     * Gets the value of the licenseIssuingAuthorityStateCode property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *
     */
    public JAXBElement<MISMOCode> getLicenseIssuingAuthorityStateCode() {
        return licenseIssuingAuthorityStateCode;
    }

    /**
     * Sets the value of the licenseIssuingAuthorityStateCode property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *
     */
    public void setLicenseIssuingAuthorityStateCode(JAXBElement<MISMOCode> value) {
        this.licenseIssuingAuthorityStateCode = value;
    }

    /**
     * Gets the value of the licenseIssuingAuthorityStateName property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getLicenseIssuingAuthorityStateName() {
        return licenseIssuingAuthorityStateName;
    }

    /**
     * Sets the value of the licenseIssuingAuthorityStateName property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setLicenseIssuingAuthorityStateName(JAXBElement<MISMOString> value) {
        this.licenseIssuingAuthorityStateName = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link LICENSEDETAILEXTENSION }
     *
     */
    public LICENSEDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link LICENSEDETAILEXTENSION }
     *
     */
    public void setEXTENSION(LICENSEDETAILEXTENSION value) {
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
