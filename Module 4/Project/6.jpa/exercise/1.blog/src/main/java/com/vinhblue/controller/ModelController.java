package com.vinhblue.controller;


import com.vinhblue.model.entity.ModelManager;
import com.vinhblue.model.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping({"", "/home"})
public class ModelController {

    @Autowired
    private ModelService modelService;

    @GetMapping
    private String home_page(Model model) {
        List<ModelManager> modelManagerList = this.modelService.findAll();
        model.addAttribute("modelList", modelManagerList);
        return "home_page";
    }

    @GetMapping("findStory")
    private String findStory() {
        return "home_page";
    }

    @GetMapping("/goCreate")
    private String goCreate(Model model) {
        model.addAttribute("modelEntity", new ModelManager());
        return "create_page";
    }

    @PostMapping("/create")
    private String create(@ModelAttribute ModelManager modelManager) {
        this.modelService.save(modelManager);
        return "redirect:/home";
    }
}
