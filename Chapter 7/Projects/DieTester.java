
public class DieTester
{
	public static void main(String[] args)
	{
		Die die1 = new Die(6);
		Die die2 = new Die(8);
		
		System.out.println("Number of Sides Die 1: " + die1.getNumOfSides());
		System.out.println("Number of Sides Die 2: " + die2.getNumOfSides());
		
		System.out.println("Die 1 Roll: " + die1.roll());
		System.out.println("Die 2 Roll: " + die2.roll());
	}
}
