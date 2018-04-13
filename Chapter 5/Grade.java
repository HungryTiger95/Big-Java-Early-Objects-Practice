/**
 * E5.15
 * 
 * Write a program that translates a letter grade into a number grade. Letter grades are A, B, C, D, and F, possible followed by + or -.
 * Their numeric values are 4, 3, 2, 1, and 0. There is no F+ or F-. A + increases the numeric value by 0.3, a - decreases it by 0.3.
 * However, an A+ has value 4.0.
 *
 * @author Mayuresh
 *
 */

public class Grade
{
	// Instance Variables
	private String grade;
	private double numVal;
	
	// Constructors
	public Grade (String grade)
	{
		this.grade = grade;
	}
	
	// Methods
	public double getNumericGrade()
	{
		if (grade.equals("A") || grade.equals("A+") || grade.equals("A-"))
		{
			numVal = 4.0;
		}
		else if (grade.equals("B+"))
		{
			numVal = 3.3;
		}
		else if (grade.equals("B"))
		{
			numVal = 3.0;
		}
		else if (grade.equals("B-"))
		{
			numVal = 2.7;
		}
		else if (grade.equals("C+"))
		{
			numVal = 2.3;
		}
		else if (grade.equals("C"))
		{
			numVal = 2.0;
		}
		else if (grade.equals("C-"))
		{
			numVal = 1.7;
		}
		else if (grade.equals("D+"))
		{
			numVal = 1.3;
		}
		else if (grade.equals("D"))
		{
			numVal = 1.0;
		}
		else if (grade.equals("D-"))
		{
			numVal = 0.7;
		}
		else
		{
			numVal = 0;
		}
		
		return numVal;
	}
	
}
