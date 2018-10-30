package exercise_13_15;

import java.util.Arrays;

/**
 * The backtracking algorithm will work for any problem whose partial solutions can be examined and
 * extended. Provide a PartialSolution interface type with methods examine and extend, a solve method
 * that works with this interface type, and a class EightQueensPartialSolutions that implements the interface.
 * 
 * @author Mayuresh
 *
 */
public class EightQueensPartialSolution implements PartialSolution
{
	private Queen[] queens;
	private static final int NQUEENS = 8;
	
	public static final int ACCEPT = 1;
	public static final int ABANDON = 2;
	public static final int CONTINUE = 3;
	
	/**
	 * Constructs a partial solution of a given size
	 * @param size the size
	 */
	public EightQueensPartialSolution(int size)
	{
		this.queens = new Queen[size];
	}
	
	@Override
	/**
	 * Examines a partial solution
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
	
	@Override
	/**
	 * Yields all extensions of this partial solution
	 * 
	 * @return an array of partial solutions that extend this solution
	 */
	public EightQueensPartialSolution[] extend()
	{
		EightQueensPartialSolution[] results = new EightQueensPartialSolution[NQUEENS];
		
		for(int i = 0; i < results.length; i++)
		{
			int size = this.queens.length;
			
			results[i] = new EightQueensPartialSolution(size + 1);
			
			for(int j = 0; j < size; j++)
			{
				results[i].queens[j] = this.queens[j];
			}
			
			results[i].queens[size] = new Queen(size, i);
		}
		
		return results;
	}
	
	@Override
	public String toString()
	{
		return Arrays.toString(this.queens);
	}
}
