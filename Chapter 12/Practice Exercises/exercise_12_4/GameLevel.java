package exercise_12_4;

import java.util.Random;

public class GameLevel
{
	// Instance Variables
	private int level;
	private int argA, argB, answer;
	
	// Constructors
	/**
	 * Constructs a game level with the level set to 1
	 */
	public GameLevel()
	{
		this.level = 1;
	}
	
	/**
	 * Constructs a game level given the level
	 * @param level the level
	 */
	public GameLevel(int level)
	{
		this.level = level;
	}
	
	// Methods
	public void setLevel(int level)
	{
		this.level = level;
	}
	
	/**
	 * Increases the level of the game. Throws an exception if the level is the max
	 */
	public void upLevel()
	{
		if(this.level == 3)
		{
			throw new IllegalArgumentException("Cannot Increase Level");
		}
		else
		{
			this.level++;
		}
	}
	
	/**
	 * Decreases the level of the game. Throws an exception if the level is the min
	 */
	public void downLevel()
	{
		if(this.level == 1)
		{
			throw new IllegalArgumentException("Cannot Decrease Level");
		}
		else
		{
			this.level--;
		}
	}
	
	/**
	 * Gets the level
	 * @return the level
	 */
	public int getLevel()
	{
		return this.level;
	}
	
	/**
	 * Sets the answer for this level
	 * @param answer the answer
	 */
	public void setAnswer(int answer)
	{
		this.answer = answer;
	}
	
	/**
	 * Gets the answer for this level
	 * @return the answer
	 */
	public int getAnswer()
	{
		return this.answer;
	}
	
	/**
	 * Gets the first argument in the question
	 * @return the first argument
	 */
	public int getArgA()
	{
		return this.argA;
	}
	
	/**
	 * Gets the second argument in the question
	 * @return the second argument
	 */
	public int getArgB()
	{
		return this.argB;
	}
	
	/**
	 * Generates the question components. The first and second arguments are randomly selected
	 * and the answer is calculated based on the level
	 * @return the calculated answer
	 */
	public void generateQuestion()
	{
		Random gen = new Random();
		
		// Addition where sum is less than 10
		if(this.level == 1)
		{
			do
			{
				this.argA = gen.nextInt(9) + 1;
				this.argB = gen.nextInt(9) + 1;
				
				this.answer = this.argA + this.argB;
			}
			while(this.answer > 9);
		}
		// Addition where sum can be any number
		else if(this.level == 2)
		{
			this.argA = gen.nextInt(9) + 1;
			this.argB = gen.nextInt(9) + 1;
			
			this.answer = this.argA + this.argB;
		}
		// Subtraction where sum is any positive integer
		else if(this.level == 3)
		{
			do
			{
				this.argA = gen.nextInt(9) + 1;
				this.argB = gen.nextInt(9) + 1;
				
				this.answer = this.argA - this.argB;
			}
			while(this.answer < 0);
		}
		else
		{
			throw new IllegalArgumentException("Oops. Something went wrong. ERROR: 100");
		}
	}
}
