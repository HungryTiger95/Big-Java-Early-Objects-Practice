
public class PlayingCardTester
{
	public static void main(String[] args)
	{	
		// Testing (Need to know loops)
		PlayingCard card = new PlayingCard();
		
		// Picking 10 random cards
		int testCases = 10;
		
		for(int i = 0; i < testCases; i++)
		{
			card.setRandomCard();
			
			System.out.println("Card Notation of: " + card.getCardNotation());
			System.out.println(card.getDescription());
		}
		
		
		
	}
}
