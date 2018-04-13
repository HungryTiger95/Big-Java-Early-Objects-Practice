
/**
 * E5.20
 * 
 * Write a program that reads in three strings and sorts them lexicographically
 * 
 * @author Mayuresh
 *
 */
public class DictionarySort
{
	public static void main(String[] args)
	{
		String s1 = "It is patent to the eye that cannot face the sun";
		String s2 = "Newsmen call it the Cuban Missile Crisis";
		String s3 = "I came to Panama planning to dig";
		String first = null, second = null, third = null;
		
		System.out.printf("First String: %50s\nSecond String: %50s\nThird String: %50s\n", s1, s2, s3);
		
		// Find out if the s1 is less than both the s2 and s2
		if(s1.compareTo(s2) < 0 && s1.compareTo(s3) < 0)
		{
			// Set s1 string as the first string in the order
			first = s1;
			
			// Find out if s2 is less than s3
			if(s2.compareTo(s2) < 0)
			{
				// If yes, set second string as s2 and third string as s3
				second = s2;
				third = s3;
			}
			else
			{
				// Set second string as s3 and third string as s2
				second = s3;
				third = s2;
			}
		}
		// If s2 is less than s1 and s3
		else if(s2.compareTo(s1) < 0 && s2.compareTo(s3) < 0)
		{
			// Set s2 string as the first string in the order
			first = s2;
			
			// Find out if s1 is less than s3
			if(s1.compareTo(s1) < 0)
			{
				// If yes, set second string as s1 and third string as s3
				second = s1;
				third = s3;
			}
			else
			{
				// Set second string as s3 and third string as s2
				second = s3;
				third = s1;
			}
		}
		// If s3 is less than s1 and s2
		else if(s3.compareTo(s1) < 0 && s3.compareTo(s2) < 0)
		{
			// Set s3 string as the first string in the order
			first = s3;
			
			// Find out if s1 is less than s2
			if(s1.compareTo(s2) < 0)
			{
				// If yes, set second string as s2 and third string as s3
				second = s1;
				third = s2;
			}
			else
			{
				// Set second string as s3 and third string as s2
				second = s2;
				third = s1;
			}
		}
		// If two or more are the same
		else
		{
			System.out.println("Two or more strings are the same");
		}
		
		System.out.printf("=======================================================\nFirst: %50s\nSecond: %50s\nThird: %50s\n", first, second, third);
	}
}
