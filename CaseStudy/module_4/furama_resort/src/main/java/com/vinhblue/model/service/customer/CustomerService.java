package com.vinhblue.model.service;

import com.vinhblue.model.entity.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);

    Page<Customer> findAllByCustomerNameContaining(Pageable pageable, String name);

    void save(Customer customer);

    void delete(String id);

    Customer findById(String id);
}
