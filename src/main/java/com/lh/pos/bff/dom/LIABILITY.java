package com.lh.pos.bff.dom;

import lombok.Data;

@Data
public class LIABILITY {
	public LIABILITY_DETAIL LIABILITY_DETAIL;
	public LIABILITY_HOLDER LIABILITY_HOLDER;
	public int SequenceNumber;
	public String label;
	public String text;
}
