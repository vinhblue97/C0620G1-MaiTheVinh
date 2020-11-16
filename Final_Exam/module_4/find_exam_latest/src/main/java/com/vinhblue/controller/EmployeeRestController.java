//package com.vinhblue.controller;
//
//import com.vinhblue.model.entity.employee.Product;
//import com.vinhblue.model.service.product.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.web.PageableDefault;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@CrossOrigin
//@RequestMapping("/employeeRest")
//public class EmployeeRestController {
//
//    @Autowired
//    private ProductService productService;
//
//    @GetMapping
//    private ResponseEntity<Page<Product>> employeeList(@PageableDefault(size = 2) Pageable pageable){
//        return new ResponseEntity<>(this.productService.findAll(pageable), HttpStatus.OK);
//    }
//
//    @GetMapping("/search/{id}/{name}")
//    private ResponseEntity<Page<Product>> search(@PageableDefault(size=2) Pageable pageable, @PathVariable String id, @PathVariable String name){
//        return new ResponseEntity<>(this.productService.findAll(pageable), HttpStatus.OK);
//    }
//}
