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
 * Replaces RESPA_HUD_DETAIL container from V2
 *
 * <p>Java class for HUD1_DETAIL complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="HUD1_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HUD1CashToOrFromBorrowerIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="HUD1CashToOrFromSellerIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="HUD1ConventionalInsuredIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="HUD1FileNumberIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="HUD1SettlementDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}HUD1_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "HUD1_DETAIL", propOrder = {
    "hud1CashToOrFromBorrowerIndicator",
    "hud1CashToOrFromSellerIndicator",
    "hud1ConventionalInsuredIndicator",
    "hud1FileNumberIdentifier",
    "hud1SettlementDate",
    "extension"
})
public class HUD1DETAIL {

    @XmlElementRef(name = "HUD1CashToOrFromBorrowerIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> hud1CashToOrFromBorrowerIndicator;
    @XmlElementRef(name = "HUD1CashToOrFromSellerIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> hud1CashToOrFromSellerIndicator;
    @XmlElementRef(name = "HUD1ConventionalInsuredIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> hud1ConventionalInsuredIndicator;
    @XmlElementRef(name = "HUD1FileNumberIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> hud1FileNumberIdentifier;
    @XmlElementRef(name = "HUD1SettlementDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> hud1SettlementDate;
    @XmlElement(name = "EXTENSION")
    protected HUD1DETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the hud1CashToOrFromBorrowerIndicator property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public JAXBElement<MISMOIndicator> getHUD1CashToOrFromBorrowerIndicator() {
        return hud1CashToOrFromBorrowerIndicator;
    }

    /**
     * Sets the value of the hud1CashToOrFromBorrowerIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public void setHUD1CashToOrFromBorrowerIndicator(JAXBElement<MISMOIndicator> value) {
        this.hud1CashToOrFromBorrowerIndicator = value;
    }

    /**
     * Gets the value of the hud1CashToOrFromSellerIndicator property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public JAXBElement<MISMOIndicator> getHUD1CashToOrFromSellerIndicator() {
        return hud1CashToOrFromSellerIndicator;
    }

    /**
     * Sets the value of the hud1CashToOrFromSellerIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public void setHUD1CashToOrFromSellerIndicator(JAXBElement<MISMOIndicator> value) {
        this.hud1CashToOrFromSellerIndicator = value;
    }

    /**
     * Gets the value of the hud1ConventionalInsuredIndicator property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public JAXBElement<MISMOIndicator> getHUD1ConventionalInsuredIndicator() {
        return hud1ConventionalInsuredIndicator;
    }

    /**
     * Sets the value of the hud1ConventionalInsuredIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public void setHUD1ConventionalInsuredIndicator(JAXBElement<MISMOIndicator> value) {
        this.hud1ConventionalInsuredIndicator = value;
    }

    /**
     * Gets the value of the hud1FileNumberIdentifier property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public JAXBElement<MISMOIdentifier> getHUD1FileNumberIdentifier() {
        return hud1FileNumberIdentifier;
    }

    /**
     * Sets the value of the hud1FileNumberIdentifier property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public void setHUD1FileNumberIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.hud1FileNumberIdentifier = value;
    }

    /**
     * Gets the value of the hud1SettlementDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public JAXBElement<MISMODate> getHUD1SettlementDate() {
        return hud1SettlementDate;
    }

    /**
     * Sets the value of the hud1SettlementDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public void setHUD1SettlementDate(JAXBElement<MISMODate> value) {
        this.hud1SettlementDate = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link HUD1DETAILEXTENSION }
     *
     */
    public HUD1DETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link HUD1DETAILEXTENSION }
     *
     */
    public void setEXTENSION(HUD1DETAILEXTENSION value) {
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
