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
 * Additional information about the selected service provider.
 *
 * <p>Java class for SELECTED_SERVICE_PROVIDER_DETAIL complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SELECTED_SERVICE_PROVIDER_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SelectedServiceProviderNatureOfRelationshipDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="SelectedServiceProviderOwnershipInterestPercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}SELECTED_SERVICE_PROVIDER_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "SELECTED_SERVICE_PROVIDER_DETAIL", propOrder = {
    "selectedServiceProviderNatureOfRelationshipDescription",
    "selectedServiceProviderOwnershipInterestPercent",
    "extension"
})
public class SELECTEDSERVICEPROVIDERDETAIL {

    @XmlElementRef(name = "SelectedServiceProviderNatureOfRelationshipDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> selectedServiceProviderNatureOfRelationshipDescription;
    @XmlElementRef(name = "SelectedServiceProviderOwnershipInterestPercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> selectedServiceProviderOwnershipInterestPercent;
    @XmlElement(name = "EXTENSION")
    protected SELECTEDSERVICEPROVIDERDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the selectedServiceProviderNatureOfRelationshipDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getSelectedServiceProviderNatureOfRelationshipDescription() {
        return selectedServiceProviderNatureOfRelationshipDescription;
    }

    /**
     * Sets the value of the selectedServiceProviderNatureOfRelationshipDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setSelectedServiceProviderNatureOfRelationshipDescription(JAXBElement<MISMOString> value) {
        this.selectedServiceProviderNatureOfRelationshipDescription = value;
    }

    /**
     * Gets the value of the selectedServiceProviderOwnershipInterestPercent property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *
     */
    public JAXBElement<MISMOPercent> getSelectedServiceProviderOwnershipInterestPercent() {
        return selectedServiceProviderOwnershipInterestPercent;
    }

    /**
     * Sets the value of the selectedServiceProviderOwnershipInterestPercent property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *
     */
    public void setSelectedServiceProviderOwnershipInterestPercent(JAXBElement<MISMOPercent> value) {
        this.selectedServiceProviderOwnershipInterestPercent = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link SELECTEDSERVICEPROVIDERDETAILEXTENSION }
     *
     */
    public SELECTEDSERVICEPROVIDERDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link SELECTEDSERVICEPROVIDERDETAILEXTENSION }
     *
     */
    public void setEXTENSION(SELECTEDSERVICEPROVIDERDETAILEXTENSION value) {
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
