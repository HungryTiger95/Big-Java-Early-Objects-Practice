
public class PrimeGenerator
{
	// Instance Variables
	private int primeMax;
	private int prime;
	
	// Constructors
	public PrimeGenerator(int n)
	{
		primeMax = n;
		
	}
	// Methods
	/**
	 * Returns the prime
	 * @return prime
	 */
	public int nextPrime()
	{
		return prime;
	}
	
	/**
	 * Tests if a number is a prime or not
	 * @param primeNum the number to test
	 * @return isPrime
	 */
	public boolean isPrime(int primeNum)
	{
		boolean isPrime = false;
		this.prime = primeNum;
		int primeCount = 0;
		
		/**
		 * Do an initial check. If the prime number to be tested is 1, then it is false. If the prime number to be tested
		 * is 2 or 3, then it is a prime number (set isPrime boolean to true)
		 */
		if(prime == 1)
		{
			isPrime = false;
		}
		else if(prime == 2 || prime == 3)
		{
			isPrime = true;
		}
		/**
		 * Otherwise, loop through the prime number starting with 2 (because a prime number is one that is not divisible
		 * by a number other than 1 and itself) and ending with the prime number - 1. If one of the numbers are divisible
		 * without a remainder, then add 1 to the prime counter.
		 */
		else
		{
			for(int i = 2; i <= prime - 1; i++)
			{
				if(prime % i == 0)
				{
					primeCount++;
				}
			}
			
			/**
			 * Check the prime counter, if there are more than 0, then the number is not prime
			 */
			if(primeCount == 0)
			{
				isPrime = true;
			}
			else
			{
				isPrime = false;
			}
		}
		
		return isPrime;
	}
	
	/**
	 * Gets the max prime number
	 * @return primeMax
	 */
	public int getMaxPrime()
	{
		return primeMax;
	}
}
