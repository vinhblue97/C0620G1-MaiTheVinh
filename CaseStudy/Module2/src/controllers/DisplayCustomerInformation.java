package controllers;

import commons.FileUtils;
import models.Customer;

import java.util.List;

public class DisplayCustomerInformation {

    public static void showCustomerInfor(List<Customer> customersList) {
        String filePath = "E:\\C0620G1-MaiTheVinh\\CaseStudy\\Module2\\src\\data\\Customer.csv";
        FileUtils<List<Customer>> fileUtils = new FileUtils<>();
        customersList = fileUtils.readFileCSV(filePath);
    }
}
