package customer;

import models.Services;

import java.io.Serializable;

public class Customer implements Comparable, Serializable {
    private String customerName;
    private String birthDay;
    private String gender;
    private String idCard;
    private String phoneNumber;
    private String email;
    private String customerType;
    private String address;
    private Services usedService;

    public String getCustomerName() {
        return customerName;
    }

    public Customer(String customerName, String birthDay, String gender, String idCard, String phoneNumber, String email, String customerType, String address) {
        this.customerName = customerName;
        this.birthDay = birthDay;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerType = customerType;
        this.address = address;
        this.idCard = idCard;
    }

    public String showInfor() {
        return "Customer's name: " + this.customerType + "\n" +
                "ID Card: " + this.idCard + "\n" +
                "BirthDay: " + this.birthDay + "\n" +
                "Gender: " + this.gender + "\n" +
                "Cmnd: " + this.idCard + "\n" +
                "PhoneNumber: " + this.phoneNumber + "\n" +
                "Email: " + this.email + "\n" +
                "Customer's type: " + this.customerType + "\n" +
                "Address: " + this.address;
    }

    public int compareTo(Customer otherCustomer) {
        return this.customerName.compareTo(otherCustomer.customerName);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

