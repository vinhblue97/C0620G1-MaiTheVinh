package com.vinhblue.model.service;

import com.vinhblue.model.entity.Login;
import com.vinhblue.model.entity.User;

import java.util.List;

public interface UserService {

    User checkLogin(Login login);
}
