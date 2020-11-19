package com.codegym.com.service;

import com.codegym.com.entity.Country;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.Map;

public interface PresentTimeService {
    Date presentTime(String select_city);
    List<Country>
}
