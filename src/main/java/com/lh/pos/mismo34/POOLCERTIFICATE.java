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
 * Information about a security certificate associated with a pool.
 *
 * <p>Java class for POOL_CERTIFICATE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="POOL_CERTIFICATE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PoolCertificateCurrentAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="PoolCertificateHolderPayeeIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="PoolCertificateIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *         &lt;element name="PoolCertificateInitialPaymentDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="PoolCertificateIssueDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="PoolCertificateMaturityDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="PoolCertificateOriginalAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="PoolCertificatePrincipalPaidAmount" type="{http://www.mismo.org/residential/2009/schemas}MISMOAmount" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}POOL_CERTIFICATE_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "POOL_CERTIFICATE", propOrder = {
    "poolCertificateCurrentAmount",
    "poolCertificateHolderPayeeIdentifier",
    "poolCertificateIdentifier",
    "poolCertificateInitialPaymentDate",
    "poolCertificateIssueDate",
    "poolCertificateMaturityDate",
    "poolCertificateOriginalAmount",
    "poolCertificatePrincipalPaidAmount",
    "extension"
})
public class POOLCERTIFICATE {

    @XmlElementRef(name = "PoolCertificateCurrentAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> poolCertificateCurrentAmount;
    @XmlElementRef(name = "PoolCertificateHolderPayeeIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> poolCertificateHolderPayeeIdentifier;
    @XmlElementRef(name = "PoolCertificateIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> poolCertificateIdentifier;
    @XmlElementRef(name = "PoolCertificateInitialPaymentDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> poolCertificateInitialPaymentDate;
    @XmlElementRef(name = "PoolCertificateIssueDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> poolCertificateIssueDate;
    @XmlElementRef(name = "PoolCertificateMaturityDate", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODate> poolCertificateMaturityDate;
    @XmlElementRef(name = "PoolCertificateOriginalAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> poolCertificateOriginalAmount;
    @XmlElementRef(name = "PoolCertificatePrincipalPaidAmount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOAmount> poolCertificatePrincipalPaidAmount;
    @XmlElement(name = "EXTENSION")
    protected POOLCERTIFICATEEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the poolCertificateCurrentAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getPoolCertificateCurrentAmount() {
        return poolCertificateCurrentAmount;
    }

    /**
     * Sets the value of the poolCertificateCurrentAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setPoolCertificateCurrentAmount(JAXBElement<MISMOAmount> value) {
        this.poolCertificateCurrentAmount = value;
    }

    /**
     * Gets the value of the poolCertificateHolderPayeeIdentifier property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public JAXBElement<MISMOIdentifier> getPoolCertificateHolderPayeeIdentifier() {
        return poolCertificateHolderPayeeIdentifier;
    }

    /**
     * Sets the value of the poolCertificateHolderPayeeIdentifier property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public void setPoolCertificateHolderPayeeIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.poolCertificateHolderPayeeIdentifier = value;
    }

    /**
     * Gets the value of the poolCertificateIdentifier property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public JAXBElement<MISMOIdentifier> getPoolCertificateIdentifier() {
        return poolCertificateIdentifier;
    }

    /**
     * Sets the value of the poolCertificateIdentifier property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public void setPoolCertificateIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.poolCertificateIdentifier = value;
    }

    /**
     * Gets the value of the poolCertificateInitialPaymentDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public JAXBElement<MISMODate> getPoolCertificateInitialPaymentDate() {
        return poolCertificateInitialPaymentDate;
    }

    /**
     * Sets the value of the poolCertificateInitialPaymentDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public void setPoolCertificateInitialPaymentDate(JAXBElement<MISMODate> value) {
        this.poolCertificateInitialPaymentDate = value;
    }

    /**
     * Gets the value of the poolCertificateIssueDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public JAXBElement<MISMODate> getPoolCertificateIssueDate() {
        return poolCertificateIssueDate;
    }

    /**
     * Sets the value of the poolCertificateIssueDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public void setPoolCertificateIssueDate(JAXBElement<MISMODate> value) {
        this.poolCertificateIssueDate = value;
    }

    /**
     * Gets the value of the poolCertificateMaturityDate property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public JAXBElement<MISMODate> getPoolCertificateMaturityDate() {
        return poolCertificateMaturityDate;
    }

    /**
     * Sets the value of the poolCertificateMaturityDate property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODate }{@code >}
     *
     */
    public void setPoolCertificateMaturityDate(JAXBElement<MISMODate> value) {
        this.poolCertificateMaturityDate = value;
    }

    /**
     * Gets the value of the poolCertificateOriginalAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getPoolCertificateOriginalAmount() {
        return poolCertificateOriginalAmount;
    }

    /**
     * Sets the value of the poolCertificateOriginalAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setPoolCertificateOriginalAmount(JAXBElement<MISMOAmount> value) {
        this.poolCertificateOriginalAmount = value;
    }

    /**
     * Gets the value of the poolCertificatePrincipalPaidAmount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public JAXBElement<MISMOAmount> getPoolCertificatePrincipalPaidAmount() {
        return poolCertificatePrincipalPaidAmount;
    }

    /**
     * Sets the value of the poolCertificatePrincipalPaidAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOAmount }{@code >}
     *
     */
    public void setPoolCertificatePrincipalPaidAmount(JAXBElement<MISMOAmount> value) {
        this.poolCertificatePrincipalPaidAmount = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link POOLCERTIFICATEEXTENSION }
     *
     */
    public POOLCERTIFICATEEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link POOLCERTIFICATEEXTENSION }
     *
     */
    public void setEXTENSION(POOLCERTIFICATEEXTENSION value) {
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
