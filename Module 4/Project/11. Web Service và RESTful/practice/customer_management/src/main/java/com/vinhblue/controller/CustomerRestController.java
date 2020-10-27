package com.vinhblue.controller;

import com.vinhblue.model.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customerRest")
public class CustomerRestController {
    @Autowired
    private CustomerService customerService;

    public
}
