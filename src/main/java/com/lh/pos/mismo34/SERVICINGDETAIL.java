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
 * <p>Java class for SERVICING_DETAIL complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SERVICING_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActiveServicingTransferIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="DefaultStatusType" type="{http://www.mismo.org/residential/2009/schemas}DefaultStatusEnum" minOccurs="0"/>
 *         &lt;element name="DefaultStatusTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="LoanAcquisitionActualUPBAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="LoanActivityReportingTransactionIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="LoanImminentDefaultSourceType" type="{http://www.mismo.org/residential/2009/schemas}LoanImminentDefaultSourceEnum" minOccurs="0"/>
 *         &lt;element name="LoanImminentDefaultSourceTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="PreviouslyReportedInformationRevisionIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="ServicerWelcomeCallPerformedDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="SFDMSAutomatedDefaultProcessingIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="TitleReportLastReceivedDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}SERVICING_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "SERVICING_DETAIL", propOrder = {
    "activeServicingTransferIndicator",
    "defaultStatusType",
    "defaultStatusTypeOtherDescription",
    "loanAcquisitionActualUPBAmount",
    "loanActivityReportingTransactionIdentifier",
    "loanImminentDefaultSourceType",
    "loanImminentDefaultSourceTypeOtherDescription",
    "previouslyReportedInformationRevisionIndicator",
    "servicerWelcomeCallPerformedDate",
    "sfdmsAutomatedDefaultProcessingIdentifier",
    "titleReportLastReceivedDate",
    "extension"
})
public class SERVICINGDETAIL {

