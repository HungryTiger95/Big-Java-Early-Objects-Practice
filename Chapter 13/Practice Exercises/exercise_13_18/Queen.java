package exercise_13_18;

/**
 * A queen in the eight queens problem
 * 
 * @author Mayuresh
 *
 */
public class Queen
{
	// Instance Variables
	private int row;
	private int column;
	
	// Constructors
	/**
	 * Constructs a queen at a given position
	 * @param row the row
	 * @param column the column
	 */
	public Queen(int row, int column)
	{
		this.row = row;
		this.column = column;
	}
	
	// Methods
	/**
	 * Checks whether this queen attacks another queen
	 * 
	 * Expanation:
	 * Easy way of checking if two queens attack each other --->
	 * 
	 * Compute the slope and check whether it is +-1. This condition can be simplified to:
	 * 
	 * 		(row2 - row1) / (column2 - column1) = +-1 --->
	 * 		(row2 - row1) = +-(column2 - column1) --->
	 * 		|row2 - row1| = |column2 - column1|
	 * 
	 * @param otherQueen the other queen
	 * @return true if this and the other queen are in the same row, column, or diagonal
	 */
	public boolean attacks(Queen otherQueen)
	{
		return this.row == otherQueen.row
				|| this.column == otherQueen.column
				|| Math.abs(this.row - otherQueen.row) == Math.abs(this.column - otherQueen.column);
	}
	
	public String toString()
	{
		return "" + "abcdefghijklmnopqrstuvwxyz".charAt(this.column) + (this.row + 1);
	}
}
