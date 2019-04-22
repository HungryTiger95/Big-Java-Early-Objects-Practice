package section_06;

import java.util.Stack;

public class MazeSolver
{
	public static void main(String[] args)
	{
		Maze maze = new Maze(
			new String[] {
					"*****************************",
					"** ***                      *",
					"** *** * ********************",
					"** *** *         *          *",
					"** *** * *******   **** *****",
					"**     * ************** *****",
					"****** ******* *******  *****",
					"******         ******* ******",
					"*      ******* ******* ******",
					"* **** ******* **           *",
					"*    ********* ******* ******",
					"* ****         ***     ******",
			        "************** **************"});

		solve(maze, 5, 8);
	}
	
	/**
	 * Traverses a maze printing out a path to the exit
	 * @param maze the maze
	 * @param row the row of the starting position
	 * @param column the column of the starting position
	 */
	public static void solve(Maze maze, int row, int column)
	{
		Stack<Path> s = new Stack<Path>();
		for(Path p : maze.pathsFrom(row, column))
		{
			s.push(p);
		}
		
		while(s.size() > 0)
		{
			Path p = s.pop();
			System.out.println("Following: " + p);
			
			int r = p.getEndingRow();
			int c = p.getEndingColumn();
			
			if(maze.isExit(r, c))
			{
				System.out.println("Exit!");
				return;
			}
			else if(maze.isDeadEnd(r, c))
			{
				System.out.println("Dead End");
			}
			else
			{
				for(Path p2 : maze.pathsFrom(r, c))
				{
					if(!p2.isOpposite(p))
					{
						s.push(p2);
					}
				}
			}
		}
	}
}
