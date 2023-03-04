package com.lh.pos.bff.dom;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class BORROWER {
	public BORROWER_DETAIL BORROWER_DETAIL;
	public CURRENT_INCOME CURRENT_INCOME;
	public DECLARATION DECLARATION;
	public Object DEPENDENTS;
	public EMPLOYERS EMPLOYERS;
	public GOVERNMENT_MONITORING GOVERNMENT_MONITORING;
	public RESIDENCES RESIDENCES;
	public List<LIABILITY> liabilityList = new ArrayList<>();
}
