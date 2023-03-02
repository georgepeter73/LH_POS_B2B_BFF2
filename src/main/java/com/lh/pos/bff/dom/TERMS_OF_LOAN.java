package com.lh.pos.bff.dom;

import lombok.Data;

import java.util.Date;
@Data
public class TERMS_OF_LOAN {
	public double BaseLoanAmount;
	public String LienPriorityType;
	public String LoanPurposeType;
	public String MortgageType;
	public double NoteAmount;
	public Date NoteRatePercent;
}
