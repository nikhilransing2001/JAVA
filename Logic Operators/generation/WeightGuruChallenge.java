package generation;

import java.util.Scanner;

public class WeightGuruChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        // Calculate BMI
        double bmi = calculateBMI(weight, height);

        // Provide feedback on body-to-weight ratio
        String feedback = analyzeBMI(bmi);

        // Display the result
        System.out.println("Your BMI is: " + bmi);
        System.out.println("Feedback: " + feedback);

        scanner.close();
    }

    private static double calculateBMI(double weight, double height) {
        // BMI calculation: weight (kg) / (height (m) * height (m))
        return weight / (height * height);
    }

    private static String analyzeBMI(double bmi) {
        if (bmi < 18.5) {
            return "Underweight - Your body weight is too low for your height.";
        } else if (bmi < 25) {
            return "Normal Weight - Your body weight is within the healthy range.";
        } else if (bmi < 30) {
            return "Overweight - Your body weight is higher than the healthy range.";
        } else {
            return "Obese - Your body weight is significantly higher than the healthy range.";
        }
    }
}

