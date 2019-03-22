public class Lab {
    private student[] students;
    private int dayOfTheWeek;
    private int currentCapasity = 0;
    private int totalCapasity;
    public Lab (int dayOftheWeek, int totalcapacity)
    {
        this.dayOfTheWeek = dayOftheWeek;
        this.totalCapasity = totalcapacity;
        students = new student[totalCapasity];
    }
    public void enrollStudent(student std) {
        if (currentCapasity < totalCapasity) {
            students[currentCapasity] = std;
            currentCapasity++;
            System.out.println("DONE!!");
        }
        else
            System.out.println("FALSE!!");
    }
    public double getAverage() {
        double ave ;
        float sum = 0;
        for (int i = 0; i < currentCapasity; i++)
           sum = sum + (students[i].getGrade());
        ave = sum / currentCapasity;
        return ave;
    }
}