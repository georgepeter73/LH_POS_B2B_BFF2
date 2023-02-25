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
 * Contains data about the credit liability from a previous monthly period, including the reported date, unpaid balance amount, payment data and other data that can change over time.
 *
 * <p>Java class for CREDIT_LIABILITY_PRIOR_DETAIL complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CREDIT_LIABILITY_PRIOR_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditLiabilityAccountBalanceDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="CreditLiabilityAccountReportedDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="CreditLiabilityAccountStatusDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="CreditLiabilityAccountStatusType" type="{http://www.mismo.org/residential/2009/schemas}CreditLiabilityAccountStatusEnum" minOccurs="0"/>
 *         &lt;element name="CreditLiabilityActualPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="CreditLiabilityCreditLimitAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="CreditLiabilityCurrentRatingCode" type="{http://www.mismo.org/residential/2009/schemas}MISMOCode" minOccurs="0"/>
 *         &lt;element name="CreditLiabilityCurrentRatingType" type="{http://www.mismo.org/residential/2009/schemas}CreditLiabilityCurrentRatingEnum" minOccurs="0"/>
 *         &lt;element name="CreditLiabilityHighBalanceAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="CreditLiabilityLastActivityDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="CreditLiabilityLastPaymentDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="CreditLiabilityMonthlyPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="CreditLiabilityMonthsRemainingCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="CreditLiabilityPastDueAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="CreditLiabilityUnpaidBalanceAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="DeferredPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="DeferredPaymentDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}CREDIT_LIABILITY_PRIOR_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "CREDIT_LIABILITY_PRIOR_DETAIL", propOrder = {
    "creditLiabilityAccountBalanceDate",
    "creditLiabilityAccountReportedDate",
    "creditLiabilityAccountStatusDate",
    "creditLiabilityAccountStatusType",
    "creditLiabilityActualPaymentAmount",
    "creditLiabilityCreditLimitAmount",
    "creditLiabilityCurrentRatingCode",
    "creditLiabilityCurrentRatingType",
    "creditLiabilityHighBalanceAmount",
    "creditLiabilityLastActivityDate",
    "creditLiabilityLastPaymentDate",
    "creditLiabilityMonthlyPaymentAmount",
    "creditLiabilityMonthsRemainingCount",
    "creditLiabilityPastDueAmount",
    "creditLiabilityUnpaidBalanceAmount",
    "deferredPaymentAmount",
    "deferredPaymentDate",
    "extension"
})
public class CREDITLIABILITYPRIORDETAIL {

