package special_topic_01.extra_practice;

public class Faculty extends Person
{
	private String department;
	
	public Faculty(String name, String department)
	{
		super(name);
		this.department = department;
	}
	
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
