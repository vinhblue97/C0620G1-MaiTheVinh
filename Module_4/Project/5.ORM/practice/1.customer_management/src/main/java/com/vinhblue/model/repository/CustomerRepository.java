package com.vinhblue.model.repository;

import com.vinhblue.model.entity.Customer;
import java.util.List;

public interface CustomerRepository {

    List<Customer> findAll();

    Customer findById(String id);

    void save(Customer customer);

    void update(Customer customer);

    void delete(String id);
}
