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
 * A type of servitude that could impact the value or use of the property. Contains the specific details of the servitude occurrence.
 *
 * <p>Java class for CONDITION_COVENANT_RESTRICTION complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CONDITION_COVENANT_RESTRICTION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CovenantDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="CovenantType" type="{http://www.mismo.org/residential/2009/schemas}CovenantEnum" minOccurs="0"/>
 *         &lt;element name="CovenantTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="RestrictionDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="RestrictionType" type="{http://www.mismo.org/residential/2009/schemas}RestrictionEnum" minOccurs="0"/>
 *         &lt;element name="RestrictionTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ServitudeSignificanceType" type="{http://www.mismo.org/residential/2009/schemas}ServitudeSignificanceEnum" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}CONDITION_COVENANT_RESTRICTION_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "CONDITION_COVENANT_RESTRICTION", propOrder = {
    "covenantDescription",
    "covenantType",
    "covenantTypeOtherDescription",
    "restrictionDescription",
    "restrictionType",
    "restrictionTypeOtherDescription",
    "servitudeSignificanceType",
    "extension"
})
public class CONDITIONCOVENANTRESTRICTION {

    @XmlElementRef(name = "CovenantDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> covenantDescription;
    @XmlElementRef(name = "CovenantType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CovenantEnum> covenantType;
    @XmlElementRef(name = "CovenantTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> covenantTypeOtherDescription;
    @XmlElementRef(name = "RestrictionDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> restrictionDescription;
    @XmlElementRef(name = "RestrictionType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<RestrictionEnum> restrictionType;
    @XmlElementRef(name = "RestrictionTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> restrictionTypeOtherDescription;
    @XmlElementRef(name = "ServitudeSignificanceType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ServitudeSignificanceEnum> servitudeSignificanceType;
    @XmlElement(name = "EXTENSION")
    protected CONDITIONCOVENANTRESTRICTIONEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the covenantDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getCovenantDescription() {
        return covenantDescription;
    }

    /**
     * Sets the value of the covenantDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setCovenantDescription(JAXBElement<MISMOString> value) {
        this.covenantDescription = value;
    }

    /**
     * Gets the value of the covenantType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CovenantEnum }{@code >}
     *
     */
    public JAXBElement<CovenantEnum> getCovenantType() {
        return covenantType;
    }

    /**
     * Sets the value of the covenantType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CovenantEnum }{@code >}
     *
     */
    public void setCovenantType(JAXBElement<CovenantEnum> value) {
        this.covenantType = value;
    }

    /**
     * Gets the value of the covenantTypeOtherDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getCovenantTypeOtherDescription() {
        return covenantTypeOtherDescription;
    }

    /**
     * Sets the value of the covenantTypeOtherDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setCovenantTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.covenantTypeOtherDescription = value;
    }

    /**
     * Gets the value of the restrictionDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getRestrictionDescription() {
        return restrictionDescription;
    }

    /**
     * Sets the value of the restrictionDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setRestrictionDescription(JAXBElement<MISMOString> value) {
        this.restrictionDescription = value;
    }

    /**
     * Gets the value of the restrictionType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RestrictionEnum }{@code >}
     *
     */
    public JAXBElement<RestrictionEnum> getRestrictionType() {
        return restrictionType;
    }

    /**
     * Sets the value of the restrictionType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RestrictionEnum }{@code >}
     *
     */
    public void setRestrictionType(JAXBElement<RestrictionEnum> value) {
        this.restrictionType = value;
    }

    /**
     * Gets the value of the restrictionTypeOtherDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getRestrictionTypeOtherDescription() {
        return restrictionTypeOtherDescription;
    }

    /**
     * Sets the value of the restrictionTypeOtherDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setRestrictionTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.restrictionTypeOtherDescription = value;
    }

    /**
     * Gets the value of the servitudeSignificanceType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServitudeSignificanceEnum }{@code >}
     *
     */
    public JAXBElement<ServitudeSignificanceEnum> getServitudeSignificanceType() {
        return servitudeSignificanceType;
    }

    /**
     * Sets the value of the servitudeSignificanceType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServitudeSignificanceEnum }{@code >}
     *
     */
    public void setServitudeSignificanceType(JAXBElement<ServitudeSignificanceEnum> value) {
        this.servitudeSignificanceType = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link CONDITIONCOVENANTRESTRICTIONEXTENSION }
     *
     */
    public CONDITIONCOVENANTRESTRICTIONEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link CONDITIONCOVENANTRESTRICTIONEXTENSION }
     *
     */
    public void setEXTENSION(CONDITIONCOVENANTRESTRICTIONEXTENSION value) {
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
