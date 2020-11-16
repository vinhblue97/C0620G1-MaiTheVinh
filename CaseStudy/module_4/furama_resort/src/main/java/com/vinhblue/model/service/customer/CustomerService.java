package com.vinhblue.model.service.customer;

import com.vinhblue.model.entity.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);

    Page<Customer> findAllByCustomerNameContaining(Pageable pageable, String name);

    void save(Customer customer);

    void delete(Customer customer);

    Customer findById(String id);

    List<Customer> findAll();
}
