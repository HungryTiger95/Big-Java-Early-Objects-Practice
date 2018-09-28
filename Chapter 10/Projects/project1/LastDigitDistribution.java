package project1;

/**
   This class analyzes the distribution of the last digit of values
   from a sequence.
   
   Modify the display method of the LastDistribution class of Worked Example 10.1 so that it produces a histogram, like this:
   
   			0: **********
   			1: ******************
   			2: *************************
   			...
   
*/
public class LastDigitDistribution
{
	// Instance Variables
   private int[] counters;

   // Constructors
   /**
      Constructs a distribution whose counters are set to zero.
   */
   public LastDigitDistribution()
   {
      counters = new int[10];
   }

   // Methods
   /**
      Processes values from this sequence.
      @param seq the sequence from which to obtain the values
      @param valuesToProcess the number of values to process
   */
   public void process(Sequence seq, int valuesToProcess)
   {
      for (int i = 1; i <= valuesToProcess; i++)
      {
         long value = seq.next();
         int lastDigit = (int) (value % 10);
         
         counters[lastDigit]++;
      }
   }

   /**
      Displays the counter values of this distribution.
   */
   public void display()
   {
      for (int i = 0; i < counters.length; i++)
      {
         System.out.printf("%3d: (%3d): ", i, counters[i]);
         for(int j = 0; j < counters[i]; j++)
         {
        	 System.out.print("*");
         }
         
         System.out.println();
      }
   }
}
