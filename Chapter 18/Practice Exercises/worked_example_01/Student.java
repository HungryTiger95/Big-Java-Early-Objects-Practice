package worked_example_01;

public class Student extends Person
{
	private String major;
	
	public Student(String name, String major)
	{
		super(name);
		this.major = major;
	}
	
	public String toString()
	{
		return super.toString() + "[major=" + this.major + "]";
	}
}
