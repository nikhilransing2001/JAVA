package generation;

import java.util.Scanner;

public class ForLoop 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Letters of the name:");

        for (int i = 0; i < name.length(); i++) 
        {
            char letter = name.charAt(i);
            System.out.println(letter);
        }
    }
}