package test;

import com.university.Course;
import com.university.Department;
import com.university.Professor;
import com.university.Student;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import static org.junit.jupiter.api.Assertions.*;

public class ProfessorTest {
static Department department;
static Course course;
static Professor professor;
@BeforeAll
    public static void creatprofessor(){
    department = new Department("Computer and IT Eng");
    professor = new Professor(department, "ahmadi");
    course = new Course("1","computer",department,professor,10);
}
@Test
    public void getDepartmentTest(){
    department.addProfessor(professor);

    assertFalse(3 == 2);
    assertEquals(professor.getDepartment().getName(),department.getName());
}
}