package worked_example_01;

public class TreeTester
{
	public static void main(String[] args)
	{
		BinarySearchTree<String> names = new BinarySearchTree<String>();
		names.add("Romeo");
		names.add("Juliet");
		names.add("Tom");
		names.add("Dick");
		names.add("Harry");
		
		class PrintVisitor implements Visitor<String>
		{
			public void visit(String data)
			{
				System.out.print(data + " ");
			}
		}
		
		names.inorder(new PrintVisitor());
		System.out.println();
		
		System.out.println("Expected: Dick Harry Juliet Romeo Tom");
	}
	
}
