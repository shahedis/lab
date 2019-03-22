import org.clock.logic.*;
import org.clock.ui.ClockUI;
public class Clock {
    public static void main(String[] args){
        ClockLogic clockL = new ClockLogic(0 , 0 , 0);
        ClockUI clock = new ClockUI(clockL.getHour(),clockL.getMinute(),clockL.getSecond());
        Timezone tehTZ = new Timezone(3 , 30 , 1);
        ClockLogic tehran = new ClockLogic(clockL.getHour(),clockL.getMinute(),clockL.getSecond() , tehTZ);
        ClockUI tehUI = new ClockUI(tehran.getHour() , tehran.getMinute(), tehran.getSecond());
        Timezone newTZ = new Timezone(5 ,0,-1);
        ClockLogic ny = new ClockLogic(clockL.getHour(),clockL.getMinute(),clockL.getSecond() , newTZ);
        ClockUI newUI = new ClockUI(ny.getHour(),ny.getMinute(),ny.getSecond());
        while(true){
            clockL.tik(1);
            ny.tik(1);
            tehran.tik(1);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            clock.setClock(clockL.getHour(),clockL.getMinute(),clockL.getSecond());
            newUI.setClock(ny.getHour(),ny.getMinute(),ny.getSecond());
            tehUI.setClock(tehran.getHour(),tehran.getMinute(),tehran.getSecond());
        }
    }
}
