import java.util.Scanner;

/**
 * E5.4
 * 
 * Write a program that reads three number and prints "all the same" if they are all the same,
 * "all different" if they are all different, and "neither" otherwise.
 * 
 * @author Mayuresh
 *
 */

public class SameDifferent
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in);
		int num1, num2, num3;
		
		System.out.print("Please Enter 3 Numbers: ");
		
		num1 = in.nextInt();
		num2 = in.nextInt();
		num3 = in.nextInt();
		
		in.close();
		
		if (num1 == num2 && num2 == num3)
		{
			System.out.println("All Numbers are Same");
		}
		else if (num1 != num2 && num2 != num3)
		{
			System.out.println("All Numbers are Different");
		}
		else
		{
			System.out.println("Neither");
		}
	}

}
