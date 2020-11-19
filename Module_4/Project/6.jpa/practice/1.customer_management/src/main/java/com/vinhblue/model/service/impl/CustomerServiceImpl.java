package com.vinhblue.model.service.impl;

import com.vinhblue.model.entity.Customer;
import com.vinhblue.model.repository.CustomerRepository;
import com.vinhblue.model.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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
        if (!customer.getCustomerBirthDay().equals("")) {
            this.customerRepository.save(customer);
        }
    }

    @Override
    public void update(Customer customer) {
        this.customerRepository.save(customer);
    }

    @Override
    public Customer findById(String customerId) {
        return this.customerRepository.findById(customerId).orElse(null);
    }

    @Override
    public void delete(String id) {
        Customer customer = Objects.requireNonNull(this.customerRepository.findById(id).orElse(null));
        this.customerRepository.delete(customer);

    }
}
