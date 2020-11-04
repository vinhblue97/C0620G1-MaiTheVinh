package com.furama_resort.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"","/home"})
public class HomeController {

    @GetMapping
    private String homePage(){
        return "home_page";
    }
}
