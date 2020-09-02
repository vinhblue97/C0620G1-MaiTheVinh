package controllers;

import models.Comparing;
import models.Customer;

import java.util.Collections;
import java.util.List;

public class DisplayCustomerInformation {
    List<Customer> customersList;
    private boolean checkBook = false;

    public boolean isCheckBook() {
        return checkBook;
    }

    public DisplayCustomerInformation(List<Customer> customersList) {
        this.customersList = customersList;
    }

    public void showCustomerInfor() {
        try {
            Collections.sort(customersList,new Comparing());
            for (Customer customer : customersList) {
                System.out.println(customer.getNum() + "\n" + customer.showInfor());
                System.out.println("");
            }
        } catch (NullPointerException e) {
            this.checkBook = true;
            System.err.println("File is empty");
        }
    }
}
