package generation.finalproject;

import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

class CourseServiceTest {

    @Test
    void testRegisterCourse() {
        CourseService courseService = new CourseService();
        Course course = new Course("CS101", "Introduction to Programming", 3, new Module("CS", "Computer Science", "Intro"));

        courseService.registerCourse(course);

        assertEquals(course, courseService.getCourse("CS101"));
    }

    @Test
    void testEnrollStudentToCourse() {
        CourseService courseService = new CourseService();
        Student student = new Student("1", "John Doe", "john@example.com", new Date());
        courseService.registerCourse(new Course("CS101", "Introduction to Programming", 3, new Module("CS", "Computer Science", "Intro")));

        courseService.enrollStudent("CS101", student);

        assertTrue(courseService.getEnrolledStudents("CS101").contains(student));
    }
}
