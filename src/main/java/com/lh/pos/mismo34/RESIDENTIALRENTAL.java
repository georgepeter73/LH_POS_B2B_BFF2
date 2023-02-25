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
 * <p>Java class for RESIDENTIAL_RENTAL complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RESIDENTIAL_RENTAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RENT_ADJUSTMENTS" type="{http://www.mismo.org/residential/2009/schemas}RENT_ADJUSTMENTS" minOccurs="0"/>
 *         &lt;element name="RESIDENTIAL_RENTAL_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}RESIDENTIAL_RENTAL_DETAIL" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}RESIDENTIAL_RENTAL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "RESIDENTIAL_RENTAL", propOrder = {
    "rentadjustments",
    "residentialrentaldetail",
    "extension"
})
public class RESIDENTIALRENTAL {

    @XmlElement(name = "RENT_ADJUSTMENTS")
    protected RENTADJUSTMENTS rentadjustments;
    @XmlElement(name = "RESIDENTIAL_RENTAL_DETAIL")
    protected RESIDENTIALRENTALDETAIL residentialrentaldetail;
    @XmlElement(name = "EXTENSION")
    protected RESIDENTIALRENTALEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the rentadjustments property.
     *
     * @return
     *     possible object is
     *     {@link RENTADJUSTMENTS }
     *
     */
    public RENTADJUSTMENTS getRENTADJUSTMENTS() {
        return rentadjustments;
    }

    /**
     * Sets the value of the rentadjustments property.
     *
     * @param value
     *     allowed object is
     *     {@link RENTADJUSTMENTS }
     *
     */
    public void setRENTADJUSTMENTS(RENTADJUSTMENTS value) {
        this.rentadjustments = value;
    }

    /**
     * Gets the value of the residentialrentaldetail property.
     *
     * @return
     *     possible object is
     *     {@link RESIDENTIALRENTALDETAIL }
     *
     */
    public RESIDENTIALRENTALDETAIL getRESIDENTIALRENTALDETAIL() {
        return residentialrentaldetail;
    }

    /**
     * Sets the value of the residentialrentaldetail property.
     *
     * @param value
     *     allowed object is
     *     {@link RESIDENTIALRENTALDETAIL }
     *
     */
    public void setRESIDENTIALRENTALDETAIL(RESIDENTIALRENTALDETAIL value) {
        this.residentialrentaldetail = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link RESIDENTIALRENTALEXTENSION }
     *
     */
    public RESIDENTIALRENTALEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link RESIDENTIALRENTALEXTENSION }
     *
     */
    public void setEXTENSION(RESIDENTIALRENTALEXTENSION value) {
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
