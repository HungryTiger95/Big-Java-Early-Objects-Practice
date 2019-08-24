package section_01;

public class UnsafeDemo
{
   public static void main(String[] args)
   {
      // Here, we use the linked list class from Chapter 16
      LinkedList numbers = new LinkedList();
      numbers.addFirst(1);
      numbers.addFirst(2);
      numbers.addFirst(3);
      print(numbers);
      System.out.println("Sum: " + sum(numbers));
      numbers.addFirst("4"); // No error message
      print(numbers); // No error
      System.out.println("Sum: " + sum(numbers));
         // ClassCastException
   }

   public static void print(LinkedList lst)
   {
      ListIterator iter = lst.listIterator();
      while (iter.hasNext())
      {
         System.out.print(iter.next() + " ");
      }
      System.out.println();
   }

   public static int sum(LinkedList lst)
   {
      int sum = 0;
      ListIterator iter = lst.listIterator();
      while (iter.hasNext())
      {
         sum = sum + (Integer) iter.next();
      }
      return sum;
   }
}
