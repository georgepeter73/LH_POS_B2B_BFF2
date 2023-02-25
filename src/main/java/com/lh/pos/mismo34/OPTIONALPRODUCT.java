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
 * Information specific to life, accident, health and other insurance, or other optional product, paid through the mortgage payment.
 *
 * <p>Java class for OPTIONAL_PRODUCT complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="OPTIONAL_PRODUCT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OptionalProductCancellationReasonType" type="{http://www.mismo.org/residential/2009/schemas}OptionalProductCancellationReasonEnum" minOccurs="0"/>
 *         &lt;element name="OptionalProductCancellationReasonTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="OptionalProductChangeType" type="{http://www.mismo.org/residential/2009/schemas}OptionalProductChangeEnum" minOccurs="0"/>
 *         &lt;element name="OptionalProductChangeTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="OptionalProductEffectiveDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="OptionalProductExpirationDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="OptionalProductPayeeIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="OptionalProductPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="OptionalProductPendingChangeEffectiveDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="OptionalProductPendingPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="OptionalProductPlanType" type="{http://www.mismo.org/residential/2009/schemas}OptionalProductPlanEnum" minOccurs="0"/>
 *         &lt;element name="OptionalProductPlanTypeAvailableFromLenderIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="OptionalProductPlanTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="OptionalProductPlanTypeRequiredIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="OptionalProductPremiumAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="OptionalProductPremiumTermMonthsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="OptionalProductProviderAccountIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="OptionalProductProvidersPlanIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="OptionalProductRemittanceDueDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="OptionalProductRemittancePerYearCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}OPTIONAL_PRODUCT_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "OPTIONAL_PRODUCT", propOrder = {
    "optionalProductCancellationReasonType",
    "optionalProductCancellationReasonTypeOtherDescription",
    "optionalProductChangeType",
    "optionalProductChangeTypeOtherDescription",
    "optionalProductEffectiveDate",
    "optionalProductExpirationDate",
    "optionalProductPayeeIdentifier",
    "optionalProductPaymentAmount",
    "optionalProductPendingChangeEffectiveDate",
    "optionalProductPendingPaymentAmount",
    "optionalProductPlanType",
    "optionalProductPlanTypeAvailableFromLenderIndicator",
    "optionalProductPlanTypeOtherDescription",
    "optionalProductPlanTypeRequiredIndicator",
    "optionalProductPremiumAmount",
    "optionalProductPremiumTermMonthsCount",
    "optionalProductProviderAccountIdentifier",
    "optionalProductProvidersPlanIdentifier",
    "optionalProductRemittanceDueDate",
    "optionalProductRemittancePerYearCount",
    "extension"
})
public class OPTIONALPRODUCT {

