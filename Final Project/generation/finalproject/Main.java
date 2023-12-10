package generation.finalproject;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) throws ParseException {
      StudentService studentService = new StudentService();
      CourseService courseService = new CourseService();
      Scanner scanner = new Scanner(System.in);
      boolean var4 = false;

      int option;
      do {
         PrinterHelper.showMainMenu();
         option = scanner.nextInt();
         switch(option) {
         case 1:
            registerStudent(studentService, scanner);
            break;
         case 2:
            findStudent(studentService, scanner);
            break;
         case 3:
            gradeStudent(studentService, scanner);
            break;
         case 4:
            enrollStudentToCourse(studentService, courseService, scanner);
            break;
         case 5:
            showStudentsSummary(studentService, scanner);
            break;
         case 6:
            showCoursesSummary(courseService, scanner);
         }
      } while(option != 7);

   }

   private static void enrollStudentToCourse(StudentService studentService, CourseService courseService, Scanner scanner) {
      System.out.println("Insert student ID");
      String studentId = scanner.next();
      Student student = studentService.findStudent(studentId);
      if (student == null) {
         System.out.println("Invalid Student ID");
      } else {
         System.out.println(student);
         System.out.println("Insert course ID");
         String courseId = scanner.next();
         Course course = courseService.getCourse(courseId);
         if (course == null) {
            System.out.println("Invalid Course ID");
         } else {
            System.out.println(course);
            courseService.enrollStudent(courseId, student);
            studentService.enrollToCourse(studentId, course);
            System.out.println("Student with ID: " + studentId + " enrolled successfully to " + courseId);
         }
      }
   }

   private static void showCoursesSummary(CourseService courseService, Scanner scanner) {
      courseService.showSummary();
   }

   private static void showStudentsSummary(StudentService studentService, Scanner scanner) {
      studentService.showSummary();
   }

   private static void gradeStudent(StudentService studentService, Scanner scanner) {
	    System.out.println("Enter student ID for grading:");
	    String studentId = scanner.next();
	    
	    // Retrieve the student object from the studentService
	    Student student = studentService.findStudent(studentId);

	    if (student != null) {
	        System.out.println("Enter student's grade:");
	        double grade = getStudentGradeFromUserInput(scanner);

	        // Update the student's average and approved courses based on the grading logic
	        student.updateAverage(grade);
	        List<Course> passedCourses = determinePassedCourses(student);
	        student.updateApprovedCourses(passedCourses);

	        System.out.println("Student graded successfully!");
	    } else {
	        System.out.println("Student with ID " + studentId + " not found.");
	    }
	}
   private static double getStudentGradeFromUserInput(Scanner scanner) {
	    double grade = -1.0;  // Default value, indicating an invalid grade

	    // Continue prompting for a valid grade until a valid input is provided
	    while (grade < 0 || grade > 100) {
	        System.out.println("Enter a valid grade (0-100):");

	        // Validate that the input is a double
	        if (scanner.hasNextDouble()) {
	            grade = scanner.nextDouble();

	            // Validate that the grade is within the valid range
	            if (grade < 0 || grade > 100) {
	                System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
	            }
	        } else {
	            // Consume the invalid input to avoid an infinite loop
	            System.out.println("Invalid input. Please enter a valid numeric grade.");
	            scanner.next();
	        }
	    }

	    return grade;
	}

private static List<Course> determinePassedCourses(Student student) {
    // Implement logic to determine the courses that the student has passed
    // For example, you might compare the grade to a passing threshold
    // and return a list of courses that the student passed.
    // This can vary based on your grading system and requirements.

    // For simplicity, let's assume a passing grade threshold of 60
    double passingThreshold = 60;
    List<Course> passedCourses = new ArrayList<>();

    for (Course course : student.getCourses()) {
        if (student.isCourseApproved(course.getCode())) {
            passedCourses.add(course);
        }
    }

    return passedCourses;
}

   private static void findStudent(StudentService studentService, Scanner scanner) {
      System.out.println("Enter student ID: ");
      String studentId = scanner.next();
      Student student = studentService.findStudent(studentId);
      if (student != null) {
         System.out.println("Student Found: ");
         System.out.println(student);
      } else {
         System.out.println("Student with Id = " + studentId + " not found");
      }

   }

   private static void registerStudent(StudentService studentService, Scanner scanner) throws ParseException {
      Student student = PrinterHelper.createStudentMenu(scanner);
      studentService.subscribeStudent(student);
   }
}

