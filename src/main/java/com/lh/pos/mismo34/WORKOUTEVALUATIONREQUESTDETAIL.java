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
 * Information about the request to do a workout evaluation on a group of loans.
 *
 * <p>Java class for WORKOUT_EVALUATION_REQUEST_DETAIL complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="WORKOUT_EVALUATION_REQUEST_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoansSubmittedCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="RequestBatchIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="ServiceRequestDatetime" type="{http://www.mismo.org/residential/2009/schemas}MISMODatetime" minOccurs="0"/>
 *         &lt;element name="ServiceRequestReasonIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="ServicerLossMitigationSoftwarePlatformName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ServicerLossMitigationSoftwarePlatformVersionIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}WORKOUT_EVALUATION_REQUEST_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "WORKOUT_EVALUATION_REQUEST_DETAIL", propOrder = {
    "loansSubmittedCount",
    "requestBatchIdentifier",
    "serviceRequestDatetime",
    "serviceRequestReasonIdentifier",
    "servicerLossMitigationSoftwarePlatformName",
    "servicerLossMitigationSoftwarePlatformVersionIdentifier",
    "extension"
})
public class WORKOUTEVALUATIONREQUESTDETAIL {

    @XmlElementRef(name = "LoansSubmittedCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> loansSubmittedCount;
    @XmlElementRef(name = "RequestBatchIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> requestBatchIdentifier;
    @XmlElementRef(name = "ServiceRequestDatetime", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODatetime> serviceRequestDatetime;
    @XmlElementRef(name = "ServiceRequestReasonIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> serviceRequestReasonIdentifier;
    @XmlElementRef(name = "ServicerLossMitigationSoftwarePlatformName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> servicerLossMitigationSoftwarePlatformName;
    @XmlElementRef(name = "ServicerLossMitigationSoftwarePlatformVersionIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> servicerLossMitigationSoftwarePlatformVersionIdentifier;
    @XmlElement(name = "EXTENSION")
    protected WORKOUTEVALUATIONREQUESTDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the loansSubmittedCount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public JAXBElement<MISMOCount> getLoansSubmittedCount() {
        return loansSubmittedCount;
    }

    /**
     * Sets the value of the loansSubmittedCount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public void setLoansSubmittedCount(JAXBElement<MISMOCount> value) {
        this.loansSubmittedCount = value;
    }

    /**
     * Gets the value of the requestBatchIdentifier property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public JAXBElement<MISMOIdentifier> getRequestBatchIdentifier() {
        return requestBatchIdentifier;
    }

    /**
     * Sets the value of the requestBatchIdentifier property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public void setRequestBatchIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.requestBatchIdentifier = value;
    }

    /**
     * Gets the value of the serviceRequestDatetime property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODatetime }{@code >}
     *
     */
    public JAXBElement<MISMODatetime> getServiceRequestDatetime() {
        return serviceRequestDatetime;
    }

    /**
     * Sets the value of the serviceRequestDatetime property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODatetime }{@code >}
     *
     */
    public void setServiceRequestDatetime(JAXBElement<MISMODatetime> value) {
        this.serviceRequestDatetime = value;
    }

    /**
     * Gets the value of the serviceRequestReasonIdentifier property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public JAXBElement<MISMOIdentifier> getServiceRequestReasonIdentifier() {
        return serviceRequestReasonIdentifier;
    }

    /**
     * Sets the value of the serviceRequestReasonIdentifier property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public void setServiceRequestReasonIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.serviceRequestReasonIdentifier = value;
    }

    /**
     * Gets the value of the servicerLossMitigationSoftwarePlatformName property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getServicerLossMitigationSoftwarePlatformName() {
        return servicerLossMitigationSoftwarePlatformName;
    }

    /**
     * Sets the value of the servicerLossMitigationSoftwarePlatformName property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setServicerLossMitigationSoftwarePlatformName(JAXBElement<MISMOString> value) {
        this.servicerLossMitigationSoftwarePlatformName = value;
    }

    /**
     * Gets the value of the servicerLossMitigationSoftwarePlatformVersionIdentifier property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public JAXBElement<MISMOIdentifier> getServicerLossMitigationSoftwarePlatformVersionIdentifier() {
        return servicerLossMitigationSoftwarePlatformVersionIdentifier;
    }

    /**
     * Sets the value of the servicerLossMitigationSoftwarePlatformVersionIdentifier property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public void setServicerLossMitigationSoftwarePlatformVersionIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.servicerLossMitigationSoftwarePlatformVersionIdentifier = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link WORKOUTEVALUATIONREQUESTDETAILEXTENSION }
     *
     */
    public WORKOUTEVALUATIONREQUESTDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link WORKOUTEVALUATIONREQUESTDETAILEXTENSION }
     *
     */
    public void setEXTENSION(WORKOUTEVALUATIONREQUESTDETAILEXTENSION value) {
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
