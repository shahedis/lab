package test;

import com.university.Course;
import com.university.Department;
import com.university.Professor;
import com.university.Student;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {
    static Student student;
    static Department department;
    static Course course;
    static Professor professor;
 @BeforeAll
 public static void creatDepartment(){
     student = new Student("Alirea" , "1234","Software Eng", department);
     department = new Department("Computer and IT Eng");
     professor = new Professor(department, "javadi");
        course = new Course("1","computer",department,professor,10);
    }
 @Test
 public void addStudeentTest(){
     department.addStudent(student);
     assertNotNull(department.getStudents());
 }
 @Test
 public void addCourseTest(){
     department.addCourse(course);
     assertEquals(department.getCourses().length ,1);
 }
 @Test
 public void addProfessorTest(){
     department.addProfessor(professor);
     assertEquals(department.getprofessors()[0].getName() ,"Ahmadi");
 }
}