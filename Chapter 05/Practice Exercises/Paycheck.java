/**
 * Business E5.9
 * 
 * Write a program that reads in the name and salary of an employee. Here the salary will denote an hourly wage,
 * such as 9.25. then ask how many hours the employee worked in the past week. Be sure to accept fractional hours.
 * Compute the pay. Any overtime work (over 40 hours per week) is paid at 150 percent of the regular wage.
 * Print a paycheck for the employee. In your solution, implement a class Paycheck.
 * 
 * @author Mayuresh
 *
 */

public class Paycheck
{
	// Instance Variables
	private String name;
	private double salary;
	private double moneyEarned;
	
	// Constructors
	public Paycheck(String employeeName, double employeeSalary)
	{
		name = employeeName;
		salary = employeeSalary;
	}
	
	// Methods
	public void printPaycheck(double hoursWorked)
	{
		double overtimeHours = 0;
		System.out.println("Employee Name: " + name);
		System.out.println("Hourly Wage: " + salary);
		System.out.println("Hours Worked: " + hoursWorked);
		System.out.println("-----------------------------");
		
		if (hoursWorked > 40.0)
		{
			overtimeHours = hoursWorked - 40.0;
			moneyEarned = (40 * salary) + overtimeHours * (salary * 1.50);
		}
		else
		{
			moneyEarned = hoursWorked * salary;
		}
		
		System.out.println("Paycheck = :" + moneyEarned);
		System.out.println();
	}
}
