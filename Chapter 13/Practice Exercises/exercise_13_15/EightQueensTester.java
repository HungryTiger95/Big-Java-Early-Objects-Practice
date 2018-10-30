package exercise_13_15;

public class EightQueensTester
{
	public static void main(String[] args)
	{
		solve(new EightQueensPartialSolution(0));
	}
	
	public static void solve(PartialSolution solution)
	{
		int exam = solution.examine();
		
		if(exam == EightQueensPartialSolution.ACCEPT)
		{
			System.out.println(solution);
		}
		else if(exam == EightQueensPartialSolution.CONTINUE)
		{
			for(PartialSolution p : solution.extend())
			{
				solve(p);
			}
		}
	}
}
