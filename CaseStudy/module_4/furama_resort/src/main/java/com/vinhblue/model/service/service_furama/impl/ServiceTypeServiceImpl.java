package com.vinhblue.model.service.service_furama.impl;

import com.vinhblue.model.entity.service_furama.ServiceType;
import com.vinhblue.model.repository.service_furama.ServiceTypeRepository;
import com.vinhblue.model.service.service_furama.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTypeServiceImpl implements ServiceTypeService {
    @Autowired
    private ServiceTypeRepository serviceTypeRepository;
    @Override
    public List<ServiceType> findAll() {
        return this.serviceTypeRepository.findAll();
    }
}
