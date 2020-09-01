package models;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private int age;
    private String address;

    public String getName() {
        return name;
    }

    public Employee(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\n" +
                "Age: " + this.age + "\n" +
                "Address: " + this.address;
    }
}