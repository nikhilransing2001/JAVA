package generation;

import java.util.Scanner;

public class MyFirstVariableNaming{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        System.out.print("Enter your age: ");
        int userAge = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your gender: ");
        String userGender = scanner.nextLine();

        System.out.print("Enter your job preference: ");
        String jobPreference = scanner.nextLine();

        System.out.print("Enter your nationality: ");
        String nationality = scanner.nextLine();

        System.out.print("Enter your blood type: ");
        String bloodType = scanner.nextLine();

        int birthYear = java.time.Year.now().getValue() - userAge;

        System.out.println("\nUser Profile:");
        System.out.println("Name: " + userName);
        System.out.println("Age: " + userAge);
        System.out.println("Gender: " + userGender);
        System.out.println("Job Preference: " + jobPreference);
        System.out.println("Nationality: " + nationality);
        System.out.println("Blood Type: " + bloodType);
        System.out.println("Year of Birth: " + birthYear);
    }
}
