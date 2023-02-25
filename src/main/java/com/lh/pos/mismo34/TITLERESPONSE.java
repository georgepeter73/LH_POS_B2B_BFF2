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
 * <p>Java class for TITLE_RESPONSE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TITLE_RESPONSE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AGENT_VALIDATION" type="{http://www.mismo.org/residential/2009/schemas}AGENT_VALIDATION" minOccurs="0"/>
 *         &lt;element name="EXECUTIONS" type="{http://www.mismo.org/residential/2009/schemas}EXECUTIONS" minOccurs="0"/>
 *         &lt;element name="PARTIES" type="{http://www.mismo.org/residential/2009/schemas}PARTIES" minOccurs="0"/>
 *         &lt;element name="REMITTANCES" type="{http://www.mismo.org/residential/2009/schemas}REMITTANCES" minOccurs="0"/>
 *         &lt;element name="TITLE_PRODUCTS" type="{http://www.mismo.org/residential/2009/schemas}TITLE_PRODUCTS" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}TITLE_RESPONSE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "TITLE_RESPONSE", propOrder = {
    "agentvalidation",
    "executions",
    "parties",
    "remittances",
    "titleproducts",
    "extension"
})
public class TITLERESPONSE {

    @XmlElement(name = "AGENT_VALIDATION")
    protected AGENTVALIDATION agentvalidation;
    @XmlElement(name = "EXECUTIONS")
    protected EXECUTIONS executions;
    @XmlElement(name = "PARTIES")
    protected PARTIES parties;
    @XmlElement(name = "REMITTANCES")
    protected REMITTANCES remittances;
    @XmlElement(name = "TITLE_PRODUCTS")
    protected TITLEPRODUCTS titleproducts;
    @XmlElement(name = "EXTENSION")
    protected TITLERESPONSEEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the agentvalidation property.
     *
     * @return
     *     possible object is
     *     {@link AGENTVALIDATION }
     *
     */
    public AGENTVALIDATION getAGENTVALIDATION() {
        return agentvalidation;
    }

    /**
     * Sets the value of the agentvalidation property.
     *
     * @param value
     *     allowed object is
     *     {@link AGENTVALIDATION }
     *
     */
    public void setAGENTVALIDATION(AGENTVALIDATION value) {
        this.agentvalidation = value;
    }

    /**
     * Gets the value of the executions property.
     *
     * @return
     *     possible object is
     *     {@link EXECUTIONS }
     *
     */
    public EXECUTIONS getEXECUTIONS() {
        return executions;
    }

    /**
     * Sets the value of the executions property.
     *
     * @param value
     *     allowed object is
     *     {@link EXECUTIONS }
     *
     */
    public void setEXECUTIONS(EXECUTIONS value) {
        this.executions = value;
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
     * Gets the value of the remittances property.
     *
     * @return
     *     possible object is
     *     {@link REMITTANCES }
     *
     */
    public REMITTANCES getREMITTANCES() {
        return remittances;
    }

    /**
     * Sets the value of the remittances property.
     *
     * @param value
     *     allowed object is
     *     {@link REMITTANCES }
     *
     */
    public void setREMITTANCES(REMITTANCES value) {
        this.remittances = value;
    }

    /**
     * Gets the value of the titleproducts property.
     *
     * @return
     *     possible object is
     *     {@link TITLEPRODUCTS }
     *
     */
    public TITLEPRODUCTS getTITLEPRODUCTS() {
        return titleproducts;
    }

    /**
     * Sets the value of the titleproducts property.
     *
     * @param value
     *     allowed object is
     *     {@link TITLEPRODUCTS }
     *
     */
    public void setTITLEPRODUCTS(TITLEPRODUCTS value) {
        this.titleproducts = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link TITLERESPONSEEXTENSION }
     *
     */
    public TITLERESPONSEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link TITLERESPONSEEXTENSION }
     *
     */
    public void setEXTENSION(TITLERESPONSEEXTENSION value) {
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