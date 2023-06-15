package com.ivoyant.learncosmosdb.repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.ivoyant.learncosmosdb.model.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CosmosRepository<Customer, String> {
}
