package com.lh.pos.bff.dom;

import lombok.Data;

@Data
public class ADDRESS {
	public String AddressLineText;
	public String CityName;
	public String CountyName;
	public int PostalCode;
	public String StateCode;
	public String CountryCode;
}
