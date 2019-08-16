package section_02;

import java.util.Scanner;

public class DecisionTreeDemo
{
	public static void main(String[] args)
	{
		BinaryTree questionTree = new BinaryTree("Is it a mammal?",
				new BinaryTree("Does it have stripes?",
						new BinaryTree("Is it a carnivore?",
								new BinaryTree("It is a tiger."),
								new BinaryTree("It is a zebra.")),
						new BinaryTree("It is a pig.")),
				new BinaryTree("Does it fly?",
						new BinaryTree("It is an eagle."),
						new BinaryTree("Does it swim?",
								new BinaryTree("It is a penguin."),
								new BinaryTree("It is an ostrich."))));
		
		boolean done = false;
		Scanner in = new Scanner(System.in);
		
		while(!done)
		{
			BinaryTree left = questionTree.left();
			BinaryTree right = questionTree.right();
			
			if(left.isEmpty() && right.isEmpty())
			{
				System.out.println(questionTree.data());
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
		}
		
		in.close();
	}
}
