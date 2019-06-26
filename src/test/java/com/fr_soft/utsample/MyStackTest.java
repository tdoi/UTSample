package com.fr_soft.utsample;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyStackTest {

    @Test
    public void testInitialStackShouldBeEmpty() {
        MyStack stack = new MyStack();

        boolean isEmpty = stack.isEmpty();

        assertEquals(true, isEmpty);
        assertThat(isEmpty, is(true));
    }
}
