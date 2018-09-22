package exercise_8;

public class Student extends Person
{
	// Instance Variables
	private String major;
	
	// Constructors
	/**
	 * Constructs a Student object given a major
	 * @param studentMajor the major for this student
	 */
	public Student(String studentMajor)
	{
		major = studentMajor;
	}
	
	// Methods
	/**
	 * Returns a string representation for each object
	 */
	public String toString()
	{
		return getClass().getName() + super.toString() + "[Major=" + getMajor() + "]";
	}
	
	/**
	 * Gets the major of the student
	 * @return major
	 */
	public String getMajor()
	{
		return major;
	}
	
	/**
	 * Sets the major for this student
	 * @param studetnMajor the major for this student
	 */
	public void setMajor(String studetnMajor)
	{
		major = studetnMajor;
	}
}
