package generation;

import java.util.Scanner;

class DiscountCalculator {
    static double calculateTicketPrice(int age) {
        if (age < 5) {
            return 7 * 0.4; // 60% discount for age below 5
        } else if (age >= 60) {
            return 7 * 0.45; // 55% discount for age over 60
        } else {
            return 7.0; // Normal ticket price for other ages
        }
    }
}

public class MovieDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Calculate ticket price based on age
        double ticketPrice = DiscountCalculator.calculateTicketPrice(age);

        // Display the result
        System.out.println("Ticket Price: " + ticketPrice + " Euros");

        scanner.close();
    }
}



