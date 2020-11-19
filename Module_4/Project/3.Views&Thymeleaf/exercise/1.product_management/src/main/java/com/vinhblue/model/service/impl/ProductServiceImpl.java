package com.vinhblue.model.service.impl;

import com.vinhblue.model.entity.Product;
import com.vinhblue.model.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Service
public class ProductServiceImpl implements ProductService {
    static Map<String, Product> productMap;

    static {
        productMap = new TreeMap<>();
        productMap.put("1", new Product("1", "Iphone 12", "10000", "5"));
        productMap.put("2", new Product("2", "Iphone 12 Pro Max", "30000", "2"));
        productMap.put("3", new Product("3", "Iphone 12 Mini", "5000", "10"));
    }

    @Override
    public void create(Product product) {
        if (!product.getProductId().equals("")) {
            productMap.put(product.getProductId(), product);
        }
    }

    @Override
    public List<Product> findAll() {
        List<Product> productList = new ArrayList<>();
        for (String key : productMap.keySet()) {
            if (!key.equals("")) {
                productList.add(productMap.get(key));
            }
        }
        return productList;
    }

    @Override
    public void update(Product product) {
        if (!product.getProductId().equals("")) {
            productMap.put(product.getProductId(), product);
        }
    }

    @Override
    public void delete(String id) {
        productMap.remove(id);
    }

    @Override
    public Product findById(String id) {
        for (String key : productMap.keySet()) {
            if (key.equals(id)) {
                return productMap.get(key);
            }
        }
        return null;
    }
}
