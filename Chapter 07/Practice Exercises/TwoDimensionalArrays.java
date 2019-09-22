
public class TwoDimensionalArrays
{
	public static void main(String[] args)
	{
		/**
		 * You obtain a 2D array by supplying the number of rows and columns
		 * 
		 * 		int[ROWS][COLUMNS]
		 * 
		 * You store a reference to such an array in a variable of type int[][]
		 * You can also declare and initialize a 2D array by supplying the values.
		 * 
		 * 			int[][] counts =
		 * 				{
		 * 					{1, 0, 1},
		 * 					{1, 1, 0},
		 * 					{0, 0, 1},
		 * 				};
		 * 
		 * You cannot change the size of the array after declaring it.
		 */
		final int COUNTRIES = 7;
		final int MEDALS = 3;
		
		int[][] counts =
			{
					{1, 0, 1},
					{1, 1, 0},
					{0, 0, 1},
					{1, 0, 0},
					{0, 1, 1},
					{0, 1, 1},
					{1, 1, 0},
			};
		
		/**
		 * Accessing Elements
		 * 
		 * To access a particular element in the two-dimensional array, you need to specify
		 * two index values in separate brackets to select the row and column.
		 * 
		 * To access all elements in a two-dimensional array, you use nested loops. In these
		 * loops, the number of rows and columns were given as constants, but you can use
		 * counts.length for the number of rows and count[0].length for the number of columns.
		 *
		 */
		for(int i = 0; i < counts.length; i++)
		{
			for(int j = 0; j < counts[0].length; j++)
			{
				System.out.printf("%8d", counts[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		/**
		 * Locating Neighboring Elements
		 * 
		 * The neighbors of counts[3][1] to the left and right are counts[3][0] and
		 * counts[3][2]. The neighbors to the top and bottom are counts[2][1] and counts[4][1].
		 * 
		 * You need to be careful though as to not to try and access an element that does not exist.
		 * counts[0][1] has no neighbor to the top. Consider the task of computing
		 * the sum of the neighbors to the top and and bottom of the element count[i][j]. You
		 * need to check whether the element is located at the top or bottom of the array.
		 */
		int total = 0;
		final int ROWS = counts.length;
		final int COLUMNS = counts[0].length;
		
		for(int i = 0; i < ROWS; i++)
		{
			for(int j = 0; j < COLUMNS; j++)
			{
				if(i > 0)
				{
					total += counts[i - 1][j];
				}
				if(i < ROWS - 1)
				{
					total += counts[i + 1][j];
				}
				
				System.out.println("Total of Neighbors for [" + i + "][" + j +"]: " + total);
				total = 0;
			}
		}

	}
}
