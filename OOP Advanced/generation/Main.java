package generation;

public class Main {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        try {
            studentService.addStudent("1030", new Students("Carlos", "1030", 31, 0, 0));
            studentService.addStudent("1040", new Students("Ian", "1020", 28, 0, 0));
            studentService.addStudent("1050", new Students("Elise", "1020", 26, 0, 0));
            studentService.addStudent("1020", new Students("Santiago", "1020", 33, 0, 0));

            studentService.enrollStudents("Math", "1030");
            
            studentService.showEnrolledStudents("1030");

            studentService.showAllCourses();
        } catch (CourseNotFoundException | StudentNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
