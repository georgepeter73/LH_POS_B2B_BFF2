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
 * Specifies the amount and method of payment and additional information.
 *
 * <p>Java class for SERVICE_PAYMENT_DETAIL complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SERVICE_PAYMENT_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InternalAccountIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="ServicePaymentAccountIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="ServicePaymentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ServicePaymentCreditAccountExpirationDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="ServicePaymentCreditMethodType" type="{http://www.mismo.org/residential/2009/schemas}ServicePaymentCreditMethodEnum" minOccurs="0"/>
 *         &lt;element name="ServicePaymentCreditMethodTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ServicePaymentMethodType" type="{http://www.mismo.org/residential/2009/schemas}ServicePaymentMethodEnum" minOccurs="0"/>
 *         &lt;element name="ServicePaymentMethodTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ServicePaymentOnAccountIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="ServicePaymentOnAccountMaximumDebitAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ServicePaymentOnAccountMinimumBalanceAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="ServicePaymentReferenceIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="ServicePaymentSecondaryCreditAccountIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}SERVICE_PAYMENT_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "SERVICE_PAYMENT_DETAIL", propOrder = {
    "internalAccountIdentifier",
    "servicePaymentAccountIdentifier",
    "servicePaymentAmount",
    "servicePaymentCreditAccountExpirationDate",
    "servicePaymentCreditMethodType",
    "servicePaymentCreditMethodTypeOtherDescription",
    "servicePaymentMethodType",
    "servicePaymentMethodTypeOtherDescription",
    "servicePaymentOnAccountIdentifier",
    "servicePaymentOnAccountMaximumDebitAmount",
    "servicePaymentOnAccountMinimumBalanceAmount",
    "servicePaymentReferenceIdentifier",
    "servicePaymentSecondaryCreditAccountIdentifier",
    "extension"
})
public class SERVICEPAYMENTDETAIL {

