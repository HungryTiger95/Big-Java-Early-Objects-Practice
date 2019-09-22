package exercise_9;

/**
 * Make a class Employee with a name and salary. Make a class Manager inherit from
 * Employee. Add an instance variable, named department, of type String. Supply a method
 * toString that prints the manager's name, department, and salary. Make a class
 * Executive inherit from Manager. Supply appropriate toString methods for all classes.
 * Supply a test program that tests classes and methods.
 * 
 * @author Mayuresh
 *
 */
public class Employee
{
	// Instance Variables
	private String name;
	private double salary;
	
	// Constructors
	/**
	 * Constructs an employee without a name or a salary
	 */
	public Employee()
	{
		name = "";
		salary = 0;
	}
	
	// Methods
	/**
	 * Returns the contents of an object of this class in string format
	 */
	public String toString()
	{
		return getClass().getName() + "[Name=" + getName() + "][Salary=" + getSalary() + "]";
	}
	
	/**
	 * Gets the name of the employee
	 * @return name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Sets the employee's name
	 * @param employeeName name of employee
	 */
	public void setName(String employeeName)
	{
		name = employeeName;
	}
	
	/**
	 * Gets the salary of the employee
	 * @return salary
	 */
	public double getSalary()
	{
		return salary;
	}
	
	/**
	 * Sets the employee's salary
	 * @param employeeSalary salary of employee
	 */
	public void setSalary(double employeeSalary)
	{
		salary = employeeSalary;
	}
}
