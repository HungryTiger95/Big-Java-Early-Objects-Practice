import java.util.Scanner;

/**
 * P6.10
 * 
 * Write an application to pre-sell a limited number of cinema tickets. Each buyer can
 * buy as many as 4 tickets. No more than 100 tickets can be sold. Implement a program
 * called CinemaTickets that prompts the user for the desired number of tickets and
 * then displays the number of remaining tickets. Repeat until all tickets have been
 * sold, and then display the total number of buyers.
 * 
 * @author Mayuresh
 *
 */
public class CinemaTickets
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int buyers = 0;
		int tickets = 0;
		int ticketBought;
		final int MAX_TICKETS = 100;
		
		while(tickets < MAX_TICKETS)
		{
			System.out.print("Enter Number of Tickets you want: ");
			ticketBought = in.nextInt();
			
			if(ticketBought > 4 || ticketBought < 1)
			{
				System.out.println("You cannot buy that many tickets");
			}
			else
			{
				tickets += ticketBought;
				System.out.println("Number of Tickets Left: " + (MAX_TICKETS - tickets));
				buyers++;
			}
		}
		in.close();
		
		System.out.println("Total Buyers: " + buyers);
	}
}
