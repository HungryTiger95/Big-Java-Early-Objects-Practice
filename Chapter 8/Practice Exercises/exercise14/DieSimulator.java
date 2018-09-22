package exercise14;

/**
   This program simulates casting a die ten times.
*/
public class DieSimulator
{
   public static void main(String[] args)
   {
      Die d = new Die(6);
      Die e = new Die(9);
      
      final int TRIES = 10;
      
      System.out.print("Die 1: ");
      for (int i = 1; i <= TRIES; i++)
      {  
         int n = d.cast();
         System.out.print(n + " ");
      }
      System.out.println();
      
      System.out.print("Die 2: ");
      for (int i = 1; i <= TRIES; i++)
      {  
         int n = e.cast();
         System.out.print(n + " ");
      }
      System.out.println();
   }
}
