//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2020.02.11 at 08:03:21 AM EST
//


package com.lh.pos.mismo34;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * <p>Java class for INVESTOR_REPORTING_ADDITIONAL_CHARGES complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="INVESTOR_REPORTING_ADDITIONAL_CHARGES">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INVESTOR_REPORTING_ADDITIONAL_CHARGE" type="{http://www.mismo.org/residential/2009/schemas}INVESTOR_REPORTING_ADDITIONAL_CHARGE" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="INVESTOR_REPORTING_ADDITIONAL_CHARGE_SUMMARY" type="{http://www.mismo.org/residential/2009/schemas}INVESTOR_REPORTING_ADDITIONAL_CHARGE_SUMMARY" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}INVESTOR_REPORTING_ADDITIONAL_CHARGES_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "INVESTOR_REPORTING_ADDITIONAL_CHARGES", propOrder = {
    "investorreportingadditionalcharge",
    "investorreportingadditionalchargesummary",
    "extension"
})
public class INVESTORREPORTINGADDITIONALCHARGES {

    @XmlElement(name = "INVESTOR_REPORTING_ADDITIONAL_CHARGE")
    protected List<INVESTORREPORTINGADDITIONALCHARGE> investorreportingadditionalcharge;
    @XmlElement(name = "INVESTOR_REPORTING_ADDITIONAL_CHARGE_SUMMARY")
    protected INVESTORREPORTINGADDITIONALCHARGESUMMARY investorreportingadditionalchargesummary;
    @XmlElement(name = "EXTENSION")
    protected INVESTORREPORTINGADDITIONALCHARGESEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the investorreportingadditionalcharge property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the investorreportingadditionalcharge property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getINVESTORREPORTINGADDITIONALCHARGE().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link INVESTORREPORTINGADDITIONALCHARGE }
     *
     *
     */
    public List<INVESTORREPORTINGADDITIONALCHARGE> getINVESTORREPORTINGADDITIONALCHARGE() {
        if (investorreportingadditionalcharge == null) {
            investorreportingadditionalcharge = new ArrayList<INVESTORREPORTINGADDITIONALCHARGE>();
        }
        return this.investorreportingadditionalcharge;
    }

    /**
     * Gets the value of the investorreportingadditionalchargesummary property.
     *
     * @return
     *     possible object is
     *     {@link INVESTORREPORTINGADDITIONALCHARGESUMMARY }
     *
     */
    public INVESTORREPORTINGADDITIONALCHARGESUMMARY getINVESTORREPORTINGADDITIONALCHARGESUMMARY() {
        return investorreportingadditionalchargesummary;
    }

    /**
     * Sets the value of the investorreportingadditionalchargesummary property.
     *
     * @param value
     *     allowed object is
     *     {@link INVESTORREPORTINGADDITIONALCHARGESUMMARY }
     *
     */
    public void setINVESTORREPORTINGADDITIONALCHARGESUMMARY(INVESTORREPORTINGADDITIONALCHARGESUMMARY value) {
        this.investorreportingadditionalchargesummary = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link INVESTORREPORTINGADDITIONALCHARGESEXTENSION }
     *
     */
    public INVESTORREPORTINGADDITIONALCHARGESEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link INVESTORREPORTINGADDITIONALCHARGESEXTENSION }
     *
     */
    public void setEXTENSION(INVESTORREPORTINGADDITIONALCHARGESEXTENSION value) {
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
