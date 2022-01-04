package com.java.clean.usecase.port;

import java.util.List;
import java.util.Optional;

import com.java.clean.domain.entity.Bank;

public interface BankAdapter {
	
    Bank create(Bank bank);
    
    Bank update(Bank bank);
    
    Optional<Bank>  findById(Long id);
    
    Bank  deleteBank(Long id);
    
    List<Bank> findAllBank();
}
