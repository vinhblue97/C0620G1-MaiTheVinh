package com.vinhblue.model.service.product.impl;

import com.vinhblue.model.entity.product.Product;
import com.vinhblue.model.repository.product.ProductRepository;
import com.vinhblue.model.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return this.productRepository.findAll(pageable);
    }

    @Override
    public void save(Product product) {
        this.productRepository.save(product);
    }

    @Override
    public Product findById(String id) {
        return this.productRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Product product) {
        this.productRepository.delete(product);
    }

    @Override
    public Page<Product> findAllByProductNameContainingAndProductPriceContaining(String productName, String productPrice, Pageable pageable) {
        return this.productRepository.findAllByProductNameContainingAndProductPriceContaining(productName, productPrice, pageable);
    }


}
