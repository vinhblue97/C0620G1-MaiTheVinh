package com.vinhblue.controller;

import com.vinhblue.model.entity.Customer;
import com.vinhblue.model.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping({"", "/customer"})
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    private String customerList(Model model) {
        List<Customer> customerList = this.customerService.findAll();
        model.addAttribute("customerList", customerList);
        return "customer_list";
    }

    @GetMapping("/create")
    private String createCustomer(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer_create";
    }

    @PostMapping("/save")
    private String saveCustomer(@ModelAttribute Customer customer) {
        this.customerService.save(customer);
        return "redirect:/customer";
    }

    @GetMapping("/goUpdate/{customerId}")
    private String goUpdate(Model model, @PathVariable String customerId) {
        Customer customer = this.customerService.findById(customerId);
        model.addAttribute("customer", customer);
        return "customer_update";
    }

    @PostMapping("/update")
    private String update(@ModelAttribute Customer customer) {
        this.customerService.update(customer);
        return "redirect:/customer";
    }

    @GetMapping("/delete/{customerId}")
    private String delete(@PathVariable String customerId) {
        Customer customer = this.customerService.findById(customerId);
        this.customerService.delete(customerId);
        return "redirect:/customer";
    }
}
