/**
 * E5.13
 * 
 * When two points in time are compared, each given as hours (in military time, ranging from 0 and 23) and minutes,
 * the following pseudocode determines which comes first.
 * 
 * if hour 1 < hour 2
 * 		time 1 comes first
 * else if hour 1 and hour 2 are the same
 * 		if minute 1 < minute 2
 * 			time 1 comes first
 * 		else if minute 1 and minute 2 are the same
 * 			time 1 and time 2 are the same
 * 		else
 * 			time 2 comes first
 * else time 2 comes first
 * 
 * Write a program that prompts the user for two points in time and prints the time that comes first, then the other time.
 * In your program, supply a class Time and a method public int compareTo(Time other) that returns -1 if the time comes before
 * the other, 0 if the times are the same, and 1 otherwise.
 * 
 * @author Mayuresh
 *
 */
public class Time
{
	//Instance Variables
	private int time, hour, minute;
	
	//Constructors
	public Time(int time)
	{
		this.time = time;
		
		hour = this.time / 100;
		minute = this.time % 100;
		
	}
	//Methods
	public int getHour()
	{
		return hour;
	}
	
	public int getMinute()
	{
		return minute;
	}
	
	public int compareTo(Time time)
	{
		int hour1, hour2, minute1, minute2;
		hour2 = time.getHour();
		minute2 = time.getMinute();
		
		hour1 = hour;
		minute1 = minute;
		
		if (hour1 < hour2)
		{
			System.out.println("Time 1 Comes First");
			return -1;
		}
		else if (hour1 == hour2)
		{
			if (minute1 < minute2)
			{
				System.out.println("Time 1 Comes First");
				return -1;
			}
			else if (minute1 == minute2)
			{
				System.out.println("Time 1 and Time 2 are the Same");
				return 0;
			}
			else
			{
				System.out.println("Time 2 Comes First");
				return 1;
			}
		}
		else
		{
			System.out.println("Time 2 Comes First");
			return 1;
		}
		
	}
}
