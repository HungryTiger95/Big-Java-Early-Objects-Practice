import java.util.Random;

public class Die
{
	// Instance Variables
	private int sides;
	private Random gen = new Random();
	
	// Constructors
	/**
	 * Constructs a die with a given number of sides
	 * @param numOfSides the number of sides of the die
	 */
	public Die(int numOfSides)
	{
		this.sides = numOfSides;
	}
	
	// Methods
	/**
	 * Rolls the die to return a random value between 1 and the number of sides
	 * @return the roll of the die
	 */
	public int roll()
	{
		int faceVal = gen.nextInt(this.sides) + 1;
		return faceVal;
	}
	
	/**
	 * Gets the number of sides on the die
	 * @return the number sides on the die
	 */
	public int getNumOfSides()
	{
		return this.sides;
	}
}
