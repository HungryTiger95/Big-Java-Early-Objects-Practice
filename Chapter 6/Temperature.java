import java.util.Scanner;

/**
 * E6.4
 * 
 * Read twelve temperature values (one for each month) and diplay the number of the
 * month with the highest temperature.
 * 
 * Sample Input: 18.2 22.6 26.4 31.1 36.6 42.2 45.7 44.5 40.2 33.1 24.2 17.6
 * 
 * @author Mayuresh
 *
 */
public class Temperature
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int month = 0;
		String monthName = "";
		double tempVal;
		double largest = Double.MIN_VALUE;
		
		System.out.print("Enter 12 Temperatures: ");
		
		// Read 12 temps and test and save for the largest value
		for(int i = 1; i <= 12; i++)
		{
			tempVal = in.nextDouble();
			
			if(tempVal > largest)
			{
				largest = tempVal;
				month = i;
			}
		}
		
		in.close();
		
		// Convert month number to the month name
		if(month == 1)
		{
			monthName = "January";
		}
		else if(month == 2)
		{
			monthName = "February";
		}
		else if(month == 3)
		{
			monthName = "March";
		}
		else if(month == 4)
		{
			monthName = "April";
		}
		else if(month == 5)
		{
			monthName = "May";
		}
		else if(month == 6)
		{
			monthName = "June";
		}
		else if(month == 7)
		{
			monthName = "July";
		}
		else if(month == 8)
		{
			monthName = "August";
		}
		else if(month == 9)
		{
			monthName = "September";
		}
		else if(month == 10)
		{
			monthName = "October";
		}
		else if(month == 11)
		{
			monthName = "November";
		}
		else if(month == 12)
		{
			monthName = "December";
		}
		else
		{
			System.out.println("Something went wrong with month");
		}
		
		
		System.out.println("Higest Temp: " + largest + " in " + monthName);
	}
}
