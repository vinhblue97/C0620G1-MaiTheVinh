package com.vinhblue.model.service.impl;

import com.vinhblue.controller.PhoneRestController;
import com.vinhblue.model.entity.Phone;
import com.vinhblue.model.repository.PhoneRepository;
import com.vinhblue.model.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class PhoneServiceImpl implements PhoneService {
    @Autowired
    private PhoneRepository phoneRepository;

    @Override
    public Page<Phone> findAll(Pageable pageable) {
        return this.phoneRepository.findAll(pageable);
    }

    @Override
    public void save(Phone phone) {
        this.phoneRepository.save(phone);
    }

    @Override
    public void delete(Integer id) {
        this.phoneRepository.delete(Objects.requireNonNull(this.phoneRepository.findById(id).orElse(null)));
    }

    @Override
    public List<Phone> findAll() {
        return this.phoneRepository.findAll();
    }
}
