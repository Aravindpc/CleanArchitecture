package com.java.clean.repository.db;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.java.clean.domain.entity.Bank;
import com.java.clean.repository.db.mapper.BankMapper;
import com.java.clean.repository.db.mapper.BankModelMapper;
import com.java.clean.repository.db.model.BankModel;
import com.java.clean.usecase.port.BankAdapter;


public class BankAdapterImpl implements BankAdapter{
	@Autowired
	private BankRepository bankRepository;
	
	@Override
	public Bank create(Bank bank) {		
		BankModel create=bankRepository.save(BankModelMapper.toEntity(bank));
		return BankMapper.toEntity(create);
	}

	@Override
	public Optional<Bank> findById(Long id) {
		Optional<BankModel> findById=bankRepository.findById(id);
		System.out.println(bankRepository.findById(id).get());
		return BankMapper.toOptionalEntity(findById.get());
	}

	@Override
	public Bank deleteBank(Long id) {
		BankModel deleteById=bankRepository.findById(id).get();
		bankRepository.deleteById(id);
		return BankMapper.toEntity(deleteById);
	}

	@Override
	public List<Bank> findAllBank() {
		List<BankModel> findAll=bankRepository.findAll();
		List<Bank> banks = new ArrayList<Bank>();
		for(BankModel bankmodel:findAll)
		{
			banks.add(BankMapper.toEntity(bankmodel));
		}
		return banks;
	}

	@Override
	public Bank update(Bank bank) {
		BankModel getById=bankRepository.findById(bank.getId()).get();
		getById.setBank_identification_code(bank.getBank_identification_code());
		getById.setBank_name(bank.getBank_name());
		getById.setBank_reg_number(bank.getBank_reg_number());
		getById.setChecker_id(bank.getChecker_id());
		getById.setCountry(bank.getCountry());
		getById.setMaker_id(bank.getMaker_id());
		getById.setModified_by(bank.getModified_by());
		getById.setRegistered_address(bank.getRegistered_address());
		BankModel update=bankRepository.save(getById);
		return BankMapper.toEntity(update);
	}

}
