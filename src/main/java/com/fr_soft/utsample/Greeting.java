package com.fr_soft.utsample;

import java.util.Calendar;

public class Greeting {

    public static interface Clock {
        int getHour();
    }

    public static class DefaultClock implements Clock {
        @Override
        public int getHour() {
            return Calendar.getInstance().get(Calendar.HOUR);
        }
    }

    private Clock clock;

    public void setClock(Clock clock) {
        this.clock = clock;
    }

    public String greet() {
        if (clock.getHour() <= 12) {
            return "Good Morning";
        } else {
            return "Good Evening";
        }
    }

}
