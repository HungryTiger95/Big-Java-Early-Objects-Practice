package section_06;

import java.util.ArrayList;

public class Maze
{
	// Instance Variables
	private String[] cells;
	
	// Constructors
	/**
	 * Constructs a maze from a string describing its contents
	 * @param contents strings consisting of * and spaces
	 */
	public Maze(String[] contents)
	{
		this.cells = contents;
	}
	
	// Methods
	/**
	 * Gets all paths emanating from a position in the maze
	 * @param row the row of the position
	 * @param column the column of the position
	 * @return all paths emanating from the position
	 */
	public ArrayList<Path> pathsFrom(int row, int column)
	{
		ArrayList<Path> paths = new ArrayList<Path>();
		
		if(isValid(row - 1, column))
		{
			paths.add(new Path(row, column, Path.NORTH));
		}
		
		if(isValid(row, column + 1))
		{
			paths.add(new Path(row, column, Path.EAST));
		}
		
		if(isValid(row + 1, column))
		{
			paths.add(new Path(row, column, Path.SOUTH));
		}
		
		if(isValid(row, column - 1))
		{
			paths.add(new Path(row, column, Path.WEST));
		}
		
		for(Path p : paths)
		{
			extend(p);
		}
		
		return paths;
	}
	
	/**
	 * Extends this path to the next exit, intersection, or dead end
	 * @param p the path to extend
	 */
	private void extend(Path p)
	{
		boolean done = false;
		while(!done)
		{
			p.move();
			
			int row = p.getEndingRow();
			int column = p.getEndingColumn();
			
			if(isExit(row, column) || countNeighbors(row, column) != 2)
			{
				done = true;
			}
			else
			{
				row = p.getNextRow();
				column = p.getNextColumn();
				
				if(!isValid(row, column))
				{
					p.turn();
					row = p.getNextRow();
					column = p.getNextColumn();
					
					if(!isValid(row, column))
					{
						p.turn();
						p.turn();
					}
				}
			}
		}
	}
	
	/**
	 * Checks whether a position is an exit
	 * @param row the row of the position
	 * @param column the column of the position
	 * @return true if the position is an exit
	 */
	public boolean isExit(int row, int column)
	{
		return (row == 0 || row == cells.length - 1 || column == 0 || column == cells[row].length() - 1)
				&& (cells[row].charAt(column) == ' ');
	}
	
	/**
	 * Checks whether a position is a dead end
	 * @param row the row of the position
	 * @param column the column of the position
	 * @return true if the position is  a dead end
	 */
	public boolean isDeadEnd(int row, int column)
	{
		return countNeighbors(row, column) == 1;
	}
	
	/**
	 * Checks whether a position is within the maze and not a wall
	 * @param row the row of the position
	 * @param column the column of the position
	 * @return true if the position is valid
	 */
	private boolean isValid(int row, int column)
	{
		return 0 <= row && row < cells.length
				&& 0 <= column && column < cells[row].length()
				&& cells[row].charAt(column) == ' ';
	}
	
	/**
	 * Counts the neighbors of a position
	 * @param row the row of the position
	 * @param column the column of the position
	 * @return the number of neighbors in the four compass directions
	 * that are within the maze and not walls
	 */
	private int countNeighbors(int row, int column)
	{
		int count = 0;
		
		if(isValid(row - 1, column))
		{
			count++;
		}
		if(isValid(row + 1, column))
		{
			count++;
		}
		if(isValid(row, column - 1))
		{
			count++;
		}
		if(isValid(row, column + 1))
		{
			count++;
		}
		
		return count;
	}
}
