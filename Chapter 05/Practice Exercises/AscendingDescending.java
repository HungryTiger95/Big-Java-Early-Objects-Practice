import java.util.Scanner;

/**
 * E5.7
 * 
 * Write a program that reads in three integers and prints "in order" if they are sorted
 * in ascending or descending order, or "not in order" otherwise.
 * 
 * @author Mayuresh
 *
 */

public class AscendingDescending
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in);
		int num1, num2, num3;
		boolean order = false;
		
		System.out.print("Please Enter 3 Numbers: ");
		num1 = in.nextInt();
		num2 = in.nextInt();
		num3 = in.nextInt();
		
		in.close();
		
		if (num1 < num2 && num2 < num3)				//e.g. 1-2-3
		{
			order = true;
		}
		else if (num1 > num2 && num2 > num3)		//e.g. 3-2-1
		{
			order = true;
		}
		else if (num1 < num2 && num2 == num3)		//e.g. 1-2-2
		{
			order = true;
		}
		else if (num1 == num2 && num2 < num3)		//e.g. 2-2-3
		{
			order = true;
		}
		else if (num1 == num2 && num2 > num3)		//e.g. 2-2-1
		{
			order = true;
		}
		else if (num1 > num2 && num2 == num3)		//e.g. 2-1-1
		{
			order = true;
		}
		
		
		if (order == true)
		{
			System.out.println("In order");
		}
		else
		{
			System.out.println("Not in order");
		}
	}

}
