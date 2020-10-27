package com.vinhblue.model.service.borrow;

import com.vinhblue.model.entity.BorrowerManagement;

import java.util.List;

public interface BorrowerService {
    List<BorrowerManagement> findAll();
}
