package com.lh.pos.bff.dom;

import lombok.Data;

@Data
public class EMPLOYER {
	public LEGAL_ENTITY LEGAL_ENTITY;
	public ADDRESS ADDRESS;
	public EMPLOYMENT EMPLOYMENT;
	public int SequenceNumber;
	public String label;
	public String text;
}
