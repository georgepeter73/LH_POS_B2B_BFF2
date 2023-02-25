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
 * Used to hold content that is not part of the namespace or version of the MISMO V3 model  It is either contained directly (via EmbeddedContentXML) or indirectly (via LocationURI). A FOREIGN_OBJECT can be Encoded in a variety of manners without
 *
 * <p>Java class for FOREIGN_OBJECT complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FOREIGN_OBJECT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="REFERENCE" type="{http://www.mismo.org/residential/2009/schemas}REFERENCE" minOccurs="0"/>
 *           &lt;sequence>
 *             &lt;choice minOccurs="0">
 *               &lt;element name="EmbeddedContentXML" type="{http://www.mismo.org/residential/2009/schemas}MISMOXML" minOccurs="0"/>
 *               &lt;element name="ObjectURL" type="{http://www.mismo.org/residential/2009/schemas}MISMOObjectURL" minOccurs="0"/>
 *             &lt;/choice>
 *             &lt;element name="CharacterEncodingSetType" type="{http://www.mismo.org/residential/2009/schemas}CharacterEncodingSetEnum" minOccurs="0"/>
 *             &lt;element name="CharacterEncodingSetTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *             &lt;element name="MIMETypeIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *             &lt;element name="MIMETypeVersionIdentifier" type="{http://www.mismo.org/residential/2009/schemas}MISMOIdentifier" minOccurs="0"/>
 *             &lt;element name="ObjectCreatedDatetime" type="{http://www.mismo.org/residential/2009/schemas}MISMODatetime" minOccurs="0"/>
 *             &lt;element name="ObjectDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *             &lt;element name="ObjectEncodingType" type="{http://www.mismo.org/residential/2009/schemas}ObjectEncodingEnum" minOccurs="0"/>
 *             &lt;element name="ObjectEncodingTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *             &lt;element name="OriginalCreatorDigestValue" type="{http://www.mismo.org/residential/2009/schemas}MISMOValue" minOccurs="0"/>
 *             &lt;element name="ObjectName" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *             &lt;element name="UnencodedObjectByteCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *             &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}FOREIGN_OBJECT_EXTENSION" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.mismo.org/residential/2009/schemas}AttributeExtension"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}MISMOresourceLink"/>
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
@XmlType(name = "FOREIGN_OBJECT", propOrder = {
    "reference",
    "embeddedContentXML",
    "objectURL",
    "characterEncodingSetType",
    "characterEncodingSetTypeOtherDescription",
    "mimeTypeIdentifier",
    "mimeTypeVersionIdentifier",
    "objectCreatedDatetime",
    "objectDescription",
    "objectEncodingType",
    "objectEncodingTypeOtherDescription",
    "originalCreatorDigestValue",
    "objectName",
    "unencodedObjectByteCount",
    "extension"
})
public class FOREIGNOBJECT {

    @XmlElement(name = "REFERENCE")
    protected REFERENCE reference;
    @XmlElementRef(name = "EmbeddedContentXML", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOXML> embeddedContentXML;
    @XmlElementRef(name = "ObjectURL", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOObjectURL> objectURL;
    @XmlElementRef(name = "CharacterEncodingSetType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CharacterEncodingSetEnum> characterEncodingSetType;
    @XmlElementRef(name = "CharacterEncodingSetTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> characterEncodingSetTypeOtherDescription;
    @XmlElementRef(name = "MIMETypeIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> mimeTypeIdentifier;
    @XmlElementRef(name = "MIMETypeVersionIdentifier", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIdentifier> mimeTypeVersionIdentifier;
    @XmlElementRef(name = "ObjectCreatedDatetime", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMODatetime> objectCreatedDatetime;
    @XmlElementRef(name = "ObjectDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> objectDescription;
    @XmlElementRef(name = "ObjectEncodingType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ObjectEncodingEnum> objectEncodingType;
    @XmlElementRef(name = "ObjectEncodingTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> objectEncodingTypeOtherDescription;
    @XmlElementRef(name = "OriginalCreatorDigestValue", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOValue> originalCreatorDigestValue;
    @XmlElementRef(name = "ObjectName", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> objectName;
    @XmlElementRef(name = "UnencodedObjectByteCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> unencodedObjectByteCount;
    @XmlElement(name = "EXTENSION")
    protected FOREIGNOBJECTEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the reference property.
     *
     * @return
     *     possible object is
     *     {@link REFERENCE }
     *
     */
    public REFERENCE getREFERENCE() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     *
     * @param value
     *     allowed object is
     *     {@link REFERENCE }
     *
     */
    public void setREFERENCE(REFERENCE value) {
        this.reference = value;
    }

    /**
     * Gets the value of the embeddedContentXML property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOXML }{@code >}
     *
     */
    public JAXBElement<MISMOXML> getEmbeddedContentXML() {
        return embeddedContentXML;
    }

    /**
     * Sets the value of the embeddedContentXML property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOXML }{@code >}
     *
     */
    public void setEmbeddedContentXML(JAXBElement<MISMOXML> value) {
        this.embeddedContentXML = value;
    }

    /**
     * Gets the value of the objectURL property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOObjectURL }{@code >}
     *
     */
    public JAXBElement<MISMOObjectURL> getObjectURL() {
        return objectURL;
    }

    /**
     * Sets the value of the objectURL property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOObjectURL }{@code >}
     *
     */
    public void setObjectURL(JAXBElement<MISMOObjectURL> value) {
        this.objectURL = value;
    }

    /**
     * Gets the value of the characterEncodingSetType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CharacterEncodingSetEnum }{@code >}
     *
     */
    public JAXBElement<CharacterEncodingSetEnum> getCharacterEncodingSetType() {
        return characterEncodingSetType;
    }

    /**
     * Sets the value of the characterEncodingSetType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CharacterEncodingSetEnum }{@code >}
     *
     */
    public void setCharacterEncodingSetType(JAXBElement<CharacterEncodingSetEnum> value) {
        this.characterEncodingSetType = value;
    }

    /**
     * Gets the value of the characterEncodingSetTypeOtherDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getCharacterEncodingSetTypeOtherDescription() {
        return characterEncodingSetTypeOtherDescription;
    }

    /**
     * Sets the value of the characterEncodingSetTypeOtherDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setCharacterEncodingSetTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.characterEncodingSetTypeOtherDescription = value;
    }

    /**
     * Gets the value of the mimeTypeIdentifier property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public JAXBElement<MISMOIdentifier> getMIMETypeIdentifier() {
        return mimeTypeIdentifier;
    }

    /**
     * Sets the value of the mimeTypeIdentifier property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public void setMIMETypeIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.mimeTypeIdentifier = value;
    }

    /**
     * Gets the value of the mimeTypeVersionIdentifier property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public JAXBElement<MISMOIdentifier> getMIMETypeVersionIdentifier() {
        return mimeTypeVersionIdentifier;
    }

    /**
     * Sets the value of the mimeTypeVersionIdentifier property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIdentifier }{@code >}
     *
     */
    public void setMIMETypeVersionIdentifier(JAXBElement<MISMOIdentifier> value) {
        this.mimeTypeVersionIdentifier = value;
    }

    /**
     * Gets the value of the objectCreatedDatetime property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMODatetime }{@code >}
     *
     */
    public JAXBElement<MISMODatetime> getObjectCreatedDatetime() {
        return objectCreatedDatetime;
    }

    /**
     * Sets the value of the objectCreatedDatetime property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMODatetime }{@code >}
     *
     */
    public void setObjectCreatedDatetime(JAXBElement<MISMODatetime> value) {
        this.objectCreatedDatetime = value;
    }

    /**
     * Gets the value of the objectDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getObjectDescription() {
        return objectDescription;
    }

    /**
     * Sets the value of the objectDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setObjectDescription(JAXBElement<MISMOString> value) {
        this.objectDescription = value;
    }

    /**
     * Gets the value of the objectEncodingType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ObjectEncodingEnum }{@code >}
     *
     */
    public JAXBElement<ObjectEncodingEnum> getObjectEncodingType() {
        return objectEncodingType;
    }

    /**
     * Sets the value of the objectEncodingType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ObjectEncodingEnum }{@code >}
     *
     */
    public void setObjectEncodingType(JAXBElement<ObjectEncodingEnum> value) {
        this.objectEncodingType = value;
    }

    /**
     * Gets the value of the objectEncodingTypeOtherDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getObjectEncodingTypeOtherDescription() {
        return objectEncodingTypeOtherDescription;
    }

    /**
     * Sets the value of the objectEncodingTypeOtherDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setObjectEncodingTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.objectEncodingTypeOtherDescription = value;
    }

    /**
     * Gets the value of the originalCreatorDigestValue property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *
     */
    public JAXBElement<MISMOValue> getOriginalCreatorDigestValue() {
        return originalCreatorDigestValue;
    }

    /**
     * Sets the value of the originalCreatorDigestValue property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOValue }{@code >}
     *
     */
    public void setOriginalCreatorDigestValue(JAXBElement<MISMOValue> value) {
        this.originalCreatorDigestValue = value;
    }

    /**
     * Gets the value of the objectName property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getObjectName() {
        return objectName;
    }

    /**
     * Sets the value of the objectName property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setObjectName(JAXBElement<MISMOString> value) {
        this.objectName = value;
    }

    /**
     * Gets the value of the unencodedObjectByteCount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public JAXBElement<MISMOCount> getUnencodedObjectByteCount() {
        return unencodedObjectByteCount;
    }

    /**
     * Sets the value of the unencodedObjectByteCount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public void setUnencodedObjectByteCount(JAXBElement<MISMOCount> value) {
        this.unencodedObjectByteCount = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link FOREIGNOBJECTEXTENSION }
     *
     */
    public FOREIGNOBJECTEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link FOREIGNOBJECTEXTENSION }
     *
     */
    public void setEXTENSION(FOREIGNOBJECTEXTENSION value) {
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
