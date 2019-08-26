package exercise_17;

public class Student extends Person
{
	// Instance Variables
	private String major;
	
	// Constructors
	public Student(String name, String major)
	{
		super(name);
		this.major = major;
	}
	
	// Methods
	public String getMajor()
	{
		return this.major;
	}
	
	public void setMajor(String major)
	{
		this.major = major;
	}
	
	public String toString()
	{
		return super.toString() + "[major=" + this.major + "]";
	}
}
