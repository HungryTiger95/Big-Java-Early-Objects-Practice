import java.util.Scanner;

/**
 * E4.8
 * 
 * Write a program that asks the user for the lengths of a rectangle's sides.
 * Then print the area and perimeter of the rectangle and the length of the
 * diagonal.
 * 
 * @author Mayuresh
 *
 */

public class RectangleSides
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please Enter the Length: ");
		int length = in.nextInt();
		
		System.out.print("Please Enter the Width: ");
		int width = in.nextInt();
		
		in.close();
		
		int area, perimeter;
		double diagonal;
		
		area = length * width;
		perimeter = (length * 2) + (width * 2);
		diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
		
		System.out.printf("Area: %3d\n", area);
		System.out.printf("Perimeter: %3d\n", perimeter);
		System.out.printf("Diagonal: %3.2f\n", diagonal);
		
	}
}
