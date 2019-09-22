import java.util.Scanner;

public class GradeTester
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		String grade;
		double gpaGrade;
		
		System.out.print("Please Enter a Letter Grade: ");
		grade = in.next();
		
		in.close();
		
		Grade gpa = new Grade(grade);
		gpaGrade = gpa.getNumericGrade();
		
		System.out.println("Your Numerical Grade: " + gpaGrade);
	}
}
