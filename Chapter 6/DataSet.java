/**
 * P6.1
 * 
 * Mean and Standard Deviation.
 * Write a program that reads a set of floating-point data values. Choose an appropriate
 * mechanism for prompting for the end of the data set. When all values have been read,
 * print out the count of the values, the average, and the standard deviation. The average
 * of a data set {x1,..., xn} is xbar = (sum xi) / n, where (sum xi) = x1 + ... + xn is the
 * sum of the input values. Since we haven't covered arrays, we will use a numerically less
 * stable formula. 
 * 
 * Use the formula:
 * 
 * 		s = sqrt((((sum (xi)^2)) - (((1/n)*(sum (xi))^2))) / n - 1)
 * 
 * You can compute this quantity by keeping track of the count, the sum, the sum of squares as
 * you process the input values. Your program should use a class DataSet. That class should have
 * a method public void add(double value) and methods getAverage and getStandardDeviation.
 * 
 * @author Mayuresh
 *
 */
public class DataSet
{
	// Instance Variables
	private double sum;
	private double average;
	private double valCount;
	private double sumOfSquares;
	
	// Constructors
	/**
	 * Constructs a DataSet object with initialized values
	 */
	public DataSet()
	{
		sum = 0;
		average = 0;
		valCount = 0;
		sumOfSquares = 0;
	}
	// Methods
	/**
	 * Adds a value to the data set
	 * @param value value
	 */
	public void add(double value)
	{
		this.sum = this.sum + value;
		this.sumOfSquares = sumOfSquares + Math.pow(value,2);
		this.valCount++;
		
		this.average = sum / valCount;
	}
	
	/**
	 * Gets the average of the data set values
	 * @return average
	 */
	public double getAverage()
	{
		return average;
	}
	
	/**
	 * Gets the standard deviation of the data set values
	 * @return standard deviation
	 */
	public double getStandardDeviation()
	{
		double temp1, temp2, temp3, temp4;
		
		temp1 = sumOfSquares;
		temp2 = 1 / valCount;
		temp3 = Math.pow(sum, 2);
		temp4 = valCount - 1;
		
		return Math.sqrt((temp1 - (temp2 * temp3)) / temp4);
	}
	
	/**
	 * Gets the sum of the data set values
	 * @return sum
	 */
	public double getSum()
	{
		return sum;
	}
	
	/**
	 * Gets the sum of squares of the data set values
	 * @return sumOfSquares
	 */
	public double getSumOfSquares()
	{
		return sumOfSquares;
	}
	
	/**
	 * Gets the number of values in the data set
	 * @return valCount
	 */
	public double getValCount()
	{
		return valCount;
	}
	
}
