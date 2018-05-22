package com.example.demo.domain;

public class Fibonacci {

    private Fibonacci(){
        throw new IllegalStateException("Not support new.");
    }

    public static int of(int num) {
        if(num > 2) {
            return of(num - 2) + of(num - 1);
        }
        return 1;
    }
}
