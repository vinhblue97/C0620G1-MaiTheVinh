package com.vinhblue.model.service.service_furama.impl;

import com.vinhblue.model.entity.service_furama.ServiceFurama;
import com.vinhblue.model.repository.service_furama.ServiceFuramaRepository;
import com.vinhblue.model.service.service_furama.ServiceFuramaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceFuramaServiceImpl implements ServiceFuramaService {
    @Autowired
    private ServiceFuramaRepository serviceFuramaRepository;
    @Override
    public void save(ServiceFurama serviceFurama) {
        this.serviceFuramaRepository.save(serviceFurama);
    }

    @Override
    public Page<ServiceFurama> findAll(Pageable pageable) {
        return this.serviceFuramaRepository.findAll(pageable);
    }

    @Override
    public ServiceFurama findById(String id) {
        return this.serviceFuramaRepository.findByServiceId(id);
    }

    @Override
    public List<ServiceFurama> findAll() {
        return this.serviceFuramaRepository.findAll();
    }

    @Override
    public void delete(ServiceFurama serviceFurama) {
        this.serviceFuramaRepository.delete(serviceFurama);
    }
}
