package dao.customer;

import model.customer.Customer;

import java.util.List;

public interface CustomerDAO {
    List<Customer> findAll();

    void create(Customer customer);

    void edit(Customer customer);

    void delete(String id);

    List<Customer> find(String search);

    List<Customer> findById(String id);

    List<Customer> findByName(String name);
}
