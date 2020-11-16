package com.vinhblue.model.repository.employee;

import com.vinhblue.model.entity.employee.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Product, Integer> {

    Page<Product> findALlByEmployeePhone(String employeePhone, Pageable pageable);

    Page<Product> findAllByEmployeeNameContaining(String employeeName, Pageable pageable);

    Page<Product> findAllByEmployeeNameContainingAndEmployeePhone(String employeeName, String employeePhone, Pageable pageable);

}
