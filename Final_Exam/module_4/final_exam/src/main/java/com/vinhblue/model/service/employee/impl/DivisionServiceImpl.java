package com.vinhblue.model.service.employee.impl;

import com.vinhblue.model.entity.employee.Division;
import com.vinhblue.model.repository.employee.DivisionRepository;
import com.vinhblue.model.service.employee.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionServiceImpl implements DivisionService {
    @Autowired
    private DivisionRepository divisionRepository;
    @Override
    public List<Division> findAll() {
        return this.divisionRepository.findAll();
    }
}
