package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void shouldReturnFizz() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String result = fizzBuzz.getFor(3);

        // then
        assertEquals("Fizz", result);
    }

    @Test
    public void shouldReturnOne() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String result = fizzBuzz.getFor(1);

        // then
        assertEquals("1", result);
    }

}
