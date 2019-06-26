package com.fr_soft.utsample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GreetingTest {

    @Mock
    Greeting.Clock clock;

    @BeforeEach
    public void before() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void GreetingReturnsGoodMoringOn8AM() {
        Greeting greeting = new Greeting();
        greeting.setClock(clock);
        when(clock.getHour()).thenReturn(8);

        String message = greeting.greet();

        assertEquals("Good Morning", message);
    }

    @Test
    void GreetingReturnsGoodMoringOn8PM() {
        Greeting greeting = new Greeting();
        greeting.setClock(clock);
        when(clock.getHour()).thenReturn(20);

        String message = greeting.greet();

        assertEquals("Good Evening", message);
    }
}
