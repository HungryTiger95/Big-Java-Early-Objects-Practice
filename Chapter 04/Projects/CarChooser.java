/**
 * P4.1
 * 
 * Write a program that helps a person decide whether to buy a hybrid car. Your programs
 * inputs should be: cost of new car, estimated miles driven per year, estimated gas price,
 * efficiency in miles per gallon, and estimated resale value after 5 years.
 * 
 * Compute the the total cost of owning the car for five years. Obtain realistic
 * prices for a new and used hybrid and a comparable car from the web.
 * @author Mayuresh
 *
 */

public class CarChooser
{
	public static void main(String[] args)
	{
		double newHybrid, newCar, usedHybrid;
		newHybrid = 26790;
		newCar = 22900;
		usedHybrid = 21750;
		
		int milesDriven = 15000;
		double gasPrice = 1.92;
		double hybridMPG = 39.0;
		double carMPG = 35.0;
		
		double cost;
		
		cost = newHybrid + (5 * ((milesDriven / hybridMPG) * gasPrice));
		System.out.printf("Cost of Driving a New Hybrid: %5.2f\n", cost);
		
		cost = 0;
		cost = newCar + (5 * ((milesDriven / carMPG) * gasPrice));
		System.out.printf("Cost of Driving a New Car: %5.2f\n", cost);
		
		cost = 0;
		cost = usedHybrid + (5 * ((milesDriven / hybridMPG) * gasPrice));
		System.out.printf("Cost of Driving a Used Hybrid: %5.2f\n", cost);
		
	}
}
