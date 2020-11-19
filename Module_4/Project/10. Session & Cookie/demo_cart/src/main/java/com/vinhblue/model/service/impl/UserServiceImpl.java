package com.vinhblue.model.service.impl;

import com.vinhblue.model.entity.User;
import com.vinhblue.model.repository.UserRepository;
import com.vinhblue.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByUserNameAndUserPassword(String name, String password) {
        return this.userRepository.findByUserNameAndUserPassword(name, password);
    }

}
