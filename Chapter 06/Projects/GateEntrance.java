import java.util.Scanner;

/**
 * P6.11
 * 
 * You need to control the number of people who can be an oyster bar at the same time.
 * Groups of people can always leave the bar, but a group cannot enter the bar if they
 * would make the number of people in the bar exceed the maximum of 100 occupants.
 * Write a program that reads the sizes of the groups that arrive or depart.
 * use negative numbers for departures. After each input, display the current
 * number of occupants. As soon as the bar holds the maximum number of people,
 * report that the bar is full and exit the program.
 * 
 * @author Mayuresh
 *
 */
public class GateEntrance
{
	public static void main(String[] args)
	{
		final int MAX_OCCUPANTS = 100;
		
		int numOfPeople = 0;
		int groupCount = 0;
		
		Scanner in = new Scanner(System.in);
		
		
		while(numOfPeople < MAX_OCCUPANTS)
		{
			System.out.print("How many in your party: ");
			int people= in.nextInt();
			
			if(people == 0)
			{
				continue;
			}
			else if(numOfPeople + people > MAX_OCCUPANTS)
			{
				System.out.println("The Restaurant is Full: Sorry");
			}
			else
			{
				numOfPeople += people;
				groupCount++;
				
				System.out.println("Number of People in the Restaurant: " + numOfPeople);
			}
		}
		
		in.close();
	}
}
