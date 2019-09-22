import java.util.Scanner;

/**
 * E4.6
 * 
 * Write a program that prompts the user for a measurement in meters and then
 * converts it to miles, feet, and inches.
 * 
 * @author Mayuresh
 *
 */

public class Conversion
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a value in meters: ");
		double meters = in.nextDouble();
		in.close();
		
		double miles, feet, inches;
		
		miles = meters * .000621371;
		feet = meters * 3.28084;
		inches = meters * 39.3701;
		
		System.out.printf("In Miles: %5.2f\n", miles);
		System.out.printf("In Feet: %5.2f\n", feet);
		System.out.printf("In Inches: %5.2f\n", inches);
	}
}
