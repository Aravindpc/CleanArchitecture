package com.java.clean.controller.dto;

import lombok.Data;

@Data
public class BankWebView {
	
	private Long id;
	private String bank_reg_number;

	private String bank_identification_code;
	
	private String bank_name;
	
	private String country;
	
	private String registered_address;
	
	private String maker_id;
	
	private String checker_id;
	
	private String modified_by;

}
