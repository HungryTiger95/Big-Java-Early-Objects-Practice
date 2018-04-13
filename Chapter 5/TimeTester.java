import java.util.Scanner;

public class TimeTester
{
	public static void main(String[] args)
	{
		int time1, time2;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please Enter a Time in Military: ");
		time1 = in.nextInt();
		System.out.print("Please Enter another Time: ");
		time2 = in.nextInt();
		System.out.println("---------------------------------------");
		
		in.close();
		
		Time firstTime = new Time(time1);
		Time secondTime = new Time(time2);
		
		System.out.println(firstTime.compareTo(secondTime));
		
	}

}
