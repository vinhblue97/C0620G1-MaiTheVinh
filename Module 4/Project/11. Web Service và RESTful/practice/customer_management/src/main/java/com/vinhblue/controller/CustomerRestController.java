package com.vinhblue.controller;

import com.vinhblue.model.entity.Customer;
import com.vinhblue.model.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/customerRest")
public class CustomerRestController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/list")
    public ResponseEntity<List<Customer>> getListCustomer() {
        return new ResponseEntity<>(this.customerService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Customer> getDetailCustomer(@PathVariable Integer id) {
        return new ResponseEntity<>(this.customerService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/register")
    public ResponseEntity<Void> registerCustomer(@RequestBody Customer customer, UriComponentsBuilder ucBuilder) {
        this.customerService.save(customer);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/customerRest/detail/{id}").buildAndExpand(customer.getCustomerId()).toUri());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteCustomerById(@PathVariable Integer id){
        this.customerService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
