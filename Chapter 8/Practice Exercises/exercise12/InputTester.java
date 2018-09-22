package exercise12;

import java.util.Scanner;

public class InputTester
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		Input.readInt(in, "Please Enter an Integer: ", "That Integer is Out of Bounds", 0, 100);
	}

}
