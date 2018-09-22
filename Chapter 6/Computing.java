import java.util.Scanner;

/**
 * E6.1/ E6.12
 * 
 * Write program with loops that compute
 * 	A. The sum of all even numbers between 2 and 100 (inclusive)
 * 	B. The sum of all squares between 1 and 100 (inclusive)
 * 	C. All powers of 2 from 2^0 up to 2^20
 * 	D. The sum of all odd numbers between a and b (inclusive), where a and b are inputs
 * 	E. The sum of all odd digits of an input.
 * 
 * @author Mayuresh
 *
 */
public class Computing
{
	public static void main(String[] args)
	{
		// Part A
		int sum = 0;
		
		for (int i = 2; i <= 100; i += 2)
		{
			sum = sum + i;
		}
		System.out.println("-------------------------------------------------------");
		System.out.println("Part A:");
		System.out.println("Sum of All Even Numbers Between 2 and 100: " + sum);
		System.out.println();
		
		// Part B
		sum = 0;
		
		for (int i = 0; i <= 100; i++)
		{
			double square = i * i;
			
			if (square <= 100)
			{
				sum = (int) (sum + square);
			}
		}
		
		System.out.println("-------------------------------------------------------");
		System.out.println("Part B:");
		System.out.println("Sum of All Squares between 0 and 100: " + sum);
		System.out.println();
		
		// Part C
		System.out.println("-------------------------------------------------------");
		System.out.println("Part C:");
		System.out.println("All Powers of 2 from 0 to 20: ");
		
		double power = 0;
		
		for (int i = 0; i <= 20; i++)
		{
			power = Math.pow(2, i);
			System.out.println("Power of 2^" + i + " = " + power);
			
		}
		
		System.out.println();
		
		// Part D
		Scanner in = new Scanner(System.in);
		int a, b;
		sum = 0;
		
		System.out.println("-------------------------------------------------------");
		System.out.println("Part D:");
		
		System.out.print("Please Enter Num 1: ");
		a = in.nextInt();
		
		System.out.print("Please Enter Num 2: ");
		b = in.nextInt();
		
		
		for (int i = a; i <= b; i++)
		{
			if (i % 2 != 0)
			{
				sum = sum + i;
			}
		}
		
		System.out.println("Sum of All Odd Numbers Between " + a + " and " + b + ": " + sum);
		System.out.println();
		
		// Part E
		System.out.println("-------------------------------------------------------");
		System.out.println("Part E:");
		
		String num;
		sum = 0;
		
		System.out.print("Please Enter a Number: ");
		num = in.next();
		
		in.close();
		
		for (int i = 0; i < num.length(); i++)
		{
			int stringNum = Integer.parseInt(num.substring(i, i + 1));
			
			if(stringNum % 2 != 0)
			{
				sum = sum + stringNum;
			}
		}
		
		System.out.println("Sum of All the Digits of " + num + ": " + sum);
	}

}
