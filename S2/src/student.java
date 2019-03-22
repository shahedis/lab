import java.rmi.Naming;

public class student {
    private String name;
    private String LastName;
    private long StudentID;
    private float grade;

    public student(String name, String lastName, long StudentID , float grade) {
        this.name = name;
        this.LastName = lastName;
        this.StudentID = StudentID;
        this.grade = grade;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setLName(String LastName) {
        this.LastName = LastName;
    }

    public void setID(long StudentID) {
        this.StudentID = StudentID;
    }
    public void setGrade(float grade){
        this.grade = grade;
    }

    public String getName() {
        return "name";
    }

    public String getLName() {
        return "LastName";
    }

    public long getID() {
        return StudentID;
    }

    public float getGrade() {
        return grade;
    }
    //public String getInfo(){}
}