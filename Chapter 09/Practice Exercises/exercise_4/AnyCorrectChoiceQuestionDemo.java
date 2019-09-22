package exercise_4;

public class AnyCorrectChoiceQuestionDemo
{
	public static void main(String[] args)
	{
		AnyCorrectChoiceQuestion q = new AnyCorrectChoiceQuestion();
		
		q.setText("Which of the following are roles played by Deepika Padukone?");
		
		q.addChoice("Naina", true);
		q.addChoice("Aarohi", false);
		q.addChoice("Fanny", false);
		q.addChoice("Jasmin", false);
		q.addChoice("Mastani", true);
		q.addChoice("Piku", true);
		q.addChoice("Veronica", true);
		
		// Get all of the instance variables for each part
		System.out.println("Answer: " + q.getAnswer());
		System.out.println("Choices: " + q.getChoices());

		System.out.println("\n");
		
		q.presentQuestion();
	}
}
