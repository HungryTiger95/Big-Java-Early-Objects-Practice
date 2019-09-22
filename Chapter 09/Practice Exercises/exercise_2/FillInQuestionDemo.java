package exercise_2;

import java.util.Scanner;

public class FillInQuestionDemo
{
	public static void main (String[] args)
	{
		FillInQuestion q = new FillInQuestion();
		
		q.setText("The book \"Angels and Demons\" was written by");
		q.setAnswer("Dan Brown");
		
		q.presentQuestion();
	}

	private static void presentQuestion(Question q)
	{
		Scanner in = new Scanner(System.in);
		
		q.display();
		System.out.print("Your Answer: ");
		q.checkAnswer(in.nextLine());
	}
}
