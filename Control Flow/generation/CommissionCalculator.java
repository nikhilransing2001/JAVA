package generation;

import java.util.Scanner;

public class CommissionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the sales figure: $");
        double salesFigure = scanner.nextDouble();

        // Calculate commission based on the sales range
        double commission = calculateCommission(salesFigure);

        // Display the result
        if (commission >= 0) {
            System.out.println("Commission: " + commission + "%");
        } else {
            System.out.println("Commission: N/A (below $1000)");
        }

        scanner.close();
    }

    private static double calculateCommission(double salesFigure) {
        if (salesFigure > 10000) {
            return 30.0;
        } else if (salesFigure >= 5001 && salesFigure <= 9999) {
            return 20.0;
        } else if (salesFigure >= 1001 && salesFigure <= 4999) {
            return 10.0;
        } else {
            return -1.0; // Represents N/A (below $1000)
        }
    }
}
