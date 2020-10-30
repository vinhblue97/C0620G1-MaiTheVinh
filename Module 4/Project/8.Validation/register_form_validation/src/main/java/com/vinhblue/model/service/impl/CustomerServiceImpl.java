package com.vinhblue.model.service.impl;

import com.vinhblue.model.entity.Customer;
import com.vinhblue.model.repository.CustomerRepository;
import com.vinhblue.model.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public void save(Customer customer) {
        this.customerRepository.save(customer);
    }
}
