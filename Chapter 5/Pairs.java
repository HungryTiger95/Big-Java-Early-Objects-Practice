import java.util.Scanner;

/**
 * E5.8
 * 
 * Write a program that reads four integers and prints "two pairs" if the input consists
 * of two matching pairs (in some order) and "not two pairs" otherwise.
 * 
 * @author Mayuresh
 *
 */

public class Pairs
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner (System.in);
		int num1, num2, num3, num4;
		
		System.out.print("Please Enter 4 Numbers: ");
		num1 = in.nextInt();
		num2 = in.nextInt();
		num3 = in.nextInt();
		num4 = in.nextInt();
		
		in.close();
		
		if (num1 == num2 && num3 == num4)			//e.g. 1-1-2-2
		{
			System.out.println("two pairs");
		}
		else if (num1 == num3 && num2 == num4)		//e.g. 1-2-1-2
		{
			System.out.println("two pairs");
		}
		else if (num1 == num4 && num2 == num3)		//e.g. 1-2-2-1
		{
			System.out.println("two pairs");
		}
		else
		{
			System.out.println("not two pairs");
		}
	}
}
