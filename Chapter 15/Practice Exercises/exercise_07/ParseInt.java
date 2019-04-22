package exercise_07;

import java.util.Scanner;
import java.util.Stack;

/**
 * Your task is to break a number into its individual digits, for example, to turn 1729
 * into 1, 7, 2, and 9. It is easy to get the last digit of a number n as n % 10. But that
 * gets the numbers in reverse order. Solve this problem with a stack. Your program should
 * ask the user for an integer, then print its digits separated by spaces.
 * 
 * @author Mayuresh
 *
 */
public class ParseInt
{
	// Instance Variables
	
	// Constructors
	
	// Methods
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an Integer: ");
		int n = in.nextInt();
		
		in.close();
		
		System.out.println("Digits of " + n + ": " + getDigits(n));
	}
	
	/**
	 * Gets the digits of an integer that is passed
	 * @param value the value
	 * @return a string representation of all the digits
	 */
	public static String getDigits(int value)
	{
		String s = "";
		Stack<Integer> digits = new Stack<Integer>();
		
		while(value >= 10)
		{
			digits.push(value % 10);
			value = value / 10;
		}
		digits.push(value);
		
		// Make a string out of all the digits in the stack
		while(digits.size() > 0)
		{
			int num = digits.pop();
			s += String.valueOf(num) + " ";
		}
		
		return s;
	}
}
