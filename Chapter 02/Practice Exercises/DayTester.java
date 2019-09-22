/**
 * E2.14
 * 
 * Using the Day class of Worked Example 2.1, write a DayTester program that constructs
 * a Day object representing today, adds ten days to it, and then computes the difference
 * between that day and today. Print the difference and expected values.
 * @author Mayuresh
 *
 */

public class DayTester
{
	public static void main (String[] args)
	{
		Day day = new Day(1995, 1, 17);
		Day day2 = new Day();
		
		day2 = day.addDays(10);
		
		System.out.println("Expected: 10");
		System.out.println("Difference in days: " + day2.daysFrom(day));
		
	}
}
