package interface_example_5;

import java.util.Scanner;

public class GradingProgram
{
	public static void main(String[] args)
	{
		IGradeBook gradeBook = new MockGradeBook();
	
		Scanner in = new Scanner(System.in);
	
		boolean done = false;
		while(!done)
		{
			System.out.print("L)oad A)dd a)Verage S)ave Q)uit: ");
			String command = in.next().toUpperCase();
		
			if(command.equals("L"))
			{
				System.out.print("Filename: ");
				String fileName = in.next();
				gradeBook.load(fileName);
			}
			else if(command.equals("S"))
			{
				System.out.print("Filename: ");
				String fileName = in.next();
				gradeBook.save(fileName);
			}
			else if(command.equals("A"))
			{
				System.out.print("ID: ");
				int id = in.nextInt();
				
				System.out.print("Score: ");
				double score = in.nextDouble();
				
				gradeBook.addScore(id, score);
			}
			else if(command.equals("V"))
			{
				System.out.print("ID: ");
				int id = in.nextInt();
			
				System.out.println("Average for " + id + ": " + gradeBook.getAverageScore(id));	
			}
			else if(command.equals("Q"))
			{
				done = true;
			}
			else
			{
				System.out.println("Invalid Command");
			}
		}
	}
}
