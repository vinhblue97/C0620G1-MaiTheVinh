package com.vinhblue.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity(name="type_customer")
@Getter @Setter @NoArgsConstructor
public class TypeCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer customerTypeId;
    @Column(name="name")
    @NotBlank
    private String customerTypeName;

    @OneToMany(mappedBy = "typeCustomer", cascade = CascadeType.ALL )
    private List<Customer> customer;

}
