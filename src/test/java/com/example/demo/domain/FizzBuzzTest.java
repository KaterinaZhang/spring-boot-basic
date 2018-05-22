package com.example.demo.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZ_BUZZ = "Fizz-Buzz";

    @Test
    public void should_get_fizz_when_given_6(){
        String result = FizzBuzz.run(6);
        assertEquals(FIZZ, result);
    }
    @Test
    public void should_get_fizz_when_given_5(){
        String result = FizzBuzz.run(5);
        assertEquals(BUZZ, result);
    }
    @Test
    public void should_get_fizz_when_given_2(){
        String result = FizzBuzz.run(2);
        assertEquals("2", result);
    }
    @Test
    public void should_get_fizz_when_given_15(){
        String result = FizzBuzz.run(15);
        assertEquals(FIZZ_BUZZ, result);
    }
}
