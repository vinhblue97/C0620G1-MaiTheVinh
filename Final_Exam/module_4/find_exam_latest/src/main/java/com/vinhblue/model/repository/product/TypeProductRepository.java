package com.vinhblue.model.repository.product;

import com.vinhblue.model.entity.product.TypeProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeProductRepository extends JpaRepository<TypeProduct, Integer> {
}
