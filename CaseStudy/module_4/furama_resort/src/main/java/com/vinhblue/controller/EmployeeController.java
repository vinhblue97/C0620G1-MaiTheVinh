package com.vinhblue.controller;

import com.vinhblue.model.entity.employee.Employee;
import com.vinhblue.model.entity.user.AppUser;
import com.vinhblue.model.repository.user.AppRoleRepository;
import com.vinhblue.model.repository.user.AppUserRepository;
import com.vinhblue.model.service.employee.DivisionService;
import com.vinhblue.model.service.employee.EducationDegreeService;
import com.vinhblue.model.service.employee.EmployeeService;
import com.vinhblue.model.service.employee.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EducationDegreeService educationDegreeService;

    @Autowired
    private PositionService positionService;

    @Autowired
    private DivisionService divisionService;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private AppUserRepository appUserRepository;

    @Autowired
    private AppRoleRepository appRoleRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @GetMapping
    private String employeeList(Model model, @PageableDefault(size = 2) Pageable pageable) {
        String keywordOld = "";
        model.addAttribute("employeeList", this.employeeService.findAll(pageable));
        model.addAttribute("educationList", this.educationDegreeService.findAll());
        model.addAttribute("positionlist", this.positionService.findAll());
        model.addAttribute("divisionList", this.divisionService.findAll());
        model.addAttribute("keywordOld", keywordOld);
        return "home_employee_page";
    }

    @GetMapping("/login")
    private String goLogin() {
        return "login_employee_page";
    }

    @GetMapping("/goCreate")
    private String goCreate(Model model) {
        model.addAttribute("employee", new Employee());
        model.addAttribute("educationList", this.educationDegreeService.findAll());
        model.addAttribute("positionlist", this.positionService.findAll());
        model.addAttribute("divisionList", this.divisionService.findAll());
        return "create_employee_page";
    }

    @PostMapping("/create")
    private String create(@ModelAttribute Employee employee) {
        this.employeeService.save(employee);
        AppUser appUser = new AppUser();
        appUser.setUserName(employee.getEmployeeEmail());
        appUser.setEncrytedPassword(bCryptPasswordEncoder.encode("123123"));
        appUser.setAppRole(this.appRoleRepository.findByRoleName(employee.getPosition().getName()));
        this.appUserRepository.save(appUser);
        return "redirect:/employee";
    }

    @GetMapping("/goUpdate")
    private String goUpdate(@RequestParam Integer id, Model model) {
        model.addAttribute("employee", this.employeeService.findById(id));
        model.addAttribute("educationList", this.educationDegreeService.findAll());
        model.addAttribute("positionlist", this.positionService.findAll());
        model.addAttribute("divisionList", this.divisionService.findAll());
        return "update_employee_page";
    }

    @PostMapping("/update")
    private String update(@ModelAttribute Employee employee) {
        this.employeeService.save(employee);
        AppUser appUser = this.appUserRepository.findByUserName(employee.getEmployeeEmail());
        appUser.setAppRole(this.appRoleRepository.findByRoleName(employee.getPosition().getName()));
        this.appUserRepository.save(appUser);
        return "redirect:/employee";
    }

    @GetMapping("/delete")
    private String delete(@RequestParam(name = "id") Integer id) {
        Employee employee = this.employeeService.findById(id);
        this.employeeService.deleteById(id);
        this.appUserRepository.delete(this.appUserRepository.findByUserName(employee.getEmployeeEmail()));
        return "redirect:/employee";
    }
}
