package com.vinhblue.controller;

import com.vinhblue.model.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
@SessionAttributes(value = "userLogin")
public class UserController {

    @GetMapping("/login")
    private String goLogin(Model model, HttpServletResponse response) {
        model.addAttribute("userLogin", new User());
        return "login_page";
    }

    @PostMapping("/checkLogin")
    private String checkLogin(){
        return "home_page_login";
    }
}
