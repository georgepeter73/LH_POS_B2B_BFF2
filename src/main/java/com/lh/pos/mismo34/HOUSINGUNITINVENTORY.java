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
 * Information regarding the type, quantity, occupancy, ownership and other facts about the inventory of housing as it relates to a real estate development project.
 *
 * <p>Java class for HOUSING_UNIT_INVENTORY complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="HOUSING_UNIT_INVENTORY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConstructionStatusType" type="{http://www.mismo.org/residential/2009/schemas}ConstructionStatusEnum" minOccurs="0"/>
 *         &lt;element name="ConstructionStatusTypeOtherDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="DevelopmentStageDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="DevelopmentStageTotalPhasesCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="LivingUnitCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="LivingUnitPercent" type="{http://www.mismo.org/residential/2009/schemas}MISMOPercent" minOccurs="0"/>
 *         &lt;element name="ProjectConstructionStatusDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ProjectType" type="{http://www.mismo.org/residential/2009/schemas}ProjectEnum" minOccurs="0"/>
 *         &lt;element name="ProjectUnitDensityPerAcreNumber" type="{http://www.mismo.org/residential/2009/schemas}MISMONumeric" minOccurs="0"/>
 *         &lt;element name="UnitOccupancyType" type="{http://www.mismo.org/residential/2009/schemas}UnitOccupancyEnum" minOccurs="0"/>
 *         &lt;element name="UnitOwnedByType" type="{http://www.mismo.org/residential/2009/schemas}UnitOwnedByEnum" minOccurs="0"/>
 *         &lt;element name="UnitRentRateType" type="{http://www.mismo.org/residential/2009/schemas}UnitRentRateEnum" minOccurs="0"/>
 *         &lt;element name="UnitSaleRentalStatusType" type="{http://www.mismo.org/residential/2009/schemas}UnitSaleRentalStatusEnum" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}HOUSING_UNIT_INVENTORY_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "HOUSING_UNIT_INVENTORY", propOrder = {
    "constructionStatusType",
    "constructionStatusTypeOtherDescription",
    "developmentStageDescription",
    "developmentStageTotalPhasesCount",
    "livingUnitCount",
    "livingUnitPercent",
    "projectConstructionStatusDescription",
    "projectType",
    "projectUnitDensityPerAcreNumber",
    "unitOccupancyType",
    "unitOwnedByType",
    "unitRentRateType",
    "unitSaleRentalStatusType",
    "extension"
})
public class HOUSINGUNITINVENTORY {

