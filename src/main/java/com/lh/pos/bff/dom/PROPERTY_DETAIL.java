package com.lh.pos.bff.dom;

import lombok.Data;

@Data
public class PROPERTY_DETAIL {
	public String AttachmentType;
	public boolean CommunityPropertyStateIndicator;
	public String ConstructionMethodType;
	public int FinancedUnitCount;
	public String PropertyEstateType;
	public double PropertyEstimatedValueAmount;
	public boolean PropertyExistingCleanEnergyLienIndicator;
	public boolean PropertyInProjectIndicator;
	public boolean PropertyMixedUsageIndicator;
	public String PropertyUsageType;
	public boolean PUDIndicator;
}
