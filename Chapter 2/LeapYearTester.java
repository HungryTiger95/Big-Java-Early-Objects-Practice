/**
 * Using the Day class of Worked Example 1, write a program that generates a Day object representing
 * February 28 of this year, and three more such objects that represent
 * February 28 of the next three years. Advance each object by one day, and print
 * each object. Also print the expected values:
 * 
 * @author Mayuresh
 *
 */

public class LeapYearTester
{
	public static void main (String[] args)
	{
		Day year1 = new Day(2012, 02, 28);
		
		year1 = year1.addDays(1);
		System.out.println(year1);
		System.out.println("Expected: 2012-02-29");
		
		Day year2 = new Day(2013, 02, 28);
		
		year2 = year2.addDays(1);
		System.out.println(year2);
		System.out.println("Expected: 2013-03-01");
		
		Day year3 = new Day(2014, 02, 28);
		
		year3 = year3.addDays(1);
		System.out.println(year3);
		System.out.println("Expected: 2014-03-01");
		
		Day year4 = new Day(2015, 02, 28);
		
		year4 = year4.addDays(1);
		System.out.println(year4);
		System.out.println("Expected: 2015-03-01");
		
		Day year5 = new Day(2016, 02, 28);
		
		year5 = year5.addDays(1);
		System.out.println(year5);
		System.out.println("Expected: 2016-02-29");
		
	}
}
