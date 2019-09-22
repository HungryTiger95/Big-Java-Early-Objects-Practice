import java.util.Scanner;

/**
 * Business P4.6
 * 
 * Translate the pseudocode:
 * 
 * 		1)	Take substring consisting of the first 3 characters and surround with ()
 * 		2)	Concat area code, hyphen, next 3, hyphen, and last 4
 * 		3)	Print
 * 
 * @author Mayuresh
 *
 */

public class PhoneNumber
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String areaCode, middle, last, number;
		
		System.out.print("Please Enter Your Phone Number: ");
		number = in.nextLine();
		
		in.close();
		
		areaCode = "(".concat(number.substring(0, 3)).concat(")-");
		middle = number.substring(3, 6).concat("-");
		last = number.substring(6, 10);
		
		number = areaCode.concat(middle).concat(last);
		
		System.out.println(number);
	}
}
