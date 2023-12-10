package generation;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        printNameLength(firstName);
        printNameCharacters(firstName);
        printFullName(firstName, lastName);

        scanner.close();
    }

    private static void printNameLength(String name) {
        System.out.println("Length of the name: " + name.length());
    }

    private static void printNameCharacters(String name) {
        System.out.println("Characters in the name:");
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }

    private static void printFullName(String firstName, String lastName) {
        System.out.println("Full Name: " + firstName + " " + lastName);
    }
}

