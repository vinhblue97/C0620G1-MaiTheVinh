package com.vinhblue.model.service.impl;

import com.vinhblue.model.entity.Email;
import com.vinhblue.model.service.EmailService;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {
    @Override
    public Email save(Email email) {
        return email;
    }
}
