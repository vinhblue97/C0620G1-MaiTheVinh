package com.vinhblue.model.service.employee.impl;

import com.vinhblue.model.entity.employee.Employee;
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
    public Page<Employee> findAll(Pageable pageable) {
        return this.employeeRepository.findAll(pageable);
    }

    @Override
    public void save(Employee employee) {
        this.employeeRepository.save(employee);
    }

    @Override
    public Employee findById(Integer id) {
        return this.employeeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Employee> findAll() {
        return this.employeeRepository.findAll();
    }

    @Override
    public void deleteById(Integer employeeId) {
        this.employeeRepository.deleteById(employeeId);
    }


}
