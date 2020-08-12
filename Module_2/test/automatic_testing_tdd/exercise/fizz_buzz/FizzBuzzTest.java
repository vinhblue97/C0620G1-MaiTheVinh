package automatic_testing_tdd.exercise.fizz_buzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void findResultFizzBuzz1() {
        int number = 3;
        String expected = "Fizz";
        String result = FizzBuzz.findResultFizzBuzz(number);
        assertEquals(expected,result);
    }

    @Test
    void findResultFizzBuzz2() {
        int number = 5;
        String expected = "Buzz";
        String result = FizzBuzz.findResultFizzBuzz(number);
        assertEquals(expected,result);
    }

    @Test
    void findResultFizzBuzz3() {
        int number = -3;
        String expected = "";
        String result = FizzBuzz.findResultFizzBuzz(number);
        assertEquals(expected,result);
    }

    @Test
    void findResultFizzBuzz4() {
        int number = 18;
        String expected = "Fizz";
        String result = FizzBuzz.findResultFizzBuzz(number);
        assertEquals(expected,result);
    }

    @Test
    void findResultFizzBuzz5() {
        int number = 100;
        String expected = "";
        String result = FizzBuzz.findResultFizzBuzz(number);
        assertEquals(expected,result);
    }

    @Test
    void findResultFizzBuzz6() {
        int number = 26;
        String expected = "hai sau";
        String result = FizzBuzz.findResultFizzBuzz(number);
        assertEquals(expected,result);
    }

    @Test
    void findResultFizzBuzz7() {
        int number = 0;
        String expected = "";
        String result = FizzBuzz.findResultFizzBuzz(number);
        assertEquals(expected,result);
    }

    @Test
    void findResultFizzBuzz9() {
        int number = 17;
        String expected = "muoi bay";
        String result = FizzBuzz.findResultFizzBuzz(number);
        assertEquals(expected,result);
    }

    @Test
    void findResultFizzBuzz10() {
        int number = 101;
        String expected = "";
        String result = FizzBuzz.findResultFizzBuzz(number);
        assertEquals(expected,result);
    }

    @Test
    void findResultFizzBuzz11() {
        int number = 38;
        String expected = "ba tam";
        String result = FizzBuzz.findResultFizzBuzz(number);
        assertEquals(expected,result);
    }


}