package com.vinhblue.model.service.product;

import com.vinhblue.model.entity.product.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Page<Product> findAll(Pageable pageable);

    void save(Product product);

    Product findById(String id);

    void delete(Product product);

    Page<Product> findAllByProductNameContainingAndProductPriceContaining(String productName,
                                                                          String productPrice,
                                                                          Pageable pageable);


}
