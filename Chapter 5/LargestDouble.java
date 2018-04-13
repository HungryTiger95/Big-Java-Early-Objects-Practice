import java.util.Random;

/**
 * E5.19
 * 
 * Write a program that reads in three floating-point numbers and prints the largest of
 * the three inputs
 * 
 * Note: changed to getting a random double to bypass inputing a double each time it is tested
 * 
 * @author Mayuresh
 *
 */
public class LargestDouble
{
	public static void main(String[] args)
	{
		Random generator = new Random();
		
		// Read in three floating-point numbers
		double num1, num2, num3;
		double greatest = Double.MIN_VALUE;
		
		num1 = generator.nextDouble() * 100;
		System.out.println("Number 1: " + num1);
		
		num2 = generator.nextDouble() * 100;
		System.out.println("Number 2: " + num2);
		
		num3 = generator.nextDouble() * 100;
		System.out.println("Number 3: " + num3);
		
		// num1 is greater than num2 and num3
		if((Double.compare(num1, num2) > 0 && Double.compare(num1, num3) > 0))
		{
			System.out.println(Double.compare(num1, num2));
			System.out.println(Double.compare(num1, num3));
			greatest = num1;
		}
		// num2 is greater than num1 and num3
		else if((Double.compare(num2, num1) > 0) && (Double.compare(num2, num3) > 0))
		{
			System.out.println(Double.compare(num2, num1));
			System.out.println(Double.compare(num2, num3));
			greatest = num2;
		}
		// num 3 is greater than num1 and num2
		else if((Double.compare(num3, num1) > 0) && (Double.compare(num3, num2) > 0))
		{
			System.out.println(Double.compare(num3, num1));
			System.out.println(Double.compare(num3, num2));
			greatest = num3;
		}
		// if two or more values are the same
		else
		{
			
			System.out.println("Two or more values are the same");
		}
		
		// print the greatest value
		System.out.println("Greatest Value: " + greatest);
	}
}
