package section_01;

public class ComputePower
{
	public static void main(String[] args)
	{
		System.out.println("2^5: " + pow2(5));
	}
	
	/**
	 * Computes a power of 2 given a power
	 * @param n the power to raise 2 to
	 * @return 2^nth power
	 */
	public static int pow2(int n)
	{
		if(n <= 0)
		{
			return 1;
		}
		else
		{
			return 2 * pow2(n - 1);
		}
	}
}


