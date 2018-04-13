
/**
 * E5.23
 * 
 * Write a program that asks the user to enter a month (1 for January,
 * 2 for February, ...) and then prints the number of days in the month.
 * 
 * Use a class Month with a method public int getLength()
 * 
 * Do not use a separate if/else branch for each month. Use Boolean operators.
 * 
 * @author Mayuresh
 *
 */
public class Month
{
	// Instance Variable
	String month;
	int monthLength;
	
	// Constructors
	/**
	 * Constructs a month object
	 * @param month month in number notation
	 */
	public Month(int month)
	{
		if(month == 1)
		{
			this.month = "January";
			this.monthLength = 31;
		}
		else if(month == 2)
		{
			this.month = "February";
			this.monthLength = 28;
		}
		else if(month == 3)
		{
			this.month = "March";
			this.monthLength = 31;
		}
		else if(month == 4)
		{
			this.month = "April";
			this.monthLength = 30;
		}
		else if(month == 5)
		{
			this.month = "May";
			this.monthLength = 31;
		}
		else if(month == 6)
		{
			this.month = "June";
			this.monthLength = 30;
		}
		else if(month == 7)
		{
			this.month = "July";
			this.monthLength = 31;
		}
		else if(month == 8)
		{
			this.month = "August";
			this.monthLength = 31;
		}
		else if(month == 9)
		{
			this.month = "September";
			this.monthLength = 30;
		}
		else if(month == 10)
		{
			this.month = "October";
			this.monthLength = 31;
		}
		else if(month == 11)
		{
			this.month = "November";
			this.monthLength = 30;
		}
		else
		{
			this.month = "December";
			this.monthLength = 31;
		}
	}
	// Methods
	/**
	 * Gets the length of the month
	 * @return month length
	 */
	public int getLength()
	{
		return monthLength;
	}
	
	/**
	 * Gets the name of the month
	 * @return month name
	 */
	public String getMonthName()
	{
		return month;
	}
}
