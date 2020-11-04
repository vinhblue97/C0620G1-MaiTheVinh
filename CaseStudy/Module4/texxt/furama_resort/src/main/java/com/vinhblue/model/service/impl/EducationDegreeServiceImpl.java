package com.furama_resort.model.service.impl;

import com.furama_resort.model.entity.employee.EducationDegree;
import com.furama_resort.model.repository.EducationDegreeRepository;
import com.furama_resort.model.service.EducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationDegreeServiceImpl implements EducationDegreeService {
    @Autowired
    private EducationDegreeRepository educationDegreeRepository;
    @Override
    public List<EducationDegree> findAll() {
        return this.educationDegreeRepository.findAll();
    }
}