    @XmlElementRef(name = "CreditLiabilityAccountBalanceDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> creditLiabilityAccountBalanceDate;
    @XmlElementRef(name = "CreditLiabilityAccountReportedDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> creditLiabilityAccountReportedDate;
    @XmlElementRef(name = "CreditLiabilityAccountStatusDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> creditLiabilityAccountStatusDate;
    @XmlElementRef(name = "CreditLiabilityAccountStatusType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CreditLiabilityAccountStatusEnum> creditLiabilityAccountStatusType;
    @XmlElementRef(name = "CreditLiabilityActualPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> creditLiabilityActualPaymentAmount;
    @XmlElementRef(name = "CreditLiabilityCreditLimitAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> creditLiabilityCreditLimitAmount;
    @XmlElementRef(name = "CreditLiabilityCurrentRatingCode", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCode> creditLiabilityCurrentRatingCode;
    @XmlElementRef(name = "CreditLiabilityCurrentRatingType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CreditLiabilityCurrentRatingEnum> creditLiabilityCurrentRatingType;
    @XmlElementRef(name = "CreditLiabilityHighBalanceAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> creditLiabilityHighBalanceAmount;
    @XmlElementRef(name = "CreditLiabilityLastActivityDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> creditLiabilityLastActivityDate;
    @XmlElementRef(name = "CreditLiabilityLastPaymentDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> creditLiabilityLastPaymentDate;
    @XmlElementRef(name = "CreditLiabilityMonthlyPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> creditLiabilityMonthlyPaymentAmount;
    @XmlElementRef(name = "CreditLiabilityMonthsRemainingCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> creditLiabilityMonthsRemainingCount;
    @XmlElementRef(name = "CreditLiabilityPastDueAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> creditLiabilityPastDueAmount;
    @XmlElementRef(name = "CreditLiabilityUnpaidBalanceAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> creditLiabilityUnpaidBalanceAmount;
    @XmlElementRef(name = "DeferredPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> deferredPaymentAmount;
    @XmlElementRef(name = "DeferredPaymentDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> deferredPaymentDate;
    @XmlElement(name = "EXTENSION")
    protected CREDITLIABILITYPRIORDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the creditLiabilityAccountBalanceDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public JAXBElement<MISMODate> getCreditLiabilityAccountBalanceDate() {
        return creditLiabilityAccountBalanceDate;
    }

    /**
     * Sets the value of the creditLiabilityAccountBalanceDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public void setCreditLiabilityAccountBalanceDate(JAXBElement<MISMODate> value) {
        this.creditLiabilityAccountBalanceDate = value;
    }

    /**
     * Gets the value of the creditLiabilityAccountReportedDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public JAXBElement<MISMODate> getCreditLiabilityAccountReportedDate() {
        return creditLiabilityAccountReportedDate;
    }

    /**
     * Sets the value of the creditLiabilityAccountReportedDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public void setCreditLiabilityAccountReportedDate(JAXBElement<MISMODate> value) {
        this.creditLiabilityAccountReportedDate = value;
    }

    /**
     * Gets the value of the creditLiabilityAccountStatusDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public JAXBElement<MISMODate> getCreditLiabilityAccountStatusDate() {
        return creditLiabilityAccountStatusDate;
    }

    /**
     * Sets the value of the creditLiabilityAccountStatusDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public void setCreditLiabilityAccountStatusDate(JAXBElement<MISMODate> value) {
        this.creditLiabilityAccountStatusDate = value;
    }

    /**
     * Gets the value of the creditLiabilityAccountStatusType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditLiabilityAccountStatusEnum }{@code >}
     *
     */
    public JAXBElement<CreditLiabilityAccountStatusEnum> getCreditLiabilityAccountStatusType() {
        return creditLiabilityAccountStatusType;
    }

    /**
     * Sets the value of the creditLiabilityAccountStatusType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditLiabilityAccountStatusEnum }{@code >}
     *
     */
    public void setCreditLiabilityAccountStatusType(JAXBElement<CreditLiabilityAccountStatusEnum> value) {
        this.creditLiabilityAccountStatusType = value;
    }

    /**
     * Gets the value of the creditLiabilityActualPaymentAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getCreditLiabilityActualPaymentAmount() {
        return creditLiabilityActualPaymentAmount;
    }

    /**
     * Sets the value of the creditLiabilityActualPaymentAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setCreditLiabilityActualPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.creditLiabilityActualPaymentAmount = value;
    }

    /**
     * Gets the value of the creditLiabilityCreditLimitAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getCreditLiabilityCreditLimitAmount() {
        return creditLiabilityCreditLimitAmount;
    }

    /**
     * Sets the value of the creditLiabilityCreditLimitAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setCreditLiabilityCreditLimitAmount(JAXBElement<MISMOAmount> value) {
        this.creditLiabilityCreditLimitAmount = value;
    }

    /**
     * Gets the value of the creditLiabilityCurrentRatingCode property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *
     */
    public JAXBElement<MISMOCode> getCreditLiabilityCurrentRatingCode() {
        return creditLiabilityCurrentRatingCode;
    }

    /**
     * Sets the value of the creditLiabilityCurrentRatingCode property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *
     */
    public void setCreditLiabilityCurrentRatingCode(JAXBElement<MISMOCode> value) {
        this.creditLiabilityCurrentRatingCode = value;
    }

    /**
     * Gets the value of the creditLiabilityCurrentRatingType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditLiabilityCurrentRatingEnum }{@code >}
     *
     */
    public JAXBElement<CreditLiabilityCurrentRatingEnum> getCreditLiabilityCurrentRatingType() {
        return creditLiabilityCurrentRatingType;
    }

    /**
     * Sets the value of the creditLiabilityCurrentRatingType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditLiabilityCurrentRatingEnum }{@code >}
     *
     */
    public void setCreditLiabilityCurrentRatingType(JAXBElement<CreditLiabilityCurrentRatingEnum> value) {
        this.creditLiabilityCurrentRatingType = value;
    }

    /**
     * Gets the value of the creditLiabilityHighBalanceAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getCreditLiabilityHighBalanceAmount() {
        return creditLiabilityHighBalanceAmount;
    }

    /**
     * Sets the value of the creditLiabilityHighBalanceAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setCreditLiabilityHighBalanceAmount(JAXBElement<MISMOAmount> value) {
        this.creditLiabilityHighBalanceAmount = value;
    }

    /**
     * Gets the value of the creditLiabilityLastActivityDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public JAXBElement<MISMODate> getCreditLiabilityLastActivityDate() {
        return creditLiabilityLastActivityDate;
    }

    /**
     * Sets the value of the creditLiabilityLastActivityDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public void setCreditLiabilityLastActivityDate(JAXBElement<MISMODate> value) {
        this.creditLiabilityLastActivityDate = value;
    }

    /**
     * Gets the value of the creditLiabilityLastPaymentDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public JAXBElement<MISMODate> getCreditLiabilityLastPaymentDate() {
        return creditLiabilityLastPaymentDate;
    }

    /**
     * Sets the value of the creditLiabilityLastPaymentDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public void setCreditLiabilityLastPaymentDate(JAXBElement<MISMODate> value) {
        this.creditLiabilityLastPaymentDate = value;
    }

    /**
     * Gets the value of the creditLiabilityMonthlyPaymentAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getCreditLiabilityMonthlyPaymentAmount() {
        return creditLiabilityMonthlyPaymentAmount;
    }

    /**
     * Sets the value of the creditLiabilityMonthlyPaymentAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setCreditLiabilityMonthlyPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.creditLiabilityMonthlyPaymentAmount = value;
    }

    /**
     * Gets the value of the creditLiabilityMonthsRemainingCount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public JAXBElement<MISMOCount> getCreditLiabilityMonthsRemainingCount() {
        return creditLiabilityMonthsRemainingCount;
    }

    /**
     * Sets the value of the creditLiabilityMonthsRemainingCount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public void setCreditLiabilityMonthsRemainingCount(JAXBElement<MISMOCount> value) {
        this.creditLiabilityMonthsRemainingCount = value;
    }

    /**
     * Gets the value of the creditLiabilityPastDueAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getCreditLiabilityPastDueAmount() {
        return creditLiabilityPastDueAmount;
    }

    /**
     * Sets the value of the creditLiabilityPastDueAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setCreditLiabilityPastDueAmount(JAXBElement<MISMOAmount> value) {
        this.creditLiabilityPastDueAmount = value;
    }

    /**
     * Gets the value of the creditLiabilityUnpaidBalanceAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getCreditLiabilityUnpaidBalanceAmount() {
        return creditLiabilityUnpaidBalanceAmount;
    }

    /**
     * Sets the value of the creditLiabilityUnpaidBalanceAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setCreditLiabilityUnpaidBalanceAmount(JAXBElement<MISMOAmount> value) {
        this.creditLiabilityUnpaidBalanceAmount = value;
    }

    /**
     * Gets the value of the deferredPaymentAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getDeferredPaymentAmount() {
        return deferredPaymentAmount;
    }

    /**
     * Sets the value of the deferredPaymentAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setDeferredPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.deferredPaymentAmount = value;
    }

    /**
     * Gets the value of the deferredPaymentDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public JAXBElement<MISMODate> getDeferredPaymentDate() {
        return deferredPaymentDate;
    }

    /**
     * Sets the value of the deferredPaymentDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public void setDeferredPaymentDate(JAXBElement<MISMODate> value) {
        this.deferredPaymentDate = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link CREDITLIABILITYPRIORDETAILEXTENSION }
     *
     */
    public CREDITLIABILITYPRIORDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link CREDITLIABILITYPRIORDETAILEXTENSION }
     *
     */
    public void setEXTENSION(CREDITLIABILITYPRIORDETAILEXTENSION value) {
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