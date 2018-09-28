package project4;

public class RandomSequence implements Sequence
{
	// Instance Variables
	
	// Constructors
	
	// Methods
	@Override
	/**
	 * Gets the next value
	 */
   public int next()
   {
      return (int) (Integer.MAX_VALUE * Math.random());
   }
   
	@Override
	/**
	 * Checks if there are anymore values
	 */
   public boolean hasNext()
   {
	   // Do Nothing
	   return false;
   }
}
