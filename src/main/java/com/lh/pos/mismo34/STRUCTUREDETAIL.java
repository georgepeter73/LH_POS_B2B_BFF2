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
 * <p>Java class for STRUCTURE_DETAIL complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="STRUCTURE_DETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccessoryUnitCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="AdditionsDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="AgeYearsCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="AtticExistsIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="BuildingCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="CharacteristicsAffectMarketabilityDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="ElevatorCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="GrossBuildingAreaSquareFeetNumber" type="{http://www.mismo.org/residential/2009/schemas}MISMONumeric" minOccurs="0"/>
 *         &lt;element name="GrossLivingAreaSquareFeetDataSourceDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="LivingUnitCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="RentControlDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="RentControlStatusType" type="{http://www.mismo.org/residential/2009/schemas}RentControlStatusEnum" minOccurs="0"/>
 *         &lt;element name="StoriesCount" type="{http://www.mismo.org/residential/2009/schemas}MISMOCount" minOccurs="0"/>
 *         &lt;element name="StructureConditionDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="StructureConstructionStatusDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="StructureNeverOccupiedIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="StructureSingleFamilyResidenceIndicator" type="{http://www.mismo.org/residential/2009/schemas}MISMOIndicator" minOccurs="0"/>
 *         &lt;element name="StructureStateDescription" type="{http://www.mismo.org/residential/2009/schemas}MISMOString" minOccurs="0"/>
 *         &lt;element name="StructureStateType" type="{http://www.mismo.org/residential/2009/schemas}StructureStateEnum" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{http://www.mismo.org/residential/2009/schemas}STRUCTURE_DETAIL_EXTENSION" minOccurs="0"/>
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
@XmlType(name = "STRUCTURE_DETAIL", propOrder = {
    "accessoryUnitCount",
    "additionsDescription",
    "ageYearsCount",
    "atticExistsIndicator",
    "buildingCount",
    "characteristicsAffectMarketabilityDescription",
    "elevatorCount",
    "grossBuildingAreaSquareFeetNumber",
    "grossLivingAreaSquareFeetDataSourceDescription",
    "livingUnitCount",
    "rentControlDescription",
    "rentControlStatusType",
    "storiesCount",
    "structureConditionDescription",
    "structureConstructionStatusDescription",
    "structureNeverOccupiedIndicator",
    "structureSingleFamilyResidenceIndicator",
    "structureStateDescription",
    "structureStateType",
    "extension"
})
public class STRUCTUREDETAIL {

    @XmlElementRef(name = "AccessoryUnitCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> accessoryUnitCount;
    @XmlElementRef(name = "AdditionsDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> additionsDescription;
    @XmlElementRef(name = "AgeYearsCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> ageYearsCount;
    @XmlElementRef(name = "AtticExistsIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> atticExistsIndicator;
    @XmlElementRef(name = "BuildingCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> buildingCount;
    @XmlElementRef(name = "CharacteristicsAffectMarketabilityDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> characteristicsAffectMarketabilityDescription;
    @XmlElementRef(name = "ElevatorCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> elevatorCount;
    @XmlElementRef(name = "GrossBuildingAreaSquareFeetNumber", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMONumeric> grossBuildingAreaSquareFeetNumber;
    @XmlElementRef(name = "GrossLivingAreaSquareFeetDataSourceDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> grossLivingAreaSquareFeetDataSourceDescription;
    @XmlElementRef(name = "LivingUnitCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> livingUnitCount;
    @XmlElementRef(name = "RentControlDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> rentControlDescription;
    @XmlElementRef(name = "RentControlStatusType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<RentControlStatusEnum> rentControlStatusType;
    @XmlElementRef(name = "StoriesCount", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOCount> storiesCount;
    @XmlElementRef(name = "StructureConditionDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> structureConditionDescription;
    @XmlElementRef(name = "StructureConstructionStatusDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> structureConstructionStatusDescription;
    @XmlElementRef(name = "StructureNeverOccupiedIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> structureNeverOccupiedIndicator;
    @XmlElementRef(name = "StructureSingleFamilyResidenceIndicator", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOIndicator> structureSingleFamilyResidenceIndicator;
    @XmlElementRef(name = "StructureStateDescription", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<MISMOString> structureStateDescription;
    @XmlElementRef(name = "StructureStateType", namespace = "http://www.mismo.org/residential/2009/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<StructureStateEnum> structureStateType;
    @XmlElement(name = "EXTENSION")
    protected STRUCTUREDETAILEXTENSION extension;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the accessoryUnitCount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public JAXBElement<MISMOCount> getAccessoryUnitCount() {
        return accessoryUnitCount;
    }

    /**
     * Sets the value of the accessoryUnitCount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public void setAccessoryUnitCount(JAXBElement<MISMOCount> value) {
        this.accessoryUnitCount = value;
    }

    /**
     * Gets the value of the additionsDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getAdditionsDescription() {
        return additionsDescription;
    }

    /**
     * Sets the value of the additionsDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setAdditionsDescription(JAXBElement<MISMOString> value) {
        this.additionsDescription = value;
    }

    /**
     * Gets the value of the ageYearsCount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public JAXBElement<MISMOCount> getAgeYearsCount() {
        return ageYearsCount;
    }

    /**
     * Sets the value of the ageYearsCount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public void setAgeYearsCount(JAXBElement<MISMOCount> value) {
        this.ageYearsCount = value;
    }

    /**
     * Gets the value of the atticExistsIndicator property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public JAXBElement<MISMOIndicator> getAtticExistsIndicator() {
        return atticExistsIndicator;
    }

    /**
     * Sets the value of the atticExistsIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public void setAtticExistsIndicator(JAXBElement<MISMOIndicator> value) {
        this.atticExistsIndicator = value;
    }

    /**
     * Gets the value of the buildingCount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public JAXBElement<MISMOCount> getBuildingCount() {
        return buildingCount;
    }

    /**
     * Sets the value of the buildingCount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public void setBuildingCount(JAXBElement<MISMOCount> value) {
        this.buildingCount = value;
    }

    /**
     * Gets the value of the characteristicsAffectMarketabilityDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getCharacteristicsAffectMarketabilityDescription() {
        return characteristicsAffectMarketabilityDescription;
    }

    /**
     * Sets the value of the characteristicsAffectMarketabilityDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setCharacteristicsAffectMarketabilityDescription(JAXBElement<MISMOString> value) {
        this.characteristicsAffectMarketabilityDescription = value;
    }

    /**
     * Gets the value of the elevatorCount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public JAXBElement<MISMOCount> getElevatorCount() {
        return elevatorCount;
    }

    /**
     * Sets the value of the elevatorCount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public void setElevatorCount(JAXBElement<MISMOCount> value) {
        this.elevatorCount = value;
    }

    /**
     * Gets the value of the grossBuildingAreaSquareFeetNumber property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMONumeric }{@code >}
     *
     */
    public JAXBElement<MISMONumeric> getGrossBuildingAreaSquareFeetNumber() {
        return grossBuildingAreaSquareFeetNumber;
    }

    /**
     * Sets the value of the grossBuildingAreaSquareFeetNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMONumeric }{@code >}
     *
     */
    public void setGrossBuildingAreaSquareFeetNumber(JAXBElement<MISMONumeric> value) {
        this.grossBuildingAreaSquareFeetNumber = value;
    }

    /**
     * Gets the value of the grossLivingAreaSquareFeetDataSourceDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getGrossLivingAreaSquareFeetDataSourceDescription() {
        return grossLivingAreaSquareFeetDataSourceDescription;
    }

    /**
     * Sets the value of the grossLivingAreaSquareFeetDataSourceDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setGrossLivingAreaSquareFeetDataSourceDescription(JAXBElement<MISMOString> value) {
        this.grossLivingAreaSquareFeetDataSourceDescription = value;
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
     * Gets the value of the rentControlDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getRentControlDescription() {
        return rentControlDescription;
    }

    /**
     * Sets the value of the rentControlDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setRentControlDescription(JAXBElement<MISMOString> value) {
        this.rentControlDescription = value;
    }

    /**
     * Gets the value of the rentControlStatusType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RentControlStatusEnum }{@code >}
     *
     */
    public JAXBElement<RentControlStatusEnum> getRentControlStatusType() {
        return rentControlStatusType;
    }

    /**
     * Sets the value of the rentControlStatusType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RentControlStatusEnum }{@code >}
     *
     */
    public void setRentControlStatusType(JAXBElement<RentControlStatusEnum> value) {
        this.rentControlStatusType = value;
    }

    /**
     * Gets the value of the storiesCount property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public JAXBElement<MISMOCount> getStoriesCount() {
        return storiesCount;
    }

    /**
     * Sets the value of the storiesCount property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOCount }{@code >}
     *
     */
    public void setStoriesCount(JAXBElement<MISMOCount> value) {
        this.storiesCount = value;
    }

    /**
     * Gets the value of the structureConditionDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getStructureConditionDescription() {
        return structureConditionDescription;
    }

    /**
     * Sets the value of the structureConditionDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setStructureConditionDescription(JAXBElement<MISMOString> value) {
        this.structureConditionDescription = value;
    }

    /**
     * Gets the value of the structureConstructionStatusDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getStructureConstructionStatusDescription() {
        return structureConstructionStatusDescription;
    }

    /**
     * Sets the value of the structureConstructionStatusDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setStructureConstructionStatusDescription(JAXBElement<MISMOString> value) {
        this.structureConstructionStatusDescription = value;
    }

    /**
     * Gets the value of the structureNeverOccupiedIndicator property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public JAXBElement<MISMOIndicator> getStructureNeverOccupiedIndicator() {
        return structureNeverOccupiedIndicator;
    }

    /**
     * Sets the value of the structureNeverOccupiedIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public void setStructureNeverOccupiedIndicator(JAXBElement<MISMOIndicator> value) {
        this.structureNeverOccupiedIndicator = value;
    }

    /**
     * Gets the value of the structureSingleFamilyResidenceIndicator property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public JAXBElement<MISMOIndicator> getStructureSingleFamilyResidenceIndicator() {
        return structureSingleFamilyResidenceIndicator;
    }

    /**
     * Sets the value of the structureSingleFamilyResidenceIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOIndicator }{@code >}
     *
     */
    public void setStructureSingleFamilyResidenceIndicator(JAXBElement<MISMOIndicator> value) {
        this.structureSingleFamilyResidenceIndicator = value;
    }

    /**
     * Gets the value of the structureStateDescription property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public JAXBElement<MISMOString> getStructureStateDescription() {
        return structureStateDescription;
    }

    /**
     * Sets the value of the structureStateDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MISMOString }{@code >}
     *
     */
    public void setStructureStateDescription(JAXBElement<MISMOString> value) {
        this.structureStateDescription = value;
    }

    /**
     * Gets the value of the structureStateType property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StructureStateEnum }{@code >}
     *
     */
    public JAXBElement<StructureStateEnum> getStructureStateType() {
        return structureStateType;
    }

    /**
     * Sets the value of the structureStateType property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StructureStateEnum }{@code >}
     *
     */
    public void setStructureStateType(JAXBElement<StructureStateEnum> value) {
        this.structureStateType = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link STRUCTUREDETAILEXTENSION }
     *
     */
    public STRUCTUREDETAILEXTENSION getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link STRUCTUREDETAILEXTENSION }
     *
     */
    public void setEXTENSION(STRUCTUREDETAILEXTENSION value) {
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
