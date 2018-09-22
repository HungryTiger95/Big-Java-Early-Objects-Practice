package exercise_8;

public class Instructor extends Person
{
	// Instance Variables
	private double salary;
	
	// Constructors
	/**
	 * Constructs an Instructor object with a given yearly salary
	 * @param yearlySalary the yearly salary
	 */
	public Instructor(double yearlySalary)
	{
		salary = yearlySalary;
	}
	
	// Methods
	/**
	 * Returns a string representation for each object
	 */
	public String toString()
	{
		return getClass().getName() + super.toString() + "[Salary=" + getSalary() + "]";
	}
	
	/**
	 * Gets the salary of the instructor
	 * @return salary
	 */
	public double getSalary()
	{
		return salary;
	}
	
	/**
	 * Sets the yearly salary for this instructor
	 * @param yearlySalary the yearly salary
	 */
	public void setSalary(double yearlySalary)
	{
		salary = yearlySalary;
	}
}
