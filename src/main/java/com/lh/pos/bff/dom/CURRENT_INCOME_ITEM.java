package com.lh.pos.bff.dom;

import lombok.Data;

@Data
public class CURRENT_INCOME_ITEM {
	public CURRENT_INCOME_ITEM_DETAIL CURRENT_INCOME_ITEM_DETAIL;
	public int SequenceNumber;
	public String label;
	public String text;
}
