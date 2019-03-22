import javax.print.attribute.Size2DSyntax;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {

        student S1 = new student("sara", "krmi",111, 9);
        student S2 = new student("mrym", "alavi",222, 15);
        Lab lab1 = new Lab(1, 5);
        //Lab lab2 =  new Lab(2, 5);
        lab1.enrollStudent(S1);
        lab1.enrollStudent(S2);
        System.out.println(lab1.getAverage());
        //System.out.println(lab2.getAverage());
    }
}
