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
 * Information about a repayment plan associated with a workout.
 *
 * <p>Java class for REPAYMENT_PLAN complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="REPAYMENT_PLAN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PromiseToPayAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="PromiseToPayDueDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="RepaymentPlanDownPaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="RepaymentPlanEndDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="RepaymentPlanMonthlyDueAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="RepaymentPlanNextDueDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="RepaymentPlanStartDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="RepaymentPlanTermMonthsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}REPAYMENT_PLAN_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "REPAYMENT_PLAN", propOrder = {
    "promiseToPayAmount",
    "promiseToPayDueDate",
    "repaymentPlanDownPaymentAmount",
    "repaymentPlanEndDate",
    "repaymentPlanMonthlyDueAmount",
    "repaymentPlanNextDueDate",
    "repaymentPlanStartDate",
    "repaymentPlanTermMonthsCount",
    "extension"
})
public class REPAYMENTPLAN {

    @XmlElementRef(name = "PromiseToPayAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> promiseToPayAmount;
    @XmlElementRef(name = "PromiseToPayDueDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> promiseToPayDueDate;
    @XmlElementRef(name = "RepaymentPlanDownPaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> repaymentPlanDownPaymentAmount;
    @XmlElementRef(name = "RepaymentPlanEndDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> repaymentPlanEndDate;
    @XmlElementRef(name = "RepaymentPlanMonthlyDueAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> repaymentPlanMonthlyDueAmount;
    @XmlElementRef(name = "RepaymentPlanNextDueDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> repaymentPlanNextDueDate;
    @XmlElementRef(name = "RepaymentPlanStartDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> repaymentPlanStartDate;
    @XmlElementRef(name = "RepaymentPlanTermMonthsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> repaymentPlanTermMonthsCount;
    @XmlElement(name = "EXTENSION")
    protected REPAYMENTPLANEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the promiseToPayAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getPromiseToPayAmount() {
        return promiseToPayAmount;
    }

    /**
     * Sets the value of the promiseToPayAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setPromiseToPayAmount(JAXBElement<MISMOAmount> value) {
        this.promiseToPayAmount = value;
    }

    /**
     * Gets the value of the promiseToPayDueDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public JAXBElement<MISMODate> getPromiseToPayDueDate() {
        return promiseToPayDueDate;
    }

    /**
     * Sets the value of the promiseToPayDueDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public void setPromiseToPayDueDate(JAXBElement<MISMODate> value) {
        this.promiseToPayDueDate = value;
    }

    /**
     * Gets the value of the repaymentPlanDownPaymentAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getRepaymentPlanDownPaymentAmount() {
        return repaymentPlanDownPaymentAmount;
    }

    /**
     * Sets the value of the repaymentPlanDownPaymentAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setRepaymentPlanDownPaymentAmount(JAXBElement<MISMOAmount> value) {
        this.repaymentPlanDownPaymentAmount = value;
    }

    /**
     * Gets the value of the repaymentPlanEndDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public JAXBElement<MISMODate> getRepaymentPlanEndDate() {
        return repaymentPlanEndDate;
    }

    /**
     * Sets the value of the repaymentPlanEndDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public void setRepaymentPlanEndDate(JAXBElement<MISMODate> value) {
        this.repaymentPlanEndDate = value;
    }

    /**
     * Gets the value of the repaymentPlanMonthlyDueAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getRepaymentPlanMonthlyDueAmount() {
        return repaymentPlanMonthlyDueAmount;
    }

    /**
     * Sets the value of the repaymentPlanMonthlyDueAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setRepaymentPlanMonthlyDueAmount(JAXBElement<MISMOAmount> value) {
        this.repaymentPlanMonthlyDueAmount = value;
    }

    /**
     * Gets the value of the repaymentPlanNextDueDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public JAXBElement<MISMODate> getRepaymentPlanNextDueDate() {
        return repaymentPlanNextDueDate;
    }

    /**
     * Sets the value of the repaymentPlanNextDueDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public void setRepaymentPlanNextDueDate(JAXBElement<MISMODate> value) {
        this.repaymentPlanNextDueDate = value;
    }

    /**
     * Gets the value of the repaymentPlanStartDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public JAXBElement<MISMODate> getRepaymentPlanStartDate() {
        return repaymentPlanStartDate;
    }

    /**
     * Sets the value of the repaymentPlanStartDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public void setRepaymentPlanStartDate(JAXBElement<MISMODate> value) {
        this.repaymentPlanStartDate = value;
    }

    /**
     * Gets the value of the repaymentPlanTermMonthsCount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public JAXBElement<MISMOCount> getRepaymentPlanTermMonthsCount() {
        return repaymentPlanTermMonthsCount;
    }

    /**
     * Sets the value of the repaymentPlanTermMonthsCount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public void setRepaymentPlanTermMonthsCount(JAXBElement<MISMOCount> value) {
        this.repaymentPlanTermMonthsCount = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link REPAYMENTPLANEXTENSION }
     *
     */
    public REPAYMENTPLANEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link REPAYMENTPLANEXTENSION }
     *
     */
    public void setEXTENSION(REPAYMENTPLANEXTENSION value) {
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
