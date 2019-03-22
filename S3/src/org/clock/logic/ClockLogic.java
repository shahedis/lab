package org.clock.logic;

public class ClockLogic {
    private int hour;
    private int minute;
    private int second;

    public ClockLogic(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public ClockLogic(int hour, int minute, int second, Timezone tz) {
        this.hour = hour + tz.getPositive()*tz.getHour();
        if(this.hour < 0)
            this.hour += 24;
        this.minute = minute + tz.getPositive()*tz.getMinute();
        if(this.minute < 0){
            this.minute += 60;
            this.hour--;
        }
        this.second = second;
    }

    public void setClock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void tik(int second) {
        this.second += second;
        if (this.second > 59) {
            this.second %= 60;
            minute += second / 60;
            if (minute > 59) {
                minute %= 60;
                hour += minute / 60;
                if (hour > 23)
                    hour %= 24;
            }
        }
    }
}




