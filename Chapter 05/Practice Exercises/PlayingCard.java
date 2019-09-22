import java.util.Random;

/**
 * E5.18
 * 
 * Write a program that takes user input describing a playing card in the following
 * shorthand notation:
 * 
 * 		A		Ace
 * 		2...10  Card Values
 * 		J		Jack
 * 		Q		Queen
 * 		K		King
 * 
 * 		D		Diamonds
 * 		H		Hearts
 * 		S		Spades
 * 		C		Clubs
 * 
 * Your program should print the full description of the card. For example,
 * 
 * 		Enter the card notation: QS
 * 		Queen of Spades
 * 
 * Implement a class card whose constructor takes the card notation string and whose
 * getDescription method returns a description of the card. If the notation string is not
 * in the correct format, the getDescription method should return the string "Unknown".
 * 
 * @author Mayuresh
 *
 */
public class PlayingCard
{
	// Instance Variables
	private String card;
	
	// Constructors
	/**
	 * Constructs a PlayingCard object with null as the card string
	 */
	public PlayingCard()
	{
		card = null;
	}
	
	/**
	 * Constructs a PlayingCard object with a given card string
	 * @param cardNotation Card Notation
	 */
	public PlayingCard(String cardNotation)
	{
		this.card = cardNotation;
	}
	
	// Methods
	/**
	 * Sets a random card notation in the form of "Value + Suite"
	 */
	public void setRandomCard()
	{
		Random generator = new Random();
		
		String cardValName;
		
		// Pick a random card
		int cardVal = generator.nextInt(12) + 1;
		String val;
		
		// Get a random number for the value of the card
		if(cardVal == 1)
		{
			val = "A";
		}
		else if(cardVal == 2)
		{
			val = "2";
		}
		else if(cardVal == 3)
		{
			val = "3";
		}
		else if(cardVal == 4)
		{
			val = "4";
		}
		else if(cardVal == 5)
		{
			val = "5";
		}
		else if(cardVal == 6)
		{
			val = "6";
		}
		else if(cardVal == 7)
		{
			val = "7";
		}
		else if(cardVal == 8)
		{
			val = "8";
		}
		else if(cardVal == 9)
		{
			val = "9";
		}
		else if(cardVal == 10)
		{
			val = "10";
		}
		else if(cardVal == 11)
		{
			val = "J";
		}
		else if(cardVal == 12)
		{
			val = "Q";
		}
		else if(cardVal == 13)
		{
			val = "K";
		}
		else
		{
			val = "000";
		}
		
		// Get a random suite
		int suiteVal = generator.nextInt(3);
		String suite;
		
		if(suiteVal == 0)
		{
			suite = "H";
		}
		else if(suiteVal == 1)
		{
			suite = "D";
		}
		else if(suiteVal == 2)
		{
			suite = "S";
		}
		else if(suiteVal == 3)
		{
			suite = "C";
		}
		else
		{
			suite = "000";
		}
		
		// Concat val and suite
		cardValName = val.concat(suite);
		
		setCard(cardValName);
	}
	
	/**
	 * Sets a card notation in the form of "value + suite"
	 * @param cardValName card notation
	 */
	public void setCard(String cardValName)
	{
		this.card = cardValName;
	}
	
	/**
	 * Gets the card notation
	 * @return card in notation form
	 */
	public String getCardNotation()
	{
		return card;
	}
	
	/**
	 * Gets the character at the given index
	 * @param index index
	 * @return character at index value
	 */
	public char getCharAt(int index)
	{
		return card.charAt(index);
	}
	
	/**
	 * Gets a substring of the card variable given a start and end index
	 * @param startIndex start index
	 * @param endIndex end index
	 * @return character at given index
	 */
	public String getCardSubstring(int startIndex, int endIndex)
	{
		char start, end;
		String temp;
		
		start = card.charAt(startIndex);
		end = card.charAt(endIndex);
		temp = start + " " + end;
		
		return temp;
	}
	
