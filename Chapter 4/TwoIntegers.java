import java.util.Scanner;

/**
 * E4.4/E4.5
 * 
 * Write a program that prompts the user for two Integers and then prints
 * the sum, difference, product, average, distance (absolute value), and
 * the max and min.
 * 
 * Format the output.
 * 
 * @author Mayuresh
 *
 */

public class TwoIntegers
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter 2 Integers: ");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		in.close();
		System.out.println();
		
		int sum, difference, distance, max, min;
		double product, average;
		
		sum = num1 + num2;
		difference = num2 - num1;
		distance = Math.abs(difference);
		max = Math.max(num1, num2);
		min = Math.min(num1, num2);
		
		product = num1 * num2;
		average = (num1 + num2) / 2.0;
		
		System.out.printf("Sum: %12d \n", sum);
		System.out.printf("Difference: %5d \n", difference);
		System.out.printf("Product: %11.2f \n", product);
		System.out.printf("Average: %11.2f \n", average);
		System.out.printf("Distance:  %6d \n", distance);
		System.out.printf("Maximum: %8d \n", max);
		System.out.printf("Minimum: %8d \n", min);
		
	}
}
