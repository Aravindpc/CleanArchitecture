package com.java.clean.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bank {
	public Bank(String bank_reg_number, String bank_identification_code, String bank_name, String country,
			String registered_address, String maker_id,
			String checker_id, String modified_by) {
		super();
		this.bank_reg_number = bank_reg_number;
		this.bank_identification_code = bank_identification_code;
		this.bank_name = bank_name;
		this.country = country;
		this.registered_address = registered_address;
		this.maker_id = maker_id;
		this.checker_id = checker_id;
		this.modified_by = modified_by;
	}
	public static BankBuilder builder()
	{
		return new BankBuilder();
	}
	public static class BankBuilder{
		BankBuilder() {
		}

		private Long id;
		
		private String bank_reg_number;

		private String bank_identification_code;
		
		private String bank_name;
		
		private String country;
		
		private String registered_address;
		
		private String maker_id;
		
		private String checker_id;
		
		private String modified_by;

		public Long getId() {
			return id;
		}

		public BankBuilder id(final Long id) {
			this.id = id;
			return this;
		}


		public BankBuilder bank_reg_number(final String bank_reg_number) {
			this.bank_reg_number = bank_reg_number;
			return this;
		}

		public BankBuilder bank_identification_code(final String bank_identification_code) {
			this.bank_identification_code = bank_identification_code;
			return this;
		}

		public BankBuilder bank_name(final String bank_name) {
			this.bank_name = bank_name;
			return this;
		}

		public BankBuilder country(final String country) {
			this.country = country;
			return this;
		}


		public BankBuilder registered_address(final String registered_address) {
			this.registered_address = registered_address;
			return this;
		}

		public BankBuilder maker_id(final String maker_id) {
			this.maker_id = maker_id;
			return this;
		}

		public BankBuilder checker_id(final String checker_id) {
			this.checker_id = checker_id;
			return this;
		}

		public BankBuilder modified_by(final String modified_by) {
			this.modified_by = modified_by;
			return this;
		}
		
		public Bank build()
		{
			return new Bank(id,bank_reg_number, bank_identification_code,bank_name, country,registered_address,maker_id,checker_id, modified_by);
		}
	}
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
