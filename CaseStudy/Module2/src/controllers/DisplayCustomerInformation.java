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
            int index = 1;
            for (Customer customer : customersList) {
                customer.setNum(index);
                System.out.println(customer.getNum() + "\n" + customer.showInfor());
                System.out.println("");
                index++;
            }
        } catch (NullPointerException e) {
            this.checkBook = true;
            System.err.println("File is empty");
        }
    }
}
