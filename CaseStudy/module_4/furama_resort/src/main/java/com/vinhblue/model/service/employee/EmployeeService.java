package com.vinhblue.model.service.employee;

import com.vinhblue.model.entity.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmployeeService {
    Page<Employee> findAll(Pageable pageable);

    void save(Employee employee);

    Employee findById(Integer id);

    List<Employee> findAll();

    void deleteById(Integer employeeId);
}
