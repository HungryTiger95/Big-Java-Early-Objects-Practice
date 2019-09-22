import java.util.Scanner;

public class StudentTester
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Student fred = new Student(10);
		
		System.out.println("Please Enter Values, [Q]uit");
		while(in.hasNextDouble())
		{
			if(!fred.addScore(in.nextDouble()))
			{
				System.out.println("Too Many Scores");
				return;
			}
		}
		
		System.out.println("Minimum Score: " + fred.getMin());
		System.out.println("Position of Minimum: " + fred.getMinPos());
		
		fred.removeMin();
		fred.printArray();
		
		in.close();
	}
}
