import java.util.Scanner;

/**
 * E4.3
 * 
 * Write a program that reads a number and displays the square, cube, and fourth
 * power. Use the Math.pow method only for the fourth power.
 * 
 * @author Mayuresh
 *
 */

public class SquareCubeQuad
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please Enter an Integer: ");
		int num = in.nextInt();
		
		in.close();
		double square, cube, fourth;
		
		square = num * num;
		cube = num * num * num;
		fourth = Math.pow(num, 4);
		
		System.out.printf("Square of Integer: %.2f\n", square);
		System.out.printf("Cube of Integer: %.2f\n", cube);
		System.out.printf("Fourth Power of Integer: %.2f\n", fourth);
	}
}
