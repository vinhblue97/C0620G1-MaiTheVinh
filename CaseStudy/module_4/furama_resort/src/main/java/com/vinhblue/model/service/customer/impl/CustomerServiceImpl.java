package com.vinhblue.model.service.customer.impl;

import com.vinhblue.model.entity.customer.Customer;
import com.vinhblue.model.repository.customer.CustomerRepository;
import com.vinhblue.model.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return this.customerRepository.findAll(pageable);
    }

    @Override
    public Page<Customer> findAllByCustomerNameContaining(Pageable pageable, String name) {
        return this.customerRepository.findAllByCustomerNameContaining(pageable, name);
    }

    @Override
    public void save(Customer customer) {
        this.customerRepository.save(customer);
    }

    @Override
    public void delete(Customer customer) {
        this.customerRepository.delete(customer);
    }

    @Override
    public Customer findById(String id) {
        return this.customerRepository.findById(id).orElse(null);
    }

    @Override
    public List<Customer> findAll() {
        return this.customerRepository.findAll();
    }
}
