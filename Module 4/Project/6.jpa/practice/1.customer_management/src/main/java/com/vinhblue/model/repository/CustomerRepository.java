package com.vinhblue.model.repository;

import com.vinhblue.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, String> {

}
