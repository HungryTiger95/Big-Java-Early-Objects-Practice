package exercise_04;

import java.util.Scanner;

public class GradeBookTester
{
	public static void main(String[] args)
	{
		final int START = 1;
		final int ADD = 2;
		final int REMOVE = 3;
		final int MODIFY = 4;
		final int PRINT = 5;
		final int QUIT = 6;
		
		int state = START;
		
		Scanner in = new Scanner(System.in);
		GradeBook book = new GradeBook();
		
		boolean done = false;
		while(!done)
		{
			if(state == START)
			{
				// Ask if you want to add, remove, modify, or print out a gradebook
				System.out.print("Enter 2)Add 3)Remove 4)Modify 5)Print 5)Quit: ");
				state = in.nextInt();
			}
			else if(state == ADD)
			{
				// Ask for the name of the student
				System.out.print("Enter Name of Student: ");
				String name = in.next();
				
				// Ask for the grade
				System.out.print("Enter Grade: ");
				String grade = in.next();
				
				// Add the grade
				book.addGrade(name, grade);
				
				// Reset State to START
				state = START;
			}
			else if(state == REMOVE)
			{
				// Ask for the student name
				System.out.print("Enter the name of the Student: ");
				String name = in.next();
				
				// Remove the grade
				book.removeGrade(name);
				
				// Reset State to START
				state = START;
			}
			else if(state == MODIFY)
			{
				// Ask for the name of the student
				System.out.print("Enter the name of the student: ");
				String name = in.next();
				
				// Ask for the new grade
				System.out.print("Enter the new grade: ");
				String grade = in.next();
				
				// Replace the grade
				book.changeGrade(name, grade);
				
				// Reset the State to START
				state = START;
			}
			else if(state == PRINT)
			{
				// Print gradebook
				book.printGradeBook();
				
				// Return to START state
				state = START;
				
				// Get out of the loop
				//done = true;
			}
			else if(state == QUIT)
			{
				// Print gradebook
				book.printGradeBook();
				
				// Get out of the loop
				done = true;
				
				// Show that the app is terminating
				System.out.println("Exiting App...");
			}
			else
			{
				// Get out of the loop
				done = true;
				
				// Print out the problem
				System.out.println("State Exception: Terminating Program");
			}
		}
		
		in.close();
	}
}
