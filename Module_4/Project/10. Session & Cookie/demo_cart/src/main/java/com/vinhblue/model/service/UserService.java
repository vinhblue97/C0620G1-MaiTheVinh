package com.vinhblue.model.service;

import com.vinhblue.model.entity.User;

public interface UserService {

    User findByUserNameAndUserPassword(String name, String password);

}
