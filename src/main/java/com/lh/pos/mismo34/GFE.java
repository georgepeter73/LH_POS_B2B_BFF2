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
 * Form specific information about the Good Faith Estimate (GFE)
 *
 * <p>Java class for GFE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GFE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GFE_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}GFE_DETAIL" minOccurs="0"/>
 *         &lt;element name="GFE_SECTION_SUMMARIES" type="{http://www.mismo.org/residential/2009/schemas}GFE_SECTION_SUMMARIES" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}GFE_EXTENSION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GFE", propOrder = {
    "gfedetail",
    "gfesectionsummaries",
    "extension"
})
public class GFE {

    @XmlElement(name = "GFE_DETAIL")
    protected GFEDETAIL gfedetail;
    @XmlElement(name = "GFE_SECTION_SUMMARIES")
    protected GFESECTIONSUMMARIES gfesectionsummaries;
    @XmlElement(name = "EXTENSION")
    protected GFEEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the gfedetail property.
     *
     * @return
     *     possible object is
     *     {@link GFEDETAIL }
     *
     */
    public GFEDETAIL getGFEDETAIL() {
        return gfedetail;
    }

    /**
     * Sets the value of the gfedetail property.
     *
     * @param value
     *     allowed object is
     *     {@link GFEDETAIL }
     *
     */
    public void setGFEDETAIL(GFEDETAIL value) {
        this.gfedetail = value;
    }

    /**
     * Gets the value of the gfesectionsummaries property.
     *
     * @return
     *     possible object is
     *     {@link GFESECTIONSUMMARIES }
     *
     */
    public GFESECTIONSUMMARIES getGFESECTIONSUMMARIES() {
        return gfesectionsummaries;
    }

    /**
     * Sets the value of the gfesectionsummaries property.
     *
     * @param value
     *     allowed object is
     *     {@link GFESECTIONSUMMARIES }
     *
     */
    public void setGFESECTIONSUMMARIES(GFESECTIONSUMMARIES value) {
        this.gfesectionsummaries = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link GFEEXTENSION }
     *
     */
    public GFEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link GFEEXTENSION }
     *
     */
    public void setEXTENSION(GFEEXTENSION value) {
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
