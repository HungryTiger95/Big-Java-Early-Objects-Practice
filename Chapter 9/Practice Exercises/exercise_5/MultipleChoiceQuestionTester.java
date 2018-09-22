package exercise_5;

public class MultipleChoiceQuestionTester
{
	public static void main(String[] args)
	{
		MultipleChoiceQuestion q = new MultipleChoiceQuestion();
		
		q.setText("Which of these weapons are found in desitny/destiny 2?");
		
		q.addChoice("Fatebringer", true);
		q.addChoice("Ak-47", false);
		q.addChoice("Gjallerhorn", true);
		q.addChoice("Glock", false);
		q.addChoice("Thorn", true);
		
		q.presentQuestion();
	}
}
