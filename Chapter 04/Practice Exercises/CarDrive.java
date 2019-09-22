import java.util.Scanner;

/**
 * E4.10
 * 
 * Write a program that asks the user to input:
 * 
 * 		The number of gallons of gas in the tank
 * 		The fuel efficiency in miles per gallon
 * 		The price of gas per gallon
 * 
 * Then print the cost per 100 miles and how far the car can go with gas the in the tank.
 * 
 * @author Mayuresh
 *
 */

public class CarDrive
{
	public static void main(String[] args)
	{
		double gallonsInTank, pricePerGallon, costOfDrive, gallonsUsed, gallonsLeft,
		milesLeft, milesToDrive, fuelEfficiency;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Fuel Efficiency of Car: ");
		fuelEfficiency = in.nextDouble();
		
		System.out.print("Gallons in the Tank: ");
		gallonsInTank = in.nextDouble();
		
		System.out.print("Price Of Gas per Gallon: ");
		pricePerGallon = in.nextDouble();
		
		in.close();
		
		milesToDrive = 100.0;
		gallonsUsed = milesToDrive / fuelEfficiency;
		gallonsLeft = gallonsInTank - gallonsUsed;
		costOfDrive = gallonsUsed * pricePerGallon;
		milesLeft = gallonsLeft * fuelEfficiency;
		
		System.out.printf("Cost to Drive 100 Miles: %5.2f\n", costOfDrive);
		System.out.printf("Miles Left in the Tank: %5.2f\n", milesLeft);
	}
}
