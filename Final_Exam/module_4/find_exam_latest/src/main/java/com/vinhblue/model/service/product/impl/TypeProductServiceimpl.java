package com.vinhblue.model.service.product.impl;

import com.vinhblue.model.entity.product.TypeProduct;
import com.vinhblue.model.repository.product.TypeProductRepository;
import com.vinhblue.model.service.product.TypeProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeProductServiceimpl implements TypeProductService {
    @Autowired
    private TypeProductRepository typeProductRepository;
    @Override
    public List<TypeProduct> findAll() {
        return this.typeProductRepository.findAll();
    }
}
