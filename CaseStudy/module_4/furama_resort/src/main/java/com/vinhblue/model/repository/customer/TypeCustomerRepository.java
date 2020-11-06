package com.vinhblue.model.repository;

import com.vinhblue.model.entity.customer.TypeCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeCustomerRepository extends JpaRepository<TypeCustomer, Integer> {
}
