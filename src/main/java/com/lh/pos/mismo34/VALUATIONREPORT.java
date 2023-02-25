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
 * <p>Java class for VALUATION_REPORT complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="VALUATION_REPORT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="APPROACH_TO_VALUE" type="{http://www.mismo.org/residential/2009/schemas}APPROACH_TO_VALUE" minOccurs="0"/>
 *         &lt;element name="SCOPE_OF_WORK" type="{http://www.mismo.org/residential/2009/schemas}SCOPE_OF_WORK" minOccurs="0"/>
 *         &lt;element name="VALUATION_ANALYSES" type="{http://www.mismo.org/residential/2009/schemas}VALUATION_ANALYSES" minOccurs="0"/>
 *         &lt;element name="VALUATION_FORMS" type="{http://www.mismo.org/residential/2009/schemas}VALUATION_FORMS" minOccurs="0"/>
 *         &lt;element name="VALUATION_RECONCILIATION" type="{http://www.mismo.org/residential/2009/schemas}VALUATION_RECONCILIATION" minOccurs="0"/>
 *         &lt;element name="VALUATION_REPORT_DETAIL" type="{http://www.mismo.org/residential/2009/schemas}VALUATION_REPORT_DETAIL" minOccurs="0"/>
 *         &lt;element name="VALUATION_REVIEW" type="{http://www.mismo.org/residential/2009/schemas}VALUATION_REVIEW" minOccurs="0"/>
 *         &lt;element name="VALUATION_UPDATE" type="{http://www.mismo.org/residential/2009/schemas}VALUATION_UPDATE" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}VALUATION_REPORT_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "VALUATION_REPORT", propOrder = {
    "approachtovalue",
    "scopeofwork",
    "valuationanalyses",
    "valuationforms",
    "valuationreconciliation",
    "valuationreportdetail",
    "valuationreview",
    "valuationupdate",
    "extension"
})
public class VALUATIONREPORT {

    @XmlElement(name = "APPROACH_TO_VALUE")
    protected APPROACHTOVALUE approachtovalue;
    @XmlElement(name = "SCOPE_OF_WORK")
    protected SCOPEOFWORK scopeofwork;
    @XmlElement(name = "VALUATION_ANALYSES")
    protected VALUATIONANALYSES valuationanalyses;
    @XmlElement(name = "VALUATION_FORMS")
    protected VALUATIONFORMS valuationforms;
    @XmlElement(name = "VALUATION_RECONCILIATION")
    protected VALUATIONRECONCILIATION valuationreconciliation;
    @XmlElement(name = "VALUATION_REPORT_DETAIL")
    protected VALUATIONREPORTDETAIL valuationreportdetail;
    @XmlElement(name = "VALUATION_REVIEW")
    protected VALUATIONREVIEW valuationreview;
    @XmlElement(name = "VALUATION_UPDATE")
    protected VALUATIONUPDATE valuationupdate;
    @XmlElement(name = "EXTENSION")
    protected VALUATIONREPORTEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the approachtovalue property.
     *
     * @return
     *     possible object is
     *     {@link APPROACHTOVALUE }
     *
     */
    public APPROACHTOVALUE getAPPROACHTOVALUE() {
        return approachtovalue;
    }

    /**
     * Sets the value of the approachtovalue property.
     *
     * @param value
     *     allowed object is
     *     {@link APPROACHTOVALUE }
     *
     */
    public void setAPPROACHTOVALUE(APPROACHTOVALUE value) {
        this.approachtovalue = value;
    }

    /**
     * Gets the value of the scopeofwork property.
     *
     * @return
     *     possible object is
     *     {@link SCOPEOFWORK }
     *
     */
    public SCOPEOFWORK getSCOPEOFWORK() {
        return scopeofwork;
    }

    /**
     * Sets the value of the scopeofwork property.
     *
     * @param value
     *     allowed object is
     *     {@link SCOPEOFWORK }
     *
     */
    public void setSCOPEOFWORK(SCOPEOFWORK value) {
        this.scopeofwork = value;
    }

    /**
     * Gets the value of the valuationanalyses property.
     *
     * @return
     *     possible object is
     *     {@link VALUATIONANALYSES }
     *
     */
    public VALUATIONANALYSES getVALUATIONANALYSES() {
        return valuationanalyses;
    }

    /**
     * Sets the value of the valuationanalyses property.
     *
     * @param value
     *     allowed object is
     *     {@link VALUATIONANALYSES }
     *
     */
    public void setVALUATIONANALYSES(VALUATIONANALYSES value) {
        this.valuationanalyses = value;
    }

    /**
     * Gets the value of the valuationforms property.
     *
     * @return
     *     possible object is
     *     {@link VALUATIONFORMS }
     *
     */
    public VALUATIONFORMS getVALUATIONFORMS() {
        return valuationforms;
    }

    /**
     * Sets the value of the valuationforms property.
     *
     * @param value
     *     allowed object is
     *     {@link VALUATIONFORMS }
     *
     */
    public void setVALUATIONFORMS(VALUATIONFORMS value) {
        this.valuationforms = value;
    }

    /**
     * Gets the value of the valuationreconciliation property.
     *
     * @return
     *     possible object is
     *     {@link VALUATIONRECONCILIATION }
     *
     */
    public VALUATIONRECONCILIATION getVALUATIONRECONCILIATION() {
        return valuationreconciliation;
    }

    /**
     * Sets the value of the valuationreconciliation property.
     *
     * @param value
     *     allowed object is
     *     {@link VALUATIONRECONCILIATION }
     *
     */
    public void setVALUATIONRECONCILIATION(VALUATIONRECONCILIATION value) {
        this.valuationreconciliation = value;
    }

    /**
     * Gets the value of the valuationreportdetail property.
     *
     * @return
     *     possible object is
     *     {@link VALUATIONREPORTDETAIL }
     *
     */
    public VALUATIONREPORTDETAIL getVALUATIONREPORTDETAIL() {
        return valuationreportdetail;
    }

    /**
     * Sets the value of the valuationreportdetail property.
     *
     * @param value
     *     allowed object is
     *     {@link VALUATIONREPORTDETAIL }
     *
     */
    public void setVALUATIONREPORTDETAIL(VALUATIONREPORTDETAIL value) {
        this.valuationreportdetail = value;
    }

    /**
     * Gets the value of the valuationreview property.
     *
     * @return
     *     possible object is
     *     {@link VALUATIONREVIEW }
     *
     */
    public VALUATIONREVIEW getVALUATIONREVIEW() {
        return valuationreview;
    }

    /**
     * Sets the value of the valuationreview property.
     *
     * @param value
     *     allowed object is
     *     {@link VALUATIONREVIEW }
     *
     */
    public void setVALUATIONREVIEW(VALUATIONREVIEW value) {
        this.valuationreview = value;
    }

    /**
     * Gets the value of the valuationupdate property.
     *
     * @return
     *     possible object is
     *     {@link VALUATIONUPDATE }
     *
     */
    public VALUATIONUPDATE getVALUATIONUPDATE() {
        return valuationupdate;
    }

    /**
     * Sets the value of the valuationupdate property.
     *
     * @param value
     *     allowed object is
     *     {@link VALUATIONUPDATE }
     *
     */
    public void setVALUATIONUPDATE(VALUATIONUPDATE value) {
        this.valuationupdate = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link VALUATIONREPORTEXTENSION }
     *
     */
    public VALUATIONREPORTEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link VALUATIONREPORTEXTENSION }
     *
     */
    public void setEXTENSION(VALUATIONREPORTEXTENSION value) {
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
