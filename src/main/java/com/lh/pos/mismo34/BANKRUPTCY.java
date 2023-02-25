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
 * Detailed Information about an individual bankruptcy.
 *
 * <p>Java class for BANKRUPTCY complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="BANKRUPTCY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BANKRUPTCY_ACTIONS" type="{http://www.mismo.org/residential/2009/schemas}BANKRUPTCY_ACTIONS" minOccurs="0"/>
 *         &lt;element name="BANKRUPTCY_DELAYS" type="{http://www.mismo.org/residential/2009/schemas}BANKRUPTCY_DELAYS" minOccurs="0"/>
 *         &lt;element name="BANKRUPTCY_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}BANKRUPTCY_DETAIL" minOccurs="0"/>
 *         &lt;element name="BANKRUPTCY_DISPOSITIONS" type="{http://www.mismo.org/residential/2009/schemas}BANKRUPTCY_DISPOSITIONS" minOccurs="0"/>
 *         &lt;element name="BANKRUPTCY_RESULT_CLASSES" type="{http://www.mismo.org/residential/2009/schemas}BANKRUPTCY_RESULT_CLASSES" minOccurs="0"/>
 *         &lt;element name="BANKRUPTCY_STATUSES" type="{http://www.mismo.org/residential/2009/schemas}BANKRUPTCY_STATUSES" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}BANKRUPTCY_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "BANKRUPTCY", propOrder = {
    "bankruptcyactions",
    "bankruptcydelays",
    "bankruptcydetail",
    "bankruptcydispositions",
    "bankruptcyresultclasses",
    "bankruptcystatuses",
    "extension"
})
public class BANKRUPTCY {

    @XmlElement(name = "BANKRUPTCY_ACTIONS")
    protected BANKRUPTCYACTIONS bankruptcyactions;
    @XmlElement(name = "BANKRUPTCY_DELAYS")
    protected BANKRUPTCYDELAYS bankruptcydelays;
    @XmlElement(name = "BANKRUPTCY_DETAIL")
    protected BANKRUPTCYDETAIL bankruptcydetail;
    @XmlElement(name = "BANKRUPTCY_DISPOSITIONS")
    protected BANKRUPTCYDISPOSITIONS bankruptcydispositions;
    @XmlElement(name = "BANKRUPTCY_RESULT_CLASSES")
    protected BANKRUPTCYRESULTCLASSES bankruptcyresultclasses;
    @XmlElement(name = "BANKRUPTCY_STATUSES")
    protected BANKRUPTCYSTATUSES bankruptcystatuses;
    @XmlElement(name = "EXTENSION")
    protected BANKRUPTCYEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Gets the value of the bankruptcyactions property.
     *
     * @return
     *     possible object is
     *     {@link BANKRUPTCYACTIONS }
     *
     */
    public BANKRUPTCYACTIONS getBANKRUPTCYACTIONS() {
        return bankruptcyactions;
    }

    /**
     * Sets the value of the bankruptcyactions property.
     *
     * @param value
     *     allowed object is
     *     {@link BANKRUPTCYACTIONS }
     *
     */
    public void setBANKRUPTCYACTIONS(BANKRUPTCYACTIONS value) {
        this.bankruptcyactions = value;
    }

    /**
     * Gets the value of the bankruptcydelays property.
     *
     * @return
     *     possible object is
     *     {@link BANKRUPTCYDELAYS }
     *
     */
    public BANKRUPTCYDELAYS getBANKRUPTCYDELAYS() {
        return bankruptcydelays;
    }

    /**
     * Sets the value of the bankruptcydelays property.
     *
     * @param value
     *     allowed object is
     *     {@link BANKRUPTCYDELAYS }
     *
     */
    public void setBANKRUPTCYDELAYS(BANKRUPTCYDELAYS value) {
        this.bankruptcydelays = value;
    }

    /**
     * Gets the value of the bankruptcydetail property.
     *
     * @return
     *     possible object is
     *     {@link BANKRUPTCYDETAIL }
     *
     */
    public BANKRUPTCYDETAIL getBANKRUPTCYDETAIL() {
        return bankruptcydetail;
    }

    /**
     * Sets the value of the bankruptcydetail property.
     *
     * @param value
     *     allowed object is
     *     {@link BANKRUPTCYDETAIL }
     *
     */
    public void setBANKRUPTCYDETAIL(BANKRUPTCYDETAIL value) {
        this.bankruptcydetail = value;
    }

    /**
     * Gets the value of the bankruptcydispositions property.
     *
     * @return
     *     possible object is
     *     {@link BANKRUPTCYDISPOSITIONS }
     *
     */
    public BANKRUPTCYDISPOSITIONS getBANKRUPTCYDISPOSITIONS() {
        return bankruptcydispositions;
    }

    /**
     * Sets the value of the bankruptcydispositions property.
     *
     * @param value
     *     allowed object is
     *     {@link BANKRUPTCYDISPOSITIONS }
     *
     */
    public void setBANKRUPTCYDISPOSITIONS(BANKRUPTCYDISPOSITIONS value) {
        this.bankruptcydispositions = value;
    }

    /**
     * Gets the value of the bankruptcyresultclasses property.
     *
     * @return
     *     possible object is
     *     {@link BANKRUPTCYRESULTCLASSES }
     *
     */
    public BANKRUPTCYRESULTCLASSES getBANKRUPTCYRESULTCLASSES() {
        return bankruptcyresultclasses;
    }

    /**
     * Sets the value of the bankruptcyresultclasses property.
     *
     * @param value
     *     allowed object is
     *     {@link BANKRUPTCYRESULTCLASSES }
     *
     */
    public void setBANKRUPTCYRESULTCLASSES(BANKRUPTCYRESULTCLASSES value) {
        this.bankruptcyresultclasses = value;
    }

    /**
     * Gets the value of the bankruptcystatuses property.
     *
     * @return
     *     possible object is
     *     {@link BANKRUPTCYSTATUSES }
     *
     */
    public BANKRUPTCYSTATUSES getBANKRUPTCYSTATUSES() {
        return bankruptcystatuses;
    }

    /**
     * Sets the value of the bankruptcystatuses property.
     *
     * @param value
     *     allowed object is
     *     {@link BANKRUPTCYSTATUSES }
     *
     */
    public void setBANKRUPTCYSTATUSES(BANKRUPTCYSTATUSES value) {
        this.bankruptcystatuses = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link BANKRUPTCYEXTENSION }
     *
     */
    public BANKRUPTCYEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link BANKRUPTCYEXTENSION }
     *
     */
    public void setEXTENSION(BANKRUPTCYEXTENSION value) {
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
