package com.lh.pos.bff.dom;

import lombok.Data;

@Data
public class PARTY {
	public INDIVIDUAL INDIVIDUAL;
	public ROLES ROLES;
	public TAXPAYER_IDENTIFIERS TAXPAYER_IDENTIFIERS;
	public int SequenceNumber;
	public String text;
	public LEGAL_ENTITY LEGAL_ENTITY;
	public ADDRESSES ADDRESSES;
}
