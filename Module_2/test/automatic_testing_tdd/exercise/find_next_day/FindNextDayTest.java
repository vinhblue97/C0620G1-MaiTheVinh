package automatic_testing_tdd.exercise.find_next_day;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindNextDayTest {

    @Test
    void findNextDay() {
        int days = 1;
        int month = 1;
        int year = 2020;
        int expected = 2;

        int result = FindNextDay.findNextDay(days,month,year);
        assertEquals(expected,result);
    }

    @Test
    void findNextDay1() {
        int days = 28;
        int month = 2;
        int year = 400;
        int expected = 29;

        int result = FindNextDay.findNextDay(days,month,year);
        assertEquals(expected,result);
    }

    @Test
    void findNextDay3() {
        int days = 31;
        int month = 1;
        int year = 2020;
        int expected = 1;

        int result = FindNextDay.findNextDay(days,month,year);
        assertEquals(expected,result);
    }

    @Test
    void findNextDay4() {
        int days = 30;
        int month = 4;
        int year = 2020;
        int expected = 1;

        int result = FindNextDay.findNextDay(days,month,year);
        assertEquals(expected,result);
    }

    @Test
    void findNextDay5() {
        int days = -1;
        int month = 1;
        int year = 2020;
        int expected = 0;

        int result = FindNextDay.findNextDay(days,month,year);
        assertEquals(expected,result);
    }
}