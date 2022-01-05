package com.java.clean.controller;

import java.util.ArrayList;
import java.util.List;

import com.java.clean.controller.dto.BankWebView;
import com.java.clean.controller.mapper.BankMapper;
import com.java.clean.domain.entity.Bank;
import com.java.clean.usecase.CreateBank;
import com.java.clean.usecase.UpdateBank;
import com.java.clean.usecase.DeleteBank;
import com.java.clean.usecase.FindBank;


public class Controller {

	private final CreateBank createBank;
	
	private final UpdateBank updateBank;

	private final FindBank findBank;

	private final DeleteBank deleteBank;
	
	public Controller(final UpdateBank updateBank,final FindBank findBank,final DeleteBank deleteBank,final CreateBank createBank)
	{
		this.createBank = createBank;
		this.updateBank = updateBank;
		this.findBank = findBank;
		this.deleteBank = deleteBank;
		
	}
	public List<BankWebView> findAllBanks() {
		List<Bank> output = findBank.findAllBanks();
		List<BankWebView> bankdto=new ArrayList<BankWebView>();
		for(Bank bank:output)
		{
			bankdto.add(BankMapper.toEntity(bank));
		}
		return bankdto;
	}

	public BankWebView findById(Long id) {
		Bank output = findBank.findById(id).get();
		return BankMapper.toEntity(output);
	}
	
	public BankWebView createBank(BankWebView bankWebView) {
		BankWebView output =BankMapper.toEntity(createBank.createBank(BankMapper.toModelEntity(bankWebView)));
		return output;
	}

	public BankWebView updateBank(BankWebView bankWebView) {
		BankWebView output =BankMapper.toEntity(updateBank.updateBank(BankMapper.toModelEntity(bankWebView)));
		return output;
	}
	public BankWebView deleteBank(Long id) {
		Bank  output =deleteBank.deleteBank(id);
		return BankMapper.toEntity(output);
	}
}
