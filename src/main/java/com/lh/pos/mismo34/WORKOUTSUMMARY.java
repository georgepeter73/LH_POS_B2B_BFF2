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
 * Summary information about workouts that have occurred or were attempted on the loan.
 *
 * <p>Java class for WORKOUT_SUMMARY complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="WORKOUT_SUMMARY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LifeOfLoanBorrowerAssistancePaidAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="LifeOfLoanWorkoutModificationCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="LifeOfLoanWorkoutModificationDefaultedCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}WORKOUT_SUMMARY_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "WORKOUT_SUMMARY", propOrder = {
    "lifeOfLoanBorrowerAssistancePaidAmount",
    "lifeOfLoanWorkoutModificationCount",
    "lifeOfLoanWorkoutModificationDefaultedCount",
    "extension"
})
public class WORKOUTSUMMARY {

    @XmlElementRef(name = "LifeOfLoanBorrowerAssistancePaidAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> lifeOfLoanBorrowerAssistancePaidAmount;
    @XmlElementRef(name = "LifeOfLoanWorkoutModificationCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> lifeOfLoanWorkoutModificationCount;
    @XmlElementRef(name = "LifeOfLoanWorkoutModificationDefaultedCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> lifeOfLoanWorkoutModificationDefaultedCount;
    @XmlElement(name = "EXTENSION")
    protected WORKOUTSUMMARYEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the lifeOfLoanBorrowerAssistancePaidAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getLifeOfLoanBorrowerAssistancePaidAmount() {
        return lifeOfLoanBorrowerAssistancePaidAmount;
    }

    /**
     * Sets the value of the lifeOfLoanBorrowerAssistancePaidAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setLifeOfLoanBorrowerAssistancePaidAmount(JAXBElement<MISMOAmount> value) {
        this.lifeOfLoanBorrowerAssistancePaidAmount = value;
    }

    /**
     * Gets the value of the lifeOfLoanWorkoutModificationCount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public JAXBElement<MISMOCount> getLifeOfLoanWorkoutModificationCount() {
        return lifeOfLoanWorkoutModificationCount;
    }

    /**
     * Sets the value of the lifeOfLoanWorkoutModificationCount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public void setLifeOfLoanWorkoutModificationCount(JAXBElement<MISMOCount> value) {
        this.lifeOfLoanWorkoutModificationCount = value;
    }

    /**
     * Gets the value of the lifeOfLoanWorkoutModificationDefaultedCount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public JAXBElement<MISMOCount> getLifeOfLoanWorkoutModificationDefaultedCount() {
        return lifeOfLoanWorkoutModificationDefaultedCount;
    }

    /**
     * Sets the value of the lifeOfLoanWorkoutModificationDefaultedCount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public void setLifeOfLoanWorkoutModificationDefaultedCount(JAXBElement<MISMOCount> value) {
        this.lifeOfLoanWorkoutModificationDefaultedCount = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link WORKOUTSUMMARYEXTENSION }
     *
     */
    public WORKOUTSUMMARYEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link WORKOUTSUMMARYEXTENSION }
     *
     */
    public void setEXTENSION(WORKOUTSUMMARYEXTENSION value) {
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
