/**
 * P3.5
 * 
 * Write a class Battery that models a rechargeable battery. A battery has a constructor
 * Battery(double capacity) where capacity is a value measured in milliampere hours. A typical
 * AA batter has a capacity of 2000 - 3000 mAh. The method drain(double amount) drains the capacity
 * of the battery by the given amount. The method charge() charges the battery to its original capacity.
 * The method getRemainingCapacity() gets the remaining capacity of the battery.
 * 
 * @author Mayuresh
 *
 */

public class Battery
{
	// Instance Variables
	private double currentCapacity;
	private double batteryCapacity;
	
	// Constructors
	/**
	 * Constructs a battery object with a given capacity
	 * @param capacity
	 */
	public Battery(double capacity)
	{
		batteryCapacity = capacity;
		currentCapacity = capacity;
	}
	
	// Methods
	/**
	 * Drains the object battery by given amount
	 * @param amount milliampere hours to drain 
	 */
	public void drain(double amount)
	{
		currentCapacity = currentCapacity - amount;
	}
	
	/**
	 * Recharges the battery to full capacity
	 */
	public void charge()
	{
		currentCapacity = batteryCapacity;
	}
	
	/**
	 * Gets the battery capacity
	 * @return battery capacity
	 */
	public double getRemainingCapacity()
	{
		return currentCapacity;
	}
}
