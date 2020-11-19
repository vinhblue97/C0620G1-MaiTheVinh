package com.vinhblue.controller;

import com.vinhblue.model.entity.Product;
import com.vinhblue.model.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping({"", "/product"})
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    private String productList(Model model) {
        List<Product> productList = this.productService.findAll();
        model.addAttribute("productList", productList);
        return "product_list";
    }

    @GetMapping("/create")
    private String goCreate(Model model){
        model.addAttribute("product", new Product());
        return "create";
    }

    @PostMapping("/create")
    private String createProduct(@ModelAttribute Product product){
        this.productService.create(product);
        return "redirect:/product";
    }

}
