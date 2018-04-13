import java.util.Scanner;

/**
 * E4.12
 * 
 * Write a program that reads a number between 1,000 and 999,999 from the user, where
 * the user enters a comma in the input. Then print the number without a comma.
 * 
 * @author Mayuresh
 *
 */

public class RemoveCommaNumber
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String num, first, second;
		int length;
		
		System.out.print("Please enter an integer between 1,000 and 999,999: ");
		num = in.next();
		
		in.close();
		
		length = num.length();
		first = num.substring(0, length - 4);
		second = num.substring(length - 3, length);
		
		System.out.println(first.concat(second));
		
	}
}
