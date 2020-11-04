package com.furama_resort.model.service;

import com.furama_resort.model.entity.employee.Employee;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;

public interface EmployeeService {
    Page<Employee> findAll(Pageable pageable);

    Page<Employee> findByEmployeeNameContaining(Pageable pageable, String name);

    void save(Employee employee);
}
