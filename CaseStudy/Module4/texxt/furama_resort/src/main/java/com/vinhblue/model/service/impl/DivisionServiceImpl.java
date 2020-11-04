package com.furama_resort.model.service.impl;

import com.furama_resort.model.entity.employee.Division;
import com.furama_resort.model.repository.DivisionRepository;
import com.furama_resort.model.service.DivisionService;
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
