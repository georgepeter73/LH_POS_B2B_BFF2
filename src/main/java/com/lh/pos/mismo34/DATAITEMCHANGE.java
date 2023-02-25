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
 * <p>Java class for DATA_ITEM_CHANGE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DATA_ITEM_CHANGE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataItemChangeEffectiveDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="DataItemChangeExpirationDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="DataItemChangePriorValue" type="{http://www.mismo.org/residential/2009/schemas}MISMOValue" minOccurs="0"/>
 *         &lt;element name="DataItemChangeType" type="{http://www.mismo.org/residential/2009/schemas}DataItemChangeEnum" minOccurs="0"/>
 *         &lt;element name="DataItemChangeValue" type="{http://www.mismo.org/residential/2009/schemas}MISMOValue" minOccurs="0"/>
 *         &lt;element name="DataItemChangeXPath" type="{http://www.mismo.org/residential/2009/schemas}MISMOXPath" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}DATA_ITEM_CHANGE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "DATA_ITEM_CHANGE", propOrder = {
    "dataItemChangeEffectiveDate",
    "dataItemChangeExpirationDate",
    "dataItemChangePriorValue",
    "dataItemChangeType",
    "dataItemChangeValue",
    "dataItemChangeXPath",
    "extension"
})
public class DATAITEMCHANGE {

    @XmlElementRef(name = "DataItemChangeEffectiveDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> dataItemChangeEffectiveDate;
    @XmlElementRef(name = "DataItemChangeExpirationDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> dataItemChangeExpirationDate;
    @XmlElementRef(name = "DataItemChangePriorValue", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOValue> dataItemChangePriorValue;
    @XmlElementRef(name = "DataItemChangeType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<DataItemChangeEnum> dataItemChangeType;
    @XmlElementRef(name = "DataItemChangeValue", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOValue> dataItemChangeValue;
    @XmlElementRef(name = "DataItemChangeXPath", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOXPath> dataItemChangeXPath;
    @XmlElement(name = "EXTENSION")
    protected DATAITEMCHANGEEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the dataItemChangeEffectiveDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public JAXBElement<MISMODate> getDataItemChangeEffectiveDate() {
        return dataItemChangeEffectiveDate;
    }

    /**
     * Sets the value of the dataItemChangeEffectiveDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public void setDataItemChangeEffectiveDate(JAXBElement<MISMODate> value) {
        this.dataItemChangeEffectiveDate = value;
    }

    /**
     * Gets the value of the dataItemChangeExpirationDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public JAXBElement<MISMODate> getDataItemChangeExpirationDate() {
        return dataItemChangeExpirationDate;
    }

    /**
     * Sets the value of the dataItemChangeExpirationDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public void setDataItemChangeExpirationDate(JAXBElement<MISMODate> value) {
        this.dataItemChangeExpirationDate = value;
    }

    /**
     * Gets the value of the dataItemChangePriorValue property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *
     */
    public JAXBElement<MISMOValue> getDataItemChangePriorValue() {
        return dataItemChangePriorValue;
    }

    /**
     * Sets the value of the dataItemChangePriorValue property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *
     */
    public void setDataItemChangePriorValue(JAXBElement<MISMOValue> value) {
        this.dataItemChangePriorValue = value;
    }

    /**
     * Gets the value of the dataItemChangeType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DataItemChangeEnum }{@code >}
     *
     */
    public JAXBElement<DataItemChangeEnum> getDataItemChangeType() {
        return dataItemChangeType;
    }

    /**
     * Sets the value of the dataItemChangeType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DataItemChangeEnum }{@code >}
     *
     */
    public void setDataItemChangeType(JAXBElement<DataItemChangeEnum> value) {
        this.dataItemChangeType = value;
    }

    /**
     * Gets the value of the dataItemChangeValue property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *
     */
    public JAXBElement<MISMOValue> getDataItemChangeValue() {
        return dataItemChangeValue;
    }

    /**
     * Sets the value of the dataItemChangeValue property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *
     */
    public void setDataItemChangeValue(JAXBElement<MISMOValue> value) {
        this.dataItemChangeValue = value;
    }

    /**
     * Gets the value of the dataItemChangeXPath property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOXPath }{@code >}
     *
     */
    public JAXBElement<MISMOXPath> getDataItemChangeXPath() {
        return dataItemChangeXPath;
    }

    /**
     * Sets the value of the dataItemChangeXPath property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOXPath }{@code >}
     *
     */
    public void setDataItemChangeXPath(JAXBElement<MISMOXPath> value) {
        this.dataItemChangeXPath = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link DATAITEMCHANGEEXTENSION }
     *
     */
    public DATAITEMCHANGEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link DATAITEMCHANGEEXTENSION }
     *
     */
    public void setEXTENSION(DATAITEMCHANGEEXTENSION value) {
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
