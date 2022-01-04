package com.java.clean.usecase;

import com.java.clean.domain.entity.Bank;
import com.java.clean.usecase.port.BankAdapter;

public class DeleteBank {

  private final BankAdapter bankAdapter;
  
  public DeleteBank(final BankAdapter bankAdapter)
  {
	this.bankAdapter = bankAdapter;
  }

  public Bank deleteBank(final Long id){
	  if(bankAdapter.findById(id)==null)
	  {
		  return bankAdapter.deleteBank(null);
	  }
	  return bankAdapter.deleteBank(id);
  }
}
