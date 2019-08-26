package exercise_15;

public class Undergraduate extends Student
{
	// Instance Variables
	private int year;
	
	// Constructors
	public Undergraduate(String name, String major, int year)
	{
		super(name, major);
		this.year = year;
	}
	
	// Methods
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
