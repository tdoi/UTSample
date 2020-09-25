package com.fr_soft.utsample;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzzReturns1For1() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.convert(1);

        assertThat(result, is("1"));
    }
}
