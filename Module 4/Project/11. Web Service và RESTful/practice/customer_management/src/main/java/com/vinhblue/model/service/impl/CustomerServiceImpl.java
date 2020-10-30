package com.vinhblue.model.service.impl;

import com.vinhblue.model.entity.Customer;
import com.vinhblue.model.repository.CustomerRepository;
import com.vinhblue.model.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return this.customerRepository.findAll();
    }

    @Override
    public void save(Customer customer) {
        this.customerRepository.save(customer);
    }

    @Override
    public void delete(Integer id) {
        this.customerRepository.deleteById(id);
    }

    @Override
    public Customer findById(Integer id) {
        return this.customerRepository.findById(id).orElse(null);
    }
}
