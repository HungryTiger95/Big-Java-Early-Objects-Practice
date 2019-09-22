import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * The game starts with 45 cards. Randomly divide them into some number of piles of
 * random size. For example, you might start with piles of size 20, 5, 1, 9, and 10.
 * In each round, you take one card from each pile, forming a new pile with these cards.
 * The solitaire is over when the piles have size 1, 2, 3, 4, 5, 6, 7, 8, and 9, in some
 * order. In your program, produce a random starting configuration and print it. Then
 * keep applying the solitaire step and print the result. Stop when the solitaire final
 * configuration is reached.
 * 
 * @author Mayuresh
 *
 */
public class BulgarianSolitaire
{
	// Instance Variables
	private static final int MAX_CARDS = 45;
	private static final int MAX_PILE_COUNT = 9;
	private static Random numGen = new Random();
	private static ArrayList<Integer> pileSize = new ArrayList<Integer>();
	private static ArrayList<Integer> resultArray = new ArrayList<Integer>();
	
	public static void main (String[] args)
	{
		/**
		 * Initialize the playing field (number of piles and pile size)
		 */
		
		initBoard();
		
		/**
		 * Place Cards in descending order
		 */
		reverseSort();
		System.out.print("Sorted: ");
		printPiles(pileSize);
		
		System.out.println("==============================\n        Start the Game\n==============================");
		
		/**
		 * Make a move, sort, and then repeat the move until the array matches the end result
		 */
		int moveNum = 0;
		
		while(!isEndResult())
		{
			// Make a Move
			move();
			
			// Remove the zero's
			removeZero();
			
			// Sort
			reverseSort();
			
			// increment the number of moves taken
			moveNum++;
		}
		
		System.out.println("Number of Moves: " + moveNum);
		
		System.out.print("Ending Array: ");
		printPiles(pileSize);
		
	}
	
	// Methods
	/**
	 * A check for the initialization process of the number of piles
	 * @param numOfPiles 
	 */
	public static void printPileCount(int numOfPiles)
	{
		System.out.println("PILES: " + numOfPiles);
	}
	
	/**
	 * Prints the array of piles of cards
	 * @param array array of cards
	 */
	public static void printPiles(ArrayList<Integer> array)
	{
		System.out.println(array.toString());
	}
	
	/**
	 * Checks to see if the initial array has 45 total cards
	 * @return
	 */
	public static boolean isAllCardsUsed()
	{
		int sum = 0;
		for(int i = 0; i < pileSize.size(); i++)
		{
			sum = sum + pileSize.get(i);
		}
		
		if(sum == MAX_CARDS)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void initBoard()
	{
		/**
		 * Initialize the playing field (number of piles and pile size)
		 */
		// Lay out all cards randomly in 9 theoretical piles
		int cardCount = MAX_CARDS;
		for(int i = 0; i < MAX_PILE_COUNT; i++)
		{
			if(i == MAX_PILE_COUNT - 1)
			{
				pileSize.add(cardCount);
			}
			else
			{
				int randNum = numGen.nextInt(cardCount);
				cardCount = cardCount - randNum;
			
				pileSize.add(randNum);
			}
		}
		
		// Instantiate the result array as a reference to what the result should be
		for(int i = 9; i > 0; i--)
		{
			resultArray.add(i);
		}
		
		// Print the Array
		System.out.print("Original Array: ");
		printPiles(pileSize);
		
		// Print the result array
		System.out.print("Reference Array: ");
		printPiles(resultArray);
		
		// Check initialization
		System.out.println("Initialize Check: " + isAllCardsUsed());
		
		// Remove Zeros and Reprint the array
		removeZero();
		printPiles(pileSize);
		
		// Recheck initialization
		System.out.println("Initialize Check: " + isAllCardsUsed());
	}
	
	/**
	 * Sorts the array in descending order
	 */
	public static void reverseSort()
	{
		Collections.sort(pileSize, Collections.reverseOrder());
	}
	
	/**
	 * A move in the game; take one value from each element and create
	 * a new element with the sum, remove any zeros, and sort the array.
	 */
	private static void move()
	{
		// Get the size of the array and add an element at the end of it
		pileSize.add(pileSize.size());
		
		// Subtract one from each element except the last
		for(int i = 0; i < pileSize.size() - 1; i++)
		{
			int elementVal = pileSize.get(i);
			pileSize.set(i, elementVal - 1);
		}
	}
	
	/**
	 * Remove all zero value elements in the array
	 */
	private static void removeZero()
	{
		while(pileSize.contains(0))
		{
			for(int i = 0; i < pileSize.size(); i++)
			{
				if(pileSize.get(i) == 0)
				{
					pileSize.remove(i);
					break;
				}
			}
		}
	}
	
	/**
	 * Tests whether the array is the same as the reference array
	 * @return true if both arrays are same, else false
	 */
	private static boolean isEndResult()
	{
		if(pileSize.equals(resultArray))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
