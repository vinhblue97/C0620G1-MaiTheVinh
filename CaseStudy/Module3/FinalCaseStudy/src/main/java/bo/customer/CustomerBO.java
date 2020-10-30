package bo.customer;

import model.customer.Customer;

import java.util.List;
import java.util.Map;

public interface CustomerBO {
    List<Customer> findAll();

    Map<Integer,String> create(Customer customer);

    void edit(Customer customer);

    void delete(String id);

    List<Customer> find(String search);

    List<Customer> findById(String id);

    List<Customer> findByName(String name);
}
