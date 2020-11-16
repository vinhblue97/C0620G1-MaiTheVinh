package com.vinhblue.controller.rest;

import com.vinhblue.model.entity.employee.Employee;
import com.vinhblue.model.service.employee.DivisionService;
import com.vinhblue.model.service.employee.EducationDegreeService;
import com.vinhblue.model.service.employee.EmployeeService;
import com.vinhblue.model.service.employee.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeeRest")
@CrossOrigin
public class EmployeeRestController {
    @Autowired
    private EducationDegreeService educationDegreeService;

    @Autowired
    private PositionService positionService;

    @Autowired
    private DivisionService divisionService;

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/detail/{id}")
    private ResponseEntity<Employee> detail(@PathVariable Integer id) {
        return new ResponseEntity<>(this.employeeService.findById(id), HttpStatus.OK);
    }
}
