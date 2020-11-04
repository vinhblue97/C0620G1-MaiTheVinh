package com.vinhblue.model.entity.customer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name="customer")
@Getter @Setter @NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name="customer_name")
    private String name;

    @Column(name="customer_birthday")
    @DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
    private LocalDate birthDay;

    @Column(name="customer_gender")
    private String gender;

    @Column(name="customer_id_card")
    private String idCard;

    @Column(name="customer_phone")
    private String phone;

    @Column(name="customer_email")
    private String email;

    @ManyToOne
    @JoinColumn(name="type_customer_id", referencedColumnName = "id");
    private TypeCustomer typeCustomer;

    @Column(name="customer_address")
    private String address;
}
