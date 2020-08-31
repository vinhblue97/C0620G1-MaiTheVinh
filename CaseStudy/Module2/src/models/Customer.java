package models;

import java.io.Serializable;

public class Customer implements Serializable, Comparable {
    private static int numCustomer = 0;
    private int num;
    private String customerName;
    private String birthDay;
    private String gender;
    private String idCard;
    private String phoneNumber;
    private String email;
    private String customerType;
    private String address;
    private Services usedService;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

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
        setNum(++numCustomer);
    }

    public void setUsedService(Services usedService) {
        this.usedService = usedService;
    }

    public Services getUsedService() {
        return usedService;
    }

    public String showInfor() {
        return "Customer's name: " + this.customerName + "\n" +
                "ID Card: " + this.idCard + "\n" +
                "BirthDay: " + this.birthDay + "\n" +
                "Gender: " + this.gender + "\n" +
                "Cmnd: " + this.idCard + "\n" +
                "PhoneNumber: " + this.phoneNumber + "\n" +
                "Email: " + this.email + "\n" +
                "Customer's type: " + this.customerType + "\n" +
                "Address: " + this.address + "\n";

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}