package com.vinhblue.model.entity.customer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name = "type_customer")
@Getter @Setter @NoArgsConstructor
public class TypeCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "type_customer_id")
    private Integer typeCustomerId;

    @Column(name="type_customer_name")
    private String typeCustomerName;

    @OneToMany(mappedBy = "typeCustomer")
    private List<Customer> customerList;
}
