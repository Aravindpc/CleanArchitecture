package com.java.clean.repository.db.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "bank")
public class BankModel  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	
	private String bank_reg_number;

	private String bank_identification_code;
	
	private String bank_name;
	
	private String country;
	
	private String registered_address;
	
	private String maker_id;
	
	private String checker_id;
	
	private String modified_by;

	@Override
	public String toString() {
		return "BankModel [id=" + id + ", bank_reg_number=" + bank_reg_number + ", bank_identification_code="
				+ bank_identification_code + ", bank_name=" + bank_name + ", country=" + country
				+ ", registered_address=" + registered_address + ", maker_id=" + maker_id + ", checker_id=" + checker_id
				+ ", modified_by=" + modified_by + "]";
	}
}
