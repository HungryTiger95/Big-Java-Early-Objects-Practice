import java.util.Scanner;

/**
 * Business P2.10
 * 
 * A video club wants to reward its best members with a discount based on the member's
 * number of movie rentals and the number of new members referred by the member.
 * The discount is in percent and is equal to the sum of the rentals and the referrals,
 * but it cannot exceed 75 percent. (Hint: Math.min). Write a program MovieRental to calculate
 * the value of the discount.
 * 
 * @author Mayuresh
 *
 */
public class MovieRental
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number of movie rentals: ");
		int movieRentals = in.nextInt();
		
		System.out.print("Enter the number of members referred to the video club: ");
		int memberReferral = in.nextInt();
		
		in.close();
		
		double discountVal = Math.min(movieRentals + memberReferral, 75);
		
		System.out.println("The discount is equal to: " + discountVal);
	}
}
