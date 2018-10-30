package exercise_13_18;

import java.util.Scanner;

public class EightQueensTester
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number of queens on the board: ");
		int queens = in.nextInt();
		
		solve(new EightQueensPartialSolution(queens, 0));
		
		in.close();
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
