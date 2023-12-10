package generation;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;
        int currentTerm;
        
        if (n >= 1) {
            System.out.println("(0)" + firstTerm);
        }
        if (n >= 2) {
            System.out.println("(1)" + secondTerm);
        }

        int i = 2;
        do {
            currentTerm = firstTerm + secondTerm;
            System.out.println("(" + i + ")" + currentTerm);

            firstTerm = secondTerm;
            secondTerm = currentTerm;

            i++;
        } while (i <= n);

        scanner.close();
    }
}

