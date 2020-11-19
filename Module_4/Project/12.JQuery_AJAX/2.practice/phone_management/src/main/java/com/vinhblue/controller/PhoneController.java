package com.vinhblue.controller;

import com.vinhblue.model.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class PhoneController {

    @Autowired
    private PhoneService phoneService;

    @GetMapping
    private String homePage(Model model, @PageableDefault(size=5) Pageable pageable) {
        model.addAttribute("phoneList", this.phoneService.findAll(pageable));
        return "home_page";
    }
}
