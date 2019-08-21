package exercise_02;

public class DecisionTreeDemo
{
	public static void main(String[] args)
	{
		BinaryTree t = new BinaryTree("Is it a Mammal?",
				new BinaryTree("Does it have stripes?",
						new BinaryTree("Is it a carnivore?",
								new BinaryTree("It is a Tiger"),
								new BinaryTree()),
						new BinaryTree("It is a pig")),
				new BinaryTree("Does it fly?",
						new BinaryTree("It is an Eagle"),
						new BinaryTree("Does it swim?",
								new BinaryTree("It is a penguin"),
								new BinaryTree("It is an ostrich"))));
		
		System.out.println("Nodes with 1 child: " + t.countNodesWithOneChild());
		
	}
}
