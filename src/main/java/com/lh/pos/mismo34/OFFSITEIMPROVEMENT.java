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
 * Information about the type, ownership, condition and other facts about the off-site improvements associated with the property.
 *
 * <p>Java class for OFF_SITE_IMPROVEMENT complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="OFF_SITE_IMPROVEMENT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConditionRatingType" type="{http://www.mismo.org/residential/2009/schemas}ConditionRatingEnum" minOccurs="0"/>
 *         &lt;element name="OffSiteImprovementDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="OffSiteImprovementOwnershipType" type="{http://www.mismo.org/residential/2009/schemas}OffSiteImprovementOwnershipEnum" minOccurs="0"/>
 *         &lt;element name="OffSiteImprovementsUtilityNotTypicalDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="OffSiteImprovementsUtilityTypicalIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="OffSiteImprovementType" type="{http://www.mismo.org/residential/2009/schemas}OffSiteImprovementEnum" minOccurs="0"/>
 *         &lt;element name="OffSiteImprovementTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}OFF_SITE_IMPROVEMENT_EXTENSION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
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
@XmlType(name = "OFF_SITE_IMPROVEMENT", propOrder = {
    "conditionRatingType",
    "offSiteImprovementDescription",
    "offSiteImprovementOwnershipType",
    "offSiteImprovementsUtilityNotTypicalDescription",
    "offSiteImprovementsUtilityTypicalIndicator",
    "offSiteImprovementType",
    "offSiteImprovementTypeOtherDescription",
    "extension"
})
public class OFFSITEIMPROVEMENT {

    @XmlElementRef(name = "ConditionRatingType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ConditionRatingEnum> conditionRatingType;
    @XmlElementRef(name = "OffSiteImprovementDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> offSiteImprovementDescription;
    @XmlElementRef(name = "OffSiteImprovementOwnershipType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<OffSiteImprovementOwnershipEnum> offSiteImprovementOwnershipType;
    @XmlElementRef(name = "OffSiteImprovementsUtilityNotTypicalDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> offSiteImprovementsUtilityNotTypicalDescription;
    @XmlElementRef(name = "OffSiteImprovementsUtilityTypicalIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> offSiteImprovementsUtilityTypicalIndicator;
    @XmlElementRef(name = "OffSiteImprovementType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<OffSiteImprovementEnum> offSiteImprovementType;
    @XmlElementRef(name = "OffSiteImprovementTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> offSiteImprovementTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected OFFSITEIMPROVEMENTEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the conditionRatingType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConditionRatingEnum }{@code >}
     *
     */
    public JAXBElement<ConditionRatingEnum> getConditionRatingType() {
        return conditionRatingType;
    }

    /**
     * Sets the value of the conditionRatingType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConditionRatingEnum }{@code >}
     *
     */
    public void setConditionRatingType(JAXBElement<ConditionRatingEnum> value) {
        this.conditionRatingType = value;
    }

    /**
     * Gets the value of the offSiteImprovementDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getOffSiteImprovementDescription() {
        return offSiteImprovementDescription;
    }

    /**
     * Sets the value of the offSiteImprovementDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setOffSiteImprovementDescription(JAXBElement<MISMOString> value) {
        this.offSiteImprovementDescription = value;
    }

    /**
     * Gets the value of the offSiteImprovementOwnershipType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OffSiteImprovementOwnershipEnum }{@code >}
     *
     */
    public JAXBElement<OffSiteImprovementOwnershipEnum> getOffSiteImprovementOwnershipType() {
        return offSiteImprovementOwnershipType;
    }

    /**
     * Sets the value of the offSiteImprovementOwnershipType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OffSiteImprovementOwnershipEnum }{@code >}
     *
     */
    public void setOffSiteImprovementOwnershipType(JAXBElement<OffSiteImprovementOwnershipEnum> value) {
        this.offSiteImprovementOwnershipType = value;
    }

    /**
     * Gets the value of the offSiteImprovementsUtilityNotTypicalDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getOffSiteImprovementsUtilityNotTypicalDescription() {
        return offSiteImprovementsUtilityNotTypicalDescription;
    }

    /**
     * Sets the value of the offSiteImprovementsUtilityNotTypicalDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setOffSiteImprovementsUtilityNotTypicalDescription(JAXBElement<MISMOString> value) {
        this.offSiteImprovementsUtilityNotTypicalDescription = value;
    }

    /**
     * Gets the value of the offSiteImprovementsUtilityTypicalIndicator property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public JAXBElement<MISMOIndicator> getOffSiteImprovementsUtilityTypicalIndicator() {
        return offSiteImprovementsUtilityTypicalIndicator;
    }

    /**
     * Sets the value of the offSiteImprovementsUtilityTypicalIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public void setOffSiteImprovementsUtilityTypicalIndicator(JAXBElement<MISMOIndicator> value) {
        this.offSiteImprovementsUtilityTypicalIndicator = value;
    }

    /**
     * Gets the value of the offSiteImprovementType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OffSiteImprovementEnum }{@code >}
     *
     */
    public JAXBElement<OffSiteImprovementEnum> getOffSiteImprovementType() {
        return offSiteImprovementType;
    }

    /**
     * Sets the value of the offSiteImprovementType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OffSiteImprovementEnum }{@code >}
     *
     */
    public void setOffSiteImprovementType(JAXBElement<OffSiteImprovementEnum> value) {
        this.offSiteImprovementType = value;
    }

    /**
     * Gets the value of the offSiteImprovementTypeOtherDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getOffSiteImprovementTypeOtherDescription() {
        return offSiteImprovementTypeOtherDescription;
    }

    /**
     * Sets the value of the offSiteImprovementTypeOtherDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setOffSiteImprovementTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.offSiteImprovementTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link OFFSITEIMPROVEMENTEXTENSION }
     *
     */
    public OFFSITEIMPROVEMENTEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link OFFSITEIMPROVEMENTEXTENSION }
     *
     */
    public void setEXTENSION(OFFSITEIMPROVEMENTEXTENSION value) {
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
