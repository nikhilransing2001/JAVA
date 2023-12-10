package generation;

import java.util.Scanner;

public class ClassGrader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's grade (0-10): ");
        int grade = scanner.nextInt();

        if (grade < 0 || grade > 10) {
            System.out.println("Invalid grade! Please enter a grade between 0 and 10.");
        } else {
            String result = calculateGrade(grade);
            System.out.println("Result: " + result);
        }

        scanner.close();
    }

    private static String calculateGrade(int grade) {
        if (grade <= 3) {
            return "Failed";
        } else if (grade <= 5) {
            return "Insufficient";
        } else if (grade <= 8) {
            return "Good";
        } else if (grade == 10) {
            return "Excellent";
        } else {
            return "Invalid grade! Please enter a grade between 0 and 10.";
        }
    }
}

