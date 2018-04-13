import java.util.Scanner;

/**
 * Business P4.5
 * 
 * Translate the pseudocode:
 * 
 * 		1)	Read total book price and number of books
 * 		2)	Compute tax(7.5 percent)
 * 		3)	Compute shipping charge($2 per book)
 * 		4)	Compute total charge
 * 		5)	Print
 * 
 * @author Mayuresh
 *
 */

public class Bookstore
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		double bookPrice, shippingCharge, total;
		int bookAmount;
		
		
		System.out.print("Total Price of Books: ");
		bookPrice = in.nextDouble();
		
		System.out.print("Number of Books: ");
		bookAmount = in.nextInt();
		
		in.close();
		
		// Compute tax
		total = bookPrice + (bookPrice * .075);
		
		// Compute shipping charge
		shippingCharge = bookAmount * 2;
		
		//Compute total charge
		total = total + shippingCharge;
		
		System.out.printf("Total: %.2f", total);
	}
}
