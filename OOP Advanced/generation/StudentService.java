package generation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentService {
    private HashMap<String, Courses> courseList = new HashMap<>();
    private HashMap<String, Students> students = new HashMap<>();
    private HashMap<String, List<Courses>> coursesEnrolledByStudents = new HashMap<>();

    public StudentService() {
        courseList.put("Math", new Courses("Math", 10, "Aurelio Baldor"));
        courseList.put("Physics", new Courses("Physics", 10, "Albert Einstein"));
        courseList.put("Art", new Courses("Art", 10, "Pablo Picasso"));
        courseList.put("History", new Courses("History", 10, "Sima Qian"));
        courseList.put("Biology", new Courses("Biology", 10, "Charles Darwin"));
    }

    public void addStudent(String studentID, Students student) {
        students.put(studentID, student);
    }

    public void enrollStudents(String courseName, String studentID)
            throws CourseNotFoundException, StudentNotFoundException {
        Courses course = courseList.get(courseName);

        if (course == null) {
            throw new CourseNotFoundException();
        }

        if (!students.containsKey(studentID)) {
            throw new StudentNotFoundException();
        }

        if (!coursesEnrolledByStudents.containsKey(studentID)) {
            coursesEnrolledByStudents.put(studentID, new ArrayList<>());
        }
        coursesEnrolledByStudents.get(studentID).add(course);
    }
    public void unEnrollStudents(String courseName, String studentID)
            throws CourseNotFoundException, StudentNotFoundException {
        Courses course = courseList.get(courseName);

        if (course == null) {
            throw new CourseNotFoundException();
        }

        if (!students.containsKey(studentID)) {
            throw new StudentNotFoundException();
        }

        if (coursesEnrolledByStudents.containsKey(studentID)) {
            coursesEnrolledByStudents.get(studentID).remove(course);
        }
    }

    public void showEnrolledStudents(String studentID) {
        if (coursesEnrolledByStudents.containsKey(studentID)) {
            List<Courses> enrolledCourses = coursesEnrolledByStudents.get(studentID);

            System.out.println("Enrolled courses for student " + studentID + ":");
            for (Courses course : enrolledCourses) {
                System.out.println(course.getName());
            }
        } else {
            System.out.println("Student with ID " + studentID + " is not enrolled in any courses.");
        }
    }

    public void showAllCourses() {
        System.out.println("All available courses:");
        for (Courses course : courseList.values()) {
            System.out.println(course.getName());
        }
    }
}

