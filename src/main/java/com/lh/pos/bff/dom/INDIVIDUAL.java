package com.lh.pos.bff.dom;

import jakarta.annotation.security.DenyAll;
import lombok.Data;

@Data
public class INDIVIDUAL {
	public CONTACT_POINTS CONTACT_POINTS;
	public NAME NAME;
}
