package com.lh.pos.bff.repository;

import com.lh.pos.bff.collection.LoanApplication;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoanApplicationRepository extends MongoRepository<LoanApplication, String> {

}
