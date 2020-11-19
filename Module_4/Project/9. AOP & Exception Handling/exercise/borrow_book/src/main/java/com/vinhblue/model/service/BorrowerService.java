package com.vinhblue.model.service;

import com.vinhblue.model.entity.BorrowerManagement;

import java.util.List;

public interface BorrowerService {
    List<BorrowerManagement> findAll();

    void save(BorrowerManagement borrowerManagement);
}
