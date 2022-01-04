package com.java.clean.restfullcontroller;

import java.util.List;

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

import com.java.clean.controller.Controller;
import com.java.clean.controller.dto.BankWebView;

@RestController
@RequestMapping("/bank")
public class RestfullController {

	private Controller controller;
	
	public RestfullController(Controller controller)
	{
		this.controller=controller;
	}
	
	@GetMapping("/getbanks")
	public ResponseEntity<List<BankWebView>> getBanks() {
		List<BankWebView> output = controller.findAllBanks();
		return ResponseEntity.ok(output);
	}
	@GetMapping("/getoneBank")
	public ResponseEntity<BankWebView> getOneBank(@RequestParam(value = "id") Long id) {
		BankWebView output = controller.findById(id);
		return ResponseEntity.ok(output);
	}
	
	@PostMapping(value = "/createBank")
	public ResponseEntity<BankWebView> createBank(@RequestBody BankWebView bank) {
		BankWebView output =controller.createBank(bank);
		return new ResponseEntity<>(output,HttpStatus.OK);
	}

	@PutMapping(value = "/updateBank")
	public ResponseEntity<BankWebView> updateBank(@RequestBody BankWebView bank) {
		BankWebView output =controller.updateBank(bank);
		return new ResponseEntity<>(output,HttpStatus.OK);
	}
	@DeleteMapping(value = "/deleteBank")
	public ResponseEntity<BankWebView> deleteBank(@RequestParam(value = "id") Long id) {
		BankWebView  output =controller.deleteBank(id);
		return new ResponseEntity<>(output,HttpStatus.OK);
	}
}
