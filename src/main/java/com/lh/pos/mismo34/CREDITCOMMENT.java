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
 * <p>Java class for CREDIT_COMMENT complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CREDIT_COMMENT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditCommentCode" type="{http://www.mismo.org/residential/2009/schemas}MISMOCode" minOccurs="0"/>
 *         &lt;element name="CreditCommentCodeSourceType" type="{http://www.mismo.org/residential/2009/schemas}CreditCommentCodeSourceEnum" minOccurs="0"/>
 *         &lt;element name="CreditCommentCodeSourceTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="CreditCommentReportedDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="CreditCommentSourceType" type="{http://www.mismo.org/residential/2009/schemas}CreditCommentSourceEnum" minOccurs="0"/>
 *         &lt;element name="CreditCommentText" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="CreditCommentType" type="{http://www.mismo.org/residential/2009/schemas}CreditCommentEnum" minOccurs="0"/>
 *         &lt;element name="CreditCommentTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}CREDIT_COMMENT_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "CREDIT_COMMENT", propOrder = {
    "creditCommentCode",
    "creditCommentCodeSourceType",
    "creditCommentCodeSourceTypeOtherDescription",
    "creditCommentReportedDate",
    "creditCommentSourceType",
    "creditCommentText",
    "creditCommentType",
    "creditCommentTypeOtherDescription",
    "extension"
})
public class CREDITCOMMENT {

    @XmlElementRef(name = "CreditCommentCode", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCode> creditCommentCode;
    @XmlElementRef(name = "CreditCommentCodeSourceType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CreditCommentCodeSourceEnum> creditCommentCodeSourceType;
    @XmlElementRef(name = "CreditCommentCodeSourceTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> creditCommentCodeSourceTypeOtherDescription;
    @XmlElementRef(name = "CreditCommentReportedDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> creditCommentReportedDate;
    @XmlElementRef(name = "CreditCommentSourceType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CreditCommentSourceEnum> creditCommentSourceType;
    @XmlElementRef(name = "CreditCommentText", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> creditCommentText;
    @XmlElementRef(name = "CreditCommentType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CreditCommentEnum> creditCommentType;
    @XmlElementRef(name = "CreditCommentTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> creditCommentTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected CREDITCOMMENTEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the creditCommentCode property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *
     */
    public JAXBElement<MISMOCode> getCreditCommentCode() {
        return creditCommentCode;
    }

    /**
     * Sets the value of the creditCommentCode property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *
     */
    public void setCreditCommentCode(JAXBElement<MISMOCode> value) {
        this.creditCommentCode = value;
    }

    /**
     * Gets the value of the creditCommentCodeSourceType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditCommentCodeSourceEnum }{@code >}
     *
     */
    public JAXBElement<CreditCommentCodeSourceEnum> getCreditCommentCodeSourceType() {
        return creditCommentCodeSourceType;
    }

    /**
     * Sets the value of the creditCommentCodeSourceType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditCommentCodeSourceEnum }{@code >}
     *
     */
    public void setCreditCommentCodeSourceType(JAXBElement<CreditCommentCodeSourceEnum> value) {
        this.creditCommentCodeSourceType = value;
    }

    /**
     * Gets the value of the creditCommentCodeSourceTypeOtherDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getCreditCommentCodeSourceTypeOtherDescription() {
        return creditCommentCodeSourceTypeOtherDescription;
    }

    /**
     * Sets the value of the creditCommentCodeSourceTypeOtherDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setCreditCommentCodeSourceTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.creditCommentCodeSourceTypeOtherDescription = value;
    }

    /**
     * Gets the value of the creditCommentReportedDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public JAXBElement<MISMODate> getCreditCommentReportedDate() {
        return creditCommentReportedDate;
    }

    /**
     * Sets the value of the creditCommentReportedDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public void setCreditCommentReportedDate(JAXBElement<MISMODate> value) {
        this.creditCommentReportedDate = value;
    }

    /**
     * Gets the value of the creditCommentSourceType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditCommentSourceEnum }{@code >}
     *
     */
    public JAXBElement<CreditCommentSourceEnum> getCreditCommentSourceType() {
        return creditCommentSourceType;
    }

    /**
     * Sets the value of the creditCommentSourceType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditCommentSourceEnum }{@code >}
     *
     */
    public void setCreditCommentSourceType(JAXBElement<CreditCommentSourceEnum> value) {
        this.creditCommentSourceType = value;
    }

    /**
     * Gets the value of the creditCommentText property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getCreditCommentText() {
        return creditCommentText;
    }

    /**
     * Sets the value of the creditCommentText property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setCreditCommentText(JAXBElement<MISMOString> value) {
        this.creditCommentText = value;
    }

    /**
     * Gets the value of the creditCommentType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditCommentEnum }{@code >}
     *
     */
    public JAXBElement<CreditCommentEnum> getCreditCommentType() {
        return creditCommentType;
    }

    /**
     * Sets the value of the creditCommentType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditCommentEnum }{@code >}
     *
     */
    public void setCreditCommentType(JAXBElement<CreditCommentEnum> value) {
        this.creditCommentType = value;
    }

    /**
     * Gets the value of the creditCommentTypeOtherDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getCreditCommentTypeOtherDescription() {
        return creditCommentTypeOtherDescription;
    }

    /**
     * Sets the value of the creditCommentTypeOtherDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setCreditCommentTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.creditCommentTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link CREDITCOMMENTEXTENSION }
     *
     */
    public CREDITCOMMENTEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link CREDITCOMMENTEXTENSION }
     *
     */
    public void setEXTENSION(CREDITCOMMENTEXTENSION value) {
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
