package com.vinhblue.controller;

import com.vinhblue.model.entity.Item;
import com.vinhblue.model.entity.User;
import com.vinhblue.model.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping({"", "/home"})
@SessionAttributes(value = "userLogin")
public class HomeController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    private String homePage(Model model) {
        model.addAttribute("itemList", this.itemService.findAll());
        model.addAttribute("user", new User());
        return "home_page";
    }

    @PostMapping("/buy")
    private String orderItem(@ModelAttribute User user, Model model){
        model.addAttribute("user", user);
        return "display_item";
    }
}
