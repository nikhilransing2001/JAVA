package generation.finalproject;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student extends Person implements Evaluation {
   private double average;
   private final List<Course> courses = new ArrayList();
   private final Map<String, Course> approvedCourses = new HashMap();

   public Student(String id, String name, String email, Date birthDate) {
      super(id, name, email, birthDate);
   }

   public void enrollToCourse(Course course) {
	   this.courses.add(course);
   }

   public void registerApprovedCourse(Course course) {
      this.approvedCourses.put(course.getCode(), course);
   }

   public boolean isCourseApproved(String courseCode) {
	   return approvedCourses.containsKey(courseCode);
   }

   public List<Course> findPassedCourses(Course course) {
      return null;
   }

   public boolean isAttendingCourse(String courseCode) {
	  return courses.stream().anyMatch(course -> course.getCode().equals(courseCode));
   }
   public void updateApprovedCourses(List<Course> passedCourses) {
       for (Course course : passedCourses) {
           this.approvedCourses.put(course.getCode(), course);
       }
   }
   public List<Course> getCourses() {
       return this.courses;
   }
   public void updateAverage(double grade) {
       // Implement the logic to update the average based on the new grade
       // You may want to maintain a list of grades and recalculate the average
       // For simplicity, I'll assume you have a method to add a grade to the student
       addGrade(grade);
       recalculateAverage();
   }

   private void recalculateAverage() {
	// TODO Auto-generated method stub
	
   }

   private void addGrade(double grade) {
	// TODO Auto-generated method stub
	
  }

public double getAverage() {
      return this.average;
   }

   @Override
   public List<Course> getApprovedCourses() {
       return new ArrayList<>(approvedCourses.values());
   }

   public String toString() {
      return "Student {" + super.toString() + "}";
   }
   
}
