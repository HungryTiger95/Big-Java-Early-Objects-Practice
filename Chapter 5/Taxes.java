import java.util.Scanner;

/**
 * P5.2
 * 
 * Write a program that computes taxes for the following schedule.
 * 
 * 
 * +------------------------------------------------------------------------------------------------------------------+
 * |If your status is Single and	   But not over         the tax is                   of the amount over           |
 * |if the taxable income is over                                                                                     |
 * |------------------------------------------------------------------------------------------------------------------|
 * |			$0						 $8,000	                10%								$0                    |
 * |		  $8,000				     $32,000           	$800 + 15%                        $8,000                  |
 * |		  $32,000				                       $4,400 + 25%                      $32,000                  |
 * |------------------------------------------------------------------------------------------------------------------|
 * |If your status is married and	   But not over         the tax is                   of the amount over           |
 * |if the taxable income is over                                                                                     |
 * |------------------------------------------------------------------------------------------------------------------|
 * |            $0						 $16,000                10%                             $0                    |
 * |         $16,000                     $64,000           $1,600 + 15%                      $16,000                  |
 * |         $64,000                                       $8,800 + 25%                      $64,000                  |
 * +------------------------------------------------------------------------------------------------------------------+
 * 
 * @author Mayuresh
 *
 */
public class Taxes
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int income, maritalStatus;
		double incomeTax = Double.MIN_VALUE;
		
		System.out.print("Are you filing married[1] or single[2]: ");
		maritalStatus = in.nextInt();
		
		System.out.print("Enter your income: ");
		income = in.nextInt();
		
		in.close();
		
		// Married Couple
		if(maritalStatus == 1)
		{
			// Test income
			if(income > 0 && income <= 8000)
			{
				incomeTax = 0.10 * income;
			}
			else if(income > 8000 && income < 32000)
			{
				incomeTax = (800) + (0.15 * income);
			}
			else
			{
				incomeTax = (4400) + (0.25 * income);
			}
		}
		// Single Person
		else if(maritalStatus == 2)
		{
			// Test income
			if(income > 0 && income <= 8000)
			{
				incomeTax = 0.10 * income;
			}
			else if(income > 8000 && income < 32000)
			{
				incomeTax = (1600) + (0.15 * income);
			}
			else
			{
				incomeTax = (8800) + (0.25 * income);
			}
		}
		// If marital status is entered wrong
		else
		{
			System.out.println("INVALID MARITAL STATUS: ENTER MARRIED[1] OR SNGLE[2]");
		}
		
		System.out.printf("Taxes to be Collected: %.2f\n", incomeTax);
	}
}
