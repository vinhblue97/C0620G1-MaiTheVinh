package com.vinhblue.controller;

import com.vinhblue.model.entity.AppUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignInController {
    @GetMapping("sign_in")
    private String goSignIn(Model model){
        model.addAttribute("newUser", new AppUser());
        return "sign_in_page";
    }
}
