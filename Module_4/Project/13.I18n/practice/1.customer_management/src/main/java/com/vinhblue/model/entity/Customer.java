package com.vinhblue.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name="customer")
@Getter @Setter @NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="customer_id")
    private String customerId;
    @Column(name="customer_name")
    private String customerName;
    @Column(name="customer_birth_day")
    private String customerBirthDay;
    @Column(name="customer_email")
    private String customerEmail;
    @Column(name="customer_address")
    private String customerAddress;


    public Customer(String customerId, String customerName, String customerBirthDay, String customerEmail, String customerAddress) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerBirthDay = customerBirthDay;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
    }
}
