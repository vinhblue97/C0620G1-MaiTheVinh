package com.vinhblue.model.entity.product;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name="type_product")
@Getter @Setter @NoArgsConstructor
public class TypeProduct {
    @Id
    @Column(name="type_product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer typeProductId;

    @Column(name="type_product_name")
    private String typeProductName;

    @OneToMany(mappedBy = "typeProduct")
    private List<Product> productList;
}