    @XmlElementRef(name = "InternalAccountIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> internalAccountIdentifier;
    @XmlElementRef(name = "ServicePaymentAccountIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> servicePaymentAccountIdentifier;
    @XmlElementRef(name = "ServicePaymentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> servicePaymentAmount;
    @XmlElementRef(name = "ServicePaymentCreditAccountExpirationDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> servicePaymentCreditAccountExpirationDate;
    @XmlElementRef(name = "ServicePaymentCreditMethodType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ServicePaymentCreditMethodEnum> servicePaymentCreditMethodType;
    @XmlElementRef(name = "ServicePaymentCreditMethodTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> servicePaymentCreditMethodTypeOtherDescription;
    @XmlElementRef(name = "ServicePaymentMethodType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ServicePaymentMethodEnum> servicePaymentMethodType;
    @XmlElementRef(name = "ServicePaymentMethodTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> servicePaymentMethodTypeOtherDescription;
    @XmlElementRef(name = "ServicePaymentOnAccountIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> servicePaymentOnAccountIdentifier;
    @XmlElementRef(name = "ServicePaymentOnAccountMaximumDebitAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> servicePaymentOnAccountMaximumDebitAmount;
    @XmlElementRef(name = "ServicePaymentOnAccountMinimumBalanceAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> servicePaymentOnAccountMinimumBalanceAmount;
    @XmlElementRef(name = "ServicePaymentReferenceIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> servicePaymentReferenceIdentifier;
    @XmlElementRef(name = "ServicePaymentSecondaryCreditAccountIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> servicePaymentSecondaryCreditAccountIdentifier;
    @XmlElement(name = "EXTENSION")
    protected SERVICEPAYMENTDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the internalAccountIdentifier property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public JAXBElement<MISMOIdentifier> getInternalAccountIdentifier() {
        return internalAccountIdentifier;
    }

    /**
     * Sets the value of the internalAccountIdentifier property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public void setInternalAccountIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.internalAccountIdentifier = value;
    }

    /**
     * Gets the value of the servicePaymentAccountIdentifier property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public JAXBElement<MISMOIdentifier> getServicePaymentAccountIdentifier() {
        return servicePaymentAccountIdentifier;
    }

    /**
     * Sets the value of the servicePaymentAccountIdentifier property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public void setServicePaymentAccountIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.servicePaymentAccountIdentifier = value;
    }

    /**
     * Gets the value of the servicePaymentAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getServicePaymentAmount() {
        return servicePaymentAmount;
    }

    /**
     * Sets the value of the servicePaymentAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setServicePaymentAmount(JAXBElement<MISMOAmount> value) {
        this.servicePaymentAmount = value;
    }

    /**
     * Gets the value of the servicePaymentCreditAccountExpirationDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public JAXBElement<MISMODate> getServicePaymentCreditAccountExpirationDate() {
        return servicePaymentCreditAccountExpirationDate;
    }

    /**
     * Sets the value of the servicePaymentCreditAccountExpirationDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public void setServicePaymentCreditAccountExpirationDate(JAXBElement<MISMODate> value) {
        this.servicePaymentCreditAccountExpirationDate = value;
    }

    /**
     * Gets the value of the servicePaymentCreditMethodType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServicePaymentCreditMethodEnum }{@code >}
     *
     */
    public JAXBElement<ServicePaymentCreditMethodEnum> getServicePaymentCreditMethodType() {
        return servicePaymentCreditMethodType;
    }

    /**
     * Sets the value of the servicePaymentCreditMethodType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServicePaymentCreditMethodEnum }{@code >}
     *
     */
    public void setServicePaymentCreditMethodType(JAXBElement<ServicePaymentCreditMethodEnum> value) {
        this.servicePaymentCreditMethodType = value;
    }

    /**
     * Gets the value of the servicePaymentCreditMethodTypeOtherDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getServicePaymentCreditMethodTypeOtherDescription() {
        return servicePaymentCreditMethodTypeOtherDescription;
    }

    /**
     * Sets the value of the servicePaymentCreditMethodTypeOtherDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setServicePaymentCreditMethodTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.servicePaymentCreditMethodTypeOtherDescription = value;
    }

    /**
     * Gets the value of the servicePaymentMethodType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServicePaymentMethodEnum }{@code >}
     *
     */
    public JAXBElement<ServicePaymentMethodEnum> getServicePaymentMethodType() {
        return servicePaymentMethodType;
    }

    /**
     * Sets the value of the servicePaymentMethodType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServicePaymentMethodEnum }{@code >}
     *
     */
    public void setServicePaymentMethodType(JAXBElement<ServicePaymentMethodEnum> value) {
        this.servicePaymentMethodType = value;
    }

    /**
     * Gets the value of the servicePaymentMethodTypeOtherDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getServicePaymentMethodTypeOtherDescription() {
        return servicePaymentMethodTypeOtherDescription;
    }

    /**
     * Sets the value of the servicePaymentMethodTypeOtherDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setServicePaymentMethodTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.servicePaymentMethodTypeOtherDescription = value;
    }

    /**
     * Gets the value of the servicePaymentOnAccountIdentifier property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public JAXBElement<MISMOIdentifier> getServicePaymentOnAccountIdentifier() {
        return servicePaymentOnAccountIdentifier;
    }

    /**
     * Sets the value of the servicePaymentOnAccountIdentifier property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public void setServicePaymentOnAccountIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.servicePaymentOnAccountIdentifier = value;
    }

    /**
     * Gets the value of the servicePaymentOnAccountMaximumDebitAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getServicePaymentOnAccountMaximumDebitAmount() {
        return servicePaymentOnAccountMaximumDebitAmount;
    }

    /**
     * Sets the value of the servicePaymentOnAccountMaximumDebitAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setServicePaymentOnAccountMaximumDebitAmount(JAXBElement<MISMOAmount> value) {
        this.servicePaymentOnAccountMaximumDebitAmount = value;
    }

    /**
     * Gets the value of the servicePaymentOnAccountMinimumBalanceAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getServicePaymentOnAccountMinimumBalanceAmount() {
        return servicePaymentOnAccountMinimumBalanceAmount;
    }

    /**
     * Sets the value of the servicePaymentOnAccountMinimumBalanceAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setServicePaymentOnAccountMinimumBalanceAmount(JAXBElement<MISMOAmount> value) {
        this.servicePaymentOnAccountMinimumBalanceAmount = value;
    }

    /**
     * Gets the value of the servicePaymentReferenceIdentifier property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public JAXBElement<MISMOIdentifier> getServicePaymentReferenceIdentifier() {
        return servicePaymentReferenceIdentifier;
    }

    /**
     * Sets the value of the servicePaymentReferenceIdentifier property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public void setServicePaymentReferenceIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.servicePaymentReferenceIdentifier = value;
    }

    /**
     * Gets the value of the servicePaymentSecondaryCreditAccountIdentifier property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public JAXBElement<MISMOIdentifier> getServicePaymentSecondaryCreditAccountIdentifier() {
        return servicePaymentSecondaryCreditAccountIdentifier;
    }

    /**
     * Sets the value of the servicePaymentSecondaryCreditAccountIdentifier property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public void setServicePaymentSecondaryCreditAccountIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.servicePaymentSecondaryCreditAccountIdentifier = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link SERVICEPAYMENTDETAILEXTENSION }
     *
     */
    public SERVICEPAYMENTDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link SERVICEPAYMENTDETAILEXTENSION }
     *
     */
    public void setEXTENSION(SERVICEPAYMENTDETAILEXTENSION value) {
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
