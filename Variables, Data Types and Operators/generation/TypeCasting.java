package generation;
import java.util.Scanner;
public class TypeCasting 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the diameter of the circle: ");
        int diameter = scanner.nextInt();
  
        double radius = diameter / 2.0;
        double area = Math.PI * Math.pow(radius, 2);
        double perimeter = 2 * Math.PI * radius;

        System.out.println("\nResults with Widening Casting (integer to double):");
        System.out.println("Area of the circle: " + area);
        System.out.println("Perimeter of the circle: " + perimeter);
	}
}
