package com.university;

import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Student> list = new ArrayList<>();
    private ArrayList<Course> coursList = new ArrayList<>();
    private ArrayList<Professor> professorsList = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        if (student.getDepartment() == this) {
            list.add(student);
        }
    }

    public Student[] getStudents() {
        Student[] students = new Student[list.size()];
        for (int i = 0; i < students.length; i++)
            students[i] = list.get(i);
        return students;
    }

    public void removeStudent(Student student) {
        if (student.getDepartment() == this) {
            list.remove(student);
        }
    }

    public void addCourse(Course course) {
        if (course.getDepartment() == this) {
            coursList.add(course);
        }
    }

    public Course[] getCourses() {
        Course[] courses = new Course[coursList.size()];
        for (int i = 0; i < courses.length; i++)
            courses[i] = coursList.get(i);
        return courses;
    }

    public void removeCourse(Course course) {
        if (course.getDepartment() == this) {
            coursList.remove(course);
        }
    }

    public void addProfessor(Professor student) {
        if (student.getDepartment() == this) {
            professorsList.add(student);
        }
    }

    public Professor[] getprofessors() {
        Professor[] professors = new Professor[professorsList.size()];
        for (int i = 0; i < professors.length; i++)
            professors[i] = professorsList.get(i);
        return professors;
    }

    public void removeProfessor(Professor professor) {
        if (professor.getDepartment() == this) {
            professorsList.remove(professor);
        }
    }

    public String getName() {
        return name;
    }
}





