package com.university;

import java.util.ArrayList;

public class Professor {
    private Department department;
    private String name;
    private ArrayList<Course> courses;

    public Professor(Department department, String name) {
        this.department = department;
        this.name = name;
        courses = new ArrayList<Course>();
    }

    public Department getDepartment() {

        return department;
    }

    public String getName() {

        return name;
    }

    public void addCourse(Course course) {

        courses.add(course);
    }
}