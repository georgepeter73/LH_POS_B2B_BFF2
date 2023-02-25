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
 * <p>Java class for MI_APPLICATION_RESPONSE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MI_APPLICATION_RESPONSE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CONDITIONS" type="{http://www.mismo.org/residential/2009/schemas}CONDITIONS" minOccurs="0"/>
 *         &lt;element name="CONTACT_POINTS" type="{http://www.mismo.org/residential/2009/schemas}CONTACT_POINTS" minOccurs="0"/>
 *         &lt;element name="LOAN_IDENTIFIERS" type="{http://www.mismo.org/residential/2009/schemas}LOAN_IDENTIFIERS" minOccurs="0"/>
 *         &lt;element name="MI_APPLICATION_RESPONSE_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}MI_APPLICATION_RESPONSE_DETAIL" minOccurs="0"/>
 *         &lt;element name="MI_PREMIUM_TAXES" type="{http://www.mismo.org/residential/2009/schemas}MI_PREMIUM_TAXES" minOccurs="0"/>
 *         &lt;element name="MI_PREMIUMS" type="{http://www.mismo.org/residential/2009/schemas}MI_PREMIUMS" minOccurs="0"/>
 *         &lt;element name="PARTIES" type="{http://www.mismo.org/residential/2009/schemas}PARTIES" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}MI_APPLICATION_RESPONSE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "MI_APPLICATION_RESPONSE", propOrder = {
    "conditions",
    "contactpoints",
    "loanidentifiers",
    "miapplicationresponsedetail",
    "mipremiumtaxes",
    "mipremiums",
    "parties",
    "extension"
})
public class MIAPPLICATIONRESPONSE {

    @XmlElement(name = "CONDITIONS")
    protected CONDITIONS conditions;
    @XmlElement(name = "CONTACT_POINTS")
    protected CONTACTPOINTS contactpoints;
    @XmlElement(name = "LOAN_IDENTIFIERS")
    protected LOANIDENTIFIERS loanidentifiers;
    @XmlElement(name = "MI_APPLICATION_RESPONSE_DETAIL")
    protected MIAPPLICATIONRESPONSEDETAIL miapplicationresponsedetail;
    @XmlElement(name = "MI_PREMIUM_TAXES")
    protected MIPREMIUMTAXES mipremiumtaxes;
    @XmlElement(name = "MI_PREMIUMS")
    protected MIPREMIUMS mipremiums;
    @XmlElement(name = "PARTIES")
    protected PARTIES parties;
    @XmlElement(name = "EXTENSION")
    protected MIAPPLICATIONRESPONSEEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the conditions property.
     *
     * @return
     *     possible object is
     *     {@link CONDITIONS }
     *
     */
    public CONDITIONS getCONDITIONS() {
        return conditions;
    }

    /**
     * Sets the value of the conditions property.
     *
     * @param value
     *     allowed object is
     *     {@link CONDITIONS }
     *
     */
    public void setCONDITIONS(CONDITIONS value) {
        this.conditions = value;
    }

    /**
     * Gets the value of the contactpoints property.
     *
     * @return
     *     possible object is
     *     {@link CONTACTPOINTS }
     *
     */
    public CONTACTPOINTS getCONTACTPOINTS() {
        return contactpoints;
    }

    /**
     * Sets the value of the contactpoints property.
     *
     * @param value
     *     allowed object is
     *     {@link CONTACTPOINTS }
     *
     */
    public void setCONTACTPOINTS(CONTACTPOINTS value) {
        this.contactpoints = value;
    }

    /**
     * Gets the value of the loanidentifiers property.
     *
     * @return
     *     possible object is
     *     {@link LOANIDENTIFIERS }
     *
     */
    public LOANIDENTIFIERS getLOANIDENTIFIERS() {
        return loanidentifiers;
    }

    /**
     * Sets the value of the loanidentifiers property.
     *
     * @param value
     *     allowed object is
     *     {@link LOANIDENTIFIERS }
     *
     */
    public void setLOANIDENTIFIERS(LOANIDENTIFIERS value) {
        this.loanidentifiers = value;
    }

    /**
     * Gets the value of the miapplicationresponsedetail property.
     *
     * @return
     *     possible object is
     *     {@link MIAPPLICATIONRESPONSEDETAIL }
     *
     */
    public MIAPPLICATIONRESPONSEDETAIL getMIAPPLICATIONRESPONSEDETAIL() {
        return miapplicationresponsedetail;
    }

    /**
     * Sets the value of the miapplicationresponsedetail property.
     *
     * @param value
     *     allowed object is
     *     {@link MIAPPLICATIONRESPONSEDETAIL }
     *
     */
    public void setMIAPPLICATIONRESPONSEDETAIL(MIAPPLICATIONRESPONSEDETAIL value) {
        this.miapplicationresponsedetail = value;
    }

    /**
     * Gets the value of the mipremiumtaxes property.
     *
     * @return
     *     possible object is
     *     {@link MIPREMIUMTAXES }
     *
     */
    public MIPREMIUMTAXES getMIPREMIUMTAXES() {
        return mipremiumtaxes;
    }

    /**
     * Sets the value of the mipremiumtaxes property.
     *
     * @param value
     *     allowed object is
     *     {@link MIPREMIUMTAXES }
     *
     */
    public void setMIPREMIUMTAXES(MIPREMIUMTAXES value) {
        this.mipremiumtaxes = value;
    }

    /**
     * Gets the value of the mipremiums property.
     *
     * @return
     *     possible object is
     *     {@link MIPREMIUMS }
     *
     */
    public MIPREMIUMS getMIPREMIUMS() {
        return mipremiums;
    }

    /**
     * Sets the value of the mipremiums property.
     *
     * @param value
     *     allowed object is
     *     {@link MIPREMIUMS }
     *
     */
    public void setMIPREMIUMS(MIPREMIUMS value) {
        this.mipremiums = value;
    }

    /**
     * Gets the value of the parties property.
     *
     * @return
     *     possible object is
     *     {@link PARTIES }
     *
     */
    public PARTIES getPARTIES() {
        return parties;
    }

    /**
     * Sets the value of the parties property.
     *
     * @param value
     *     allowed object is
     *     {@link PARTIES }
     *
     */
    public void setPARTIES(PARTIES value) {
        this.parties = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link MIAPPLICATIONRESPONSEEXTENSION }
     *
     */
    public MIAPPLICATIONRESPONSEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link MIAPPLICATIONRESPONSEEXTENSION }
     *
     */
    public void setEXTENSION(MIAPPLICATIONRESPONSEEXTENSION value) {
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
