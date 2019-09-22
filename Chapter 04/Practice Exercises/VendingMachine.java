import java.util.Scanner;

/**
   This program simulates a vending machine that gives change.
*/
public class VendingMachine
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      final int PENNIES_PER_DOLLAR = 100;
      final int PENNIES_PER_QUARTER = 25;

      System.out.print("Enter bill value (1 = $1 bill, 5 = $5 bill, etc.): ");
      int billValue = in.nextInt();
      System.out.print("Enter Number of Quarters: ");
      int quarters = in.nextInt();
      System.out.print("Enter item price in pennies: ");
      int itemPrice = in.nextInt();

      in.close();
      
      // Compute change due

      int changeDue = (PENNIES_PER_DOLLAR * billValue) + (PENNIES_PER_QUARTER * quarters) - itemPrice;
      int dollarCoins = changeDue / PENNIES_PER_DOLLAR;
      changeDue = changeDue % PENNIES_PER_DOLLAR;
      int quartersChange = changeDue / PENNIES_PER_QUARTER;

      // Print change due
      
      System.out.printf("Dollar coins: %6d", dollarCoins);
      System.out.println();
      System.out.printf("Quarters:     %6d", quartersChange);
      System.out.println();
   }
}
