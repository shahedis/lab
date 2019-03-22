package org.clock.logic;

public class Timezone {
    private int hour;
    private int minute;
    private int positive;
    public Timezone(int hour , int minute , int positive){
        this.hour = hour;
        this.minute = minute;
        this.positive = positive;

    }
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getPositive() {
        return positive;
    }

}
