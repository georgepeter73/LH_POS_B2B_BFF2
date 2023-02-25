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
 * All data points that are unique to processing a government loan including FHA, VA, Rural Housing, etc. This contains the contents of the combined FHA_BORROWER, FHA_VA_BORROWER and VA_BORROWER containers from Version 2.
 *
 * <p>Java class for GOVERNMENT_BORROWER complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GOVERNMENT_BORROWER">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CAIVRSIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="FHABorrowerCertificationLeadPaintIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="FHABorrowerCertificationOriginalMortgageAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="FHABorrowerCertificationOwnFourOrMoreDwellingsIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="FHABorrowerCertificationOwnOtherPropertyIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="FHABorrowerCertificationPropertySoldCityName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="FHABorrowerCertificationPropertySoldPostalCode" type="{http://www.mismo.org/residential/2009/schemas}MISMOCode" minOccurs="0"/>
 *         &lt;element name="FHABorrowerCertificationPropertySoldStateName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="FHABorrowerCertificationPropertySoldStreetAddressLineText" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="FHABorrowerCertificationPropertyToBeSoldIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="FHABorrowerCertificationRentalIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="FHABorrowerCertificationSalesPriceAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="FHA_VABorrowerCertificationSalesPriceExceedsAppraisedValueType" type="{http://www.mismo.org/residential/2009/schemas}FHA_VABorrowerCertificationSalesPriceExceedsAppraisedValueEnum" minOccurs="0"/>
 *         &lt;element name="VABorrowerCertificationOccupancyType" type="{http://www.mismo.org/residential/2009/schemas}VABorrowerCertificationOccupancyEnum" minOccurs="0"/>
 *         &lt;element name="VABorrowerSurvivingSpouseIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="VACoBorrowerNonTaxableIncomeAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="VACoBorrowerTaxableIncomeAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="VAFederalTaxAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="VALocalTaxAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="VAPrimaryBorrowerNonTaxableIncomeAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="VAPrimaryBorrowerTaxableIncomeAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="VASocialSecurityTaxAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="VAStateTaxAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="VeteranStatusIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}GOVERNMENT_BORROWER_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "GOVERNMENT_BORROWER", propOrder = {
    "caivrsIdentifier",
    "fhaBorrowerCertificationLeadPaintIndicator",
    "fhaBorrowerCertificationOriginalMortgageAmount",
    "fhaBorrowerCertificationOwnFourOrMoreDwellingsIndicator",
    "fhaBorrowerCertificationOwnOtherPropertyIndicator",
    "fhaBorrowerCertificationPropertySoldCityName",
    "fhaBorrowerCertificationPropertySoldPostalCode",
    "fhaBorrowerCertificationPropertySoldStateName",
    "fhaBorrowerCertificationPropertySoldStreetAddressLineText",
    "fhaBorrowerCertificationPropertyToBeSoldIndicator",
    "fhaBorrowerCertificationRentalIndicator",
    "fhaBorrowerCertificationSalesPriceAmount",
    "fhavaBorrowerCertificationSalesPriceExceedsAppraisedValueType",
    "vaBorrowerCertificationOccupancyType",
    "vaBorrowerSurvivingSpouseIndicator",
    "vaCoBorrowerNonTaxableIncomeAmount",
    "vaCoBorrowerTaxableIncomeAmount",
    "vaFederalTaxAmount",
    "vaLocalTaxAmount",
    "vaPrimaryBorrowerNonTaxableIncomeAmount",
    "vaPrimaryBorrowerTaxableIncomeAmount",
    "vaSocialSecurityTaxAmount",
    "vaStateTaxAmount",
    "veteranStatusIndicator",
    "extension"
})
public class GOVERNMENTBORROWER {

