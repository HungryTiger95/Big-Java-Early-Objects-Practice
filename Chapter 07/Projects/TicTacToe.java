import java.util.Random;
import java.util.Scanner;

/**
 * Write a program that plays tic-tac-toe. The tic-tac-toe game is played on a 3 x 3 grid.
 * The game is played by two players who take turns. The first player marks moves with a
 * circle, the second with a cross. The player who has formed a horizontal, vertical, or
 * diagonal sequence of three marks wins. Your program should draw the game board, ask the
 * user for the coordinates of the next mark, change the players after every successful move,
 * and pronounce the winner.
 * 
 * @author Mayuresh
 *
 */
public class TicTacToe
{
	public static TicTacToeBoard game = new TicTacToeBoard();
	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		Player player1 = new Player("Mayo", "X");
		Player player2 = new Player("Arju", "O");
		
		// Initialize the game
		
		System.out.println("Welcome to Tic-Tac-Toe!");
		game.addPlayers(player1, player2);
		
		// Randomly pick a player
		
		Random gen = new Random();
		if(gen.nextInt(2) == 0)
		{
			game.setCurrentPlayer(player1);
		}
		else
		{
			game.setCurrentPlayer(player2);
		}
		
		boolean finished = false;
		
		// Start the Game
		while(!finished)
		{
			System.out.println("Current Player: " + game.getCurrentPlayer().getName());
			
			if(game.getCurrentPlayer().equals(player1))
			{
				chooseCoordinates();
			}
			else if(game.getCurrentPlayer().equals(player2))
			{
				chooseCoordinates();
			}
			else
			{
				System.out.println("Something went wrong in current player: ");
				break;
			}
			
			// Check if there is a win, otherwise switch players
			if(game.isWinner())
			{
				finished = true;
			}
			else
			{
				game.switchPlayer();
			}
			
			game.printBoard();
		}
		
		System.out.println(game.getCurrentPlayer().getName() + " is the Winner!");
		game.printBoard();
		
		in.close();
	}

	/**
	 * Asks the user to choose coordinates to place an x or o
	 */
	private static void chooseCoordinates()
	{
		// Ask user to enter values for i and j
		System.out.print("Enter [i]: ");
		int i = in.nextInt();
		
		System.out.print("Enter [j]: ");
		int j = in.nextInt();
		
		// Add a x or o on the board using these coordinates
		if(game.getCurrentPlayer().getPiece().equals("O"))
		{
			game.addO(i, j);
		}
		else if(game.getCurrentPlayer().getPiece().equals("X"))
		{
			game.addX(i, j);
		}
		else
		{
			System.out.println("PROBLEM IN CURRENT PLAYER");
		}
	}
}
