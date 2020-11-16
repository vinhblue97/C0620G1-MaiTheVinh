package com.vinhblue.model.repository.product;

import com.vinhblue.model.entity.product.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

    Page<Product> findAllByProductNameContainingAndProductPriceContaining(String productName,
                                                                          String productPrice,
                                                                          Pageable pageable);

}
