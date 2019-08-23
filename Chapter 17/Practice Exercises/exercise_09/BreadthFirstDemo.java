package exercise_09;

public class BreadthFirstDemo
{
	public static void main(String[] args)
	{
		Tree t1 = new Tree("A");
		Tree t2 = new Tree("B");
		Tree t3 = new Tree("C");
		Tree t4 = new Tree("D");
		Tree t5 = new Tree("E");
		Tree t6 = new Tree("F");
		Tree t7 = new Tree("G");
		Tree t8 = new Tree("H");
		Tree t9 = new Tree("I");
		
		t2.addSubtree(t5);
		t2.addSubtree(t6);
		t2.addSubtree(t7);
		
		t1.addSubtree(t2);
		
		t1.addSubtree(t3);
		
		t4.addSubtree(t8);
		t4.addSubtree(t9);
		
		t1.addSubtree(t4);
		
		class BreadthFirst implements Tree.Visitor
		{
			public boolean visit(Object data)
			{
				return data != null;
			}
		}
		
		BreadthFirst v = new BreadthFirst();
		System.out.println("Breadth First:");
		t1.breadthFirst(v);
	}
}