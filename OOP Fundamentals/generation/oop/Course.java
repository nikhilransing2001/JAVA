package generation.oop;

import java.util.ArrayList;
import java.util.List;

public class Course {
    String courseName;
    String professorName;
    int year;
    List<Student> enrolledStudents = new ArrayList<>();

    public Course() {
    }

    public Course(String courseName, String professorName, int year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
    }

    public void enroll(Student student) {
        enrolledStudents.add(student);
    }

    public void unEnroll(Student student) {
        enrolledStudents.remove(student);
    }

    public int countStudents() {
        return enrolledStudents.size();
    }

    public int bestGrade() {
        int maxGrade = 0;
        for (Student student : enrolledStudents) {
            maxGrade = Math.max(maxGrade, student.grade);
        }
        return maxGrade;
    }

    public void enroll(Student[] students) {
        for (Student student : students) {
            enroll(student);
        }
    }

    public double averageGrade() {
        if (enrolledStudents.isEmpty()) {
            return 0;
        }

        int totalGrade = 0;
        for (Student student : enrolledStudents) {
            totalGrade += student.grade;
        }

        return (double) totalGrade / enrolledStudents.size();
    }

    public void printRanking() {
        enrolledStudents.sort((s1, s2) -> Integer.compare(s2.grade, s1.grade));

        System.out.println("Ranking:");
        for (int i = 0; i < enrolledStudents.size(); i++) {
            Student student = enrolledStudents.get(i);
            System.out.println((i + 1) + ". " + student.firstName + " " + student.lastName + ": " + student.grade);
        }
    }

    public void showAboveBelowAverage() {
        double average = averageGrade();

        System.out.println("Above/Below Average:");
        for (Student student : enrolledStudents) {
            if (student.grade > average) {
                System.out.println(student.firstName + " " + student.lastName + ": Above Average");
            } else {
                System.out.println(student.firstName + " " + student.lastName + ": Below Average");
            }
        }
    }
}
