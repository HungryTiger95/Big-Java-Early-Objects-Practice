package example1;

import java.util.Scanner;

public class QuestionDemo
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		Question q = new Question();
		q.setText("Which actress played the role of Leela in Ramleela?");
		q.setAnswer("Deepika Padukone");
		
		System.out.println(q.display());
		
		System.out.print("Your answer: ");
		String response = in.nextLine();
		
		System.out.println(q.checkAnswer(response));
		
		in.close();
	}
}