    @XmlElementRef(name = "ConstructionStatusType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ConstructionStatusEnum> constructionStatusType;
    @XmlElementRef(name = "ConstructionStatusTypeOtherDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> constructionStatusTypeOtherDescription;
    @XmlElementRef(name = "DevelopmentStageDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> developmentStageDescription;
    @XmlElementRef(name = "DevelopmentStageTotalPhasesCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> developmentStageTotalPhasesCount;
    @XmlElementRef(name = "LivingUnitCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> livingUnitCount;
    @XmlElementRef(name = "LivingUnitPercent", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOPercent> livingUnitPercent;
    @XmlElementRef(name = "ProjectConstructionStatusDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> projectConstructionStatusDescription;
    @XmlElementRef(name = "ProjectType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<ProjectEnum> projectType;
    @XmlElementRef(name = "ProjectUnitDensityPerAcreNumber", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMONumeric> projectUnitDensityPerAcreNumber;
    @XmlElementRef(name = "UnitOccupancyType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<UnitOccupancyEnum> unitOccupancyType;
    @XmlElementRef(name = "UnitOwnedByType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<UnitOwnedByEnum> unitOwnedByType;
    @XmlElementRef(name = "UnitRentRateType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<UnitRentRateEnum> unitRentRateType;
    @XmlElementRef(name = "UnitSaleRentalStatusType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<UnitSaleRentalStatusEnum> unitSaleRentalStatusType;
    @XmlElement(name = "EXTENSION")
    protected HOUSINGUNITINVENTORYEXTENSION extension;
    @XmlAttribute(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the constructionStatusType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConstructionStatusEnum }{@code >}
     *
     */
    public JAXBElement<ConstructionStatusEnum> getConstructionStatusType() {
        return constructionStatusType;
    }

    /**
     * Sets the value of the constructionStatusType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConstructionStatusEnum }{@code >}
     *
     */
    public void setConstructionStatusType(JAXBElement<ConstructionStatusEnum> value) {
        this.constructionStatusType = value;
    }

    /**
     * Gets the value of the constructionStatusTypeOtherDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getConstructionStatusTypeOtherDescription() {
        return constructionStatusTypeOtherDescription;
    }

    /**
     * Sets the value of the constructionStatusTypeOtherDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setConstructionStatusTypeOtherDescription(JAXBElement<MISMOString> value) {
        this.constructionStatusTypeOtherDescription = value;
    }

    /**
     * Gets the value of the developmentStageDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getDevelopmentStageDescription() {
        return developmentStageDescription;
    }

    /**
     * Sets the value of the developmentStageDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setDevelopmentStageDescription(JAXBElement<MISMOString> value) {
        this.developmentStageDescription = value;
    }

    /**
     * Gets the value of the developmentStageTotalPhasesCount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public JAXBElement<MISMOCount> getDevelopmentStageTotalPhasesCount() {
        return developmentStageTotalPhasesCount;
    }

    /**
     * Sets the value of the developmentStageTotalPhasesCount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public void setDevelopmentStageTotalPhasesCount(JAXBElement<MISMOCount> value) {
        this.developmentStageTotalPhasesCount = value;
    }

    /**
     * Gets the value of the livingUnitCount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public JAXBElement<MISMOCount> getLivingUnitCount() {
        return livingUnitCount;
    }

    /**
     * Sets the value of the livingUnitCount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public void setLivingUnitCount(JAXBElement<MISMOCount> value) {
        this.livingUnitCount = value;
    }

    /**
     * Gets the value of the livingUnitPercent property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *
     */
    public JAXBElement<MISMOPercent> getLivingUnitPercent() {
        return livingUnitPercent;
    }

    /**
     * Sets the value of the livingUnitPercent property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOPercent }{@code >}
     *
     */
    public void setLivingUnitPercent(JAXBElement<MISMOPercent> value) {
        this.livingUnitPercent = value;
    }

    /**
     * Gets the value of the projectConstructionStatusDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getProjectConstructionStatusDescription() {
        return projectConstructionStatusDescription;
    }

    /**
     * Sets the value of the projectConstructionStatusDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setProjectConstructionStatusDescription(JAXBElement<MISMOString> value) {
        this.projectConstructionStatusDescription = value;
    }

    /**
     * Gets the value of the projectType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProjectEnum }{@code >}
     *
     */
    public JAXBElement<ProjectEnum> getProjectType() {
        return projectType;
    }

    /**
     * Sets the value of the projectType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProjectEnum }{@code >}
     *
     */
    public void setProjectType(JAXBElement<ProjectEnum> value) {
        this.projectType = value;
    }

    /**
     * Gets the value of the projectUnitDensityPerAcreNumber property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMONumeric }{@code >}
     *
     */
    public JAXBElement<MISMONumeric> getProjectUnitDensityPerAcreNumber() {
        return projectUnitDensityPerAcreNumber;
    }

    /**
     * Sets the value of the projectUnitDensityPerAcreNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMONumeric }{@code >}
     *
     */
    public void setProjectUnitDensityPerAcreNumber(JAXBElement<MISMONumeric> value) {
        this.projectUnitDensityPerAcreNumber = value;
    }

    /**
     * Gets the value of the unitOccupancyType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnitOccupancyEnum }{@code >}
     *
     */
    public JAXBElement<UnitOccupancyEnum> getUnitOccupancyType() {
        return unitOccupancyType;
    }

    /**
     * Sets the value of the unitOccupancyType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnitOccupancyEnum }{@code >}
     *
     */
    public void setUnitOccupancyType(JAXBElement<UnitOccupancyEnum> value) {
        this.unitOccupancyType = value;
    }

    /**
     * Gets the value of the unitOwnedByType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnitOwnedByEnum }{@code >}
     *
     */
    public JAXBElement<UnitOwnedByEnum> getUnitOwnedByType() {
        return unitOwnedByType;
    }

    /**
     * Sets the value of the unitOwnedByType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnitOwnedByEnum }{@code >}
     *
     */
    public void setUnitOwnedByType(JAXBElement<UnitOwnedByEnum> value) {
        this.unitOwnedByType = value;
    }

    /**
     * Gets the value of the unitRentRateType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnitRentRateEnum }{@code >}
     *
     */
    public JAXBElement<UnitRentRateEnum> getUnitRentRateType() {
        return unitRentRateType;
    }

    /**
     * Sets the value of the unitRentRateType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnitRentRateEnum }{@code >}
     *
     */
    public void setUnitRentRateType(JAXBElement<UnitRentRateEnum> value) {
        this.unitRentRateType = value;
    }

    /**
     * Gets the value of the unitSaleRentalStatusType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnitSaleRentalStatusEnum }{@code >}
     *
     */
    public JAXBElement<UnitSaleRentalStatusEnum> getUnitSaleRentalStatusType() {
        return unitSaleRentalStatusType;
    }

    /**
     * Sets the value of the unitSaleRentalStatusType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnitSaleRentalStatusEnum }{@code >}
     *
     */
    public void setUnitSaleRentalStatusType(JAXBElement<UnitSaleRentalStatusEnum> value) {
        this.unitSaleRentalStatusType = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link HOUSINGUNITINVENTORYEXTENSION }
     *
     */
    public HOUSINGUNITINVENTORYEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link HOUSINGUNITINVENTORYEXTENSION }
     *
     */
    public void setEXTENSION(HOUSINGUNITINVENTORYEXTENSION value) {
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
