package com.codegym.controller;

import com.codegym.service.ValidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @Autowired
    private ValidateService validateService;

    @GetMapping("/")
    private String validateEmailForm(){
        return "validate_email";
    }

    @PostMapping("/validate")
    private String validateEmail(@RequestParam String input_email, Model model){
        String validateResult = validateService.validateEmail(input_email);
        model.addAttribute("validate", validateResult);
        model.addAttribute("input_email", input_email);
        return "validate_email";
    }
}
