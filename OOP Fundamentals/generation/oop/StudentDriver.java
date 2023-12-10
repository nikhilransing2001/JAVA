package generation.oop;

public class StudentDriver {
    public static void main(String[] args) {
        // Creating students
        Student student1 = new Student("John", "Doe", 1, 75, 1);
        Student student2 = new Student("Jane", "Smith", 2, 85, 1);
        Student student3 = new Student("Bob", "Johnson", 3, 55, 1);

        // Creating a course
        Course javaCourse = new Course("Java Programming", "Prof. Smith", 2023);

        // Enrolling students
        javaCourse.enroll(student1);
        javaCourse.enroll(student2);
        javaCourse.enroll(student3);

        // Testing basic methods
        System.out.println("Number of students: " + javaCourse.countStudents());
        System.out.println("Best grade: " + javaCourse.bestGrade());

        // Challenge: Enroll with an array of students
        Student[] moreStudents = {
                new Student("Alice", "Jones", 4, 90, 1),
                new Student("Charlie", "Brown", 5, 70, 1)
        };
        javaCourse.enroll(moreStudents);

        // Challenge: Print ranking
        javaCourse.printRanking();

        // Challenge: Show if each student is above or below the course average
        javaCourse.showAboveBelowAverage();
    }
}