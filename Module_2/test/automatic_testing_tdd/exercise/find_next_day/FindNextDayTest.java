package automatic_testing_tdd.exercise.find_next_day;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindNextDayTest {

    @Test
    void findNextDay() {
        int days = 1;
        int month = 1;
        int year = 2020;
        String expected = "Ngày: 2, tháng: 1, năm: 2020";

        String result = FindNextDay.findNextDay(days,month,year);
        assertEquals(expected,result);
    }

    @Test
    void findNextDay1() {
        int days = 28;
        int month = 2;
        int year = 400;
        String expected = "Ngày: 29, tháng: 2, năm: 400";

        String result = FindNextDay.findNextDay(days,month,year);
        assertEquals(expected,result);
    }

    @Test
    void findNextDay3() {
        int days = 31;
        int month = 1;
        int year = 2020;
        String expected = "Ngày: 1, tháng: 2, năm: 2020";

        String result = FindNextDay.findNextDay(days,month,year);
        assertEquals(expected,result);
    }

    @Test
    void findNextDay4() {
        int days = 30;
        int month = 4;
        int year = 2020;
        String expected = "Ngày: 1, tháng: 5, năm: 2020";

        String result = FindNextDay.findNextDay(days,month,year);
        assertEquals(expected,result);
    }

    @Test
    void findNextDay5() {
        int days = -1;
        int month = 1;
        int year = 2020;
        String expected = "";

        String result = FindNextDay.findNextDay(days,month,year);
        assertEquals(expected,result);
    }

    @Test
    void findNextDay6() {
        int days = 31;
        int month = 12;
        int year = 2020;
        String expected = "Ngày: 1, tháng: 1, năm: 2021";

        String result = FindNextDay.findNextDay(days,month,year);
        assertEquals(expected,result);
    }

    @Test
    void findNextDay7() {
        int days = 28;
        int month = 2;
        int year = 300;
        String expected = "Ngày: 1, tháng: 3, năm: 300";

        String result = FindNextDay.findNextDay(days,month,year);
        assertEquals(expected,result);
    }
}