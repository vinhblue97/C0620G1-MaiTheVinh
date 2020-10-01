package bo.customer;

import dao.CustomerDAO;
import dao.CustomerDAOImpl;
import model.customer.Customer;

import java.util.List;

public class CustomerBOImpl implements CustomerBO{
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

    }

    @Override
    public void delete(String id) {
        this.customerDAO.delete(id);
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
