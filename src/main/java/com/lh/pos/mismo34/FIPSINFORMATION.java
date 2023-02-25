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
 * <p>Java class for FIPS_INFORMATION complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FIPS_INFORMATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FIPSCountryCode" type="{http://www.mismo.org/residential/2009/schemas}MISMOCode" minOccurs="0"/>
 *         &lt;element name="FIPSCountyCode" type="{http://www.mismo.org/residential/2009/schemas}MISMOCode" minOccurs="0"/>
 *         &lt;element name="FIPSCountySubdivisionCode" type="{http://www.mismo.org/residential/2009/schemas}MISMOCode" minOccurs="0"/>
 *         &lt;element name="FIPSCountySubdivisionName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="FIPSCountySubdivisionType" type="{http://www.mismo.org/residential/2009/schemas}FIPSCountySubdivisionEnum" minOccurs="0"/>
 *         &lt;element name="FIPSPlaceCode" type="{http://www.mismo.org/residential/2009/schemas}MISMOCode" minOccurs="0"/>
 *         &lt;element name="FIPSPlaceName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="FIPSStateAlphaCode" type="{http://www.mismo.org/residential/2009/schemas}MISMOCode" minOccurs="0"/>
 *         &lt;element name="FIPSStateNumericCode" type="{http://www.mismo.org/residential/2009/schemas}MISMOCode" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}FIPS_INFORMATION_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "FIPS_INFORMATION", propOrder = {
    "fipsCountryCode",
    "fipsCountyCode",
    "fipsCountySubdivisionCode",
    "fipsCountySubdivisionName",
    "fipsCountySubdivisionType",
    "fipsPlaceCode",
    "fipsPlaceName",
    "fipsStateAlphaCode",
    "fipsStateNumericCode",
    "extension"
})
public class FIPSINFORMATION {

    @XmlElementRef(name = "FIPSCountryCode", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCode> fipsCountryCode;
    @XmlElementRef(name = "FIPSCountyCode", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCode> fipsCountyCode;
    @XmlElementRef(name = "FIPSCountySubdivisionCode", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCode> fipsCountySubdivisionCode;
    @XmlElementRef(name = "FIPSCountySubdivisionName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> fipsCountySubdivisionName;
    @XmlElementRef(name = "FIPSCountySubdivisionType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<FIPSCountySubdivisionEnum> fipsCountySubdivisionType;
    @XmlElementRef(name = "FIPSPlaceCode", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCode> fipsPlaceCode;
    @XmlElementRef(name = "FIPSPlaceName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> fipsPlaceName;
    @XmlElementRef(name = "FIPSStateAlphaCode", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCode> fipsStateAlphaCode;
    @XmlElementRef(name = "FIPSStateNumericCode", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCode> fipsStateNumericCode;
    @XmlElement(name = "EXTENSION")
    protected FIPSINFORMATIONEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the fipsCountryCode property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *
     */
    public JAXBElement<MISMOCode> getFIPSCountryCode() {
        return fipsCountryCode;
    }

    /**
     * Sets the value of the fipsCountryCode property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *
     */
    public void setFIPSCountryCode(JAXBElement<MISMOCode> value) {
        this.fipsCountryCode = value;
    }

    /**
     * Gets the value of the fipsCountyCode property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *
     */
    public JAXBElement<MISMOCode> getFIPSCountyCode() {
        return fipsCountyCode;
    }

    /**
     * Sets the value of the fipsCountyCode property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *
     */
    public void setFIPSCountyCode(JAXBElement<MISMOCode> value) {
        this.fipsCountyCode = value;
    }

    /**
     * Gets the value of the fipsCountySubdivisionCode property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *
     */
    public JAXBElement<MISMOCode> getFIPSCountySubdivisionCode() {
        return fipsCountySubdivisionCode;
    }

    /**
     * Sets the value of the fipsCountySubdivisionCode property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *
     */
    public void setFIPSCountySubdivisionCode(JAXBElement<MISMOCode> value) {
        this.fipsCountySubdivisionCode = value;
    }

    /**
     * Gets the value of the fipsCountySubdivisionName property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getFIPSCountySubdivisionName() {
        return fipsCountySubdivisionName;
    }

    /**
     * Sets the value of the fipsCountySubdivisionName property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setFIPSCountySubdivisionName(JAXBElement<MISMOString> value) {
        this.fipsCountySubdivisionName = value;
    }

    /**
     * Gets the value of the fipsCountySubdivisionType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FIPSCountySubdivisionEnum }{@code >}
     *
     */
    public JAXBElement<FIPSCountySubdivisionEnum> getFIPSCountySubdivisionType() {
        return fipsCountySubdivisionType;
    }

    /**
     * Sets the value of the fipsCountySubdivisionType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FIPSCountySubdivisionEnum }{@code >}
     *
     */
    public void setFIPSCountySubdivisionType(JAXBElement<FIPSCountySubdivisionEnum> value) {
        this.fipsCountySubdivisionType = value;
    }

    /**
     * Gets the value of the fipsPlaceCode property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *
     */
    public JAXBElement<MISMOCode> getFIPSPlaceCode() {
        return fipsPlaceCode;
    }

    /**
     * Sets the value of the fipsPlaceCode property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *
     */
    public void setFIPSPlaceCode(JAXBElement<MISMOCode> value) {
        this.fipsPlaceCode = value;
    }

    /**
     * Gets the value of the fipsPlaceName property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getFIPSPlaceName() {
        return fipsPlaceName;
    }

    /**
     * Sets the value of the fipsPlaceName property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setFIPSPlaceName(JAXBElement<MISMOString> value) {
        this.fipsPlaceName = value;
    }

    /**
     * Gets the value of the fipsStateAlphaCode property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *
     */
    public JAXBElement<MISMOCode> getFIPSStateAlphaCode() {
        return fipsStateAlphaCode;
    }

    /**
     * Sets the value of the fipsStateAlphaCode property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *
     */
    public void setFIPSStateAlphaCode(JAXBElement<MISMOCode> value) {
        this.fipsStateAlphaCode = value;
    }

    /**
     * Gets the value of the fipsStateNumericCode property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *
     */
    public JAXBElement<MISMOCode> getFIPSStateNumericCode() {
        return fipsStateNumericCode;
    }

    /**
     * Sets the value of the fipsStateNumericCode property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *
     */
    public void setFIPSStateNumericCode(JAXBElement<MISMOCode> value) {
        this.fipsStateNumericCode = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link FIPSINFORMATIONEXTENSION }
     *
     */
    public FIPSINFORMATIONEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link FIPSINFORMATIONEXTENSION }
     *
     */
    public void setEXTENSION(FIPSINFORMATIONEXTENSION value) {
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
