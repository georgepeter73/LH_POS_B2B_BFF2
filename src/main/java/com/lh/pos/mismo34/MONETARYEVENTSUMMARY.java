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
 * Container for summary reporting of monetary transactions related to loan payments, draws, payoffs and other that occur within a reporting period.
 *
 * <p>Java class for MONETARY_EVENT_SUMMARY complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MONETARY_EVENT_SUMMARY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INVESTOR_REPORTING_ADDITIONAL_CHARGES" type="{http://www.mismo.org/residential/2009/schemas}INVESTOR_REPORTING_ADDITIONAL_CHARGES" minOccurs="0"/>
 *         &lt;element name="MONETARY_EVENT_SUMMARY_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}MONETARY_EVENT_SUMMARY_DETAIL" minOccurs="0"/>
 *         &lt;element name="STATUS_CHANGE_EVENTS" type="{http://www.mismo.org/residential/2009/schemas}STATUS_CHANGE_EVENTS" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}MONETARY_EVENT_SUMMARY_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "MONETARY_EVENT_SUMMARY", propOrder = {
    "investorreportingadditionalcharges",
    "monetaryeventsummarydetail",
    "statuschangeevents",
    "extension"
})
public class MONETARYEVENTSUMMARY {

    @XmlElement(name = "INVESTOR_REPORTING_ADDITIONAL_CHARGES")
    protected INVESTORREPORTINGADDITIONALCHARGES investorreportingadditionalcharges;
    @XmlElement(name = "MONETARY_EVENT_SUMMARY_DETAIL")
    protected MONETARYEVENTSUMMARYDETAIL monetaryeventsummarydetail;
    @XmlElement(name = "STATUS_CHANGE_EVENTS")
    protected STATUSCHANGEEVENTS statuschangeevents;
    @XmlElement(name = "EXTENSION")
    protected MONETARYEVENTSUMMARYEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the investorreportingadditionalcharges property.
     *
     * @return
     *     possible object is
     *     {@link INVESTORREPORTINGADDITIONALCHARGES }
     *
     */
    public INVESTORREPORTINGADDITIONALCHARGES getINVESTORREPORTINGADDITIONALCHARGES() {
        return investorreportingadditionalcharges;
    }

    /**
     * Sets the value of the investorreportingadditionalcharges property.
     *
     * @param value
     *     allowed object is
     *     {@link INVESTORREPORTINGADDITIONALCHARGES }
     *
     */
    public void setINVESTORREPORTINGADDITIONALCHARGES(INVESTORREPORTINGADDITIONALCHARGES value) {
        this.investorreportingadditionalcharges = value;
    }

    /**
     * Gets the value of the monetaryeventsummarydetail property.
     *
     * @return
     *     possible object is
     *     {@link MONETARYEVENTSUMMARYDETAIL }
     *
     */
    public MONETARYEVENTSUMMARYDETAIL getMONETARYEVENTSUMMARYDETAIL() {
        return monetaryeventsummarydetail;
    }

    /**
     * Sets the value of the monetaryeventsummarydetail property.
     *
     * @param value
     *     allowed object is
     *     {@link MONETARYEVENTSUMMARYDETAIL }
     *
     */
    public void setMONETARYEVENTSUMMARYDETAIL(MONETARYEVENTSUMMARYDETAIL value) {
        this.monetaryeventsummarydetail = value;
    }

    /**
     * Gets the value of the statuschangeevents property.
     *
     * @return
     *     possible object is
     *     {@link STATUSCHANGEEVENTS }
     *
     */
    public STATUSCHANGEEVENTS getSTATUSCHANGEEVENTS() {
        return statuschangeevents;
    }

    /**
     * Sets the value of the statuschangeevents property.
     *
     * @param value
     *     allowed object is
     *     {@link STATUSCHANGEEVENTS }
     *
     */
    public void setSTATUSCHANGEEVENTS(STATUSCHANGEEVENTS value) {
        this.statuschangeevents = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link MONETARYEVENTSUMMARYEXTENSION }
     *
     */
    public MONETARYEVENTSUMMARYEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link MONETARYEVENTSUMMARYEXTENSION }
     *
     */
    public void setEXTENSION(MONETARYEVENTSUMMARYEXTENSION value) {
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
