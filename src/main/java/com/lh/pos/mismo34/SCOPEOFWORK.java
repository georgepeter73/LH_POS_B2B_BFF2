//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2020.02.11 at 08:03:21 AM EST
//


package com.lh.pos.mismo34;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * Contains the details pertinent to the appraisal assignment that the appraiser must accept and abide by in the fulfillment of an appraisal assignment.
 *
 * <p>Java class for SCOPE_OF_WORK complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SCOPE_OF_WORK">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENCUMBRANCES" type="{http://www.mismo.org/residential/2009/schemas}ENCUMBRANCES" minOccurs="0"/>
 *         &lt;element name="REAL_PROPERTY_INTERESTS" type="{http://www.mismo.org/residential/2009/schemas}REAL_PROPERTY_INTERESTS" minOccurs="0"/>
 *         &lt;element name="SCOPE_OF_WORK_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}SCOPE_OF_WORK_DETAIL" minOccurs="0"/>
 *         &lt;element name="VALUATION_INTENDED_USERS" type="{http://www.mismo.org/residential/2009/schemas}VALUATION_INTENDED_USERS" minOccurs="0"/>
 *         &lt;element name="VALUATION_INTENDED_USES" type="{http://www.mismo.org/residential/2009/schemas}VALUATION_INTENDED_USES" minOccurs="0"/>
 *         &lt;element name="VALUE_DEFINITIONS" type="{http://www.mismo.org/residential/2009/schemas}VALUE_DEFINITIONS" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}SCOPE_OF_WORK_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "SCOPE_OF_WORK", propOrder = {
    "encumbrances",
    "realpropertyinterests",
    "scopeofworkdetail",
    "valuationintendedusers",
    "valuationintendeduses",
    "valuedefinitions",
    "extension"
})
public class SCOPEOFWORK {

    @XmlElement(name = "ENCUMBRANCES")
    protected ENCUMBRANCES encumbrances;
    @XmlElement(name = "REAL_PROPERTY_INTERESTS")
    protected REALPROPERTYINTERESTS realpropertyinterests;
    @XmlElement(name = "SCOPE_OF_WORK_DETAIL")
    protected SCOPEOFWORKDETAIL scopeofworkdetail;
    @XmlElement(name = "VALUATION_INTENDED_USERS")
    protected VALUATIONINTENDEDUSERS valuationintendedusers;
    @XmlElement(name = "VALUATION_INTENDED_USES")
    protected VALUATIONINTENDEDUSES valuationintendeduses;
    @XmlElement(name = "VALUE_DEFINITIONS")
    protected VALUEDEFINITIONS valuedefinitions;
    @XmlElement(name = "EXTENSION")
    protected SCOPEOFWORKEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the encumbrances property.
     *
     * @return
     *     possible object is
     *     {@link ENCUMBRANCES }
     *
     */
    public ENCUMBRANCES getENCUMBRANCES() {
        return encumbrances;
    }

    /**
     * Sets the value of the encumbrances property.
     *
     * @param value
     *     allowed object is
     *     {@link ENCUMBRANCES }
     *
     */
    public void setENCUMBRANCES(ENCUMBRANCES value) {
        this.encumbrances = value;
    }

    /**
     * Gets the value of the realpropertyinterests property.
     *
     * @return
     *     possible object is
     *     {@link REALPROPERTYINTERESTS }
     *
     */
    public REALPROPERTYINTERESTS getREALPROPERTYINTERESTS() {
        return realpropertyinterests;
    }

    /**
     * Sets the value of the realpropertyinterests property.
     *
     * @param value
     *     allowed object is
     *     {@link REALPROPERTYINTERESTS }
     *
     */
    public void setREALPROPERTYINTERESTS(REALPROPERTYINTERESTS value) {
        this.realpropertyinterests = value;
    }

    /**
     * Gets the value of the scopeofworkdetail property.
     *
     * @return
     *     possible object is
     *     {@link SCOPEOFWORKDETAIL }
     *
     */
    public SCOPEOFWORKDETAIL getSCOPEOFWORKDETAIL() {
        return scopeofworkdetail;
    }

    /**
     * Sets the value of the scopeofworkdetail property.
     *
     * @param value
     *     allowed object is
     *     {@link SCOPEOFWORKDETAIL }
     *
     */
    public void setSCOPEOFWORKDETAIL(SCOPEOFWORKDETAIL value) {
        this.scopeofworkdetail = value;
    }

    /**
     * Gets the value of the valuationintendedusers property.
     *
     * @return
     *     possible object is
     *     {@link VALUATIONINTENDEDUSERS }
     *
     */
    public VALUATIONINTENDEDUSERS getVALUATIONINTENDEDUSERS() {
        return valuationintendedusers;
    }

    /**
     * Sets the value of the valuationintendedusers property.
     *
     * @param value
     *     allowed object is
     *     {@link VALUATIONINTENDEDUSERS }
     *
     */
    public void setVALUATIONINTENDEDUSERS(VALUATIONINTENDEDUSERS value) {
        this.valuationintendedusers = value;
    }

    /**
     * Gets the value of the valuationintendeduses property.
     *
     * @return
     *     possible object is
     *     {@link VALUATIONINTENDEDUSES }
     *
     */
    public VALUATIONINTENDEDUSES getVALUATIONINTENDEDUSES() {
        return valuationintendeduses;
    }

    /**
     * Sets the value of the valuationintendeduses property.
     *
     * @param value
     *     allowed object is
     *     {@link VALUATIONINTENDEDUSES }
     *
     */
    public void setVALUATIONINTENDEDUSES(VALUATIONINTENDEDUSES value) {
        this.valuationintendeduses = value;
    }

    /**
     * Gets the value of the valuedefinitions property.
     *
     * @return
     *     possible object is
     *     {@link VALUEDEFINITIONS }
     *
     */
    public VALUEDEFINITIONS getVALUEDEFINITIONS() {
        return valuedefinitions;
    }

    /**
     * Sets the value of the valuedefinitions property.
     *
     * @param value
     *     allowed object is
     *     {@link VALUEDEFINITIONS }
     *
     */
    public void setVALUEDEFINITIONS(VALUEDEFINITIONS value) {
        this.valuedefinitions = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link SCOPEOFWORKEXTENSION }
     *
     */
    public SCOPEOFWORKEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link SCOPEOFWORKEXTENSION }
     *
     */
    public void setEXTENSION(SCOPEOFWORKEXTENSION value) {
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
