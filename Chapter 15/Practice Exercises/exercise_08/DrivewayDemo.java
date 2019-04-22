package exercise_08;

import java.util.Random;
import java.util.Scanner;

public class DrivewayDemo
{
	public static void main(String[] args)
	{
		final int START = 1;
		final int DRIVEWAY_ACTION = 2;
		
		int state = START;
		
		Scanner in = new Scanner(System.in);
		Driveway d = new Driveway();
		
		boolean isDone = false;
		while(!isDone)
		{
			if(state == START)
			{
				// Randomly set up a driveway with 15 cars
				Random gen = new Random();
				
				for(int i = 0; i < 15; i++)
				{
					boolean done = false;
					while(!done)
					{
						int randNum = gen.nextInt(100) + 1;
						
						if(!d.getDriveway().contains(randNum))
						{
							d.addToDriveway(randNum);
							done = true;
						}
					}
				}
				
				// Print the driveway and the street
				System.out.println("Driveway: " + d.getDriveway().toString());
				System.out.println("Street: " + d.getStreet().toString());
				
				state = DRIVEWAY_ACTION;
			}
			else if(state == DRIVEWAY_ACTION)
			{
				System.out.print("Enter a Positive Number to add a car, Negative to remove a car, Zero to end the program: ");
				int input = in.nextInt();
				
				if(input < 0)
				{
					d.removeFromDriveway(input * -1);
				}
				else if(input > 0)
				{
					d.addToDriveway(input);
				}
				else
				{
					state = 0;
				}
				
				System.out.println("\nDriveway: " + d.getDriveway().toString());
				System.out.println("Street: " + d.getStreet().toString());
			}
			else if(state == 0)
			{
				System.out.println("\n\nExiting Program:");
				System.out.println("Driveway: " + d.getDriveway().toString());
				System.out.println("Street: " + d.getStreet().toString());
				isDone = true;
			}
			else
			{
				System.out.println("Incorrect Input: Pick A Car or Enter 0 to Exit");
			}
		}
		
		in.close();
	}
}
