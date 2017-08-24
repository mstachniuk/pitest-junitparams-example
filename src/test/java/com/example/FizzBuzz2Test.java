package com.example;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class FizzBuzz2Test {

    private Object [] paramForBuzz() {
        return new Integer [] {5, 10, 20};
    }

    @Test
    @Parameters(method = "paramForBuzz")
    public void shouldReturnBuzz(int arg) {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String result = fizzBuzz.getFor(arg);

        // then
        assertEquals("Buzz", result);
    }

    private Object [] paramForFizzBuzz() {
        return new Integer [] {15, 30};
    }

    @Test
    @Parameters(method = "paramForFizzBuzz")
    public void shouldReturnFizzBuzz(int arg) {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String result = fizzBuzz.getFor(arg);

        // then
        assertEquals("FizzBuzz", result);
    }



    @Test
    public void shouldReturnTwo() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String result = fizzBuzz.getFor(2);

        // then
        assertEquals("2", result);
    }
}
