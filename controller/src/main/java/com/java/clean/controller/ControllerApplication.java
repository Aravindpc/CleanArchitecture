package com.java.clean.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.java.clean.controller.dto.BankDto;
import com.java.clean.controller.mapper.BankMapper;
import com.java.clean.domain.entity.Bank;
import com.java.clean.usecase.CreateBank;
import com.java.clean.usecase.UpdateBank;
import com.java.clean.usecase.DeleteBank;
import com.java.clean.usecase.FindBank;

@RestController
@RequestMapping("/bank")
public class ControllerApplication {

	@Autowired
	private CreateBank createBank;
	@Autowired
	private UpdateBank updateBank;
	@Autowired
	private FindBank findBank;
	
	@Autowired
	private DeleteBank deleteBank;
	
	@GetMapping("/getbanks")
	public ResponseEntity<List<BankDto>> getBanks() {
		List<Bank> output = findBank.findAllBanks();
		List<BankDto> bankdto=new ArrayList<BankDto>();
		for(Bank bank:output)
		{
			bankdto.add(BankMapper.toEntity(bank));
		}
		return ResponseEntity.ok(bankdto);
	}
	@GetMapping("/getoneBank")
	public ResponseEntity<BankDto> getOneBank(@RequestParam(value = "id") Long id) {
		Bank output = findBank.findById(id).get();
		return ResponseEntity.ok(BankMapper.toEntity(output));
	}
	
	@PostMapping(value = "/createBank")
	public ResponseEntity<BankDto> createBank(@RequestBody Bank bank) {
		Bank output =createBank.createBank(bank);
		return new ResponseEntity<>(BankMapper.toEntity(output),HttpStatus.OK);
	}

	@PutMapping(value = "/updateBank")
	public ResponseEntity<BankDto> updateBank(@RequestBody Bank bank) {
		Bank output =updateBank.updateBank(bank);
		return new ResponseEntity<>(BankMapper.toEntity(output),HttpStatus.OK);
	}
	@DeleteMapping(value = "/deleteBank")
	public ResponseEntity<BankDto> deleteBank(@RequestParam(value = "id") Long id) {
		Bank  output =deleteBank.deleteBank(id);
		return new ResponseEntity<>(BankMapper.toEntity(output),HttpStatus.OK);
	}
}
