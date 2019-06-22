package test;

import com.university.Course;
import com.university.Department;
import com.university.Professor;
import com.university.Student;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

public class CourseTest {
static Course course;
static Department department;
static Professor professor;

@BeforeAll
public static void creatCourse(){
    department = new Department("Computer and IT Eng");
    professor = new Professor(department, "javadi");
    Student student = new Student("Alirea" , "1234","Software Eng", department);
    course = new Course("1","computer",department,professor,10);
    course.enrollStudent(student);
}
@Test
public void GetCourseIDtest(){
    assertNotNull(course.getID());
    assertEquals("1",course.getID());
}
@Test
public  void GetCourseDepartmenttest(){
    assertNotNull(course.getDepartment());
    assertEquals(department ,course.getDepartment());
}
@Test
public void GetCourseNametest() {
    assertNotNull(course.getName());
    assertEquals("computer", course.getName());
}

}