package com.vinhblue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SpiceController {

    @GetMapping()
    private String homePage() {
        return "home_page";
    }

    @PostMapping("/save")
    private String saveSpice(@RequestParam String[] spice, Model model) {
        List<String> list = new ArrayList<>();
        for (String ignored : spice){
            if(!ignored.equals(""))
            list.add(ignored);
        }
            model.addAttribute("list", list);
        return "home_page";
    }

}
