package special_topic_01.extra_practice;

public class Student extends Person
{
	private String major;
	
	public Student(String name, String major)
	{
		super(name);
		this.major = major;
	}
	
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
