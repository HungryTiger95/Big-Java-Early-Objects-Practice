import java.util.Scanner;

/**
 * P5.6
 * 
 * Write a program that converts a positive integer into the Roman
 * number system. The Roman number system has digits
 * 
 * 		I		1
 * 		V		5
 * 		X		10
 * 		L		50
 * 		C		100
 * 		D		500
 * 		M		1,000
 * 
 * Numbers are formed according to the following rules:
 * 
 * 	A) Only numbers up to 3,999 are represented
 * 	
 * 	B) As in the decimal system, the thousands, hundred, tens, and ones are expressed
 * 	   separately
 * 
 * 	C) The numbers 1 to 9 are represented:
 * 
 * 			I		1		VI		6
 * 			II		2		VII		7
 * 			III 	3		VIII	8
 * 			IV		4		IX		9
 * 			V		5		X		10
 * 
 *  D) Tens and hundreds are done the same way, except that the letters X, L, C, D, and
 *     M are used instead of I, V, X, respectively.
 *     
 * Your program should take an input, such as 1978, and convert it to Roman numerals, MCMLXXVIII
 * 
 * @author Mayuresh
 *
 */
public class RomanNumerals
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Year: ");
		int year = in.nextInt();
		
		in.close();
		
		int thousandsVal, hundredsVal, tensVal, onesVal;
		
		onesVal = year % 10;
		tensVal = year % 100;
		hundredsVal = year % 1000;
		thousandsVal = year % 10000;
		
		// Check if number is between 0 and 3,999
		if(year >= 0 && year <= 3999)
		{
			// Check if number is > 999
			if(Integer.toString(year).length() == 4)
			{
				System.out.println(getThousands(thousandsVal - hundredsVal) + getHundreds(hundredsVal - tensVal) +
						getTens(tensVal - onesVal) + getOnes(onesVal));
			}
			// Check if number is > 99 and < 1000
			else if(Integer.toString(year).length() == 3)
			{
				System.out.println(getHundreds(hundredsVal - tensVal) + getTens(tensVal - onesVal) + getOnes(onesVal));
			}
			// Check if number is between 10 and 99
			else if(Integer.toString(year).length() == 2)
			{
				System.out.println(getTens(tensVal - onesVal) + getOnes(onesVal));
			}
			// Check if number is between 0 and 9
			else if(Integer.toString(year).length() == 1)
			{
				System.out.println(getOnes(onesVal));
			}
			else
			{
				System.out.println("Something went wrong");
			}
			
			//System.out.println(thousands.concat(hundreds).concat(tens).concat(ones));
		}
		else
		{
			System.out.println("This year is not within the constraints");
		}
	}
	
	// Methods
	/**
	 * Converts ones digit from integer to Roman numerals
	 * @param ones ones digit
	 * @return roman numeral equivalent
	 */
	public static String getOnes(int ones)
	{
		if(ones == 0)
		{
			return "";
		}
		else if(ones == 1)
		{
			return "I";
		}
		else if(ones == 2)
		{
			return "II";
		}
		else if(ones == 3)
		{
			return "III";
		}
		else if(ones == 4)
		{
			return "IV";
		}
		else if(ones == 5)
		{
			return "V";
		}
		else if(ones == 6)
		{
			return "VI";
		}
		else if(ones == 7)
		{
			return "VII";
		}
		else if(ones == 8)
		{
			return "VIII";
		}
		else if(ones == 9)
		{
			return "IX";
		}
		else
		{
			return "Something went wrong with ones";
		}
	}
	
	/**
	 * Converts the tens digit from integer to Roman numerals
	 * @param tens tens digit
	 * @return tens digit Roman numeral equivalent
	 */
	public static String getTens(int tens)
	{
		if(tens == 0)
		{
			return "";
		}
		else if(tens == 10)
		{
			return "X";
		}
		else if(tens == 20)
		{
			return "XX";
		}
		else if(tens == 30)
		{
			return "XXX";
		}
		else if(tens == 40)
		{
			return "XL";
		}
		else if(tens == 50)
		{
			return "L";
		}
		else if(tens == 60)
		{
			return "LX";
		}
		else if(tens == 70)
		{
			return "LXX";
		}
		else if(tens == 80)
		{
			return "LXXX";
		}
		else if(tens == 90)
		{
			return "XC";
		}
		else
		{
			return "Something went wrong with tens";
		}
	}
	
	/**
	 * Converts the hundreds digit of an integer to a Roman numeral
	 * @param hundreds hundreds digit
	 * @return Roman numeral equivalent
	 */
	public static String getHundreds(int hundreds)
	{
		if(hundreds == 0)
		{
			return "";
		}
		else if(hundreds == 100)
		{
			return "C";
		}
		else if(hundreds == 200)
		{
			return "CC";
		}
		else if(hundreds == 300)
		{
			return "CCC";
		}
		else if(hundreds == 400)
		{
			return "CD";
		}
		else if(hundreds == 500)
		{
			return "D";
		}
		else if(hundreds == 600)
		{
			return "DC";
		}
		else if(hundreds == 700)
		{
			return "DCC";
		}
		else if(hundreds == 800)
		{
			return "DCCC";
		}
		else if(hundreds == 900)
		{
			return "CM";
		}
		else
		{
			return "Something went wrong with hundreds";
		}
	}
	
	/**
	 * Converts the thousands digit from integer to Roman numeral
	 * @param thousands thousands digit
	 * @return Roman numeral equivalent
	 */
	public static String getThousands(int thousands)
	{
		if(thousands == 0)
		{
			return "";
		}
		else if(thousands == 1000)
		{
			return "M";
		}
		else if(thousands == 2000)
		{
			return "MM";
		}
		else if(thousands == 3000)
		{
			return "MMM";
		}
		else
		{
			return "Something went wrong with thousands";
		}
	}
}
