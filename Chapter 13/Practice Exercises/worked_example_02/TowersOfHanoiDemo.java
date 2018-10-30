package worked_example_02;

/**
   This program shows a solution for a Towers of Hanoi puzzle.
*/
public class TowersOfHanoiDemo
{
   public static void main(String[] args)
   {
      final int NDISKS = 5;
      TowersOfHanoi towers = new TowersOfHanoi(NDISKS);
      towers.move(NDISKS, 0, 2);
   }
}
