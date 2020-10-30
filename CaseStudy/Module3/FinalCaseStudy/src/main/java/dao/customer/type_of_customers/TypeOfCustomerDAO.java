package dao.customer.type_of_customers;

import model.customer.TypeOfCustomer;

import java.util.List;

public interface TypeOfCustomerDAO {
    List<TypeOfCustomer> findAll();
}
