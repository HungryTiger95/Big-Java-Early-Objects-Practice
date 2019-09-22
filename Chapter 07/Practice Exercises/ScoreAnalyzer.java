import java.util.Scanner;

public class ScoreAnalyzer
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
		in.close();
		
		System.out.println("Final Score: " + fred.finalScore());
	}
}
