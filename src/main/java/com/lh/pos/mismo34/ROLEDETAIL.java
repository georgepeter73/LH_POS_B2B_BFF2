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
 * <p>Java class for ROLE_DETAIL complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ROLE_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConsentToReceiveDocumentsElectronicallyIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="ConsentToSignUsingElectronicSignatureIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="PartyRoleType" type="{http://www.mismo.org/residential/2009/schemas}PartyRoleEnum" minOccurs="0"/>
 *         &lt;element name="PartyRoleTypeAdditionalDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="PartyRoleTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}ROLE_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "ROLE_DETAIL", propOrder = {
    "consentToReceiveDocumentsElectronicallyIndicator",
    "consentToSignUsingElectronicSignatureIndicator",
    "partyRoleType",
    "partyRoleTypeAdditionalDescription",
    "partyRoleTypeOtherDescription",
    "extension"
})
public class ROLEDETAIL {

    @XmlElementRef(name = "ConsentToReceiveDocumentsElectronicallyIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> consentToReceiveDocumentsElectronicallyIndicator;
    @XmlElementRef(name = "ConsentToSignUsingElectronicSignatureIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> consentToSignUsingElectronicSignatureIndicator;
    @XmlElementRef(name = "PartyRoleType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<PartyRoleEnum> partyRoleType;
    @XmlElementRef(name = "PartyRoleTypeAdditionalDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> partyRoleTypeAdditionalDescription;
    @XmlElementRef(name = "PartyRoleTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> partyRoleTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected ROLEDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the consentToReceiveDocumentsElectronicallyIndicator property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public JAXBElement<MISMOIndicator> getConsentToReceiveDocumentsElectronicallyIndicator() {
        return consentToReceiveDocumentsElectronicallyIndicator;
    }

    /**
     * Sets the value of the consentToReceiveDocumentsElectronicallyIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public void setConsentToReceiveDocumentsElectronicallyIndicator(JAXBElement<MISMOIndicator> value) {
        this.consentToReceiveDocumentsElectronicallyIndicator = value;
    }

    /**
     * Gets the value of the consentToSignUsingElectronicSignatureIndicator property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public JAXBElement<MISMOIndicator> getConsentToSignUsingElectronicSignatureIndicator() {
        return consentToSignUsingElectronicSignatureIndicator;
    }

    /**
     * Sets the value of the consentToSignUsingElectronicSignatureIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public void setConsentToSignUsingElectronicSignatureIndicator(JAXBElement<MISMOIndicator> value) {
        this.consentToSignUsingElectronicSignatureIndicator = value;
    }

    /**
     * Gets the value of the partyRoleType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PartyRoleEnum }{@code >}
     *
     */
    public JAXBElement<PartyRoleEnum> getPartyRoleType() {
        return partyRoleType;
    }

    /**
     * Sets the value of the partyRoleType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PartyRoleEnum }{@code >}
     *
     */
    public void setPartyRoleType(JAXBElement<PartyRoleEnum> value) {
        this.partyRoleType = value;
    }

    /**
     * Gets the value of the partyRoleTypeAdditionalDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getPartyRoleTypeAdditionalDescription() {
        return partyRoleTypeAdditionalDescription;
    }

    /**
     * Sets the value of the partyRoleTypeAdditionalDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setPartyRoleTypeAdditionalDescription(JAXBElement<MISMOString> value) {
        this.partyRoleTypeAdditionalDescription = value;
    }

    /**
     * Gets the value of the partyRoleTypeOtherDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getPartyRoleTypeOtherDescription() {
        return partyRoleTypeOtherDescription;
    }

    /**
     * Sets the value of the partyRoleTypeOtherDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setPartyRoleTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.partyRoleTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link ROLEDETAILEXTENSION }
     *
     */
    public ROLEDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link ROLEDETAILEXTENSION }
     *
     */
    public void setEXTENSION(ROLEDETAILEXTENSION value) {
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
