package com.vinhblue.model.service;

import com.vinhblue.model.entity.Product;

import java.util.List;

public interface ProductService {
    Product create(Product product);

    List<Product> findAll();

    void update(Product product);

    void delete();

    Product findById(String id);
}
