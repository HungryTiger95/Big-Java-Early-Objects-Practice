import java.util.Scanner;

/**
 * A theater seating chart is implemented as a two-dimensional array of
 * ticket prices,
 * 
 * 		10 10 10 10 10 10 10 10 10 10
 * 		10 10 10 10 10 10 10 10 10 10
 * 		10 10 10 10 10 10 10 10 10 10
 * 		10 10 20 20 20 20 20 20 10 10
 * 		10 10 20 20 20 20 20 20 10 10
 * 		10 10 20 20 20 20 20 20 10 10
 * 		20 20 30 30 40 40 30 30 20 20
 * 		20 30 30 40 50 50 40 30 30 20
 * 		30 40 50 50 50 50 50 50 40 30
 * 
 * Write a program that prompts users to pick either a seat or a price.
 * Mark sold seats by changing the price to 0. WHen a user specifies a
 * seat, make sure it is available. When a user specifies a price, find
 * any seat with that price.
 * 		
 * @author Mayuresh
 *
 */
public class TheaterSeatTester
{
	public static Scanner in = new Scanner(System.in);
	public static Theater theater = new Theater();
	public static int sentinel = 0;
	public static int seatI, seatJ, price;
	public static String choice = "";
	
	public static void main(String[] args)
	{
		theater.printTheater();
		
		boolean finished = false;
		
		while(!finished)
		{
			System.out.print("Would you like to purchase a seat? ");
			String input = in.next();
			
			if(input.equals("Y") || input.equals("y"))
			{
				chooseSeat();
				seatPurchasing();
				
				resetCritVals();
			}
			else
			{
				System.out.println("Thank you for Shopping with us");
				finished = true;
			}
			
		}
		
		in.close();
	}
	
	/**
	 * Asks the user to choose a seat
	 */
	public static void chooseSeat()
	{
		System.out.print("Seat Number (N) or Seat Price (P)");
		while(sentinel == 0)
		{
			choice = in.next();
			
			if(choice.equals("N") || choice.equals("n") || choice.equals("P") || choice.equals("p"))
			{
				sentinel = 1;
			}
			else
			{
				System.out.println("Wrong Input");
			}
		}
	}
	
	/**
	 * Attempts to purchase a seat
	 */
	public static void seatPurchasing()
	{
		if(choice.equals("N") || choice.equals("n"))
		{
			System.out.print("Choose a Seat: ");
			seatI = in.nextInt();
			seatJ = in.nextInt();
			
			theater.purchaseSeat(seatI, seatJ);
		}
		else if (choice.equals("P") || choice.equals("p"))
		{
			System.out.print("Choose a Price: ");
			price = in.nextInt();
			
			theater.purchaseSeat(price);
		}
		else
		{
			System.out.println("Something went wrong");
		}
		
		theater.printTheater();
	}
	
	/**
	 * Resets all of the critical instance values
	 */
	public static void resetCritVals()
	{
		sentinel = 0;
		seatI = -1;
		seatJ = -1;
		price = -1;
		choice = "";
	}
}
