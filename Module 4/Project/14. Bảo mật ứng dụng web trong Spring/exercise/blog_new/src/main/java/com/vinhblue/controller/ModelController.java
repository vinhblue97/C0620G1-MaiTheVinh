package com.vinhblue.controller;


import com.vinhblue.model.entity.CityManagement;
import com.vinhblue.model.entity.ModelManager;
import com.vinhblue.model.service.CityService;
import com.vinhblue.model.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping({"", "/home"})
public class ModelController {

    @Autowired
    private ModelService modelService;
    @Autowired
    private CityService cityService;

    @Autowired

    @GetMapping
    private String home_page(Model model, @RequestParam Optional<String> keyWord, @PageableDefault(size = 4) Pageable pageable) {
        String keyWordOld = "";
        if (keyWord.isPresent()) {
            keyWordOld = keyWord.get();
            model.addAttribute("listModel", this.modelService.findByNameContaining(pageable, keyWordOld));
        } else {
            model.addAttribute("listModel", this.modelService.findAll(pageable));
        }
        model.addAttribute("listModel", this.modelService.findAll(pageable));
        model.addAttribute("cityList", this.cityService.findAll());
        model.addAttribute("keyWordOld", keyWordOld);
        return "home_page";
    }

    @GetMapping("findStory")
    private String findStory() {
        return "home_page";
    }

    @GetMapping("/goCreate")
    private String goCreate(Model model) {
        model.addAttribute("modelEntity", new ModelManager());
        model.addAttribute("cityList", this.cityService.findAll());
        model.addAttribute("cityEtity", new CityManagement());
        return "create_page";
    }

    @PostMapping("/create")
    private String create(@ModelAttribute ModelManager modelManager) {
        this.modelService.save(modelManager);
        return "redirect:/home";
    }

    @GetMapping("/find_by_name")
    private String findByName(@RequestParam String name, Model model, @PageableDefault(size = 5) Pageable pageable) {
        model.addAttribute("listModel", this.modelService.findByNameContaining(pageable, name));
        return "home_page";
    }
}
