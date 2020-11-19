package com.vinhblue.controller;

import com.vinhblue.model.entity.Employee;
import com.vinhblue.model.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping({"","/employee"})
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping
    private String showList(Model model) {
        model.addAttribute("employeeList", this.employeeService.findAll());
        return "employee/list";
    }

    @GetMapping("/create")
    private String createForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "employee/create_form";
    }

    @PostMapping("/create")
    private String createEmployee(@ModelAttribute Employee employee, RedirectAttributes redirectAttributes) {
        this.employeeService.save(employee);
        redirectAttributes.addFlashAttribute("message", "Create employee success");
        return "redirect:/employee";
    }
}
