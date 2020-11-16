package com.vinhblue.model.service.impl;

import com.vinhblue.model.entity.AppRole;
import com.vinhblue.model.repository.AppRoleRepository;
import com.vinhblue.model.service.AppRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppRoleServiceImpl implements AppRoleService {
    @Autowired
    private AppRoleRepository appRoleRepository;

    @Override
    public List<AppRole> findAll() {
        return this.appRoleRepository.findAll();
    }
}
