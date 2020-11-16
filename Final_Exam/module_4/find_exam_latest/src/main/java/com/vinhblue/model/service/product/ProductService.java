package com.vinhblue.model.service.employee;

import com.vinhblue.model.entity.employee.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmployeeService {
    Page<Product> findAll(Pageable pageable);

    void save(Product product);

    Product findById(Integer id);

    List<Product> findAll();

    void deleteById(Integer employeeId);

    Page<Product> findALlByEmployeePhone(String employeePhone, Pageable pageable);

    Page<Product> findAllByEmployeeNameContaining(String employeeName, Pageable pageable );

    Page<Product> findAllByEmployeeNameContainingAndEmployeePhone(String employeeName, String employeePhone, Pageable pageable);

}