    @XmlElementRef(name = "OptionalProductCancellationReasonType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<OptionalProductCancellationReasonEnum> optionalProductCancellationReasonType;
    @XmlElementRef(name = "OptionalProductCancellationReasonTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> optionalProductCancellationReasonTypeOtherDescription;
    @XmlElementRef(name = "OptionalProductChangeType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<OptionalProductChangeEnum> optionalProductChangeType;
    @XmlElementRef(name = "OptionalProductChangeTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> optionalProductChangeTypeOtherDescription;
    @XmlElementRef(name = "OptionalProductEffectiveDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> optionalProductEffectiveDate;
    @XmlElementRef(name = "OptionalProductExpirationDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> optionalProductExpirationDate;
    @XmlElementRef(name = "OptionalProductPayeeIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> optionalProductPayeeIdentifier;
    @XmlElementRef(name = "OptionalProductPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> optionalProductPaymentAmount;
    @XmlElementRef(name = "OptionalProductPendingChangeEffectiveDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> optionalProductPendingChangeEffectiveDate;
    @XmlElementRef(name = "OptionalProductPendingPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> optionalProductPendingPaymentAmount;
    @XmlElementRef(name = "OptionalProductPlanType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<OptionalProductPlanEnum> optionalProductPlanType;
    @XmlElementRef(name = "OptionalProductPlanTypeAvailableFromLenderIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> optionalProductPlanTypeAvailableFromLenderIndicator;
    @XmlElementRef(name = "OptionalProductPlanTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> optionalProductPlanTypeOtherDescription;
    @XmlElementRef(name = "OptionalProductPlanTypeRequiredIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> optionalProductPlanTypeRequiredIndicator;
    @XmlElementRef(name = "OptionalProductPremiumAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> optionalProductPremiumAmount;
    @XmlElementRef(name = "OptionalProductPremiumTermMonthsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> optionalProductPremiumTermMonthsCount;
    @XmlElementRef(name = "OptionalProductProviderAccountIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> optionalProductProviderAccountIdentifier;
    @XmlElementRef(name = "OptionalProductProvidersPlanIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> optionalProductProvidersPlanIdentifier;
    @XmlElementRef(name = "OptionalProductRemittanceDueDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> optionalProductRemittanceDueDate;
    @XmlElementRef(name = "OptionalProductRemittancePerYearCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> optionalProductRemittancePerYearCount;
    @XmlElement(name = "EXTENSION")
    protected OPTIONALPRODUCTEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the optionalProductCancellationReasonType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OptionalProductCancellationReasonEnum }{@code >}
     *
     */
    public JAXBElement<OptionalProductCancellationReasonEnum> getOptionalProductCancellationReasonType() {
        return optionalProductCancellationReasonType;
    }

    /**
     * Sets the value of the optionalProductCancellationReasonType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OptionalProductCancellationReasonEnum }{@code >}
     *
     */
    public void setOptionalProductCancellationReasonType(JAXBElement<OptionalProductCancellationReasonEnum> value) {
        this.optionalProductCancellationReasonType = value;
    }

    /**
     * Gets the value of the optionalProductCancellationReasonTypeOtherDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getOptionalProductCancellationReasonTypeOtherDescription() {
        return optionalProductCancellationReasonTypeOtherDescription;
    }

    /**
     * Sets the value of the optionalProductCancellationReasonTypeOtherDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setOptionalProductCancellationReasonTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.optionalProductCancellationReasonTypeOtherDescription = value;
    }

    /**
     * Gets the value of the optionalProductChangeType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OptionalProductChangeEnum }{@code >}
     *
     */
    public JAXBElement<OptionalProductChangeEnum> getOptionalProductChangeType() {
        return optionalProductChangeType;
    }

    /**
     * Sets the value of the optionalProductChangeType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OptionalProductChangeEnum }{@code >}
     *
     */
    public void setOptionalProductChangeType(JAXBElement<OptionalProductChangeEnum> value) {
        this.optionalProductChangeType = value;
    }

    /**
     * Gets the value of the optionalProductChangeTypeOtherDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getOptionalProductChangeTypeOtherDescription() {
        return optionalProductChangeTypeOtherDescription;
    }

    /**
     * Sets the value of the optionalProductChangeTypeOtherDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setOptionalProductChangeTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.optionalProductChangeTypeOtherDescription = value;
    }

    /**
     * Gets the value of the optionalProductEffectiveDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public JAXBElement<MISMODate> getOptionalProductEffectiveDate() {
        return optionalProductEffectiveDate;
    }

    /**
     * Sets the value of the optionalProductEffectiveDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public void setOptionalProductEffectiveDate(JAXBElement<MISMODate> value) {
        this.optionalProductEffectiveDate = value;
    }

    /**
     * Gets the value of the optionalProductExpirationDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public JAXBElement<MISMODate> getOptionalProductExpirationDate() {
        return optionalProductExpirationDate;
    }

    /**
     * Sets the value of the optionalProductExpirationDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public void setOptionalProductExpirationDate(JAXBElement<MISMODate> value) {
        this.optionalProductExpirationDate = value;
    }

    /**
     * Gets the value of the optionalProductPayeeIdentifier property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public JAXBElement<MISMOIdentifier> getOptionalProductPayeeIdentifier() {
        return optionalProductPayeeIdentifier;
    }

    /**
     * Sets the value of the optionalProductPayeeIdentifier property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public void setOptionalProductPayeeIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.optionalProductPayeeIdentifier = value;
    }

    /**
     * Gets the value of the optionalProductPaymentAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getOptionalProductPaymentAmount() {
        return optionalProductPaymentAmount;
    }

    /**
     * Sets the value of the optionalProductPaymentAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setOptionalProductPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.optionalProductPaymentAmount = value;
    }

    /**
     * Gets the value of the optionalProductPendingChangeEffectiveDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public JAXBElement<MISMODate> getOptionalProductPendingChangeEffectiveDate() {
        return optionalProductPendingChangeEffectiveDate;
    }

    /**
     * Sets the value of the optionalProductPendingChangeEffectiveDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public void setOptionalProductPendingChangeEffectiveDate(JAXBElement<MISMODate> value) {
        this.optionalProductPendingChangeEffectiveDate = value;
    }

    /**
     * Gets the value of the optionalProductPendingPaymentAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getOptionalProductPendingPaymentAmount() {
        return optionalProductPendingPaymentAmount;
    }

    /**
     * Sets the value of the optionalProductPendingPaymentAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setOptionalProductPendingPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.optionalProductPendingPaymentAmount = value;
    }

    /**
     * Gets the value of the optionalProductPlanType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OptionalProductPlanEnum }{@code >}
     *
     */
    public JAXBElement<OptionalProductPlanEnum> getOptionalProductPlanType() {
        return optionalProductPlanType;
    }

    /**
     * Sets the value of the optionalProductPlanType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OptionalProductPlanEnum }{@code >}
     *
     */
    public void setOptionalProductPlanType(JAXBElement<OptionalProductPlanEnum> value) {
        this.optionalProductPlanType = value;
    }

    /**
     * Gets the value of the optionalProductPlanTypeAvailableFromLenderIndicator property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public JAXBElement<MISMOIndicator> getOptionalProductPlanTypeAvailableFromLenderIndicator() {
        return optionalProductPlanTypeAvailableFromLenderIndicator;
    }

    /**
     * Sets the value of the optionalProductPlanTypeAvailableFromLenderIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public void setOptionalProductPlanTypeAvailableFromLenderIndicator(JAXBElement<MISMOIndicator> value) {
        this.optionalProductPlanTypeAvailableFromLenderIndicator = value;
    }

    /**
     * Gets the value of the optionalProductPlanTypeOtherDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getOptionalProductPlanTypeOtherDescription() {
        return optionalProductPlanTypeOtherDescription;
    }

    /**
     * Sets the value of the optionalProductPlanTypeOtherDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setOptionalProductPlanTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.optionalProductPlanTypeOtherDescription = value;
    }

    /**
     * Gets the value of the optionalProductPlanTypeRequiredIndicator property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public JAXBElement<MISMOIndicator> getOptionalProductPlanTypeRequiredIndicator() {
        return optionalProductPlanTypeRequiredIndicator;
    }

    /**
     * Sets the value of the optionalProductPlanTypeRequiredIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public void setOptionalProductPlanTypeRequiredIndicator(JAXBElement<MISMOIndicator> value) {
        this.optionalProductPlanTypeRequiredIndicator = value;
    }

    /**
     * Gets the value of the optionalProductPremiumAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getOptionalProductPremiumAmount() {
        return optionalProductPremiumAmount;
    }

    /**
     * Sets the value of the optionalProductPremiumAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setOptionalProductPremiumAmount(JAXBElement<MISMOAmount> value) {
        this.optionalProductPremiumAmount = value;
    }

    /**
     * Gets the value of the optionalProductPremiumTermMonthsCount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public JAXBElement<MISMOCount> getOptionalProductPremiumTermMonthsCount() {
        return optionalProductPremiumTermMonthsCount;
    }

    /**
     * Sets the value of the optionalProductPremiumTermMonthsCount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public void setOptionalProductPremiumTermMonthsCount(JAXBElement<MISMOCount> value) {
        this.optionalProductPremiumTermMonthsCount = value;
    }

    /**
     * Gets the value of the optionalProductProviderAccountIdentifier property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public JAXBElement<MISMOIdentifier> getOptionalProductProviderAccountIdentifier() {
        return optionalProductProviderAccountIdentifier;
    }

    /**
     * Sets the value of the optionalProductProviderAccountIdentifier property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public void setOptionalProductProviderAccountIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.optionalProductProviderAccountIdentifier = value;
    }

    /**
     * Gets the value of the optionalProductProvidersPlanIdentifier property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public JAXBElement<MISMOIdentifier> getOptionalProductProvidersPlanIdentifier() {
        return optionalProductProvidersPlanIdentifier;
    }

    /**
     * Sets the value of the optionalProductProvidersPlanIdentifier property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public void setOptionalProductProvidersPlanIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.optionalProductProvidersPlanIdentifier = value;
    }

    /**
     * Gets the value of the optionalProductRemittanceDueDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public JAXBElement<MISMODate> getOptionalProductRemittanceDueDate() {
        return optionalProductRemittanceDueDate;
    }

    /**
     * Sets the value of the optionalProductRemittanceDueDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public void setOptionalProductRemittanceDueDate(JAXBElement<MISMODate> value) {
        this.optionalProductRemittanceDueDate = value;
    }

    /**
     * Gets the value of the optionalProductRemittancePerYearCount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public JAXBElement<MISMOCount> getOptionalProductRemittancePerYearCount() {
        return optionalProductRemittancePerYearCount;
    }

    /**
     * Sets the value of the optionalProductRemittancePerYearCount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public void setOptionalProductRemittancePerYearCount(JAXBElement<MISMOCount> value) {
        this.optionalProductRemittancePerYearCount = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link OPTIONALPRODUCTEXTENSION }
     *
     */
    public OPTIONALPRODUCTEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link OPTIONALPRODUCTEXTENSION }
     *
     */
    public void setEXTENSION(OPTIONALPRODUCTEXTENSION value) {
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
