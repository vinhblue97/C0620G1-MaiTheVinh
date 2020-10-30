package bo.customer;

import common.Validate;
import dao.customer.CustomerDAO;
import dao.customer.CustomerDAOImpl;
import model.customer.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CustomerBOImpl implements CustomerBO {
    CustomerDAO customerDAO = new CustomerDAOImpl();

    @Override
    public List<Customer> findAll() {
        return this.customerDAO.findAll();
    }

    @Override
    public Map<Integer, String> create(Customer customer) {
        int count = 0;
        Map<Integer, String> msg = new TreeMap<>();
        String msgID = "";
        String msgPhone = "";
        String msgIDCard = "";
        String msgEmail = "";
        msg.put(1, msgID);
        msg.put(2, msgPhone);
        msg.put(3, msgIDCard);
        msg.put(4, msgEmail);
        if (Validate.validateCustomerID(customer.getId()).equals("OK")) {
            msgID = "";
            msg.put(1, msgID);
            msg.put(10, customer.getId());
            count++;
        } else {
            msgID = "Customer ID is not correct form";
            msg.put(1, msgID);
        }
        if (Validate.validateCustomerPhone(customer.getPhone_number()).equals("OK")) {
            msgPhone = "";
            msg.put(2, msgPhone);
            msg.put(11, customer.getPhone_number());
            count++;
        } else {
            msgPhone = "Customer Phone is not correct form";
            msg.put(2, msgPhone);
        }
        if (Validate.validateIdCard(customer.getIdentify_card()).equals("OK")) {
            msgIDCard = "";
            msg.put(3, msgIDCard);
            msg.put(12, customer.getIdentify_card());
            count++;
        } else {
            msgIDCard = "Customer Identify is not correct form";
            msg.put(3, msgIDCard);
        }
        if (Validate.validateEmail(customer.getEmail()).equals("OK")) {
            msgEmail = "";
            msg.put(4, msgEmail);
            msg.put(13, customer.getEmail());
            count++;
        } else {
            msgEmail = "Customer Email is not correct form";
            msg.put(4, msgEmail);
        }
        if (count == 4) {
            this.customerDAO.create(customer);
        }
        return msg;
    }

    @Override
    public void edit(Customer customer) {
        this.customerDAO.edit(customer);
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
