package com.vinhblue.model.service.employee.impl;

import com.vinhblue.model.entity.employee.EducationDegree;
import com.vinhblue.model.repository.employee.EducationDegreeRepository;
import com.vinhblue.model.service.employee.EducationDegreeService;
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
