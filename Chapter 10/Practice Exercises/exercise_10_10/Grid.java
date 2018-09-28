package exercise_10_10;

import java.util.ArrayList;

/**
 * Implement a class Grid that stores measurements in a rectangular grid. This grid has a given number
 * of rows and columns, and a description string can be added for any grid location. Supply the following
 * constructor and methods:
 * 
 * 		public Grid(int numOfRows, int numOfColumns)
 * 		public void add(int row, int column, String description)
 * 		public String getDescription(int row, int column)
 * 		public ArrayList<Location> getDescribedLocations()
 * 
 * Here, Location is an inner class that encapsulates the row and column of a grid location.
 * 
 * @author Mayuresh
 *
 */
public class Grid
{
	// Instance Variables
	private String[][] data;
	ArrayList<Location> dataLocations = new ArrayList<Location>();
	
	// Constructors
	/**
	 * Constructs a grid with a given number of rows and columns
	 * @param numOfRows the number of rows
	 * @param numOfColumns the number of columns
	 */
	public Grid(int numOfRows, int numOfColumns)
	{
		data = new String[numOfRows][numOfColumns];
		
		// Set up each cell with "" as the string
		
	}
	
	// Methods
	/**
	 * Adds a description to a location on the grid and adds a location object in
	 * an array containing the locations at which there are descriptions on the grid
	 * @param row the row to add the description
	 * @param column the column to add the description
	 * @param description the description
	 */
	public void add(int row, int column, String description)
	{
		data[row][column] = description;

		Location newLocation = new Location(row, column);
		dataLocations.add(newLocation);
	}
	
	/**
	 * Gets the description of a location on the grid
	 * @param row the row
	 * @param column the column
	 * @return the description
	 */
	public String getDescription(int row, int column)
	{
		return data[row][column];
	}
	
	/**
	 * Gets all locations on the grid that have descriptions
	 * @return the array list of all the locations
	 */
	public ArrayList<Location> getDescribedLocations()
	{
		ArrayList<Location> describedLocations = new ArrayList<Location>();
		
		for(int i = 0; i < data.length; i++)
		{
			for(int j = 0; j < data[0].length; j++)
			{
				if(data[i][j] != null)
				{
					Location loc = new Location(i, j);
					describedLocations.add(loc);
				}
			}
		}
		
		return describedLocations;
	}
	
	class Location
	{
		// Instance Variables
		private int row;
		private int column;
		
		// Constructors
		public Location(int row, int column)
		{
			this.row = row;
			this.column = column;
		}
		
		// Methods
		/**
		 * Gets the row
		 * @return the row
		 */
		public int getRow()
		{
			return this.row;
		}
		
		/**
		 * Gets the column
		 * @return the column
		 */
		public int getColumn()
		{
			return this.column;
		}
	}
}
