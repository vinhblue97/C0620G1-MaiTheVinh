package com.vinhblue.service.impl;

import com.vinhblue.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String calculateAdd(String num1, String num2) {
        double result = 0.0;
        try {
            result = Double.parseDouble(num1) + Double.parseDouble(num2);
        } catch (NumberFormatException e) {

        }
        String finalResult = String.format("%.0f", result);
        return finalResult;
    }

    @Override
    public String calculateSub(String num1, String num2) {
        double result = 0.0;
        try {
            result = Double.parseDouble(num1) - Double.parseDouble(num2);
        } catch (NumberFormatException e) {

        }
        String finalResult = String.format("%.0f", result);
        return finalResult;
    }

    @Override
    public String calculateMul(String num1, String num2) {
        double result = 0.0;
        try {
            if (num1.equals("0") || num2.equals("0")) {
                result = 0;
            } else {
                result = Double.parseDouble(num1) * Double.parseDouble(num2);
            }
        } catch (NumberFormatException e) {

        }
        String finalResult = String.format("%.0f", result);
        return finalResult;
    }

    @Override
    public String calculateDiv(String num1, String num2) {
        double result = 0.0;
        try {
            result = Double.parseDouble(num1) / Double.parseDouble(num2);
        } catch (NumberFormatException e) {

        }
        String finalResult = String.format("%.0f", result);
        return finalResult;
    }
}
