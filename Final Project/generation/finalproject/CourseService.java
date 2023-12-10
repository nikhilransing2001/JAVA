package generation.finalproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CourseService {
   private final Map<String, Course> courses = new HashMap();
   private final Map<String, List<Student>> enrolledStudents = new HashMap();

   public CourseService() {
      Module module = new Module("INTRO-CS", "Introduction to Computer Science", "Introductory module for the generation technical programs");
      this.registerCourse(new Course("INTRO-CS-1", "Introduction to Computer Science", 9, module));
      this.registerCourse(new Course("INTRO-CS-2", "Introduction to Algorithms", 9, module));
      this.registerCourse(new Course("INTRO-CS-3", "Algorithm Design and Problem Solving - Introduction ", 9, module));
      this.registerCourse(new Course("INTRO-CS-4", "Algorithm Design and Problem Solving - Advanced", 9, module));
      this.registerCourse(new Course("INTRO-CS-5", "Terminal Fundamentals", 9, module));
      this.registerCourse(new Course("INTRO-CS-6", "Source Control Using Git and Github", 9, module));
      this.registerCourse(new Course("INTRO-CS-7", "Agile Software Development with SCRUM", 9, module));
      Module moduleWebFundamentals = new Module("INTRO-WEB", "Web Development Fundamentals", "Introduction to fundamentals of web development");
      this.registerCourse(new Course("INTRO-WEB-1", "Introduction to Web Applications", 9, moduleWebFundamentals));
      this.registerCourse(new Course("INTRO-WEB-2", "Introduction to HTML", 9, moduleWebFundamentals));
      this.registerCourse(new Course("INTRO-WEB-3", "Introduction to CSS", 9, moduleWebFundamentals));
      this.registerCourse(new Course("INTRO-WEB-4", "Advanced HTML", 9, moduleWebFundamentals));
      this.registerCourse(new Course("INTRO-WEB-5", "Advanced CSS", 9, moduleWebFundamentals));
      this.registerCourse(new Course("INTRO-WEB-6", "Introduction to Bootstrap Framework", 9, moduleWebFundamentals));
      this.registerCourse(new Course("INTRO-WEB-7", "Introduction to JavaScript for Web Development", 9, moduleWebFundamentals));
   }

   public void registerCourse(Course course) {
      this.courses.put(course.getCode(), course);
   }

   public Course getCourse(String code) {
      return this.courses.containsKey(code) ? (Course)this.courses.get(code) : null;
   }

   public void enrollStudent(String courseId, Student student) {
      if (!this.enrolledStudents.containsKey(courseId)) {
         this.enrolledStudents.put(courseId, new ArrayList());
      }

      ((List)this.enrolledStudents.get(courseId)).add(student);
   }
   public List<Student> getEnrolledStudents(String courseId) {
       List<Student> enrolledStudents = new ArrayList<>();

       if (this.enrolledStudents.containsKey(courseId)) {
           enrolledStudents.addAll(this.enrolledStudents.get(courseId));
       }

       return enrolledStudents;
   }
   public void showEnrolledStudents(String courseId) {
      if (this.enrolledStudents.containsKey(courseId)) {
         List<Student> students = (List)this.enrolledStudents.get(courseId);
         Iterator var3 = students.iterator();

         while(var3.hasNext()) {
            Student student = (Student)var3.next();
            System.out.println(student);
         }
      }

   }

   public void showSummary() {
      System.out.println("Available Courses:");
      Iterator var1 = this.courses.keySet().iterator();

      String key;
      while(var1.hasNext()) {
         key = (String)var1.next();
         Course course = (Course)this.courses.get(key);
         System.out.println(course);
      }

      System.out.println("Enrolled Students");
      var1 = this.enrolledStudents.keySet().iterator();

      while(var1.hasNext()) {
         key = (String)var1.next();
         List<Student> students = (List)this.enrolledStudents.get(key);
         System.out.println("Students on Course " + key + ": ");
         Iterator var4 = students.iterator();

         while(var4.hasNext()) {
            Student student = (Student)var4.next();
            System.out.println(student);
         }
      }

   }
}

