package com.vinhblue.controller;

import com.vinhblue.model.entity.Email;
import com.vinhblue.model.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @GetMapping
    private String emailForm(Model model){
        model.addAttribute("email", new Email());
        return "email_form";
    }

    @PostMapping("/save")
    private String saveEmail(@ModelAttribute Email email, Model model){
        model.addAttribute("email",email);
        return "email_setting";
    }
}
