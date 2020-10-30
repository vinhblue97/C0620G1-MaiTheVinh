package com.vinhblue.controller;

import com.vinhblue.model.entity.User;
import com.vinhblue.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
@SessionAttributes(value = "userLogin")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    private String goLogin(Model model, HttpServletResponse response) {
        model.addAttribute("userLogin", new User());
        return "login_page";
    }

    @PostMapping("/checkLogin")
    private String checkLogin(@ModelAttribute(value = "userLogin") User user, HttpServletResponse response){

        return "redirect:/";
    }

}
