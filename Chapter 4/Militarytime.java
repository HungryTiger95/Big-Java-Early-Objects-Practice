import java.util.Scanner;

/**
 * E4.16
 * 
 * Write a program that reads two times in military format(0900, 1730) and prints the
 * number of hours and minutes between the two times.
 * 
 * @author Mayuresh
 *
 */

public class Militarytime
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int firstTime, secondTime, difference;
		String hour, minute;
		
		System.out.print("Please enter the first time: ");
		firstTime = in.nextInt();
		
		System.out.print("Please enter the second time: ");
		secondTime = in.nextInt();
		
		in.close();
		
		difference = secondTime - firstTime;
		
		minute = String.valueOf(difference);
		minute = minute.substring(minute.length() - 2, minute.length());
		
		hour = String.valueOf(difference);
		hour = hour.substring(0, hour.length() - 2);
		
		System.out.println(hour + " hours " + minute + " minutes");
		
	}
}
