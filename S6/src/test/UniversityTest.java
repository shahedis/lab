package test;

import com.university.Department;
import com.university.University;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

public class UniversityTest {
static Department department , department1;
static University university;
@BeforeAll
public static void creatuni(){
    department = new Department("Computer and IT Eng");
    university = new University();
    department1= new Department("Math");
}
@Test
public void getDepartmentsTest(){
    university.addDepartment(department1);
    university.addDepartment(department);
    assertEquals(university.getDepartments()[1].getName(),department.getName());
}
@Test
    public void removeDepartmentTest(){
    university.removeDepartment(department1);
    assertEquals(university.getDepartments().length, 1);
}
}