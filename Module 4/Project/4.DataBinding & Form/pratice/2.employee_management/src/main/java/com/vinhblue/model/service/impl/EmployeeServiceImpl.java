package com.vinhblue.model.service.impl;

import com.vinhblue.model.entity.Employee;
import com.vinhblue.model.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    static Map<Integer, Employee> employeeMap;
    static {
        employeeMap = new TreeMap<>();
        employeeMap.put(1,new Employee("Mai The Vinh", "1997-03-31"));
        employeeMap.put(2,new Employee("Hoang Minh Quan", "1992-07-03"));
    }

    @Override
    public List<Employee> findAll() {
        return new ArrayList<>(employeeMap.values());
    }

    @Override
    public void save(Employee employee) {
        int index = (int) Math.random()*100;
        employeeMap.put(index, employee);
    }
}
