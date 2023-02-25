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
 * <p>Java class for PROPERTY_VALUATION_DETAIL complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PROPERTY_VALUATION_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppraisalIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="PropertyAppraisedWithinPreviousYearDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="PropertyAppraisedWithinPreviousYearIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="PropertyInspectionRequestCommentDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="PropertyInspectionResultCommentDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="PropertyInspectionType" type="{http://www.mismo.org/residential/2009/schemas}PropertyInspectionEnum" minOccurs="0"/>
 *         &lt;element name="PropertyInspectionTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="PropertyMostRecentValuationOrderDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="PropertyReplacementValueAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="PropertyValuationAgeDaysCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="PropertyValuationAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="PropertyValuationCommentText" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="PropertyValuationConditionalConclusionType" type="{http://www.mismo.org/residential/2009/schemas}PropertyValuationConditionalConclusionEnum" minOccurs="0"/>
 *         &lt;element name="PropertyValuationConditionalConclusionTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="PropertyValuationEffectiveDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="PropertyValuationFormType" type="{http://www.mismo.org/residential/2009/schemas}PropertyValuationFormEnum" minOccurs="0"/>
 *         &lt;element name="PropertyValuationFormTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="PropertyValuationMethodType" type="{http://www.mismo.org/residential/2009/schemas}PropertyValuationMethodEnum" minOccurs="0"/>
 *         &lt;element name="PropertyValuationMethodTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="PropertyValuationServiceType" type="{http://www.mismo.org/residential/2009/schemas}PropertyValuationServiceEnum" minOccurs="0"/>
 *         &lt;element name="PropertyValuationServiceTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="PropertyValuationStateType" type="{http://www.mismo.org/residential/2009/schemas}PropertyValuationStateEnum" minOccurs="0"/>
 *         &lt;element name="RepairsTotalCostAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}PROPERTY_VALUATION_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "PROPERTY_VALUATION_DETAIL", propOrder = {
    "appraisalIdentifier",
    "propertyAppraisedWithinPreviousYearDescription",
    "propertyAppraisedWithinPreviousYearIndicator",
    "propertyInspectionRequestCommentDescription",
    "propertyInspectionResultCommentDescription",
    "propertyInspectionType",
    "propertyInspectionTypeOtherDescription",
    "propertyMostRecentValuationOrderDate",
    "propertyReplacementValueAmount",
    "propertyValuationAgeDaysCount",
    "propertyValuationAmount",
    "propertyValuationCommentText",
    "propertyValuationConditionalConclusionType",
    "propertyValuationConditionalConclusionTypeOtherDescription",
    "propertyValuationEffectiveDate",
    "propertyValuationFormType",
    "propertyValuationFormTypeOtherDescription",
    "propertyValuationMethodType",
    "propertyValuationMethodTypeOtherDescription",
    "propertyValuationServiceType",
    "propertyValuationServiceTypeOtherDescription",
    "propertyValuationStateType",
    "repairsTotalCostAmount",
    "extension"
})
public class PROPERTYVALUATIONDETAIL {

    @XmlElementRef(name = "AppraisalIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> appraisalIdentifier;
    @XmlElementRef(name = "PropertyAppraisedWithinPreviousYearDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> propertyAppraisedWithinPreviousYearDescription;
    @XmlElementRef(name = "PropertyAppraisedWithinPreviousYearIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> propertyAppraisedWithinPreviousYearIndicator;
    @XmlElementRef(name = "PropertyInspectionRequestCommentDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> propertyInspectionRequestCommentDescription;
    @XmlElementRef(name = "PropertyInspectionResultCommentDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> propertyInspectionResultCommentDescription;
    @XmlElementRef(name = "PropertyInspectionType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<PropertyInspectionEnum> propertyInspectionType;
    @XmlElementRef(name = "PropertyInspectionTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> propertyInspectionTypeOtherDescription;
    @XmlElementRef(name = "PropertyMostRecentValuationOrderDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> propertyMostRecentValuationOrderDate;
    @XmlElementRef(name = "PropertyReplacementValueAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> propertyReplacementValueAmount;
    @XmlElementRef(name = "PropertyValuationAgeDaysCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> propertyValuationAgeDaysCount;
    @XmlElementRef(name = "PropertyValuationAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> propertyValuationAmount;
    @XmlElementRef(name = "PropertyValuationCommentText", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> propertyValuationCommentText;
    @XmlElementRef(name = "PropertyValuationConditionalConclusionType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<PropertyValuationConditionalConclusionEnum> propertyValuationConditionalConclusionType;
    @XmlElementRef(name = "PropertyValuationConditionalConclusionTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> propertyValuationConditionalConclusionTypeOtherDescription;
    @XmlElementRef(name = "PropertyValuationEffectiveDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> propertyValuationEffectiveDate;
    @XmlElementRef(name = "PropertyValuationFormType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<PropertyValuationFormEnum> propertyValuationFormType;
    @XmlElementRef(name = "PropertyValuationFormTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> propertyValuationFormTypeOtherDescription;
    @XmlElementRef(name = "PropertyValuationMethodType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<PropertyValuationMethodEnum> propertyValuationMethodType;
    @XmlElementRef(name = "PropertyValuationMethodTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> propertyValuationMethodTypeOtherDescription;
    @XmlElementRef(name = "PropertyValuationServiceType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<PropertyValuationServiceEnum> propertyValuationServiceType;
    @XmlElementRef(name = "PropertyValuationServiceTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> propertyValuationServiceTypeOtherDescription;
    @XmlElementRef(name = "PropertyValuationStateType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<PropertyValuationStateEnum> propertyValuationStateType;
    @XmlElementRef(name = "RepairsTotalCostAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> repairsTotalCostAmount;
    @XmlElement(name = "EXTENSION")
    protected PROPERTYVALUATIONDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the appraisalIdentifier property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public JAXBElement<MISMOIdentifier> getAppraisalIdentifier() {
        return appraisalIdentifier;
    }

    /**
     * Sets the value of the appraisalIdentifier property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public void setAppraisalIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.appraisalIdentifier = value;
    }

    /**
     * Gets the value of the propertyAppraisedWithinPreviousYearDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getPropertyAppraisedWithinPreviousYearDescription() {
        return propertyAppraisedWithinPreviousYearDescription;
    }

    /**
     * Sets the value of the propertyAppraisedWithinPreviousYearDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setPropertyAppraisedWithinPreviousYearDescription(JAXBElement<MISMOString> value) {
        this.propertyAppraisedWithinPreviousYearDescription = value;
    }

    /**
     * Gets the value of the propertyAppraisedWithinPreviousYearIndicator property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public JAXBElement<MISMOIndicator> getPropertyAppraisedWithinPreviousYearIndicator() {
        return propertyAppraisedWithinPreviousYearIndicator;
    }

    /**
     * Sets the value of the propertyAppraisedWithinPreviousYearIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public void setPropertyAppraisedWithinPreviousYearIndicator(JAXBElement<MISMOIndicator> value) {
        this.propertyAppraisedWithinPreviousYearIndicator = value;
    }

    /**
     * Gets the value of the propertyInspectionRequestCommentDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getPropertyInspectionRequestCommentDescription() {
        return propertyInspectionRequestCommentDescription;
    }

    /**
     * Sets the value of the propertyInspectionRequestCommentDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setPropertyInspectionRequestCommentDescription(JAXBElement<MISMOString> value) {
        this.propertyInspectionRequestCommentDescription = value;
    }

    /**
     * Gets the value of the propertyInspectionResultCommentDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getPropertyInspectionResultCommentDescription() {
        return propertyInspectionResultCommentDescription;
    }

    /**
     * Sets the value of the propertyInspectionResultCommentDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setPropertyInspectionResultCommentDescription(JAXBElement<MISMOString> value) {
        this.propertyInspectionResultCommentDescription = value;
    }

    /**
     * Gets the value of the propertyInspectionType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropertyInspectionEnum }{@code >}
     *
     */
    public JAXBElement<PropertyInspectionEnum> getPropertyInspectionType() {
        return propertyInspectionType;
    }

    /**
     * Sets the value of the propertyInspectionType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropertyInspectionEnum }{@code >}
     *
     */
    public void setPropertyInspectionType(JAXBElement<PropertyInspectionEnum> value) {
        this.propertyInspectionType = value;
    }

    /**
     * Gets the value of the propertyInspectionTypeOtherDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getPropertyInspectionTypeOtherDescription() {
        return propertyInspectionTypeOtherDescription;
    }

    /**
     * Sets the value of the propertyInspectionTypeOtherDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setPropertyInspectionTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.propertyInspectionTypeOtherDescription = value;
    }

    /**
     * Gets the value of the propertyMostRecentValuationOrderDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public JAXBElement<MISMODate> getPropertyMostRecentValuationOrderDate() {
        return propertyMostRecentValuationOrderDate;
    }

    /**
     * Sets the value of the propertyMostRecentValuationOrderDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public void setPropertyMostRecentValuationOrderDate(JAXBElement<MISMODate> value) {
        this.propertyMostRecentValuationOrderDate = value;
    }

    /**
     * Gets the value of the propertyReplacementValueAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getPropertyReplacementValueAmount() {
        return propertyReplacementValueAmount;
    }

    /**
     * Sets the value of the propertyReplacementValueAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setPropertyReplacementValueAmount(JAXBElement<MISMOAmount> value) {
        this.propertyReplacementValueAmount = value;
    }

    /**
     * Gets the value of the propertyValuationAgeDaysCount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public JAXBElement<MISMOCount> getPropertyValuationAgeDaysCount() {
        return propertyValuationAgeDaysCount;
    }

    /**
     * Sets the value of the propertyValuationAgeDaysCount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public void setPropertyValuationAgeDaysCount(JAXBElement<MISMOCount> value) {
        this.propertyValuationAgeDaysCount = value;
    }

    /**
     * Gets the value of the propertyValuationAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getPropertyValuationAmount() {
        return propertyValuationAmount;
    }

    /**
     * Sets the value of the propertyValuationAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setPropertyValuationAmount(JAXBElement<MISMOAmount> value) {
        this.propertyValuationAmount = value;
    }

    /**
     * Gets the value of the propertyValuationCommentText property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getPropertyValuationCommentText() {
        return propertyValuationCommentText;
    }

    /**
     * Sets the value of the propertyValuationCommentText property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setPropertyValuationCommentText(JAXBElement<MISMOString> value) {
        this.propertyValuationCommentText = value;
    }

    /**
     * Gets the value of the propertyValuationConditionalConclusionType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropertyValuationConditionalConclusionEnum }{@code >}
     *
     */
    public JAXBElement<PropertyValuationConditionalConclusionEnum> getPropertyValuationConditionalConclusionType() {
        return propertyValuationConditionalConclusionType;
    }

    /**
     * Sets the value of the propertyValuationConditionalConclusionType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropertyValuationConditionalConclusionEnum }{@code >}
     *
     */
    public void setPropertyValuationConditionalConclusionType(JAXBElement<PropertyValuationConditionalConclusionEnum> value) {
        this.propertyValuationConditionalConclusionType = value;
    }

    /**
     * Gets the value of the propertyValuationConditionalConclusionTypeOtherDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getPropertyValuationConditionalConclusionTypeOtherDescription() {
        return propertyValuationConditionalConclusionTypeOtherDescription;
    }

    /**
     * Sets the value of the propertyValuationConditionalConclusionTypeOtherDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setPropertyValuationConditionalConclusionTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.propertyValuationConditionalConclusionTypeOtherDescription = value;
    }

    /**
     * Gets the value of the propertyValuationEffectiveDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public JAXBElement<MISMODate> getPropertyValuationEffectiveDate() {
        return propertyValuationEffectiveDate;
    }

    /**
     * Sets the value of the propertyValuationEffectiveDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public void setPropertyValuationEffectiveDate(JAXBElement<MISMODate> value) {
        this.propertyValuationEffectiveDate = value;
    }

    /**
     * Gets the value of the propertyValuationFormType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropertyValuationFormEnum }{@code >}
     *
     */
    public JAXBElement<PropertyValuationFormEnum> getPropertyValuationFormType() {
        return propertyValuationFormType;
    }

    /**
     * Sets the value of the propertyValuationFormType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropertyValuationFormEnum }{@code >}
     *
     */
    public void setPropertyValuationFormType(JAXBElement<PropertyValuationFormEnum> value) {
        this.propertyValuationFormType = value;
    }

    /**
     * Gets the value of the propertyValuationFormTypeOtherDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getPropertyValuationFormTypeOtherDescription() {
        return propertyValuationFormTypeOtherDescription;
    }

    /**
     * Sets the value of the propertyValuationFormTypeOtherDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setPropertyValuationFormTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.propertyValuationFormTypeOtherDescription = value;
    }

    /**
     * Gets the value of the propertyValuationMethodType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropertyValuationMethodEnum }{@code >}
     *
     */
    public JAXBElement<PropertyValuationMethodEnum> getPropertyValuationMethodType() {
        return propertyValuationMethodType;
    }

    /**
     * Sets the value of the propertyValuationMethodType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropertyValuationMethodEnum }{@code >}
     *
     */
    public void setPropertyValuationMethodType(JAXBElement<PropertyValuationMethodEnum> value) {
        this.propertyValuationMethodType = value;
    }

    /**
     * Gets the value of the propertyValuationMethodTypeOtherDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getPropertyValuationMethodTypeOtherDescription() {
        return propertyValuationMethodTypeOtherDescription;
    }

    /**
     * Sets the value of the propertyValuationMethodTypeOtherDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setPropertyValuationMethodTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.propertyValuationMethodTypeOtherDescription = value;
    }

    /**
     * Gets the value of the propertyValuationServiceType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropertyValuationServiceEnum }{@code >}
     *
     */
    public JAXBElement<PropertyValuationServiceEnum> getPropertyValuationServiceType() {
        return propertyValuationServiceType;
    }

    /**
     * Sets the value of the propertyValuationServiceType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropertyValuationServiceEnum }{@code >}
     *
     */
    public void setPropertyValuationServiceType(JAXBElement<PropertyValuationServiceEnum> value) {
        this.propertyValuationServiceType = value;
    }

    /**
     * Gets the value of the propertyValuationServiceTypeOtherDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getPropertyValuationServiceTypeOtherDescription() {
        return propertyValuationServiceTypeOtherDescription;
    }

    /**
     * Sets the value of the propertyValuationServiceTypeOtherDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setPropertyValuationServiceTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.propertyValuationServiceTypeOtherDescription = value;
    }

    /**
     * Gets the value of the propertyValuationStateType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropertyValuationStateEnum }{@code >}
     *
     */
    public JAXBElement<PropertyValuationStateEnum> getPropertyValuationStateType() {
        return propertyValuationStateType;
    }

    /**
     * Sets the value of the propertyValuationStateType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropertyValuationStateEnum }{@code >}
     *
     */
    public void setPropertyValuationStateType(JAXBElement<PropertyValuationStateEnum> value) {
        this.propertyValuationStateType = value;
    }

    /**
     * Gets the value of the repairsTotalCostAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getRepairsTotalCostAmount() {
        return repairsTotalCostAmount;
    }

    /**
     * Sets the value of the repairsTotalCostAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setRepairsTotalCostAmount(JAXBElement<MISMOAmount> value) {
        this.repairsTotalCostAmount = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link PROPERTYVALUATIONDETAILEXTENSION }
     *
     */
    public PROPERTYVALUATIONDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link PROPERTYVALUATIONDETAILEXTENSION }
     *
     */
    public void setEXTENSION(PROPERTYVALUATIONDETAILEXTENSION value) {
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