    @XmlElementRef(name = "ActiveServicingTransferIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> activeServicingTransferIndicator;
    @XmlElementRef(name = "DefaultStatusType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<DefaultStatusEnum> defaultStatusType;
    @XmlElementRef(name = "DefaultStatusTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> defaultStatusTypeOtherDescription;
    @XmlElementRef(name = "LoanAcquisitionActualUPBAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> loanAcquisitionActualUPBAmount;
    @XmlElementRef(name = "LoanActivityReportingTransactionIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> loanActivityReportingTransactionIdentifier;
    @XmlElementRef(name = "LoanImminentDefaultSourceType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<LoanImminentDefaultSourceEnum> loanImminentDefaultSourceType;
    @XmlElementRef(name = "LoanImminentDefaultSourceTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> loanImminentDefaultSourceTypeOtherDescription;
    @XmlElementRef(name = "PreviouslyReportedInformationRevisionIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> previouslyReportedInformationRevisionIndicator;
    @XmlElementRef(name = "ServicerWelcomeCallPerformedDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> servicerWelcomeCallPerformedDate;
    @XmlElementRef(name = "SFDMSAutomatedDefaultProcessingIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> sfdmsAutomatedDefaultProcessingIdentifier;
    @XmlElementRef(name = "TitleReportLastReceivedDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> titleReportLastReceivedDate;
    @XmlElement(name = "EXTENSION")
    protected SERVICINGDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the activeServicingTransferIndicator property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public JAXBElement<MISMOIndicator> getActiveServicingTransferIndicator() {
        return activeServicingTransferIndicator;
    }

    /**
     * Sets the value of the activeServicingTransferIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public void setActiveServicingTransferIndicator(JAXBElement<MISMOIndicator> value) {
        this.activeServicingTransferIndicator = value;
    }

    /**
     * Gets the value of the defaultStatusType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DefaultStatusEnum }{@code >}
     *
     */
    public JAXBElement<DefaultStatusEnum> getDefaultStatusType() {
        return defaultStatusType;
    }

    /**
     * Sets the value of the defaultStatusType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DefaultStatusEnum }{@code >}
     *
     */
    public void setDefaultStatusType(JAXBElement<DefaultStatusEnum> value) {
        this.defaultStatusType = value;
    }

    /**
     * Gets the value of the defaultStatusTypeOtherDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getDefaultStatusTypeOtherDescription() {
        return defaultStatusTypeOtherDescription;
    }

    /**
     * Sets the value of the defaultStatusTypeOtherDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setDefaultStatusTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.defaultStatusTypeOtherDescription = value;
    }

    /**
     * Gets the value of the loanAcquisitionActualUPBAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getLoanAcquisitionActualUPBAmount() {
        return loanAcquisitionActualUPBAmount;
    }

    /**
     * Sets the value of the loanAcquisitionActualUPBAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setLoanAcquisitionActualUPBAmount(JAXBElement<MISMOAmount> value) {
        this.loanAcquisitionActualUPBAmount = value;
    }

    /**
     * Gets the value of the loanActivityReportingTransactionIdentifier property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public JAXBElement<MISMOIdentifier> getLoanActivityReportingTransactionIdentifier() {
        return loanActivityReportingTransactionIdentifier;
    }

    /**
     * Sets the value of the loanActivityReportingTransactionIdentifier property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public void setLoanActivityReportingTransactionIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.loanActivityReportingTransactionIdentifier = value;
    }

    /**
     * Gets the value of the loanImminentDefaultSourceType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LoanImminentDefaultSourceEnum }{@code >}
     *
     */
    public JAXBElement<LoanImminentDefaultSourceEnum> getLoanImminentDefaultSourceType() {
        return loanImminentDefaultSourceType;
    }

    /**
     * Sets the value of the loanImminentDefaultSourceType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LoanImminentDefaultSourceEnum }{@code >}
     *
     */
    public void setLoanImminentDefaultSourceType(JAXBElement<LoanImminentDefaultSourceEnum> value) {
        this.loanImminentDefaultSourceType = value;
    }

    /**
     * Gets the value of the loanImminentDefaultSourceTypeOtherDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getLoanImminentDefaultSourceTypeOtherDescription() {
        return loanImminentDefaultSourceTypeOtherDescription;
    }

    /**
     * Sets the value of the loanImminentDefaultSourceTypeOtherDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setLoanImminentDefaultSourceTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.loanImminentDefaultSourceTypeOtherDescription = value;
    }

    /**
     * Gets the value of the previouslyReportedInformationRevisionIndicator property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public JAXBElement<MISMOIndicator> getPreviouslyReportedInformationRevisionIndicator() {
        return previouslyReportedInformationRevisionIndicator;
    }

    /**
     * Sets the value of the previouslyReportedInformationRevisionIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public void setPreviouslyReportedInformationRevisionIndicator(JAXBElement<MISMOIndicator> value) {
        this.previouslyReportedInformationRevisionIndicator = value;
    }

    /**
     * Gets the value of the servicerWelcomeCallPerformedDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public JAXBElement<MISMODate> getServicerWelcomeCallPerformedDate() {
        return servicerWelcomeCallPerformedDate;
    }

    /**
     * Sets the value of the servicerWelcomeCallPerformedDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public void setServicerWelcomeCallPerformedDate(JAXBElement<MISMODate> value) {
        this.servicerWelcomeCallPerformedDate = value;
    }

    /**
     * Gets the value of the sfdmsAutomatedDefaultProcessingIdentifier property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public JAXBElement<MISMOIdentifier> getSFDMSAutomatedDefaultProcessingIdentifier() {
        return sfdmsAutomatedDefaultProcessingIdentifier;
    }

    /**
     * Sets the value of the sfdmsAutomatedDefaultProcessingIdentifier property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public void setSFDMSAutomatedDefaultProcessingIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.sfdmsAutomatedDefaultProcessingIdentifier = value;
    }

    /**
     * Gets the value of the titleReportLastReceivedDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public JAXBElement<MISMODate> getTitleReportLastReceivedDate() {
        return titleReportLastReceivedDate;
    }

    /**
     * Sets the value of the titleReportLastReceivedDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public void setTitleReportLastReceivedDate(JAXBElement<MISMODate> value) {
        this.titleReportLastReceivedDate = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link SERVICINGDETAILEXTENSION }
     *
     */
    public SERVICINGDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link SERVICINGDETAILEXTENSION }
     *
     */
    public void setEXTENSION(SERVICINGDETAILEXTENSION value) {
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