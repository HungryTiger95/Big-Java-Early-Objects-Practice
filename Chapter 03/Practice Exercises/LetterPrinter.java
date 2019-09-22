
public class LetterPrinter
{
	public static void main (String[] args)
	{
		Letter letter = new Letter("Mayruesh", "Person");
		
		letter.addLine("Dear " + letter.getRecipient() + ":");
		letter.addLine("");
		letter.addLine("I'm one of your biggest fans!");
		letter.addLine("I would love to get to see you and be your friend.");
		letter.addLine("I've heard all your songs, and you are the best singer.");
		letter.addLine("");
		letter.addLine("Love,");
		letter.addLine("");
		letter.addLine(letter.getSender());
		
		System.out.println(letter.getText());
	}
}
