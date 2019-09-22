import java.util.Scanner;

/**
 * E4.18
 * 
 * Write a program that transforms numbers 1, 2, 3, 4, ..., 12 into the
 * corresponding month names January, February, March, ..., December.
 * Hint: Make a very long string "January February March ...", in which
 * you add spaces such that each month name has the same length. Then use
 * substring to extract the month you want.
 * 
 * @author Mayuresh
 *
 */
public class DateConversion
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please Enter Month Number: ");
		int monthNum = in.nextInt();
		
		in.close();
		
		String monthNames = "January  February March    April    May      June     July     August   SeptemberOctober  November December ";
		
		int start, end;
		
		end = 9 * monthNum;
		start = end - 9;
		
		System.out.println(monthNames.substring(start, end));
	}
}
