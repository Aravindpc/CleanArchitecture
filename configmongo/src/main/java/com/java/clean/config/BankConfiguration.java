package com.java.clean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.java.clean.controller.Controller;
import com.java.clean.repository.db.BankAdapterImpl;
import com.java.clean.usecase.CreateBank;
import com.java.clean.usecase.DeleteBank;
import com.java.clean.usecase.FindBank;
import com.java.clean.usecase.UpdateBank;
import com.java.clean.usecase.port.BankAdapter;

@Configuration
public class BankConfiguration {

	@Bean
	public CreateBank createBank(BankAdapter bankAdapter)
	{
		return new CreateBank(bankAdapter);
	}
	@Bean
	public UpdateBank updateBank(BankAdapter bankAdapter)
	{
		return new UpdateBank(bankAdapter);
	}
	@Bean
	public FindBank findBank(BankAdapter bankAdapter)
	{
		return new FindBank(bankAdapter);
	}
	@Bean
	public Controller controller(BankAdapter bankAdapter)
	{
		return new Controller(updateBank(bankAdapter()),findBank(bankAdapter()),deleteBank(bankAdapter()),createBank(bankAdapter()));
	}
	
	@Bean
	public DeleteBank deleteBank(BankAdapter bankAdapter)
	{
		return new DeleteBank(bankAdapter);
	}
	
	@Bean
	public BankAdapter bankAdapter()
	{
		return new BankAdapterImpl();
	}
	
}
