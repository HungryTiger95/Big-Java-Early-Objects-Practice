
/**
 * E6.5
 * 
 * Write a program that reads a set of floating-point values. Ask the user to enter the values
 * (prompting only a single time for the values), then print
 * 		1) the average
 * 		2) the smallest
 * 		3) the largest
 * 		4) the range
 * 
 * Use a class DataSet. And have methods add, getAverage, getSmallest, getLargest, and getRange
 * 
 * @author Mayuresh
 *
 */

public class DataSet
{
	// Instance Variables
	private double smallest, largest, dataCount, dataSum;
	
	// Constructors
	/**
	 * Constructs a DataSet object
	 */
	public DataSet()
	{
		this.dataSum = 0;
		this.dataCount = 0;
		this.largest = Double.MIN_VALUE;
		this.smallest = Double.MAX_VALUE;
	}
	// Methods
	/**
	 * Adds a value to the data set
	 * @param dataVal value
	 */
	public void add(double dataVal)
	{
		this.dataSum = this.dataSum + dataVal;
		this.dataCount++;
		this.smallest = Math.min(this.smallest, dataVal);
		this.largest = Math.max(this.largest, dataVal);
	}
	
	/**
	 * Gets the Average of all entered values
	 * @return average
	 */
	public double getAverage()
	{
		return (this.dataSum / this.dataCount);
	}
	
	/**
	 * Gets the largest of all values added
	 * @return largest
	 */
	public double getLargest()
	{
		return this.largest;
	}
	
	/**
	 * Gets the smallest of all values added
	 * @return smallest
	 */
	public double getSmallest()
	{
		return this.smallest;
	}
	
	/**
	 * Gets the range of all values added
	 * @return range
	 */
	public double getRange()
	{
		return (this.largest - this.smallest);
	}
}
