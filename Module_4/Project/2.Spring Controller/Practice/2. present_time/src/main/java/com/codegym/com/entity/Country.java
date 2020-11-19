package com.codegym.com.entity;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Country {
    public static Map<String, String> listCity;

    static {
        listCity = new TreeMap<>();
        listCity.put("Asia/Ho_Chi_Minh", "Ho Chi Minh");
        listCity.put("Singapore", "Singapore");
        listCity.put("Asia/Hong_Kong", "Hong Kong");
        listCity.put("Asia/Tokyo", "Tokyo");
        listCity.put("Asia/Seoul", "Seoul");
        listCity.put("Europe/London", "London");
        listCity.put("Europe/Madrid", "Madrid");
        listCity.put("America/New_York", "New York");
        listCity.put("Australia/Sydney", "Sydney");
        listCity.put("Argentina/Buenos_Aires", "Buenos Aires");
    }
}
