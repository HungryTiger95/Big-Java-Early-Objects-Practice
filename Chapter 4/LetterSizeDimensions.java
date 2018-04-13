/**
 * E4.1/E4.2
 * 
 * Write a program that displays the dimensions of a letter-size (8.5 X 11 inches) sheet
 * of paper in millimeters. There are 25.4 millimeters per inch. Use constants and comments
 * in your program
 * 
 * Write a program that computes and displays the perimeter of a letter-size(8.5 X 11 inches)
 * sheet of paper and the length of its diagonal.
 * 
 * @author Mayuresh
 *
 */

public class LetterSizeDimensions
{
	public static void main(String[] args)
	{
		// Variables
		final double MILLIMETER_PER_INCH = 25.4;
		
		// Length and Height of the paper
		double length, height, perimeter;
		
		length = MILLIMETER_PER_INCH * 8.5;
		height = MILLIMETER_PER_INCH * 11;
		perimeter = (2 * 8.5) + (2* 11);
		
		System.out.print("Perimeter of an 8.5 x 11 inch sheet of paper is: ");
		System.out.printf("%.2f\n", perimeter);
		System.out.print("An 8.5 x 11 inch sheet of paper in millimeters is: ");
		System.out.printf("%.2fmm x %.2fmm\n", length, height);
	}
}