    @XmlElementRef(name = "CAIVRSIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> caivrsIdentifier;
    @XmlElementRef(name = "FHABorrowerCertificationLeadPaintIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> fhaBorrowerCertificationLeadPaintIndicator;
    @XmlElementRef(name = "FHABorrowerCertificationOriginalMortgageAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> fhaBorrowerCertificationOriginalMortgageAmount;
    @XmlElementRef(name = "FHABorrowerCertificationOwnFourOrMoreDwellingsIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> fhaBorrowerCertificationOwnFourOrMoreDwellingsIndicator;
    @XmlElementRef(name = "FHABorrowerCertificationOwnOtherPropertyIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> fhaBorrowerCertificationOwnOtherPropertyIndicator;
    @XmlElementRef(name = "FHABorrowerCertificationPropertySoldCityName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> fhaBorrowerCertificationPropertySoldCityName;
    @XmlElementRef(name = "FHABorrowerCertificationPropertySoldPostalCode", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCode> fhaBorrowerCertificationPropertySoldPostalCode;
    @XmlElementRef(name = "FHABorrowerCertificationPropertySoldStateName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> fhaBorrowerCertificationPropertySoldStateName;
    @XmlElementRef(name = "FHABorrowerCertificationPropertySoldStreetAddressLineText", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> fhaBorrowerCertificationPropertySoldStreetAddressLineText;
    @XmlElementRef(name = "FHABorrowerCertificationPropertyToBeSoldIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> fhaBorrowerCertificationPropertyToBeSoldIndicator;
    @XmlElementRef(name = "FHABorrowerCertificationRentalIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> fhaBorrowerCertificationRentalIndicator;
    @XmlElementRef(name = "FHABorrowerCertificationSalesPriceAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> fhaBorrowerCertificationSalesPriceAmount;
    @XmlElementRef(name = "FHA_VABorrowerCertificationSalesPriceExceedsAppraisedValueType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<FHAVABorrowerCertificationSalesPriceExceedsAppraisedValueEnum> fhavaBorrowerCertificationSalesPriceExceedsAppraisedValueType;
    @XmlElementRef(name = "VABorrowerCertificationOccupancyType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<VABorrowerCertificationOccupancyEnum> vaBorrowerCertificationOccupancyType;
    @XmlElementRef(name = "VABorrowerSurvivingSpouseIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> vaBorrowerSurvivingSpouseIndicator;
    @XmlElementRef(name = "VACoBorrowerNonTaxableIncomeAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> vaCoBorrowerNonTaxableIncomeAmount;
    @XmlElementRef(name = "VACoBorrowerTaxableIncomeAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> vaCoBorrowerTaxableIncomeAmount;
    @XmlElementRef(name = "VAFederalTaxAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> vaFederalTaxAmount;
    @XmlElementRef(name = "VALocalTaxAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> vaLocalTaxAmount;
    @XmlElementRef(name = "VAPrimaryBorrowerNonTaxableIncomeAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> vaPrimaryBorrowerNonTaxableIncomeAmount;
    @XmlElementRef(name = "VAPrimaryBorrowerTaxableIncomeAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> vaPrimaryBorrowerTaxableIncomeAmount;
    @XmlElementRef(name = "VASocialSecurityTaxAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> vaSocialSecurityTaxAmount;
    @XmlElementRef(name = "VAStateTaxAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> vaStateTaxAmount;
    @XmlElementRef(name = "VeteranStatusIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> veteranStatusIndicator;
    @XmlElement(name = "EXTENSION")
    protected GOVERNMENTBORROWEREXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the caivrsIdentifier property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public JAXBElement<MISMOIdentifier> getCAIVRSIdentifier() {
        return caivrsIdentifier;
    }

    /**
     * Sets the value of the caivrsIdentifier property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public void setCAIVRSIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.caivrsIdentifier = value;
    }

    /**
     * Gets the value of the fhaBorrowerCertificationLeadPaintIndicator property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public JAXBElement<MISMOIndicator> getFHABorrowerCertificationLeadPaintIndicator() {
        return fhaBorrowerCertificationLeadPaintIndicator;
    }

    /**
     * Sets the value of the fhaBorrowerCertificationLeadPaintIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public void setFHABorrowerCertificationLeadPaintIndicator(JAXBElement<MISMOIndicator> value) {
        this.fhaBorrowerCertificationLeadPaintIndicator = value;
    }

    /**
     * Gets the value of the fhaBorrowerCertificationOriginalMortgageAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getFHABorrowerCertificationOriginalMortgageAmount() {
        return fhaBorrowerCertificationOriginalMortgageAmount;
    }

    /**
     * Sets the value of the fhaBorrowerCertificationOriginalMortgageAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setFHABorrowerCertificationOriginalMortgageAmount(JAXBElement<MISMOAmount> value) {
        this.fhaBorrowerCertificationOriginalMortgageAmount = value;
    }

    /**
     * Gets the value of the fhaBorrowerCertificationOwnFourOrMoreDwellingsIndicator property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public JAXBElement<MISMOIndicator> getFHABorrowerCertificationOwnFourOrMoreDwellingsIndicator() {
        return fhaBorrowerCertificationOwnFourOrMoreDwellingsIndicator;
    }

    /**
     * Sets the value of the fhaBorrowerCertificationOwnFourOrMoreDwellingsIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public void setFHABorrowerCertificationOwnFourOrMoreDwellingsIndicator(JAXBElement<MISMOIndicator> value) {
        this.fhaBorrowerCertificationOwnFourOrMoreDwellingsIndicator = value;
    }

    /**
     * Gets the value of the fhaBorrowerCertificationOwnOtherPropertyIndicator property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public JAXBElement<MISMOIndicator> getFHABorrowerCertificationOwnOtherPropertyIndicator() {
        return fhaBorrowerCertificationOwnOtherPropertyIndicator;
    }

    /**
     * Sets the value of the fhaBorrowerCertificationOwnOtherPropertyIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public void setFHABorrowerCertificationOwnOtherPropertyIndicator(JAXBElement<MISMOIndicator> value) {
        this.fhaBorrowerCertificationOwnOtherPropertyIndicator = value;
    }

    /**
     * Gets the value of the fhaBorrowerCertificationPropertySoldCityName property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getFHABorrowerCertificationPropertySoldCityName() {
        return fhaBorrowerCertificationPropertySoldCityName;
    }

    /**
     * Sets the value of the fhaBorrowerCertificationPropertySoldCityName property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setFHABorrowerCertificationPropertySoldCityName(JAXBElement<MISMOString> value) {
        this.fhaBorrowerCertificationPropertySoldCityName = value;
    }

    /**
     * Gets the value of the fhaBorrowerCertificationPropertySoldPostalCode property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *
     */
    public JAXBElement<MISMOCode> getFHABorrowerCertificationPropertySoldPostalCode() {
        return fhaBorrowerCertificationPropertySoldPostalCode;
    }

    /**
     * Sets the value of the fhaBorrowerCertificationPropertySoldPostalCode property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCode }{@code >}
     *
     */
    public void setFHABorrowerCertificationPropertySoldPostalCode(JAXBElement<MISMOCode> value) {
        this.fhaBorrowerCertificationPropertySoldPostalCode = value;
    }

    /**
     * Gets the value of the fhaBorrowerCertificationPropertySoldStateName property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getFHABorrowerCertificationPropertySoldStateName() {
        return fhaBorrowerCertificationPropertySoldStateName;
    }

    /**
     * Sets the value of the fhaBorrowerCertificationPropertySoldStateName property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setFHABorrowerCertificationPropertySoldStateName(JAXBElement<MISMOString> value) {
        this.fhaBorrowerCertificationPropertySoldStateName = value;
    }

    /**
     * Gets the value of the fhaBorrowerCertificationPropertySoldStreetAddressLineText property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getFHABorrowerCertificationPropertySoldStreetAddressLineText() {
        return fhaBorrowerCertificationPropertySoldStreetAddressLineText;
    }

    /**
     * Sets the value of the fhaBorrowerCertificationPropertySoldStreetAddressLineText property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setFHABorrowerCertificationPropertySoldStreetAddressLineText(JAXBElement<MISMOString> value) {
        this.fhaBorrowerCertificationPropertySoldStreetAddressLineText = value;
    }

    /**
     * Gets the value of the fhaBorrowerCertificationPropertyToBeSoldIndicator property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public JAXBElement<MISMOIndicator> getFHABorrowerCertificationPropertyToBeSoldIndicator() {
        return fhaBorrowerCertificationPropertyToBeSoldIndicator;
    }

    /**
     * Sets the value of the fhaBorrowerCertificationPropertyToBeSoldIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public void setFHABorrowerCertificationPropertyToBeSoldIndicator(JAXBElement<MISMOIndicator> value) {
        this.fhaBorrowerCertificationPropertyToBeSoldIndicator = value;
    }

    /**
     * Gets the value of the fhaBorrowerCertificationRentalIndicator property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public JAXBElement<MISMOIndicator> getFHABorrowerCertificationRentalIndicator() {
        return fhaBorrowerCertificationRentalIndicator;
    }

    /**
     * Sets the value of the fhaBorrowerCertificationRentalIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public void setFHABorrowerCertificationRentalIndicator(JAXBElement<MISMOIndicator> value) {
        this.fhaBorrowerCertificationRentalIndicator = value;
    }

    /**
     * Gets the value of the fhaBorrowerCertificationSalesPriceAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getFHABorrowerCertificationSalesPriceAmount() {
        return fhaBorrowerCertificationSalesPriceAmount;
    }

    /**
     * Sets the value of the fhaBorrowerCertificationSalesPriceAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setFHABorrowerCertificationSalesPriceAmount(JAXBElement<MISMOAmount> value) {
        this.fhaBorrowerCertificationSalesPriceAmount = value;
    }

    /**
     * Gets the value of the fhavaBorrowerCertificationSalesPriceExceedsAppraisedValueType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FHAVABorrowerCertificationSalesPriceExceedsAppraisedValueEnum }{@code >}
     *
     */
    public JAXBElement<FHAVABorrowerCertificationSalesPriceExceedsAppraisedValueEnum> getFHAVABorrowerCertificationSalesPriceExceedsAppraisedValueType() {
        return fhavaBorrowerCertificationSalesPriceExceedsAppraisedValueType;
    }

    /**
     * Sets the value of the fhavaBorrowerCertificationSalesPriceExceedsAppraisedValueType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FHAVABorrowerCertificationSalesPriceExceedsAppraisedValueEnum }{@code >}
     *
     */
    public void setFHAVABorrowerCertificationSalesPriceExceedsAppraisedValueType(JAXBElement<FHAVABorrowerCertificationSalesPriceExceedsAppraisedValueEnum> value) {
        this.fhavaBorrowerCertificationSalesPriceExceedsAppraisedValueType = value;
    }

    /**
     * Gets the value of the vaBorrowerCertificationOccupancyType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VABorrowerCertificationOccupancyEnum }{@code >}
     *
     */
    public JAXBElement<VABorrowerCertificationOccupancyEnum> getVABorrowerCertificationOccupancyType() {
        return vaBorrowerCertificationOccupancyType;
    }

    /**
     * Sets the value of the vaBorrowerCertificationOccupancyType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VABorrowerCertificationOccupancyEnum }{@code >}
     *
     */
    public void setVABorrowerCertificationOccupancyType(JAXBElement<VABorrowerCertificationOccupancyEnum> value) {
        this.vaBorrowerCertificationOccupancyType = value;
    }

    /**
     * Gets the value of the vaBorrowerSurvivingSpouseIndicator property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public JAXBElement<MISMOIndicator> getVABorrowerSurvivingSpouseIndicator() {
        return vaBorrowerSurvivingSpouseIndicator;
    }

    /**
     * Sets the value of the vaBorrowerSurvivingSpouseIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public void setVABorrowerSurvivingSpouseIndicator(JAXBElement<MISMOIndicator> value) {
        this.vaBorrowerSurvivingSpouseIndicator = value;
    }

    /**
     * Gets the value of the vaCoBorrowerNonTaxableIncomeAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getVACoBorrowerNonTaxableIncomeAmount() {
        return vaCoBorrowerNonTaxableIncomeAmount;
    }

    /**
     * Sets the value of the vaCoBorrowerNonTaxableIncomeAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setVACoBorrowerNonTaxableIncomeAmount(JAXBElement<MISMOAmount> value) {
        this.vaCoBorrowerNonTaxableIncomeAmount = value;
    }

    /**
     * Gets the value of the vaCoBorrowerTaxableIncomeAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getVACoBorrowerTaxableIncomeAmount() {
        return vaCoBorrowerTaxableIncomeAmount;
    }

    /**
     * Sets the value of the vaCoBorrowerTaxableIncomeAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setVACoBorrowerTaxableIncomeAmount(JAXBElement<MISMOAmount> value) {
        this.vaCoBorrowerTaxableIncomeAmount = value;
    }

    /**
     * Gets the value of the vaFederalTaxAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getVAFederalTaxAmount() {
        return vaFederalTaxAmount;
    }

    /**
     * Sets the value of the vaFederalTaxAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setVAFederalTaxAmount(JAXBElement<MISMOAmount> value) {
        this.vaFederalTaxAmount = value;
    }

    /**
     * Gets the value of the vaLocalTaxAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getVALocalTaxAmount() {
        return vaLocalTaxAmount;
    }

    /**
     * Sets the value of the vaLocalTaxAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setVALocalTaxAmount(JAXBElement<MISMOAmount> value) {
        this.vaLocalTaxAmount = value;
    }

    /**
     * Gets the value of the vaPrimaryBorrowerNonTaxableIncomeAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getVAPrimaryBorrowerNonTaxableIncomeAmount() {
        return vaPrimaryBorrowerNonTaxableIncomeAmount;
    }

    /**
     * Sets the value of the vaPrimaryBorrowerNonTaxableIncomeAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setVAPrimaryBorrowerNonTaxableIncomeAmount(JAXBElement<MISMOAmount> value) {
        this.vaPrimaryBorrowerNonTaxableIncomeAmount = value;
    }

    /**
     * Gets the value of the vaPrimaryBorrowerTaxableIncomeAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getVAPrimaryBorrowerTaxableIncomeAmount() {
        return vaPrimaryBorrowerTaxableIncomeAmount;
    }

    /**
     * Sets the value of the vaPrimaryBorrowerTaxableIncomeAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setVAPrimaryBorrowerTaxableIncomeAmount(JAXBElement<MISMOAmount> value) {
        this.vaPrimaryBorrowerTaxableIncomeAmount = value;
    }

    /**
     * Gets the value of the vaSocialSecurityTaxAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getVASocialSecurityTaxAmount() {
        return vaSocialSecurityTaxAmount;
    }

    /**
     * Sets the value of the vaSocialSecurityTaxAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setVASocialSecurityTaxAmount(JAXBElement<MISMOAmount> value) {
        this.vaSocialSecurityTaxAmount = value;
    }

    /**
     * Gets the value of the vaStateTaxAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getVAStateTaxAmount() {
        return vaStateTaxAmount;
    }

    /**
     * Sets the value of the vaStateTaxAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setVAStateTaxAmount(JAXBElement<MISMOAmount> value) {
        this.vaStateTaxAmount = value;
    }

    /**
     * Gets the value of the veteranStatusIndicator property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public JAXBElement<MISMOIndicator> getVeteranStatusIndicator() {
        return veteranStatusIndicator;
    }

    /**
     * Sets the value of the veteranStatusIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public void setVeteranStatusIndicator(JAXBElement<MISMOIndicator> value) {
        this.veteranStatusIndicator = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link GOVERNMENTBORROWEREXTENSION }
     *
     */
    public GOVERNMENTBORROWEREXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link GOVERNMENTBORROWEREXTENSION }
     *
     */
    public void setEXTENSION(GOVERNMENTBORROWEREXTENSION value) {
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
