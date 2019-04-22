package exercise_03;

import java.util.HashSet;
import java.util.Set;

/**
 * Implement the sieve of Eratosthenes: a method for computing prime numbers, known to the
 * ancient Greeks. This method will compute all prime numbers up to n. Choose an n. First
 * insert all numbers from 2 to n into a set. Then erase all multiples of 2 (except 2); that
 * is, 4, 6, 8, 10, 12, ... Erase all multiples of 3; that is, 6, 9, 12, 15, ... Go up to
 * sqrt(n). Then print the set.
 * 
 * @author Mayuresh
 *
 */
public class SieveOfEratosthenes
{
	// Instance Variables
	
	// Constructors
	
	// Methods
	public static void main(String[] args)
	{
		System.out.println(findPrimes(1000));
	}
	
	/**
	 * Finds all prime numbers up to nth value
	 * @param n the largest number to test for being prime
	 * @return all the prime numbers up to n
	 */
	public static Set<Integer> findPrimes(int n)
	{
		Set<Integer> primes = new HashSet<Integer>();
		
		// If n is less than 2 set will be empty
		if(n < 2)
		{
			System.out.println("NO PRIME NUMBERS FOR VALUES LESS THAN 2");
			return primes;
		}
		else
		{
			// Add all numbers from 2 to n into a set
			for(int i = 2; i <= n; i++)
			{
				primes.add(i);
			}
			
			// Loop through each integer from 2 to sqrt(n)
			for(int i = 2; i <= Math.sqrt(n); i++)
			{
				
				for(int j = 2; j * i <= n; j++)
				{
					primes.remove(i * j);
				}
			}
		}
		
		return primes;
	}
}
