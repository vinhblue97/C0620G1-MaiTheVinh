package dao;

import model.Customer;

import java.util.List;

public interface CustomerDAO {
    List<Customer> findAll();

    void create(Customer customer);

    void edit(Customer customer);

    void delete(String customer_id_card);

    List<Customer> find(String search);

    List<Customer> findById(String id);

    List<Customer> findByName(String name);
}
