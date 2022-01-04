package com.java.clean.repository.db.mapper;

import java.util.Optional;

import com.java.clean.domain.entity.Bank;
import com.java.clean.repository.db.model.BankModel;

public class BankMapper {
 public static Optional<Bank> toOptionalEntity(BankModel model)
 {
	 if(model==null)
	 {
		 return null;
	 }
	 Bank bank=new Bank();
	 bank.setBank_identification_code(model.getBank_identification_code());
	 bank.setBank_name(model.getBank_name());
	 bank.setBank_reg_number(model.getBank_reg_number());
	 bank.setChecker_id(model.getChecker_id());
	 bank.setCountry(model.getCountry());
	 bank.setId(model.getId());
	 bank.setMaker_id(model.getMaker_id());
	 bank.setModified_by(model.getModified_by());
	 bank.setRegistered_address(model.getRegistered_address());
	 return Optional.of(bank);
 }
 public static Bank toEntity(BankModel model)
 {
	 if(model==null)
	 {
		 return null;
	 }
	 Bank bank=new Bank();
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
