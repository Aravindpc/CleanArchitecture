package com.java.clean.repository.db;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.java.clean.repository.db.model.BankModel;

@Repository
public interface BankRepository extends  CassandraRepository<BankModel, Long> {

}
