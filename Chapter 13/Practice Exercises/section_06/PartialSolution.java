package section_06;

import java.util.Arrays;

/**
 * A partial solution to the eight queens puzzle.
 * 
 * This class collects the queens in a partial solution, and has methods to examine and extend the solution
 * 
 * @author Mayuresh
 *
 */
public class PartialSolution
{
	// Instance Variables
	private Queen[] queens;
	private static final int NQUEENS = 8;
	
	public static final int ACCEPT = 1;
	public static final int ABANDON = 2;
	public static final int CONTINUE = 3;
	
	// Constructors
	/**
	 * Constructs a partial solution of a given size
	 * @param size the size
	 */
	public PartialSolution(int size)
	{
		this.queens = new Queen[size];
	}
	
	// Methods
	/**
	 * Examines a partial solution.
	 * 
	 * Explanation:
	 * This method simply checks whether two queens attack each other.
	 * 
	 * @return one of ACCEPT, ABANDON, or CONTINUE
	 */
	public int examine()
	{
		for(int i = 0; i < this.queens.length; i++)
		{
			for(int j = i + 1; j < this.queens.length; j++)
			{
				if(this.queens[i].attacks(this.queens[j]))
				{
					return ABANDON;
				}
			}
		}
		
		if(this.queens.length == NQUEENS)
		{
			return ACCEPT;
		}
		else
		{
			return CONTINUE;
		}
	}
	
	/**
	 * Yields all extensions of this partial solution
	 * 
	 * Explanation:
	 * The extend method takse a given solution and makes eight copies of it.
	 * Each copy gets a new queen in a different column.
	 * 
	 * @return an array of partial solutions that extend this solution
	 */
	public PartialSolution[] extend()
	{
		// Generate a new solution for each column
		PartialSolution[] results = new PartialSolution[NQUEENS];
		
		for(int i = 0; i < results.length; i++)
		{
			int size = this.queens.length;
			
			// The new solution has one more row than this one
			results[i] = new PartialSolution(size + 1);
			
			// Copy this solution into the new one
			for(int j = 0; j < size; j++)
			{
				results[i].queens[j] = this.queens[j];
			}
			
			// Append the new queen into the ith column
			results[i].queens[size] = new Queen(size, i);
		}
		
		return results;
	}
	
	public String toString()
	{
		return Arrays.toString(this.queens);
	}
}
