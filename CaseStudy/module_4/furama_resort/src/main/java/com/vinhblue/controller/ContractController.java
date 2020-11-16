package com.vinhblue.controller;

import com.vinhblue.model.entity.contract.Contract;
import com.vinhblue.model.repository.contract.AttachServiceRepository;
import com.vinhblue.model.repository.contract.ContractRepository;
import com.vinhblue.model.service.customer.CustomerService;
import com.vinhblue.model.service.employee.EmployeeService;
import com.vinhblue.model.service.service_furama.ServiceFuramaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contract")
public class ContractController {

    @Autowired
    private ContractRepository contractRepository;

    @Autowired
    private AttachServiceRepository attachServiceRepository;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ServiceFuramaService serviceFuramaService;

    @GetMapping("/goCreate")
    private String goCreate(Model model){
        model.addAttribute("attachServiceList", this.attachServiceRepository.findAll());
        model.addAttribute("contract", new Contract());
        model.addAttribute("employeeList", this.employeeService.findAll());
        model.addAttribute("customerList", this.customerService.findAll());
        model.addAttribute("serviceList", this.serviceFuramaService.findAll());
        return "create_contract_page";
    }

    @PostMapping("/create")
    private String create(@ModelAttribute Contract contract){
        this.contractRepository.save(contract);
        return "";
    }
}
