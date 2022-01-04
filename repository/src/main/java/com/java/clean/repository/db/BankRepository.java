package com.java.clean.repository.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.clean.repository.db.model.BankModel;

@Repository
public interface BankRepository extends JpaRepository<BankModel, Long> {

}
