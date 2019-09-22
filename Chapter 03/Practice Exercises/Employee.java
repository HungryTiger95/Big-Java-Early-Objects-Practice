/**
 * E3.8
 * 
 * Implement a class Employee. An employee has a name (a string) and a  salary (a double).
 * Provide a constructor with two arguments (String employeeName, double currentSalary)
 * and methods getName(), getSalary(), and raiseSalary(double byPercent).
 * 
 * Use these methods in an EmployeeTester class.
 * 
 * @author Mayuresh
 *
 */

public class Employee
{
	private String name;
	private double salary;
	
	// Constructors
	/**
	 * Constructs an object employee with a name and a salary
	 * @param employeeName name of employee
	 * @param currentSalary salary of employee
	 */
	public Employee(String employeeName, double currentSalary)
	{
		name = employeeName;
		salary = currentSalary;
	}
	
	// Methods
	/**
	 * Gets the name of employee
	 * @return name of employee
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Gets the salary of employee
	 * @return salary of employee
	 */
	public double getSalary()
	{
		return salary;
	}
	
	/**
	 * Raises salary by a certain percentage
	 * @param byPercent percent salary raise
	 */
	public void raiseSalary(double byPercent)
	{
		double raise = byPercent / 100.0;
		salary = (salary * raise) + salary;
	}
}
