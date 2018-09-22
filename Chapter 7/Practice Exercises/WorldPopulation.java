/**
   This program prints a table showing the world population growth over 300 years.
*/
public class WorldPopulation
{
   public static void main(String[] args)
   {
      final int ROWS = 6;
      final int COLUMNS = 7;

      int[][] populations = 
         { 
            { 106, 107, 111, 133, 221, 767, 1766 },
            { 502, 635, 809, 947, 1402, 3634, 5268 }, 
            { 2, 2, 2, 6, 13, 30, 46 }, 
            { 163, 203, 276, 408, 547, 729, 628 },
            { 2, 7, 26, 82, 172, 307, 392 },
            { 16, 24, 38, 74, 167, 511, 809 }
         };

      String[] continents = 
         { 
            "Africa", 
            "Asia", 
            "Australia",
            "Europe", 
            "North America", 
            "South America" 
         };

      System.out.println("                Year 1750 1800 1850 1900 1950 2000 2050");
      
      // Print population data
      
      for (int i = 0; i < ROWS; i++)
      {      
         // Print the ith row
         System.out.printf("%20s", continents[i]);
         for (int j = 0; j < COLUMNS; j++)
         {
            System.out.printf("%5d", populations[i][j]);
         }
         System.out.println(); // Start a new line at the end of the row
      }

      // Print column totals

      System.out.print("               World");
      for (int j = 0; j < COLUMNS; j++) 
      {
         int total = 0; 
         for (int i = 0; i < ROWS; i++)
         {
            total = total + populations[i][j];
         }
         System.out.printf("%5d", total);         
      }
      System.out.println(); 
   }
}
