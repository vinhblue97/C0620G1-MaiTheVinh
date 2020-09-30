package model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String birth_day;
    private Integer gender;
    private String id;
    private String phone;
    private String email;
    private Integer type;
    private String address;


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

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customer() {

    }

    public Customer(String name, String birth_day, Integer gender, String id, String phone, String email, Integer type, String address) {
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
