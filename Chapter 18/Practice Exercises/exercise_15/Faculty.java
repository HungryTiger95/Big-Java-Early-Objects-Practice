package exercise_15;

public class Faculty extends Person
{
	// Instance Variables
	private String department;
	
	// Constructors
	public Faculty(String name, String department)
	{
		super(name);
		this.department = department;
	}
	
	// Methods
	public String getDepartment()
	{
		return this.department;
	}
	
	public void setDepartment(String department)
	{
		this.department = department;
	}
	
	public String toString()
	{
		return super.toString() + "[department=" + this.department + "]";
	}
}
