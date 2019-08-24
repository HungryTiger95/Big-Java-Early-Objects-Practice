package section_01;

import java.util.ArrayList;
import java.util.Iterator;

public class UnsafeDemo2
{
   public static void main(String[] args)
   {
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      numbers.add(1);
      numbers.add(2);
      numbers.add(3);
      print(numbers);
      System.out.println("Sum: " + sum(numbers));
      //numbers.add("4"); // Compiler error message
      print(numbers); 
      System.out.println("Sum: " + sum(numbers));
   }

   public static void print(ArrayList<Integer> lst)
   {
      Iterator<Integer> iter = lst.iterator();
      while (iter.hasNext())
      {
         System.out.print(iter.next() + " ");
      }
      System.out.println();
   }

   public static int sum(ArrayList<Integer> lst)
   {
      int sum = 0;
      Iterator<Integer> iter = lst.iterator();
      while (iter.hasNext())
      {
         sum = sum + iter.next(); // No cast needed
      }
      return sum;
   }
}
