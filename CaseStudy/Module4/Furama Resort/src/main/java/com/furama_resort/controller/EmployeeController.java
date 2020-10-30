package com.furama_resort.controller;

import com.furama_resort.model.entity.employee.Employee;
import com.furama_resort.model.service.DivisionService;
import com.furama_resort.model.service.EducationDegreeService;
import com.furama_resort.model.service.EmployeeService;
import com.furama_resort.model.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private EducationDegreeService educationDegreeService;
    @Autowired
    private PositionService positionService;
    @Autowired
    private DivisionService divisionService;

    @GetMapping("/employeeList")
    private String employeeList(Model model, @PageableDefault(size = 5) Pageable pageable, @RequestParam Optional<String> keyword) {
        String keywordOld ="";
        if(keyword.isPresent()){
            keywordOld = keyword.get();
            model.addAttribute("employeeList", this.employeeService.findByEmployeeNameContaining(pageable, keywordOld));
        }
        else{
            model.addAttribute("employeeList", this.employeeService.findAll(pageable));
        }
        model.addAttribute("educationDegreeList", this.educationDegreeService.findAll());
        model.addAttribute("positionlist", this.positionService.findAll());
        model.addAttribute("divisionList", this.divisionService.findAll());
        model.addAttribute("keywordOld", keywordOld);
        return "employee_list_page";
    }

    @GetMapping("/goCreateEmployee")
    private String goCreate(Model model){
        model.addAttribute("employee", new Employee());
        model.addAttribute("educationDegreeList", this.educationDegreeService.findAll());
        model.addAttribute("positionlist", this.positionService.findAll());
        model.addAttribute("divisionList", this.divisionService.findAll());
        return "employee_create_page";
    }

    @PostMapping("/createEmployee")
    private String create(@ModelAttribute Employee employee){
        this.employeeService.save(employee);
        return "redirect:/employeeList";
    }
}
