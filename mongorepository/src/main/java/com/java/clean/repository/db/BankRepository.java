package com.java.clean.repository.db;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.java.clean.repository.db.model.BankModel;

@Repository
public interface BankRepository extends MongoRepository<BankModel, Long> {

}
