package com.example;

public class FizzBuzz {

    public String getFor(int i) {
        if(i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        }
        String result = "";
        if(i % 3 == 0) {
            result = result + "Fizz";
        }
        if(i % 5 == 0) {
            result = result + "Buzz";
        }
        if(result.isEmpty()) {
            return "" + i;
        } else {
            return result;
        }
    }
}
