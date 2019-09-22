/**
 * E6.14
 * 
 * Write a program that prints a multiplication table
 * 
 * @author Mayuresh
 *
 */
public class MultiplicationTable
{
	public static void main (String[] args)
	{
		for (int i = 1; i <= 10; i++)
		{
			for (int j = 1; j <= 10; j++)
			{
				System.out.printf("%5d", i * j);
			}
			System.out.println();
		}
	}
}
