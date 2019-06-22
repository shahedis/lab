package com.university;

import java.util.ArrayList;

public class Student {
    private String name;
    private String ID;
    private String major;
    private Department department;
    private ArrayList<Course> courses ;

    public Student(String name, String ID, String major, Department department) {
        this.name = name;
        this.ID = ID;
        this.major = major;
        this.department = department;
        courses = new ArrayList<Course>();


    }

    public String getName() {

        return name;
    }

    public String getID() {

        return ID;
    }

    public String getMajor() {

        return major;
    }

    public Department getDepartment() {

        return department;
    }

    public ArrayList<Course> getCourses() {

        return courses;
    }

    public void addCourse(Course course) {

        courses.add(course);
    }
}
