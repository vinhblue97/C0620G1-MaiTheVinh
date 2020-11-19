package com.vinhblue.controller;

import com.vinhblue.model.entity.Customer;
import com.vinhblue.model.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping({"", "/customer"})
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    private String goRegister(Model model) {
        model.addAttribute("customer", new Customer());
        return "register_form";
    }

    @PostMapping("/create")
    private String create_page(@Validated @ModelAttribute Customer customer, BindingResult bindingResult,
                               RedirectAttributes redirectAttributes, Model model) {
        new Customer().validate(customer, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            return "register_form";
        }
        this.customerService.save(customer);
        return "aha";
    }
}
