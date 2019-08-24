package section_03;

import java.awt.Color;

public class PrintDemo
{
	public static <E> void print(E[] a)
	{
		for(E e : a)
		{
			System.out.print(e + " ");
		}
		System.out.println();
	}
	
	public static void print(int[] a)
	{
		for( int e : a)
		{
			System.out.print(e + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		String[] words = {"Priya", "Riya", "Liya", "Diya", "Gia", "Mia"};
		Color[] colors = {Color.red, Color.black, Color.blue, Color.green};
		int[] squares = {1, 4, 9, 16, 25, 36};
		
		print(words);		// Calls generic print<String>
		print(colors);		// Calls generic print<Color>
		print(squares);		// Calls non-generic print
	}
}
