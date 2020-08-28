package controllers;

import models.Customer;

import java.io.*;
import java.util.Comparator;
import java.util.List;

public class DisplayCustomerInformation {
    List<Customer> customersList;

    public DisplayCustomerInformation(List<Customer> customerList) {
        this.customersList = customerList;
    }

    public void showCustomerInfor() throws IOException {
        String filePath = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\Customer.csv";
        FileInputStream inputStream = null;
        ObjectInputStream objectOutputStream = null;
        try {
            inputStream = new FileInputStream(filePath);
            objectOutputStream = new ObjectInputStream(inputStream);
            System.out.println("--------------------------CUSTOMER LIST--------------------------");
            customersList = (List<Customer>) objectOutputStream.readObject();
            customersList.sort(Comparator.comparing(p->p.getCustomerName()));
            for (Customer customer : customersList) {
                int index = 1;
                System.out.println(index++);
                System.out.println(customer.showInfor());
                System.out.println("");
            }
            System.out.println("---------------------------------------------------------------------");
        } catch (FileNotFoundException | EOFException | ClassNotFoundException e) {
        } finally {
            assert objectOutputStream != null;
            objectOutputStream.close();
            inputStream.close();
        }
    }
}
