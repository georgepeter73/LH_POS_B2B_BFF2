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
 * Information about an action or step taken in the bankruptcy process.
 *
 * <p>Java class for BANKRUPTCY_ACTION complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="BANKRUPTCY_ACTION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BankruptcyActionDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="BankruptcyActionType" type="{http://www.mismo.org/residential/2009/schemas}BankruptcyActionEnum" minOccurs="0"/>
 *         &lt;element name="BankruptcyActionTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="BankruptcyAttorneyServiceReferralType" type="{http://www.mismo.org/residential/2009/schemas}BankruptcyAttorneyServiceReferralEnum" minOccurs="0"/>
 *         &lt;element name="BankruptcyAttorneyServiceReferralTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="BankruptcyPaymentChangeNoticeReasonType" type="{http://www.mismo.org/residential/2009/schemas}BankruptcyPaymentChangeNoticeReasonEnum" minOccurs="0"/>
 *         &lt;element name="BankruptcyPaymentChangeNoticeReasonTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="BankruptcyPlanAmendedType" type="{http://www.mismo.org/residential/2009/schemas}BankruptcyPlanAmendedEnum" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}BANKRUPTCY_ACTION_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "BANKRUPTCY_ACTION", propOrder = {
    "bankruptcyActionDate",
    "bankruptcyActionType",
    "bankruptcyActionTypeOtherDescription",
    "bankruptcyAttorneyServiceReferralType",
    "bankruptcyAttorneyServiceReferralTypeOtherDescription",
    "bankruptcyPaymentChangeNoticeReasonType",
    "bankruptcyPaymentChangeNoticeReasonTypeOtherDescription",
    "bankruptcyPlanAmendedType",
    "extension"
})
public class BANKRUPTCYACTION {

    @XmlElementRef(name = "BankruptcyActionDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> bankruptcyActionDate;
    @XmlElementRef(name = "BankruptcyActionType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<BankruptcyActionEnum> bankruptcyActionType;
    @XmlElementRef(name = "BankruptcyActionTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> bankruptcyActionTypeOtherDescription;
    @XmlElementRef(name = "BankruptcyAttorneyServiceReferralType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<BankruptcyAttorneyServiceReferralEnum> bankruptcyAttorneyServiceReferralType;
    @XmlElementRef(name = "BankruptcyAttorneyServiceReferralTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> bankruptcyAttorneyServiceReferralTypeOtherDescription;
    @XmlElementRef(name = "BankruptcyPaymentChangeNoticeReasonType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<BankruptcyPaymentChangeNoticeReasonEnum> bankruptcyPaymentChangeNoticeReasonType;
    @XmlElementRef(name = "BankruptcyPaymentChangeNoticeReasonTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> bankruptcyPaymentChangeNoticeReasonTypeOtherDescription;
    @XmlElementRef(name = "BankruptcyPlanAmendedType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<BankruptcyPlanAmendedEnum> bankruptcyPlanAmendedType;
    @XmlElement(name = "EXTENSION")
    protected BANKRUPTCYACTIONEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Gets the value of the bankruptcyActionDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public JAXBElement<MISMODate> getBankruptcyActionDate() {
        return bankruptcyActionDate;
    }

    /**
     * Sets the value of the bankruptcyActionDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public void setBankruptcyActionDate(JAXBElement<MISMODate> value) {
        this.bankruptcyActionDate = value;
    }

    /**
     * Gets the value of the bankruptcyActionType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BankruptcyActionEnum }{@code >}
     *
     */
    public JAXBElement<BankruptcyActionEnum> getBankruptcyActionType() {
        return bankruptcyActionType;
    }

    /**
     * Sets the value of the bankruptcyActionType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BankruptcyActionEnum }{@code >}
     *
     */
    public void setBankruptcyActionType(JAXBElement<BankruptcyActionEnum> value) {
        this.bankruptcyActionType = value;
    }

    /**
     * Gets the value of the bankruptcyActionTypeOtherDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getBankruptcyActionTypeOtherDescription() {
        return bankruptcyActionTypeOtherDescription;
    }

    /**
     * Sets the value of the bankruptcyActionTypeOtherDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setBankruptcyActionTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.bankruptcyActionTypeOtherDescription = value;
    }

    /**
     * Gets the value of the bankruptcyAttorneyServiceReferralType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BankruptcyAttorneyServiceReferralEnum }{@code >}
     *
     */
    public JAXBElement<BankruptcyAttorneyServiceReferralEnum> getBankruptcyAttorneyServiceReferralType() {
        return bankruptcyAttorneyServiceReferralType;
    }

    /**
     * Sets the value of the bankruptcyAttorneyServiceReferralType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BankruptcyAttorneyServiceReferralEnum }{@code >}
     *
     */
    public void setBankruptcyAttorneyServiceReferralType(JAXBElement<BankruptcyAttorneyServiceReferralEnum> value) {
        this.bankruptcyAttorneyServiceReferralType = value;
    }

    /**
     * Gets the value of the bankruptcyAttorneyServiceReferralTypeOtherDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getBankruptcyAttorneyServiceReferralTypeOtherDescription() {
        return bankruptcyAttorneyServiceReferralTypeOtherDescription;
    }

    /**
     * Sets the value of the bankruptcyAttorneyServiceReferralTypeOtherDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setBankruptcyAttorneyServiceReferralTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.bankruptcyAttorneyServiceReferralTypeOtherDescription = value;
    }

    /**
     * Gets the value of the bankruptcyPaymentChangeNoticeReasonType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BankruptcyPaymentChangeNoticeReasonEnum }{@code >}
     *
     */
    public JAXBElement<BankruptcyPaymentChangeNoticeReasonEnum> getBankruptcyPaymentChangeNoticeReasonType() {
        return bankruptcyPaymentChangeNoticeReasonType;
    }

    /**
     * Sets the value of the bankruptcyPaymentChangeNoticeReasonType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BankruptcyPaymentChangeNoticeReasonEnum }{@code >}
     *
     */
    public void setBankruptcyPaymentChangeNoticeReasonType(JAXBElement<BankruptcyPaymentChangeNoticeReasonEnum> value) {
        this.bankruptcyPaymentChangeNoticeReasonType = value;
    }

    /**
     * Gets the value of the bankruptcyPaymentChangeNoticeReasonTypeOtherDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getBankruptcyPaymentChangeNoticeReasonTypeOtherDescription() {
        return bankruptcyPaymentChangeNoticeReasonTypeOtherDescription;
    }

    /**
     * Sets the value of the bankruptcyPaymentChangeNoticeReasonTypeOtherDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setBankruptcyPaymentChangeNoticeReasonTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.bankruptcyPaymentChangeNoticeReasonTypeOtherDescription = value;
    }

    /**
     * Gets the value of the bankruptcyPlanAmendedType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BankruptcyPlanAmendedEnum }{@code >}
     *
     */
    public JAXBElement<BankruptcyPlanAmendedEnum> getBankruptcyPlanAmendedType() {
        return bankruptcyPlanAmendedType;
    }

    /**
     * Sets the value of the bankruptcyPlanAmendedType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BankruptcyPlanAmendedEnum }{@code >}
     *
     */
    public void setBankruptcyPlanAmendedType(JAXBElement<BankruptcyPlanAmendedEnum> value) {
        this.bankruptcyPlanAmendedType = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link BANKRUPTCYACTIONEXTENSION }
     *
     */
    public BANKRUPTCYACTIONEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link BANKRUPTCYACTIONEXTENSION }
     *
     */
    public void setEXTENSION(BANKRUPTCYACTIONEXTENSION value) {
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
