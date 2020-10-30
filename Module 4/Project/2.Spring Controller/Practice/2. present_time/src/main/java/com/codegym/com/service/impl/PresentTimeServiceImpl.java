package com.codegym.com.service.impl;

import com.codegym.com.service.PresentTimeService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;
import java.util.TimeZone;
@Service
public class PresentTimeServiceImpl implements PresentTimeService {

    @Override
    public Date presentTime(String select_city) {
        // Get current time at local
        Date date = new Date();
// Get timezone by the local
        TimeZone local = TimeZone.getDefault();
// Get timezone by the specified city
        TimeZone locale = TimeZone.getTimeZone(select_city);
        // Calculate the current time in the specified city
        long locale_time = date.getTime() + (locale.getRawOffset() - local.getRawOffset());
// Reset the date by locale_time
        date.setTime(locale_time);
        return date;
    }
}
