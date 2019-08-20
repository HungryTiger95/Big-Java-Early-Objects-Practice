package section_04;

import java.util.Iterator;

public class TraversalDemo
{
	public static void main(String[] args)
	{
		Tree t1 = new Tree("Anne");
		Tree t2 = new Tree("Peter");
		t1.addSubtree(t2);
		
		Tree t3 = new Tree("Zara");
		t1.addSubtree(t3);
		
		Tree t4 = new Tree("Savannah");
		t2.addSubtree(t4);
		
		// Count short names(less than 5 characters) with visitor
		class ShortNameCounter implements Tree.Visitor
		{
			public int count = 0;
			
			public void visit(Object data)
			{
				System.out.println(data);
				if(data.toString().length() <= 5)
				{
					count++;
				}
			}
		}
		
		ShortNameCounter v = new ShortNameCounter();
		
		t1.preorder(v);
		System.out.println("Short names: " + v.count);
		
		// Count short names with iterator
		Iterator iter = t1.iterator();
		int counter = 0;
		
		while(iter.hasNext())
		{
			Object data = iter.next();
			System.out.println(data);
			
			if(data.toString().length()  <= 5)
			{
				counter++;
			}
		}
		
		System.out.println("Short Names: " + counter);
	}
}
