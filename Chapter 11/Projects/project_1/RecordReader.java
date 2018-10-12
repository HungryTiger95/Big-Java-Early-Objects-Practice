package project_1;

import java.util.Scanner;

/**
   This class processes baby name records.
*/
public class RecordReader
{
   private double total;
   private double limit;

   /**
      Constructs a RecordReader with a zero total.
   */
   public RecordReader(double aLimit)
   {
      total = 0;
      limit = aLimit;
   }

   /**
      Reads an input record and prints the name if the current total is less 
      than the limit.
      @param in the input stream
   */
   public void process(Scanner in)
   {
      String name = in.next();
      int count = in.nextInt();
      double percent = in.nextDouble();
      
      if (total < limit)
      {
    	  System.out.print("[" + name + "]");
      }
      total++;
   }
   
   /**
    * Returns a name from the input
    * @param in the input stream
    * @return a name
    */
   public String processName(Scanner in)
   {
	   String name = in.next();
	   int count = in.nextInt();
	   double percent = in.nextDouble();
	   
	   total++;
	   return name;
   }
   /**
      Checks whether there are more inputs to process
      @return true if the limit has not yet been reached
   */
   public boolean hasMore()
   {
      return total < limit;
   }
}
