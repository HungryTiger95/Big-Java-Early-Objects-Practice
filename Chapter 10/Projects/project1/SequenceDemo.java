package project1;

public class SequenceDemo
{
   public static void main(String[] args)
   {
      LastDigitDistribution dist1 = new LastDigitDistribution();
      dist1.process(new SquareSequence(), 200);
      dist1.display();
      System.out.println();

      LastDigitDistribution dist2 = new LastDigitDistribution();
      dist2.process(new RandomSequence(), 200);
      dist2.display();
   }
}
