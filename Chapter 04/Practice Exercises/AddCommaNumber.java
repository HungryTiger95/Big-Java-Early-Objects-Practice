import java.util.Scanner;

/**
 * E4.13
 * 
 * Write a program that reads a number between 1,000 and 999,999 from the user and
 * prints it with a comma separating the thousands.
 * 
 * @author Mayuresh
 *
 */
public class AddCommaNumber
{
	public static void main(String[] args)
	{
		int num;
		String stringNum;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an Integer between 1000 and 999999: ");
		num = in.nextInt();
		
		in.close();
		
		stringNum = String.valueOf(num);
		
		String backThree, rest;
		
		backThree = stringNum.substring(stringNum.length() - 3, stringNum.length());
		rest = stringNum.substring(0, stringNum.length() - 3);
		
		System.out.printf("Number: %s,%s", rest, backThree);
		//System.out.printf("backThree: %5s\nrest: %5s\n", backThree, rest);
	}
}
