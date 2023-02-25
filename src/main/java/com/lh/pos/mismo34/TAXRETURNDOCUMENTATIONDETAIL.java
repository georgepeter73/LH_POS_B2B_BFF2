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
 * This container holds data that describes the particular return, transcript, year, and form being requested.
 *
 * <p>Java class for TAX_RETURN_DOCUMENTATION_DETAIL complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TAX_RETURN_DOCUMENTATION_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountTranscriptIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="InformationalFormSeriesTranscriptIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="IRSDocumentType" type="{http://www.mismo.org/residential/2009/schemas}IRSDocumentEnum" minOccurs="0"/>
 *         &lt;element name="IRSDocumentTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="OtherTranscriptDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="RecordOfAccountIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="ReturnTranscriptIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="VerificationOfNonfilingIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}TAX_RETURN_DOCUMENTATION_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "TAX_RETURN_DOCUMENTATION_DETAIL", propOrder = {
    "accountTranscriptIndicator",
    "informationalFormSeriesTranscriptIndicator",
    "irsDocumentType",
    "irsDocumentTypeOtherDescription",
    "otherTranscriptDescription",
    "recordOfAccountIndicator",
    "returnTranscriptIndicator",
    "verificationOfNonfilingIndicator",
    "extension"
})
public class TAXRETURNDOCUMENTATIONDETAIL {

    @XmlElementRef(name = "AccountTranscriptIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> accountTranscriptIndicator;
    @XmlElementRef(name = "InformationalFormSeriesTranscriptIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> informationalFormSeriesTranscriptIndicator;
    @XmlElementRef(name = "IRSDocumentType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<IRSDocumentEnum> irsDocumentType;
    @XmlElementRef(name = "IRSDocumentTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> irsDocumentTypeOtherDescription;
    @XmlElementRef(name = "OtherTranscriptDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> otherTranscriptDescription;
    @XmlElementRef(name = "RecordOfAccountIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> recordOfAccountIndicator;
    @XmlElementRef(name = "ReturnTranscriptIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> returnTranscriptIndicator;
    @XmlElementRef(name = "VerificationOfNonfilingIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> verificationOfNonfilingIndicator;
    @XmlElement(name = "EXTENSION")
    protected TAXRETURNDOCUMENTATIONDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the accountTranscriptIndicator property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public JAXBElement<MISMOIndicator> getAccountTranscriptIndicator() {
        return accountTranscriptIndicator;
    }

    /**
     * Sets the value of the accountTranscriptIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public void setAccountTranscriptIndicator(JAXBElement<MISMOIndicator> value) {
        this.accountTranscriptIndicator = value;
    }

    /**
     * Gets the value of the informationalFormSeriesTranscriptIndicator property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public JAXBElement<MISMOIndicator> getInformationalFormSeriesTranscriptIndicator() {
        return informationalFormSeriesTranscriptIndicator;
    }

    /**
     * Sets the value of the informationalFormSeriesTranscriptIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public void setInformationalFormSeriesTranscriptIndicator(JAXBElement<MISMOIndicator> value) {
        this.informationalFormSeriesTranscriptIndicator = value;
    }

    /**
     * Gets the value of the irsDocumentType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IRSDocumentEnum }{@code >}
     *
     */
    public JAXBElement<IRSDocumentEnum> getIRSDocumentType() {
        return irsDocumentType;
    }

    /**
     * Sets the value of the irsDocumentType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IRSDocumentEnum }{@code >}
     *
     */
    public void setIRSDocumentType(JAXBElement<IRSDocumentEnum> value) {
        this.irsDocumentType = value;
    }

    /**
     * Gets the value of the irsDocumentTypeOtherDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getIRSDocumentTypeOtherDescription() {
        return irsDocumentTypeOtherDescription;
    }

    /**
     * Sets the value of the irsDocumentTypeOtherDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setIRSDocumentTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.irsDocumentTypeOtherDescription = value;
    }

    /**
     * Gets the value of the otherTranscriptDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getOtherTranscriptDescription() {
        return otherTranscriptDescription;
    }

    /**
     * Sets the value of the otherTranscriptDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setOtherTranscriptDescription(JAXBElement<MISMOString> value) {
        this.otherTranscriptDescription = value;
    }

    /**
     * Gets the value of the recordOfAccountIndicator property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public JAXBElement<MISMOIndicator> getRecordOfAccountIndicator() {
        return recordOfAccountIndicator;
    }

    /**
     * Sets the value of the recordOfAccountIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public void setRecordOfAccountIndicator(JAXBElement<MISMOIndicator> value) {
        this.recordOfAccountIndicator = value;
    }

    /**
     * Gets the value of the returnTranscriptIndicator property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public JAXBElement<MISMOIndicator> getReturnTranscriptIndicator() {
        return returnTranscriptIndicator;
    }

    /**
     * Sets the value of the returnTranscriptIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public void setReturnTranscriptIndicator(JAXBElement<MISMOIndicator> value) {
        this.returnTranscriptIndicator = value;
    }

    /**
     * Gets the value of the verificationOfNonfilingIndicator property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public JAXBElement<MISMOIndicator> getVerificationOfNonfilingIndicator() {
        return verificationOfNonfilingIndicator;
    }

    /**
     * Sets the value of the verificationOfNonfilingIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public void setVerificationOfNonfilingIndicator(JAXBElement<MISMOIndicator> value) {
        this.verificationOfNonfilingIndicator = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link TAXRETURNDOCUMENTATIONDETAILEXTENSION }
     *
     */
    public TAXRETURNDOCUMENTATIONDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link TAXRETURNDOCUMENTATIONDETAILEXTENSION }
     *
     */
    public void setEXTENSION(TAXRETURNDOCUMENTATIONDETAILEXTENSION value) {
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
