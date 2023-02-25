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
 * The STAKEHOLDER_SIGNATURE_DETAIL element contains the general properties that describe a signature field.
 *
 * <p>Java class for STAKEHOLDER_SIGNATURE_FIELD_DETAIL complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="STAKEHOLDER_SIGNATURE_FIELD_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MutuallyExclusiveSignatureGroupName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="SignatureFieldMarkType" type="{http://www.mismo.org/residential/2009/schemas}SignatureFieldMarkEnum" minOccurs="0"/>
 *         &lt;element name="SignatureFieldRequiredIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="SignatureType" type="{http://www.mismo.org/residential/2009/schemas}SignatureEnum" minOccurs="0"/>
 *         &lt;element name="SignatureTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}STAKEHOLDER_SIGNATURE_FIELD_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "STAKEHOLDER_SIGNATURE_FIELD_DETAIL", propOrder = {
    "mutuallyExclusiveSignatureGroupName",
    "signatureFieldMarkType",
    "signatureFieldRequiredIndicator",
    "signatureType",
    "signatureTypeOtherDescription",
    "extension"
})
public class STAKEHOLDERSIGNATUREFIELDDETAIL {

    @XmlElementRef(name = "MutuallyExclusiveSignatureGroupName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> mutuallyExclusiveSignatureGroupName;
    @XmlElementRef(name = "SignatureFieldMarkType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<SignatureFieldMarkEnum> signatureFieldMarkType;
    @XmlElementRef(name = "SignatureFieldRequiredIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> signatureFieldRequiredIndicator;
    @XmlElementRef(name = "SignatureType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<SignatureEnum> signatureType;
    @XmlElementRef(name = "SignatureTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> signatureTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected STAKEHOLDERSIGNATUREFIELDDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the mutuallyExclusiveSignatureGroupName property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getMutuallyExclusiveSignatureGroupName() {
        return mutuallyExclusiveSignatureGroupName;
    }

    /**
     * Sets the value of the mutuallyExclusiveSignatureGroupName property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setMutuallyExclusiveSignatureGroupName(JAXBElement<MISMOString> value) {
        this.mutuallyExclusiveSignatureGroupName = value;
    }

    /**
     * Gets the value of the signatureFieldMarkType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SignatureFieldMarkEnum }{@code >}
     *
     */
    public JAXBElement<SignatureFieldMarkEnum> getSignatureFieldMarkType() {
        return signatureFieldMarkType;
    }

    /**
     * Sets the value of the signatureFieldMarkType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SignatureFieldMarkEnum }{@code >}
     *
     */
    public void setSignatureFieldMarkType(JAXBElement<SignatureFieldMarkEnum> value) {
        this.signatureFieldMarkType = value;
    }

    /**
     * Gets the value of the signatureFieldRequiredIndicator property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public JAXBElement<MISMOIndicator> getSignatureFieldRequiredIndicator() {
        return signatureFieldRequiredIndicator;
    }

    /**
     * Sets the value of the signatureFieldRequiredIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public void setSignatureFieldRequiredIndicator(JAXBElement<MISMOIndicator> value) {
        this.signatureFieldRequiredIndicator = value;
    }

    /**
     * Gets the value of the signatureType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SignatureEnum }{@code >}
     *
     */
    public JAXBElement<SignatureEnum> getSignatureType() {
        return signatureType;
    }

    /**
     * Sets the value of the signatureType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SignatureEnum }{@code >}
     *
     */
    public void setSignatureType(JAXBElement<SignatureEnum> value) {
        this.signatureType = value;
    }

    /**
     * Gets the value of the signatureTypeOtherDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getSignatureTypeOtherDescription() {
        return signatureTypeOtherDescription;
    }

    /**
     * Sets the value of the signatureTypeOtherDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setSignatureTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.signatureTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link STAKEHOLDERSIGNATUREFIELDDETAILEXTENSION }
     *
     */
    public STAKEHOLDERSIGNATUREFIELDDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link STAKEHOLDERSIGNATUREFIELDDETAILEXTENSION }
     *
     */
    public void setEXTENSION(STAKEHOLDERSIGNATUREFIELDDETAILEXTENSION value) {
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