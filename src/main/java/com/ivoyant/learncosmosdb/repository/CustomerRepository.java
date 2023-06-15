package com.ivoyant.learncosmosdb.repository;

import com.ivoyant.learncosmosdb.model.Customer;
import com.microsoft.azure.spring.data.cosmosdb.repository.DocumentDbRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends DocumentDbRepository<Customer, String> {
}
