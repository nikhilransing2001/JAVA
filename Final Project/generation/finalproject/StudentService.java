package generation.finalproject;

import java.util.HashMap;
import java.util.Map;

public class StudentService {
   private final Map<String, Student> students = new HashMap();

   public void subscribeStudent(Student student) {
      this.students.put(student.getId(), student);
   }

   public Student findStudent(String studentId) {
      return this.students.containsKey(studentId) ? (Student)this.students.get(studentId) : null;
   }

   public boolean isSubscribed(String studentId) {
	   return students.containsKey(studentId);
   }

   public void showSummary() {
	   System.out.println("Students Summary:");
	    for (Student student : students.values()) {
	        System.out.println(student);
	    }
   }

   public void enrollToCourse(String studentId, Course course) {
      if (this.students.containsKey(studentId)) {
         ((Student)this.students.get(studentId)).enrollToCourse(course);
      }

   }
}

