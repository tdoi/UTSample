package com.fr_soft.utsample;

import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClockTest {

    @Test
    void testDefaultClockReturnsCurrentHour() {
        Greeting.Clock clock = new Greeting.DefaultClock();

        int hour = clock.getHour();

        assertEquals(Calendar.getInstance().get(Calendar.HOUR), hour);
    }

}
