package com.vinhblue.controller;

import com.vinhblue.model.entity.AppUser;
import com.vinhblue.model.service.AppRoleService;
import com.vinhblue.model.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignInController {
    @Autowired
    private AppUserService appUserService;
    @Autowired
    private AppRoleService appRoleService;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @GetMapping("/sign_in")
    private String goSignIn(Model model) {
        model.addAttribute("roleList", this.appRoleService.findAll());
        model.addAttribute("newUser", new AppUser());
        return "sign_in_page";
    }

    @PostMapping("/checkSignIn")
    private String checkSignIn(Model model, @ModelAttribute AppUser newUser) {
        model.addAttribute("newUser",newUser);
        System.out.println(newUser.getEncrytedPassword());
        newUser.setEncrytedPassword(bCryptPasswordEncoder.encode(newUser.getEncrytedPassword()));
        this.appUserService.save(newUser);
        return "sign_in_page";
    }
}
