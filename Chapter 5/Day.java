/**
 * E5.14
 * 
 * Write a program that prompts the user for a month and day and then prints the season, as determined by
 * the algorithm. Use a class Date with a method getSeason.
 * 
 * if month is 1, 2, or 3, season = "Winter"
 * Else if month is 4, 5, or 6, season = "Spring"
 * Else if month is 7, 8, or 9, season = "Summer"
 * Else if month is 10, 11, or 12, season = "Fall"
 * if month is divisible by 3 and day >= 21
 * 		if season is "Winter", season = "Spring"
 * 		else if season is "Spring", season "Summer"
 * 		else if season is "Summer", season is "Spring"
 * 		else season = "Winter"
 * 
 * 
 * @author Mayuresh
 *
 */

public class Day
{
	//Instance Variables
	private int month, day;
	private String season;
	
	//Constructors
	public Day(int day, int month)
	{
		this.day = day;
		this.month = month;
	}
	
	//Methods
	public void getSeason()
	{
		if (month == 1 || month == 2 || month == 3)
		{
			season = "Winter";
		}
		else if (month == 4 || month == 5 || month == 6)
		{
			season = "Spring";
		}
		else if (month == 7 || month == 8 || month == 9)
		{
			season = "Summer";
		}
		else if (month == 10 || month == 11 || month == 12)
		{
			season = "Fall";
		}
		
		if (month % 3 == 0 && day >= 21)
		{
			if (season == "Winter")
			{
				season = "Spring";
			}
			else if (season == "Spring")
			{
				season = "Summer";
			}
			else if (season == "Summer")
			{
				season = "Fall";
			}
			else
			{
				season = "Winter";
			}
		}
		
		System.out.println(season);
	}
}
