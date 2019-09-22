package special_topic_01.extra_practice;

public class Undergraduate extends Student
{
	private int year;
	
	public Undergraduate(String name, String major, int year)
	{
		super(name, major);
		this.year = year;
	}
	
	public int getYear()
	{
		return this.year;
	}
	
	public void setYear(int year)
	{
		this.year = year;
	}
	
	public String toString()
	{
		return super.toString() + "[year=" + this.year + "]";
	}
}
