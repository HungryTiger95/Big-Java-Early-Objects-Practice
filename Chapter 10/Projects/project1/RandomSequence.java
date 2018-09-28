package project1;

public class RandomSequence implements Sequence
{
	// Instance Variables
	
	// Constructors
	
	// Methods
	/**
	 * Returns the next random integer value 0 to Integer.MAX_VALUE
	 */
   public long next()
   {
      return (int) (Integer.MAX_VALUE * Math.random());
   }
}
