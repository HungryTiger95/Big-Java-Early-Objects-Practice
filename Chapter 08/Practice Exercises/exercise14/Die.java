package exercise14;

import java.util.Random;

/**
 * This class models a die that, when cast, lands on a random face.
 * Improve this class by turning the generator variable into a static
 * variable so that all needles share a single random number generator.
 * 
 * @author Mayuresh
 *
 */

public class Die
{
	// Instance Variables
   private static Random generator;			// This variable is shared between all instances of the Die class (all objects will have same values
   private int sides;

   // Constructors
   /**
      Constructs a die with a given number of sides.
      @param s the number of sides, e.g. 6 for a normal die
   */
   public Die(int s)
   {
      sides = s;
      generator = new Random();
   }

   // Methods
   /**
      Simulates a throw of the die
      @return the face of the die 
   */
   public int cast()
   {
      return 1 + generator.nextInt(sides);
   }
}
