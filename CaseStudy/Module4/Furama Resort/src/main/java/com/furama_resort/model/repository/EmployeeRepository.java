package com.furama_resort.model.repository;

import com.furama_resort.model.entity.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    Page<Employee> findByEmployeeNameContaining(Pageable pageable, String name);
}
