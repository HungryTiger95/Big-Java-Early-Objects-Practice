package section_06;

/**
 * Backtracking is a problem solving technique that builds up partial solutions that get increasingly
 * closer to the goal. If a partial solution cannot be completed, one abandons it and returns to
 * examining the other candidates.
 * 
 * In order to employ backtracking for a particular problem, we need two characteristic properties:
 * 
 * 		1)	A procedure to examine a partial solution and determine whether to
 * 				- Accept it as an actual solution
 * 				- Abandon it (either because it violates rule or because it is clear that it can never lead to a valid solution)
 * 				- Continue extending it
 * 
 * 		2) A procedure to extend a partial solution, generating one or more solutions that come closer to the goal
 * 
 * We will develop a program that finds all solutions to the eight queens problem: the task of positioning eight
 * queens on a chess board so that none of them attacks another according to the rules of chess.
 * 
 * In this problem, it is easy to examine a partial solution. If two queens attack another, reject it. Otherwise,
 * if it has eight queens, accept it. Otherwise, continue.
 * 
 * Check out the relevant classes: PartialSolution, Queen, and EightQueens for more.
 * 
 * @author Mayuresh
 *
 */
public class EightQueens
{
	public static void main(String[] args)
	{
		solve(new PartialSolution(0));
	}

	/**
	 * Prints all solutions to the problem that can be extended from a given partial solution
	 * 
	 * Explanation:
	 * This method is a straightforward translation of the pseudocode for backtracking. Note how there is
	 * nothing specific about the eight queens problem in this method. It works for any partial solution
	 * with an examine and extend method.
	 * 
	 * In action:
	 * 
	 * 	1) Starting from a blank board, there are eight partial solutions with a queen in row 1.
	 * 	2) When the queen is in column 1, there are 8 partial solutions with a queen in row 2.
	 * 	3) Two are abandoned immediately. The other 6 lead to partial solutions with 3 queens.
	 * 		This step is repeated for each permutation of the partial solutions of the queen in row 1 (idk if correct explanation)
	 * @param solution the partial solution
	 */
	public static void solve(PartialSolution solution)
	{
		int exam = solution.examine();
		
		if(exam == PartialSolution.ACCEPT)
		{
			System.out.println(solution);
		}
		else if(exam == PartialSolution.CONTINUE)
		{
			for(PartialSolution p : solution.extend())
			{
				solve(p);
			}
		}
	}
}
