package exercise_12_4;

import java.util.Scanner;

/**
 * Write a program that teaches arithmetic to a young child. The program tests addition
 * and subtraction. In level 1, it tests only addition of numbers less than 10 whose sum
 * is less than 10. In level 2, it tests addition of arbitrary one-digit numbers. In level 3, it
 * tests subtraction of one-digit numbers with a nonnegative difference.
 * 
 * Generate random problems and get the player's input. The player gets up to two
 * tries per problem. Advance from one level to the next when the player ha achieved a
 * score of five points.
 * 
 * @author Mayuresh
 *
 */
public class MathGame
{
	// Instance Variables
	private Player player;
	private GameLevel level;
	
	private int playerAnswer;
	
	// Constructors
	public MathGame(String playerName)
	{
		player = new Player(playerName);
		level = new GameLevel();
	}
	
	// Methods
	/**
	 * Puts the game into motion. These are the instructions that are carried out for the game to work
	 */
	public void play()
	{
		Scanner in = new Scanner(System.in);
		
		displayGreeting();
		
		// Play the game until you reach 15 points
		while(this.player.getPoints() < 15)
		{
			// Display the game information first
			displayGameInformation();
			
			// Generate a Question
			this.level.generateQuestion();
			System.out.println("Answer: " + this.level.getAnswer());
			
			// Display the Question
			displayQuestion();
			
			// Ask for the answer 
			System.out.print("Enter Your Answer: ");
			this.playerAnswer = in.nextInt();
			
			// Check the answer and give two more tries
			while(!checkAnswer() && this.player.getTries() > 0)
			{
				System.out.print("Enter Your Answer: ");
				this.playerAnswer = in.nextInt();
			}
			this.player.resetTries();
			
			// Check if the player leveled up
			if(this.player.getPoints() == 15)
			{
				System.out.println("Congratulations! You Won!");
			}
			else if(this.player.getPoints() == 10)
			{
				this.level.upLevel();
				displayLevelUp();
			}
			else if(this.player.getPoints() == 5)
			{
				this.level.upLevel();
				displayLevelUp();
			}
			
			System.out.println("\n\n");
		}
		in.close();
	}
	
	/**
	 * Checks the answer
	 * @return true if the answer matches with the correct answer, false if not
	 */
	public boolean checkAnswer()
	{
		if(this.playerAnswer == level.getAnswer())
		{
			System.out.println("Correct Answer! You Earn 1 Point!");
			this.player.addPoint();
			
			return true;
		}
		else
		{
			this.player.decrementTries();
			System.out.println("Wrong Answer! You Have: " + this.player.getTries() + " tries!");
			
			return false;
		}
	}
	
	/**
	 * Displays the initial greeting
	 */
	public void displayGreeting()
	{
		System.out.println("Welcome to the Math Game! Please Take a Seat!\n\n");
	}
	
	/**
	 * Displays the game information such as the level and the points the player has
	 */
	public void displayGameInformation()
	{
		System.out.printf("Level:%-15dPoints: %-15d\n", this.level.getLevel(), this.player.getPoints());
		System.out.println("===============================");
	}
	
	/**
	 * Displays the current question
	 */
	public void displayQuestion()
	{
		if(this.level.getLevel() == 1 || this.level.getLevel() == 2)
		{
			System.out.println("Question ---> " + level.getArgA() + " + " + level.getArgB() + " = ?");
		}
		else
		{
			System.out.println("Question ---> " + level.getArgA() + " - " + level.getArgB() + " = ?");
		}
	}
	
	/**
	 * Displays a message when the player levels up
	 */
	public void displayLevelUp()
	{
		System.out.println("You Leveled Up! Congratulations!");
	}
}
