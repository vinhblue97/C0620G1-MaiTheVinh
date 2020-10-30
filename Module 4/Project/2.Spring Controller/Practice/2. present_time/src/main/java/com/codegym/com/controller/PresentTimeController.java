package com.codegym.com.controller;

import com.codegym.com.entity.Country;
import com.codegym.com.service.PresentTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;
import java.util.Map;

@Controller
public class PresentTimeController {

    @Autowired
    PresentTimeService presentTimeService;

    @GetMapping("/")
    private String homePage(Model model) {
        Map<String, String> listCity = Country.listCity;
        model.addAttribute("listCity", listCity);
        return "home_page";
    }

    @PostMapping("/present_time")
    private String presentTime(@RequestParam String select_city, Model model) {
        Date presentTime = presentTimeService.presentTime(select_city);
        Map<String, String> listCity = Country.listCity;
        model.addAttribute("presentTime", presentTime);
        model.addAttribute("select_city", select_city);
        model.addAttribute("listCity", listCity);
        return "home_page";
    }
}
