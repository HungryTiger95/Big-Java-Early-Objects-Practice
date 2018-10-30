package worked_example_02;

import java.util.Arrays;

/**
   A Towers of Hanoi puzzle with three towers.
*/
public class TowersOfHanoi
{
   private Tower[] towers;

   /**
      Constructs a puzzle in which the first tower has a given number of disks.
      @param ndisks the number of disks
   */
   public TowersOfHanoi(int ndisks)
   {
      towers = new Tower[3];
      towers[0] = new Tower(ndisks);
      towers[1] = new Tower(0);
      towers[2] = new Tower(0);
   }

   /**
      Moves a pile of disks from one peg to another and displays the movement.
      @param disks the number of disks to move
      @param from the peg from which to move the disks
      @param to the peg to which to move the disks
   */
   public void move(int disks, int from, int to)
   {
      if (disks > 0) 
      {
         int other = 3 - from - to;
         move(disks - 1, from, other);      
         towers[to].add(towers[from].remove());
         System.out.println(Arrays.toString(towers));
         move(disks - 1, other, to);
      }
   }
}

