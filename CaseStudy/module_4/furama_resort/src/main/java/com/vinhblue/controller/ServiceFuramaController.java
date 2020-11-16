package com.vinhblue.controller;

import com.vinhblue.model.entity.service_furama.ServiceFurama;
import com.vinhblue.model.service.service_furama.ServiceFuramaService;
import com.vinhblue.model.service.service_furama.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/service")
public class ServiceFuramaController {

    @Autowired
    private ServiceFuramaService serviceFuramaService;

    @Autowired
    private ServiceTypeService serviceTypeService;

    @GetMapping
    private String serviceList(Model model, @PageableDefault(size = 2) Pageable pageable) {
        model.addAttribute("serviceList", this.serviceFuramaService.findAll(pageable));
        return "home_service_page";
    }

    @GetMapping("/goCreate")
    private String goCreate(Model model) {
        model.addAttribute("serviceTypelist", this.serviceTypeService.findAll());
        model.addAttribute("service", new ServiceFurama());
        return "create_service_page";
    }

    @PostMapping("/create")
    private String create(@Validated @ModelAttribute("service") ServiceFurama service, BindingResult bindingResult,
                          String checkContract, Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("serviceTypelist", this.serviceTypeService.findAll());
            return "create_service_page";
        }
        this.serviceFuramaService.save(service);
        return "redirect:/service";
    }

    @GetMapping("/goUpdate")
    private String goUpdate(@RequestParam String id, Model model) {
        model.addAttribute("service", this.serviceFuramaService.findById(id));
        model.addAttribute("serviceTypelist", this.serviceTypeService.findAll());
        return "create_service_page";
    }

    @GetMapping("/delete")
    private String delete(@RequestParam(name="id") String id) {
        this.serviceFuramaService.delete( this.serviceFuramaService.findById(id));
        return "redirect:/customer";
    }
}
