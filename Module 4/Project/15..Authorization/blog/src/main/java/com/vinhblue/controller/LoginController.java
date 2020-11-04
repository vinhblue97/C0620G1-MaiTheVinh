package com.vinhblue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    private String goLogin(String error, Model model) {
        if (error == null) {
            model.addAttribute("errorLogin", "");
        } else if (error.equals("true")) {
            model.addAttribute("errorLogin", "Use name is not correct");
        }
        return "login_page";
    }
}
