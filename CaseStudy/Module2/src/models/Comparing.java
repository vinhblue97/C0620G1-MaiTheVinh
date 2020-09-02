package models;

import java.util.Comparator;

public class Comparing implements Comparator<Customer> {

    @Override
    public int compare(Customer customer1, Customer customer2) {
        int name = customer1.getCustomerName().compareTo(customer2.getCustomerName());
        if (name == 0) {
            return customer2.getAge() - customer1.getAge();
        } else {
            return name;
        }
    }
}
