package com.vinhblue.model.service;

import com.vinhblue.model.entity.AppUser;

public interface AppUserService {
    AppUser findByUserName(String userName);

    void save(AppUser appUser);
}
