import java.util.Scanner;

/**
 * E6.13
 * 
 * Write a program that reads a number and prints all of its binary digits.
 * Print the remainder (number % 2), then replace the number with (number / 2)
 * Keep going until the number is 0.
 * 
 * Enter a number up to 255
 * 
 * @author Mayuresh
 *
 */
public class IntegerToBinary
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
		int num = in.nextInt();
		
		in.close();
		
		while(num != 0)
		{
			System.out.println(num % 2);
			num = num / 2;
		}
	}
}
