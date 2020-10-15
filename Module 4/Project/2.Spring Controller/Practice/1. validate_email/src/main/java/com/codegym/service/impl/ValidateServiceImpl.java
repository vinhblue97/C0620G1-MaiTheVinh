package com.codegym.service.impl;

import com.codegym.service.ValidateService;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class ValidateServiceImpl implements ValidateService {
    @Override
    public String validateEmail(String email) {
        Pattern pattern = Pattern.compile("^\\w+@[a-z]{3,12}(.[a-z]+){1,3}");
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return "Email is correct form!";
        } else {
            return "Email is not correct form";
        }
    }
}
