import java.util.Scanner;

/**
 * Business P5.10
 * 
 * Calculating the tip when you go to a restaurant is not difficult, but your
 * restaurant wants to suggest a tip according to the service diners receive.
 * Write a program that calculates a tip according to the diner's satisfaction
 * as follows:
 * 
 * 		*Ask for the diners' satisfaction level using these ratings: 1 = Totally satisfied, 2 = Satisfied, 3 = Dissatisfied
 * 		*If the diner is totally satisfied, calculate a 20 percent tip
 * 		*If the diner is satisfied, calculate a 15 percent tip
 * 		*If the diner is dissatisfied, calculate a 10 percent tip
 * 		*Report the satisfaction level and tip in dollars and cents
 *
 * @author Mayuresh
 *
 */
public class TipCalculator
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int sL;
		double price = 34.29;
		double tip, tipPrice;
		
		System.out.print("Enter Satisfaction Level:\nTotally Satisfied[1] - Satisfied[2] - Dissatisfied[3] = ");
		sL = in.nextInt();
		
		in.close();
		System.out.println("--------------------------------------------------------");
		
		if(sL > 0 && sL < 4)
		{
			if(sL == 1)
			{
				tip = .20;
				tipPrice = price + (price * tip);
				
				System.out.printf("Satisfaction Level: Totally Satisfied\nSubtotal: %10.2f", tipPrice);
			}
			else if(sL == 2)
			{
				tip = .15;
				tipPrice = price + (price * tip);
				
				System.out.printf("Satisfaction Level: Satisfied\nSubtotal: %10.2f", tipPrice);
			}
			else
			{
				tip = .10;
				tipPrice = price + (price * tip);
				
				System.out.printf("Satisfaction Level: Dissatisfied\nSubtotal: %10.2f", tipPrice);
			}
		}
		else
		{
			System.out.println("Satisfaction Level is incorrect");
		}
	}
}
