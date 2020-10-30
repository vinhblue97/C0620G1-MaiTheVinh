package com.vinhblue.controller;

import com.vinhblue.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @Autowired
    CalculatorService calculatorService;

    @GetMapping("/")
    private String calculator(ModelMap modelMap) {
        String num1 = "";
        String num2 = "";
        modelMap.put("num1", num1);
        modelMap.put("num2", num2);
        return "calculator";
    }

    @PostMapping("/addition")
    private String addition(@RequestParam String num1, @RequestParam String num2, Model model) {
        String result = calculatorService.calculateAdd(num1, num2);
        model.addAttribute("result", result);
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        return "calculator";
    }

    @PostMapping("/subtraction")
    private String subtraction(@RequestParam String num1, @RequestParam String num2, Model model) {
        String result = calculatorService.calculateSub(num1, num2);
        model.addAttribute("result", result);
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        return "calculator";
    }

    @PostMapping("/multiplication")
    private String multiplication(@RequestParam String num1, @RequestParam String num2, Model model) {
        String result = calculatorService.calculateMul(num1, num2);
        model.addAttribute("result", result);
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        return "calculator";
    }

    @PostMapping("/division")
    private String division(@RequestParam String num1, @RequestParam String num2, Model model) {
        String result = calculatorService.calculateDiv(num1, num2);
        model.addAttribute("result", result);
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        return "calculator";
    }

}
