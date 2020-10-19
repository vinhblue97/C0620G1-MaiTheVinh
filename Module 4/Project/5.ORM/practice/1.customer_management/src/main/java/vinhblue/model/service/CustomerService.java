package com.vinhblue.model.service;

import com.vinhblue.model.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(String customerId);

    void delete(String id);
}
