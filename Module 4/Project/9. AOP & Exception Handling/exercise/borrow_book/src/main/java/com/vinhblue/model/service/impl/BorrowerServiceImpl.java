package com.vinhblue.model.service.borrow.impl;

import com.vinhblue.model.entity.BorrowerManagement;
import com.vinhblue.model.repository.BorrowerRepository;
import com.vinhblue.model.service.borrow.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowerServiceImpl implements BorrowerService {
    @Autowired
    private BorrowerRepository borrowerRepository;
    @Override
    public List<BorrowerManagement> findAll() {
        return this.borrowerRepository.findAll();
    }
}
