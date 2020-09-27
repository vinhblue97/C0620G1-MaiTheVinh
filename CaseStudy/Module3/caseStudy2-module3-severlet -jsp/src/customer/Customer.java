package customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Customer {
    public static List<Customer> customerList = new ArrayList<>();
    private String name;
    private String birth_day;
    private String gender;
    private String id;
    private String phone;
    private String email;
    private String type;
    private String address;

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth_day() {
        return birth_day;
    }

    public void setBirth_day(String birth_day) {
        this.birth_day = birth_day;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customer(String name, String birth_day, String gender, String id, String phone, String email, String type, String address) {
        this.name = name;
        this.birth_day = birth_day;
        this.gender = gender;
        this.id = id;
        this.phone = phone;
        this.email = email;
        this.type = type;
        this.address = address;

    }

}
