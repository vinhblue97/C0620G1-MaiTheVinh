package com.vinhblue.model.repository;

import com.vinhblue.model.entity.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    Page<Customer> findAllByCustomerNameContaining(Pageable pageable, String name);

//    @Query(value = "select * from customer where customer_name like concat('%',?1,'%')", nativeQuery = true)
//    List<Customer> findByCustomerName(String name);

    Customer findByCustomerId(String id);

    void deleteByCustomerId(String id);
}
