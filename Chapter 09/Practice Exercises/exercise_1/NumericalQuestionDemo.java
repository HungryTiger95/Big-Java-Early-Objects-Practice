package exercise_1;

import java.util.Scanner;

public class NumericalQuestionDemo
{
	public static void main (String[] args)
	{
		NumericalQuestion q = new NumericalQuestion();
		
		q.setText("What is 15 X 3.5?");
		q.setAnswer("52.5");
		
		q.presentQuestion();
	}
	
	public static void presentQuestion(Question q)
	{
		q.display();
		System.out.print("Your Answer: ");
		Scanner in = new Scanner(System.in);
		String response = in.nextLine();
		System.out.println(q.checkAnswer(response));
	}
}
