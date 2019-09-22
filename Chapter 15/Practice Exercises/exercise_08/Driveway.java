package exercise_08;

import java.util.Stack;

/**
 * A homeowner rents out parking spaces in a driveway during special events. The driveway
 * is a "last-in, first-out" stack. Of course, when a car owner retrieves a vehicle that wasn't
 * the last one in, the cars blocking it must temporarily move to the street so that the
 * requested vehicle can leave. Write a program that models this behavior, using one stack for
 * the driveway and one stack for the street. Use integers as license plate numbers. Positive
 * numbers add a car, negative numbers remove a car, zero stops the simulation. Print out the
 * stack after each operation is complete.
 * 
 * @author Mayuresh
 * 
 */
public class Driveway
{
	// Instance Variables
	private Stack<Integer> driveway;
	private Stack<Integer> street;
	
	// Constructors
	/**
	 * Constructs a driveway with a driveway and a street
	 */
	public Driveway()
	{
		this.driveway = new Stack<Integer>();
		this.street = new Stack<Integer>();
	}
	
	// Methods
	/**
	 * Adds a car to the driveway
	 * @param n the car to add
	 */
	public void addToDriveway(int n)
	{
		this.driveway.push(n);
	}
	
	/**
	 * Returns the stack object of the driveway
	 * @return the driveway stack
	 */
	public Stack<Integer> getDriveway()
	{
		return this.driveway;
	}
	
	/**
	 * Returns the stack object of the street
	 * @return the street stack
	 */
	public Stack<Integer> getStreet()
	{
		return this.street;
	}
	
	/**
	 * Removes the last car in the driveway
	 * @return the last car
	 */
	public int popFromDriveway()
	{
		return this.driveway.pop();
	}
	
	/**
	 * Removes a given car from the driveway
	 * @param n the car to remove
	 * @return true if the removal was successful, false otherwise
	 */
	public boolean removeFromDriveway(int n)
	{	
		// Search for the integer in the driveway
		int carPos = this.driveway.search(n);
		if(carPos >= 0)
		{
			// Remove n number of cars from the top of the stack and add them to the street stack
			for(int i = 1; i < carPos; i++)
			{
				int tempCar = this.driveway.pop();
				this.street.push(tempCar);
			}
			
			// Pop off the target car
			this.driveway.pop();
			
			// Return the street stack cars to the driveway
			while(!this.street.empty())
			{
				int tempCar = this.street.pop();
				this.driveway.push(tempCar);
			}
			return true;
		}
		else
		{
			return false;
		}
	}
}
