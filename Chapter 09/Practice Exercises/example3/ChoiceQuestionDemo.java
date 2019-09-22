package example3;

import java.util.Scanner;

public class ChoiceQuestionDemo
{
	public static void main(String[] args)
	{
		ChoiceQuestion first = new ChoiceQuestion();
		
		first.setText("Who played the role of Dhankor Baa in Ramleela?");
		first.addChoice("Deepika Padukone", false);
		first.addChoice("Richa Chadda", false);
		first.addChoice("Supriya Pathak", true);
		first.addChoice("Barkha Sengupta", false);
		
		ChoiceQuestion second = new ChoiceQuestion();
		
		second.setText("Who is the male singer of Phir Bhi Tumko Chaahungra?");
		second.addChoice("Sukwinder Singh", false);
		second.addChoice("Arijit Singh", true);
		second.addChoice("Jubin Nautiyal", false);
		second.addChoice("Udit Narayan", false);
		
		ChoiceQuestion third = new ChoiceQuestion("What is Tapu's real first name?");
		third.addChoice("Tony", false);
		third.addChoice("Tipendra", true);
		third.addChoice("Tapendra", false);
		third.addChoice("Tapu", false);
		
		Question fourth = new Question();
		fourth.setText("Who played Naina in Yeh Jawani Deewaani?");
		fourth.setAnswer("Deepika Padukone");
		
		// Present Questions
		first.presentQuestion();
		second.presentQuestion();
		third.presentQuestion();
		fourth.presentQuestion();
	}
	
	/**
	 * Presents the question.
	 * 
	 * Since the implicit parameter is of the object Question, any sub class of the
	 * Question super class is a valid parameter. THus when q.display is called,
	 * the call with call the method in whatever sub class of the Question was passed.
	 * @param q 
	 */
	public static void presentQuestion(Question q)
	{
		Scanner in = new Scanner(System.in);
		
		q.display();
		
		System.out.print("Your Answer: ");
		String response = in.nextLine();
		
		System.out.println(q.checkAnswer(response));
		
		in.close();
	}
}
