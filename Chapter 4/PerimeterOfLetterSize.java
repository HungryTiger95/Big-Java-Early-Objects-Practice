/**
 * Write a program that computes and displays the perimeter of a letter-size (8.5 x 11
 * inches) sheet of paper and the length of its diagonal.
 * 
 * @author Mayuresh
 *
 */

public class PerimeterOfLetterSize
{
	public static void main(String[] args)
	{
		double perimeter = (8.5 * 2) + (11 * 2);
		double diagonal = (8.5 * 8.5) + (11 * 11);
		diagonal = Math.sqrt(diagonal);
		
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Diagonal: " + diagonal);
	}
}
