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
 * The action that is requested to be performed (i.e. record document, recording instructions, inquiries, etc.)
 *
 * <p>Java class for PRIA_REQUEST_DETAIL complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PRIA_REQUEST_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PRIARecordingJurisdictionIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="PRIARequestNoteText" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="PRIARequestRelatedDocumentsIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="PRIARequestType" type="{http://www.mismo.org/residential/2009/schemas}PRIARequestEnum" minOccurs="0"/>
 *         &lt;element name="PRIARequestTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}PRIA_REQUEST_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "PRIA_REQUEST_DETAIL", propOrder = {
    "priaRecordingJurisdictionIdentifier",
    "priaRequestNoteText",
    "priaRequestRelatedDocumentsIndicator",
    "priaRequestType",
    "priaRequestTypeOtherDescription",
    "extension"
})
public class PRIAREQUESTDETAIL {

    @XmlElementRef(name = "PRIARecordingJurisdictionIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> priaRecordingJurisdictionIdentifier;
    @XmlElementRef(name = "PRIARequestNoteText", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> priaRequestNoteText;
    @XmlElementRef(name = "PRIARequestRelatedDocumentsIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> priaRequestRelatedDocumentsIndicator;
    @XmlElementRef(name = "PRIARequestType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<PRIARequestEnum> priaRequestType;
    @XmlElementRef(name = "PRIARequestTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> priaRequestTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected PRIAREQUESTDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the priaRecordingJurisdictionIdentifier property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public JAXBElement<MISMOIdentifier> getPRIARecordingJurisdictionIdentifier() {
        return priaRecordingJurisdictionIdentifier;
    }

    /**
     * Sets the value of the priaRecordingJurisdictionIdentifier property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public void setPRIARecordingJurisdictionIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.priaRecordingJurisdictionIdentifier = value;
    }

    /**
     * Gets the value of the priaRequestNoteText property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getPRIARequestNoteText() {
        return priaRequestNoteText;
    }

    /**
     * Sets the value of the priaRequestNoteText property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setPRIARequestNoteText(JAXBElement<MISMOString> value) {
        this.priaRequestNoteText = value;
    }

    /**
     * Gets the value of the priaRequestRelatedDocumentsIndicator property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public JAXBElement<MISMOIndicator> getPRIARequestRelatedDocumentsIndicator() {
        return priaRequestRelatedDocumentsIndicator;
    }

    /**
     * Sets the value of the priaRequestRelatedDocumentsIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public void setPRIARequestRelatedDocumentsIndicator(JAXBElement<MISMOIndicator> value) {
        this.priaRequestRelatedDocumentsIndicator = value;
    }

    /**
     * Gets the value of the priaRequestType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PRIARequestEnum }{@code >}
     *
     */
    public JAXBElement<PRIARequestEnum> getPRIARequestType() {
        return priaRequestType;
    }

    /**
     * Sets the value of the priaRequestType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PRIARequestEnum }{@code >}
     *
     */
    public void setPRIARequestType(JAXBElement<PRIARequestEnum> value) {
        this.priaRequestType = value;
    }

    /**
     * Gets the value of the priaRequestTypeOtherDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getPRIARequestTypeOtherDescription() {
        return priaRequestTypeOtherDescription;
    }

    /**
     * Sets the value of the priaRequestTypeOtherDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setPRIARequestTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.priaRequestTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link PRIAREQUESTDETAILEXTENSION }
     *
     */
    public PRIAREQUESTDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link PRIAREQUESTDETAILEXTENSION }
     *
     */
    public void setEXTENSION(PRIAREQUESTDETAILEXTENSION value) {
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
