import java.util.Random;
import java.util.Scanner;

/**
 * P6.5
 * 
 * The game of Nim. This is a well-known game with a number of variants. The following
 * variant has an interesting winning strategy. Two players alternately take marbles from a pile.
 * In each move, a player chooses how many marbles to take. The player must take at least one but at
 * most half of the marbles. Then the other player takes a turn. the player who takes the last marble loses.
 * 
 * Write a program in which the computer plays against a human opponent. Generate a random integer
 * between 10 and 100 to denote the initial size of the pile. Generate a random integer between
 * 0 and 1 to decide whether the computer or the human takes the first turn. Generate a random integer
 * between 0 and 1 to decide whether the computer plays smart or stupid. In stupid mode the computer
 * simply takes a random legal value (between 1 and n/2) from the pile whenever it has a turn. In smart
 * mode the computer takes off enough marbles to make the size of the pile a power of two minus 1 - that
 * is, 3, 7, 15, 31, or 63. That is always a legal move, except when the size of the pile is currently
 * one less than a power of two. In that case, the computer makes a random legal move.
 * 
 * You will note that the computer cannot be beaten in smart mode when it has the first move, unless
 * the pile size happens to be 15, 31, or 63. Of course, a human player who has the first turn and knows
 * the winning strategy can win against the computer.
 * 
 * Game Probably is working perfectly. Took too much to perfect it.
 * Note: more testing may be needed for SMART mode.
 * 
 * @author Mayuresh
 *
 */
public class Nim
{
	// Variables
	public static int initialSize;
	public static int pileSize;
	public static int turn;
	public static int compLevel;
	public static int playerChoice;
	public static int computerChoice;
	
	// Main Method
	public static void main(String[] args)
	{
		Random gen = new Random();
		Scanner in = new Scanner(System.in);
		
		// Random Number for Initial Size
		initialSize = gen.nextInt(100) + 1;
		pileSize = initialSize;
		
		System.out.println("Pile Size: " + getPileSize());
		System.out.println("Initial Pile: " + getInitialSize() + "\n");
		
		// Random Number for First Player
		int pickTurn = gen.nextInt(2);
		if(pickTurn == 0)
		{
			turn = 0;
		}
		else
		{
			turn = 1;
		}
		
		// Random Number for Computer Level
		int compLevel = gen.nextInt(2);
		if(compLevel == 0)
		{
			System.out.println("COMPUTER SET TO STUPID\n");
		}
		else
		{
			System.out.println("COMPUTER SET TO SMART\n");
		}
		
		// Play the Game
		while(pileSize > 0)
		{
			// Plays game based on computer level
			if(compLevel == 0)
			{
				// Who's turn is it?
				if(turn == 0)
				{
					System.out.println("COMPUTER'S TURN!");
					
					// pick random number between 1 and (n / 2)
					if(pileSize == 1)
					{
						computerChoice = 1;
					}
					else
					{
						computerChoice = gen.nextInt(getPileSize() / 2) + 1;
					}
					
					// update pile size
					System.out.println("Pile Size Before: " + getPileSize());
					
					pileSize -= computerChoice;
					
					// output values
					
					System.out.println("COMPUTER CHOOSES: " + computerChoice);
					System.out.println("Pile Size After: " + getPileSize());
					
					// if the last turn is the computers, the player wins
					if(pileSize == 0)
					{
						System.out.println("Player Wins!");
					}
				}
				else
				{
					System.out.println("PLAYER'S TURN!");
					
					// Enter a number between 1 and n / 2
					System.out.print("Enter a Number Between 1 and " + (getPileSize() / 2) + ": ");
					playerChoice  = in.nextInt();
					
					// Update pile size
					System.out.println("Pile Size Before: " + getPileSize());
					pileSize -= playerChoice;
					
					// Output values
					System.out.println("PLAYER CHOOSES: " + playerChoice);
					System.out.println("Pile Size After: " + getPileSize());
					
					// if the last turn is the players, the computer wins
					if(pileSize == 0)
					{
						System.out.println("Computer Wins!");
					}
				}
			}
			else
			{
				// Who's turn is it?
				if(turn == 0)
				{
					System.out.println("COMPUTER'S TURN!");
					
					// Pick a number that's enough to make the pile size 3, 7, 15, 31, or 63
					for(int i = pileSize / 2; i > 0; i--)
					{
						if(pileSize - i == 3 || pileSize - i == 7 || pileSize - i == 15 || pileSize - i == 31 || pileSize - i == 63)
						{
							computerChoice = i;
							break;
						}
					}
					
					// Update pile size
					System.out.println("Pile Size Before: " + getPileSize());
					pileSize -= computerChoice;
					
					// Output values
					System.out.println("COMPUTER CHOICE: " + computerChoice);
					System.out.println("Pile Size After: " + getPileSize());
					
					// if computer chooses last marble, player wins
					if(pileSize == 0)
					{
						System.out.println("Player Wins!");
					}
				}
				else
				{
					System.out.println("PLAYER'S TURN!");
					
					// Enter a number between 1 and n / 2
					System.out.print("Enter a Number Between 1 and " + (getPileSize() / 2) + ": ");
					playerChoice  = in.nextInt();
					
					// Update pile size
					System.out.println("Pile Size Before: " + getPileSize());
					pileSize -= playerChoice;
					
					// Output values
					System.out.println("PLAYER CHOOSES: " + playerChoice);
					System.out.println("Pile Size After: " + getPileSize());
					
					// if the last turn is the players, the computer wins
					if(pileSize == 0)
					{
						System.out.println("Computer Wins!");
					}					
				}
			}
			
			nextTurn();
			System.out.println("===============================");
		}
		
		in.close();
	}
	
	// Methods
	/**
	 * Sets the pile size
	 * @param n pileSize
	 */
	public static void setPileSize(int n)
	{
		pileSize = n;
	}
	
	/**
	 * Sets the initial pile size
	 * @param n initialPileSize
	 */
	public static void setInitialSize(int n)
	{
		initialSize = n;
	}
	
	/**
	 * Checks whether pile size is a power of 2 - 1
	 * @return isPower
	 */
	public static boolean isPowerOf2(int num)
	{
		boolean isPower = false;
		
		for(int i = 0; i < 8; i++)
		{
			if(num == Math.pow(2, i) - 1)
			{
				isPower = true;
			}
			else
			{
				isPower = false;
			}
		}
		
		return isPower;
	}
	
	/**
	 * Gets the pile size
	 * @return pileSize
	 */
	public static int getPileSize()
	{
		return pileSize;
	}
	
	/**
	 * Get the initial pile size
	 * @return initialSize
	 */
	public static int getInitialSize()
	{
		return initialSize;
	}
	
	/**
	 * Changes the turn to the next player
	 * @return turn
	 */
	public static int nextTurn()
	{
		if(turn == 0)
		{
			turn = 1;
		}
		else
		{
			turn = 0;
		}
		
		return turn;
	}
}
