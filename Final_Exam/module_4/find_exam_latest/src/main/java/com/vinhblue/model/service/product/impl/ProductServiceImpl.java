package com.vinhblue.model.service.employee.impl;

import com.vinhblue.model.entity.employee.Product;
import com.vinhblue.model.repository.employee.EmployeeRepository;
import com.vinhblue.model.service.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Page<Product> findAll(Pageable pageable) {
        return this.employeeRepository.findAll(pageable);
    }

    @Override
    public void save(Product product) {
        this.employeeRepository.save(product);
    }

    @Override
    public Product findById(Integer id) {
        return this.employeeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Product> findAll() {
        return this.employeeRepository.findAll();
    }

    @Override
    public void deleteById(Integer employeeId) {
        this.employeeRepository.deleteById(employeeId);
    }

    @Override
    public Page<Product> findAllByEmployeeNameContaining(String employeeName, Pageable pageable) {
        return this.employeeRepository.findAllByEmployeeNameContaining(employeeName, pageable);
    }

    @Override
    public Page<Product> findALlByEmployeePhone(String employeePhone, Pageable pageable) {
        return this.employeeRepository.findALlByEmployeePhone(employeePhone,pageable);
    }



    @Override
    public Page<Product> findAllByEmployeeNameContainingAndEmployeePhone(String employeeName, String employeePhone, Pageable pageable) {
        return this.employeeRepository.findAllByEmployeeNameContainingAndEmployeePhone(employeeName,employeePhone,pageable);
    }


}
