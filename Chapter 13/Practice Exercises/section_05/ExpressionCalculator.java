package section_05;

import java.util.Scanner;

/**
 * This program calculates the value of an expression consisting
 * of numbers, arithmetic operators, and parentheses
 * 
 * @author Mayuresh
 *
 */
public class ExpressionCalculator
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an Expression: ");
		String input = in.nextLine();
		
		Evaluator e = new Evaluator(input);
		
		int value = e.getExpressionValue();
		System.out.println(input + " = " + value);
		
		in.close();
	}
}
