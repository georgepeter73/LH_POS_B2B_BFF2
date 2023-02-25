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
 * <p>Java class for LIABILITY complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="LIABILITY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LIABILITY_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}LIABILITY_DETAIL" minOccurs="0"/>
 *         &lt;element name="LIABILITY_HOLDER" type="{http://www.mismo.org/residential/2009/schemas}LIABILITY_HOLDER" minOccurs="0"/>
 *         &lt;element name="PAYOFF" type="{http://www.mismo.org/residential/2009/schemas}PAYOFF" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}LIABILITY_EXTENSION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
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
@XmlType(name = "LIABILITY", propOrder = {
    "liabilitydetail",
    "liabilityholder",
    "payoff",
    "extension"
})
public class LIABILITY {

    @XmlElement(name = "LIABILITY_DETAIL")
    protected LIABILITYDETAIL liabilitydetail;
    @XmlElement(name = "LIABILITY_HOLDER")
    protected LIABILITYHOLDER liabilityholder;
    @XmlElement(name = "PAYOFF")
    protected PAYOFF payoff;
    @XmlElement(name = "EXTENSION")
    protected LIABILITYEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the liabilitydetail property.
     *
     * @return
     *     possible object is
     *     {@link LIABILITYDETAIL }
     *
     */
    public LIABILITYDETAIL getLIABILITYDETAIL() {
        return liabilitydetail;
    }

    /**
     * Sets the value of the liabilitydetail property.
     *
     * @param value
     *     allowed object is
     *     {@link LIABILITYDETAIL }
     *
     */
    public void setLIABILITYDETAIL(LIABILITYDETAIL value) {
        this.liabilitydetail = value;
    }

    /**
     * Gets the value of the liabilityholder property.
     *
     * @return
     *     possible object is
     *     {@link LIABILITYHOLDER }
     *
     */
    public LIABILITYHOLDER getLIABILITYHOLDER() {
        return liabilityholder;
    }

    /**
     * Sets the value of the liabilityholder property.
     *
     * @param value
     *     allowed object is
     *     {@link LIABILITYHOLDER }
     *
     */
    public void setLIABILITYHOLDER(LIABILITYHOLDER value) {
        this.liabilityholder = value;
    }

    /**
     * Gets the value of the payoff property.
     *
     * @return
     *     possible object is
     *     {@link PAYOFF }
     *
     */
    public PAYOFF getPAYOFF() {
        return payoff;
    }

    /**
     * Sets the value of the payoff property.
     *
     * @param value
     *     allowed object is
     *     {@link PAYOFF }
     *
     */
    public void setPAYOFF(PAYOFF value) {
        this.payoff = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link LIABILITYEXTENSION }
     *
     */
    public LIABILITYEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link LIABILITYEXTENSION }
     *
     */
    public void setEXTENSION(LIABILITYEXTENSION value) {
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
