package com.example.demo.domain;

public class FizzBuzz {

    private static final String FIZZ_BUZZ = "Fizz-Buzz";
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    public static String run(int i) {
        if(i % 3 == 0 && i % 5 == 0){
            return FIZZ_BUZZ;
        }
        if(i % 3 == 0){
            return FIZZ;
        }
        if(i % 5 == 0){
            return BUZZ;
        }
        return i + "";
    }
}
