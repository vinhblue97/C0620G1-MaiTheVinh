package bo.customer;

import model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class CustomerBOImpl implements CustomerBO {
    public static Map<String, Customer> customerMap;

    static {
        customerMap = new TreeMap<>();
        customerMap.put("197362335", new Customer("Mai Thế Vinh", "1997-03-31", 1, "197362335", "0334611971", "vinhblue97@gmail.com", 0, "Quang Tri"));
        customerMap.put("800302698", new Customer("Hoàng Minh Quân", "1997-03-31", 1, "800302698", "4231071065", "eshan@malagaapparel.com", 3, "Sai Gon"));
        customerMap.put("351401209", new Customer("Huỳnh Ngọc Kim Ngân", "1997-03-31", 0, "351401209", "8535530851", "4kevin-du.595@outdonews.com", 0, "Da Nang"));
        customerMap.put("838810001", new Customer("Hồ Thị Quỳnh Mai", "1997-03-31", 0, "838810001", "6225707159", "2ahmedmohamed010d@olivestextures.com", 1, "Da Nang"));
        customerMap.put("459419328", new Customer("Nguyễn Quang Danh", "1997-03-31", 3, "459419328", "3798314389", "2ahmedmohamed010d@olivestextures.com", 4, "Hue"));
        customerMap.put("571539768", new Customer("Nguyễn Quốc Khánh", "1997-03-31", 3, "571539768", "7401727418", "4mayurmurudk@enometry.com", 1, "Da Nang"));
        customerMap.put("436454769", new Customer("Nguyễn Quang Đin", "1997-03-31", 3, "436454769", "2319183198", "qazz.iiz.1j@petruhino2.ru", 2, "Da Nang"));
        customerMap.put("1232131223", new Customer("Nguyễn Quang Đin", "1997-03-31", 3, "1232131223", "2319183198", "qazz.iiz.1j@petruhino2.ru", 2, "Da Nang"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public void create(Customer customer) {
        customerMap.put(customer.getId(), customer);
    }

    @Override
    public void edit(Customer customer) {
        customerMap.put(customer.getId(), customer);
    }

    @Override
    public void delete(String id) {
        customerMap.remove(id);
    }

    @Override
    public List<Customer> find(String search) {
        List<Customer> customers = new ArrayList<>();
        Pattern patternId = Pattern.compile("^[0-9]*$");
        if (patternId.matcher(search).matches()) {
            customers = findById(search);
        } else {
            customers = findByName(search);
        }
        return customers;
    }

    @Override
    public List<Customer> findById(String id) {
        List<Customer> customers = new ArrayList<>();
        for (String key : customerMap.keySet()) {
            if (key.equals(id)) {
                customers.add(customerMap.get(key));
            }
        }

        return customers;
    }

    @Override
    public List<Customer> findByName(String name) {
        List<Customer> customers = new ArrayList<>();
        for (String key : customerMap.keySet()) {
            if (customerMap.get(key).getName().equals(name)) {
                customers.add(customerMap.get(key));
            }
        }
        return customers;
    }
}