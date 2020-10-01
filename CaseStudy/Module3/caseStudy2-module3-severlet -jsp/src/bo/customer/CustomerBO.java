package bo.customer;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public interface CustomerBO {
    List<Customer> findAll();

    void create(Customer customer);

    void edit(Customer customer);

    void delete(String customer_id_card);

    List<Customer> find(String search);

    List<Customer> findById(String id);

    List<Customer> findByName(String name);
}
