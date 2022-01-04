package com.java.clean.repository.db.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data
@Entity
@Table(name="banks")
public class BankModel  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="bank_id")
	private Long id;
	
	@Column(name="bank_reg_number")
	private String bank_reg_number;

	@Column(name="bank_identification_code")
	private String bank_identification_code;
	
	@Column(name="bank_name")
	private String bank_name;
	
	@Column(name="country")
	private String country;
	
	@Column(name="registered_address")
	private String registered_address;
	
	@Column(name="maker_id")
	private String maker_id;
	
	@Column(name="checker_id")
	private String checker_id;
	
	@Column(name="modified_by")
	private String modified_by;

	@Override
	public String toString() {
		return "BankModel [id=" + id + ", bank_reg_number=" + bank_reg_number + ", bank_identification_code="
				+ bank_identification_code + ", bank_name=" + bank_name + ", country=" + country
				+ ", registered_address=" + registered_address + ", maker_id=" + maker_id + ", checker_id=" + checker_id
				+ ", modified_by=" + modified_by + "]";
	}
}
