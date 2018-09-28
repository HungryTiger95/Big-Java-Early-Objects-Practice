package project4;

public class SequenceDemo
{
   public static void main(String[] args)
   {
	   StopWatch t = new StopWatch();
	   
	   LastDigitDistribution dist1 = new LastDigitDistribution();
	   
	   t.start();
	   dist1.process(new SquareSequence(), 200);
	   t.stop();
	   
	   dist1.display();
	   System.out.println("Elapsed Time For Last Digit Dis. (Square): " + t.getElapsedTime() + " milliseconds\n");
	   t.reset();
	   
	   LastDigitDistribution dist2 = new LastDigitDistribution();
	   
	   t.start();
	   dist2.process(new RandomSequence(), 200);
	   t.stop();
	   
	   dist2.display();
	   System.out.println("Elapsed Time For Last Digit Dis. (Random): " + t.getElapsedTime() + " milliseconds\n");
	   t.reset();
	   
	   FirstDigitDistribution dist3 = new FirstDigitDistribution();
	   
	   t.start();
	   dist3.process(new RandomSequence(), 200);
	   t.stop();
	   
	   dist3.display();
	   System.out.println("Elapsed Time For First Digit Dis. (Random): " + t.getElapsedTime() + " milliseconds\n");
	   t.reset();
	   
	   PrimeSequenceGenerator primeGen = new PrimeSequenceGenerator();
	   
	   t.start();
	   primeGen.process(new PrimeSequence(), 200);
	   t.stop();
	   
	   primeGen.display();
	   System.out.println("\nElapsed Time For Finding Primes: " + t.getElapsedTime() + " milliseconds\n");
	   t.reset();
   }
}
