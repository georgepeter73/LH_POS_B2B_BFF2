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
 * <p>Java class for FLOOD_RISK_FACTOR complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FLOOD_RISK_FACTOR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseFloodElevationFeetNumber" type="{http://www.mismo.org/residential/2009/schemas}MISMONumeric" minOccurs="0"/>
 *         &lt;element name="FloodDepthFeetNumber" type="{http://www.mismo.org/residential/2009/schemas}MISMONumeric" minOccurs="0"/>
 *         &lt;element name="PropertyElevationFeetNumber" type="{http://www.mismo.org/residential/2009/schemas}MISMONumeric" minOccurs="0"/>
 *         &lt;element name="SpecialFloodHazardAreaDistanceFeetNumber" type="{http://www.mismo.org/residential/2009/schemas}MISMONumeric" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}FLOOD_RISK_FACTOR_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "FLOOD_RISK_FACTOR", propOrder = {
    "baseFloodElevationFeetNumber",
    "floodDepthFeetNumber",
    "propertyElevationFeetNumber",
    "specialFloodHazardAreaDistanceFeetNumber",
    "extension"
})
public class FLOODRISKFACTOR {

    @XmlElementRef(name = "BaseFloodElevationFeetNumber", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMONumeric> baseFloodElevationFeetNumber;
    @XmlElementRef(name = "FloodDepthFeetNumber", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMONumeric> floodDepthFeetNumber;
    @XmlElementRef(name = "PropertyElevationFeetNumber", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMONumeric> propertyElevationFeetNumber;
    @XmlElementRef(name = "SpecialFloodHazardAreaDistanceFeetNumber", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMONumeric> specialFloodHazardAreaDistanceFeetNumber;
    @XmlElement(name = "EXTENSION")
    protected FLOODRISKFACTOREXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the baseFloodElevationFeetNumber property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMONumeric }{@code >}
     *
     */
    public JAXBElement<MISMONumeric> getBaseFloodElevationFeetNumber() {
        return baseFloodElevationFeetNumber;
    }

    /**
     * Sets the value of the baseFloodElevationFeetNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMONumeric }{@code >}
     *
     */
    public void setBaseFloodElevationFeetNumber(JAXBElement<MISMONumeric> value) {
        this.baseFloodElevationFeetNumber = value;
    }

    /**
     * Gets the value of the floodDepthFeetNumber property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMONumeric }{@code >}
     *
     */
    public JAXBElement<MISMONumeric> getFloodDepthFeetNumber() {
        return floodDepthFeetNumber;
    }

    /**
     * Sets the value of the floodDepthFeetNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMONumeric }{@code >}
     *
     */
    public void setFloodDepthFeetNumber(JAXBElement<MISMONumeric> value) {
        this.floodDepthFeetNumber = value;
    }

    /**
     * Gets the value of the propertyElevationFeetNumber property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMONumeric }{@code >}
     *
     */
    public JAXBElement<MISMONumeric> getPropertyElevationFeetNumber() {
        return propertyElevationFeetNumber;
    }

    /**
     * Sets the value of the propertyElevationFeetNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMONumeric }{@code >}
     *
     */
    public void setPropertyElevationFeetNumber(JAXBElement<MISMONumeric> value) {
        this.propertyElevationFeetNumber = value;
    }

    /**
     * Gets the value of the specialFloodHazardAreaDistanceFeetNumber property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMONumeric }{@code >}
     *
     */
    public JAXBElement<MISMONumeric> getSpecialFloodHazardAreaDistanceFeetNumber() {
        return specialFloodHazardAreaDistanceFeetNumber;
    }

    /**
     * Sets the value of the specialFloodHazardAreaDistanceFeetNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMONumeric }{@code >}
     *
     */
    public void setSpecialFloodHazardAreaDistanceFeetNumber(JAXBElement<MISMONumeric> value) {
        this.specialFloodHazardAreaDistanceFeetNumber = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link FLOODRISKFACTOREXTENSION }
     *
     */
    public FLOODRISKFACTOREXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link FLOODRISKFACTOREXTENSION }
     *
     */
    public void setEXTENSION(FLOODRISKFACTOREXTENSION value) {
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