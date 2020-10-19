package com.vinhblue.model.service.impl;

import com.vinhblue.model.entity.Customer;
import com.vinhblue.model.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Service
public class CustomerServiceImpl implements CustomerService {
    private static final Map<String, Customer> customerMap;

    static {
        customerMap = new TreeMap<>();
        customerMap.put("1", new Customer("1", "Mai The Vinh", "vinhblue97@gmail.com", "Da Nang"));
        customerMap.put("2", new Customer("2", "Hoang Minh Quan", "gigahoang@gmail.com", "Da Nang"));
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        for (String key : customerMap.keySet()) {
            if (!key.equals("")) {
                customerList.add(customerMap.get(key));
            }
        }
        return customerList;
    }

    @Override
    public void save(Customer customer) {
        customerMap.put(customer.getCustomerId(), customer);
    }

    @Override
    public Customer findById(String customerId) {
        for (String key : customerMap.keySet()) {
            if (key.equals(customerId)) {
                return customerMap.get(key);
            }
        }
        return null;
    }

    @Override
    public void delete(String id) {
        customerMap.remove(id);
    }
}
