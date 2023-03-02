package com.lh.pos.bff.dom;

import lombok.Data;

@Data
public class LIABILITY_DETAIL {
	public double LiabilityAccountIdentifier;
	public boolean LiabilityExclusionIndicator;
	public double LiabilityMonthlyPaymentAmount;
	public boolean LiabilityPayoffStatusIndicator;
	public String LiabilityType;
	public double LiabilityUnpaidBalanceAmount;
}
