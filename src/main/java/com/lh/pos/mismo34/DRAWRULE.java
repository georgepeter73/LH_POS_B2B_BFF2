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
 * <p>Java class for DRAW_RULE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DRAW_RULE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoanDrawExpirationDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="LoanDrawExtensionTermMonthsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="LoanDrawMaximumAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="LoanDrawMaximumTermMonthsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="LoanDrawMinimumAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="LoanDrawMinimumInitialDrawAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="LoanDrawPeriodMaximumDrawCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="LoanDrawStartPeriodMonthsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="LoanDrawTermMonthsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}DRAW_RULE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "DRAW_RULE", propOrder = {
    "loanDrawExpirationDate",
    "loanDrawExtensionTermMonthsCount",
    "loanDrawMaximumAmount",
    "loanDrawMaximumTermMonthsCount",
    "loanDrawMinimumAmount",
    "loanDrawMinimumInitialDrawAmount",
    "loanDrawPeriodMaximumDrawCount",
    "loanDrawStartPeriodMonthsCount",
    "loanDrawTermMonthsCount",
    "extension"
})
public class DRAWRULE {

    @XmlElementRef(name = "LoanDrawExpirationDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> loanDrawExpirationDate;
    @XmlElementRef(name = "LoanDrawExtensionTermMonthsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> loanDrawExtensionTermMonthsCount;
    @XmlElementRef(name = "LoanDrawMaximumAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> loanDrawMaximumAmount;
    @XmlElementRef(name = "LoanDrawMaximumTermMonthsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> loanDrawMaximumTermMonthsCount;
    @XmlElementRef(name = "LoanDrawMinimumAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> loanDrawMinimumAmount;
    @XmlElementRef(name = "LoanDrawMinimumInitialDrawAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> loanDrawMinimumInitialDrawAmount;
    @XmlElementRef(name = "LoanDrawPeriodMaximumDrawCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> loanDrawPeriodMaximumDrawCount;
    @XmlElementRef(name = "LoanDrawStartPeriodMonthsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> loanDrawStartPeriodMonthsCount;
    @XmlElementRef(name = "LoanDrawTermMonthsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> loanDrawTermMonthsCount;
    @XmlElement(name = "EXTENSION")
    protected DRAWRULEEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the loanDrawExpirationDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public JAXBElement<MISMODate> getLoanDrawExpirationDate() {
        return loanDrawExpirationDate;
    }

    /**
     * Sets the value of the loanDrawExpirationDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public void setLoanDrawExpirationDate(JAXBElement<MISMODate> value) {
        this.loanDrawExpirationDate = value;
    }

    /**
     * Gets the value of the loanDrawExtensionTermMonthsCount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public JAXBElement<MISMOCount> getLoanDrawExtensionTermMonthsCount() {
        return loanDrawExtensionTermMonthsCount;
    }

    /**
     * Sets the value of the loanDrawExtensionTermMonthsCount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public void setLoanDrawExtensionTermMonthsCount(JAXBElement<MISMOCount> value) {
        this.loanDrawExtensionTermMonthsCount = value;
    }

    /**
     * Gets the value of the loanDrawMaximumAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getLoanDrawMaximumAmount() {
        return loanDrawMaximumAmount;
    }

    /**
     * Sets the value of the loanDrawMaximumAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setLoanDrawMaximumAmount(JAXBElement<MISMOAmount> value) {
        this.loanDrawMaximumAmount = value;
    }

    /**
     * Gets the value of the loanDrawMaximumTermMonthsCount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public JAXBElement<MISMOCount> getLoanDrawMaximumTermMonthsCount() {
        return loanDrawMaximumTermMonthsCount;
    }

    /**
     * Sets the value of the loanDrawMaximumTermMonthsCount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public void setLoanDrawMaximumTermMonthsCount(JAXBElement<MISMOCount> value) {
        this.loanDrawMaximumTermMonthsCount = value;
    }

    /**
     * Gets the value of the loanDrawMinimumAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getLoanDrawMinimumAmount() {
        return loanDrawMinimumAmount;
    }

    /**
     * Sets the value of the loanDrawMinimumAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setLoanDrawMinimumAmount(JAXBElement<MISMOAmount> value) {
        this.loanDrawMinimumAmount = value;
    }

    /**
     * Gets the value of the loanDrawMinimumInitialDrawAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getLoanDrawMinimumInitialDrawAmount() {
        return loanDrawMinimumInitialDrawAmount;
    }

    /**
     * Sets the value of the loanDrawMinimumInitialDrawAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setLoanDrawMinimumInitialDrawAmount(JAXBElement<MISMOAmount> value) {
        this.loanDrawMinimumInitialDrawAmount = value;
    }

    /**
     * Gets the value of the loanDrawPeriodMaximumDrawCount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public JAXBElement<MISMOCount> getLoanDrawPeriodMaximumDrawCount() {
        return loanDrawPeriodMaximumDrawCount;
    }

    /**
     * Sets the value of the loanDrawPeriodMaximumDrawCount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public void setLoanDrawPeriodMaximumDrawCount(JAXBElement<MISMOCount> value) {
        this.loanDrawPeriodMaximumDrawCount = value;
    }

    /**
     * Gets the value of the loanDrawStartPeriodMonthsCount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public JAXBElement<MISMOCount> getLoanDrawStartPeriodMonthsCount() {
        return loanDrawStartPeriodMonthsCount;
    }

    /**
     * Sets the value of the loanDrawStartPeriodMonthsCount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public void setLoanDrawStartPeriodMonthsCount(JAXBElement<MISMOCount> value) {
        this.loanDrawStartPeriodMonthsCount = value;
    }

    /**
     * Gets the value of the loanDrawTermMonthsCount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public JAXBElement<MISMOCount> getLoanDrawTermMonthsCount() {
        return loanDrawTermMonthsCount;
    }

    /**
     * Sets the value of the loanDrawTermMonthsCount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public void setLoanDrawTermMonthsCount(JAXBElement<MISMOCount> value) {
        this.loanDrawTermMonthsCount = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link DRAWRULEEXTENSION }
     *
     */
    public DRAWRULEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link DRAWRULEEXTENSION }
     *
     */
    public void setEXTENSION(DRAWRULEEXTENSION value) {
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