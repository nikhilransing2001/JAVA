package generation.finalproject;

import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @Test
    void testSubscribeStudent() {
        StudentService studentService = new StudentService();
        Student student = new Student("1", "Nikhil Ransing", "nikhil@example.com", new Date());

        studentService.subscribeStudent(student);

        assertTrue(studentService.isSubscribed("1"));
        assertEquals(student, studentService.findStudent("1"));
    }

    @Test
    void testEnrollToCourse() {
        StudentService studentService = new StudentService();
        Course course = new Course("CS101", "Introduction to Programming", 3, new Module("CS", "Computer Science", "Intro"));
        Student student = new Student("1", "Nikhil Ransing", "nikhil@example.com", new Date());

        studentService.subscribeStudent(student);
        studentService.enrollToCourse("1", course);

        assertTrue(student.isAttendingCourse("CS101"));
    }
}
