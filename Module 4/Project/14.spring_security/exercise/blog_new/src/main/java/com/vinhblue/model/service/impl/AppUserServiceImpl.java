package com.vinhblue.model.service.impl;

import com.vinhblue.model.entity.AppUser;
import com.vinhblue.model.repository.AppUserRepository;
import com.vinhblue.model.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserServiceImpl implements AppUserService {

    @Autowired
    private AppUserRepository appUserRepository;
    @Override
    public AppUser findByUserName(String userName) {
        return this.appUserRepository.findByUserName(userName);
    }

    @Override
    public void save(AppUser appUser) {
        this.appUserRepository.save(appUser);
    }
}
