package com.vinhblue.model.service.impl;

import com.vinhblue.model.entity.customer.TypeCustomer;
import com.vinhblue.model.repository.TypeCustomerRepository;
import com.vinhblue.model.service.TypeCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeCustomerServiceImpl implements TypeCustomerService {
    @Autowired
    private TypeCustomerRepository typeCustomerRepository;

    @Override
    public List<TypeCustomer> findAll() {
        return this.typeCustomerRepository.findAll();
    }
}
