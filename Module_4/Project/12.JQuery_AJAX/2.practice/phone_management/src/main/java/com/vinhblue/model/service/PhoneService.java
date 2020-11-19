package com.vinhblue.model.service;

import com.vinhblue.model.entity.Phone;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PhoneService {
    Page<Phone> findAll(Pageable pageable);

    void save(Phone phone);

    void delete(Integer id);

    List<Phone> findAll();
}
