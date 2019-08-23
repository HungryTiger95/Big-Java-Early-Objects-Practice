package section_04;

import java.util.Iterator;

/**
   This program demonstrates tree traversal.
*/
public class TraversalDemo
{
   public static void main(String[] args)
   {
      Tree t1 = new Tree("Anne");
      Tree t2 = new Tree("Peter");
      t1.addSubtree(t2);
      Tree t3 = new Tree("Zara");
      t1.addSubtree(t3);
      Tree t4 = new Tree("Savannah");
      t2.addSubtree(t4);

      // Count short names with visitor
      class ShortNameCounter implements Tree.Visitor
      {
         public int counter = 0;
         public void visit(Object data)
         {
            System.out.println(data);
            if (data.toString().length() <= 5) { counter++; }
         }
      }

      ShortNameCounter v = new ShortNameCounter();

      t1.preorder(v);
      System.out.println("Short names: " + v.counter);

      // Count short names with iterator
      Iterator iter = t1.iterator();
      int counter = 0;
      while (iter.hasNext())
      {
         Object data = iter.next();
         System.out.println(data);
         if (data.toString().length() <= 5) { counter++; }
      }
      System.out.println("Short names: " + counter);         
   }
}
