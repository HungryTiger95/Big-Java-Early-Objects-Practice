package special_topic_1;

import java.util.NoSuchElementException;

/**
   This program tests the doubly linked list implementation.
*/
public class LinkedListTest
{
   public static void main(String[] args)
   {
      LinkedList lst = new LinkedList();
      check("", lst, "Constructing empty list");
      lst.addLast("A"); 
      check("A", lst, "Adding last to empty list");
      lst.addLast("B"); 
      check("AB", lst, "Adding last to non-empty list");

      lst = new LinkedList();
      lst.addFirst("A"); 
      check("A", lst, "Adding first to empty list");
      lst.addFirst("B"); 
      check("BA", lst, "Adding first to non-empty list");

      assertEquals("B", lst.removeFirst());
      check("A", lst, "Removing first, yielding non-empty list");
      assertEquals("A", lst.removeFirst());
      check("", lst, "Removing first, yielding empty list");

      lst = new LinkedList();
      lst.addLast("A"); 
      lst.addLast("B"); 
      check("AB", lst, "");

      assertEquals("B", lst.removeLast());
      check("A", lst, "Removing last, yielding non-empty list");
      assertEquals("A", lst.removeLast());
      check("", lst, "Removing last, yielding empty list");

      lst = new LinkedList();
      lst.addLast("A"); 
      lst.addLast("B"); 
      lst.addLast("C"); 
      check("ABC", lst, "");      

      ListIterator iter = lst.listIterator();
      assertEquals("A", iter.next());
      iter.set("D");
      check("DBC", lst, "Set element after next");
      assertEquals("D", iter.previous());
      iter.set("E");
      check("EBC", lst, "Set first element after previous");
      assertEquals("E", iter.next());
      assertEquals("B", iter.next());
      assertEquals("B", iter.previous());
      iter.set("F");
      check("EFC", lst, "Set second element after previous");      
      assertEquals("F", iter.next());
      assertEquals("C", iter.next());
      assertEquals("C", iter.previous());
      iter.set("G");
      check("EFG", lst, "Set last element after previous");      

      lst = new LinkedList();
      lst.addLast("A"); 
      lst.addLast("B"); 
      lst.addLast("C"); 
      lst.addLast("D"); 
      lst.addLast("E"); 
      check("ABCDE", lst, "");      
      iter = lst.listIterator();
      assertEquals("A", iter.next());
      iter.remove();
      check("BCDE", lst, "Remove first element after next");
      assertEquals("B", iter.next());
      assertEquals("C", iter.next());
      iter.remove();
      check("BDE", lst, "Remove middle element after next");
      assertEquals("D", iter.next());
      assertEquals("E", iter.next());
      iter.remove();
      check("BD", lst, "Remove last element after next");
      
      lst = new LinkedList();
      lst.addLast("A"); 
      lst.addLast("B"); 
      lst.addLast("C"); 
      lst.addLast("D"); 
      lst.addLast("E"); 
      check("ABCDE", lst, "");      
      iter = lst.listIterator();
      assertEquals("A", iter.next());
      assertEquals("B", iter.next());
      assertEquals("C", iter.next());
      assertEquals("D", iter.next());
      assertEquals("E", iter.next());
      assertEquals("E", iter.previous());
      iter.remove();
      check("ABCD", lst, "Remove last element after previous");
      assertEquals("D", iter.previous());
      assertEquals("C", iter.previous());
      iter.remove();
      check("ABD", lst, "Remove middle element after previous");
      assertEquals("B", iter.previous());
      assertEquals("A", iter.previous());
      iter.remove();
      check("BD", lst, "Remove first element after previous");

      lst = new LinkedList();
      lst.addLast("B"); 
      lst.addLast("C"); 
      check("BC", lst, "");      
      iter = lst.listIterator();
      iter.add("A");
      check("ABC", lst, "Add first element");
      assertEquals("B", iter.next());
      iter.add("D");
      check("ABDC", lst, "Add middle element");
      assertEquals("C", iter.next());
      iter.add("E");
      check("ABDCE", lst, "Add last element");      
   }

   /**
      Checks whether two objects are equal and throws an exception if not.
      @param expected the expected value
      @param actual the actual value
   */
   public static void assertEquals(Object expected, Object actual)
   {
      if (expected == null && actual != null ||
         !expected.equals(actual))
      {
         throw new AssertionError("Expected " + expected + " but found " + actual);
      }
   }

   /**
      Checks whether a linked list has the expected contents, and throws
      an exception if not.
      @param expected the letters that are expected in each node
      @param actual the linked list
      @param what a string explaining what has been tested. It is 
      included in the message that is displayed when the test passes.
   */
   public static void check(String expected, LinkedList actual, String what)
   {
      int n = expected.length();
      if (n > 0)
      {
         // Check first and last reference       
         assertEquals(expected.substring(0, 1), actual.getFirst());
         assertEquals(expected.substring(n - 1), actual.getLast());

         // Check next references
         ListIterator iter = actual.listIterator();
         for (int i = 0; i < n; i++)
         {
            assertEquals(true, iter.hasNext());
            assertEquals(expected.substring(i, i + 1), iter.next());
         }
         assertEquals(false, iter.hasNext());

         // Check previous references
         for (int i = n - 1 ; i >= 0; i--)
         {
            assertEquals(true, iter.hasPrevious());
            assertEquals(expected.substring(i, i + 1), iter.previous());
         }
         assertEquals(false, iter.hasPrevious());
      }
      else
      {
         // Check that first and last are null
         try
         {
            actual.getFirst();
            throw new IllegalStateException("first not null");
         }
         catch (NoSuchElementException ex) 
         {
         }

         try
         {
            actual.getLast();
            throw new IllegalStateException("last not null");
         }
         catch (NoSuchElementException ex)
         {
         }                
      }
      if (what.length() > 0)
      {
         System.out.println("Passed \"" + what + "\"."); 
      }
   }
}
