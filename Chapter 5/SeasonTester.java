import java.util.Scanner;

public class SeasonTester
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int month, day;
		
		System.out.print("Please Enter the Day: ");
		day = in.nextInt();
		
		System.out.print("Please Enter the Month: ");
		month = in.nextInt();
		
		in.close();
		
		Day date = new Day(day, month);
		
		System.out.print("The Season is: ");
		date.getSeason();
		
	}
}
