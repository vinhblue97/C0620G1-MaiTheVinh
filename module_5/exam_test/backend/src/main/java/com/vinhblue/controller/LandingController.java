package com.vinhblue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"", "/home"})
public class LandingController {

    @GetMapping
    private String homePage(){
        return "home_page";
    }
}
