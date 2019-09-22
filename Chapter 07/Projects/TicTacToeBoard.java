
public class TicTacToeBoard
{
	// Instance Variables
	private String[][] board =
		{
				{"[ ]", "[ ]", "[ ]"},
				{"[ ]", "[ ]", "[ ]"},
				{"[ ]", "[ ]", "[ ]"}
		};
	
	private boolean winStatus = false;
	private Player currentPlayer;
	private Player player1;
	private Player player2;
	
	// Constructors

	// Methods
	/**
	 * Gets player 1
	 * @return player1
	 */
	public Player getPlayer1()
	{
		return player1;
	}
	
	/**
	 * Gets player2
	 * @return player2
	 */
	public Player getPlayer2()
	{
		return player2;
	}
	
	/**
	 * Switches who the current player is
	 */
	public void switchPlayer()
	{
		if(getCurrentPlayer().equals(player1))
		{
			setCurrentPlayer(player2);
		}
		else
		{
			setCurrentPlayer(player1);
		}
	}
	/**
	 * Sets the current player
	 * @param player
	 */
	public void setCurrentPlayer(Player player)
	{
		currentPlayer = player;
	}
	/**
	 * Gets the current player details
	 * @return currentPlayer
	 */
	public Player getCurrentPlayer()
	{
		return currentPlayer;
	}
	/**
	 * Adds a player to the game
	 * @param player player
	 */
	public void addPlayers(Player player1, Player player2)
	{
		this.player1 = player1;
		this.player2 = player2;
	}
	
	/**
	 * Adds an x on the board
	 * @param i 
	 * @param j
	 * @param player
	 */
	public void addX(int i, int j)
	{
		board[i][j] = "[X]";
	}
	
	/**
	 * Adds an o on the board
	 * @param i
	 * @param j
	 * @param player
	 */
	public void addO(int i, int j)
	{
		board[i][j] = "[O]";
	}
	
	/**
	 * Prints the tic-tac-toe board
	 */
	public void printBoard()
	{
		for(int i = 0; i < board.length; i++)
		{
			for(int j = 0; j < board.length; j++)
			{
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	/**
	 * Checks if the player is a winner
	 * @return true if winner, else false
	 */
	public boolean isWinner()
	{	
		if(checkHori(0) || checkHori(1) || checkHori(2))
		{
			winStatus = true;
			return true;
		}
		else if(checkVert(0) || checkVert(1) || checkVert(2))
		{
			winStatus = true;
			return true;
		}
		else if(checkDiag())
		{
			winStatus = true;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Checks a horizontal if there are similar marks
	 * @param i horizontal row
	 * @return true if a win, else false
	 */
	public boolean checkHori(int i)
	{
		// Check the given row
		if((board[i][0].equals("[O]") && board[i][1].equals("[O]") && board[i][2].equals("[O]")) ||
				board[i][0].equals("[X]") && board[i][1].equals("[X]") && board[i][2].equals("[X]"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Checks a vertical if there are similar marks
	 * @param j vertical column
	 * @return true if a win, else false
	 */
	public boolean checkVert(int j)
	{
		// Check the given column
		if((board[0][j].equals("[O]") && board[1][j].equals("[O]") && board[2][j].equals("[O]")) ||
				board[0][j].equals("[X]") && board[1][j].equals("[X]") && board[2][j].equals("[X]"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Checks the diagonal if there are similar marks
	 * @return true if a win, else false
	 */
	public boolean checkDiag()
	{
		// Check both diagonals
		if((board[0][0].equals("[O]") && board[1][1].equals("[O]") && board[2][2].equals("[O]")) ||
				board[0][0].equals("[X]") && board[1][1].equals("[X]") && board[2][2].equals("[X]"))
		{
			return true;
		}
		else if((board[2][0].equals("[O]") && board[1][1].equals("[O]") && board[0][2].equals("[O]")) ||
				board[2][0].equals("[X]") && board[1][1].equals("[X]") && board[0][2].equals("[X]"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Gets whether the game has been won or not
	 * @return winStatus
	 */
	public boolean getWinStatus()
	{
		return winStatus;
	}
}
