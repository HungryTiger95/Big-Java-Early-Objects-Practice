package exercise_9;

public class Manager extends Employee
{
	// Instance Variables
	private String department;
	
	// Constructors
	/**
	 * Constructs a Manager with a given job department name
	 * @param jobDept the department this manager works in
	 */
	public Manager(String jobDept)
	{
		department = jobDept;
	}
	
	// Methods
	/**
	 * Returns values of the object of class Manager
	 */
	public String toString()
	{
		return super.toString() + "[department=" + getDepartment() + "]";
	}
	
	/**
	 * Gets the name of the department of the manager
	 * @return department
	 */
	public String getDepartment()
	{
		return department;
	}
	
	/**
	 * Sets the job department that this Manager works for
	 * @param jobDept the job department name
	 */
	public void setDepartment(String jobDept)
	{
		department = jobDept;
	}
}
