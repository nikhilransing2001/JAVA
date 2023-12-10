package generation;

import java.util.ArrayList;
import java.util.List;

import generation.oop.Course;

public class Students {
 public static final int grade = 0;
public static final String firstName = null;
private String name;
 private String id;
 private int age;
 private List<Course> courseList = new ArrayList<>();
public int lastName;

 public Students(String name, String id, int age, int i, int j) {
     this.name = name;
     this.id = id;
     this.age = age;
 }

 // Getters and setters for encapsulationz

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public String getId() {
     return id;
 }

 public void setId(String id) {
     this.id = id;
 }

 public int getAge() {
     return age;
 }

 public void setAge(int age) {
     this.age = age;
 }

 public List<Course> getCourseList() {
     return courseList;
 }
}

