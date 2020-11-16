package com.vinhblue.model.entity.employee;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity(name = "product")
@Getter
@Setter
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", columnDefinition = "int")
    private Integer productId;

    @Column(name = "product_name")
    @NotBlank(message = "do not blank product name")
    private String productName;


    @Column(name = "product_price", columnDefinition = "double")
    @NotBlank(message = "do not blank price")
    private String productPrice;


    @Column(name = "product_status")
    private String productStatus;

    @ManyToOne()
    @JoinColumn(name = "education_degree_id", referencedColumnName = "education_degree_id")
    private EducationDegree employeeEducationDegree;


}