	/**
	 * Gets the description of the card in oral form
	 * @return description
	 */
	public String getDescription()
	{
		// If Input is too long
		if(card.length() > 3)
		{
			return "Unknown";
		}
		
		// If the input is a 10 of a suite
		else if(card.length() == 3)
		{
			if(card.charAt(2) == 'S')
			{
				return "10 of Spades";
			}
			else if(card.charAt(2) == 'D')
			{
				return "10 of Diamonds";
			}
			else if(card.charAt(2) == 'H')
			{
				return "10 of Hearts";
			}
			else if(card.charAt(2) == 'C')
			{
				return "10 of Clubs";
			}
			else
			{
				return "Unknown";
			}
		}
		
		// Spades Input
		else if(card.charAt(1) == 'S')
		{
			if(card.charAt(0) == '2')
			{
				return "2 of Spades";
			}
			else if(card.charAt(0) == '3')
			{
				return "3 of Spades";
			}
			else if(card.charAt(0) == '4')
			{
				return "4 of Spades";
			}
			else if(card.charAt(0) == '5')
			{
				return "5 of Spades";
			}
			else if(card.charAt(0) == '6')
			{
				return "6 of Spades";
			}
			else if(card.charAt(0) == '7')
			{
				return "7 of Spades";
			}
			else if(card.charAt(0) == '8')
			{
				return "8 of Spades";
			}
			else if(card.charAt(0) == '9')
			{
				return "9 of Spades";
			}
			else if(card.charAt(0) == 'J')
			{
				return "Jack of Spades";
			}
			else if(card.charAt(0) == 'Q')
			{
				return "Queen of Spades";
			}
			else if(card.charAt(0) == 'K')
			{
				return "King of Spades";
			}
			else if(card.charAt(0) == 'A')
			{
				return "Ace of Spades";
			}
			else
			{
				return "Unknown";
			}
		}	
		
		// Diamonds Input
		else if(card.charAt(1) == 'D')
		{
			if(card.charAt(0) == '2')
			{
				return "2 of Diamonds";
			}
			else if(card.charAt(0) == '3')
			{
				return "3 of Diamonds";
			}
			else if(card.charAt(0) == '4')
			{
				return "4 of Diamonds";
			}
			else if(card.charAt(0) == '5')
			{
				return "5 of Diamonds";
			}
			else if(card.charAt(0) == '6')
			{
				return "6 of Diamonds";
			}
			else if(card.charAt(0) == '7')
			{
				return "7 of Diamonds";
			}
			else if(card.charAt(0) == '8')
			{
				return "8 of Diamonds";
			}
			else if(card.charAt(0) == '9')
			{
				return "9 of Diamonds";
			}
			else if(card.charAt(0) == 'J')
			{
				return "Jack of Diamonds";
			}
			else if(card.charAt(0) == 'Q')
			{
				return "Queen of Diamonds";
			}
			else if(card.charAt(0) == 'K')
			{
				return "King of Diamonds";
			}
			else if(card.charAt(0) == 'A')
			{
				return "Ace of Diamonds";
			}
			else
			{
				return "Unknown";
			}
		}
		
		// Hearts Input
		else if(card.charAt(1) == 'H')
		{
			if(card.charAt(0) == '2')
			{
				return "2 of Hearts";
			}
			else if(card.charAt(0) == '3')
			{
				return "3 of Hearts";
			}
			else if(card.charAt(0) == '4')
			{
				return "4 of Hearts";
			}
			else if(card.charAt(0) == '5')
			{
				return "5 of Hearts";
			}
			else if(card.charAt(0) == '6')
			{
				return "6 of Hearts";
			}
			else if(card.charAt(0) == '7')
			{
				return "7 of Hearts";
			}
			else if(card.charAt(0) == '8')
			{
				return "8 of Hearts";
			}
			else if(card.charAt(0) == '9')
			{
				return "9 of Hearts";
			}
			else if(card.charAt(0) == 'J')
			{
				return "Jack of Hearts";
			}
			else if(card.charAt(0) == 'Q')
			{
				return "Queen of Hearts";
			}
			else if(card.charAt(0) == 'K')
			{
				return "King of Hearts";
			}
			else if(card.charAt(0) == 'A')
			{
				return "Ace of Hearts";
			}
			else
			{
				return "Unknown";
			}
		}
		
		// Clubs Input
		else if(card.charAt(1) == 'C')
		{
			if(card.charAt(0) == '2')
			{
				return "2 of Clubs";
			}
			else if(card.charAt(0) == '3')
			{
				return "3 of Clubs";
			}
			else if(card.charAt(0) == '4')
			{
				return "4 of Clubs";
			}
			else if(card.charAt(0) == '5')
			{
				return "5 of Clubs";
			}
			else if(card.charAt(0) == '6')
			{
				return "6 of Clubs";
			}
			else if(card.charAt(0) == '7')
			{
				return "7 of Clubs";
			}
			else if(card.charAt(0) == '8')
			{
				return "8 of Clubs";
			}
			else if(card.charAt(0) == '9')
			{
				return "9 of Clubs";
			}
			else if(card.charAt(0) == 'J')
			{
				return "Jack of Clubs";
			}
			else if(card.charAt(0) == 'Q')
			{
				return "Queen of Clubs";
			}
			else if(card.charAt(0) == 'K')
			{
				return "King of Clubs";
			}
			else if(card.charAt(0) == 'A')
			{
				return "Ace of Clubs";
			}
			else
			{
				return "Unknown";
			}
		}
		
		// If the Input is completely wrong
		else
		{
			return "Unknown";
		}
	}
}
