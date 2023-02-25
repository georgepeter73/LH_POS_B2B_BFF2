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
 * Information about the inventories, trends and other facts about the market area of the property. A market is described in terms of  its supply and demand characteristics for property in a given geographic location and economic condition.
 *
 * <p>Java class for MARKET complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MARKET">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MARKET_INVENTORIES" type="{http://www.mismo.org/residential/2009/schemas}MARKET_INVENTORIES" minOccurs="0"/>
 *         &lt;element name="MARKET_TREND" type="{http://www.mismo.org/residential/2009/schemas}MARKET_TREND" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}MARKET_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "MARKET", propOrder = {
    "marketinventories",
    "markettrend",
    "extension"
})
public class MARKET {

    @XmlElement(name = "MARKET_INVENTORIES")
    protected MARKETINVENTORIES marketinventories;
    @XmlElement(name = "MARKET_TREND")
    protected MARKETTREND markettrend;
    @XmlElement(name = "EXTENSION")
    protected MARKETEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the marketinventories property.
     *
     * @return
     *     possible object is
     *     {@link MARKETINVENTORIES }
     *
     */
    public MARKETINVENTORIES getMARKETINVENTORIES() {
        return marketinventories;
    }

    /**
     * Sets the value of the marketinventories property.
     *
     * @param value
     *     allowed object is
     *     {@link MARKETINVENTORIES }
     *
     */
    public void setMARKETINVENTORIES(MARKETINVENTORIES value) {
        this.marketinventories = value;
    }

    /**
     * Gets the value of the markettrend property.
     *
     * @return
     *     possible object is
     *     {@link MARKETTREND }
     *
     */
    public MARKETTREND getMARKETTREND() {
        return markettrend;
    }

    /**
     * Sets the value of the markettrend property.
     *
     * @param value
     *     allowed object is
     *     {@link MARKETTREND }
     *
     */
    public void setMARKETTREND(MARKETTREND value) {
        this.markettrend = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link MARKETEXTENSION }
     *
     */
    public MARKETEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link MARKETEXTENSION }
     *
     */
    public void setEXTENSION(MARKETEXTENSION value) {
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
