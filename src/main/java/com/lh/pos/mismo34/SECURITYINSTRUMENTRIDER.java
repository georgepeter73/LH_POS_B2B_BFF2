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
 * <p>Java class for SECURITY_INSTRUMENT_RIDER complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SECURITY_INSTRUMENT_RIDER">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SecurityInstrumentRiderType" type="{http://www.mismo.org/residential/2009/schemas}SecurityInstrumentRiderEnum" minOccurs="0"/>
 *         &lt;element name="SecurityInstrumentRiderTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}SECURITY_INSTRUMENT_RIDER_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "SECURITY_INSTRUMENT_RIDER", propOrder = {
    "securityInstrumentRiderType",
    "securityInstrumentRiderTypeOtherDescription",
    "extension"
})
public class SECURITYINSTRUMENTRIDER {

    @XmlElementRef(name = "SecurityInstrumentRiderType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<SecurityInstrumentRiderEnum> securityInstrumentRiderType;
    @XmlElementRef(name = "SecurityInstrumentRiderTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> securityInstrumentRiderTypeOtherDescription;
    @XmlElement(name = "EXTENSION")
    protected SECURITYINSTRUMENTRIDEREXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the securityInstrumentRiderType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SecurityInstrumentRiderEnum }{@code >}
     *
     */
    public JAXBElement<SecurityInstrumentRiderEnum> getSecurityInstrumentRiderType() {
        return securityInstrumentRiderType;
    }

    /**
     * Sets the value of the securityInstrumentRiderType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SecurityInstrumentRiderEnum }{@code >}
     *
     */
    public void setSecurityInstrumentRiderType(JAXBElement<SecurityInstrumentRiderEnum> value) {
        this.securityInstrumentRiderType = value;
    }

    /**
     * Gets the value of the securityInstrumentRiderTypeOtherDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getSecurityInstrumentRiderTypeOtherDescription() {
        return securityInstrumentRiderTypeOtherDescription;
    }

    /**
     * Sets the value of the securityInstrumentRiderTypeOtherDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setSecurityInstrumentRiderTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.securityInstrumentRiderTypeOtherDescription = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link SECURITYINSTRUMENTRIDEREXTENSION }
     *
     */
    public SECURITYINSTRUMENTRIDEREXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link SECURITYINSTRUMENTRIDEREXTENSION }
     *
     */
    public void setEXTENSION(SECURITYINSTRUMENTRIDEREXTENSION value) {
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