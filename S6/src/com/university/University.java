package com.university;

import java.util.ArrayList;

public class University {
    ArrayList<Department> departments = new ArrayList<>();
    public Department[] getDepartments(){
    Department[] department = new Department[departments.size()];
    for (int i=0 ; i<department.length;i++)
        department[i] = departments.get(i);
        return department;
    }

    public void addDepartment(Department department){
        departments.add(department);
    }

    public void removeDepartment(Department department){
        departments.remove(department);
    }
}
