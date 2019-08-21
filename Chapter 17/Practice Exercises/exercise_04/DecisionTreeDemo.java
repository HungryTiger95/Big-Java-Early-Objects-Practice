package exercise_04;

/**
 * Implement the animal guessing game described in Section 17.2.1. Start wit the tree in Figure 4,
 * but present the leaves as "Is it a(n) X?". If it wasn't, ask the user what the animal was, and ask
 * for a question that is true for that animal but false for X. For example,
 * 
 * 			Is it a mammal? Y
 * 			Does it have stripes? N
 * 			Is it a pig? N
 * 			I give up. What is it? a hamster
 * 			Please give me a question that is true for a hamster and false for a pig.
 * 			Is it small and cuddly?
 * 
 * In this way, the program learns additional facts.
 */
import java.util.Scanner;

public class DecisionTreeDemo
{
	public static void main(String[] args)
	{
		BinaryTree questionTree = new BinaryTree("Is it a mammal?",
				new BinaryTree("Does it have stripes?",
						new BinaryTree("Is it a carnivore?",
								new BinaryTree("Is it a tiger?"),
								new BinaryTree("Is it a zebra?")),
						new BinaryTree("Is it a pig?")),
				new BinaryTree("Does it fly?",
						new BinaryTree("Ia Is an eagle?"),
						new BinaryTree("Does it swim?",
								new BinaryTree("Is it a penguin?"),
								new BinaryTree("Is it an ostrich?"))));
		
		boolean done = false;
		Scanner in = new Scanner(System.in);
		
		while(!done)
		{
			BinaryTree left = questionTree.left();
			BinaryTree right = questionTree.right();
			
			if(left.isEmpty() && right.isEmpty())
			{
				System.out.print(questionTree.data() + " (Y|N) ");
				done = true;
			}
			else
			{
				String response;
				do
				{
					System.out.print(questionTree.data() + " (Y|N) ");
					response = in.next().toUpperCase();
				}
				while(!response.equals("Y") && !response.equals("N"));
				
				if(response.equals("Y"))
				{
					questionTree = left;
				}
				else
				{
					questionTree = right;
				}
			}
			
			if(done)
			{
				String response;
				do
				{
					response = in.next().toUpperCase();
				}
				while(!response.equals("Y") && !response.equals("N"));
				
				if(response.equals("N"))
				{
					System.out.print("I give up. What is it? ");
					in.nextLine();
					String answer = in.nextLine();
					
					System.out.println("Please give me a question that is true for " + answer +
							" and false for a "
							+ questionTree.data().toString().substring(8, questionTree.data().toString().length()) + ".");
					in.nextLine();
				}
				else
				{
					System.out.println("Great Guess Wasn't It!");
				}
			}
		}
		in.close();
	}
}
