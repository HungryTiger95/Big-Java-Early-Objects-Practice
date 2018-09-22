import java.util.Scanner;

/**
 * Modify the LargestInArray to print both the smallest and largest values
 * 
 * @author Mayuresh
 *
 */

public class LargestInArray
{
	public static void main(String[] args)
     {  
       final int LENGTH = 100;
       double[] values = new double[LENGTH];
       int currentSize = 0;
  
       // Read inputs 
       System.out.println("Please enter values, Q to quit:");
       Scanner in = new Scanner(System.in);
       
       while (in.hasNextDouble() && currentSize < values.length)
       {  
          values[currentSize] = in.nextDouble();
          currentSize++;
       }
       
       in.close();
       
       // Find the largest and smallest values
       double largest = values[0];
       double smallest = values[0];
       for (int i = 1; i < currentSize; i++)
       {
          if (values[i] > largest)
          {
             largest = values[i];
          }
          if (values[i] < smallest)
          {
        	  smallest = values[i];
          }
       }
       
       // Print all values, marking the largest 
       for (int i = 0; i < currentSize; i++)
       {  
          System.out.print(values[i]);
          if (values[i] == largest) 
          {
             System.out.print(" <-- largest value");
          }
          if (values[i] == smallest)
          {
        	  System.out.print(" <-- smallest value");
          }
          System.out.println();
       }
    }
}
