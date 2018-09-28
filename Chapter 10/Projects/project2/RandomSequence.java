package project2;

public class RandomSequence implements Sequence
{
	// Instance Variables
	
	// Constructors
	
	// Methods
	/**
	 * Gets the next integer
	 */
   public int next()
   {
      return (int) (Integer.MAX_VALUE * Math.random());
   }
}
