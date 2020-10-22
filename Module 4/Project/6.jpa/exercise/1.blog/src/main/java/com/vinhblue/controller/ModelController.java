package com.vinhblue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"", "/home"})
public class BlogController {

    @GetMapping
    private String home_page() {
        return "home_page";
    }

    @GetMapping("findStory")
    private String findStory(){
        return "home_page";
    }
}
