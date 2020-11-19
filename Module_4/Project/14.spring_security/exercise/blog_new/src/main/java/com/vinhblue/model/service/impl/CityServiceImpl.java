package com.vinhblue.model.service.impl;

import com.vinhblue.model.entity.CityManagement;
import com.vinhblue.model.repository.CityRepository;
import com.vinhblue.model.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;
    @Override
    public List<CityManagement> findAll() {
        return this.cityRepository.findAll();
    }
}
