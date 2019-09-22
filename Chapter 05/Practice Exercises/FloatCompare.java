
/**
 * E5.21
 * 
 * Write a program that reads in two floating-point numbers and test whether they are
 * the same up to two decimal places.
 * 
 * @author Mayuresh
 *
 */
public class FloatCompare
{
	public static void main(String[] args)
	{
		double num1, num2;
		
		num1 = 10.0493848;
		num2 = 10.0782837;

		num1 = Math.round(num1 * 100) / 100.0;
		num2 = Math.round(num2 * 100) / 100.0;
		
		if(Double.compare(num1, num2) == 0)
		{
			System.out.println("Same Numbers");
		}
		else if(Double.compare(num1, num2) > 0)
		{
			System.out.println("Number 1 is greater");
		}
		else if(Double.compare(num1, num2) < 0)
		{
			System.out.println("Number 2 is greater");
		}
		else
		{
			System.out.println("Something went wrong");
		}
	}
}
