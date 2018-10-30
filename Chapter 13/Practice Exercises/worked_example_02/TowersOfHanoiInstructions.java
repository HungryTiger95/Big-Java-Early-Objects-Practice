package worked_example_02;

/**
   This program prints instructions for solving a Towers of Hanoi puzzle.
*/
public class TowersOfHanoiInstructions
{
   public static void main(String[] args)
   {
      move(5, 1, 3);
   }

   /**
      Print instructions for moving a pile of disks from one peg to another.
      @param disks the number of disks to move
      @param from the peg from which to move the disks
      @param to the peg to which to move the disks
   */
   public static void move(int disks, int from, int to)
   {
      if (disks > 0) 
      {
         int other = 6 - from - to;
         move(disks - 1, from, other);
         System.out.println("Move disk from peg " + from + " to " + to);
         move(disks - 1, other, to);
      }
   }
}
