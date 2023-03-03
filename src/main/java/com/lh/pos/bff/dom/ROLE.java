package com.lh.pos.bff.dom;

import lombok.Data;

@Data
public class ROLE {
	public BORROWER BORROWER;
	public ROLE_DETAIL ROLE_DETAIL;
	public int SequenceNumber;
	public String label;
	public String text;
	public PROPERTY_OWNER PROPERTY_OWNER;
	public LICENSES LICENSES;
}
