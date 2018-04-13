import java.util.Scanner;

/**
 * P6.9
 * 
 * Your company has shares of stock it would like to sell when their value exceeds a
 * certain target price. Write a program that reads the target price and then reads the
 * current stock price until it is at least the target price. Your program should use a
 * Scanner to read a sequence of double values from standard input. Once the minimum
 * is reached, the program should report that the stock price exceeds the target price.
 * 
 * @author Mayuresh
 *
 */
public class StockPrice
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		double targetPrice, stockPrice;
		
		System.out.print("Enter Target Stock Price: ");
		targetPrice = in.nextDouble();
		
		System.out.print("Current Price: ");
		stockPrice = in.nextDouble();
		
		while(stockPrice < targetPrice)
		{
			System.out.print("New Current Price: ");
			stockPrice = in.nextDouble();
			
			if(stockPrice >= targetPrice)
			{
				System.out.println("Stock Price Exceeds Target Price");
			}
		}
		
		in.close();
	}
}
