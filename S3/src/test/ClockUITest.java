package test;

import org.clock.ui.ClockUI;

public class ClockUITest {
    public static void main(String[] args){
        ClockUI clock = new ClockUI(2 , 25 ,30);
        clock.setHour(3);
        clock.setMinute(30);
        clock.setSecond(45);
        clock.setClock(23,30,31);
    }
}
