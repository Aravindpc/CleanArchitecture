package com.java.clean.usecase;

import com.java.clean.domain.entity.Bank;
import com.java.clean.usecase.port.BankAdapter;

public class CreateBank {
  private final BankAdapter bankAdapter;
  
  public CreateBank(final BankAdapter bankAdapter)
  {
	this.bankAdapter = bankAdapter;
  }

  public Bank createBank(final Bank bank){
	  var bankToSave= Bank.builder()
			  .id(bank.getId())
			  .bank_identification_code(bank.getBank_identification_code())
			  .bank_name(bank.getBank_name())
			  .bank_reg_number(bank.getBank_reg_number())
			  .checker_id(bank.getChecker_id())
			  .country(bank.getCountry())
			  .maker_id(bank.getMaker_id())
			  .modified_by(bank.getModified_by())
			  .registered_address(bank.getRegistered_address())
			  .build();
	  return bankAdapter.create(bankToSave);
  }
}
