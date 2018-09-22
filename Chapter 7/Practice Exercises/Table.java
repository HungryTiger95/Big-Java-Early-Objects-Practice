
/**
 * Consider the Following Class:
 * 
 * Add a method that computes the average of the neighbors of a table in the
 * eight directions shown in Figure 15.
 * 
 * 		public double neighborAverage(int row, int column)
 * 
 * However, if the element is located at the boundary of the array, only include the
 * neighbors that are in the table. For example, if row and column are both 0, there are
 * only three neighbors.
 * 
 * @author Mayuresh
 *
 */
public class Table
{
	// Instance Variables
	private int[][] values;
	private int rowLength;
	private int colLength;
	
	// Constructors
	/**
	 * Constructs a Table object given the number of rows and columns
	 * @param rows number of rows
	 * @param columns number of columns
	 */
	public Table(int rows, int columns)
	{
		this.rowLength = rows;
		this.colLength = columns;
		
		values = new int[rows][columns];
	}
	
	// Methods
	/**
	 * Sets a value for a given element in the Table
	 * @param row row
	 * @param column column
	 * @param n value
	 */
	public void set(int row, int column, int n)
	{	
		values[row][column] = n;
	}
	
	/**
	 * Gets the value at a given location in the Table
	 * @param row row
	 * @param column column
	 * @return value at the location
	 */
	public int getValAt(int row, int column)
	{
		return values[row][column];
	}
	
	/**
	 * Gets the length of each row
	 * @return rowLength
	 */
	public int getRowLength()
	{
		return rowLength;
	}
	
	/**
	 * Gets the length of each column
	 * @return colLength
	 */
	public int getColumnLength()
	{
		return colLength;
	}
	
	/**
	 * Prints the Table
	 */
	public void print()
	{
		for(int i = 0; i < getRowLength(); i++)
		{
			for(int j = 0; j < getColumnLength(); j++)
			{
				if(j > 0)
				{
					System.out.print(" | ");
				}
				System.out.printf("%3d", values[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	/**
	 * Returns true if the given value is in the Table
	 * @param val value to be tested for
	 * @return true if value is in Table, false if not
	 */
	public boolean isValue(int val)
	{
		boolean isVal = false;
		
		for(int i = 0; i < values.length; i++)
		{
			for(int j = 0; j < values[i].length; j++)
			{
				if(values[i][j] == val)
				{
					isVal = true;
					break;
				}
			}
			
			if(isVal == true)
			{
				break;
			}
		}
		
		return isVal;
	}
	
	public double neighborAverage(int row, int column)
	{
		double sum = 0;
		double average;
		
		// If the input is top left corner
		if(row == 0 && column == 0)
		{
			sum = getValAt(row, column + 1) + getValAt(row + 1, column) +
					getValAt(row + 1, column + 1);
			average = sum / 3.0;
		}
		// If the input is top right corner
		else if(row == 0 && column == colLength - 1)
		{
			sum = getValAt(row, column - 1) + getValAt(row + 1, column - 1) +
					getValAt(row + 1, column);
			average = sum / 3.0;
		}
		// If the input is bottom left corner
		else if(row == rowLength - 1 && column == 0)
		{
			sum = getValAt(row - 1, column) + getValAt(row - 1, column + 1) +
					getValAt(row, column + 1);
			average = sum / 3.0;
		}
		// If the input is the bottom right
		else if(row == rowLength - 1 && column == colLength - 1)
		{
			sum = getValAt(row - 1, column - 1) + getValAt(row, column - 1) +
					getValAt(row - 1, column);
			average = sum / 3.0;
		}
		// If the input is on top row
		else if(row == 0 && (column > 0 && column < colLength - 1))
		{
			sum = getValAt(row, column - 1) + getValAt(row, column + 1) +
					getValAt(row + 1, column - 1) + getValAt(row + 1, column) +
					getValAt(row + 1, column + 1);
			average = sum / 5.0;
		}
		// If the input is on the bottom row
		else if(row == rowLength - 1 && (column > 0 && column < colLength - 1))
		{
			sum = getValAt(row, column - 1) + getValAt(row, column + 1) +
					getValAt(row - 1, column -1) + getValAt(row - 1, column) +
					getValAt(row - 1, column + 1);
			average = sum / 5.0;
		}
		// If the input is on the left side
		else if((row > 0 && row < rowLength) && (column == 0))
		{
			sum = getValAt(row - 1, column) + getValAt(row - 1, column + 1) +
					getValAt(row, column + 1) + getValAt(row + 1, column + 1) +
					getValAt(row + 1, column);
			average = sum / 5.0;
		}
		// If the input is on the right side
		else if((row > 0 && row < rowLength) && (column == colLength - 1))
		{
			sum = getValAt(row - 1, column) + getValAt(row - 1, column - 1) +
					getValAt(row, column - 1) + getValAt(row + 1, column) +
					getValAt(row + 1, column - 1);
			average = sum / 5.0;
		}
		// If the input is any other one
		else
		{
			sum = getValAt(row - 1, column - 1) + getValAt(row - 1, column) +
					getValAt(row - 1, column + 1) + getValAt(row, column - 1) +
					getValAt(row, column + 1) + getValAt(row + 1, column - 1) +
					getValAt(row + 1, column) + getValAt(row + 1, column + 1);
			average = sum / 8.0;
		}
		
		return average;
	}
}
