package com.vinhblue.controller;

import com.vinhblue.model.entity.customer.Customer;
import com.vinhblue.model.service.customer.CustomerService;
import com.vinhblue.model.service.customer.TypeCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private TypeCustomerService typeCustomerService;

    @GetMapping("")
    private String customerList(Model model, @PageableDefault(size = 2) Pageable pageable,
                                @RequestParam Optional<String> keyword) {
        String keywordOld = "";
        if (keyword.isPresent()) {
            keywordOld = keyword.get();
            model.addAttribute("customerList", this.customerService.findAllByCustomerNameContaining(pageable, keyword.get()));
        } else {
            model.addAttribute("customerList", this.customerService.findAll(pageable));
        }
        model.addAttribute("keywordOld", keywordOld);
        return "home_customer";
    }

    @GetMapping("/goCreate")
    private String goCreate(Model model) {
        model.addAttribute("customer", new Customer());
        model.addAttribute("typeCustomerList", this.typeCustomerService.findAll());
        return "create_customer_page";
    }

    @PostMapping("/create")
    private String create(@Validated @ModelAttribute("customer") Customer customer, BindingResult bindingResult, Model model) {

        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("typeCustomerList", this.typeCustomerService.findAll());
            return "create_customer_page";
        }
        this.customerService.save(customer);
        return "redirect:/customer";
    }

    @GetMapping("/goUpdate")
    private String goUpdate(@RequestParam String id, Model model) {
        model.addAttribute("customerDetail", this.customerService.findById(id));
        model.addAttribute("typeCustomerList", this.typeCustomerService.findAll());
        return "update_customer_page";
    }

    @PostMapping("/update")
    private String update(@ModelAttribute Customer customer) {
        this.customerService.save(customer);
        return "redirect:/customer";
    }

    @GetMapping("/delete")
    private String delete(@RequestParam(name = "id") String id) {
        this.customerService.delete(this.customerService.findById(id));
        return "redirect:/service";
    }
}
