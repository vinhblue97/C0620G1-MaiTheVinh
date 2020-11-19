package com.vinhblue.model.service;

import com.vinhblue.model.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    void save(Employee employee);
}
