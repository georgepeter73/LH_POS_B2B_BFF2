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
 * Describes the order and manner in which partial payments are applied for the loan.
 *
 * <p>Java class for PARTIAL_PAYMENT complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PARTIAL_PAYMENT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartialPaymentApplicationItemType" type="{http://www.mismo.org/residential/2009/schemas}PartialPaymentApplicationItemEnum" minOccurs="0"/>
 *         &lt;element name="PartialPaymentApplicationMethodType" type="{http://www.mismo.org/residential/2009/schemas}PartialPaymentApplicationMethodEnum" minOccurs="0"/>
 *         &lt;element name="PartialPaymentApplicationMethodTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="PartialPaymentApplicationOrderType" type="{http://www.mismo.org/residential/2009/schemas}PartialPaymentApplicationOrderEnum" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}PARTIAL_PAYMENT_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "PARTIAL_PAYMENT", propOrder = {
    "partialPaymentApplicationItemType",
    "partialPaymentApplicationMethodType",
    "partialPaymentApplicationMethodTypeOtherDescription",
    "partialPaymentApplicationOrderType",
    "extension"
})
public class PARTIALPAYMENT {

    @XmlElementRef(name = "PartialPaymentApplicationItemType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<PartialPaymentApplicationItemEnum> partialPaymentApplicationItemType;
    @XmlElementRef(name = "PartialPaymentApplicationMethodType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<PartialPaymentApplicationMethodEnum> partialPaymentApplicationMethodType;
    @XmlElementRef(name = "PartialPaymentApplicationMethodTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> partialPaymentApplicationMethodTypeOtherDescription;
    @XmlElementRef(name = "PartialPaymentApplicationOrderType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<PartialPaymentApplicationOrderEnum> partialPaymentApplicationOrderType;
    @XmlElement(name = "EXTENSION")
    protected PARTIALPAYMENTEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the partialPaymentApplicationItemType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PartialPaymentApplicationItemEnum }{@code >}
     *
     */
    public JAXBElement<PartialPaymentApplicationItemEnum> getPartialPaymentApplicationItemType() {
        return partialPaymentApplicationItemType;
    }

    /**
     * Sets the value of the partialPaymentApplicationItemType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PartialPaymentApplicationItemEnum }{@code >}
     *
     */
    public void setPartialPaymentApplicationItemType(JAXBElement<PartialPaymentApplicationItemEnum> value) {
        this.partialPaymentApplicationItemType = value;
    }

    /**
     * Gets the value of the partialPaymentApplicationMethodType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PartialPaymentApplicationMethodEnum }{@code >}
     *
     */
    public JAXBElement<PartialPaymentApplicationMethodEnum> getPartialPaymentApplicationMethodType() {
        return partialPaymentApplicationMethodType;
    }

    /**
     * Sets the value of the partialPaymentApplicationMethodType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PartialPaymentApplicationMethodEnum }{@code >}
     *
     */
    public void setPartialPaymentApplicationMethodType(JAXBElement<PartialPaymentApplicationMethodEnum> value) {
        this.partialPaymentApplicationMethodType = value;
    }

    /**
     * Gets the value of the partialPaymentApplicationMethodTypeOtherDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getPartialPaymentApplicationMethodTypeOtherDescription() {
        return partialPaymentApplicationMethodTypeOtherDescription;
    }

    /**
     * Sets the value of the partialPaymentApplicationMethodTypeOtherDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setPartialPaymentApplicationMethodTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.partialPaymentApplicationMethodTypeOtherDescription = value;
    }

    /**
     * Gets the value of the partialPaymentApplicationOrderType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PartialPaymentApplicationOrderEnum }{@code >}
     *
     */
    public JAXBElement<PartialPaymentApplicationOrderEnum> getPartialPaymentApplicationOrderType() {
        return partialPaymentApplicationOrderType;
    }

    /**
     * Sets the value of the partialPaymentApplicationOrderType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PartialPaymentApplicationOrderEnum }{@code >}
     *
     */
    public void setPartialPaymentApplicationOrderType(JAXBElement<PartialPaymentApplicationOrderEnum> value) {
        this.partialPaymentApplicationOrderType = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link PARTIALPAYMENTEXTENSION }
     *
     */
    public PARTIALPAYMENTEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link PARTIALPAYMENTEXTENSION }
     *
     */
    public void setEXTENSION(PARTIALPAYMENTEXTENSION value) {
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