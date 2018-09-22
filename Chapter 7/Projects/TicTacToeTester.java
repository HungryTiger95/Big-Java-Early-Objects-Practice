
public class TicTacToeTester
{
	public static void main(String[] args)
	{
		TicTacToeBoard board = new TicTacToeBoard();
		
		board.addX(0, 0);
		board.addO(1, 2);
		board.addX(0, 2);
		board.addO(0, 1);
		board.addX(1, 1);
		board.addO(1, 0);
		board.addX(2, 0);
		
		board.printBoard();
		
		System.out.println("Win? " + board.isWinner() + "\nWin Status: " + board.getWinStatus());
	}
}
