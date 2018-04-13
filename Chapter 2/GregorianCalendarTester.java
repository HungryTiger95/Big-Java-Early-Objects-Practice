import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * P2.7
 * 
 * The GregorianCalendar class describes a point in time, as measured by the Gregorian
 * calendar. Construct a GregorianCalendar object form a year, month, and day of the month,
 * like this:
 * 
 * 		GregorianCalendar cal = new GregorianCalendar();	// Today's Date
 * 		GregorianCalendar myBirthdate = new GregorianCalendar(1995, Calendar.JANUARY, 17);
 * 
 * The add method adds a number of days to a GregorianCalendar object:
 * 		
 * 		cal.add(Calendar.DAY_OF_MONTH, 10);
 * 
 * Look at the API of GregorianCalendar and write a program that prints
 * 
 * 		* the date and weekday that is 100 days from now
 * 		* the weekday of your birthday
 * 		*the date that is 10,000 days from your birthday
 * 
 * @author Mayuresh
 *
 */
public class GregorianCalendarTester
{
	public static void main(String[] args)
	{
		// creates a calendar for todays date
		GregorianCalendar cal = new GregorianCalendar();
		
		// Today's date
		System.out.print("Today's Date: ");
		System.out.println(cal.get(Calendar.MONTH) + "-" + cal.get(Calendar.DAY_OF_MONTH) + "-" + cal.get(Calendar.YEAR));
		
		
		// Calculate a date 10 days from now
		System.out.print("10 Days From Now: ");
		cal.add(Calendar.DAY_OF_MONTH, 10);
		System.out.println(cal.get(Calendar.MONTH) + "-" + cal.get(Calendar.DAY_OF_MONTH) + "-" + cal.get(Calendar.YEAR));
		
		// Reset to Today's Date
		cal.set(2018, 0, 5);
		
		// Calculate a date 20 days from now
		System.out.print("10 Days From Now: ");
		cal.add(Calendar.DAY_OF_MONTH, 20);
		System.out.println(cal.get(Calendar.MONTH) + "-" + cal.get(Calendar.DAY_OF_MONTH) + "-" + cal.get(Calendar.YEAR));
		
		// Reset to Today's Date
		cal.set(2018, 0, 5);
		
		// Calculate a date 100 days from now
		System.out.print("10 Days From Now: ");
		cal.add(Calendar.DAY_OF_MONTH, 100);
		System.out.println(cal.get(Calendar.MONTH) + "-" + cal.get(Calendar.DAY_OF_MONTH) + "-" + cal.get(Calendar.YEAR));
		
		// Reset to my Birthday
		cal.set(1995, 0, 17);
		
		// Print my Birthday
		System.out.print("My Birthdate: ");
		System.out.println(cal.get(Calendar.MONTH) + "-" + cal.get(Calendar.DAY_OF_MONTH) + "-" + cal.get(Calendar.YEAR));
		
		// Print the weekday of my birthday
		System.out.print("Weekday of My Birthdate: ");
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		// 10,000 days from my Birthdate
		cal.add(Calendar.DAY_OF_MONTH, 10000);
		System.out.print("10,000 Days from My Birthdate: ");
		System.out.println(cal.get(Calendar.MONTH) + "-" + cal.get(Calendar.DAY_OF_MONTH) + "-" + cal.get(Calendar.YEAR));
	}
}
