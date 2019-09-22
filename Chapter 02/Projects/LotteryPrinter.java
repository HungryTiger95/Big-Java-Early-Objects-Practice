import java.util.Random;

/**
 * P2.5
 * 
 * Write a program LotteryPrinter that picks a combination in a lottery.
 * In this lottery, plays can choose 6 numbers(possible repeated) between 1 and 49.
 * Construct an object of the Random class and invoke an appropriate method to generate
 * each number. Your program should print out a sentence such as "Play this combination
 * -it'll make you rich!", followed by a lottery combination.
 * 
 * @author Mayuresh
 *
 */

public class LotteryPrinter
{
	public static void main (String[] args)
	{
		Random generator = new Random();
		
		int num1, num2, num3, num4, num5, num6;
		
		num1 = generator.nextInt(49) + 1;
		num2 = generator.nextInt(49) + 1;
		num3 = generator.nextInt(49) + 1;
		num4 = generator.nextInt(49) + 1;
		num5 = generator.nextInt(49) + 1;
		num6 = generator.nextInt(49) + 1;
		
		System.out.println("Play this combination - it'll make you rich! (" + num1 + " " + num2 + " " + num3
				+ " " + num4 + " " + num5 + " " + num6 + ")");
	}
}
