package com.vinhblue.model.entity.product;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity(name = "product")
@Getter
@Setter
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", columnDefinition = "int")
    private String productId;

    @Column(name = "product_name")
    @Pattern(regexp = "^\\w{5,50}$", message = "do not blank product name")
    private String productName;


    @Column(name = "product_price", columnDefinition = "double")
    @Pattern(regexp = "^\\d*$", message = "do not blank product name")
    @Min(100000)
    private String productPrice;


    @Column(name = "product_status")
    private String productStatus;

    @ManyToOne()
    @JoinColumn(name = "type_product_id", referencedColumnName = "type_product_id")
    private TypeProduct typeProduct;


}
