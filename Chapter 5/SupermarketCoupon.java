import java.util.Random;

/**
 * Business E5.24
 * 
 * A supermarket awards coupons depending on how much a customer spends on
 * groceries. For example, if you spend 50 dollars, you will get a coupon worth eight percent
 * of that amount. The following table shows the percent used to calculate the coupon awarded
 * for different amounts spent. Write a program that calculates and prints the value of the
 * coupon a person can receive based on groceries purchased.
 * 
 *  +----------------------------------------------+
 * 	|	Money Spent				Coupon Percentage  |
 *  +----------------------------------------------+
 *  |	Less than 10			   No coupon	   |
 *  |	From 10 - 60				  8%		   |
 *  |	From 60 - 150                 10%          |
 *  |	From 150 - 210                12%          |
 *  |	More than 210                 18%          |
 *  +----------------------------------------------+
 *  
 *  
 * @author Mayuresh
 *
 */
public class SupermarketCoupon
{
	public static void main(String[] args)
	{
		Random generator = new Random();
		
		String couponPercentage;
		
		double randNum = (0 + (250 - 0)) * generator.nextDouble();
			
		if(randNum > 210)
		{
			couponPercentage = "18%";
		}
		else if(randNum > 150)
		{
			couponPercentage = "12%";
		}
		else if(randNum > 60)
		{
			couponPercentage = "10%";
		}
		else if(randNum > 10)
		{
			couponPercentage = "8%";
		}
		else
		{
			couponPercentage = "No Coupon";
		}
		
		System.out.printf("Money Spent: %.2f\nRecieved Coupon: %s\n", randNum, couponPercentage);		
	}
}
