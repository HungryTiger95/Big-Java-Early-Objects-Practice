package worked_example_02;

import java.util.ArrayList;

/**
   A tower containing disks in the Towers of Hanoi puzzle.
*/
public class Tower
{
   private ArrayList<Integer> disks;

   /**
      Constructs a tower holding a given number of disks of decreasing size.
      @param ndisks the number of disks
   */
   public Tower(int ndisks)
   {
      disks = new ArrayList<Integer>();
      for (int d = ndisks; d >= 1; d--) { disks.add(d); }
   }

   /**
      Removes the top disk from this tower.
      @return the size of the removed disk
   */
   public int remove()
   {      
      return disks.remove(disks.size() - 1);
   }

   /**
      Adds a disk to this tower.
      @param size the size of the disk to add
   */
   public void add(int size)
   {
      if (disks.size() > 0 && disks.get(disks.size() - 1) < size)
      {
         throw new IllegalStateException("Disk is too large");
      }
      disks.add(size);
   }

   public String toString() { return disks.toString(); }   
}

