package com.lh.pos.bff.dom;

import lombok.Data;

import java.util.Date;
@Data
public class EMPLOYMENT {
	public boolean EmploymentBorrowerSelfEmployedIndicator;
	public String EmploymentClassificationType;
	public String EmploymentPositionDescription;
	public String EmploymentStartDate;
	public String EmploymentStatusType;
	public int EmploymentTimeInLineOfWorkMonthsCount;
	public boolean SpecialBorrowerEmployerRelationshipIndicator;
	public EXTENSION EXTENSION;
}
