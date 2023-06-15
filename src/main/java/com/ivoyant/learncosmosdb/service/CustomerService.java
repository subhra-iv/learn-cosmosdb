package com.ivoyant.learncosmosdb.service;

import com.ivoyant.learncosmosdb.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Customer createCustomer(Customer customer);

    Optional<Customer> getCustomerById(String id);

    List<Customer> getAllCustomers();

    Customer updateCustomer(Customer customer);

    void deleteCustomer(String id);
}
