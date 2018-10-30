package section_01;

public class LuckyNumber
{
	public static void main(String[] args)
	{
		System.out.println("284 Lucky?: " + isLucky(4, 284));
	}
	
	/**
	 * Tests whether or not a number contains a lucky number
	 * @param luckyNum the lucky number
	 * @param number the number to test
	 * @return true if the number is a lucky number, false if not
	 */
	public static boolean isLucky(int luckyNumber, int number)
	{
		int lastDigit = number % 10;
		
		if(lastDigit == luckyNumber)
		{
			return true;
		}
		else if(number < 10)
		{
			return false;
		}
		else
		{
			return isLucky(luckyNumber, number / 10);
		}
	}
}
