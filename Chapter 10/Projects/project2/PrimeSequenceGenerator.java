package project2;

import java.util.ArrayList;

public class PrimeSequenceGenerator
{
	// Instance Variables
	private ArrayList<Integer> primeNums;
	
	// Constructors
	/**
	 * Constructs a prime sequence generator
	 */
	public PrimeSequenceGenerator()
	{
		primeNums = new ArrayList<Integer>();
	}
	
	// Methods
	/**
	 * Processes all the prime numbers from 0 to the given last number to be tested
	 * @param seq the sequence of numbers
	 * @param primeCeiling the last number in the sequence
	 */
	public void process(Sequence seq, int primeCeiling)
	{	
		for(int i = 1; i < primeCeiling; i++)
		{
			boolean isPrime;
			int primeCount = 0;
			
			int prime = seq.next();
			
			// Initial Checks with 0, 1, and 2. 0 is not a prime number, whereas 1 and 2 are both prime numbers
			if(prime == 0)
			{
				isPrime = false;
			}
			else if(prime == 1 || prime == 2)
			{
				isPrime = true;
			}
			// now loop through all numbers from 2 to the current number being checked to see if it is divisible by any of those numbers
			else
			{
				// Loop through the prime number being tested from 2 to that number
				// Because a prime number is a number that is divisible by 1 and itself. So we don't check 1 or the number itself
				for(int j = 2; j < prime; j++)
				{
					// If the number is divisible by any number other than 1 and itself, increment a counter
					if(prime % j == 0)
					{
						primeCount++;
					}
				}
				
				// If the counter is more than 0, the number is not prime
				if(primeCount > 0)
				{
					isPrime = false;
				}
				// If the counter is 0, the number is prime
				else
				{
					isPrime = true;
				}
			}
			
			// If this number is prime, add it to the list of prime numbers
			if(isPrime)
			{
				primeNums.add(prime);
			}
		}
	}
	
	/**
	 * Displays all the prime numbers
	 */
	public void display()
	{
		System.out.println("Primes: ");
		for(int i = 0; i < primeNums.size(); i++)
		{
			System.out.print("[" + primeNums.get(i) + "]\n");
		}
	}
}
