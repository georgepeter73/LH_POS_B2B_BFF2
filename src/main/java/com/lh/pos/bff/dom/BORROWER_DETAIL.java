package com.lh.pos.bff.dom;

import lombok.Data;

import java.util.Date;
@Data
public class BORROWER_DETAIL {
	public String BorrowerBirthDate;
	public boolean CommunityPropertyStateResidentIndicator;
	public int DependentCount;
	public boolean DomesticRelationshipIndicator;
	public String MaritalStatusType;
}
