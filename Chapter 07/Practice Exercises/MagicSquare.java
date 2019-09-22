import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 * Magic Squares.
 * 
 * An n X n matrix that is filled with the numbers 1, 2, 3, ..., n^2 is a magic
 * square if the sum of the elements in each row, in each column, and in the
 * two diagonals is the same value. Write a program that reads in 16 values from
 * the keyboard and tests whether they form a magic square when put into a 4 X 4 array.
 * 
 * NOTE: I attempted to automate this program but realized the chances of randomly creating
 * a magic square is slim to none. During testing, I ran the program for almost 5 minutes
 * going through nearly a million attempts and found no end to the loop. Otherwise, if given
 * a known solution to the magic square, the program correctly identifies it as such. If one or more
 * of the elements are changed, the program correctly finds the discrepancy and marks the magic
 * square solution as false.
 * 
 * @author Mayuresh
 *
 */
public class MagicSquare
{
	public static void main(String[] args)
	{
		StopWatch timer = new StopWatch();
		
		timer.start();
		
		// Read an int for the size of the square
		Scanner in = new Scanner(System.in);
		int n;
		boolean magic = false;
		int tries = 0;
		double sum = 0;
		
		System.out.print("Enter the square size: ");
		n = in.nextInt();
		
		while(!magic)
		{
			// Set up array to check values for
			ArrayList<Double> list = new ArrayList<>();
			for(double i = 1; i <= Math.pow(n, 2); i++)
			{
				list.add(i);
			}
		
			//System.out.println(list.toString());
		
			// Make an empty array and randomly add elements from the valToUse array
			double[][] square = new double[n][n];
			int rand;
			Random gen = new Random();
		
			for(int i = 0; i < n; i++)
			{
				for(int j = 0; j < n; j++)
				{
					rand = gen.nextInt(list.size());
					square[i][j] = list.get(rand);
				
					list.remove(rand);
				}
			}
		
			//print(square);
			//System.out.println();
			
			/*double[][] square =
			{
					{9, 6, 3, 16},
					{4, 15, 10, 5},
					{14, 1, 8, 11},
					{7, 12, 13, 2}
			};*/
			
			// Make array for all rows
			//System.out.println("Row Sum Array:");
			double[] rowSum = new double[n];
			for(int i = 0; i < n; i++)
			{
				rowSum[i] = rowSum(square, i);
			}
			
			//print(rowSum);
			
			// Make array for all columns
			//System.out.println("Column Sum Array:");
			double[] columnSum = new double[n];
			for(int i = 0; i < n; i++)
			{
				columnSum[i] = columnSum(square, i);
			}
			
			//print(columnSum);
			
			// Make array for diagonals
			//System.out.println("Diagonal Sum Array:");
			double[] diagSum = new double[2];
			for(int i = 0; i < 2; i++)
			{
				diagSum[i] = diagSum(square, i);
			}
			
			//print(diagSum);
			
			// Check if the arrays have the same values
			if(allElementsSame(rowSum) == true && allElementsSame(columnSum) == true && allElementsSame(diagSum) == true)
			{
				tries++;
				System.out.println("Tries: " + tries);
				magic = true;
				print(square);
			}
			else
			{
				tries++;
				//System.out.println("Tries: " + tries);
			}
			//System.out.println();
		}
		
		timer.stop();
		
		System.out.println("Duration: " + (timer.getElapsedTime() / 1000.0) + " seconds");
		System.out.println("Duration: " + timer.getElapsedTime() + " milliseconds");
		System.out.println("Duration: " + (timer.getElapsedTime() * 1000000000.0) + " nanoseconds");
	}

	/**
	 * Prints a single dimension array
	 * @param array array
	 */
	private static void print(double[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			if(i > 0)
			{
				System.out.print(" | ");
			}
			System.out.printf("%3.0f", array[i]);
		}
		System.out.println();
	}
	
	/**
	 * Prints a 2D array
	 * @param array array
	 */
	private static void print(double[][] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array.length; j++)
			{
				if(j > 0)
				{
					System.out.print(" | ");
				}
				System.out.printf("%3.0f", array[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	/**
	 * Gets the sum of all the values in a given row from a given array
	 * @param array array
	 * @param row row in the array
	 * @return sum of all elements in the row
	 */
	private static double rowSum(double[][] array, int row)
	{
		double sum = 0;
		
		for(int i = 0; i < array.length; i++)
		{
			sum += array[row][i];
		}
		
		return sum;
	}
	
	/**
	 * Gets the sum of all the values in a given column from a given array
	 * @param array array
	 * @param column column in the array
	 * @return sum of all elements in the column
	 */
	private static double columnSum(double[][] array, int column)
	{
		double sum = 0;
		
		for(int i = 0; i < array.length; i++)
		{
			sum += array[i][column];
		}
		
		return sum;
	}
	
	/**
	 * Gets the sum of all the values in a given diagonal from a given array
	 * @param array array
	 * @param direction diagonal in the array
	 * @return sum of all elements in the diagonal
	 */
	private static double diagSum(double[][] array, int direction)
	{
		double sum = 0;
		
		if(direction == 0)
		{
			for(int i = 0; i < array.length; i++)
			{
				for(int j = 0; j < array.length; j++)
				{
					if(i == j)
					{
						sum += array[i][j];
					}
				}
			}
			return sum;
		}
		else if(direction == 1)
		{
			for(int i = 0; i < array.length; i++)
			{
				for(int j = 0; j < array.length; j++)
				{
					if(i + j == (array.length - 1))
					{
						sum += array[i][j];
					}
				}
			}
			return sum;
		}
		else
		{
			System.out.println("ERROR: Wrong input for direction");
			sum = -1;
			return sum;
		}
	}
	
	/**
	 * Checks if all the elements in an array are the same
	 * @param array array
	 * @return true if all elements are equal, false if not
	 */
	private static boolean allElementsSame(double[] array)
	{
		boolean allEqual = true;
		for(int i = 1; i < array.length; i++)
		{
			if(array[i - 1] != array[i])
			{
				allEqual = false;
			}
		}
		
		return allEqual;
	}
}
