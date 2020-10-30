package com.furama_resort.model.service.impl;

import com.furama_resort.model.entity.employee.Employee;
import com.furama_resort.model.repository.EmployeeRepository;
import com.furama_resort.model.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return this.employeeRepository.findAll(pageable);
    }

    @Override
    public Page<Employee> findByEmployeeNameContaining(Pageable pageable, String name) {
        return this.employeeRepository.findByEmployeeNameContaining(pageable, name);
    }

    @Override
    public void save(Employee employee) {
        this.employeeRepository.save(employee);
    }
}
