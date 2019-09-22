import java.util.Random;

public class MonthTester
{
	public static void main(String[] args)
	{
		Random generator = new Random();
		
		for(int i = 0; i < 25; i++)
		{
			int monthNum = generator.nextInt(12) + 1;
			
			Month month = new Month(monthNum);
			
			System.out.println("Days in " + month.getMonthName() + ": " + (month.getLength()));
		}
		
	}
}
