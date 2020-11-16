package com.vinhblue.controller;

import com.vinhblue.model.entity.product.Product;
import com.vinhblue.model.service.product.ProductService;
import com.vinhblue.model.service.product.TypeProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private TypeProductService typeProductService;

    @GetMapping
    private String employeeList(Model model, @PageableDefault(size = 2) Pageable pageable,
                                @RequestParam Optional<String> searchPrice, @RequestParam Optional<String> searchName) {
        String searchPriceOld = "";
        String searchNameOld = "";
        if (searchPrice.isPresent() || searchName.isPresent()) {
            searchNameOld = searchName.get();
            searchPriceOld = searchPrice.get();
            model.addAttribute("productList",
                    this.productService.findAllByProductNameContainingAndProductPriceContaining
                            (searchName.get(), searchPrice.get(), pageable));
        } else {
            model.addAttribute("productList", this.productService.findAll(pageable));
        }
        model.addAttribute("typeProductList", this.typeProductService.findAll());
        model.addAttribute("searchPriceOld",searchPriceOld);
        model.addAttribute("searchNameOld",searchNameOld);
        return "home_product_page";
    }


    @GetMapping("/login")
    private String goLogin() {
        return "login_page";
    }

    @GetMapping("/goCreate")
    private String goCreate(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("typeProductList", this.typeProductService.findAll());
        return "create_product_page";
    }

    @PostMapping("/create")
    private String create(@Validated @ModelAttribute("product") Product product, BindingResult bindingResult, Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("typeProductList", this.typeProductService.findAll());
            return "create_product_page";
        }
        this.productService.save(product);
        return "redirect:/product";
    }

    @GetMapping("/goUpdate")
    private String goUpdate(@RequestParam String id, Model model) {
        Product product = this.productService.findById(id);
        model.addAttribute("product", product);
        model.addAttribute("typeProductList", this.typeProductService.findAll());
        return "update_product_page";
    }

    @PostMapping("/update")
    private String update(@ModelAttribute Product product) {
        this.productService.save(product);
        return "redirect:/product";
    }

    @GetMapping("/delete")
    private String delete(@RequestParam(name = "id") String id) {
        this.productService.delete(this.productService.findById(id));
        return "redirect:/product";
    }
}
