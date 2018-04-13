/**
 * E3.9
 * 
 * Implement a class Car with the following properties:
 * 	A car has a certain fuel efficiency (mpg) and a certain amount of fuel
 * 	in the gas tank. The efficiency is specified in the constructor and the initial
 * 	fuel level is 0. Supply a method drive that simulates driving the car for a certain
 * 	distance, reducing the amount of gasoline in the fuel tank. Also supply methods getGasInTank,
 * 	returning the current amount of gasoline in thefuel tank and addGas, to add gasoline
 * 	to the fuel tank.
 * 
 * @author Mayuresh
 *
 */

public class Car
{
	int mpg;
	double fuel;
	
	// Constructors
	public Car(int mpg)
	{
		this.mpg = mpg;
		fuel = 0;
	}
	
	// Methods
	public void addGas(double gallons)
	{
		fuel = fuel + gallons;
	}
	
	public double getGasInTank()
	{
		return fuel;
	}
	
	public void drive(int miles)
	{
		double gallonsUsed = miles / mpg;
		fuel = fuel - gallonsUsed;
	}
}
