package com.java.clean.controller.mapper;

import com.java.clean.controller.dto.BankDto;
import com.java.clean.domain.entity.Bank;

public class BankMapper {
 public static BankDto toEntity(Bank model)
 {
	 if(model==null)
	 {
		 return null;
	 }
	 BankDto bank=new BankDto();
	 bank.setBank_identification_code(model.getBank_identification_code());
	 bank.setBank_name(model.getBank_name());
	 bank.setBank_reg_number(model.getBank_reg_number());
	 bank.setChecker_id(model.getChecker_id());
	 bank.setCountry(model.getCountry());
	 bank.setId(model.getId());
	 bank.setMaker_id(model.getMaker_id());
	 bank.setModified_by(model.getModified_by());
	 bank.setRegistered_address(model.getRegistered_address());
	 return bank;
 }
}
