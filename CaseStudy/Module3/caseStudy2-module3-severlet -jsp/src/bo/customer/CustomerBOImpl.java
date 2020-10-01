package bo.customer;

import dao.CustomerDAO;
import dao.CustomerDAOImpl;
import model.Customer;

import java.util.List;

public class CustomerBOImpl implements CustomerBO {

    CustomerDAO customerDAO = new CustomerDAOImpl();

    @Override
    public List<Customer> findAll() {
        return this.customerDAO.findAll();
    }

    @Override
    public void create(Customer customer) {
        this.customerDAO.create(customer);
    }

    @Override
    public void edit(Customer customer) {
        this.customerDAO.edit(customer);
    }

    @Override
    public void delete(String customer_id_card) {
        this.customerDAO.delete(customer_id_card);

    }

    @Override
    public List<Customer> find(String search) {
        return null;
    }

    @Override
    public List<Customer> findById(String id) {
        return null;
    }

    @Override
    public List<Customer> findByName(String name) {
        return null;
    }
}