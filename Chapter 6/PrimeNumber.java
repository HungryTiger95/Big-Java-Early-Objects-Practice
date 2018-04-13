
/**
 * P6.3
 * 
 * Prime numbers. Write a program that prompts the user for an integer and then prints out all prime numbers
 * up to that integer.
 * 
 * Use a class PrimeGenerator with methods nextPrime and isPrime. Supply a class PrimeNumber whose main method
 * reads a user input, constructs a PrimeGenerator object and prints the primes.
 * 
 * @author Mayuresh
 *
 */
public class PrimeNumber
{
	public static void main(String[] args)
	{
		PrimeGenerator primeGen = new PrimeGenerator(1000);
		
		for(int i = 1; i <= primeGen.getMaxPrime(); i++)
		{
			if(primeGen.isPrime(i))
			{
				System.out.println(primeGen.nextPrime());
			}
		}
		
		
	}
}
