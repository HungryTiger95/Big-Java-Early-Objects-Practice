package file_example_8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PopulationDensity
{
   public static void main(String[] args) throws FileNotFoundException
   {
      // Open input files
      Scanner in1 = new Scanner(new File("src\\file_example_8\\worldpop.txt"));
      Scanner in2 = new Scanner(new File("src\\file_example_8\\worldarea.txt"));

      // Open output file
      PrintWriter out = new PrintWriter("src\\file_example_8\\worldpop_output.txt"); 

      // Read lines from each file
      while (in1.hasNextLine() && in2.hasNextLine())
      {
         CountryValue population = new CountryValue(in1.nextLine());
         CountryValue area = new CountryValue(in2.nextLine());

         // Compute and print the population density
         double density = 0;
         if (area.getValue() != 0) // Protect against division by zero
         {
            density = population.getValue() / area.getValue();
         }
         out.printf("%-40s%15.2f\n", population.getCountry(), density);
      }

      in1.close();
      in2.close();
      out.close();
   }
}
