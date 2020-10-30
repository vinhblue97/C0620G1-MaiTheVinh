package com.vinhblue.model.service;

import com.vinhblue.model.entity.Product;

import java.util.List;

public interface ProductService {
    void create(Product product);

    List<Product> findAll();

    void update(Product product);

    void delete(String id);

    Product findById(String id);
}
