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
 * Information regarding the action type, status and details specific to securing and protecting a property in loss mitigation, default, real estate owned, etc.
 *
 * <p>Java class for PROPERTY_PRESERVATION complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PROPERTY_PRESERVATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PropertyPreservationActionCompletionDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="PropertyPreservationActionType" type="{http://www.mismo.org/residential/2009/schemas}PropertyPreservationActionEnum" minOccurs="0"/>
 *         &lt;element name="PropertyPreservationActionTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="PropertyPreservationStatusDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="PropertyPreservationStatusType" type="{http://www.mismo.org/residential/2009/schemas}PropertyPreservationStatusEnum" minOccurs="0"/>
 *         &lt;element name="PropertyPreservationStatusTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}PROPERTY_PRESERVATION_EXTENSION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
 *       &lt;attribute name="SequenceNumber" type="{http://www.mismo.org/residential/2009/schemas}MISMOSequenceNumber_Base" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PROPERTY_PRESERVATION", propOrder = {
    "propertyPreservationActionCompletionDate",
    "propertyPreservationActionType",
    "propertyPreservationActionTypeOtherDescription",
    "propertyPreservationStatusDate",
    "propertyPreservationStatusType",
    "propertyPreservationStatusTypeOtherDescription",
    "extension"
})
public class PROPERTYPRESERVATION {

    @XmlElementRef(name = "PropertyPreservationActionCompletionDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> propertyPreservationActionCompletionDate;
    @XmlElementRef(name = "PropertyPreservationActionType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<PropertyPreservationActionEnum> propertyPreservationActionType;
    @XmlElementRef(name = "PropertyPreservationActionTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> propertyPreservationActionTypeOtherDescription;
    @XmlElementRef(name = "PropertyPreservationStatusDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> propertyPreservationStatusDate;
    @XmlElementRef(name = "PropertyPreservationStatusType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<PropertyPreservationStatusEnum> propertyPreservationStatusType;
    @XmlElementRef(name = "PropertyPreservationStatusTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> propertyPreservationStatusTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected PROPERTYPRESERVATIONEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the propertyPreservationActionCompletionDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public JAXBElement<MISMODate> getPropertyPreservationActionCompletionDate() {
        return propertyPreservationActionCompletionDate;
    }

    /**
     * Sets the value of the propertyPreservationActionCompletionDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public void setPropertyPreservationActionCompletionDate(JAXBElement<MISMODate> value) {
        this.propertyPreservationActionCompletionDate = value;
    }

    /**
     * Gets the value of the propertyPreservationActionType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropertyPreservationActionEnum }{@code >}
     *
     */
    public JAXBElement<PropertyPreservationActionEnum> getPropertyPreservationActionType() {
        return propertyPreservationActionType;
    }

    /**
     * Sets the value of the propertyPreservationActionType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropertyPreservationActionEnum }{@code >}
     *
     */
    public void setPropertyPreservationActionType(JAXBElement<PropertyPreservationActionEnum> value) {
        this.propertyPreservationActionType = value;
    }

    /**
     * Gets the value of the propertyPreservationActionTypeOtherDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getPropertyPreservationActionTypeOtherDescription() {
        return propertyPreservationActionTypeOtherDescription;
    }

    /**
     * Sets the value of the propertyPreservationActionTypeOtherDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setPropertyPreservationActionTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.propertyPreservationActionTypeOtherDescription = value;
    }

    /**
     * Gets the value of the propertyPreservationStatusDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public JAXBElement<MISMODate> getPropertyPreservationStatusDate() {
        return propertyPreservationStatusDate;
    }

    /**
     * Sets the value of the propertyPreservationStatusDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public void setPropertyPreservationStatusDate(JAXBElement<MISMODate> value) {
        this.propertyPreservationStatusDate = value;
    }

    /**
     * Gets the value of the propertyPreservationStatusType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropertyPreservationStatusEnum }{@code >}
     *
     */
    public JAXBElement<PropertyPreservationStatusEnum> getPropertyPreservationStatusType() {
        return propertyPreservationStatusType;
    }

    /**
     * Sets the value of the propertyPreservationStatusType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropertyPreservationStatusEnum }{@code >}
     *
     */
    public void setPropertyPreservationStatusType(JAXBElement<PropertyPreservationStatusEnum> value) {
        this.propertyPreservationStatusType = value;
    }

    /**
     * Gets the value of the propertyPreservationStatusTypeOtherDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getPropertyPreservationStatusTypeOtherDescription() {
        return propertyPreservationStatusTypeOtherDescription;
    }

    /**
     * Sets the value of the propertyPreservationStatusTypeOtherDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setPropertyPreservationStatusTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.propertyPreservationStatusTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link PROPERTYPRESERVATIONEXTENSION }
     *
     */
    public PROPERTYPRESERVATIONEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link PROPERTYPRESERVATIONEXTENSION }
     *
     */
    public void setEXTENSION(PROPERTYPRESERVATIONEXTENSION value) {
        this.extension = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setSequenceNumber(Integer value) {
        this.sequenceNumber = value;
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
