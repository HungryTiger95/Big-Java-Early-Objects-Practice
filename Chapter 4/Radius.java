import java.util.Scanner;

/**
 * E4.7
 * 
 * Write a program that prompts the user for a radius and then prints
 * the area and circumference of a circle with that radius.
 * Also print the volume and surface area of a sphere with that radius.
 * 
 * @author Mayuresh
 *
 */

public class Radius
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter an integer radius: ");
		int radius = in.nextInt();
		in.close();
		
		double area, circumference, surfaceArea, volume;
		
		area = Math.PI * Math.pow(radius, 2);
		circumference = 2 * Math.PI * radius;
		surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
		volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
		
		System.out.printf("Area of Circle: %.3f\n", area);
		System.out.printf("Circumference of Cirlce: %.3f\n", circumference);
		System.out.printf("Surface Area of Sphere: %.3f\n", surfaceArea);
		System.out.printf("Volume of Sphere: %.3f\n", volume);
	}
}
