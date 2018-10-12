package exercise_11_10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Get the data names in prior decades from the SSA. Paste the table data in files. Modify the worked_example_1
 * so that it prompts the user for a file name. The numbers in the files have comma separators, so modify the program
 * to handle them.
 * 
 * @author Mayuresh
 *
 */
public class BabyNames
{
   public static final double LIMIT = 50;

   public static void main(String[] args) throws FileNotFoundException
   {  
	  Scanner console = new Scanner(System.in);
	  
	  System.out.println("Enter File to Read From: ");
	  String inputFileName = "src\\exercise_11_10\\".concat(console.next());
	  
	  console.close();
	  
	  File babyNameFile = new File(inputFileName);
	  
      try(Scanner in = new Scanner(babyNameFile))
      {
    	  RecordReader boys = new RecordReader(LIMIT);
    	  RecordReader girls = new RecordReader(LIMIT);
      
    	  while (boys.hasMore() || girls.hasMore())
    	  {
    		  int rank = in.nextInt();
    		  System.out.print(rank + " ");
    		  girls.process(in);
    		  boys.process(in);
    		  System.out.println();
    	  }
      }
   }
}	
