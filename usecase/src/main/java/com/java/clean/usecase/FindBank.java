package com.java.clean.usecase;

import java.util.List;
import java.util.Optional;

import com.java.clean.domain.entity.Bank;
import com.java.clean.usecase.port.BankAdapter;

public class FindBank {
  private final BankAdapter bankAdapter;
  
  public FindBank(final BankAdapter bankAdapter)
  {
	this.bankAdapter = bankAdapter;
  }
  
  public Optional<Bank> findById(final Long id)
  {
	  return bankAdapter.findById(id);
  }
  
  public List<Bank> findAllBanks(){
	  return bankAdapter.findAllBank();
  }
}
